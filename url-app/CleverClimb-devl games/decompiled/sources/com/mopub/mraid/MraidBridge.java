package com.mopub.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.AdReport;
import com.mopub.common.AdType;
import com.mopub.common.CloseableLayout;
import com.mopub.common.Constants;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.BaseWebView;
import com.mopub.mobileads.ViewGestureDetector;
import com.mopub.mraid.MraidNativeCommandHandler;
import com.mopub.network.Networking;
import com.tapjoy.TJAdUnitConstants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.a.b.e.c;
import org.apache.a.w;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MraidBridge {
    private final AdReport mAdReport;
    private boolean mHasLoaded;
    private boolean mIsClicked;
    private MraidBridgeListener mMraidBridgeListener;
    private final MraidNativeCommandHandler mMraidNativeCommandHandler;
    private MraidWebView mMraidWebView;
    private final WebViewClient mMraidWebViewClient;
    private final PlacementType mPlacementType;

    public interface MraidBridgeListener {
        void onClose();

        boolean onConsoleMessage(ConsoleMessage consoleMessage);

        void onExpand(URI uri, boolean z) throws MraidCommandException;

        boolean onJsAlert(String str, JsResult jsResult);

        void onOpen(URI uri);

        void onPageFailedToLoad();

        void onPageLoaded();

        void onPlayVideo(URI uri);

        void onResize(int i, int i2, int i3, int i4, CloseableLayout.ClosePosition closePosition, boolean z) throws MraidCommandException;

        void onSetOrientationProperties(boolean z, MraidOrientation mraidOrientation) throws MraidCommandException;

        void onUseCustomClose(boolean z);

        void onVisibilityChanged(boolean z);
    }

    MraidBridge(AdReport adReport, PlacementType placementType) {
        this(adReport, placementType, new MraidNativeCommandHandler());
    }

    @VisibleForTesting
    MraidBridge(AdReport adReport, PlacementType placementType, MraidNativeCommandHandler mraidNativeCommandHandler) {
        this.mMraidWebViewClient = new MraidWebViewClient() { // from class: com.mopub.mraid.MraidBridge.5
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return MraidBridge.this.handleShouldOverrideUrl(str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                MraidBridge.this.handlePageFinished();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                MoPubLog.d("Error: " + str);
                super.onReceivedError(webView, i, str, str2);
            }
        };
        this.mAdReport = adReport;
        this.mPlacementType = placementType;
        this.mMraidNativeCommandHandler = mraidNativeCommandHandler;
    }

    void setMraidBridgeListener(MraidBridgeListener mraidBridgeListener) {
        this.mMraidBridgeListener = mraidBridgeListener;
    }

    void attachView(MraidWebView mraidWebView) {
        this.mMraidWebView = mraidWebView;
        this.mMraidWebView.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 17 && this.mPlacementType == PlacementType.INTERSTITIAL) {
            mraidWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.mMraidWebView.setScrollContainer(false);
        this.mMraidWebView.setVerticalScrollBarEnabled(false);
        this.mMraidWebView.setHorizontalScrollBarEnabled(false);
        this.mMraidWebView.setBackgroundColor(-16777216);
        this.mMraidWebView.setWebViewClient(this.mMraidWebViewClient);
        this.mMraidWebView.setWebChromeClient(new WebChromeClient() { // from class: com.mopub.mraid.MraidBridge.1
            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                if (MraidBridge.this.mMraidBridgeListener != null) {
                    return MraidBridge.this.mMraidBridgeListener.onJsAlert(str2, jsResult);
                }
                return super.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (MraidBridge.this.mMraidBridgeListener != null) {
                    return MraidBridge.this.mMraidBridgeListener.onConsoleMessage(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }
        });
        final ViewGestureDetector viewGestureDetector = new ViewGestureDetector(this.mMraidWebView.getContext(), this.mMraidWebView, this.mAdReport);
        viewGestureDetector.setUserClickListener(new ViewGestureDetector.UserClickListener() { // from class: com.mopub.mraid.MraidBridge.2
            @Override // com.mopub.mobileads.ViewGestureDetector.UserClickListener
            public void onUserClick() {
                MraidBridge.this.mIsClicked = true;
            }

            @Override // com.mopub.mobileads.ViewGestureDetector.UserClickListener
            public void onResetUserClick() {
                MraidBridge.this.mIsClicked = false;
            }

            @Override // com.mopub.mobileads.ViewGestureDetector.UserClickListener
            public boolean wasClicked() {
                return MraidBridge.this.mIsClicked;
            }
        });
        this.mMraidWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mopub.mraid.MraidBridge.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                viewGestureDetector.sendTouchEvent(motionEvent);
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (!view.hasFocus()) {
                            view.requestFocus();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        this.mMraidWebView.setVisibilityChangedListener(new MraidWebView.OnVisibilityChangedListener() { // from class: com.mopub.mraid.MraidBridge.4
            @Override // com.mopub.mraid.MraidBridge.MraidWebView.OnVisibilityChangedListener
            public void onVisibilityChanged(boolean z) {
                if (MraidBridge.this.mMraidBridgeListener != null) {
                    MraidBridge.this.mMraidBridgeListener.onVisibilityChanged(z);
                }
            }
        });
    }

    void detach() {
        this.mMraidWebView = null;
    }

    public void setContentHtml(String str) {
        if (this.mMraidWebView == null) {
            MoPubLog.d("MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.mHasLoaded = false;
        this.mMraidWebView.loadDataWithBaseURL(Networking.getBaseUrlScheme() + "://" + Constants.HOST + "/", str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
    }

    public void setContentUrl(String str) {
        if (this.mMraidWebView == null) {
            MoPubLog.d("MRAID bridge called setContentHtml while WebView was not attached");
        } else {
            this.mHasLoaded = false;
            this.mMraidWebView.loadUrl(str);
        }
    }

    void injectJavaScript(String str) {
        if (this.mMraidWebView == null) {
            MoPubLog.d("Attempted to inject Javascript into MRAID WebView while was not attached:\n\t" + str);
            return;
        }
        MoPubLog.v("Injecting Javascript into MRAID WebView:\n\t" + str);
        this.mMraidWebView.loadUrl("javascript:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireErrorEvent(MraidJavascriptCommand mraidJavascriptCommand, String str) {
        injectJavaScript("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(mraidJavascriptCommand.toJavascriptString()) + ", " + JSONObject.quote(str) + ")");
    }

    private void fireNativeCommandCompleteEvent(MraidJavascriptCommand mraidJavascriptCommand) {
        injectJavaScript("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(mraidJavascriptCommand.toJavascriptString()) + ")");
    }

    public static class MraidWebView extends BaseWebView {
        private boolean mIsVisible;
        private OnVisibilityChangedListener mOnVisibilityChangedListener;

        public interface OnVisibilityChangedListener {
            void onVisibilityChanged(boolean z);
        }

        public MraidWebView(Context context) {
            super(context);
            this.mIsVisible = getVisibility() == 0;
        }

        void setVisibilityChangedListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.mOnVisibilityChangedListener = onVisibilityChangedListener;
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            boolean z = i == 0;
            if (z != this.mIsVisible) {
                this.mIsVisible = z;
                if (this.mOnVisibilityChangedListener != null) {
                    this.mOnVisibilityChangedListener.onVisibilityChanged(this.mIsVisible);
                }
            }
        }

        public boolean isVisible() {
            return this.mIsVisible;
        }
    }

    @VisibleForTesting
    boolean handleShouldOverrideUrl(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (AppLovinMediationProvider.MOPUB.equals(scheme)) {
                if ("failLoad".equals(host) && this.mPlacementType == PlacementType.INLINE && this.mMraidBridgeListener != null) {
                    this.mMraidBridgeListener.onPageFailedToLoad();
                }
                return true;
            }
            if (AdType.MRAID.equals(scheme)) {
                HashMap hashMap = new HashMap();
                for (w wVar : c.a(uri, "UTF-8")) {
                    hashMap.put(wVar.a(), wVar.b());
                }
                MraidJavascriptCommand fromJavascriptString = MraidJavascriptCommand.fromJavascriptString(host);
                try {
                    runCommand(fromJavascriptString, hashMap);
                } catch (MraidCommandException e) {
                    fireErrorEvent(fromJavascriptString, e.getMessage());
                }
                fireNativeCommandCompleteEvent(fromJavascriptString);
                return true;
            }
            if (!this.mIsClicked) {
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            try {
                if (this.mMraidWebView == null) {
                    MoPubLog.d("WebView was detached. Unable to load a URL");
                    return true;
                }
                this.mMraidWebView.getContext().startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
                MoPubLog.d("No activity found to handle this URL " + str);
                return false;
            }
        } catch (URISyntaxException unused2) {
            MoPubLog.w("Invalid MRAID URL: " + str);
            fireErrorEvent(MraidJavascriptCommand.UNSPECIFIED, "Mraid command sent an invalid URL");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @VisibleForTesting
    public void handlePageFinished() {
        if (this.mHasLoaded) {
            return;
        }
        this.mHasLoaded = true;
        if (this.mMraidBridgeListener != null) {
            this.mMraidBridgeListener.onPageLoaded();
        }
    }

    @VisibleForTesting
    void runCommand(final MraidJavascriptCommand mraidJavascriptCommand, Map<String, String> map) throws MraidCommandException {
        if (mraidJavascriptCommand.requiresClick(this.mPlacementType) && !this.mIsClicked) {
            throw new MraidCommandException("Cannot execute this command unless the user clicks");
        }
        if (this.mMraidBridgeListener == null) {
            throw new MraidCommandException("Invalid state to execute this command");
        }
        if (this.mMraidWebView == null) {
            throw new MraidCommandException("The current WebView is being destroyed");
        }
        switch (mraidJavascriptCommand) {
            case CLOSE:
                this.mMraidBridgeListener.onClose();
                return;
            case RESIZE:
                this.mMraidBridgeListener.onResize(checkRange(parseSize(map.get("width")), 0, 100000), checkRange(parseSize(map.get("height")), 0, 100000), checkRange(parseSize(map.get("offsetX")), -100000, 100000), checkRange(parseSize(map.get("offsetY")), -100000, 100000), parseClosePosition(map.get("customClosePosition"), CloseableLayout.ClosePosition.TOP_RIGHT), parseBoolean(map.get("allowOffscreen"), true));
                return;
            case EXPAND:
                this.mMraidBridgeListener.onExpand(parseURI(map.get("url"), null), parseBoolean(map.get("shouldUseCustomClose"), false));
                return;
            case USE_CUSTOM_CLOSE:
                this.mMraidBridgeListener.onUseCustomClose(parseBoolean(map.get("shouldUseCustomClose"), false));
                return;
            case OPEN:
                this.mMraidBridgeListener.onOpen(parseURI(map.get("url")));
                return;
            case SET_ORIENTATION_PROPERTIES:
                this.mMraidBridgeListener.onSetOrientationProperties(parseBoolean(map.get("allowOrientationChange")), parseOrientation(map.get("forceOrientation")));
                return;
            case PLAY_VIDEO:
                this.mMraidBridgeListener.onPlayVideo(parseURI(map.get("uri")));
                return;
            case STORE_PICTURE:
                this.mMraidNativeCommandHandler.storePicture(this.mMraidWebView.getContext(), parseURI(map.get("uri")).toString(), new MraidNativeCommandHandler.MraidCommandFailureListener() { // from class: com.mopub.mraid.MraidBridge.6
                    @Override // com.mopub.mraid.MraidNativeCommandHandler.MraidCommandFailureListener
                    public void onFailure(MraidCommandException mraidCommandException) {
                        MraidBridge.this.fireErrorEvent(mraidJavascriptCommand, mraidCommandException.getMessage());
                    }
                });
                return;
            case CREATE_CALENDAR_EVENT:
                this.mMraidNativeCommandHandler.createCalendarEvent(this.mMraidWebView.getContext(), map);
                return;
            case UNSPECIFIED:
                throw new MraidCommandException("Unspecified MRAID Javascript command");
            default:
                return;
        }
    }

    private CloseableLayout.ClosePosition parseClosePosition(String str, CloseableLayout.ClosePosition closePosition) throws MraidCommandException {
        if (TextUtils.isEmpty(str)) {
            return closePosition;
        }
        if (str.equals("top-left")) {
            return CloseableLayout.ClosePosition.TOP_LEFT;
        }
        if (str.equals("top-right")) {
            return CloseableLayout.ClosePosition.TOP_RIGHT;
        }
        if (str.equals("center")) {
            return CloseableLayout.ClosePosition.CENTER;
        }
        if (str.equals("bottom-left")) {
            return CloseableLayout.ClosePosition.BOTTOM_LEFT;
        }
        if (str.equals("bottom-right")) {
            return CloseableLayout.ClosePosition.BOTTOM_RIGHT;
        }
        if (str.equals("top-center")) {
            return CloseableLayout.ClosePosition.TOP_CENTER;
        }
        if (str.equals("bottom-center")) {
            return CloseableLayout.ClosePosition.BOTTOM_CENTER;
        }
        throw new MraidCommandException("Invalid close position: " + str);
    }

    private int parseSize(String str) throws MraidCommandException {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new MraidCommandException("Invalid numeric parameter: " + str);
        }
    }

    private MraidOrientation parseOrientation(String str) throws MraidCommandException {
        if (TJAdUnitConstants.String.PORTRAIT.equals(str)) {
            return MraidOrientation.PORTRAIT;
        }
        if (TJAdUnitConstants.String.LANDSCAPE.equals(str)) {
            return MraidOrientation.LANDSCAPE;
        }
        if ("none".equals(str)) {
            return MraidOrientation.NONE;
        }
        throw new MraidCommandException("Invalid orientation: " + str);
    }

    private int checkRange(int i, int i2, int i3) throws MraidCommandException {
        if (i >= i2 && i <= i3) {
            return i;
        }
        throw new MraidCommandException("Integer parameter out of range: " + i);
    }

    private boolean parseBoolean(String str, boolean z) throws MraidCommandException {
        return str == null ? z : parseBoolean(str);
    }

    private boolean parseBoolean(String str) throws MraidCommandException {
        if ("true".equals(str)) {
            return true;
        }
        if ("false".equals(str)) {
            return false;
        }
        throw new MraidCommandException("Invalid boolean parameter: " + str);
    }

    private URI parseURI(String str, URI uri) throws MraidCommandException {
        return str == null ? uri : parseURI(str);
    }

    private URI parseURI(String str) throws MraidCommandException {
        if (str == null) {
            throw new MraidCommandException("Parameter cannot be null");
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            throw new MraidCommandException("Invalid URL parameter: " + str);
        }
    }

    void notifyViewability(boolean z) {
        injectJavaScript("mraidbridge.setIsViewable(" + z + ")");
    }

    void notifyPlacementType(PlacementType placementType) {
        injectJavaScript("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.toJavascriptString()) + ")");
    }

    void notifyViewState(ViewState viewState) {
        injectJavaScript("mraidbridge.setState(" + JSONObject.quote(viewState.toJavascriptString()) + ")");
    }

    void notifySupports(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        injectJavaScript("mraidbridge.setSupports(" + z + "," + z2 + "," + z3 + "," + z4 + "," + z5 + ")");
    }

    private String stringifyRect(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    private String stringifySize(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    public void notifyScreenMetrics(MraidScreenMetrics mraidScreenMetrics) {
        injectJavaScript("mraidbridge.setScreenSize(" + stringifySize(mraidScreenMetrics.getScreenRectDips()) + ");mraidbridge.setMaxSize(" + stringifySize(mraidScreenMetrics.getRootViewRectDips()) + ");mraidbridge.setCurrentPosition(" + stringifyRect(mraidScreenMetrics.getCurrentAdRectDips()) + ");mraidbridge.setDefaultPosition(" + stringifyRect(mraidScreenMetrics.getDefaultAdRectDips()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("mraidbridge.notifySizeChangeEvent(");
        sb.append(stringifySize(mraidScreenMetrics.getCurrentAdRectDips()));
        sb.append(")");
        injectJavaScript(sb.toString());
    }

    void notifyReady() {
        injectJavaScript("mraidbridge.notifyReadyEvent();");
    }

    boolean isClicked() {
        return this.mIsClicked;
    }

    boolean isVisible() {
        return this.mMraidWebView != null && this.mMraidWebView.isVisible();
    }

    boolean isAttached() {
        return this.mMraidWebView != null;
    }

    boolean isLoaded() {
        return this.mHasLoaded;
    }

    @VisibleForTesting
    MraidWebView getMraidWebView() {
        return this.mMraidWebView;
    }

    @VisibleForTesting
    void setClicked(boolean z) {
        this.mIsClicked = z;
    }
}

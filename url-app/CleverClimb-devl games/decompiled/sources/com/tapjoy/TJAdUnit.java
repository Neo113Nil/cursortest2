package com.tapjoy;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;
import com.facebook.ads.AudienceNetworkActivity;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.fn;
import com.tapjoy.internal.gg;
import com.tapjoy.internal.ho;
import com.tapjoy.internal.jr;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TJAdUnit implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public static TJVideoListener f7589a;
    private boolean A;
    private boolean B;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private fn H;

    /* renamed from: b, reason: collision with root package name */
    TJAdUnitJSBridge f7590b;

    /* renamed from: c, reason: collision with root package name */
    TJWebView f7591c;

    /* renamed from: d, reason: collision with root package name */
    TJWebView f7592d;
    VideoView e;
    volatile boolean f;
    private TJAdUnitWebViewListener j;
    private TJAdUnitVideoListener k;
    private TJAdUnitActivity l;
    private MediaPlayer m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;

    @Nullable
    private ScheduledFuture r;
    private AudioManager s;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private final Handler i = new Handler(Looper.getMainLooper());
    private int t = 0;
    private int C = -1;
    private final Runnable I = new Runnable() { // from class: com.tapjoy.TJAdUnit.1
        @Override // java.lang.Runnable
        public final void run() {
            int streamVolume = TJAdUnit.this.s.getStreamVolume(3);
            if (TJAdUnit.this.t != streamVolume) {
                TJAdUnit.this.t = streamVolume;
                TJAdUnit.c(TJAdUnit.this);
            }
        }
    };
    private final Runnable J = new Runnable() { // from class: com.tapjoy.TJAdUnit.8
        @Override // java.lang.Runnable
        public final void run() {
            if (TJAdUnit.this.e.getCurrentPosition() != 0) {
                if (!TJAdUnit.this.p) {
                    TJAdUnit.this.p = true;
                }
                TJAdUnit.this.f7590b.onVideoStarted(TJAdUnit.this.n);
                TJAdUnit.this.K.run();
                return;
            }
            if (!TJAdUnit.this.F) {
                TJAdUnit.this.i.postDelayed(TJAdUnit.this.J, 200L);
            } else {
                TJAdUnit.n(TJAdUnit.this);
            }
        }
    };
    private final Runnable K = new Runnable() { // from class: com.tapjoy.TJAdUnit.9
        @Override // java.lang.Runnable
        public final void run() {
            TJAdUnit.this.f7590b.onVideoProgress(TJAdUnit.this.e.getCurrentPosition());
            TJAdUnit.this.i.postDelayed(TJAdUnit.this.K, 500L);
        }
    };
    WebViewClient g = new WebViewClient() { // from class: com.tapjoy.TJAdUnit.2
        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            TapjoyLog.d("TJAdUnit", "onPageStarted: " + str);
            if (TJAdUnit.this.f7590b != null) {
                TJAdUnit.this.f7590b.allowRedirect = true;
                TJAdUnit.this.f7590b.customClose = false;
                TJAdUnit.this.f7590b.closeRequested = false;
                TJAdUnit.this.a();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.d("TJAdUnit", "onPageFinished: " + str);
            if (TJAdUnit.this.l != null) {
                TJAdUnit.this.l.setProgressSpinnerVisibility(false);
            }
            TJAdUnit.s(TJAdUnit.this);
            if (TJAdUnit.this.y) {
                TJAdUnit.u(TJAdUnit.this);
            }
            TJAdUnit.this.f7590b.flushMessageQueue();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.d("TJAdUnit", "error:" + str);
            if (TJAdUnit.this.l != null) {
                TJAdUnit.this.l.showErrorDialog();
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            TapjoyCachedAssetData cachedDataForURL;
            WebResourceResponse a2;
            if (TapjoyCache.getInstance() != null && (cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(str)) != null && (a2 = a(cachedDataForURL)) != null) {
                TapjoyLog.d("TJAdUnit", "Reading request for " + str + " from cache -- localPath: " + cachedDataForURL.getLocalFilePath());
                return a2;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        private boolean a(String str) {
            if (!TJAdUnit.this.e() || !URLUtil.isValidUrl(str)) {
                if (TJAdUnit.this.l != null) {
                    TJAdUnit.this.l.showErrorDialog();
                }
                return true;
            }
            if (TJAdUnit.b(str)) {
                return false;
            }
            if (TJAdUnit.this.f7590b.allowRedirect) {
                Uri parse = Uri.parse(str);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                if (TJAdUnit.this.f7592d.getContext() != null) {
                    TJAdUnit.this.f7592d.getContext().startActivity(intent);
                    return true;
                }
            } else if (str.startsWith("javascript:") && Build.VERSION.SDK_INT >= 19) {
                try {
                    TJAdUnit.this.f7592d.evaluateJavascript(str.replaceFirst("javascript:", ""), null);
                    return true;
                } catch (Exception e) {
                    TapjoyLog.e("TJAdUnit", "Exception in evaluateJavascript. Device not supported. " + e.toString());
                }
            }
            return false;
        }

        private static WebResourceResponse a(TapjoyCachedAssetData tapjoyCachedAssetData) {
            if (tapjoyCachedAssetData == null) {
                return null;
            }
            try {
                return new WebResourceResponse(tapjoyCachedAssetData.getMimeType(), "UTF-8", new FileInputStream(tapjoyCachedAssetData.getLocalFilePath()));
            } catch (Exception unused) {
                return null;
            }
        }
    };
    WebChromeClient h = new WebChromeClient() { // from class: com.tapjoy.TJAdUnit.3
        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            TapjoyLog.d("TJAdUnit", str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (TJAdUnit.this.f7590b.closeRequested) {
                int i = 0;
                String[] strArr = {"Uncaught", "uncaught", "Error", "error", "not defined"};
                if (TJAdUnit.this.l != null) {
                    while (true) {
                        if (i >= 5) {
                            break;
                        }
                        if (consoleMessage.message().contains(strArr[i])) {
                            TJAdUnit.this.l.handleClose();
                            break;
                        }
                        i++;
                    }
                }
            }
            return true;
        }
    };

    /* loaded from: classes2.dex */
    public interface TJAdUnitVideoListener {
        void onVideoCompleted();

        void onVideoError(String str);

        void onVideoStart();
    }

    /* loaded from: classes2.dex */
    public interface TJAdUnitWebViewListener {
        void onClick();

        void onClosed();

        void onContentReady();
    }

    private static boolean a(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    private static boolean b(int i) {
        return i == 1 || i == 9 || i == 7 || i == 12;
    }

    static /* synthetic */ boolean n(TJAdUnit tJAdUnit) {
        tJAdUnit.G = true;
        return true;
    }

    static /* synthetic */ boolean o(TJAdUnit tJAdUnit) {
        tJAdUnit.o = false;
        return false;
    }

    static /* synthetic */ int p(TJAdUnit tJAdUnit) {
        tJAdUnit.n = 0;
        return 0;
    }

    static /* synthetic */ boolean s(TJAdUnit tJAdUnit) {
        tJAdUnit.B = true;
        return true;
    }

    public boolean preload(TJPlacementData tJPlacementData, Context context) {
        if (this.z || !tJPlacementData.isPrerenderingRequested() || !TJPlacementManager.canPreRenderPlacement() || TapjoyConnectCore.isViewOpen()) {
            fireContentReady();
            return false;
        }
        TapjoyLog.i("TJAdUnit", "Pre-rendering ad unit for placement: " + tJPlacementData.getPlacementName());
        TJPlacementManager.incrementPlacementPreRenderCount();
        load(tJPlacementData, true, context);
        return true;
    }

    public void load(final TJPlacementData tJPlacementData, final boolean z, final Context context) {
        this.z = false;
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnit.4
            @Override // java.lang.Runnable
            public final void run() {
                TJAdUnit tJAdUnit = TJAdUnit.this;
                Context context2 = context;
                if (Looper.myLooper() == Looper.getMainLooper() && !tJAdUnit.f && context2 != null) {
                    TapjoyLog.d("TJAdUnit", "Constructing ad unit");
                    tJAdUnit.f = true;
                    tJAdUnit.f7591c = new TJWebView(context2);
                    tJAdUnit.f7591c.loadDataWithBaseURL(null, "<!DOCTYPE html><html><head><title>Tapjoy Background Webview</title></head></html>", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                    tJAdUnit.f7592d = new TJWebView(context2);
                    tJAdUnit.f7592d.setWebViewClient(tJAdUnit.g);
                    tJAdUnit.f7592d.setWebChromeClient(tJAdUnit.h);
                    tJAdUnit.e = new VideoView(context2);
                    tJAdUnit.e.setOnCompletionListener(tJAdUnit);
                    tJAdUnit.e.setOnErrorListener(tJAdUnit);
                    tJAdUnit.e.setOnPreparedListener(tJAdUnit);
                    tJAdUnit.e.setVisibility(4);
                    tJAdUnit.f7590b = new TJAdUnitJSBridge(context2, tJAdUnit);
                    if (context2 instanceof TJAdUnitActivity) {
                        tJAdUnit.setAdUnitActivity((TJAdUnitActivity) context2);
                    }
                }
                if (tJAdUnit.f) {
                    TapjoyLog.i("TJAdUnit", "Loading ad unit content");
                    TJAdUnit.this.z = true;
                    boolean z2 = false;
                    if (!jr.c(tJPlacementData.getRedirectURL())) {
                        if (tJPlacementData.isPreloadDisabled()) {
                            TJAdUnit.this.f7592d.postUrl(tJPlacementData.getRedirectURL(), null);
                        } else {
                            TJAdUnit.this.f7592d.loadUrl(tJPlacementData.getRedirectURL());
                        }
                    } else if (tJPlacementData.getBaseURL() != null && tJPlacementData.getHttpResponse() != null) {
                        TJAdUnit.this.f7592d.loadDataWithBaseURL(tJPlacementData.getBaseURL(), tJPlacementData.getHttpResponse(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                    } else {
                        TapjoyLog.e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                        TJAdUnit.this.z = false;
                    }
                    TJAdUnit tJAdUnit2 = TJAdUnit.this;
                    if (TJAdUnit.this.z && z) {
                        z2 = true;
                    }
                    tJAdUnit2.A = z2;
                }
            }
        });
    }

    public void resume(TJAdUnitSaveStateData tJAdUnitSaveStateData) {
        if (this.f7590b.didLaunchOtherActivity) {
            TapjoyLog.d("TJAdUnit", "onResume bridge.didLaunchOtherActivity callbackID: " + this.f7590b.otherActivityCallbackID);
            this.f7590b.invokeJSCallback(this.f7590b.otherActivityCallbackID, Boolean.TRUE);
            this.f7590b.didLaunchOtherActivity = false;
        }
        this.F = false;
        this.f7590b.setEnabled(true);
        if (tJAdUnitSaveStateData != null) {
            this.n = tJAdUnitSaveStateData.seekTime;
            this.e.seekTo(this.n);
            if (this.m != null) {
                this.v = tJAdUnitSaveStateData.isVideoMuted;
            }
        }
        if (this.G) {
            this.G = false;
            this.i.postDelayed(this.J, 200L);
        }
    }

    public void pause() {
        this.F = true;
        this.f7590b.setEnabled(false);
        pauseVideo();
    }

    public void invokeBridgeCallback(String str, Object... objArr) {
        if (this.f7590b == null || str == null) {
            return;
        }
        this.f7590b.invokeJSCallback(str, objArr);
    }

    public void destroy() {
        this.f7590b.destroy();
        c();
        if (this.f7591c != null) {
            this.f7591c.removeAllViews();
            this.f7591c = null;
        }
        if (this.f7592d != null) {
            this.f7592d.removeAllViews();
            this.f7592d = null;
        }
        this.f = false;
        this.y = false;
        setAdUnitActivity(null);
        a();
        this.m = null;
        if (this.j != null) {
            this.j.onClosed();
        }
        resetContentLoadState();
    }

    public void resetContentLoadState() {
        this.z = false;
        this.B = false;
        this.A = false;
        this.C = -1;
        this.x = false;
        this.v = false;
    }

    public void setVisible(boolean z) {
        this.f7590b.notifyOrientationChanged(getScreenOrientationString(), this.D, this.E);
        this.y = z;
        if (this.y && this.B) {
            this.f7590b.display();
        }
    }

    public void fireContentReady() {
        if (this.j != null) {
            this.j.onContentReady();
        }
    }

    public void fireOnClick() {
        if (this.j != null) {
            this.j.onClick();
        }
    }

    public void closeRequested(boolean z) {
        this.f7590b.closeRequested(Boolean.valueOf(z));
    }

    public void setOrientation(int i) {
        TJAdUnitActivity tJAdUnitActivity = this.l;
        if (tJAdUnitActivity != null) {
            int b2 = b();
            if (this.C != -1) {
                b2 = this.C;
            }
            if ((a(b2) && a(i)) || (b(b2) && b(i))) {
                i = b2;
            }
            tJAdUnitActivity.setRequestedOrientation(i);
            this.C = i;
            this.x = true;
        }
    }

    public void unsetOrientation() {
        TJAdUnitActivity tJAdUnitActivity = this.l;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.setRequestedOrientation(-1);
        }
        this.C = -1;
        this.x = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        TapjoyLog.d("TJAdUnit", "detachVolumeListener");
        if (this.r != null) {
            this.r.cancel(false);
            this.r = null;
        }
        this.s = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int b() {
        TJAdUnitActivity tJAdUnitActivity = this.l;
        if (tJAdUnitActivity == null) {
            return -1;
        }
        int rotation = tJAdUnitActivity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        tJAdUnitActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.D = displayMetrics.widthPixels;
        this.E = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && this.E > this.D) || ((rotation == 1 || rotation == 3) && this.D > this.E)) {
            switch (rotation) {
            }
            return 8;
        }
        switch (rotation) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 8;
            case 3:
                return 9;
            default:
                TapjoyLog.w("TJAdUnit", "Unknown screen orientation. Defaulting to landscape.");
                return 0;
        }
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.l = tJAdUnitActivity;
        if (this.f7590b != null) {
            this.f7590b.setAdUnitActivity(this.l);
        }
    }

    public void setAdContentTracker(fn fnVar) {
        this.H = fnVar;
    }

    public void setBackgroundColor(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnit.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TapjoyLog.d("TJAdUnit", "setBackgroundColor: " + str);
                    TJAdUnit.this.f7591c.setBackgroundColor(Color.parseColor(str));
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.d("TJAdUnit", "Error setting background color. backgroundWebView: " + TJAdUnit.this.f7591c + ", hexColor: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setBackgroundContent(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnit.6
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TapjoyLog.d("TJAdUnit", "setBackgroundContent: " + str);
                    TJAdUnit.this.f7591c.loadDataWithBaseURL(null, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.d("TJAdUnit", "Error setting background content. backgroundWebView: " + TJAdUnit.this.f7591c + ", content: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setWebViewListener(TJAdUnitWebViewListener tJAdUnitWebViewListener) {
        this.j = tJAdUnitWebViewListener;
    }

    public void setVideoListener(TJAdUnitVideoListener tJAdUnitVideoListener) {
        this.k = tJAdUnitVideoListener;
    }

    public int getLockedOrientation() {
        return this.C;
    }

    public int getScreenWidth() {
        return this.D;
    }

    public int getScreenHeight() {
        return this.E;
    }

    public String getScreenOrientationString() {
        return a(b()) ? TJAdUnitConstants.String.LANDSCAPE : TJAdUnitConstants.String.PORTRAIT;
    }

    public boolean hasCalledLoad() {
        return this.z;
    }

    public boolean isPrerendered() {
        return this.A;
    }

    public boolean isLockedOrientation() {
        return this.x;
    }

    public TJWebView getBackgroundWebView() {
        return this.f7591c;
    }

    public TJWebView getWebView() {
        return this.f7592d;
    }

    public boolean getCloseRequested() {
        return this.f7590b.closeRequested;
    }

    public void loadVideoUrl(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnit.7
            @Override // java.lang.Runnable
            public final void run() {
                if (TJAdUnit.this.e != null) {
                    TapjoyLog.i("TJAdUnit", "loadVideoUrl: " + str);
                    TJAdUnit.this.e.setVideoPath(str);
                    TJAdUnit.this.e.setVisibility(0);
                    TJAdUnit.this.e.seekTo(0);
                    adUnitAsyncTaskListner.onComplete(true);
                    return;
                }
                adUnitAsyncTaskListner.onComplete(false);
            }
        });
    }

    public boolean playVideo() {
        TapjoyLog.i("TJAdUnit", "playVideo");
        if (this.e == null) {
            return false;
        }
        this.e.start();
        this.q = false;
        this.i.postDelayed(this.J, 200L);
        return true;
    }

    public boolean pauseVideo() {
        c();
        if (this.e == null || !this.e.isPlaying()) {
            return false;
        }
        this.e.pause();
        this.n = this.e.getCurrentPosition();
        TapjoyLog.i("TJAdUnit", "Video paused at: " + this.n);
        this.f7590b.onVideoPaused(this.n);
        return true;
    }

    public void clearVideo(final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner, final boolean z) {
        if (this.e != null) {
            c();
            TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJAdUnit.10
                @Override // java.lang.Runnable
                public final void run() {
                    TJAdUnit.this.e.setVisibility(z ? 0 : 4);
                    TJAdUnit.this.e.stopPlayback();
                    TJAdUnit.this.p = false;
                    TJAdUnit.o(TJAdUnit.this);
                    TJAdUnit.p(TJAdUnit.this);
                    adUnitAsyncTaskListner.onComplete(true);
                }
            });
        } else {
            adUnitAsyncTaskListner.onComplete(false);
        }
    }

    final void a(boolean z) {
        if (this.m != null) {
            if (z) {
                this.m.setVolume(0.0f, 0.0f);
            } else {
                this.m.setVolume(1.0f, 1.0f);
            }
            if (this.w != z) {
                this.w = z;
                this.f7590b.onVolumeChanged();
                return;
            }
            return;
        }
        this.v = z;
    }

    public void attachVolumeListener(boolean z, int i) {
        TJAdUnitActivity tJAdUnitActivity;
        TapjoyLog.d("TJAdUnit", "attachVolumeListener: isAttached=" + z + "; interval=" + i);
        a();
        if (z && (tJAdUnitActivity = this.l) != null) {
            this.s = (AudioManager) tJAdUnitActivity.getSystemService("audio");
            this.t = this.s.getStreamVolume(3);
            this.u = this.s.getStreamMaxVolume(3);
            long j = i;
            this.r = ho.f8306a.scheduleWithFixedDelay(this.I, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public VideoView getVideoView() {
        return this.e;
    }

    public int getVideoSeekTime() {
        return this.n;
    }

    public boolean isVideoComplete() {
        return this.q;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        TapjoyLog.i("TJAdUnit", "video -- onPrepared");
        final int duration = this.e.getDuration();
        final int measuredWidth = this.e.getMeasuredWidth();
        final int measuredHeight = this.e.getMeasuredHeight();
        this.m = mediaPlayer;
        if (this.v) {
            a(this.v);
        }
        if (this.n > 0 && this.e.getCurrentPosition() != this.n) {
            this.m.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.tapjoy.TJAdUnit.11
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                    TJAdUnit.this.f7590b.onVideoReady(duration, measuredWidth, measuredHeight);
                }
            });
        } else {
            this.f7590b.onVideoReady(duration, measuredWidth, measuredHeight);
        }
        this.m.setOnInfoListener(this);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        TapjoyLog.e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating the VideoView: " + i + " - " + i2));
        this.o = true;
        c();
        String str2 = (i != 100 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_SERVER_DIED") + " -- ";
        if (i2 == -1010) {
            str = str2 + "MEDIA_ERROR_UNSUPPORTED";
        } else if (i2 == -1007) {
            str = str2 + "MEDIA_ERROR_MALFORMED";
        } else if (i2 == -1004) {
            str = str2 + "MEDIA_ERROR_IO";
        } else if (i2 == -110) {
            str = str2 + "MEDIA_ERROR_TIMED_OUT";
        } else {
            str = str2 + "MEDIA_ERROR_EXTRA_UNKNOWN";
        }
        this.f7590b.onVideoError(str);
        return i == 1 || i2 == -1004;
    }

    private void c() {
        this.i.removeCallbacks(this.J);
        this.i.removeCallbacks(this.K);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        TapjoyLog.i("TJAdUnit", "video -- onCompletion");
        c();
        this.q = true;
        if (!this.o) {
            this.f7590b.onVideoCompletion();
        }
        this.o = false;
    }

    public void fireOnVideoStart() {
        TapjoyLog.v("TJAdUnit", "Firing onVideoStart");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoStart();
        }
        if (this.k != null) {
            this.k.onVideoStart();
        }
    }

    public void fireOnVideoError(String str) {
        TapjoyLog.e("TJAdUnit", "Firing onVideoError with error: " + str);
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoError(3);
        }
        if (this.k != null) {
            this.k.onVideoError(str);
        }
    }

    public void fireOnVideoComplete() {
        TapjoyLog.v("TJAdUnit", "Firing onVideoComplete");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoComplete();
        }
        if (this.k != null) {
            this.k.onVideoCompleted();
        }
    }

    public float getVolume() {
        return this.t / this.u;
    }

    public boolean isMuted() {
        return this.w;
    }

    public void startAdContentTracking(String str, JSONObject jSONObject) {
        if (this.H != null) {
            this.H.a(str, jSONObject);
        }
    }

    public void endAdContentTracking(String str, JSONObject jSONObject) {
        if (this.H != null) {
            d();
            this.H.b(str, jSONObject);
        }
    }

    public void sendAdContentTracking(String str, JSONObject jSONObject) {
        if (this.H != null) {
            d();
            fn fnVar = this.H;
            Map a2 = fn.a(jSONObject);
            gg.e(str).a(fnVar.f8125a).a(a2).b(fn.b(jSONObject)).c();
        }
    }

    private void d() {
        if (this.H != null) {
            this.H.a("prerendered", Boolean.valueOf(this.A));
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = "";
        if (i == 3) {
            str = "MEDIA_INFO_VIDEO_RENDERING_START";
        } else if (i != 801) {
            switch (i) {
                case 700:
                    str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                    break;
                case 701:
                    str = "MEDIA_INFO_BUFFERING_START";
                    break;
                case 702:
                    str = "MEDIA_INFO_BUFFERING_END";
                    break;
            }
        } else {
            str = "MEDIA_INFO_NOT_SEEKABLE";
        }
        this.f7590b.onVideoInfo(str);
        return false;
    }

    public TJVideoListener getPublisherVideoListener() {
        return f7589a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        try {
            String host = new URL(TapjoyConfig.TJC_SERVICE_URL).getHost();
            return (host != null && str.contains(host)) || str.contains(TapjoyConnectCore.getRedirectDomain()) || str.contains(TapjoyUtil.getRedirectDomain(TapjoyConnectCore.getPlacementURL()));
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        NetworkInfo activeNetworkInfo;
        try {
            if (this.f7592d.getContext() == null || (activeNetworkInfo = ((ConnectivityManager) this.f7592d.getContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e) {
            TapjoyLog.d("TJAdUnit", "Exception getting NetworkInfo: " + e.getLocalizedMessage());
        }
        return false;
    }

    public void notifyOrientationChanged() {
        this.f7590b.notifyOrientationChanged(getScreenOrientationString(), this.D, this.E);
    }

    static /* synthetic */ void c(TJAdUnit tJAdUnit) {
        tJAdUnit.f7590b.onVolumeChanged();
    }

    static /* synthetic */ void u(TJAdUnit tJAdUnit) {
        tJAdUnit.f7590b.display();
    }
}

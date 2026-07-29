package com.mopub.mraid;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.widget.FrameLayout;
import com.mopub.common.AdReport;
import com.mopub.common.CloseableLayout;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.Preconditions;
import com.mopub.common.UrlAction;
import com.mopub.common.UrlHandler;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.common.util.Views;
import com.mopub.mobileads.MraidVideoPlayerActivity;
import com.mopub.mobileads.WebViewCacheService;
import com.mopub.mobileads.util.WebViews;
import com.mopub.mraid.MraidBridge;
import java.lang.ref.WeakReference;
import java.net.URI;

/* loaded from: classes2.dex */
public class MraidController {
    private final AdReport mAdReport;
    private boolean mAllowOrientationChange;
    private final CloseableLayout mCloseableAdContainer;
    private final Context mContext;
    private MraidWebViewDebugListener mDebugListener;
    private final FrameLayout mDefaultAdContainer;
    private MraidOrientation mForceOrientation;
    private boolean mIsPaused;
    private final MraidBridge mMraidBridge;
    private final MraidBridge.MraidBridgeListener mMraidBridgeListener;
    private MraidListener mMraidListener;
    private final MraidNativeCommandHandler mMraidNativeCommandHandler;
    private MraidBridge.MraidWebView mMraidWebView;
    private UseCustomCloseListener mOnCloseButtonListener;
    private OrientationBroadcastReceiver mOrientationBroadcastReceiver;
    private Integer mOriginalActivityOrientation;
    private final PlacementType mPlacementType;
    private ViewGroup mRootView;
    private final MraidScreenMetrics mScreenMetrics;
    private final ScreenMetricsWaiter mScreenMetricsWaiter;
    private final MraidBridge mTwoPartBridge;
    private final MraidBridge.MraidBridgeListener mTwoPartBridgeListener;
    private MraidBridge.MraidWebView mTwoPartWebView;
    private ViewState mViewState;
    private final WeakReference<Activity> mWeakActivity;

    public interface MraidListener {
        void onClose();

        void onExpand();

        void onFailedToLoad();

        void onLoaded(View view);

        void onOpen();
    }

    public interface MraidWebViewCacheListener {
        void onReady(MraidBridge.MraidWebView mraidWebView, ExternalViewabilitySessionManager externalViewabilitySessionManager);
    }

    public interface UseCustomCloseListener {
        void useCustomCloseChanged(boolean z);
    }

    public MraidController(Context context, AdReport adReport, PlacementType placementType) {
        this(context, adReport, placementType, new MraidBridge(adReport, placementType), new MraidBridge(adReport, PlacementType.INTERSTITIAL), new ScreenMetricsWaiter());
    }

    @VisibleForTesting
    MraidController(Context context, AdReport adReport, PlacementType placementType, MraidBridge mraidBridge, MraidBridge mraidBridge2, ScreenMetricsWaiter screenMetricsWaiter) {
        this.mViewState = ViewState.LOADING;
        this.mOrientationBroadcastReceiver = new OrientationBroadcastReceiver();
        this.mAllowOrientationChange = true;
        this.mForceOrientation = MraidOrientation.NONE;
        this.mMraidBridgeListener = new MraidBridge.MraidBridgeListener() { // from class: com.mopub.mraid.MraidController.3
            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onPageLoaded() {
                MraidController.this.handlePageLoad();
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onPageFailedToLoad() {
                if (MraidController.this.mMraidListener != null) {
                    MraidController.this.mMraidListener.onFailedToLoad();
                }
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onVisibilityChanged(boolean z) {
                if (MraidController.this.mTwoPartBridge.isAttached()) {
                    return;
                }
                MraidController.this.mMraidBridge.notifyViewability(z);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public boolean onJsAlert(String str, JsResult jsResult) {
                return MraidController.this.handleJsAlert(str, jsResult);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return MraidController.this.handleConsoleMessage(consoleMessage);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onClose() {
                MraidController.this.handleClose();
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onResize(int i, int i2, int i3, int i4, CloseableLayout.ClosePosition closePosition, boolean z) throws MraidCommandException {
                MraidController.this.handleResize(i, i2, i3, i4, closePosition, z);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onExpand(URI uri, boolean z) throws MraidCommandException {
                MraidController.this.handleExpand(uri, z);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onUseCustomClose(boolean z) {
                MraidController.this.handleCustomClose(z);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onSetOrientationProperties(boolean z, MraidOrientation mraidOrientation) throws MraidCommandException {
                MraidController.this.handleSetOrientationProperties(z, mraidOrientation);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onOpen(URI uri) {
                MraidController.this.handleOpen(uri.toString());
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onPlayVideo(URI uri) {
                MraidController.this.handleShowVideo(uri.toString());
            }
        };
        this.mTwoPartBridgeListener = new MraidBridge.MraidBridgeListener() { // from class: com.mopub.mraid.MraidController.4
            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onExpand(URI uri, boolean z) {
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onPageFailedToLoad() {
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onPageLoaded() {
                MraidController.this.handleTwoPartPageLoad();
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onVisibilityChanged(boolean z) {
                MraidController.this.mMraidBridge.notifyViewability(z);
                MraidController.this.mTwoPartBridge.notifyViewability(z);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public boolean onJsAlert(String str, JsResult jsResult) {
                return MraidController.this.handleJsAlert(str, jsResult);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return MraidController.this.handleConsoleMessage(consoleMessage);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onResize(int i, int i2, int i3, int i4, CloseableLayout.ClosePosition closePosition, boolean z) throws MraidCommandException {
                throw new MraidCommandException("Not allowed to resize from an expanded state");
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onClose() {
                MraidController.this.handleClose();
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onUseCustomClose(boolean z) {
                MraidController.this.handleCustomClose(z);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onSetOrientationProperties(boolean z, MraidOrientation mraidOrientation) throws MraidCommandException {
                MraidController.this.handleSetOrientationProperties(z, mraidOrientation);
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onOpen(URI uri) {
                MraidController.this.handleOpen(uri.toString());
            }

            @Override // com.mopub.mraid.MraidBridge.MraidBridgeListener
            public void onPlayVideo(URI uri) {
                MraidController.this.handleShowVideo(uri.toString());
            }
        };
        this.mContext = context.getApplicationContext();
        Preconditions.checkNotNull(this.mContext);
        this.mAdReport = adReport;
        if (context instanceof Activity) {
            this.mWeakActivity = new WeakReference<>((Activity) context);
        } else {
            this.mWeakActivity = new WeakReference<>(null);
        }
        this.mPlacementType = placementType;
        this.mMraidBridge = mraidBridge;
        this.mTwoPartBridge = mraidBridge2;
        this.mScreenMetricsWaiter = screenMetricsWaiter;
        this.mViewState = ViewState.LOADING;
        this.mScreenMetrics = new MraidScreenMetrics(this.mContext, this.mContext.getResources().getDisplayMetrics().density);
        this.mDefaultAdContainer = new FrameLayout(this.mContext);
        this.mCloseableAdContainer = new CloseableLayout(this.mContext);
        this.mCloseableAdContainer.setOnCloseListener(new CloseableLayout.OnCloseListener() { // from class: com.mopub.mraid.MraidController.1
            @Override // com.mopub.common.CloseableLayout.OnCloseListener
            public void onClose() {
                MraidController.this.handleClose();
            }
        });
        View view = new View(this.mContext);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.mopub.mraid.MraidController.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        this.mCloseableAdContainer.addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.mOrientationBroadcastReceiver.register(this.mContext);
        this.mMraidBridge.setMraidBridgeListener(this.mMraidBridgeListener);
        this.mTwoPartBridge.setMraidBridgeListener(this.mTwoPartBridgeListener);
        this.mMraidNativeCommandHandler = new MraidNativeCommandHandler();
    }

    public void setMraidListener(MraidListener mraidListener) {
        this.mMraidListener = mraidListener;
    }

    public void setUseCustomCloseListener(UseCustomCloseListener useCustomCloseListener) {
        this.mOnCloseButtonListener = useCustomCloseListener;
    }

    public void setDebugListener(MraidWebViewDebugListener mraidWebViewDebugListener) {
        this.mDebugListener = mraidWebViewDebugListener;
    }

    public void fillContent(Long l, String str, MraidWebViewCacheListener mraidWebViewCacheListener) {
        Preconditions.checkNotNull(str, "htmlData cannot be null");
        boolean hydrateMraidWebView = hydrateMraidWebView(l, mraidWebViewCacheListener);
        Preconditions.NoThrow.checkNotNull(this.mMraidWebView, "mMraidWebView cannot be null");
        this.mMraidBridge.attachView(this.mMraidWebView);
        this.mDefaultAdContainer.addView(this.mMraidWebView, new FrameLayout.LayoutParams(-1, -1));
        if (hydrateMraidWebView) {
            handlePageLoad();
        } else {
            this.mMraidBridge.setContentHtml(str);
        }
    }

    private boolean hydrateMraidWebView(Long l, MraidWebViewCacheListener mraidWebViewCacheListener) {
        WebViewCacheService.Config popWebViewConfig;
        if (l != null && (popWebViewConfig = WebViewCacheService.popWebViewConfig(l)) != null && (popWebViewConfig.getWebView() instanceof MraidBridge.MraidWebView)) {
            this.mMraidWebView = (MraidBridge.MraidWebView) popWebViewConfig.getWebView();
            this.mMraidWebView.enablePlugins(true);
            if (mraidWebViewCacheListener != null) {
                mraidWebViewCacheListener.onReady(this.mMraidWebView, popWebViewConfig.getViewabilityManager());
            }
            return true;
        }
        MoPubLog.d("WebView cache miss. Creating a new MraidWebView.");
        this.mMraidWebView = new MraidBridge.MraidWebView(this.mContext);
        if (mraidWebViewCacheListener == null) {
            return false;
        }
        mraidWebViewCacheListener.onReady(this.mMraidWebView, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDisplayRotation() {
        return ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @VisibleForTesting
    boolean handleConsoleMessage(ConsoleMessage consoleMessage) {
        if (this.mDebugListener != null) {
            return this.mDebugListener.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @VisibleForTesting
    boolean handleJsAlert(String str, JsResult jsResult) {
        if (this.mDebugListener != null) {
            return this.mDebugListener.onJsAlert(str, jsResult);
        }
        jsResult.confirm();
        return true;
    }

    @VisibleForTesting
    static class ScreenMetricsWaiter {
        private final Handler mHandler = new Handler();
        private WaitRequest mLastWaitRequest;

        static class WaitRequest {
            private final Handler mHandler;
            private Runnable mSuccessRunnable;
            private final View[] mViews;
            int mWaitCount;
            private final Runnable mWaitingRunnable;

            private WaitRequest(Handler handler, View[] viewArr) {
                this.mWaitingRunnable = new Runnable() { // from class: com.mopub.mraid.MraidController.ScreenMetricsWaiter.WaitRequest.1
                    @Override // java.lang.Runnable
                    public void run() {
                        for (final View view : WaitRequest.this.mViews) {
                            if (view.getHeight() > 0 || view.getWidth() > 0) {
                                WaitRequest.this.countDown();
                            } else {
                                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.mopub.mraid.MraidController.ScreenMetricsWaiter.WaitRequest.1.1
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public boolean onPreDraw() {
                                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                                        WaitRequest.this.countDown();
                                        return true;
                                    }
                                });
                            }
                        }
                    }
                };
                this.mHandler = handler;
                this.mViews = viewArr;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void countDown() {
                this.mWaitCount--;
                if (this.mWaitCount != 0 || this.mSuccessRunnable == null) {
                    return;
                }
                this.mSuccessRunnable.run();
                this.mSuccessRunnable = null;
            }

            void start(Runnable runnable) {
                this.mSuccessRunnable = runnable;
                this.mWaitCount = this.mViews.length;
                this.mHandler.post(this.mWaitingRunnable);
            }

            void cancel() {
                this.mHandler.removeCallbacks(this.mWaitingRunnable);
                this.mSuccessRunnable = null;
            }
        }

        ScreenMetricsWaiter() {
        }

        WaitRequest waitFor(View... viewArr) {
            this.mLastWaitRequest = new WaitRequest(this.mHandler, viewArr);
            return this.mLastWaitRequest;
        }

        void cancelLastRequest() {
            if (this.mLastWaitRequest != null) {
                this.mLastWaitRequest.cancel();
                this.mLastWaitRequest = null;
            }
        }
    }

    public MraidBridge.MraidWebView getCurrentWebView() {
        return this.mTwoPartBridge.isAttached() ? this.mTwoPartWebView : this.mMraidWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInlineVideoAvailable() {
        Activity activity = this.mWeakActivity.get();
        if (activity == null || getCurrentWebView() == null) {
            return false;
        }
        return this.mMraidNativeCommandHandler.isInlineVideoAvailable(activity, getCurrentWebView());
    }

    @VisibleForTesting
    void handlePageLoad() {
        setViewState(ViewState.DEFAULT, new Runnable() { // from class: com.mopub.mraid.MraidController.5
            @Override // java.lang.Runnable
            public void run() {
                MraidController.this.mMraidBridge.notifySupports(MraidController.this.mMraidNativeCommandHandler.isSmsAvailable(MraidController.this.mContext), MraidController.this.mMraidNativeCommandHandler.isTelAvailable(MraidController.this.mContext), MraidNativeCommandHandler.isCalendarAvailable(MraidController.this.mContext), MraidNativeCommandHandler.isStorePictureSupported(MraidController.this.mContext), MraidController.this.isInlineVideoAvailable());
                MraidController.this.mMraidBridge.notifyPlacementType(MraidController.this.mPlacementType);
                MraidController.this.mMraidBridge.notifyViewability(MraidController.this.mMraidBridge.isVisible());
                MraidController.this.mMraidBridge.notifyReady();
            }
        });
        if (this.mMraidListener != null) {
            this.mMraidListener.onLoaded(this.mDefaultAdContainer);
        }
    }

    @VisibleForTesting
    void handleTwoPartPageLoad() {
        updateScreenMetricsAsync(new Runnable() { // from class: com.mopub.mraid.MraidController.6
            @Override // java.lang.Runnable
            public void run() {
                MraidBridge mraidBridge = MraidController.this.mTwoPartBridge;
                boolean isSmsAvailable = MraidController.this.mMraidNativeCommandHandler.isSmsAvailable(MraidController.this.mContext);
                boolean isTelAvailable = MraidController.this.mMraidNativeCommandHandler.isTelAvailable(MraidController.this.mContext);
                MraidNativeCommandHandler unused = MraidController.this.mMraidNativeCommandHandler;
                boolean isCalendarAvailable = MraidNativeCommandHandler.isCalendarAvailable(MraidController.this.mContext);
                MraidNativeCommandHandler unused2 = MraidController.this.mMraidNativeCommandHandler;
                mraidBridge.notifySupports(isSmsAvailable, isTelAvailable, isCalendarAvailable, MraidNativeCommandHandler.isStorePictureSupported(MraidController.this.mContext), MraidController.this.isInlineVideoAvailable());
                MraidController.this.mTwoPartBridge.notifyViewState(MraidController.this.mViewState);
                MraidController.this.mTwoPartBridge.notifyPlacementType(MraidController.this.mPlacementType);
                MraidController.this.mTwoPartBridge.notifyViewability(MraidController.this.mTwoPartBridge.isVisible());
                MraidController.this.mTwoPartBridge.notifyReady();
            }
        });
    }

    private void updateScreenMetricsAsync(final Runnable runnable) {
        this.mScreenMetricsWaiter.cancelLastRequest();
        final MraidBridge.MraidWebView currentWebView = getCurrentWebView();
        if (currentWebView == null) {
            return;
        }
        this.mScreenMetricsWaiter.waitFor(this.mDefaultAdContainer, currentWebView).start(new Runnable() { // from class: com.mopub.mraid.MraidController.7
            @Override // java.lang.Runnable
            public void run() {
                DisplayMetrics displayMetrics = MraidController.this.mContext.getResources().getDisplayMetrics();
                MraidController.this.mScreenMetrics.setScreenSize(displayMetrics.widthPixels, displayMetrics.heightPixels);
                int[] iArr = new int[2];
                ViewGroup rootView = MraidController.this.getRootView();
                rootView.getLocationOnScreen(iArr);
                MraidController.this.mScreenMetrics.setRootViewPosition(iArr[0], iArr[1], rootView.getWidth(), rootView.getHeight());
                MraidController.this.mDefaultAdContainer.getLocationOnScreen(iArr);
                MraidController.this.mScreenMetrics.setDefaultAdPosition(iArr[0], iArr[1], MraidController.this.mDefaultAdContainer.getWidth(), MraidController.this.mDefaultAdContainer.getHeight());
                currentWebView.getLocationOnScreen(iArr);
                MraidController.this.mScreenMetrics.setCurrentAdPosition(iArr[0], iArr[1], currentWebView.getWidth(), currentWebView.getHeight());
                MraidController.this.mMraidBridge.notifyScreenMetrics(MraidController.this.mScreenMetrics);
                if (MraidController.this.mTwoPartBridge.isAttached()) {
                    MraidController.this.mTwoPartBridge.notifyScreenMetrics(MraidController.this.mScreenMetrics);
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    void handleOrientationChange(int i) {
        updateScreenMetricsAsync(null);
    }

    public void pause(boolean z) {
        this.mIsPaused = true;
        if (this.mMraidWebView != null) {
            WebViews.onPause(this.mMraidWebView, z);
        }
        if (this.mTwoPartWebView != null) {
            WebViews.onPause(this.mTwoPartWebView, z);
        }
    }

    public void resume() {
        this.mIsPaused = false;
        if (this.mMraidWebView != null) {
            this.mMraidWebView.onResume();
        }
        if (this.mTwoPartWebView != null) {
            this.mTwoPartWebView.onResume();
        }
    }

    public void destroy() {
        this.mScreenMetricsWaiter.cancelLastRequest();
        try {
            this.mOrientationBroadcastReceiver.unregister();
        } catch (IllegalArgumentException e) {
            if (!e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        if (!this.mIsPaused) {
            pause(true);
        }
        Views.removeFromParent(this.mCloseableAdContainer);
        this.mMraidBridge.detach();
        if (this.mMraidWebView != null) {
            this.mMraidWebView.destroy();
            this.mMraidWebView = null;
        }
        this.mTwoPartBridge.detach();
        if (this.mTwoPartWebView != null) {
            this.mTwoPartWebView.destroy();
            this.mTwoPartWebView = null;
        }
    }

    private void setViewState(ViewState viewState) {
        setViewState(viewState, null);
    }

    private void setViewState(ViewState viewState, Runnable runnable) {
        MoPubLog.d("MRAID state set to " + viewState);
        ViewState viewState2 = this.mViewState;
        this.mViewState = viewState;
        this.mMraidBridge.notifyViewState(viewState);
        if (this.mTwoPartBridge.isLoaded()) {
            this.mTwoPartBridge.notifyViewState(viewState);
        }
        if (this.mMraidListener != null) {
            if (viewState == ViewState.EXPANDED) {
                this.mMraidListener.onExpand();
            } else if (viewState2 == ViewState.EXPANDED && viewState == ViewState.DEFAULT) {
                this.mMraidListener.onClose();
            } else if (viewState == ViewState.HIDDEN) {
                this.mMraidListener.onClose();
            }
        }
        updateScreenMetricsAsync(runnable);
    }

    int clampInt(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    @VisibleForTesting
    void handleResize(int i, int i2, int i3, int i4, CloseableLayout.ClosePosition closePosition, boolean z) throws MraidCommandException {
        if (this.mMraidWebView == null) {
            throw new MraidCommandException("Unable to resize after the WebView is destroyed");
        }
        if (this.mViewState == ViewState.LOADING || this.mViewState == ViewState.HIDDEN) {
            return;
        }
        if (this.mViewState == ViewState.EXPANDED) {
            throw new MraidCommandException("Not allowed to resize from an already expanded ad");
        }
        if (this.mPlacementType == PlacementType.INTERSTITIAL) {
            throw new MraidCommandException("Not allowed to resize from an interstitial ad");
        }
        int dipsToIntPixels = Dips.dipsToIntPixels(i, this.mContext);
        int dipsToIntPixels2 = Dips.dipsToIntPixels(i2, this.mContext);
        int dipsToIntPixels3 = Dips.dipsToIntPixels(i3, this.mContext);
        int dipsToIntPixels4 = Dips.dipsToIntPixels(i4, this.mContext);
        int i5 = this.mScreenMetrics.getDefaultAdRect().left + dipsToIntPixels3;
        int i6 = this.mScreenMetrics.getDefaultAdRect().top + dipsToIntPixels4;
        Rect rect = new Rect(i5, i6, dipsToIntPixels + i5, i6 + dipsToIntPixels2);
        if (!z) {
            Rect rootViewRect = this.mScreenMetrics.getRootViewRect();
            if (rect.width() > rootViewRect.width() || rect.height() > rootViewRect.height()) {
                throw new MraidCommandException("resizeProperties specified a size (" + i + ", " + i2 + ") and offset (" + i3 + ", " + i4 + ") that doesn't allow the ad to appear within the max allowed size (" + this.mScreenMetrics.getRootViewRectDips().width() + ", " + this.mScreenMetrics.getRootViewRectDips().height() + ")");
            }
            rect.offsetTo(clampInt(rootViewRect.left, rect.left, rootViewRect.right - rect.width()), clampInt(rootViewRect.top, rect.top, rootViewRect.bottom - rect.height()));
        }
        Rect rect2 = new Rect();
        this.mCloseableAdContainer.applyCloseRegionBounds(closePosition, rect, rect2);
        if (!this.mScreenMetrics.getRootViewRect().contains(rect2)) {
            throw new MraidCommandException("resizeProperties specified a size (" + i + ", " + i2 + ") and offset (" + i3 + ", " + i4 + ") that doesn't allow the close region to appear within the max allowed size (" + this.mScreenMetrics.getRootViewRectDips().width() + ", " + this.mScreenMetrics.getRootViewRectDips().height() + ")");
        }
        if (!rect.contains(rect2)) {
            throw new MraidCommandException("resizeProperties specified a size (" + i + ", " + dipsToIntPixels2 + ") and offset (" + i3 + ", " + i4 + ") that don't allow the close region to appear within the resized ad.");
        }
        this.mCloseableAdContainer.setCloseVisible(false);
        this.mCloseableAdContainer.setClosePosition(closePosition);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left - this.mScreenMetrics.getRootViewRect().left;
        layoutParams.topMargin = rect.top - this.mScreenMetrics.getRootViewRect().top;
        if (this.mViewState == ViewState.DEFAULT) {
            this.mDefaultAdContainer.removeView(this.mMraidWebView);
            this.mDefaultAdContainer.setVisibility(4);
            this.mCloseableAdContainer.addView(this.mMraidWebView, new FrameLayout.LayoutParams(-1, -1));
            getAndMemoizeRootView().addView(this.mCloseableAdContainer, layoutParams);
        } else if (this.mViewState == ViewState.RESIZED) {
            this.mCloseableAdContainer.setLayoutParams(layoutParams);
        }
        this.mCloseableAdContainer.setClosePosition(closePosition);
        setViewState(ViewState.RESIZED);
    }

    void handleExpand(URI uri, boolean z) throws MraidCommandException {
        if (this.mMraidWebView == null) {
            throw new MraidCommandException("Unable to expand after the WebView is destroyed");
        }
        if (this.mPlacementType == PlacementType.INTERSTITIAL) {
            return;
        }
        if (this.mViewState == ViewState.DEFAULT || this.mViewState == ViewState.RESIZED) {
            applyOrientation();
            boolean z2 = uri != null;
            if (z2) {
                this.mTwoPartWebView = new MraidBridge.MraidWebView(this.mContext);
                this.mTwoPartBridge.attachView(this.mTwoPartWebView);
                this.mTwoPartBridge.setContentUrl(uri.toString());
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (this.mViewState == ViewState.DEFAULT) {
                if (z2) {
                    this.mCloseableAdContainer.addView(this.mTwoPartWebView, layoutParams);
                } else {
                    this.mDefaultAdContainer.removeView(this.mMraidWebView);
                    this.mDefaultAdContainer.setVisibility(4);
                    this.mCloseableAdContainer.addView(this.mMraidWebView, layoutParams);
                }
                getAndMemoizeRootView().addView(this.mCloseableAdContainer, new FrameLayout.LayoutParams(-1, -1));
            } else if (this.mViewState == ViewState.RESIZED && z2) {
                this.mCloseableAdContainer.removeView(this.mMraidWebView);
                this.mDefaultAdContainer.addView(this.mMraidWebView, layoutParams);
                this.mDefaultAdContainer.setVisibility(4);
                this.mCloseableAdContainer.addView(this.mTwoPartWebView, layoutParams);
            }
            this.mCloseableAdContainer.setLayoutParams(layoutParams);
            handleCustomClose(z);
            setViewState(ViewState.EXPANDED);
        }
    }

    @VisibleForTesting
    protected void handleClose() {
        if (this.mMraidWebView == null || this.mViewState == ViewState.LOADING || this.mViewState == ViewState.HIDDEN) {
            return;
        }
        if (this.mViewState == ViewState.EXPANDED || this.mPlacementType == PlacementType.INTERSTITIAL) {
            unApplyOrientation();
        }
        if (this.mViewState == ViewState.RESIZED || this.mViewState == ViewState.EXPANDED) {
            if (this.mTwoPartBridge.isAttached() && this.mTwoPartWebView != null) {
                this.mCloseableAdContainer.removeView(this.mTwoPartWebView);
                this.mTwoPartBridge.detach();
            } else {
                this.mCloseableAdContainer.removeView(this.mMraidWebView);
                this.mDefaultAdContainer.addView(this.mMraidWebView, new FrameLayout.LayoutParams(-1, -1));
                this.mDefaultAdContainer.setVisibility(0);
            }
            Views.removeFromParent(this.mCloseableAdContainer);
            setViewState(ViewState.DEFAULT);
            return;
        }
        if (this.mViewState == ViewState.DEFAULT) {
            this.mDefaultAdContainer.setVisibility(4);
            setViewState(ViewState.HIDDEN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getRootView() {
        if (this.mRootView != null) {
            return this.mRootView;
        }
        View topmostView = Views.getTopmostView(this.mWeakActivity.get(), this.mDefaultAdContainer);
        return topmostView instanceof ViewGroup ? (ViewGroup) topmostView : this.mDefaultAdContainer;
    }

    private ViewGroup getAndMemoizeRootView() {
        if (this.mRootView == null) {
            this.mRootView = getRootView();
        }
        return this.mRootView;
    }

    @VisibleForTesting
    void handleShowVideo(String str) {
        MraidVideoPlayerActivity.startMraid(this.mContext, str);
    }

    @VisibleForTesting
    void lockOrientation(int i) throws MraidCommandException {
        Activity activity = this.mWeakActivity.get();
        if (activity == null || !shouldAllowForceOrientation(this.mForceOrientation)) {
            throw new MraidCommandException("Attempted to lock orientation to unsupported value: " + this.mForceOrientation.name());
        }
        if (this.mOriginalActivityOrientation == null) {
            this.mOriginalActivityOrientation = Integer.valueOf(activity.getRequestedOrientation());
        }
        activity.setRequestedOrientation(i);
    }

    @VisibleForTesting
    void applyOrientation() throws MraidCommandException {
        if (this.mForceOrientation == MraidOrientation.NONE) {
            if (this.mAllowOrientationChange) {
                unApplyOrientation();
                return;
            }
            Activity activity = this.mWeakActivity.get();
            if (activity == null) {
                throw new MraidCommandException("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            lockOrientation(DeviceUtils.getScreenOrientation(activity));
            return;
        }
        lockOrientation(this.mForceOrientation.getActivityInfoOrientation());
    }

    @VisibleForTesting
    void unApplyOrientation() {
        Activity activity = this.mWeakActivity.get();
        if (activity != null && this.mOriginalActivityOrientation != null) {
            activity.setRequestedOrientation(this.mOriginalActivityOrientation.intValue());
        }
        this.mOriginalActivityOrientation = null;
    }

    @VisibleForTesting
    boolean shouldAllowForceOrientation(MraidOrientation mraidOrientation) {
        if (mraidOrientation == MraidOrientation.NONE) {
            return true;
        }
        Activity activity = this.mWeakActivity.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            int i = activityInfo.screenOrientation;
            return i != -1 ? i == mraidOrientation.getActivityInfoOrientation() : Utils.bitMaskContainsFlag(activityInfo.configChanges, 128) && Utils.bitMaskContainsFlag(activityInfo.configChanges, 1024);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @VisibleForTesting
    protected void handleCustomClose(boolean z) {
        if (z == (!this.mCloseableAdContainer.isCloseVisible())) {
            return;
        }
        this.mCloseableAdContainer.setCloseVisible(!z);
        if (this.mOnCloseButtonListener != null) {
            this.mOnCloseButtonListener.useCustomCloseChanged(z);
        }
    }

    public FrameLayout getAdContainer() {
        return this.mDefaultAdContainer;
    }

    public void loadJavascript(String str) {
        this.mMraidBridge.injectJavaScript(str);
    }

    @VisibleForTesting
    class OrientationBroadcastReceiver extends BroadcastReceiver {
        private Context mContext;
        private int mLastRotation = -1;

        OrientationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int displayRotation;
            if (this.mContext == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (displayRotation = MraidController.this.getDisplayRotation()) == this.mLastRotation) {
                return;
            }
            this.mLastRotation = displayRotation;
            MraidController.this.handleOrientationChange(this.mLastRotation);
        }

        public void register(Context context) {
            Preconditions.checkNotNull(context);
            this.mContext = context.getApplicationContext();
            if (this.mContext != null) {
                this.mContext.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            }
        }

        public void unregister() {
            if (this.mContext != null) {
                this.mContext.unregisterReceiver(this);
                this.mContext = null;
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    WeakReference<Activity> getWeakActivity() {
        return this.mWeakActivity;
    }

    @VisibleForTesting
    void handleSetOrientationProperties(boolean z, MraidOrientation mraidOrientation) throws MraidCommandException {
        if (!shouldAllowForceOrientation(mraidOrientation)) {
            throw new MraidCommandException("Unable to force orientation to " + mraidOrientation);
        }
        this.mAllowOrientationChange = z;
        this.mForceOrientation = mraidOrientation;
        if (this.mViewState == ViewState.EXPANDED || this.mPlacementType == PlacementType.INTERSTITIAL) {
            applyOrientation();
        }
    }

    @VisibleForTesting
    void handleOpen(String str) {
        if (this.mMraidListener != null) {
            this.mMraidListener.onOpen();
        }
        UrlHandler.Builder builder = new UrlHandler.Builder();
        if (this.mAdReport != null) {
            builder.withDspCreativeId(this.mAdReport.getDspCreativeId());
        }
        builder.withSupportedUrlActions(UrlAction.IGNORE_ABOUT_SCHEME, UrlAction.OPEN_NATIVE_BROWSER, UrlAction.OPEN_IN_APP_BROWSER, UrlAction.HANDLE_SHARE_TWEET, UrlAction.FOLLOW_DEEP_LINK_WITH_FALLBACK, UrlAction.FOLLOW_DEEP_LINK).build().handleUrl(this.mContext, str);
    }

    @VisibleForTesting
    @Deprecated
    ViewState getViewState() {
        return this.mViewState;
    }

    @VisibleForTesting
    @Deprecated
    void setViewStateForTesting(ViewState viewState) {
        this.mViewState = viewState;
    }

    @VisibleForTesting
    @Deprecated
    CloseableLayout getExpandedAdContainer() {
        return this.mCloseableAdContainer;
    }

    @VisibleForTesting
    @Deprecated
    void setRootView(FrameLayout frameLayout) {
        this.mRootView = frameLayout;
    }

    @VisibleForTesting
    @Deprecated
    void setRootViewSize(int i, int i2) {
        this.mScreenMetrics.setRootViewPosition(0, 0, i, i2);
    }

    @VisibleForTesting
    @Deprecated
    Integer getOriginalActivityOrientation() {
        return this.mOriginalActivityOrientation;
    }

    @VisibleForTesting
    @Deprecated
    boolean getAllowOrientationChange() {
        return this.mAllowOrientationChange;
    }

    @VisibleForTesting
    @Deprecated
    MraidOrientation getForceOrientation() {
        return this.mForceOrientation;
    }

    @VisibleForTesting
    @Deprecated
    void setOrientationBroadcastReceiver(OrientationBroadcastReceiver orientationBroadcastReceiver) {
        this.mOrientationBroadcastReceiver = orientationBroadcastReceiver;
    }

    @VisibleForTesting
    @Deprecated
    MraidBridge.MraidWebView getMraidWebView() {
        return this.mMraidWebView;
    }

    @VisibleForTesting
    @Deprecated
    MraidBridge.MraidWebView getTwoPartWebView() {
        return this.mTwoPartWebView;
    }
}

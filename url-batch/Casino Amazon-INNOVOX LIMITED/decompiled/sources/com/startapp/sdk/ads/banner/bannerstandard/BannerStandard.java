package com.startapp.sdk.ads.banner.bannerstandard;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.react.uimanager.ViewProps;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import com.startapp.sdk.internal.a3;
import com.startapp.sdk.internal.dc;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.e1;
import com.startapp.sdk.internal.ec;
import com.startapp.sdk.internal.ed;
import com.startapp.sdk.internal.ef;
import com.startapp.sdk.internal.f1;
import com.startapp.sdk.internal.fc;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.g1;
import com.startapp.sdk.internal.ic;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.ja;
import com.startapp.sdk.internal.jc;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.l1;
import com.startapp.sdk.internal.lj;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.mj;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.internal.q1;
import com.startapp.sdk.internal.r1;
import com.startapp.sdk.internal.u6;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.xb;
import com.startapp.sdk.internal.xe;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.yb;
import com.startapp.sdk.internal.yf;
import com.startapp.sdk.internal.zh;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    private static final String LOG_TAG = "BannerStandard";
    protected l1 adHtml;
    private RelativeLayout adInformationContatiner;
    private com.startapp.sdk.adsbase.adinformation.a adInformationLayout;
    private ed adSession;
    private final Object adSessionLock;
    private boolean callLoadHtmlOnAttached;
    private boolean callbackSent;
    private CloseableLayout closeableAdContainer;
    private boolean defaultLoad;
    private final ef impressionListener;
    protected boolean jsTag;
    protected BannerListener listener;
    private a mraidController;
    private BannerOptions options;
    private ViewGroup rootView;
    private ff scheduledImpression;
    private boolean sessionStarted;
    private BannerSize size;
    private WebView twoPartWebView;
    private double viewHeightDp;
    private double viewWidthDp;
    private boolean visible;
    private WebView webView;
    private RelativeLayout webViewContainer;
    protected boolean webViewTouched;

    public class a extends r1 implements xb {
        private MraidState mraidState;
        private boolean mraidVisibility;
        private final ec nativeFeatureManager;
        private final fc orientationProperties;
        private ic resizeProperties;
        private a twoPart;
        private lj viewabilityTracker;
        mj visibilityResult;
        private final WebView webView;

        public a(WebView webView, q1 q1Var) {
            super(q1Var);
            this.webView = webView;
            this.nativeFeatureManager = new ec(BannerStandard.this.getContext());
            this.orientationProperties = new fc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVisibilityTracker() {
            if (this.viewabilityTracker == null) {
                this.viewabilityTracker = new lj(this.webView, BannerStandard.this.getAdLoadingSize(), BannerMetaData.c().a(), new d(this));
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.addVisibilityTracker();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireExposureChangeEvent(mj mjVar) {
            String str;
            if (mjVar.equals(this.visibilityResult)) {
                return;
            }
            this.visibilityResult = mjVar;
            Rect rect = mjVar.b;
            if (rect == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ViewProps.LEFT, rect.left);
                jSONObject.put(ViewProps.TOP, rect.top);
                jSONObject.put(ViewProps.WIDTH, rect.width());
                jSONObject.put(ViewProps.HEIGHT, rect.height());
                Rect[] rectArr = mjVar.c;
                int length = rectArr == null ? 0 : rectArr.length;
                if (length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(ViewProps.LEFT, rectArr[i].left);
                        jSONObject2.put(ViewProps.TOP, rectArr[i].top);
                        jSONObject2.put(ViewProps.WIDTH, rectArr[i].width());
                        jSONObject2.put(ViewProps.HEIGHT, rectArr[i].height());
                        jSONArray.put(jSONObject2);
                    }
                    str = jSONArray.toString();
                } else {
                    str = null;
                }
                zh.a(this.webView, false, "mraid.fireExposureChangeEvent", Float.valueOf(mjVar.f341a), jSONObject.toString(), str);
            } catch (JSONException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z) {
            if (this.mraidVisibility == z) {
                return;
            }
            this.mraidVisibility = z;
            zh.a(this.webView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z));
        }

        private void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                float f = i2;
                zh.a(webView, true, "mraid.setScreenSize", Integer.valueOf(ph.b(context, i)), Integer.valueOf(Math.round(f / context.getResources().getDisplayMetrics().density)));
                yb.b(context, i3, i4, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
                zh.a(webView, true, "mraid.setMaxSize", Integer.valueOf(ph.b(context, i)), Integer.valueOf(Math.round(f / context.getResources().getDisplayMetrics().density)));
                yb.a(context, i3, i4, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
            } catch (Throwable th) {
                n8.a(th);
            }
        }

        public void cancelViewabilityTracking() {
            lj ljVar = this.viewabilityTracker;
            if (ljVar != null) {
                ljVar.f325a.removeCallbacksAndMessages(null);
                this.viewabilityTracker = null;
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.cancelViewabilityTracking();
            }
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void close() {
            BannerStandard.this.handleCollapse();
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void expand(String str) {
            BannerStandard.this.cancelReloadTask();
            boolean isEmpty = TextUtils.isEmpty(str);
            boolean z = !isEmpty;
            if (!isEmpty) {
                BannerStandard.this.setupTwoPartMraidController(str);
            }
            if (getState() == MraidState.DEFAULT) {
                BannerStandard.this.onMraidExpandDefault(new FrameLayout.LayoutParams(-1, -1), z);
            } else if (getState() == MraidState.RESIZED && !isEmpty) {
                BannerStandard.this.onMraidExpandResized(new FrameLayout.LayoutParams(-1, -1));
            }
            BannerStandard.this.setCloseableAdContainerLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setState(MraidState.EXPANDED);
        }

        public ic getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public void init() {
            this.webView.setWebViewClient(new jc(this, this));
        }

        public void initTwoPart(WebView webView) {
            if (this.twoPart == null) {
                a aVar = BannerStandard.this.new a(webView, this.openListener);
                this.twoPart = aVar;
                aVar.init();
                this.twoPart.onMraidDetected();
            }
        }

        @Override // com.startapp.sdk.internal.r1
        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.b.contains(str);
        }

        @Override // com.startapp.sdk.internal.xb
        public void onMraidDetected() {
            if (this.mraidState != null) {
                return;
            }
            this.mraidState = MraidState.LOADING;
            addVisibilityTracker();
        }

        @Override // com.startapp.sdk.internal.xb
        public void onPageFinished(String str) {
            BannerStandard.this.getContext();
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(2, "StartAppSDK", "Banner received callback onPageFinished()");
            ((w6) ((BannerBase) BannerStandard.this).eventTracer.a()).c(BannerStandard.this, mh.C);
            BannerStandard.this.makeImpression(this.mraidState != null);
            WebView webView = this.webView;
            if (this.mraidState == MraidState.LOADING) {
                zh.a(webView, true, "mraid.setPlacementType", "inline");
                dc.a(BannerStandard.this.getContext(), webView, this.nativeFeatureManager);
                zh.a(this.webView, true, "gClientInterface.onPageFinished", Boolean.valueOf(this.mraidState != null));
                updateDisplayMetrics(webView);
                MraidState mraidState = MraidState.DEFAULT;
                this.mraidState = mraidState;
                zh.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
                zh.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            }
            BannerStandard.this.onWebviewPageFinished(webView);
        }

        public void release() {
            cancelViewabilityTracking();
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.release();
                this.twoPart = null;
            }
        }

        public boolean releaseTwoPart() {
            a aVar = this.twoPart;
            if (aVar == null) {
                return false;
            }
            aVar.release();
            this.twoPart = null;
            return true;
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void resize() {
            BannerStandard.this.handleResize();
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
            }
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            fc fcVar = this.orientationProperties;
            if (fcVar.f237a == parseBoolean) {
                int i = fcVar.b;
                int indexOf = fc.c.indexOf(str);
                if (indexOf == -1) {
                    indexOf = 2;
                }
                if (i == indexOf) {
                    return;
                }
            }
            fc fcVar2 = this.orientationProperties;
            fcVar2.f237a = parseBoolean;
            int indexOf2 = fc.c.indexOf(str);
            fcVar2.b = indexOf2 != -1 ? indexOf2 : 2;
            applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void setResizeProperties(Map<String, String> map) {
            boolean z;
            try {
                int parseInt = Integer.parseInt(map.get(ViewProps.WIDTH));
                int parseInt2 = Integer.parseInt(map.get(ViewProps.HEIGHT));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null && !Boolean.parseBoolean(str)) {
                    z = false;
                    this.resizeProperties = new ic(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
                }
                z = true;
                this.resizeProperties = new ic(parseInt, parseInt2, parseInt3, parseInt4, str2, z);
            } catch (Exception unused) {
                zh.a(this.webView, true, "mraid.fireErrorEvent", "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState) {
            this.mraidState = mraidState;
            if (mraidState != null) {
                zh.a(this.webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            }
        }

        @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
        public void useCustomClose(String str) {
            BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    private void addAdInformationLayout() {
        if (this.adInformationLayout == null && this.adInformationContatiner == null) {
            this.adInformationContatiner = new RelativeLayout(getContext());
            com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(getContext(), AdInformationConfig.ImageResourceType.INFO_S, AdPreferences.Placement.INAPP_BANNER, this.adHtml.getAdInfoOverride(), this.adHtml.getConsentData(), this.adHtml.getRequestUrl(), this.adHtml.getDParam(), this.adHtml.getErid(), this.adHtml.getEridUrl());
            this.adInformationLayout = aVar;
            aVar.a(this.adInformationContatiner);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.adInformationContatiner.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.adInformationContatiner);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.adInformationContatiner, layoutParams);
    }

    private void attachAdViewToContainer(View view, int i, int i2) {
        this.webViewContainer.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ph.a(getContext(), i), ph.a(getContext(), i2));
        layoutParams.addRule(13);
        this.webViewContainer.addView(view, layoutParams);
    }

    private void cancelViewabilityTracking() {
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.cancelViewabilityTracking();
        }
    }

    private void detachTwoPartMraidController() {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.twoPartWebView);
        }
        this.twoPartWebView.stopLoading();
        this.twoPartWebView = null;
    }

    private ViewGroup getAndMemoizeRootView() {
        if (this.rootView == null) {
            this.rootView = getTopmostView();
        }
        return this.rootView;
    }

    private long getImpressionDelayMillis() {
        Long l = this.adHtml.j;
        return l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.A().w());
    }

    private ViewGroup getTopmostView() {
        View rootView;
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.webViewContainer;
        View view = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (relativeLayout != null && (rootView = relativeLayout.getRootView()) != null && (view = rootView.findViewById(R.id.content)) == null) {
            view = rootView;
        }
        if (findViewById == null) {
            findViewById = view;
        }
        return findViewById instanceof ViewGroup ? (ViewGroup) findViewById : this.webViewContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCollapse() {
        a aVar = this.mraidController;
        if (aVar == null || aVar.getState() == MraidState.LOADING) {
            return;
        }
        MraidState state = this.mraidController.getState();
        MraidState mraidState = MraidState.HIDDEN;
        if (state == mraidState) {
            return;
        }
        if (this.mraidController.getState() == MraidState.RESIZED || this.mraidController.getState() == MraidState.EXPANDED) {
            if (this.mraidController.releaseTwoPart()) {
                detachTwoPartMraidController();
            } else {
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    closeableLayout.removeView(this.webView);
                }
                WebView webView = this.webView;
                if (webView != null) {
                    attachAdViewToContainer(webView, this.size.getWidth(), this.size.getHeight());
                }
                updateBannerView();
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null && closeableLayout2.getParent() != null && (closeableLayout2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) closeableLayout2.getParent()).removeView(closeableLayout2);
            }
            this.mraidController.setState(MraidState.DEFAULT);
        } else if (this.mraidController.getState() == MraidState.DEFAULT) {
            updateBannerView();
            this.mraidController.setState(mraidState);
        }
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCustomClose(boolean z) {
        if (this.closeableAdContainer == null || z == (!r0.a())) {
            return;
        }
        this.closeableAdContainer.setCloseVisible(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResize() {
        a aVar = this.mraidController;
        if (aVar == null) {
            return;
        }
        ic resizeProperties = aVar.getResizeProperties();
        if (resizeProperties == null) {
            zh.a(this.webView, true, "mraid.fireErrorEvent", "requires: setResizeProperties first", WebViewManager.EVENT_TYPE_RESIZE);
            return;
        }
        cancelReloadTask();
        if (this.mraidController.getState() == MraidState.LOADING || this.mraidController.getState() == MraidState.HIDDEN) {
            return;
        }
        if (this.mraidController.getState() == MraidState.EXPANDED) {
            zh.a(this.webView, true, "mraid.fireErrorEvent", "Not allowed to resize from an already expanded ad", WebViewManager.EVENT_TYPE_RESIZE);
            return;
        }
        int i = resizeProperties.f276a;
        int i2 = resizeProperties.b;
        int i3 = resizeProperties.c;
        int i4 = resizeProperties.d;
        int[] iArr = new int[2];
        this.webView.getLocationOnScreen(iArr);
        Context context = getContext();
        int b = ph.b(context, iArr[0]) + i3;
        int round = Math.round(iArr[1] / context.getResources().getDisplayMetrics().density) + i4;
        Rect rect = new Rect(b, round, i + b, i2 + round);
        ViewGroup topmostView = getTopmostView();
        int round2 = Math.round(topmostView.getWidth() / context.getResources().getDisplayMetrics().density);
        int round3 = Math.round(topmostView.getHeight() / context.getResources().getDisplayMetrics().density);
        topmostView.getLocationOnScreen(new int[2]);
        int round4 = Math.round(r8[0] / context.getResources().getDisplayMetrics().density);
        int round5 = Math.round(r8[1] / context.getResources().getDisplayMetrics().density);
        if (!resizeProperties.f) {
            if (rect.width() > round2 || rect.height() > round3) {
                zh.a(this.webView, true, "mraid.fireErrorEvent", "Not enough room for the ad", WebViewManager.EVENT_TYPE_RESIZE);
                return;
            }
            rect.offsetTo(clampInt(round4, rect.left, (round4 + round2) - rect.width()), clampInt(round5, rect.top, (round5 + round3) - rect.height()));
        }
        Rect rect2 = new Rect();
        try {
            CloseableLayout.ClosePosition a2 = CloseableLayout.ClosePosition.a(resizeProperties.e);
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.a(a2, rect, rect2);
            }
            if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                zh.a(this.webView, true, "mraid.fireErrorEvent", "The close region to appear within the max allowed size", WebViewManager.EVENT_TYPE_RESIZE);
                return;
            }
            if (!rect.contains(rect2)) {
                zh.a(this.webView, true, "mraid.fireErrorEvent", "The close region to appear within the max allowed size", WebViewManager.EVENT_TYPE_RESIZE);
                return;
            }
            this.closeableAdContainer.setCloseVisible(false);
            this.closeableAdContainer.setClosePosition(a2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = rect.left - round4;
            layoutParams.topMargin = rect.top - round5;
            if (this.mraidController.getState() == MraidState.DEFAULT) {
                RelativeLayout relativeLayout = this.webViewContainer;
                if (relativeLayout != null) {
                    relativeLayout.removeView(this.webView);
                    this.webViewContainer.setVisibility(4);
                }
                this.closeableAdContainer.addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
                getAndMemoizeRootView().addView(this.closeableAdContainer, layoutParams);
            } else if (this.mraidController.getState() == MraidState.RESIZED) {
                setCloseableAdContainerLayoutParams(layoutParams);
            }
            this.closeableAdContainer.setClosePosition(a2);
            this.mraidController.setState(MraidState.RESIZED);
        } catch (Exception e) {
            zh.a(this.webView, true, "mraid.fireErrorEvent", e.getMessage() != null ? e.getMessage() : "", WebViewManager.EVENT_TYPE_RESIZE);
        }
    }

    private boolean isEnoughSize() {
        return this.viewWidthDp >= ((double) this.size.getWidth()) && this.viewHeightDp >= ((double) this.size.getHeight());
    }

    private void loadHtml() {
        String str;
        l1 l1Var = this.adHtml;
        if (l1Var == null || this.webView == null || (str = l1Var.b) == null) {
            return;
        }
        if (!TextUtils.isEmpty(getAdTag())) {
            str = str.replaceAll("startapp_adtag_placeholder", getAdTag());
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.release();
            this.mraidController = null;
        }
        a aVar2 = new a(this.webView, new q1() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$$ExternalSyntheticLambda3
            @Override // com.startapp.sdk.internal.q1
            public final boolean a(String str2) {
                return BannerStandard.this.onMraidClickEvent(str2);
            }
        });
        this.mraidController = aVar2;
        aVar2.init();
        ((w6) this.eventTracer.a()).c(this, mh.B);
        attachAdViewToContainer(this.webView, this.size.getWidth(), this.size.getHeight());
        getContext();
        zh.a(this.webView, str);
        onAdLoadedToView();
    }

    private void onFailedToReceiveBanner(String str) {
        sendLoadError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onImpressionSent(String str) {
        ((w6) this.eventTracer.a()).c(this, mh.D);
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        u6.a("onImpression", bannerListener != null, str, null);
        e0.a(bannerListener != null ? new e1(context, bannerListener, this) : null);
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandDefault(FrameLayout.LayoutParams layoutParams, boolean z) {
        if (z) {
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.addView(this.twoPartWebView, layoutParams);
            }
        } else {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeView(this.webView);
                this.webViewContainer.setVisibility(4);
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null) {
                closeableLayout2.addView(this.webView, layoutParams);
            }
        }
        getAndMemoizeRootView().addView(this.closeableAdContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandResized(FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.webView);
        }
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this.webView, layoutParams);
            this.webViewContainer.setVisibility(4);
        }
        this.closeableAdContainer.addView(this.twoPartWebView, layoutParams);
    }

    private void onPause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onPause();
        }
    }

    private void onResume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    private void prepareWebView(WebView webView) {
        webView.setBackgroundColor(0);
        webView.setHorizontalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setOnTouchListener(new b(this));
        webView.setOnLongClickListener(new j1(this));
        webView.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proceedWithImpression() {
        ff ffVar = this.scheduledImpression;
        if (ffVar != null) {
            ffVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadImpl(String str) {
        if (this.adHtml != null) {
            Point adLoadingSize = getAdLoadingSize();
            this.adHtml.s = isFixedSize();
            l1 l1Var = this.adHtml;
            int i = adLoadingSize.x;
            int i2 = adLoadingSize.y;
            l1Var.c = i;
            l1Var.d = i2;
            l1Var.setState(Ad.AdState.UN_INITIALIZED);
            this.adHtml.t = getBannerType();
            ((w6) this.eventTracer.a()).a(this, this.adHtml);
            ((w6) this.eventTracer.a()).c(this, mh.z);
            this.adHtml.load(prepareAdPreferences(), this, str);
        }
    }

    private void reloadInnerAd(String str) {
        if (!waitForFinishAdSession()) {
            reloadImpl(str);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new c(this, str), MetaData.A().I());
        }
    }

    private void sendLoadError(String str) {
        setErrorMessage(str);
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        g1.a(getContext(), this.listener, this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseableAdContainerLayoutParams(FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.setLayoutParams(layoutParams);
        }
    }

    private boolean setSize(int i, int i2) {
        if (this.webView == null) {
            return false;
        }
        this.size = new BannerSize(i, i2);
        int a2 = ph.a(getContext(), this.size.getWidth());
        int a3 = ph.a(getContext(), this.size.getHeight());
        this.webViewContainer.setMinimumWidth(a2);
        this.webViewContainer.setMinimumHeight(a3);
        ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(a2, a3);
        } else {
            layoutParams.width = a2;
            layoutParams.height = a3;
        }
        this.webView.setLayoutParams(layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupTwoPartMraidController(String str) {
        this.webViewTouched = false;
        if (this.twoPartWebView == null) {
            this.twoPartWebView = ((uj) this.webViewFactory.a()).c();
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.initTwoPart(this.twoPartWebView);
        }
        prepareWebView(this.twoPartWebView);
        this.twoPartWebView.loadUrl(str);
    }

    private void startAdSession(WebView webView) {
        try {
            startAdSessionUnsafe(webView);
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    private void startAdSessionUnsafe(WebView webView) {
        ed edVar;
        synchronized (this.adSessionLock) {
            edVar = this.adSession;
            if (edVar == null) {
                edVar = new ed(webView);
                this.adSession = edVar;
                this.sessionStarted = true;
            }
        }
        AdSession adSession = edVar.f228a;
        if (adSession != null) {
            if (adSession != null) {
                adSession.start();
            }
            try {
                RelativeLayout relativeLayout = this.adInformationContatiner;
                if (relativeLayout != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    AdSession adSession2 = edVar.f228a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(relativeLayout, friendlyObstructionPurpose, null);
                    }
                }
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                    AdSession adSession3 = edVar.f228a;
                    if (adSession3 != null) {
                        adSession3.addFriendlyObstruction(closeableLayout, friendlyObstructionPurpose2, null);
                    }
                }
            } catch (RuntimeException unused) {
            }
            AdSession adSession4 = edVar.f228a;
            if (adSession4 != null) {
                adSession4.registerAdView(webView);
            }
            if (edVar.b != null && edVar.e.compareAndSet(false, true)) {
                edVar.b.loaded();
            }
            edVar.a();
        }
    }

    private void updateBannerView() {
        if (this.visible && isAdLoadedToView() && isEnoughSize()) {
            e0.a(new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BannerStandard.this.showBannerViewImpl();
                }
            });
        } else {
            e0.a(new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BannerStandard.this.hideBannerViewImpl();
                }
            });
        }
    }

    private boolean waitForFinishAdSession() {
        ed edVar;
        synchronized (this.adSessionLock) {
            edVar = this.adSession;
            this.adSession = null;
        }
        if (edVar == null) {
            return false;
        }
        try {
            AdSession adSession = edVar.f228a;
            if (adSession == null) {
                return true;
            }
            adSession.finish();
            return true;
        } catch (Throwable th) {
            n8.a(th);
            return false;
        }
    }

    protected void cancelScheduledImpression(String str) {
        ff ffVar = this.scheduledImpression;
        if (ffVar != null) {
            ffVar.a(str, null);
        }
    }

    int clampInt(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    protected void finalize() throws Throwable {
        try {
            cancelScheduledImpression("AD_CLOSED_TOO_QUICKLY");
            waitForFinishAdSession();
        } finally {
            super.finalize();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected Point getAdLoadingSize() {
        Point point = this.desirableSizeForManualLoading;
        return point != null ? point : super.getAdLoadingSize();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected String getBannerName() {
        return "StartApp Banner";
    }

    protected int getBannerType() {
        return 0;
    }

    public String getBidToken() {
        l1 l1Var = this.adHtml;
        if (l1Var != null) {
            return zh.a(l1Var.b, "@bidToken@", "@bidToken@");
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getHeightInDp() {
        return 50;
    }

    protected int getOffset() {
        l1 l1Var = this.adHtml;
        if (l1Var == null) {
            return 0;
        }
        return l1Var.r;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected long getRefreshDelayMillis() {
        long I;
        synchronized (this.adSessionLock) {
            I = this.adSession != null ? MetaData.A().I() : 0L;
        }
        return I;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getRefreshRate() {
        return this.options.i();
    }

    public WebView getTwoPartWebView() {
        return this.twoPartWebView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected View getViewableBanner() {
        RelativeLayout relativeLayout = this.webViewContainer;
        return relativeLayout != null ? relativeLayout : super.getViewableBanner();
    }

    public WebView getWebView() {
        return this.webView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getWidthInDp() {
        return 320;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.visible = false;
        updateBannerView();
    }

    protected void hideBannerViewImpl() {
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void initRuntime() {
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.closeableAdContainer = closeableLayout;
            closeableLayout.setOnCloseListener(new a3() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$$ExternalSyntheticLambda2
                @Override // com.startapp.sdk.internal.a3
                public final void a() {
                    BannerStandard.this.handleCollapse();
                }
            });
            this.webView = ((uj) this.webViewFactory.a()).c();
            this.options = new BannerOptions();
            if (this.adHtml == null) {
                this.adHtml = new l1(context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoDownloader, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
            }
            prepareWebView(this.webView);
            this.options = BannerMetaData.c().b();
            setMinimumWidth(ph.a(getContext(), this.size.getWidth()));
            setMinimumHeight(ph.a(getContext(), this.size.getHeight()));
            WebView webView = this.webView;
            Context context2 = getContext();
            k1 k1Var = new k1(this);
            TrackingParams trackingParams = new TrackingParams(getAdTag());
            boolean a2 = this.adHtml.a(0);
            ja jaVar = new ja(context2, k1Var, trackingParams);
            jaVar.b = a2;
            webView.addJavascriptInterface(jaVar, "startappwall");
            this.webViewContainer = new RelativeLayout(getContext());
            updateBannerView();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.webViewContainer, layoutParams);
        } catch (Throwable th) {
            n8.a(th);
            hideBanner();
            onFailedToReceiveBanner("BannerStandard.init - webview failed");
        }
    }

    protected boolean isFixedSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected boolean isTiedToAdm() {
        l1 l1Var = this.adHtml;
        return l1Var != null && l1Var.isTiedToAdm();
    }

    protected void makeImpression(boolean z) {
        long max = Math.max(0L, getImpressionDelayMillis() - getTimePassedSinceAdLoadedToViewMillis());
        getContext();
        WeakHashMap weakHashMap = zh.f528a;
        Log.println(2, "StartAppSDK", "Banner will send impression in " + max + " millis");
        TrackingParams trackingParams = new TrackingParams(getAdTag());
        trackingParams.a(z);
        MraidMetadata G = MetaData.A().G();
        ff ffVar = new ff(getContext(), AdPreferences.Placement.INAPP_BANNER, this.adHtml.i, trackingParams, max, z && G != null && zh.a(G.a()), this.impressionListener);
        this.scheduledImpression = ffVar;
        startVisibilityRunnable(ffVar);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ((w6) this.eventTracer.a()).a((Object) this, mh.e);
        super.onAttachedToWindow();
        if (this.callLoadHtmlOnAttached) {
            this.callLoadHtmlOnAttached = false;
            loadHtml();
        }
        onResume();
        if (this.defaultLoad && !isAdLoadedToView()) {
            loadBanner(null);
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.addVisibilityTracker();
        }
        if (this.webView != null) {
            synchronized (this.adSessionLock) {
                if (this.sessionStarted) {
                    startAdSession(this.webView);
                }
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        waitForFinishAdSession();
        onPause();
        cancelViewabilityTracking();
        ((w6) this.eventTracer.a()).c(this, mh.E);
        ((w6) this.eventTracer.a()).b(this, mh.e);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        ((w6) this.eventTracer.a()).c(this, mh.g);
        ((w6) this.eventTracer.a()).b(this, mh.c);
        onFailedToReceiveBanner(ad != null ? ad.getErrorMessage() : null);
    }

    public boolean onMraidClickEvent(String str) {
        if (!this.webViewTouched) {
            n8 n8Var = new n8(o8.e);
            n8Var.d = "fake_click";
            n8Var.g = e0.a(str, (String) null);
            n8Var.e = "jsTag=" + this.jsTag;
            n8Var.a();
        }
        if ((!this.jsTag || this.webViewTouched) && str != null) {
            return handleClick(str);
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        String str;
        ((w6) this.eventTracer.a()).c(this, mh.f);
        ((w6) this.eventTracer.a()).b(this, mh.c);
        this.webViewTouched = false;
        removeView(this.adInformationContatiner);
        l1 l1Var = this.adHtml;
        if (l1Var == null || (str = l1Var.b) == null || str.compareTo("") == 0) {
            onFailedToReceiveBanner("No Banner received");
            return;
        }
        this.jsTag = "true".equals(zh.a(this.adHtml.b, "@jsTag@", "@jsTag@"));
        String a2 = zh.a(this.adHtml.b, "@width@", "@width@");
        String a3 = zh.a(this.adHtml.b, "@height@", "@height@");
        if (a2 != null && a3 != null) {
            try {
                if (!setSize(Integer.parseInt(a2), Integer.parseInt(a3))) {
                    onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
                    return;
                }
            } catch (NumberFormatException unused) {
                onFailedToReceiveBanner("Error parsing width and height from HTML: " + a2 + " x " + a3);
                return;
            } catch (Throwable th) {
                n8.a(th);
                onFailedToReceiveBanner(th.getMessage());
                return;
            }
        }
        if (isAttachedToWindow()) {
            loadHtml();
        } else {
            this.callLoadHtmlOnAttached = true;
        }
        addAdInformationLayout();
        addDisplayEventOnLoad();
        updateBannerView();
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        String[] strArr = this.adHtml.i;
        g1.b(context, bannerListener, this, e0.a(strArr.length <= 0 ? null : strArr[0], (String) null));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.viewWidthDp = Math.ceil(i / displayMetrics.density);
        this.viewHeightDp = Math.ceil(i2 / displayMetrics.density);
        updateBannerView();
    }

    protected void onWebviewPageFinished(WebView webView) {
        if (MetaData.A().d0()) {
            startAdSession(webView);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            onResume();
        } else {
            onPause();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void reload(String str) {
        ((w6) this.eventTracer.a()).a((Object) this, mh.c);
        reloadInnerAd(str);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void scheduleReloadTask() {
        ff ffVar = this.scheduledImpression;
        if (ffVar == null || ffVar.j.get() == 0) {
            return;
        }
        super.scheduleReloadTask();
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        try {
            ((xe) this.runtimeClassDetector.a()).a(2048);
        } catch (Throwable unused) {
        }
        this.visible = true;
        updateBannerView();
    }

    protected void showBannerViewImpl() {
        if (isEnoughSize()) {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.adHtml != null) {
                yf yfVar = (yf) this.showIntentionsKeeper.a();
                AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                int bannerType = getBannerType();
                String a2 = zh.a(this.adHtml.b, "@adId@", "@adId@");
                if (a2 != null) {
                    yfVar.f511a.put(new xf(placement, bannerType), a2);
                }
            }
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #2 {all -> 0x012b, blocks: (B:26:0x00a0, B:29:0x00af, B:34:0x00b8, B:42:0x00f4, B:53:0x00f9, B:55:0x0101), top: B:23:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean handleClick(String str) {
        boolean z;
        boolean z2;
        String[] strArr;
        Boolean bool;
        String a2 = e0.a(str, (String) null);
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        u6.a("onClicked", bannerListener != null, a2, null);
        e0.a(bannerListener == null ? null : new f1(context, bannerListener, this));
        cancelScheduledImpression(null);
        cancelViewabilityTracking();
        Context context2 = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean a3 = e0.a(context2);
        l1 l1Var = this.adHtml;
        String[] strArr2 = l1Var.g;
        String[] strArr3 = l1Var.f492a;
        if (!this.jsTag && str.contains("index=")) {
            try {
                String[] split = str.split("&");
                int parseInt = Integer.parseInt(split[split.length - 1].split("=")[1]);
                if (parseInt < 0) {
                    n8 n8Var = new n8(o8.e);
                    n8Var.d = "Wrong index extracted from URL";
                    n8Var.e = "adId: " + zh.a(this.adHtml.b, "@adId@", "@adId@");
                    n8Var.a();
                    return false;
                }
                l1 l1Var2 = this.adHtml;
                try {
                    if (parseInt >= 0) {
                        boolean[] zArr = l1Var2.h;
                        if (parseInt < zArr.length) {
                            z2 = zArr[parseInt];
                            if (z2 || a3) {
                                Context context3 = getContext();
                                if (parseInt >= strArr2.length) {
                                    strArr = new String[1];
                                    z = false;
                                    try {
                                        strArr[0] = strArr2[parseInt];
                                    } catch (Throwable th) {
                                        th = th;
                                        n8.a(th);
                                        return z;
                                    }
                                } else {
                                    z = false;
                                    strArr = null;
                                }
                                e0.a(context3, str, strArr, new TrackingParams(getAdTag()), (this.adHtml.a(parseInt) || a3) ? z : true, false);
                            } else {
                                Context context4 = getContext();
                                String[] strArr4 = parseInt < strArr2.length ? new String[]{strArr2[parseInt]} : null;
                                String str2 = parseInt < strArr3.length ? strArr3[parseInt] : null;
                                TrackingParams trackingParams = new TrackingParams(getAdTag());
                                long y = AdsCommonMetaData.k().y();
                                long x = AdsCommonMetaData.k().x();
                                boolean a4 = this.adHtml.a(parseInt);
                                Boolean[] boolArr = this.adHtml.o;
                                if (boolArr != null && parseInt >= 0) {
                                    try {
                                        if (parseInt < boolArr.length) {
                                            bool = boolArr[parseInt];
                                            e0.a(context4, str, strArr4, str2, trackingParams, y, x, a4, bool, false, null);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                        n8.a(th);
                                        return z;
                                    }
                                }
                                bool = null;
                                e0.a(context4, str, strArr4, str2, trackingParams, y, x, a4, bool, false, null);
                            }
                        }
                    } else {
                        l1Var2.getClass();
                    }
                    if (z2) {
                    }
                    Context context32 = getContext();
                    if (parseInt >= strArr2.length) {
                    }
                    e0.a(context32, str, strArr, new TrackingParams(getAdTag()), (this.adHtml.a(parseInt) || a3) ? z : true, false);
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
                z2 = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
        } else {
            if (strArr2.length < 1) {
                n8 n8Var2 = new n8(o8.e);
                n8Var2.d = "No tracking URLs";
                n8Var2.e = "adId: " + zh.a(this.adHtml.b, "@adId@", "@adId@");
                n8Var2.a();
                return false;
            }
            boolean[] zArr2 = this.adHtml.h;
            if (!(zArr2.length <= 0 ? false : zArr2[0]) || a3) {
                e0.a(getContext(), str, new String[]{strArr2[0]}, new TrackingParams(getAdTag()), this.adHtml.a(0) && !a3, false);
            } else {
                if (strArr3.length < 1) {
                    n8 n8Var3 = new n8(o8.e);
                    n8Var3.d = "No package names";
                    n8Var3.e = "adId: " + zh.a(this.adHtml.b, "@adId@", "@adId@");
                    n8Var3.a();
                    return false;
                }
                Context context5 = getContext();
                String[] strArr5 = {strArr2[0]};
                String str3 = strArr3[0];
                TrackingParams trackingParams2 = new TrackingParams(getAdTag());
                long y2 = AdsCommonMetaData.k().y();
                long x2 = AdsCommonMetaData.k().x();
                boolean a5 = this.adHtml.a(0);
                Boolean[] boolArr2 = this.adHtml.o;
                e0.a(context5, str, strArr5, str3, trackingParams2, y2, x2, a5, (boolArr2 == null || boolArr2.length <= 0) ? null : boolArr2[0], false, null);
            }
        }
        this.webView.stopLoading();
        setClicked(true);
        return true;
    }

    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z, AdPreferences adPreferences) {
        this(context, z, adPreferences, null);
    }

    public BannerStandard(Context context, boolean z, AdPreferences adPreferences, l1 l1Var) {
        this(context, null, 0, z, adPreferences, l1Var);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i, boolean z, AdPreferences adPreferences, l1 l1Var) {
        this(context, attributeSet, i, z, adPreferences, l1Var, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).i, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).S, com.startapp.sdk.components.a.a(context).f160a, com.startapp.sdk.components.a.a(context).m, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).w, com.startapp.sdk.components.a.a(context).b, com.startapp.sdk.components.a.a(context).u, com.startapp.sdk.components.a.a(context).k);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i, boolean z, AdPreferences adPreferences, l1 l1Var, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, pa paVar10, pa paVar11) {
        super(context, attributeSet, i, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9, paVar10, paVar11);
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.size = new BannerSize(getWidthInDp(), getHeightInDp());
        this.callbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        this.adSessionLock = new Object();
        this.impressionListener = new com.startapp.sdk.ads.banner.bannerstandard.a(this);
        try {
            this.defaultLoad = z;
            this.adHtml = l1Var;
            setAdPreferences(adPreferences);
            init();
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, true, null, null);
    }
}

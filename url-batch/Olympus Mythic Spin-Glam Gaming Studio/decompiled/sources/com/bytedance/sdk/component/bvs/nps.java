package com.bytedance.sdk.component.bvs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.bvs.zmn;
import com.bytedance.sdk.component.utils.uqh;
import com.bytedance.sdk.component.utils.zak;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class nps extends FrameLayout {
    private static fb vlj;
    private float am;
    private WebViewClient bjh;
    private String btk;
    private float bvs;
    private View cn;
    private zmn.InterfaceC0128zmn cyb;
    private long dgt;
    private boolean doe;
    private fs ev;
    private com.bytedance.sdk.component.bvs.fs.zmn fb;
    private AttributeSet fkt;
    public int fs;
    private Context hgd;
    private JSONObject hhw;
    private boolean iqz;
    private long iv;
    private btk jy;
    private List<String> kgc;
    private com.bytedance.sdk.component.bvs.btk kjb;
    private long klz;
    private com.bytedance.sdk.component.bvs.fb kw;
    private boolean mw;
    private boolean nps;
    private boolean nqi;
    private AtomicBoolean nu;
    private com.bytedance.sdk.component.bvs.zmn olo;
    private AtomicBoolean oub;
    private boolean phc;
    private long rc;
    private zn rp;
    private volatile WebView rt;
    private int so;
    private uqh tf;
    private boolean uqh;
    private AtomicBoolean ww;
    private float yj;
    private long yof;
    private float zak;
    private float zg;
    public int zmn;
    public int zn;

    public interface btk {
    }

    public interface fb {
        WebView zmn(Context context, AttributeSet attributeSet, int i, zn znVar);
    }

    public interface fs {
    }

    private static Context zmn(Context context) {
        return context;
    }

    private static void zn(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/bvs/nps;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.u, this, motionEvent);
        return safedk_nps_dispatchTouchEvent_212c51ffcc33fb785b10f22596a2f36d(motionEvent);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public com.bytedance.sdk.component.bvs.fs.zmn getMaterialMeta() {
        return this.fb;
    }

    public boolean k_() {
        return this.iqz;
    }

    public void setLpPreRender(boolean z) {
        this.iqz = z;
    }

    public boolean fs() {
        return this.phc;
    }

    public void setPreStart(boolean z) {
        this.phc = z;
    }

    public boolean zn() {
        return this.doe;
    }

    public void setPreFinish(boolean z) {
        this.doe = z;
    }

    public boolean fb() {
        return this.nqi;
    }

    public void setPreProgressHundred(boolean z) {
        this.nqi = z;
    }

    public void setPreError(boolean z) {
        this.uqh = z;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.bvs.fs.zmn zmnVar) {
        this.fb = zmnVar;
    }

    @Override // android.view.View
    public String getTag() {
        return this.btk;
    }

    public void setTag(String str) {
        this.btk = str;
        com.bytedance.sdk.component.bvs.zmn zmnVar = this.olo;
        if (zmnVar != null) {
            zmnVar.zmn(str);
        }
        com.bytedance.sdk.component.bvs.fb fbVar = this.kw;
        if (fbVar != null) {
            fbVar.zmn(str);
        }
    }

    public void setLandingPage(boolean z) {
        this.nps = z;
    }

    public void setTouchStateListener(btk btkVar) {
        this.jy = btkVar;
    }

    public zn getScene() {
        return this.rp;
    }

    public nps(Context context, zn znVar) {
        this(zmn(context), false, znVar);
    }

    public nps(Context context, boolean z, zn znVar) {
        super(zmn(context));
        this.zg = 0.0f;
        this.bvs = 0.0f;
        this.iv = 0L;
        this.rc = 0L;
        this.klz = 0L;
        this.mw = false;
        this.zak = 20.0f;
        this.yj = 50.0f;
        this.nu = new AtomicBoolean();
        this.ww = new AtomicBoolean();
        this.oub = new AtomicBoolean();
        this.hgd = context;
        this.rp = znVar;
        if (z) {
            return;
        }
        try {
            this.rt = zmn((AttributeSet) null, 0);
            hhw();
        } catch (Throwable unused) {
        }
        fs(zmn(context));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void zmn(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.rt != null && (this.rt instanceof hhw)) {
            this.olo = new com.bytedance.sdk.component.bvs.zmn(this.hgd, i, i2, list, i3);
            this.kgc = list2;
            if (!TextUtils.isEmpty(this.btk)) {
                this.olo.zmn(this.btk);
            }
            ((hhw) this.rt).setTouchListenerProxy(this.olo);
            this.cyb = this.olo.zmn();
        }
    }

    public void zmn(int i, long j) {
        if (this.rt == null || !(this.rt instanceof hhw)) {
            return;
        }
        this.kw = new com.bytedance.sdk.component.bvs.fb(this.hgd, this.olo, i, j, this);
        if (!TextUtils.isEmpty(this.btk)) {
            this.kw.zmn(this.btk);
        }
        ((hhw) this.rt).setTouchListenerProxy(this.kw);
    }

    public void zmn(boolean z, View view) {
        if (z) {
            this.cn = view;
            view.setVisibility(8);
            View view2 = this.cn;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.cn, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public View getArbitrageLoadingView() {
        return this.cn;
    }

    public void setWebView(WebView webView) {
        this.rt = webView;
    }

    public void btk() {
        try {
            if (this.rt == null) {
                this.rt = zmn(this.fkt, 0);
            }
            hhw();
            fs(zmn(this.hgd));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void setWebViewProvider(fb fbVar) {
        vlj = fbVar;
    }

    private WebView zmn(AttributeSet attributeSet, int i) {
        fb fbVar = vlj;
        if (fbVar != null) {
            return fbVar.zmn(getContext(), attributeSet, i, this.rp);
        }
        if (attributeSet == null) {
            return new WebView(zmn(this.hgd));
        }
        return new WebView(zmn(this.hgd), attributeSet);
    }

    public void setRecycler(boolean z) {
        if (this.rt == null || !(this.rt instanceof hhw)) {
            return;
        }
        ((hhw) this.rt).setRecycler(z);
    }

    public void hhw() {
        if (this.rt != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.rt.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.rt, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void fs(Context context) {
        zn(context);
        kw();
        kgc();
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.rt.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    @TargetApi(19)
    public void zmn(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadUrl(this.rt, str, map);
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadUrl(this.rt, str);
        } catch (Throwable unused) {
        }
    }

    public void zmn(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadDataWithBaseURL(this.rt, str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void nps() {
        try {
            this.rt.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public boolean zg() {
        if (this.rt == null) {
            return false;
        }
        try {
            return this.rt.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void bvs() {
        try {
            this.rt.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean iv() {
        if (this.rt == null) {
            return false;
        }
        try {
            return this.rt.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void rc() {
        try {
            this.rt.goForward();
        } catch (Throwable unused) {
        }
    }

    public void klz() {
        if (this.rt != null) {
            this.rt.onResume();
        }
    }

    public String getUrl() {
        if (this.rt == null) {
            return null;
        }
        try {
            return this.rt.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getOriginalUrl() {
        String url;
        if (this.rt == null) {
            return null;
        }
        try {
            String originalUrl = this.rt.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith(n.b) || (url = this.rt.getUrl()) == null) ? originalUrl : url.startsWith("file://") ? url : originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.rt == null) {
            return 0;
        }
        try {
            return this.rt.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public int getContentHeight() {
        if (this.rt == null) {
            return 0;
        }
        try {
            return this.rt.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public void zmn(boolean z) {
        try {
            this.rt.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    public void mw() {
        try {
            this.rt.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof btk) {
                setTouchStateListener((btk) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new zmn();
            }
            this.bjh = webViewClient;
            this.rt.setWebViewClient(new zg(this.cyb, webViewClient, this.kgc));
        } catch (Throwable unused) {
        }
    }

    public WebViewClient getWebViewClient() {
        return this.bjh;
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.rt.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.rt.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.rt.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.rt == null) {
            return;
        }
        try {
            this.rt.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent zmn2;
        try {
            zmn(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.mw && (zmn2 = zmn(this)) != null) {
                zmn2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.mw = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent zmn(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (fs(view2) || zn(view2)) ? parent : zmn(view2);
    }

    private static boolean fs(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean zn(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            if (this.rt != null) {
                this.rt.setLayerType(i, paint);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            if (this.rt != null) {
                this.rt.setOverScrollMode(i);
            }
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    private void kgc() {
        if (this.rt == null) {
            return;
        }
        try {
            this.rt.removeJavascriptInterface("searchBoxJavaBridge_");
            this.rt.removeJavascriptInterface("accessibility");
            this.rt.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void zmn(Object obj, String str) {
        try {
            PangleNetworkBridge.webviewAddJavascriptInterface(this.rt, obj, str);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.rt.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.rt.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.rt.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    private void kw() {
        try {
            WebSettings settings = this.rt.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.rt.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void rt() {
        if (this.rt == null) {
            return;
        }
        try {
            this.rt.onPause();
        } catch (Throwable unused) {
        }
    }

    public boolean safedk_nps_dispatchTouchEvent_212c51ffcc33fb785b10f22596a2f36d(MotionEvent p0) {
        try {
            return super.dispatchTouchEvent(p0);
        } catch (Exception unused) {
            return false;
        }
    }

    public String getUserAgentString() {
        if (this.rt == null) {
            return "";
        }
        try {
            return this.rt.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.rt;
    }

    public void cn() {
        if (this.rt == null) {
            return;
        }
        zn znVar = this.rp;
        if (znVar != zn.ADS && znVar != zn.ADS_V3 && znVar != zn.ADS_V4) {
            zak.zmn(this);
        } else {
            try {
                this.rt.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public void b_(String str) {
        try {
            this.rt.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            this.rt.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.rt.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.rt.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.rt.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.rt.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.rt.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.rt.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.rt.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.rt.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.rt.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setMixedContentMode(int i) {
        try {
            this.rt.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.rt.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            if (this.rt != null) {
                this.rt.setVisibility(i);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.rt.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.rt.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void cyb() {
        try {
            this.rt.clearView();
        } catch (Throwable unused) {
        }
    }

    public void olo() {
        try {
            this.rt.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.rt.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    private void iqz() {
        if (this.tf == null) {
            this.oub.set(false);
            this.tf = new uqh(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.bvs.nps.1
        };
        this.oub.set(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.nu.set(true);
        if (!this.ww.get() || this.oub.get()) {
            return;
        }
        iqz();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.nu.set(false);
    }

    public long getLandingPageClickBegin() {
        return this.yof;
    }

    public void setLandingPageClickBegin(long j) {
        this.yof = j;
    }

    public long getLandingPageClickEnd() {
        return this.dgt;
    }

    public void setLandingPageClickEnd(long j) {
        this.dgt = j;
    }

    private void zmn(MotionEvent motionEvent) {
        if (!this.nps || this.fb == null) {
            return;
        }
        if ((this.btk == null && this.hhw == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zg = motionEvent.getRawX();
                this.bvs = motionEvent.getRawY();
                this.iv = System.currentTimeMillis();
                this.hhw = new JSONObject();
                if (this.rt != null) {
                    this.yof = this.iv;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.hhw.put("start_x", String.valueOf(this.zg));
                this.hhw.put("start_y", String.valueOf(this.bvs));
                this.hhw.put("offset_x", String.valueOf(motionEvent.getRawX() - this.zg));
                this.hhw.put("offset_y", String.valueOf(motionEvent.getRawY() - this.bvs));
                this.hhw.put("url", String.valueOf(getUrl()));
                this.hhw.put("tag", "");
                this.rc = System.currentTimeMillis();
                if (this.rt != null) {
                    this.dgt = this.rc;
                }
                this.hhw.put("down_time", this.iv);
                this.hhw.put("up_time", this.rc);
                if (com.bytedance.sdk.component.bvs.zmn.zmn.zmn().fs() != null) {
                    long j = this.klz;
                    long j2 = this.iv;
                    if (j != j2) {
                        this.klz = j2;
                        com.bytedance.sdk.component.bvs.zmn.zmn.zmn().fs().zmn(this.fb, this.btk, "in_web_click", this.hhw, this.rc - this.iv);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.zak = f;
    }

    public void setDeepShakeValue(float f) {
        this.am = f;
    }

    public void setWriggleValue(float f) {
        this.yj = f;
    }

    public void setCalculationMethod(int i) {
        this.so = i;
    }

    public void setOnShakeListener(fs fsVar) {
        this.ev = fsVar;
    }

    public static class zmn extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.u, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.bvs.nps.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public enum zn {
        ADS("ads"),
        ADS_V3("ads_v3"),
        ADS_V4("ads_v4"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT("ua"),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String rt;

        zn(String str) {
            this.rt = str;
        }
    }

    public void setWebTouchProxy(com.bytedance.sdk.component.bvs.btk btkVar) {
        this.kjb = btkVar;
        if (this.rt instanceof hhw) {
            ((hhw) this.rt).setWebEventProxy(btkVar);
        }
    }
}

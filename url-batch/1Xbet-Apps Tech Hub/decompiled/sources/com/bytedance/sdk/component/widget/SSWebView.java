package com.bytedance.sdk.component.widget;

import android.content.Context;
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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.rCZ;
import com.bytedance.sdk.component.widget.pvs;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SSWebView extends FrameLayout {
    private static vG Gp;
    private Jd CvL;
    private com.bytedance.sdk.component.widget.pvs IP;
    private boolean Jd;
    private pvs.InterfaceC0058pvs Ju;
    private long Mxy;
    private float NB;
    private AttributeSet OT;
    private boolean Wyp;
    private AtomicBoolean ZhG;
    private long ae;
    private List<String> bNS;
    private float cR;
    private AtomicBoolean dX;
    private AtomicBoolean dyT;
    private long gA;
    private String icD;
    private View kj;
    private float mnm;
    private Context ny;
    private com.bytedance.sdk.component.widget.icD.pvs pvs;
    private volatile WebView qh;
    private rCZ rCZ;
    private float sUS;
    private long so;
    private icD uc;
    private float vA;
    private JSONObject vG;
    private long yiw;
    private int zM;

    public interface Jd {
    }

    public interface icD {
    }

    public interface vG {
        WebView createWebView(Context context, AttributeSet attributeSet, int i);
    }

    private static Context pvs(Context context) {
        return context;
    }

    private static void vG(Context context) {
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public com.bytedance.sdk.component.widget.icD.pvs getMaterialMeta() {
        return this.pvs;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.widget.icD.pvs pvsVar) {
        this.pvs = pvsVar;
    }

    @Override // android.view.View
    public String getTag() {
        return this.icD;
    }

    public void setTag(String str) {
        this.icD = str;
        com.bytedance.sdk.component.widget.pvs pvsVar = this.IP;
        if (pvsVar != null) {
            pvsVar.pvs(str);
        }
    }

    public void setLandingPage(boolean z) {
        this.Jd = z;
    }

    public void setTouchStateListener(Jd jd) {
        this.CvL = jd;
    }

    public SSWebView(Context context) {
        this(pvs(context), false);
    }

    public SSWebView(Context context, boolean z) {
        super(pvs(context));
        this.NB = 0.0f;
        this.sUS = 0.0f;
        this.yiw = 0L;
        this.so = 0L;
        this.Mxy = 0L;
        this.Wyp = false;
        this.mnm = 20.0f;
        this.cR = 50.0f;
        this.ZhG = new AtomicBoolean();
        this.dyT = new AtomicBoolean();
        this.dX = new AtomicBoolean();
        this.ny = context;
        if (z) {
            return;
        }
        try {
            this.qh = pvs((AttributeSet) null, 0);
            icD();
        } catch (Throwable unused) {
        }
        icD(pvs(context));
    }

    public void pvs(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.qh != null && (this.qh instanceof PangleWebView)) {
            this.IP = new com.bytedance.sdk.component.widget.pvs(this.ny, i, i2, list, i3);
            this.bNS = list2;
            if (!TextUtils.isEmpty(this.icD)) {
                this.IP.pvs(this.icD);
            }
            ((PangleWebView) this.qh).setArbitrageTouchListener(this.IP);
            this.Ju = this.IP.pvs();
        }
    }

    public void pvs(boolean z, View view) {
        if (z) {
            this.kj = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.kj, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public View getArbitrageLoadingView() {
        return this.kj;
    }

    public void g_() {
        try {
            this.qh = pvs(this.OT, 0);
            icD();
            icD(pvs(this.ny));
        } catch (Throwable th) {
            Ju.pvs("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    public static void setWebViewProvider(vG vGVar) {
        Gp = vGVar;
    }

    private WebView pvs(AttributeSet attributeSet, int i) {
        vG vGVar = Gp;
        if (vGVar != null) {
            return vGVar.createWebView(getContext(), attributeSet, i);
        }
        if (attributeSet == null) {
            return new WebView(pvs(this.ny));
        }
        return new WebView(pvs(this.ny), attributeSet);
    }

    public void setRecycler(boolean z) {
        if (this.qh == null || !(this.qh instanceof PangleWebView)) {
            return;
        }
        ((PangleWebView) this.qh).setRecycler(z);
    }

    public void icD() {
        if (this.qh != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.qh.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.qh, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void icD(Context context) {
        vG(context);
        mnm();
        bNS();
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.qh.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void pvs(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.qh.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.qh.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void pvs(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.qh.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void vG() {
        try {
            this.qh.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void Jd() {
        try {
            this.qh.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean NB() {
        if (this.qh == null) {
            return false;
        }
        try {
            return this.qh.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void sUS() {
        try {
            this.qh.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean yiw() {
        if (this.qh == null) {
            return false;
        }
        try {
            return this.qh.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void so() {
        try {
            this.qh.goForward();
        } catch (Throwable unused) {
        }
    }

    public void Mxy() {
        if (this.qh != null) {
            this.qh.onResume();
        }
    }

    public String getUrl() {
        if (this.qh == null) {
            return null;
        }
        try {
            return this.qh.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getOriginalUrl() {
        String url;
        if (this.qh == null) {
            return null;
        }
        try {
            String originalUrl = this.qh.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.qh.getUrl()) == null) ? originalUrl : url.startsWith("file://") ? url : originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.qh == null) {
            return 0;
        }
        try {
            return this.qh.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public int getContentHeight() {
        if (this.qh == null) {
            return 0;
        }
        try {
            return this.qh.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public void pvs(boolean z) {
        try {
            this.qh.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    public void Wyp() {
        try {
            this.qh.clearHistory();
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
            if (webViewClient instanceof Jd) {
                setTouchStateListener((Jd) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new pvs();
            }
            this.qh.setWebViewClient(new com.bytedance.sdk.component.widget.vG(this.Ju, webViewClient, this.bNS));
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.qh.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.qh.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.qh.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent pvs2;
        try {
            pvs(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.Wyp && (pvs2 = pvs(this)) != null) {
                pvs2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.Wyp = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent pvs(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (icD(view2) || vG(view2)) ? parent : pvs(view2);
    }

    private static boolean icD(View view) {
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

    private static boolean vG(View view) {
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
            this.qh.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.qh.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    private void bNS() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.removeJavascriptInterface("searchBoxJavaBridge_");
            this.qh.removeJavascriptInterface("accessibility");
            this.qh.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public void pvs(Object obj, String str) {
        try {
            this.qh.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.qh.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.qh.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.qh.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    private void mnm() {
        try {
            WebSettings settings = this.qh.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.qh.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equals("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void qh() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.onPause();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getUserAgentString() {
        if (this.qh == null) {
            return "";
        }
        try {
            return this.qh.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.qh;
    }

    public void kj() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.destroy();
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.qh.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.qh.getSettings().setAppCacheEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            this.qh.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.qh.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.qh.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.qh.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.qh.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.qh.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.qh.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.qh.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.qh.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.qh.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setMixedContentMode(int i) {
        try {
            this.qh.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.qh.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.qh.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.qh.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.qh.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void Ju() {
        try {
            this.qh.clearView();
        } catch (Throwable unused) {
        }
    }

    public void IP() {
        try {
            this.qh.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.qh.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    private void vA() {
        if (this.rCZ == null) {
            this.dX.set(false);
            this.rCZ = new rCZ(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.widget.SSWebView.1
        };
        this.dX.set(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ZhG.set(true);
        if (!this.dyT.get() || this.dX.get()) {
            return;
        }
        vA();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ZhG.set(false);
    }

    public long getLandingPageClickBegin() {
        return this.ae;
    }

    public void setLandingPageClickBegin(long j) {
        this.ae = j;
    }

    public long getLandingPageClickEnd() {
        return this.gA;
    }

    public void setLandingPageClickEnd(long j) {
        this.gA = j;
    }

    private void pvs(MotionEvent motionEvent) {
        if (!this.Jd || this.pvs == null) {
            return;
        }
        if ((this.icD == null && this.vG == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.NB = motionEvent.getRawX();
                this.sUS = motionEvent.getRawY();
                this.yiw = System.currentTimeMillis();
                this.vG = new JSONObject();
                if (this.qh != null) {
                    this.ae = this.yiw;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.vG.put("start_x", String.valueOf(this.NB));
                this.vG.put("start_y", String.valueOf(this.sUS));
                this.vG.put("offset_x", String.valueOf(motionEvent.getRawX() - this.NB));
                this.vG.put("offset_y", String.valueOf(motionEvent.getRawY() - this.sUS));
                this.vG.put(ImagesContract.URL, String.valueOf(getUrl()));
                this.vG.put("tag", "");
                this.so = System.currentTimeMillis();
                if (this.qh != null) {
                    this.gA = this.so;
                }
                this.vG.put("down_time", this.yiw);
                this.vG.put("up_time", this.so);
                if (com.bytedance.sdk.component.widget.pvs.pvs.pvs().icD() != null) {
                    long j = this.Mxy;
                    long j2 = this.yiw;
                    if (j != j2) {
                        this.Mxy = j2;
                        com.bytedance.sdk.component.widget.pvs.pvs.pvs().icD().pvs(this.pvs, this.icD, "in_web_click", this.vG, this.so - this.yiw);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.mnm = f;
    }

    public void setDeepShakeValue(float f) {
        this.vA = f;
    }

    public void setWriggleValue(float f) {
        this.cR = f;
    }

    public void setCalculationMethod(int i) {
        this.zM = i;
    }

    public void setOnShakeListener(icD icd) {
        this.uc = icd;
    }

    public static class pvs extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.widget.SSWebView.pvs.1
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
}

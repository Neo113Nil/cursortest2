package com.bytedance.sdk.component.bvs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.bvs.nps;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public class hhw extends WebView {
    private boolean btk;
    private boolean fb;
    private final HashSet<String> fs;
    private zn hhw;
    private btk nps;
    public long zmn;
    private boolean zn;

    private void safedk_webview_hhw_webviewAddJavascriptInterface_47e6e9afc78d975e01d6f821eca67d83(Object p1, String p2) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bvs/hhw;->safedk_webview_hhw_webviewAddJavascriptInterface_47e6e9afc78d975e01d6f821eca67d83(Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", this, ", SDK_PACKAGE_NAME: ", h.u, " object is: ", p1, " and name: ", p2);
            AdNetworkDiscovery j = CreativeInfoManager.j(h.u);
            if (j != null) {
                j.a((WebView) this, p1);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.u, ", add to pending list");
                d.b((WebView) this, p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        super.addJavascriptInterface(p1, p2);
    }

    private void safedk_webview_hhw_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(String p1, String p2, String p3, String p4, String p5) {
        String str;
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bvs/hhw;->safedk_webview_hhw_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", p1, ", WebView address : ", toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.u);
                CreativeInfoManager.a(p1, p2, this, h.u);
                SafeDKWebAppInterface.a(h.u, (WebView) this, p2, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.u);
            str = j != null ? j.a(this, p1, p2) : p2;
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadDataWithBaseURL exception", th);
            str = p2;
        }
        super.loadDataWithBaseURL(p1, str, p3, p4, p5);
    }

    private void safedk_webview_hhw_webviewLoadUrl_9734b466488e157cba9b069557de2b55(String p1, Map p2) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bvs/hhw;->safedk_webview_hhw_webviewLoadUrl_9734b466488e157cba9b069557de2b55(Ljava/lang/String;Ljava/util/Map;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: ", p1, ", WebView address : ", toString(), "  SDK_PACKAGE_NAME = ", h.u);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(p1) && !p1.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.u, this, p1);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.u);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(p1, (String) null, this, h.u);
                    }
                    SafeDKWebAppInterface.a(h.u, (WebView) this, p1, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl loadUrl url is null or a javascript command : ", p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl exception", th);
        }
        super.loadUrl(p1, p2);
    }

    private void safedk_webview_hhw_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(String p1) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/bytedance/sdk/component/bvs/hhw;->safedk_webview_hhw_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", p1, ", WebView address : ", toString(), ", SDK_PACKAGE_NAME = ", h.u);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(p1) && !p1.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.u, this, p1);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.u);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(p1, (String) null, this, h.u);
                    }
                    SafeDKWebAppInterface.a(h.u, (WebView) this, p1, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        super.loadUrl(p1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public hhw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fs = new HashSet<>();
        this.zmn = System.currentTimeMillis();
        zn();
    }

    public hhw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fs = new HashSet<>();
        this.zmn = System.currentTimeMillis();
        zn();
    }

    public void setTouchListenerProxy(zn znVar) {
        this.hhw = znVar;
    }

    private void zn() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new nps.zmn());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.zn || this.btk) {
            return;
        }
        safedk_webview_hhw_webviewAddJavascriptInterface_47e6e9afc78d975e01d6f821eca67d83(obj, str);
        this.fs.add(str);
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.zn || this.btk) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.fs.remove(str);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.zn || this.btk) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.zn || this.btk) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.zn || this.btk) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.zn || this.btk) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.zn || this.btk) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.zn || this.btk) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (this.zn || this.btk) {
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (this.zn || this.btk) {
            return;
        }
        super.clearCache(z);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.zn || this.btk) {
            return;
        }
        try {
            safedk_webview_hhw_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.zn || this.btk) {
            return;
        }
        try {
            safedk_webview_hhw_webviewLoadUrl_9734b466488e157cba9b069557de2b55(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.zn || this.btk) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.zn || this.btk) {
            return;
        }
        safedk_webview_hhw_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.zn && !this.btk) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    public void setDestroyOnDetached(boolean z) {
        this.fb = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.fb) {
            destroy();
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.zn || this.btk) {
            return;
        }
        super.resumeTimers();
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.zn || this.btk) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.zn || this.btk) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.zn) {
            return;
        }
        this.zn = true;
        zmn();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    public void zmn() {
        if (this.zn) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        setDownloadListener(null);
        Iterator<String> it = this.fs.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.fs.clear();
    }

    public void fs() {
        if (this.zn) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        setDownloadListener(null);
    }

    public void setRecycler(boolean z) {
        this.btk = z;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        zn znVar = this.hhw;
        if (znVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            znVar.zmn(onTouchListener);
            super.setOnTouchListener(this.hhw);
        }
    }

    public void setWebEventProxy(btk btkVar) {
        this.nps = btkVar;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        btk btkVar = this.nps;
        if (btkVar != null && btkVar.fs(motionEvent)) {
            return this.nps.zmn(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}

package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class PangleWebView extends WebView {
    private boolean Jd;
    private boolean NB;
    private final HashSet<String> icD;
    public long pvs;
    private pvs sUS;
    private boolean vG;

    public PangleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.icD = new HashSet<>();
        this.pvs = System.currentTimeMillis();
        pvs();
    }

    public PangleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.icD = new HashSet<>();
        this.pvs = System.currentTimeMillis();
        pvs();
    }

    public void setArbitrageTouchListener(pvs pvsVar) {
        this.sUS = pvsVar;
    }

    private void pvs() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new SSWebView.pvs());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        new StringBuilder("addJavascriptInterface: ").append(str).append(", ").append(this);
        if (!this.vG && !this.NB) {
            super.addJavascriptInterface(obj, str);
            this.icD.add(str);
        } else {
            Ju.pvs("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.vG || this.NB) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.icD.remove(str);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.vG && !this.NB) {
            try {
                super.onPause();
                return;
            } catch (Exception e) {
                Ju.pvs("TTAD.PangleWebView", "onPause: ", e);
                return;
            }
        }
        Ju.pvs("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.vG && !this.NB) {
            try {
                super.onResume();
                return;
            } catch (Exception e) {
                Ju.pvs("TTAD.PangleWebView", "onResume: ", e);
                return;
            }
        }
        Ju.pvs("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.vG && !this.NB) {
            try {
                super.stopLoading();
                return;
            } catch (Exception e) {
                Ju.pvs("TTAD.PangleWebView", "stopLoading: ", e);
                return;
            }
        }
        Ju.pvs("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.vG && !this.NB) {
            super.reload();
        } else {
            Ju.pvs("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.vG && !this.NB) {
            super.goBack();
        } else {
            Ju.pvs("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.vG && !this.NB) {
            super.goForward();
        } else {
            Ju.pvs("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (!this.vG && !this.NB) {
            super.goBackOrForward(i);
        } else {
            Ju.pvs("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (!this.vG && !this.NB) {
            super.clearCache(z);
        } else {
            Ju.pvs("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!this.vG && !this.NB) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                Ju.pvs("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        Ju.pvs("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.vG && !this.NB) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                Ju.pvs("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        Ju.pvs("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.vG || this.NB) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!this.vG && !this.NB) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            Ju.pvs("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.vG && !this.NB) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            Ju.pvs("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        new StringBuilder("onAttachedToWindow: ").append(this);
    }

    public void setDestroyOnDetached(boolean z) {
        this.Jd = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        new StringBuilder("onDetachedFromWindow: ").append(this);
        if (this.Jd) {
            destroy();
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.vG || this.NB) {
            return;
        }
        super.resumeTimers();
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.vG || this.NB) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.vG || this.NB) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        new StringBuilder("destroy() called, ").append(this);
        if (this.vG) {
            return;
        }
        this.vG = true;
        icD();
        super.destroy();
    }

    private void icD() {
        if (this.vG) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.icD.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    public void setRecycler(boolean z) {
        this.NB = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        pvs pvsVar = this.sUS;
        if (pvsVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            pvsVar.pvs(onTouchListener);
            super.setOnTouchListener(this.sUS);
        }
    }
}

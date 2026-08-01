package com.bytedance.sdk.component.adexpress.NB;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bumptech.glide.load.Key;
import com.bytedance.sdk.component.pvs.dyT;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewPool.java */
/* loaded from: classes.dex */
public class NB {
    private static volatile NB Mxy = null;
    private static final byte[] NB = new byte[0];
    private static int sUS = 10;
    private static int so = 10;
    private final AtomicBoolean yiw = new AtomicBoolean(false);
    private List<SSWebView> pvs = new ArrayList();
    private List<SSWebView> icD = new ArrayList();
    private Map<Integer, vG> vG = new HashMap();
    private Map<Integer, Jd> Jd = new HashMap();

    private NB() {
        com.bytedance.sdk.component.adexpress.pvs.pvs.vG vG = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG();
        if (vG != null) {
            sUS = vG.Wyp();
            so = vG.qh();
        }
    }

    public static NB pvs() {
        if (Mxy == null) {
            synchronized (NB.class) {
                if (Mxy == null) {
                    Mxy = new NB();
                }
            }
        }
        return Mxy;
    }

    public SSWebView pvs(Context context, String str) {
        if (Jd() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.Jd.Jd.pvs(str) && Jd() <= 1) {
            Object[] objArr = new Object[2];
            Integer.valueOf(Jd());
            return null;
        }
        SSWebView remove = this.icD.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                Object[] objArr2 = new Object[2];
                Integer.valueOf(Jd());
            }
            return remove;
        } catch (Throwable unused) {
            Object[] objArr3 = new Object[2];
            Integer.valueOf(Jd());
            return null;
        }
    }

    public void pvs(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.icD.size() >= so) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.kj();
                return;
            } catch (Throwable th) {
                Object[] objArr = new Object[2];
                th.getMessage();
                return;
            }
        }
        if (this.icD.contains(sSWebView)) {
            return;
        }
        try {
            Context context2 = sSWebView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                sSWebView.setRecycler(true);
                this.icD.add(sSWebView);
                Object[] objArr2 = new Object[2];
                Integer.valueOf(Jd());
            }
        } catch (Throwable th2) {
            Object[] objArr3 = new Object[4];
            Integer.valueOf(Jd());
            th2.getMessage();
        }
    }

    public void icD(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        yiw(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        sUS(sSWebView);
        pvs(sSWebView);
    }

    public SSWebView icD(Context context, String str) {
        if (vG() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.Jd.Jd.pvs(str) && vG() <= 1) {
            Object[] objArr = new Object[2];
            Integer.valueOf(vG());
            return null;
        }
        SSWebView remove = this.pvs.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                Object[] objArr2 = new Object[2];
                Integer.valueOf(vG());
            }
            return remove;
        } catch (Throwable unused) {
            Object[] objArr3 = new Object[2];
            Integer.valueOf(vG());
            return null;
        }
    }

    public void vG(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        yiw(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        sUS(sSWebView);
        Jd(sSWebView);
    }

    public void Jd(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.pvs.size() >= sUS) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.kj();
                return;
            } catch (Throwable th) {
                Object[] objArr = new Object[2];
                th.getMessage();
                return;
            }
        }
        if (this.pvs.contains(sSWebView)) {
            return;
        }
        try {
            Context context2 = sSWebView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                sSWebView.setRecycler(true);
                this.pvs.add(sSWebView);
                Object[] objArr2 = new Object[2];
                Integer.valueOf(vG());
            }
        } catch (Throwable th2) {
            Object[] objArr3 = new Object[4];
            Integer.valueOf(vG());
            th2.getMessage();
        }
    }

    public boolean NB(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        try {
            Context context = sSWebView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            sSWebView.kj();
            return true;
        } catch (Throwable th) {
            Object[] objArr = new Object[2];
            th.getMessage();
            return true;
        }
    }

    public void icD() {
        for (SSWebView sSWebView : this.pvs) {
            if (sSWebView != null) {
                try {
                    Context context = sSWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    sSWebView.kj();
                } catch (Throwable th) {
                    Object[] objArr = new Object[2];
                    th.getMessage();
                }
            }
        }
        this.pvs.clear();
        for (SSWebView sSWebView2 : this.icD) {
            if (sSWebView2 != null) {
                try {
                    Context context2 = sSWebView2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    sSWebView2.kj();
                } catch (Throwable th2) {
                    Object[] objArr2 = new Object[2];
                    th2.getMessage();
                }
            }
        }
        this.icD.clear();
    }

    public int vG() {
        return this.pvs.size();
    }

    public int Jd() {
        return this.icD.size();
    }

    private void yiw(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.vG();
        sSWebView.setWebChromeClient(null);
        sSWebView.setWebViewClient(null);
        sSWebView.setDownloadListener(null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setDefaultTextEncodingName(Key.STRING_CHARSET_NAME);
        sSWebView.setDefaultFontSize(16);
    }

    public void pvs(SSWebView sSWebView, icD icd) {
        if (sSWebView == null || icd == null) {
            return;
        }
        vG vGVar = this.vG.get(Integer.valueOf(sSWebView.hashCode()));
        if (vGVar != null) {
            vGVar.pvs(icd);
        } else {
            vGVar = new vG(icd);
            this.vG.put(Integer.valueOf(sSWebView.hashCode()), vGVar);
        }
        sSWebView.pvs(vGVar, "SDK_INJECT_GLOBAL");
    }

    public void sUS(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        vG vGVar = this.vG.get(Integer.valueOf(sSWebView.hashCode()));
        if (vGVar != null) {
            vGVar.pvs(null);
        }
        sSWebView.b_("SDK_INJECT_GLOBAL");
    }

    public void pvs(WebView webView, dyT dyt, String str) {
        if (webView == null || dyt == null || TextUtils.isEmpty(str)) {
            return;
        }
        Jd jd = this.Jd.get(Integer.valueOf(webView.hashCode()));
        if (jd != null) {
            jd.pvs(dyt);
        } else {
            jd = new Jd(dyt);
            this.Jd.put(Integer.valueOf(webView.hashCode()), jd);
        }
        webView.addJavascriptInterface(jd, str);
    }

    public void pvs(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        Jd jd = this.Jd.get(Integer.valueOf(webView.hashCode()));
        if (jd != null) {
            jd.pvs(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void pvs(int i) {
        synchronized (NB) {
            sUS = i;
        }
    }

    public void icD(int i) {
        synchronized (NB) {
            so = i;
        }
    }
}

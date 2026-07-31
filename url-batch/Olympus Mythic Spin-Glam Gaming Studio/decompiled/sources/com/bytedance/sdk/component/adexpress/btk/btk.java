package com.bytedance.sdk.component.adexpress.btk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.zak;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class btk {
    private static final byte[] btk = new byte[0];
    private static volatile btk bvs = null;
    private static int hhw = 10;
    private static int zg = 10;
    private final AtomicBoolean nps = new AtomicBoolean(false);
    private List<nps> zmn = new ArrayList();
    private List<nps> fs = new ArrayList();
    private Map<Integer, zn> zn = new HashMap();
    private Map<Integer, fb> fb = new HashMap();

    private btk() {
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        if (zn != null) {
            hhw = zn.iv();
            zg = zn.rc();
        }
    }

    public static btk zmn() {
        if (bvs == null) {
            synchronized (btk.class) {
                try {
                    if (bvs == null) {
                        bvs = new btk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bvs;
    }

    public nps zmn(Context context, String str) {
        nps.zn znVar = nps.zn.ADS_V4;
        if (!zak.fs(znVar)) {
            return null;
        }
        if (!com.bytedance.sdk.component.adexpress.fb.btk.zmn(str) || zak.zmn(znVar) > 1) {
            return zak.zmn(context, null, 0, znVar);
        }
        return null;
    }

    public void zmn(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        zak.zn(npsVar);
        npsVar.b_("SDK_INJECT_GLOBAL");
        nps(npsVar);
        if (zak.fs(npsVar.getScene())) {
            zak.zmn(npsVar);
            return;
        }
        try {
            Context context = npsVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            npsVar.cn();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void fs(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        zak.fb(npsVar);
        zg(npsVar);
        if (zak.fs(npsVar.getScene())) {
            zak.fs(npsVar);
            return;
        }
        try {
            Context context = npsVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            npsVar.cn();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Nullable
    public nps fs(Context context, String str) {
        nps.zn znVar = nps.zn.ADS_V3;
        if (zak.fs(znVar)) {
            if (!com.bytedance.sdk.component.adexpress.fb.btk.zmn(str) || zak.zmn(znVar) > 1) {
                return zak.zmn(context, null, 0, znVar);
            }
            return null;
        }
        if (fb() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.fb.btk.zmn(str) && fb() <= 1) {
            fb();
            return null;
        }
        nps remove = this.fs.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                fb();
            }
            return remove;
        } catch (Throwable unused) {
            fb();
            return null;
        }
    }

    public void zn(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        if (zak.fs(npsVar.getScene())) {
            zak.zmn(npsVar);
            return;
        }
        if (this.fs.size() >= zg) {
            try {
                Context context = npsVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                npsVar.cn();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.fs.contains(npsVar)) {
            return;
        }
        try {
            Context context2 = npsVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                npsVar.setRecycler(true);
                this.fs.add(npsVar);
                fb();
            }
        } catch (Throwable th2) {
            fb();
            th2.getMessage();
        }
    }

    @UiThread
    public void fb(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        zak.zn(npsVar);
        npsVar.b_("SDK_INJECT_GLOBAL");
        nps(npsVar);
        zn(npsVar);
    }

    @Nullable
    public nps zn(Context context, String str) {
        nps.zn znVar = nps.zn.ADS;
        if (zak.fs(znVar)) {
            if (!com.bytedance.sdk.component.adexpress.fb.btk.zmn(str) || zak.zmn(znVar) > 1) {
                return zak.zmn(context, null, 0, znVar);
            }
            return null;
        }
        if (zn() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.fb.btk.zmn(str) && zn() <= 1) {
            zn();
            return null;
        }
        nps remove = this.zmn.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                zn();
            }
            return remove;
        } catch (Throwable unused) {
            zn();
            return null;
        }
    }

    @UiThread
    public void btk(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        zak.zn(npsVar);
        npsVar.b_("SDK_INJECT_GLOBAL");
        nps(npsVar);
        bvs(npsVar);
    }

    private void bvs(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        if (zak.fs(npsVar.getScene())) {
            zak.zmn(npsVar);
            return;
        }
        if (this.zmn.size() >= hhw) {
            try {
                Context context = npsVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                npsVar.cn();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.zmn.contains(npsVar)) {
            return;
        }
        try {
            Context context2 = npsVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                npsVar.setRecycler(true);
                this.zmn.add(npsVar);
                zn();
            }
        } catch (Throwable th2) {
            zn();
            th2.getMessage();
        }
    }

    public boolean hhw(nps npsVar) {
        if (npsVar == null) {
            return false;
        }
        try {
            Context context = npsVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            npsVar.cn();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void fs() {
        for (nps npsVar : this.zmn) {
            if (npsVar != null) {
                try {
                    Context context = npsVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    npsVar.cn();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.zmn.clear();
        for (nps npsVar2 : this.fs) {
            if (npsVar2 != null) {
                try {
                    Context context2 = npsVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    npsVar2.cn();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.fs.clear();
    }

    public int zn() {
        return this.zmn.size();
    }

    public int fb() {
        return this.fs.size();
    }

    @SuppressLint({"JavascriptInterface"})
    public void zmn(nps npsVar, fs fsVar) {
        WebView webView;
        if (npsVar == null || fsVar == null || (webView = npsVar.getWebView()) == null) {
            return;
        }
        zn znVar = this.zn.get(Integer.valueOf(webView.hashCode()));
        if (znVar != null) {
            znVar.zmn(fsVar);
        } else {
            znVar = new zn(fsVar);
            this.zn.put(Integer.valueOf(webView.hashCode()), znVar);
        }
        iqz.zmn("WebViewPool", "registerJavascriptInterface: express jsb recycle webview will register javascript interface every timeSDK_INJECT_GLOBAL");
        npsVar.zmn(znVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void fs(nps npsVar, fs fsVar) {
        WebView webView;
        if (npsVar == null || fsVar == null || (webView = npsVar.getWebView()) == null) {
            return;
        }
        zn znVar = this.zn.get(Integer.valueOf(webView.hashCode()));
        if (znVar != null) {
            iqz.zmn("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will not register javascript interface in reuse webviewSDK_INJECT_GLOBAL");
            znVar.zmn(fsVar);
        } else {
            zn znVar2 = new zn(fsVar);
            this.zn.put(Integer.valueOf(webView.hashCode()), znVar2);
            iqz.zmn("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will register once javascript interfaceSDK_INJECT_GLOBAL");
            npsVar.zmn(znVar2, "SDK_INJECT_GLOBAL");
        }
    }

    public void nps(nps npsVar) {
        WebView webView;
        if (npsVar == null || (webView = npsVar.getWebView()) == null) {
            return;
        }
        zn znVar = this.zn.get(Integer.valueOf(webView.hashCode()));
        if (znVar != null) {
            znVar.zmn(null);
        }
        iqz.zmn("WebViewPool", "unRegisterJavascriptInterface: express jsb recycle webview will remove javascript interfaceSDK_INJECT_GLOBAL");
        npsVar.b_("SDK_INJECT_GLOBAL");
    }

    public void zg(nps npsVar) {
        WebView webView;
        zn znVar;
        iqz.zmn("WebViewPool", "updateTTAndroidObject: express jsb recycle webview will not remove javascript interfaceSDK_INJECT_GLOBAL");
        if (npsVar == null || (webView = npsVar.getWebView()) == null || (znVar = this.zn.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        znVar.zmn(null);
    }

    @SuppressLint({"JavascriptInterface"})
    public void zmn(WebView webView, com.bytedance.sdk.component.zmn.iqz iqzVar, String str) {
        if (webView == null || iqzVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        fb fbVar = this.fb.get(Integer.valueOf(webView.hashCode()));
        if (fbVar != null) {
            fbVar.zmn(iqzVar);
        } else {
            fbVar = new fb(iqzVar);
            this.fb.put(Integer.valueOf(webView.hashCode()), fbVar);
        }
        iqz.zmn("WebViewPool", "registerJavascriptInterfaceForJsB2: jsb 3.0 register javascript interface every time".concat(String.valueOf(str)));
        PangleNetworkBridge.webviewAddJavascriptInterface(webView, fbVar, str);
    }

    public void fs(WebView webView, com.bytedance.sdk.component.zmn.iqz iqzVar, String str) {
        if (webView == null || iqzVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        fb fbVar = this.fb.get(Integer.valueOf(webView.hashCode()));
        if (fbVar != null) {
            iqz.zmn("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 will not register javascript interface in reuse webview".concat(String.valueOf(str)));
            fbVar.zmn(iqzVar);
        } else {
            iqz.zmn("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 register once javascript interface in created webview".concat(String.valueOf(str)));
            fb fbVar2 = new fb(iqzVar);
            this.fb.put(Integer.valueOf(webView.hashCode()), fbVar2);
            PangleNetworkBridge.webviewAddJavascriptInterface(webView, fbVar2, str);
        }
    }

    public void zmn(WebView webView, String str) {
        iqz.zmn("WebViewPool", "unRegisterJavascriptInterfaceForJsB2: jsb 3.0 recycle webview will remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        fb fbVar = this.fb.get(Integer.valueOf(webView.hashCode()));
        if (fbVar != null) {
            fbVar.zmn(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void fs(WebView webView, String str) {
        fb fbVar;
        iqz.zmn("WebViewPool", "updateWebViewBridge: jsb 3.0 recycle webview will not remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str) || (fbVar = this.fb.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        fbVar.zmn(null);
    }

    public void zmn(int i) {
        synchronized (btk) {
            hhw = i;
        }
    }

    public void fs(int i) {
        synchronized (btk) {
            zg = i;
        }
    }
}

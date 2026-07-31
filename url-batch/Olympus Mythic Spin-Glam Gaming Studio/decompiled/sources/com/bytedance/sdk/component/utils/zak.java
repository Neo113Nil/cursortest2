package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.nqi;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class zak {
    private static final HashMap<String, zmn> zmn = new HashMap<>();

    public static com.bytedance.sdk.component.bvs.nps zmn(Context context, AttributeSet attributeSet, int i, nps.zn znVar) {
        WebView zmn2 = zmn(context, attributeSet, i, znVar, false);
        if (zmn2 == null) {
            return null;
        }
        com.bytedance.sdk.component.bvs.nps npsVar = new com.bytedance.sdk.component.bvs.nps(context, true, znVar);
        npsVar.setWebView(zmn2);
        npsVar.btk();
        return npsVar;
    }

    public static WebView fs(Context context, AttributeSet attributeSet, int i, nps.zn znVar) {
        return zmn(context, attributeSet, i, znVar, true);
    }

    private static WebView zmn(Context context, AttributeSet attributeSet, int i, nps.zn znVar, boolean z) {
        WebView webView;
        zmn zmnVar;
        if (znVar == null || attributeSet != null || i != 0 || (zmnVar = zmn.get(znVar.rt)) == null) {
            webView = null;
        } else {
            webView = zmnVar.fs();
            if (webView != null) {
                if (webView instanceof com.bytedance.sdk.component.bvs.hhw) {
                    ((com.bytedance.sdk.component.bvs.hhw) webView).setRecycler(false);
                }
                zmn(znVar, false);
            }
        }
        if (webView != null || !z) {
            return webView;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        zmn(znVar, true);
        return i != 0 ? new com.bytedance.sdk.component.bvs.hhw(context, attributeSet, i) : new com.bytedance.sdk.component.bvs.hhw(context, attributeSet);
    }

    private static void zmn(final nps.zn znVar, final boolean z) {
        nqi.zmn("webview_allocate", new nqi.zmn() { // from class: com.bytedance.sdk.component.utils.zak.1
            @Override // com.bytedance.sdk.component.utils.nqi.zmn
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("scene", znVar.rt);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        WebView webView;
        if (npsVar == null || (webView = npsVar.getWebView()) == null) {
            return;
        }
        zmn zmnVar = zmn.get(npsVar.getScene().rt);
        if (zmnVar != null && zmnVar.zmn(webView)) {
            zn(npsVar);
        } else {
            zmn(webView);
        }
    }

    public static void fs(com.bytedance.sdk.component.bvs.nps npsVar) {
        WebView webView;
        if (npsVar == null || (webView = npsVar.getWebView()) == null) {
            return;
        }
        zmn zmnVar = zmn.get(npsVar.getScene().rt);
        if (zmnVar != null && zmnVar.zmn(webView)) {
            fb(npsVar);
        } else {
            zmn(webView);
        }
    }

    private static void zmn(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static void zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            Iterator<String> keys = jsonObjectInit.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    zmn zmnVar = new zmn(next, jsonObjectInit.getJSONObject(next));
                    Iterator<String> it = zmnVar.zmn().iterator();
                    while (it.hasNext()) {
                        zmn.put(it.next(), zmnVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void zn(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null) {
            return;
        }
        try {
            npsVar.removeAllViews();
            npsVar.nps();
            npsVar.setWebChromeClient(null);
            npsVar.setWebViewClient(null);
            npsVar.setDownloadListener(null);
            npsVar.setJavaScriptEnabled(true);
            npsVar.setCacheMode(-1);
            npsVar.setSupportZoom(false);
            npsVar.setUseWideViewPort(true);
            npsVar.setJavaScriptCanOpenWindowsAutomatically(true);
            npsVar.setDomStorageEnabled(true);
            npsVar.setBuiltInZoomControls(false);
            npsVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            npsVar.setLoadWithOverviewMode(false);
            npsVar.setDefaultTextEncodingName("UTF-8");
            npsVar.setDefaultFontSize(16);
            WebView webView = npsVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.bvs.hhw) {
                ((com.bytedance.sdk.component.bvs.hhw) webView).zmn();
            }
        } catch (Throwable unused) {
        }
    }

    public static void fb(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null) {
            return;
        }
        try {
            npsVar.removeAllViews();
            npsVar.nps();
            npsVar.setWebChromeClient(null);
            npsVar.setWebViewClient(null);
            npsVar.setDownloadListener(null);
            npsVar.setJavaScriptEnabled(true);
            npsVar.setCacheMode(-1);
            npsVar.setSupportZoom(false);
            npsVar.setUseWideViewPort(true);
            npsVar.setJavaScriptCanOpenWindowsAutomatically(true);
            npsVar.setDomStorageEnabled(true);
            npsVar.setBuiltInZoomControls(false);
            npsVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            npsVar.setLoadWithOverviewMode(false);
            npsVar.setDefaultTextEncodingName("UTF-8");
            npsVar.setDefaultFontSize(16);
            WebView webView = npsVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.bvs.hhw) {
                ((com.bytedance.sdk.component.bvs.hhw) webView).fs();
            }
        } catch (Throwable unused) {
        }
    }

    public static int zmn(nps.zn znVar) {
        zmn zmnVar;
        if (znVar == null || (zmnVar = zmn.get(znVar.rt)) == null) {
            return 0;
        }
        return zmnVar.zn();
    }

    public static boolean fs(nps.zn znVar) {
        return (znVar == null || zmn.get(znVar.rt) == null) ? false : true;
    }

    private static class zmn {
        private final String fb;
        public final int fs;
        public final HashSet<String> zmn = new HashSet<>();
        private final ArrayList<WebView> zn = new ArrayList<>();

        public zmn(String str, JSONObject jSONObject) {
            this.fb = str;
            this.fs = jSONObject.optInt("max_count");
            JSONArray optJSONArray = jSONObject.optJSONArray("scene");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        this.zmn.add(optString);
                    }
                }
            }
        }

        public boolean zmn(WebView webView) {
            if (webView != null && this.zn.size() < this.fs && !this.zn.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.bvs.hhw) {
                        ((com.bytedance.sdk.component.bvs.hhw) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.zn.add(webView);
                    return true;
                }
            }
            return false;
        }

        public HashSet<String> zmn() {
            return this.zmn;
        }

        public WebView fs() {
            if (this.zn.isEmpty()) {
                return null;
            }
            return this.zn.remove(0);
        }

        public int zn() {
            return this.zn.size();
        }
    }
}

package com.bytedance.sdk.openadsdk.core.iv;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.fb.bvs;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public class rc extends com.bytedance.sdk.openadsdk.core.widget.zmn.hhw {
    private static final byte[] klz = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private final com.bytedance.sdk.openadsdk.core.model.nqi fs;
    private com.bytedance.sdk.component.adexpress.fs.mw iv;
    private boolean rc;
    public ArrayList<Integer> zmn;

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.u, view, url);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/rc;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
        safedk_rc_onPageStarted_04e590d4bd26edee8d6663bb5e72d973(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/rc;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, webView, webResourceRequest, safedk_rc_shouldInterceptRequest_2f2a813d69f39547ad9c08e542b8f47b(webView, webResourceRequest));
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/rc;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_rc_shouldInterceptRequest_dcc3364cb8ce8de5675ee1d0fc888ab3(webView, str));
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    public rc(Context context, fkt fktVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, com.bytedance.sdk.openadsdk.fb.mw mwVar, com.bytedance.sdk.component.adexpress.fs.mw mwVar2) {
        super(context, fktVar, nqiVar.ji(), mwVar, false);
        this.rc = false;
        this.zmn = new ArrayList<>();
        this.fs = nqiVar;
        this.iv = mwVar2;
        this.rc = com.bytedance.sdk.openadsdk.uqh.btk.zmn("inject_data_normal_open", 0) == 1;
    }

    @TargetApi(21)
    public WebResourceResponse safedk_rc_shouldInterceptRequest_2f2a813d69f39547ad9c08e542b8f47b(WebView p0, WebResourceRequest p1) {
        com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn;
        try {
            String uri = p1.getUrl().toString();
            bvs.zmn zmn2 = com.bytedance.sdk.component.adexpress.fb.bvs.zmn(uri);
            if (zmn2 == bvs.zmn.VIDEO && com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.fs) && com.bytedance.sdk.openadsdk.component.reward.zn.zg.hhw() && (zmn = zmn(uri, zmn2, p1.getRequestHeaders())) != null && zmn.zmn() != null) {
                return zmn.zmn();
            }
            p1.getUrl().toString();
            p1.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
            return shouldInterceptRequest(p0, uri);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(p0, p1);
        }
    }

    public int zmn() {
        Iterator<Integer> it = this.zmn.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(fb()) ? -1 : 1;
    }

    public WebResourceResponse safedk_rc_shouldInterceptRequest_dcc3364cb8ce8de5675ee1d0fc888ab3(WebView p0, String p1) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn = zmn(p0, p1);
            zmn(currentTimeMillis, System.currentTimeMillis(), p1, (zmn == null || zmn.zmn() == null) ? 2 : 1);
            if (zmn != null && zmn.fs() != 5) {
                zmn.fs();
                this.zmn.add(Integer.valueOf(zmn.fs()));
            }
            if (zmn != null && zmn.zmn() != null) {
                return zmn.zmn();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.nps = false;
        super.onPageFinished(webView, str);
    }

    public void safedk_rc_onPageStarted_04e590d4bd26edee8d6663bb5e72d973(WebView p0, String p1, Bitmap p2) {
        this.zg = false;
        super.onPageStarted(p0, p1, p2);
        com.bytedance.sdk.component.adexpress.fs.mw mwVar = this.iv;
        if (mwVar != null && mwVar.nqi() && this.rc) {
            String p12 = "javascript:window.SDK_INJECT_DATA=" + this.iv.zn();
            com.bytedance.sdk.component.utils.rt.zmn(p0, p12);
        }
    }

    private com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.kgc kgcVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("local://pag_open_icon_id") || str.equals(com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn)) {
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmnVar = new com.bytedance.sdk.component.adexpress.zmn.fs.zmn();
            zmnVar.zmn(5);
            zmnVar.zmn(btk());
            return zmnVar;
        }
        nqi.zmn ouf = this.fs.ouf();
        if (ouf != null && !TextUtils.isEmpty(str) && str.equals(ouf.fs())) {
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmnVar2 = new com.bytedance.sdk.component.adexpress.zmn.fs.zmn();
            zmnVar2.zmn(5);
            WebResourceResponse btk = btk(str);
            zmnVar2.zmn(btk);
            com.bytedance.sdk.openadsdk.core.btk.zmn.zmn().zmn(btk != null);
            return zmnVar2;
        }
        bvs.zmn zmn = com.bytedance.sdk.component.adexpress.fb.bvs.zmn(str);
        if (cn.fs(this.fs)) {
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn2 = zmn(str, zmn);
            if (zmn2 != null) {
                return zmn2;
            }
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn fs = fs(str, zmn);
            if (fs != null) {
                return fs;
            }
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn zn = zn(str, zmn);
            if (zn != null) {
                return zn;
            }
        }
        if (zmn != bvs.zmn.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.kgc> it = this.fs.tj().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.kgc next = it.next();
                if (!TextUtils.isEmpty(next.zmn()) && !TextUtils.isEmpty(str)) {
                    String zmn3 = next.zmn();
                    if (zmn3.startsWith("https")) {
                        zmn3 = zmn3.replaceFirst("https", "http");
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(zmn3)) {
                        kgcVar = next;
                        break;
                    }
                }
            }
        }
        if (zmn == bvs.zmn.IMAGE || kgcVar != null) {
            com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmnVar3 = new com.bytedance.sdk.component.adexpress.zmn.fs.zmn();
            zmnVar3.zmn(5);
            zmnVar3.zmn(zmn(str, com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(this.fs, str)));
            return zmnVar3;
        }
        return com.bytedance.sdk.component.adexpress.zmn.fs.fs.zmn(str, zmn, "", fb());
    }

    private com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn(String str, bvs.zmn zmnVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.fs;
        if (nqiVar == null || nqiVar.mrt() == null || !TextUtils.equals(this.fs.mrt().rc(), str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmnVar2 = new com.bytedance.sdk.component.adexpress.zmn.fs.zmn();
        zmnVar2.zmn(5);
        WebResourceResponse fs = fs(this.fs.mrt().rt(), zmnVar, map);
        if (fs == null) {
            com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(0, str, this.fs, map);
            return null;
        }
        zmnVar2.zmn(fs);
        com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(1, str, this.fs, map);
        return zmnVar2;
    }

    private WebResourceResponse fs(String str, bvs.zmn zmnVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.fs;
        if (nqiVar != null && nqiVar.mrt() != null) {
            File file = new File(CacheDirFactory.getICacheDir(this.fs.hqs()).zmn(), str);
            if (file.exists() && file.length() > 0) {
                try {
                    return zmn(file, zmnVar, map);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        return null;
    }

    private boolean fs(Map<String, String> map) {
        String str;
        return (map == null || map.isEmpty() || (str = map.get(Command.HTTP_HEADER_RANGE)) == null || !str.startsWith("bytes=")) ? false : true;
    }

    private WebResourceResponse zmn(File file, bvs.zmn zmnVar, Map<String, String> map) {
        if (fs(map)) {
            return fs(file, zmnVar, map);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            HashMap hashMap = new HashMap();
            long length = file.length();
            hashMap.put("Accept-Ranges", "bytes");
            hashMap.put("Content-Range", String.format("bytes 0-%d/%d", Long.valueOf(length - 1), Long.valueOf(length)));
            WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
            webResourceResponse.setResponseHeaders(map);
            webResourceResponse.setEncoding(B5.O);
            webResourceResponse.setData(fileInputStream);
            webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
            return webResourceResponse;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private WebResourceResponse fs(File file, bvs.zmn zmnVar, Map<String, String> map) {
        long j;
        long j2;
        long[] zmn;
        long length = file.length();
        long j3 = length - 1;
        if (map == null || map.isEmpty() || (zmn = com.bytedance.sdk.openadsdk.core.iv.fs.fs.zmn(map.get(Command.HTTP_HEADER_RANGE), length)) == null || zmn.length != 2) {
            j = 0;
            j2 = j3;
        } else {
            j = zmn[0];
            j2 = zmn[1];
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Ranges", "bytes");
        hashMap.put("Content-Range", String.format("bytes %d-%d/%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(length)));
        hashMap.toString();
        WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
        if (webResourceResponse.getResponseHeaders() != null) {
            webResourceResponse.getResponseHeaders().clear();
        }
        webResourceResponse.setResponseHeaders(hashMap);
        webResourceResponse.setStatusCodeAndReasonPhrase(206, "Partial Content");
        webResourceResponse.setMimeType(zmnVar.zmn());
        webResourceResponse.setEncoding("UTF-8");
        try {
            webResourceResponse.setData(new FileInputStream(file));
        } catch (IOException e) {
            e.getMessage();
        }
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn(String str, bvs.zmn zmnVar) {
        ev.zmn hhw;
        JSONArray zmn;
        ev rsi = this.fs.rsi();
        if (rsi != null && (hhw = rsi.hhw()) != null && (zmn = hhw.zmn()) != null && zmn.length() > 0) {
            for (int i = 0; i < zmn.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.mw.fb.zmn(com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw(), zmn.optString(i)), str) && zmnVar == bvs.zmn.IMAGE) {
                    com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmnVar2 = new com.bytedance.sdk.component.adexpress.zmn.fs.zmn();
                    zmnVar2.zmn(5);
                    zmnVar2.zmn(zmn(str, com.bytedance.sdk.component.utils.btk.zmn(str)));
                    return zmnVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.zmn.fs.zmn fs(String str, bvs.zmn zmnVar) {
        ev.zmn hhw;
        JSONArray fs;
        ev rsi = this.fs.rsi();
        if (rsi == null || (hhw = rsi.hhw()) == null || (fs = hhw.fs()) == null || fs.length() <= 0) {
            return null;
        }
        return zmn(fs, str, zmnVar);
    }

    private com.bytedance.sdk.component.adexpress.zmn.fs.zmn zn(String str, bvs.zmn zmnVar) {
        ev.zmn hhw;
        JSONArray zn;
        ev rsi = this.fs.rsi();
        if (rsi == null || (hhw = rsi.hhw()) == null || (zn = hhw.zn()) == null || zn.length() <= 0) {
            return null;
        }
        return zmn(zn, str, zmnVar);
    }

    private com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmn(JSONArray jSONArray, String str, bvs.zmn zmnVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.mw.fb.zmn(com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw(), jSONArray.optString(i)), str)) {
                    com.bytedance.sdk.component.adexpress.zmn.fs.zmn zmnVar2 = new com.bytedance.sdk.component.adexpress.zmn.fs.zmn();
                    zmnVar2.zmn(5);
                    zmnVar2.zmn(fb(str, zmnVar));
                    return zmnVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse fb(String str, bvs.zmn zmnVar) {
        InputStream fs;
        if (TextUtils.isEmpty(str) || (fs = cn.fs(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(zmnVar.zmn(), "UTF-8", fs);
        zmn(webResourceResponse);
        return webResourceResponse;
    }

    private String fb() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.fs;
        if (nqiVar == null) {
            return null;
        }
        if (nqiVar.ouf() != null) {
            return this.fs.ouf().rc();
        }
        if (this.fs.rsi() != null) {
            return "v3";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private WebResourceResponse btk() {
        InputStream openRawResource;
        int bvs = com.bytedance.sdk.openadsdk.core.iv.fs().bvs();
        if (bvs == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.kgc.zmn().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(bvs, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                    openRawResource = new ByteArrayInputStream(klz);
                } else {
                    openRawResource = resources.openRawResource(bvs);
                }
            } catch (Resources.NotFoundException e) {
                com.bytedance.sdk.component.utils.iqz.zn("ExpressClient", e.toString());
            }
            if (openRawResource == null) {
                return new WebResourceResponse(bvs.zmn.IMAGE.zmn(), "UTF-8", openRawResource);
            }
            return null;
        }
        openRawResource = null;
        if (openRawResource == null) {
        }
    }

    private WebResourceResponse btk(String str) {
        InputStream zmn;
        if (TextUtils.isEmpty(str) || (zmn = com.bytedance.sdk.openadsdk.core.btk.zmn.zmn().zmn(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", zmn);
        zmn(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse zmn(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream zmn = com.bytedance.sdk.openadsdk.iv.fb.zmn(str, str2);
            if (zmn == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(bvs.zmn.IMAGE.zmn(), B5.O, zmn);
            try {
                zmn(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.iqz.zmn("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void zmn(long j, long j2, String str, int i) {
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.hhw;
        if (mwVar == null || mwVar.fs() == null) {
            return;
        }
        bvs.zmn zmn = com.bytedance.sdk.component.adexpress.fb.bvs.zmn(str);
        if (zmn == bvs.zmn.HTML) {
            this.hhw.fs().zmn(str, j, j2, i);
        } else if (zmn == bvs.zmn.JS) {
            this.hhw.fs().fs(str, j, j2, i);
        }
    }

    private void zmn(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
        webResourceResponse.setResponseHeaders(hashMap);
    }
}

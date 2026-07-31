package com.bytedance.sdk.openadsdk.rt;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.core.cyb;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.kw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.hhw;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.nps.fs;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zn {
    private static long fb = 3600000;
    private static volatile zn zmn = null;
    private static int zn = 2;
    private LinkedHashMap<Integer, SoftReference<nps>> btk;
    private final Handler fs;

    public static zn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public zn() {
        zn = com.bytedance.sdk.openadsdk.uqh.btk.zmn("pre_render_count", 2);
        long zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("pre_render_duration", 3600000);
        fb = zmn2;
        if (zn <= 0) {
            zn = 2;
        }
        if (zmn2 <= 0) {
            fb = 3600000L;
        }
        this.btk = new LinkedHashMap<>();
        this.fs = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.rt.zn.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(@NonNull Message message) {
                SoftReference softReference;
                int i = message.what;
                if (zn.this.btk == null || (softReference = (SoftReference) zn.this.btk.get(Integer.valueOf(i))) == null) {
                    return false;
                }
                nps npsVar = (nps) softReference.get();
                zn.this.zmn(i, 2, new nqi(), npsVar == null ? "" : npsVar.getTag());
                return false;
            }
        });
    }

    public void zmn(final nqi nqiVar) {
        final String str;
        if (nqiVar == null || !zn(nqiVar)) {
            return;
        }
        kw rp = nqiVar.rp();
        if (rp == null) {
            rp = new kw();
        }
        nqiVar.gu();
        if (nqiVar.gu()) {
            String pl = nqiVar.pl();
            if (TextUtils.isEmpty(pl)) {
                return;
            }
            final int hashCode = pl.hashCode();
            if (iqz.fs(nqiVar)) {
                str = "landingpage_split_screen";
            } else if (iqz.fb(nqiVar)) {
                str = "landingpage_direct";
            } else if (!iqz.zn(nqiVar)) {
                str = "";
            } else {
                str = "landingpage_split_ceiling";
            }
            LinkedHashMap<Integer, SoftReference<nps>> linkedHashMap = this.btk;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
                HashMap hashMap = new HashMap();
                hashMap.put(nqiVar.ltf(), nqiVar);
                if (rp.fs() == 2) {
                    com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn((Map<String, nqi>) hashMap, new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.rt.zn.2
                        @Override // com.bytedance.sdk.openadsdk.nps.fs.zmn
                        public void zmn() {
                            zn.this.zmn(hashCode, nqiVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (rp.fs() == 1) {
                    com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn((Map<String, nqi>) hashMap, (fs.zmn) null, true);
                    zmn(hashCode, nqiVar, str, true);
                } else if (rp.fs() == 0) {
                    zmn(hashCode, nqiVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final int i, final nqi nqiVar, final String str, final boolean z) {
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rt.zn.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.zmn btk;
                Activity fs;
                if (zn.this.btk != null && zn.this.btk.size() >= zn.zn) {
                    Map.Entry entry = (Map.Entry) zn.this.btk.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        nps npsVar = (nps) softReference.get();
                        zn.this.zmn(((Integer) entry.getKey()).intValue(), 1, nqiVar, npsVar == null ? "" : npsVar.getTag());
                    }
                }
                if (zn.this.fs != null) {
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    zn.this.fs.sendMessageDelayed(obtain, zn.fb);
                }
                SoftReference softReference2 = new SoftReference(new nps(kgc.zmn(), false, nps.zn.LANDING_PAGE_PRE_RENDER));
                final nps npsVar2 = (nps) softReference2.get();
                if (npsVar2 == null) {
                    return;
                }
                fkt fktVar = null;
                npsVar2.setLayerType(2, null);
                jy.zmn((View) npsVar2, 4);
                npsVar2.setTag(str);
                npsVar2.setLandingPage(true);
                kw rp = nqiVar.rp();
                int zmn2 = rp != null ? rp.zmn() : 3;
                if (zmn2 == 2) {
                    int zn2 = jy.zn(kgc.zmn());
                    int btk2 = jy.btk(kgc.zmn());
                    int ol = nqiVar.ol();
                    if (ol == 1) {
                        if (zn2 >= btk2) {
                            npsVar2.layout(0, 0, btk2, zn2);
                        }
                        npsVar2.layout(0, 0, zn2, btk2);
                    } else if (ol == 2) {
                        if (zn2 < btk2) {
                            npsVar2.layout(0, 0, btk2, zn2);
                        }
                        npsVar2.layout(0, 0, zn2, btk2);
                    }
                } else if (zmn2 == 1 && (btk = cyb.zmn().btk()) != null && (fs = btk.fs()) != null) {
                    final int hashCode = fs.hashCode();
                    btk.zmn(new com.bytedance.sdk.component.adexpress.zmn() { // from class: com.bytedance.sdk.openadsdk.rt.zn.3.1
                        @Override // com.bytedance.sdk.component.adexpress.zmn
                        public void zmn(Activity activity) {
                            int i2 = hashCode;
                            if (i2 == 0 || activity == null || i2 != activity.hashCode() || npsVar2.zn()) {
                                return;
                            }
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            zn.this.zmn(i, 5, nqiVar, str);
                        }
                    });
                    FrameLayout frameLayout = (FrameLayout) fs.findViewById(R.id.content);
                    if (frameLayout != null) {
                        frameLayout.addView(npsVar2);
                    }
                }
                int zmn3 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(com.bytedance.sdk.openadsdk.nps.fs.zmn().fs(), nqiVar.ltf());
                mw mwVar = new mw(nqiVar, npsVar2.getWebView());
                mwVar.zmn(zmn3 > 0 ? 2 : 0);
                mwVar.zmn(true);
                mwVar.fs(true);
                npsVar2.setWebViewClient(zmn(npsVar2, mwVar));
                npsVar2.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(fktVar, mwVar) { // from class: com.bytedance.sdk.openadsdk.rt.zn.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (i2 == 100) {
                            npsVar2.setPreProgressHundred(true);
                        }
                    }
                });
                zn.this.zmn(npsVar2, nqiVar.pl());
                zn.zmn(nqiVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - nqiVar.sc()).floatValue(), "web_start_pre_render");
                if (zn.this.btk != null) {
                    zn.this.btk.put(Integer.valueOf(i), softReference2);
                }
            }

            private hhw zmn(@NonNull final nps npsVar, mw mwVar) {
                hhw hhwVar = new hhw(kgc.zmn(), null, nqiVar.ji(), mwVar, true) { // from class: com.bytedance.sdk.openadsdk.rt.zn.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(h.u, view, url);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zn$3$3;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                        BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str2);
                        safedk_zn$3$3_onPageStarted_c0db6dc47990eae4e161ff541c575918(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zn$3$3;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                        BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i2, str2, str3);
                        safedk_zn$3$3_onReceivedError_7f3743c233089abfb321196f5655dc86(webView, i2, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zn$3$3;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse(h.u, webView, str2, safedk_zn$3$3_shouldInterceptRequest_25565fdc73518271c8b8710d26502431(webView, str2));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zn$3$3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                        boolean safedk_zn$3$3_shouldOverrideUrlLoading_d3a33a94cd6dd62bdc6bf30c6377253e = safedk_zn$3$3_shouldOverrideUrlLoading_d3a33a94cd6dd62bdc6bf30c6377253e(webView, str2);
                        BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView, str2, safedk_zn$3$3_shouldOverrideUrlLoading_d3a33a94cd6dd62bdc6bf30c6377253e);
                        return safedk_zn$3$3_shouldOverrideUrlLoading_d3a33a94cd6dd62bdc6bf30c6377253e;
                    }

                    public boolean safedk_zn$3$3_shouldOverrideUrlLoading_d3a33a94cd6dd62bdc6bf30c6377253e(WebView p0, String p1) {
                        return super.shouldOverrideUrlLoading(p0, p1);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        nps npsVar2 = npsVar;
                        if (npsVar2 != null) {
                            npsVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    public void safedk_zn$3$3_onPageStarted_c0db6dc47990eae4e161ff541c575918(WebView p0, String p1, Bitmap p2) {
                        nps npsVar2 = npsVar;
                        if (npsVar2 != null) {
                            npsVar2.setPreStart(true);
                        }
                        super.onPageStarted(p0, p1, p2);
                    }

                    public void safedk_zn$3$3_onReceivedError_7f3743c233089abfb321196f5655dc86(WebView p0, int p1, String p2, String p3) {
                        String fb2 = hhw.fb(p3);
                        boolean z2 = false;
                        boolean z3 = fb2 != null && fb2.startsWith("image");
                        if (fb2 != null && fb2.startsWith(n.d)) {
                            z2 = true;
                        }
                        if (!z3 && !z2 && !npsVar.zn()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            zn.this.zmn(i, 4, nqiVar, str);
                        }
                        super.onReceivedError(p0, p1, p2, p3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            zn.this.zmn(i, 4, nqiVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    public WebResourceResponse safedk_zn$3$3_shouldInterceptRequest_25565fdc73518271c8b8710d26502431(WebView p0, String p1) {
                        try {
                            if (!z) {
                                return super.shouldInterceptRequest(p0, p1);
                            }
                            nps npsVar2 = npsVar;
                            if (npsVar2 != null) {
                                npsVar2.zmn++;
                            }
                            WebResourceResponseModel zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(com.bytedance.sdk.openadsdk.nps.fs.zmn().fs(), nqiVar.ltf(), p1);
                            if (zmn2 != null && zmn2.getWebResourceResponse() != null) {
                                nps npsVar3 = npsVar;
                                if (npsVar3 != null) {
                                    npsVar3.fs++;
                                }
                                return zmn2.getWebResourceResponse();
                            }
                            if (npsVar != null && zmn2 != null && zmn2.getMsg() == 2) {
                                npsVar.zn++;
                            }
                            return super.shouldInterceptRequest(p0, p1);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(p0, p1);
                        }
                    }
                };
                hhwVar.zmn(nqiVar);
                hhwVar.zmn(str);
                return hhwVar;
            }
        });
    }

    public nps fs(nqi nqiVar) {
        if (nqiVar == null || TextUtils.isEmpty(nqiVar.pl())) {
            return null;
        }
        String pl = nqiVar.pl();
        if (TextUtils.isEmpty(pl)) {
            return null;
        }
        int hashCode = pl.hashCode();
        SoftReference<nps> softReference = this.btk.get(Integer.valueOf(hashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        nps npsVar = softReference.get();
        zmn(nqiVar, npsVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - nqiVar.sc()).floatValue(), "web_use_pre_render");
        zmn(hashCode, 3, nqiVar, npsVar.getTag());
        return npsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, int i2, nqi nqiVar, String str) {
        LinkedHashMap<Integer, SoftReference<nps>> linkedHashMap = this.btk;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i))) {
            this.btk.remove(Integer.valueOf(i));
        }
        Handler handler = this.fs;
        if (handler != null) {
            handler.removeMessages(i);
        }
        zmn(nqiVar, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(nps npsVar, String str) {
        if (npsVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(kgc.zmn()).zmn(false).fs(false).zmn(npsVar.getWebView());
        npsVar.setMixedContentMode(0);
        com.bytedance.sdk.openadsdk.utils.nqi.zmn(npsVar, str);
    }

    public static boolean zn(nqi nqiVar) {
        return iqz.bvs(nqiVar) || iqz.fs(nqiVar) || iqz.zn(nqiVar);
    }

    public static void zmn(nqi nqiVar, String str, final float f, String str2) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.rt.zn.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, f);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void zmn(nqi nqiVar, final String str, final int i) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.rt.zn.5
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}

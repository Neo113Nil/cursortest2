package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetApiImpl.java */
/* loaded from: classes2.dex */
public class cR implements vA<com.bytedance.sdk.openadsdk.icD.pvs> {
    private final Context pvs;

    cR(Context context) {
        this.pvs = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|2|3|(16:8|9|(1:(1:14))(2:43|(1:(1:48))(2:49|(1:54)))|15|16|(1:19)|(1:24)|25|(1:27)(1:41)|28|(1:31)|32|(1:34)|35|(1:37)|39)|55|9|(0)(0)|15|16|(1:19)|(2:22|24)|25|(0)(0)|28|(1:31)|32|(0)|35|(0)|39) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:3:0x000d, B:5:0x0014, B:8:0x001d, B:12:0x002b, B:14:0x002f, B:22:0x007d, B:24:0x0083, B:25:0x00af, B:28:0x00c6, B:31:0x0138, B:32:0x0148, B:34:0x0157, B:35:0x0164, B:37:0x016c, B:46:0x003b, B:48:0x003f, B:52:0x004a, B:54:0x004e, B:55:0x0020), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016c A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:3:0x000d, B:5:0x0014, B:8:0x001d, B:12:0x002b, B:14:0x002f, B:22:0x007d, B:24:0x0083, B:25:0x00af, B:28:0x00c6, B:31:0x0138, B:32:0x0148, B:34:0x0157, B:35:0x0164, B:37:0x016c, B:46:0x003b, B:48:0x003f, B:52:0x004a, B:54:0x004e, B:55:0x0020), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    @DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject pvs(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uc ucVar, int i) {
        JSONObject jSONObject;
        String Jd;
        long currentTimeMillis;
        String str;
        String Wyp;
        String rCZ;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.utils.zM.icD("body data exception", th);
        }
        if (ucVar != null && !TextUtils.isEmpty(ucVar.pvs)) {
            Jd = ucVar.pvs;
            if (i != 7) {
                if (ucVar != null && ucVar.icD > 0) {
                    jSONObject.put("req_type", ucVar.icD);
                }
            } else if (i == 8) {
                if (ucVar != null && ucVar.vG > 0) {
                    jSONObject.put("req_type", ucVar.vG);
                }
            } else if (i == 3 && ucVar != null && ucVar.Jd > 0) {
                jSONObject.put("req_type", ucVar.Jd);
            }
            Wyp = mnm.Jd().Wyp();
            rCZ = mnm.Jd().rCZ();
            if (Wyp != null && rCZ != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", Wyp);
                jSONObject3.put("param", rCZ);
                jSONObject.put("abtest", jSONObject3);
            }
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                jSONObject.put("bidding_param", adSlot.getBiddingTokens());
                com.bytedance.sdk.openadsdk.core.settings.icD Gp = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Gp(adSlot.getCodeId());
                jSONObject.put("waterfall_id", Gp.OhP);
                jSONObject.put("waterfall_version", Gp.jhZ);
                jSONObject.put("link_id", adSlot.getLinkId());
            }
            jSONObject.put("request_id", Jd);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("rewardedfull_link", !com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Mnp() ? 1 : 0);
            jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.icD());
            jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.vG());
            jSONObject.put("source_type", "app");
            jSONObject.put("app", vG());
            Object[] objArr = new Object[2];
            jSONObject.put("device", DeviceUtils.pvs(this.pvs, true));
            jSONObject.put("user", pvs(adSlot));
            jSONObject.put("ua", jlb.vG());
            jSONObject.put("channel", "main");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pvs(adSlot, i, ucVar));
            jSONObject.put("adslots", jSONArray);
            pvs(jSONObject, ucVar);
            currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            str = "";
            if (adSlot.getCodeId() != null && Jd != null) {
                str = String.valueOf(currentTimeMillis).concat(adSlot.getCodeId()).concat(Jd);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.NB.pvs(str));
            if (com.bytedance.sdk.openadsdk.core.NB.vG.NB() != 0) {
                jSONObject.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.NB.vG.NB()));
            }
            jSONObject2 = pvs(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject);
            if (jSONObject2 != null) {
                jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject2.put("oversea_version_type", 1);
            }
            return jSONObject2;
        }
        Jd = jlb.Jd();
        if (i != 7) {
        }
        Wyp = mnm.Jd().Wyp();
        rCZ = mnm.Jd().rCZ();
        if (Wyp != null) {
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("version", Wyp);
            jSONObject32.put("param", rCZ);
            jSONObject.put("abtest", jSONObject32);
        }
        if (adSlot != null) {
            jSONObject.put("bidding_param", adSlot.getBiddingTokens());
            com.bytedance.sdk.openadsdk.core.settings.icD Gp2 = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Gp(adSlot.getCodeId());
            jSONObject.put("waterfall_id", Gp2.OhP);
            jSONObject.put("waterfall_version", Gp2.jhZ);
            jSONObject.put("link_id", adSlot.getLinkId());
        }
        jSONObject.put("request_id", Jd);
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("rewardedfull_link", !com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Mnp() ? 1 : 0);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.icD());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.vG());
        jSONObject.put("source_type", "app");
        jSONObject.put("app", vG());
        Object[] objArr2 = new Object[2];
        jSONObject.put("device", DeviceUtils.pvs(this.pvs, true));
        jSONObject.put("user", pvs(adSlot));
        jSONObject.put("ua", jlb.vG());
        jSONObject.put("channel", "main");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(pvs(adSlot, i, ucVar));
        jSONObject.put("adslots", jSONArray2);
        pvs(jSONObject, ucVar);
        currentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("ts", currentTimeMillis);
        str = "";
        if (adSlot.getCodeId() != null) {
            str = String.valueOf(currentTimeMillis).concat(adSlot.getCodeId()).concat(Jd);
        }
        jSONObject.put("req_sign", com.bytedance.sdk.component.utils.NB.pvs(str));
        if (com.bytedance.sdk.openadsdk.core.NB.vG.NB() != 0) {
        }
        jSONObject2 = pvs(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject);
        if (jSONObject2 != null) {
        }
        return jSONObject2;
    }

    private void pvs(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.uc ucVar) {
        if (ucVar == null || ucVar.NB == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", ucVar.NB);
        } catch (Exception unused) {
        }
    }

    private boolean Jd(String str) {
        if (com.bytedance.sdk.openadsdk.core.Jd.icD.pvs()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.Jd.icD.pvs(str)) {
            return false;
        }
        String icD2 = com.bytedance.sdk.openadsdk.core.Jd.icD.icD();
        if (!TextUtils.isEmpty(icD2)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(icD2, System.currentTimeMillis());
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public void pvs(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uc ucVar, final int i, vA.pvs pvsVar) {
        final com.bytedance.sdk.openadsdk.core.pvs.pvs pvsVar2 = new com.bytedance.sdk.openadsdk.core.pvs.pvs(pvsVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Ju.icD().post(new com.bytedance.sdk.component.so.so("getAd") { // from class: com.bytedance.sdk.openadsdk.core.cR.1
                @Override // java.lang.Runnable
                public void run() {
                    cR.this.icD(adSlot, ucVar, i, pvsVar2);
                }
            });
        } else {
            icD(adSlot, ucVar, i, pvsVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uc ucVar, final int i, final vA.pvs pvsVar) {
        Ju.sUS();
        final com.bytedance.sdk.openadsdk.core.model.icD icd = new com.bytedance.sdk.openadsdk.core.model.icD();
        icd.pvs(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
            if (pvsVar != null) {
                pvsVar.pvs(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                icd.pvs(1000);
                com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                return;
            }
            return;
        }
        if (!mnm.Jd().yWX()) {
            if (pvsVar != null) {
                pvsVar.pvs(-16, yiw.pvs(-16));
                icd.pvs(1001);
                com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                return;
            }
            return;
        }
        if (pvsVar == null) {
            return;
        }
        if (Jd(adSlot.getCodeId())) {
            pvsVar.pvs(-8, yiw.pvs(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !ucVar.sUS) {
            icd.icD(2);
            icd.pvs(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.Ju.Jd()) {
                com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(adSlot.getBidAdm());
            }
            if (mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
                jlb.pvs("Pangle_Debug_Mode", adSlot.getBidAdm(), this.pvs);
            }
            try {
                JSONObject icD2 = icD(new JSONObject(adSlot.getBidAdm()));
                if (icD2 == null) {
                    pvs(pvsVar, icd);
                    return;
                }
                pvs pvs2 = pvs.pvs(icD2, adSlot, ucVar, icd);
                icd.pvs(pvs2.Wyp);
                qh.pvs(this.pvs, pvs2.Mxy);
                if (pvs2.Jd != 20000) {
                    pvsVar.pvs(pvs2.Jd, pvs2.NB);
                    icd.pvs(pvs2.Jd);
                    com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                    return;
                } else {
                    if (pvs2.so == null) {
                        pvs(pvsVar, icd);
                        return;
                    }
                    if (pvs2.so.vG() != null && pvs2.so.vG().size() > 0) {
                        com.bytedance.sdk.openadsdk.Wyp.vG.pvs(pvs2.so.vG().get(0));
                    }
                    pvs2.so.vG(icD2.toString());
                    pvsVar.pvs(pvs2.so, icd);
                    Map<String, com.bytedance.sdk.openadsdk.core.model.cR> pvs3 = com.bytedance.sdk.openadsdk.core.model.pvs.pvs(pvs2.so);
                    if (pvs3 != null) {
                        com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(pvs3);
                    }
                    pvs(pvs2.so);
                    return;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "get ad error: ", th);
                pvs(pvsVar, icd);
                return;
            }
        }
        JSONObject pvs4 = pvs(adSlot, ucVar, i);
        if (pvs4 == null) {
            pvsVar.pvs(-9, yiw.pvs(-9));
            icd.pvs(-9);
            com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
            return;
        }
        if (mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
            jlb.pvs("Pangle_Debug_Mode", pvs4.toString(), this.pvs);
        }
        String pvs5 = jlb.pvs(adSlot.getBiddingTokens() != null ? "/api/ad/union/mediation/get_ads/" : "/api/ad/union/sdk/get_ads/", true);
        com.bytedance.sdk.component.yiw.icD.Jd icD3 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
        final com.bytedance.sdk.openadsdk.Wyp.pvs.NB nb = new com.bytedance.sdk.openadsdk.Wyp.pvs.NB(2);
        try {
            String pvs6 = com.bytedance.sdk.openadsdk.NB.Jd.pvs(icD3, pvs5);
            icD3.icD(pvs6);
            nb.pvs(pvs6);
        } catch (Exception unused) {
        }
        icD3.pvs(pvs4.toString(), mnm.Jd().cR());
        nb.pvs(icD3.vG()).pvs();
        Map<String, String> pvs7 = com.bytedance.sdk.openadsdk.core.NB.vG.pvs(pvs5, pvs4.toString());
        if (pvs7 != null && pvs7.size() > 0) {
            for (String str : pvs7.keySet()) {
                try {
                    icD3.icD(str, pvs7.get(str));
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e.getMessage());
                }
            }
        }
        try {
            icD3.icD(HttpHeaders.USER_AGENT, jlb.vG());
            pvs(icD3, pvs4);
        } catch (Exception unused2) {
        }
        final com.bytedance.sdk.openadsdk.utils.gA pvs8 = com.bytedance.sdk.openadsdk.utils.gA.pvs();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z = so.icD().vA() && requestExtraMap != null;
        if (z) {
            requestExtraMap.put("pgad_start", pvs8);
        }
        if (adSlot.getBiddingTokens() != null) {
            pvs(adSlot, ucVar, icD3, requestExtraMap, z, pvs8, pvsVar);
            return;
        }
        icD3.pvs(10);
        icD3.pvs("get_ad");
        final boolean z2 = z;
        icD3.pvs(new com.bytedance.sdk.component.yiw.pvs.icD() { // from class: com.bytedance.sdk.openadsdk.core.cR.2
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd2) {
                System.currentTimeMillis();
                nb.icD();
                if (z2) {
                    requestExtraMap.put("pgad_end", pvs8);
                }
                if (icd2 != null) {
                    if (icd2.sUS()) {
                        com.bytedance.sdk.openadsdk.icD.pvs.sUS.icD.incrementAndGet();
                        com.bytedance.sdk.openadsdk.icD.pvs.sUS.pvs.incrementAndGet();
                        try {
                            com.bytedance.sdk.openadsdk.utils.gA pvs9 = com.bytedance.sdk.openadsdk.utils.gA.pvs();
                            String Jd = icd2.Jd();
                            JSONObject jSONObject = new JSONObject(Jd);
                            if (mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
                                jlb.pvs("Pangle_Debug_Mode", jSONObject.toString(), cR.this.pvs);
                            }
                            icd.pvs(Jd);
                            JSONObject icD4 = cR.this.icD(jSONObject);
                            if (icD4 == null) {
                                cR.this.pvs(pvsVar, icd);
                                icd2.yiw();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.sUS.incrementAndGet();
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                                nb.pvs(true).pvs(icd2.pvs()).vG(Jd).vG();
                                return;
                            }
                            pvs pvs10 = pvs.pvs(icD4, adSlot, ucVar, icd);
                            icd.pvs(pvs10.Wyp);
                            qh.pvs(cR.this.pvs, pvs10.Mxy);
                            if (pvs10.Jd != 20000) {
                                icd.pvs(pvs10.Jd);
                                if (!mnm.Jd().dx() && pvs10.Jd == 40029) {
                                    pvsVar.pvs(-100, yiw.pvs(-100));
                                } else {
                                    pvsVar.pvs(pvs10.Jd, pvs10.NB);
                                }
                                com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                                icd2.yiw();
                                adSlot.getCodeId();
                                String.valueOf(pvs10.sUS);
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.sUS.incrementAndGet();
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                                nb.pvs(true).pvs(icd2.pvs()).vG(Jd).vG();
                                return;
                            }
                            if (pvs10.so == null) {
                                cR.this.pvs(pvsVar, icd);
                                icd2.yiw();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.NB.incrementAndGet();
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                                nb.pvs(true).pvs(icd2.pvs()).vG(Jd).vG();
                                return;
                            }
                            pvs10.so.vG(icD4.toString());
                            com.bytedance.sdk.openadsdk.utils.gA pvs11 = com.bytedance.sdk.openadsdk.utils.gA.pvs();
                            com.bytedance.sdk.openadsdk.core.model.uc ucVar2 = ucVar;
                            if (ucVar2 != null && ucVar2.Wyp != null) {
                                ucVar.Wyp.pvs(pvs8, pvs9, pvs10.pvs, pvs11);
                            }
                            pvsVar.pvs(pvs10.so, icd);
                            cR.this.pvs(pvs10.so);
                            Map<String, com.bytedance.sdk.openadsdk.core.model.cR> pvs12 = com.bytedance.sdk.openadsdk.core.model.pvs.pvs(pvs10.so);
                            if (pvs12 != null) {
                                com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(pvs12);
                            }
                            if (pvs10.so.vG() != null && !pvs10.so.vG().isEmpty()) {
                                cR.this.pvs(icd2.so(), ucVar, pvs8, pvs9, pvs10.pvs, pvs11, pvs10.so.vG().get(0), jlb.vG(i), pvs10.so.yiw());
                                com.bytedance.sdk.openadsdk.icD.pvs.sUS.Jd.incrementAndGet();
                            }
                            com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                            nb.pvs(true).pvs(icd2.pvs()).vG(Jd).vG();
                            return;
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "get ad error: ", th2);
                            cR.this.pvs(pvsVar, icd);
                            icd2.yiw();
                            adSlot.getCodeId();
                            com.bytedance.sdk.openadsdk.icD.pvs.sUS.NB.incrementAndGet();
                            com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                            nb.pvs(icd2.sUS()).pvs(icd2.pvs()).vG(icd2.Jd()).Jd(th2.getMessage()).vG();
                            return;
                        }
                    }
                    int pvs13 = icd2.pvs();
                    String icD5 = icd2.icD();
                    pvsVar.pvs(pvs13, icD5);
                    icd.pvs(pvs13);
                    com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                    icd2.yiw();
                    adSlot.getCodeId();
                    com.bytedance.sdk.openadsdk.icD.pvs.sUS.so.incrementAndGet();
                    com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG.incrementAndGet();
                    com.bytedance.sdk.openadsdk.icD.pvs.sUS.pvs.incrementAndGet();
                    com.bytedance.sdk.openadsdk.icD.pvs.sUS.NB();
                    com.bytedance.sdk.openadsdk.icD.pvs.sUS.pvs(pvs13, icD5);
                    com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                    nb.pvs(false).pvs(pvs13).Jd(icD5).vG(icd2.Jd()).vG();
                }
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.icD
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException, com.bytedance.sdk.component.yiw.icD icd2) {
                String message;
                int i2;
                nb.icD();
                if (icd2 != null) {
                    message = icd2.icD();
                } else {
                    message = iOException != null ? iOException.getMessage() : "";
                }
                com.bytedance.sdk.openadsdk.utils.gA pvs9 = com.bytedance.sdk.openadsdk.utils.gA.pvs();
                if (z2) {
                    requestExtraMap.put("pgad_end", Long.valueOf(pvs9.pvs));
                }
                if (mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
                    jlb.pvs("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, cR.this.pvs);
                }
                if (icd2 != null) {
                    i2 = icd2.pvs();
                } else {
                    i2 = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE;
                }
                vA.pvs pvsVar2 = pvsVar;
                if (pvsVar2 != null) {
                    pvsVar2.pvs(i2, message);
                }
                Object[] objArr = new Object[2];
                Integer.valueOf(i2);
                icd.pvs(i2);
                com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                pvs9.pvs(pvs8);
                adSlot.getCodeId();
                com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG.incrementAndGet();
                com.bytedance.sdk.openadsdk.icD.pvs.sUS.pvs.incrementAndGet();
                com.bytedance.sdk.openadsdk.icD.pvs.sUS.yiw.incrementAndGet();
                com.bytedance.sdk.openadsdk.icD.pvs.sUS.NB();
                com.bytedance.sdk.openadsdk.icD.pvs.sUS.pvs(i2, message);
                com.bytedance.sdk.openadsdk.icD.pvs.sUS.vG();
                nb.Jd(message).pvs(false).vG();
            }
        });
    }

    private void pvs(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uc ucVar, com.bytedance.sdk.component.yiw.icD.Jd jd, final Map<String, Object> map, final boolean z, final com.bytedance.sdk.openadsdk.utils.gA gAVar, final vA.pvs pvsVar) {
        jd.pvs(new com.bytedance.sdk.component.yiw.pvs.icD() { // from class: com.bytedance.sdk.openadsdk.core.cR.3
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                if (z) {
                    map.put("pgad_end", gAVar);
                }
                if (icd == null || !icd.sUS()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(icd.Jd());
                    if (mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
                        jlb.pvs("Pangle_Debug_Mode", jSONObject.toString(), cR.this.pvs);
                    }
                    JSONObject icD2 = cR.this.icD(jSONObject);
                    if (icD2 == null) {
                        pvsVar.pvs(-1, yiw.pvs(-1));
                        return;
                    }
                    pvs pvs2 = pvs.pvs(icD2, adSlot, ucVar);
                    if (pvs2.Jd != 20000) {
                        if (!mnm.Jd().dx() && pvs2.Jd == 40029) {
                            pvsVar.pvs(-100, yiw.pvs(-100));
                            return;
                        } else {
                            pvsVar.pvs(pvs2.Jd, pvs2.NB);
                            return;
                        }
                    }
                    if (pvs2.so == null) {
                        pvsVar.pvs(-1, yiw.pvs(-1));
                        return;
                    }
                    pvs2.so.vG(icD2.toString());
                    pvsVar.pvs(pvs2.so, new com.bytedance.sdk.openadsdk.core.model.icD());
                    cR.this.pvs(pvs2.so);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "get ad error: ", th);
                    pvsVar.pvs(-1, yiw.pvs(-1));
                }
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.icD
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException, com.bytedance.sdk.component.yiw.icD icd) {
                com.bytedance.sdk.openadsdk.utils.gA pvs2 = com.bytedance.sdk.openadsdk.utils.gA.pvs();
                if (z) {
                    map.put("pgad_end", Long.valueOf(pvs2.pvs));
                }
                if (mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
                    jlb.pvs("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, cR.this.pvs);
                }
                if (icd != null) {
                    pvsVar.pvs(icd.pvs(), icd.icD());
                } else {
                    pvsVar.pvs(601, iOException != null ? iOException.getMessage() : "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
        List<com.bytedance.sdk.openadsdk.core.model.cR> vG = pvsVar.vG();
        if (vG == null || vG.size() == 0) {
            return;
        }
        for (int i = 0; i < vG.size(); i++) {
            com.bytedance.sdk.openadsdk.core.model.cR cRVar = vG.get(i);
            if (cRVar != null && cRVar.qh() == null) {
                pvs("", 0, 0, cRVar.ea(), cRVar);
                pvs("", 0, 0, cRVar.ZsW(), cRVar);
                List<com.bytedance.sdk.openadsdk.core.model.bNS> BSi = cRVar.BSi();
                if (BSi != null && BSi.size() > 0) {
                    for (int i2 = 0; i2 < BSi.size(); i2++) {
                        pvs(cRVar, BSi.get(i2));
                    }
                }
                if (cRVar.od() != null) {
                    pvs(cRVar.od().Wyp(), cRVar.od().vG(), cRVar.od().icD(), (com.bytedance.sdk.openadsdk.core.model.bNS) null, cRVar);
                }
            }
        }
    }

    private void pvs(String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.bNS bns, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.sUS.Jd.pvs(str).pvs(i).icD(i2).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, str, null), 4);
        } else {
            if (bns == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.sUS.Jd.pvs(bns).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, bns.pvs(), null), 4);
        }
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, com.bytedance.sdk.openadsdk.core.model.bNS bns) {
        if (bns == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(bns).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, bns.pvs(), new com.bytedance.sdk.component.NB.mnm() { // from class: com.bytedance.sdk.openadsdk.core.cR.4
            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(com.bytedance.sdk.component.NB.qh qhVar) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:27:0x001b, B:29:0x0023, B:8:0x0036, B:10:0x0052, B:11:0x0057, B:13:0x0061, B:16:0x006b, B:18:0x006e, B:20:0x0074, B:21:0x009e), top: B:26:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:27:0x001b, B:29:0x0023, B:8:0x0036, B:10:0x0052, B:11:0x0057, B:13:0x0061, B:16:0x006b, B:18:0x006e, B:20:0x0074, B:21:0x009e), top: B:26:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:27:0x001b, B:29:0x0023, B:8:0x0036, B:10:0x0052, B:11:0x0057, B:13:0x0061, B:16:0x006b, B:18:0x006e, B:20:0x0074, B:21:0x009e), top: B:26:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(com.bytedance.sdk.component.icD.pvs.Wyp wyp, com.bytedance.sdk.openadsdk.core.model.uc ucVar, com.bytedance.sdk.openadsdk.utils.gA gAVar, com.bytedance.sdk.openadsdk.utils.gA gAVar2, int i, com.bytedance.sdk.openadsdk.utils.gA gAVar3, com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str, boolean z) {
        long pvs2;
        if (mnm.Jd().OyE()) {
            JSONObject jSONObject = new JSONObject();
            if (ucVar != null) {
                try {
                    if (ucVar.Mxy.pvs > 0) {
                        jSONObject.put("client_start_time", gAVar.pvs(ucVar.Mxy));
                        pvs2 = gAVar3.pvs(ucVar.Mxy);
                        jSONObject.put("network_time", gAVar2.pvs(gAVar));
                        jSONObject.put("sever_time", i);
                        jSONObject.put("client_end_time", gAVar3.pvs(gAVar2));
                        int i2 = 1;
                        if (z) {
                            jSONObject.put("is_choose_ad", true);
                        }
                        if (str.equals("open_ad")) {
                            if (!cRVar.OUT()) {
                                i2 = 0;
                            }
                            jSONObject.put("is_icon_only", i2);
                        }
                        if (wyp.icD > 0) {
                            jSONObject.put("enqueue_2_run_ts", wyp.vG - wyp.icD);
                            jSONObject.put("run_2_connect_end_ts", wyp.NB - wyp.icD);
                            jSONObject.put("connect_end_2_response_end_ts", wyp.sUS - wyp.NB);
                            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - wyp.sUS);
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "load_ad_time", pvs2, jSONObject);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            pvs2 = 0;
            jSONObject.put("network_time", gAVar2.pvs(gAVar));
            jSONObject.put("sever_time", i);
            jSONObject.put("client_end_time", gAVar3.pvs(gAVar2));
            int i22 = 1;
            if (z) {
            }
            if (str.equals("open_ad")) {
            }
            if (wyp.icD > 0) {
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, "load_ad_time", pvs2, jSONObject);
        }
    }

    private boolean vG(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x0173, TRY_ENTER, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0009, B:7:0x0015, B:9:0x002e, B:12:0x0038, B:14:0x004c, B:16:0x0052, B:18:0x0056, B:20:0x005d, B:23:0x007e, B:25:0x00aa, B:28:0x00b6, B:29:0x00cc, B:31:0x00e7, B:33:0x00ed, B:35:0x00f7, B:38:0x010a, B:46:0x012e, B:49:0x0136, B:52:0x0142, B:54:0x0148, B:55:0x014c, B:58:0x0157, B:61:0x0153, B:63:0x013e, B:67:0x011c, B:69:0x0122, B:73:0x0090, B:75:0x0096, B:76:0x00a1, B:78:0x0067, B:79:0x0071), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0090 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0009, B:7:0x0015, B:9:0x002e, B:12:0x0038, B:14:0x004c, B:16:0x0052, B:18:0x0056, B:20:0x005d, B:23:0x007e, B:25:0x00aa, B:28:0x00b6, B:29:0x00cc, B:31:0x00e7, B:33:0x00ed, B:35:0x00f7, B:38:0x010a, B:46:0x012e, B:49:0x0136, B:52:0x0142, B:54:0x0148, B:55:0x014c, B:58:0x0157, B:61:0x0153, B:63:0x013e, B:67:0x011c, B:69:0x0122, B:73:0x0090, B:75:0x0096, B:76:0x00a1, B:78:0x0067, B:79:0x0071), top: B:2:0x0009 }] */
    @Override // com.bytedance.sdk.openadsdk.core.vA
    @DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.openadsdk.icD.NB pvs(JSONObject jSONObject, String str, boolean z) {
        byte[] bArr;
        boolean z2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
                return null;
            }
            com.bytedance.sdk.component.yiw.icD.Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
            icD2.icD(str);
            if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Wby()) {
                icD2.icD("_disable_retry", "1");
            }
            boolean z3 = true;
            if (z) {
                boolean pvs2 = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(PangleEncryptConstant.CryptDataScene.APP_LOG);
                byte[] NB = NB(jSONObject.toString());
                if (pvs2) {
                    Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(NB);
                    if (encryptType4WithoutBase64 != null && encryptType4WithoutBase64.second != null && ((byte[]) encryptType4WithoutBase64.second).length > 0) {
                        bArr = (byte[]) encryptType4WithoutBase64.second;
                        uc.icD(true);
                        if (bArr == null) {
                            icD2.icD(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                            icD2.icD("x-pgli18n", "4");
                            icD2.pvs("application/octet-stream;tt-data=a", bArr);
                        } else {
                            bArr = PangleEncryptManager.encryptV3(NB);
                            if (bArr != null) {
                                pvs(icD(), icD2);
                                icD2.pvs("application/octet-stream;tt-data=a", bArr);
                            } else {
                                com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "V3 encrypt failed");
                            }
                        }
                    } else {
                        int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                        uc.icD(false);
                        uc.pvs(1, PangleEncryptConstant.CryptDataScene.APP_LOG, intValue);
                    }
                }
                bArr = null;
                if (bArr == null) {
                }
            } else {
                bArr = null;
            }
            if (bArr == null) {
                JSONObject pvs3 = com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
                if (!vG(pvs3)) {
                    pvs3 = jSONObject;
                }
                pvs(Jd(pvs3), icD2);
                icD2.pvs(pvs3.toString(), mnm.Jd().cR());
            }
            com.bytedance.sdk.openadsdk.Wyp.pvs.NB nb = new com.bytedance.sdk.openadsdk.Wyp.pvs.NB(3);
            nb.pvs(str).pvs(icD2.vG()).pvs();
            com.bytedance.sdk.component.yiw.icD pvs4 = icD2.pvs();
            boolean NB2 = (pvs4 == null || !pvs4.sUS() || TextUtils.isEmpty(pvs4.Jd())) ? false : NB(new JSONObject(pvs4.Jd()));
            String str3 = "error unknown";
            int pvs5 = pvs4 != null ? pvs4.pvs() : 0;
            if (NB2 || pvs5 != 200) {
                if (pvs4 != null && pvs4.icD() != null) {
                    str3 = pvs4.icD();
                }
                z2 = false;
            } else {
                str3 = "server say not success";
                z2 = true;
            }
            boolean z4 = pvs4 == null;
            if (z4 || !pvs4.sUS()) {
                z3 = false;
            }
            com.bytedance.sdk.openadsdk.Wyp.pvs.NB pvs6 = nb.pvs(z3).vG(z4 ? null : pvs4.Jd()).pvs(z4 ? com.bytedance.sdk.openadsdk.Wyp.pvs.NB.pvs : pvs5);
            if (!z4) {
                str2 = pvs4.icD();
            }
            pvs6.Jd(str2).vG();
            pvs(jSONObject, z);
            com.bytedance.sdk.openadsdk.icD.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.icD.pvs.pvs.pvs, NB2, pvs5, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.icD.NB(NB2, pvs5, str3, z2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.icD.NB(false, 509, "service_busy", false);
        }
    }

    private void pvs(Map<String, String> map, com.bytedance.sdk.component.yiw.icD.Jd jd) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jd.icD(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            jd.icD(HttpHeaders.USER_AGENT, jlb.vG());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    private void pvs(JSONObject jSONObject, boolean z) {
        if (so.icD().vA()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.yiw.icD.Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
            icD2.icD(jlb.Ju());
            byte[] bArr = null;
            if (z) {
                boolean pvs2 = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(PangleEncryptConstant.CryptDataScene.APP_LOG);
                byte[] NB = NB(jSONObject.toString());
                if (pvs2) {
                    Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(NB);
                    if (encryptType4WithoutBase64 != null && encryptType4WithoutBase64.second != null && ((byte[]) encryptType4WithoutBase64.second).length > 0) {
                        byte[] bArr2 = (byte[]) encryptType4WithoutBase64.second;
                        uc.icD(true);
                        bArr = bArr2;
                    } else {
                        int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                        uc.icD(false);
                        uc.pvs(1, PangleEncryptConstant.CryptDataScene.APP_LOG, intValue);
                    }
                }
                if (bArr != null) {
                    icD2.icD(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                    icD2.icD("x-pgli18n", "4");
                    icD2.pvs("application/octet-stream;tt-data=a", bArr);
                } else {
                    bArr = PangleEncryptManager.encryptV3(NB);
                    if (bArr != null) {
                        pvs(icD(), icD2);
                        icD2.pvs("application/octet-stream;tt-data=a", bArr);
                    } else {
                        com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "V3 encrypt failed");
                    }
                }
            }
            if (bArr == null) {
                JSONObject pvs3 = com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
                if (vG(pvs3)) {
                    jSONObject = pvs3;
                }
                pvs(Jd(jSONObject), icD2);
                icD2.pvs(jSONObject.toString(), mnm.Jd().cR());
            }
            icD2.pvs(7);
            icD2.pvs("et_applog");
            icD2.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.cR.5
                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                    if (icd == null || !icd.sUS()) {
                        return;
                    }
                    Object[] objArr = new Object[2];
                    icd.Jd();
                }

                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                    Object[] objArr = new Object[2];
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public void pvs(String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject icD2;
        if (com.bytedance.sdk.openadsdk.core.settings.kj.pvs() && (icD2 = icD(str, list, str2, str3, str4)) != null) {
            com.bytedance.sdk.component.yiw.icD.Jd icD3 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
            String Jd = jlb.Jd("/api/ad/union/dislike_event/");
            JSONObject pvs2 = pvs(PangleEncryptConstant.CryptDataScene.DISLIKE, icD2);
            String jSONObject = pvs2 != null ? pvs2.toString() : null;
            pvs(icD3, pvs2);
            icD3.icD(Jd);
            icD3.Jd(jSONObject);
            final com.bytedance.sdk.openadsdk.Wyp.pvs.NB nb = new com.bytedance.sdk.openadsdk.Wyp.pvs.NB(6);
            nb.pvs(Jd).icD(jSONObject).pvs();
            icD3.pvs(7);
            icD3.pvs("dislike");
            icD3.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.cR.6
                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                    if (icd != null) {
                        nb.pvs(icd.sUS()).pvs(icd.pvs()).Jd(icd.icD()).vG(icd.Jd()).vG();
                    } else {
                        nb.pvs(false).pvs(com.bytedance.sdk.openadsdk.Wyp.pvs.NB.pvs).vG();
                    }
                }

                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                    nb.pvs(false).Jd(iOException != null ? iOException.getMessage() : null).vG();
                }
            });
        }
    }

    private static JSONObject pvs(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(cryptDataScene)) {
            JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new zM(cryptDataScene));
            uc.pvs(encryptType4);
            return encryptType4;
        }
        return com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
    }

    @DungeonFlag
    private JSONObject icD(String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", pvs(list));
            jSONObject2.put("dislike_source", str4);
            if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().CjQ() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.pvs.pvs(new JSONObject(str2)).toString());
                jSONObject2.put("feedback_type", 1);
                jSONObject2.put("user_description", str3);
            }
            Object[] objArr = new Object[2];
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONArray pvs(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private Map<String, String> Jd(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
        if (vG(jSONObject)) {
            hashMap.put(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
        }
        return hashMap;
    }

    private Map<String, String> icD() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.CONTENT_TYPE, "application/octet-stream;tt-data=a");
        return hashMap;
    }

    private boolean NB(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase(FirebaseAnalytics.Param.SUCCESS);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(vA.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
        pvsVar.pvs(-1, yiw.pvs(-1));
        icd.pvs(-1);
        com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(vA.icD icd) {
        icd.pvs(-1, yiw.pvs(-1));
    }

    @DungeonFlag
    private JSONObject vG() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", so.icD().Jd());
            jSONObject.put("name", so.icD().NB());
            sUS(jSONObject);
            Context pvs2 = mnm.pvs();
            String str = "";
            if (pvs2 != null) {
                try {
                    str = pvs2.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
            }
            jSONObject.put("package_install_path", str);
            jSONObject.put("is_paid_app", so.icD().Wyp());
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.pvs.yiw());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - Ju.pvs()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.Mxy(this.pvs));
            int i = 0;
            jSONObject.put("is_init", Ju.NB() ? 1 : 0);
            if (pvs2 != null) {
                int rotation = ((WindowManager) pvs2.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i = 1;
                } else if (rotation == 1) {
                    i = 3;
                } else if (rotation == 2) {
                    i = 2;
                } else if (rotation == 3) {
                    i = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject pvs(AdSlot adSlot) {
        rCZ rcz;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", mnm.Jd().sq());
            jSONObject.put("lmt", DeviceUtils.vG());
            jSONObject.put("coppa", so.icD().Mxy());
            jSONObject.put("gdpr", so.icD().so());
            jSONObject.put("is_gdpr_user", mnm.Jd().jhZ());
            jSONObject.put("ccpa", so.icD().uc());
            if (adSlot != null && rCZ.pvs.containsKey(Integer.valueOf(adSlot.getCodeId())) && (rcz = rCZ.pvs.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", rcz.icD());
                jSONObject.put("lastbundle", rcz.vG());
                jSONObject.put("lastclick", rcz.Jd());
                jSONObject.put("lastskip", rcz.NB());
            }
            pvs(jSONObject, "keywords", so.icD().qh());
            pvs(jSONObject, "data", icD(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String icD(AdSlot adSlot) {
        String kj = so.icD().kj();
        if (adSlot == null) {
            return TextUtils.isEmpty(kj) ? "" : kj;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(kj)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return kj;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(kj);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return kj;
        }
    }

    private static void pvs(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    @DungeonFlag
    private void sUS(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", jlb.NB());
            jSONObject.put("version_code", jlb.sUS());
            jSONObject.put("version", jlb.yiw());
        } catch (Exception unused) {
        }
    }

    private JSONObject pvs(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.uc ucVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (ucVar != null) {
                jSONObject.put("render_method", ucVar.so);
                if (ucVar.so == 1) {
                    pvs(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (ucVar.so == 2) {
                    pvs(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                pvs(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", icD(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", vG(adSlot.getCodeId()));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (ucVar != null && ucVar.yiw != null) {
                jSONObject.put("session_params", ucVar.yiw);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (ucVar != null && ucVar.NB != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void pvs(JSONObject jSONObject, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void pvs(JSONObject jSONObject, String str, float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f);
            jSONObject2.put("height", (int) f2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    /* compiled from: NetApiImpl.java */
    public static class pvs {
        final int Jd;
        final String Mxy;
        final String NB;
        final ArrayList<Integer> Wyp;
        final long icD;
        final int pvs;
        final int sUS;
        public final com.bytedance.sdk.openadsdk.core.model.pvs so;
        final long vG;
        final String yiw;

        private pvs(String str, int i, int i2, String str2, int i3, String str3, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.pvs = i;
            this.Jd = i2;
            this.NB = str2;
            this.yiw = str3;
            this.so = pvsVar;
            this.Mxy = str;
            this.sUS = i3;
            this.icD = j;
            this.vG = j2;
            this.Wyp = arrayList;
        }

        public static pvs pvs(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uc ucVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString("desc");
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.pvs, ArrayList<Integer>> pvs = com.bytedance.sdk.openadsdk.core.icD.pvs(jSONObject, adSlot, ucVar, icd);
            if (pvs != null && pvs.first != null) {
                ((com.bytedance.sdk.openadsdk.core.model.pvs) pvs.first).pvs(jSONObject.optLong("request_after"));
            }
            if (pvs == null) {
                return new pvs(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
            }
            return new pvs(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.model.pvs) pvs.first, optLong, optLong2, (ArrayList) pvs.second);
        }

        public static pvs pvs(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uc ucVar) {
            JSONArray jSONArray;
            int i;
            String str;
            long j;
            long j2;
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString("desc");
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("adn_bid_result");
                com.bytedance.sdk.openadsdk.core.model.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.model.pvs();
                if (optJSONArray != null) {
                    int i2 = 0;
                    while (i2 < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String optString4 = optJSONObject.optString("name");
                            String optString5 = optJSONObject.optString("render_data");
                            jSONArray = optJSONArray;
                            String optString6 = optJSONObject.optString(FirebaseAnalytics.Param.PRICE);
                            j2 = optLong2;
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("win_notice");
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("loss_notice");
                            j = optLong;
                            String optString7 = optJSONObject.optString("cid");
                            String optString8 = optJSONObject.optString("crid");
                            str = optString3;
                            JSONArray optJSONArray4 = optJSONObject.optJSONArray("adomain");
                            i = optInt3;
                            String optString9 = optJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.so soVar = new com.bytedance.sdk.openadsdk.core.model.so();
                            soVar.pvs(optString4);
                            soVar.icD(optString5);
                            soVar.vG(optString6);
                            soVar.Jd(optString7);
                            soVar.NB(optString8);
                            soVar.sUS(optString9);
                            if (optJSONArray4 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                                    arrayList.add(optJSONArray4.optString(i3));
                                }
                                soVar.vG(arrayList);
                            }
                            if (optJSONArray2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    arrayList2.add(optJSONArray2.optString(i4));
                                }
                                soVar.pvs(arrayList2);
                            }
                            if (optJSONArray3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                                    arrayList3.add(optJSONArray3.optString(i5));
                                }
                                soVar.icD(arrayList3);
                            }
                            pvsVar.pvs(soVar);
                        } else {
                            jSONArray = optJSONArray;
                            i = optInt3;
                            str = optString3;
                            j = optLong;
                            j2 = optLong2;
                        }
                        i2++;
                        optJSONArray = jSONArray;
                        optString3 = str;
                        optLong2 = j2;
                        optLong = j;
                        optInt3 = i;
                    }
                }
                return new pvs(optString, optInt, optInt2, optString2, optInt3, optString3, pvsVar, optLong, optLong2, null);
            }
            return new pvs(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public void pvs(JSONObject jSONObject, final vA.icD icd) {
        if (!com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
            if (icd != null) {
                icd.pvs(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                return;
            }
            return;
        }
        if (jSONObject == null || icd == null) {
            return;
        }
        JSONObject pvs2 = pvs(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        final com.bytedance.sdk.openadsdk.Wyp.pvs.NB nb = new com.bytedance.sdk.openadsdk.Wyp.pvs.NB(5);
        com.bytedance.sdk.component.yiw.icD.Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
        try {
            String pvs3 = com.bytedance.sdk.openadsdk.NB.Jd.pvs(icD2, jlb.Jd("/api/ad/union/sdk/reward_video/reward/"));
            icD2.icD(pvs3);
            nb.pvs(pvs3);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e.getMessage());
        }
        pvs(icD2, pvs2);
        icD2.Jd(pvs2 != null ? pvs2.toString() : "");
        nb.pvs(icD2.vG()).pvs();
        icD2.pvs(10);
        icD2.pvs("reward");
        icD2.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.cR.7
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd2) {
                if (icd2 != null) {
                    if (icd2.sUS() && !TextUtils.isEmpty(icd2.Jd())) {
                        nb.pvs(true).pvs(icd2.pvs()).vG(icd2.Jd()).vG();
                        try {
                            JSONObject jSONObject2 = new JSONObject(icd2.Jd());
                            String icD3 = cR.icD(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(icD3)) {
                                try {
                                    jSONObject2 = new JSONObject(icD3);
                                } catch (Throwable unused) {
                                }
                            }
                            icD pvs4 = icD.pvs(jSONObject2);
                            if (pvs4.pvs != 20000) {
                                icd.pvs(pvs4.pvs, yiw.pvs(pvs4.pvs));
                                return;
                            } else if (pvs4.vG == null) {
                                cR.this.pvs(icd);
                                return;
                            } else {
                                icd.pvs(pvs4);
                                return;
                            }
                        } catch (JSONException e2) {
                            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e2.getMessage());
                            cR.this.pvs(icd);
                            return;
                        }
                    }
                    nb.pvs(icd2.sUS()).vG(icd2.Jd()).pvs(icd2.pvs()).Jd(icd2.icD()).vG();
                    String pvs5 = yiw.pvs(-2);
                    int pvs6 = icd2.pvs();
                    if (!icd2.sUS() && !TextUtils.isEmpty(icd2.icD())) {
                        pvs5 = icd2.icD();
                    }
                    icd.pvs(pvs6, pvs5);
                    return;
                }
                nb.pvs(false).pvs(com.bytedance.sdk.openadsdk.Wyp.pvs.NB.pvs).vG();
                cR.this.pvs(icd);
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                String message = iOException != null ? iOException.getMessage() : "";
                nb.pvs(false).Jd(message).vG();
                icd.pvs(-2, message);
            }
        });
    }

    /* compiled from: NetApiImpl.java */
    public static class icD {
        public final boolean icD;
        public final int pvs;
        public final com.bytedance.sdk.openadsdk.core.model.ZhG vG;

        private icD(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.ZhG zhG) {
            this.pvs = i;
            this.icD = z;
            this.vG = zhG;
        }

        public static icD pvs(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("code");
            boolean optBoolean = jSONObject.optBoolean("verify");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.ZhG zhG = new com.bytedance.sdk.openadsdk.core.model.ZhG();
            if (optJSONObject != null) {
                try {
                    zhG.pvs(optJSONObject.optInt("reason"));
                    zhG.icD(optJSONObject.optInt("corp_type"));
                    zhG.vG(optJSONObject.optInt("reward_amount"));
                    zhG.pvs(optJSONObject.optString("reward_name"));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", th.getMessage());
                }
            }
            return new icD(optInt, optBoolean, zhG);
        }
    }

    public JSONObject icD(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String optString2 = jSONObject.optString("auction_price", "");
            String icD2 = icD(optInt, optString);
            if (TextUtils.isEmpty(icD2)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(icD2);
            try {
                jSONObject2.put("auction_price", optString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String icD(int i, String str) {
        if (i == 3) {
            return com.bytedance.sdk.component.utils.pvs.vG(str);
        }
        if (i == 4) {
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(str);
            if (decryptType4 != null && decryptType4.second != null) {
                String str2 = (String) decryptType4.second;
                uc.pvs(true);
                return str2;
            }
            uc.pvs(false);
            uc.pvs(2, PangleEncryptConstant.CryptDataScene.GET_ADS, decryptType4 != null ? ((Integer) decryptType4.first).intValue() : 0);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public com.bytedance.sdk.openadsdk.icD.NB pvs(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int i;
        String str = "error unknown";
        long currentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.kj.pvs() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.Wyp.pvs.NB nb = new com.bytedance.sdk.openadsdk.Wyp.pvs.NB(4);
        JSONObject pvs2 = pvs(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
        com.bytedance.sdk.component.yiw.icD.Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
        boolean z3 = false;
        try {
            icD2.pvs(pvs2.toString(), mnm.Jd().cR());
            String Jd = jlb.Jd("/api/ad/union/sdk/stats/batch/");
            nb.pvs(Jd).pvs(icD2.vG()).pvs();
            icD2.icD(Jd);
            pvs(icD2, pvs2);
            icD2.icD(HttpHeaders.USER_AGENT, jlb.vG());
            if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().MY()) {
                icD2.icD("_disable_retry", "1");
            }
            com.bytedance.sdk.component.yiw.icD pvs3 = icD2.pvs();
            try {
            } catch (Throwable unused) {
                z = false;
                z2 = false;
                i = 0;
            }
            if (pvs3 == null) {
                return new com.bytedance.sdk.openadsdk.icD.NB(false, 0, "error unknown", false);
            }
            if (!pvs3.sUS() || TextUtils.isEmpty(pvs3.Jd())) {
                z = false;
                z2 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(pvs3.Jd());
                int optInt = jSONObject2.optInt("code", -1);
                str = jSONObject2.optString("data", "");
                z = optInt == 20000;
                z2 = optInt == 60005;
            }
            try {
                i = pvs3.pvs();
                try {
                    if (!pvs3.sUS()) {
                        str = pvs3.icD();
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                i = 0;
            }
            boolean z4 = pvs3 == null;
            if (!z4 && pvs3.sUS()) {
                z3 = true;
            }
            nb.pvs(z3).vG(z4 ? null : pvs3.Jd()).pvs(z4 ? com.bytedance.sdk.openadsdk.Wyp.pvs.NB.pvs : i).Jd(z4 ? null : pvs3.icD()).vG();
            com.bytedance.sdk.openadsdk.icD.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.icD.pvs.pvs.icD, z, i, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.icD.NB(z, i, str, z2);
        } catch (Throwable unused4) {
            com.bytedance.sdk.openadsdk.icD.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.icD.pvs.pvs.icD, false, 0, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.icD.NB(false, 0, "error unknown", false);
        }
    }

    private void pvs(com.bytedance.sdk.component.yiw.icD.Jd jd, JSONObject jSONObject) {
        try {
            if (vG(jSONObject) && jSONObject.optInt("cypher") == 4) {
                jd.icD("x-pgli18n", "4");
                jd.icD(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvs() {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
            return null;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tpl_fetch_model", "date", 0L);
        String od = mnm.Jd().od();
        String icD2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tpl_fetch_model", "last_url", "");
        if (currentTimeMillis <= mnm.Jd().ae() && currentTimeMillis >= 0 && TextUtils.equals(od, icD2)) {
            String icD3 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(icD3)) {
                    return com.bytedance.sdk.component.adexpress.pvs.vG.pvs.Jd(icD3);
                }
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
        try {
            vG.icD(com.bytedance.sdk.openadsdk.NB.Jd.pvs(vG, od));
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e.getMessage());
        }
        com.bytedance.sdk.component.yiw.icD pvs2 = vG.pvs();
        if (pvs2 == null) {
            return null;
        }
        try {
            if (!pvs2.sUS()) {
                return null;
            }
            String Jd = pvs2.Jd();
            pvsVar = com.bytedance.sdk.component.adexpress.pvs.vG.pvs.Jd(Jd);
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tpl_fetch_model", "model", Jd);
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tpl_fetch_model", "last_url", od);
            return pvsVar;
        } catch (Exception unused2) {
            return pvsVar;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public void pvs(String str) {
        com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
        vG.icD(str);
        vG.pvs("upload_bidding");
        vG.pvs(7);
        vG.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.cR.8
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                icd.Jd();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.vA
    public void pvs(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.yiw.icD.Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
        icD2.icD(str);
        icD2.pvs(jSONObject);
        icD2.pvs(5);
        icD2.pvs("apm_pv");
        icD2.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.cR.9
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                icd.Jd();
            }
        });
    }

    public static JSONArray icD(String str) {
        try {
            Set<String> icD2 = com.bytedance.sdk.component.adexpress.pvs.icD.icD.icD(str);
            if (icD2 != null && icD2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = icD2.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pvs.vG.icD pvs2 = com.bytedance.sdk.component.adexpress.pvs.icD.icD.pvs(it.next());
                    if (pvs2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(FacebookMediationAdapter.KEY_ID, pvs2.icD());
                        jSONObject.put("md5", pvs2.vG());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    public static JSONArray vG(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs> pvs2 = com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs().pvs(str);
            if (pvs2 != null && pvs2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ugen.pvs.pvs pvsVar : pvs2) {
                    if (pvsVar != null && !TextUtils.isEmpty(pvsVar.NB())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = pvsVar.pvs().split("_");
                        if (split.length == 2) {
                            jSONObject.put(FacebookMediationAdapter.KEY_ID, split[1]);
                            jSONObject.put("md5", pvsVar.icD());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private byte[] NB(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e2.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes("utf-8"));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e3.toString());
                }
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e5) {
                        com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e5.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e6) {
                        com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e6.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        com.bytedance.sdk.component.utils.Ju.pvs("NetApiImpl", e7.toString());
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return bArr;
    }
}

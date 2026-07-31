package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.B5;
import com.ironsource.C4913ua;
import com.ironsource.O6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
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
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class uqh implements nqi<com.bytedance.sdk.openadsdk.fb.zmn> {
    private final Context zmn;

    uqh(Context context) {
        this.zmn = context;
    }

    @DungeonFlag
    private JSONObject fs(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = zmn(PangleEncryptConstant.CryptDataScene.GET_ADS, zmn(adSlot, kjbVar, i));
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("body data exception", th);
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    @NonNull
    public JSONObject zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, int i) throws JSONException {
        int i2;
        int i3;
        String str;
        int i4;
        JSONObject jSONObject = new JSONObject();
        String btk = (kjbVar == null || TextUtils.isEmpty(kjbVar.zmn)) ? com.bytedance.sdk.openadsdk.utils.oub.btk() : kjbVar.zmn;
        if (i == 7) {
            if (kjbVar != null && (i4 = kjbVar.fs) > 0) {
                jSONObject.put("req_type", i4);
            }
        } else if (i == 8) {
            if (kjbVar != null && (i3 = kjbVar.zn) > 0) {
                jSONObject.put("req_type", i3);
            }
        } else if (i == 3 && kjbVar != null && (i2 = kjbVar.fb) > 0) {
            jSONObject.put("req_type", i2);
        }
        try {
            String bvs = kgc.fb().bvs();
            String zak = kgc.fb().zak();
            if (bvs != null && zak != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", bvs);
                jSONObject2.put("param", zak);
                jSONObject.put("abtest", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        jSONObject.put("request_id", btk);
        com.bytedance.sdk.openadsdk.utils.oub.zmn(jSONObject);
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.iv.mw.zn());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.iv.mw.fb());
        jSONObject.put("source_type", "app");
        String zmn2 = mw.zmn(this.zmn);
        if (!TextUtils.isEmpty(zmn2)) {
            try {
                jSONObject.put("did", Long.parseLong(zmn2));
            } catch (Throwable unused2) {
            }
        }
        jSONObject.put("app", fs());
        jSONObject.put("device", DeviceUtils.zmn(this.zmn, true));
        jSONObject.put(POBConstants.KEY_USER, zmn(adSlot));
        jSONObject.put("ua", com.bytedance.sdk.openadsdk.utils.oub.fb());
        jSONObject.put("channel", X3.i.Z);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(zmn(adSlot, i, kjbVar));
        jSONObject.put("adslots", jSONArray);
        zmn(jSONObject, kjbVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("ts", currentTimeMillis);
        if (adSlot != null && adSlot.getCodeId() != null && btk != null) {
            str = String.valueOf(currentTimeMillis).concat(adSlot.getCodeId()).concat(btk);
        } else {
            str = "";
        }
        jSONObject.put("req_sign", com.bytedance.sdk.component.utils.btk.zmn(str));
        if (com.bytedance.sdk.openadsdk.core.klz.zn.btk() != 0) {
            jSONObject.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.klz.zn.btk()));
        }
        jSONObject.put("adx_id", iv.fs().doe());
        com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn(jSONObject);
        return jSONObject;
    }

    private void zmn(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar) {
        JSONArray jSONArray;
        if (kjbVar == null || (jSONArray = kjbVar.btk) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    private boolean fb(String str) {
        if (com.bytedance.sdk.openadsdk.core.bvs.fs.zmn()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.bvs.fs.zmn(str)) {
            return false;
        }
        String fs2 = com.bytedance.sdk.openadsdk.core.bvs.fs.fs();
        if (!TextUtils.isEmpty(fs2)) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(fs2, System.currentTimeMillis());
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public void zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, int i, phc phcVar) {
        if (kjbVar.hhw || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            zmn(adSlot, kjbVar, i, (nqi.zmn) phcVar);
            return;
        }
        if (!zmn(kjbVar) && phcVar != null) {
            String zmn2 = phcVar.zmn();
            if (!TextUtils.isEmpty(zmn2)) {
                kjbVar.klz = zmn2;
                kjbVar.mw = phcVar;
            }
        }
        zmn(adSlot, kjbVar, i, (nqi.zmn) phcVar);
    }

    private boolean zmn(com.bytedance.sdk.openadsdk.core.model.kjb kjbVar) {
        if (kjbVar != null) {
            return kjbVar.fs == 2 || kjbVar.zn == 2 || kjbVar.fb == 2;
        }
        return false;
    }

    public void zmn(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, final int i, nqi.zmn zmnVar) {
        if (kjbVar != null && (kjbVar.fs == 2 || kjbVar.zn == 2 || kjbVar.fb == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.fs.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.core.fs.zmn(zmnVar, adSlot, (adSlot.isPreload() || kjbVar == null || kjbVar.hhw) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cn.fs().post(new com.bytedance.sdk.component.zg.fs.zn("getAd") { // from class: com.bytedance.sdk.openadsdk.core.uqh.1
                @Override // java.lang.Runnable
                public void run() {
                    uqh.this.fs(adSlot, kjbVar, i, zmnVar2);
                }
            });
        } else {
            fs(adSlot, kjbVar, i, zmnVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(22:95|(1:99)|100|101|102|(2:104|(18:106|107|108|109|110|(2:114|(6:117|118|119|121|122|115))|126|127|128|(1:165)(1:131)|(1:133)|134|(1:136)(1:164)|137|(1:139)|(1:141)(9:144|145|146|(1:148)|149|150|152|(2:154|155)(1:158)|156)|142|143))|171|110|(3:112|114|(1:115))|126|127|128|(0)|165|(0)|134|(0)(0)|137|(0)|(0)(0)|142|143) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ca  */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.bytedance.sdk.openadsdk.core.uqh] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [com.bytedance.sdk.component.nps.fs] */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.bytedance.sdk.openadsdk.core.uqh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fs(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, final int i, final nqi.zmn zmnVar) {
        com.bytedance.sdk.openadsdk.core.model.zn znVar;
        Map<String, String> zmn2;
        boolean z;
        Map<String, Object> map;
        com.bytedance.sdk.component.nps.fs fsVar;
        ?? r20;
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar2;
        ?? r13 = this;
        if (!com.bytedance.sdk.openadsdk.core.rc.fs.zmn().hhw()) {
            zmnVar.zmn(40060, bvs.zmn(40060));
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().fb()) {
            zmnVar.zmn(10007, bvs.zmn(10007));
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.rc.fs.zmn().bvs()) {
            zmnVar.zmn(10008, bvs.zmn(10008));
            return;
        }
        boolean fb = com.bytedance.sdk.openadsdk.uqh.btk.fb();
        com.bytedance.sdk.openadsdk.core.model.zn znVar2 = new com.bytedance.sdk.openadsdk.core.model.zn();
        znVar2.zmn(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.nps.zmn()) {
            if (zmnVar != null) {
                zmnVar.zmn(1000, "Ad request is temporarily paused, Please contact your AM");
                znVar2.zmn(1000);
                com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar2);
                return;
            }
            return;
        }
        if (!kgc.fb().kra()) {
            if (zmnVar != null) {
                zmnVar.zmn(-16, bvs.zmn(-16));
                znVar2.zmn(1001);
                com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar2);
                return;
            }
            return;
        }
        if (zmnVar == null) {
            return;
        }
        if (r13.fb(adSlot.getCodeId())) {
            zmnVar.zmn(-8, bvs.zmn(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !kjbVar.hhw) {
            znVar2.fs(2);
            znVar2.zmn(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.cn.zn()) {
                com.bykv.vk.openvk.zmn.zmn.zmn.nps.fs.zmn(adSlot.getBidAdm());
            }
            if (kgc.fb().tet() && ev.zmn().fb() == 1) {
                com.bytedance.sdk.openadsdk.utils.oub.zmn("Pangle_Debug_Mode", adSlot.getBidAdm(), r13.zmn);
            }
            try {
                JSONObject zmn3 = r13.zmn(PangleNetworkBridge.jsonObjectInit(adSlot.getBidAdm()));
                if (zmn3 == null) {
                    znVar2.zn(12);
                    r13.zmn(zmnVar, znVar2);
                    return;
                }
                zmn zmn4 = zmn.zmn(zmn3, adSlot, kjbVar);
                znVar2.zmn(zmn4.iv);
                mw.zmn(zmn4.bvs);
                int i2 = zmn4.fb;
                if (i2 != 20000) {
                    zmnVar.zmn(i2, zmn4.btk);
                    znVar2.zmn(zmn4.fb);
                    znVar2.zn(9);
                    com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar2);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.zmn zmnVar3 = zmn4.zg;
                if (zmnVar3 == null) {
                    znVar2.zn(13);
                    r13.zmn(zmnVar, znVar2);
                    return;
                }
                if (zmnVar3.btk() != null && !zmn4.zg.btk().isEmpty()) {
                    com.bytedance.sdk.openadsdk.cyb.fb.zmn(zmn4.zg.btk().get(0));
                }
                r13.zmn(zmn4.zg);
                if (r13.zmn(zmn4.zg, zmnVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn(zmn4.zg);
                zmnVar.zmn(zmn4.zg, znVar2);
                Map<String, com.bytedance.sdk.openadsdk.core.model.nqi> zmn5 = com.bytedance.sdk.openadsdk.core.model.zmn.zmn(zmn4.zg);
                if (zmn5 != null) {
                    com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(zmn5);
                }
                r13.zmn(zmn4.zg, i);
                com.bytedance.sdk.openadsdk.core.btk.zmn.zmn().zmn(zmn4.zg);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zmn("NetApiImpl", "get ad error: ", th);
                znVar2.zn(14);
                znVar2.fs(th.getMessage());
                r13.zmn(zmnVar, znVar2);
                return;
            }
        }
        if (kjbVar != null && !TextUtils.isEmpty(kjbVar.klz)) {
            try {
                JSONObject zmn6 = r13.zmn(PangleNetworkBridge.jsonObjectInit(kjbVar.klz));
                if (zmn6 != null) {
                    zmn zmn7 = zmn.zmn(zmn6, adSlot, kjbVar);
                    phc phcVar = kjbVar.mw;
                    if (phcVar != null && (zmnVar2 = zmn7.zg) != null && phcVar.zmn(zmnVar2)) {
                        com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn(zmnVar2);
                        zmnVar.zmn(zmnVar2, znVar2);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject fs2 = fs(adSlot, kjbVar, i);
        if (fs2 == null) {
            zmnVar.zmn(-9, bvs.zmn(-9));
            znVar2.zmn(-9);
            com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar2);
            return;
        }
        if (kgc.fb().tet() && ev.zmn().fb() == 1) {
            com.bytedance.sdk.openadsdk.utils.oub.zmn("Pangle_Debug_Mode", fs2.toString(), r13.zmn);
        }
        String zmn8 = com.bytedance.sdk.openadsdk.utils.oub.zmn("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.nps.fs.fb fs3 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        List<String> list = null;
        try {
            fs3.zn(com.bytedance.sdk.openadsdk.bvs.fb.zmn(fs3, zmn8));
        } catch (Exception unused2) {
        }
        if (com.bytedance.sdk.openadsdk.utils.fs.fs()) {
            list = com.bytedance.sdk.openadsdk.utils.oub.zmn("/api/ad/union/sdk/get_ads/", true);
            if (!list.isEmpty()) {
                fs3.zmn(list);
                znVar = znVar2;
                try {
                    fs3.zmn(60L, TimeUnit.SECONDS);
                } catch (Exception unused3) {
                }
                final List<String> list2 = list;
                fs3.zmn(fs2.toString(), kgc.fb().cyb());
                zmn2 = com.bytedance.sdk.openadsdk.core.klz.zn.zmn(zmn8, fs2.toString());
                if (zmn2 != null && zmn2.size() > 0) {
                    for (String str : zmn2.keySet()) {
                        try {
                            fs3.fs(str, zmn2.get(str));
                        } catch (Exception e) {
                            com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e.getMessage());
                        }
                    }
                }
                fs3.fs("User-Agent", com.bytedance.sdk.openadsdk.utils.oub.fb());
                r13.zmn(fs3, fs2);
                final com.bytedance.sdk.openadsdk.utils.ww fs4 = com.bytedance.sdk.openadsdk.utils.ww.fs();
                final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
                z = (iv.fs().cn() || requestExtraMap == null) ? false : true;
                if (z) {
                    requestExtraMap.put("pgad_start", fs4);
                }
                fs3.zmn(10);
                fs3.fs("get_ad");
                if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.11
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar4 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar4.fs("get_ad");
                            zmnVar4.zn(adSlot.getCodeId());
                            zmnVar4.fb(com.bytedance.sdk.openadsdk.utils.oub.zn(adSlot.getDurationSlotType()));
                            return zmnVar4;
                        }
                    });
                } else {
                    fs3.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.12
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar4 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar4.fs("get_ad");
                            zmnVar4.zn(adSlot.getCodeId());
                            zmnVar4.fb(com.bytedance.sdk.openadsdk.utils.oub.zn(adSlot.getDurationSlotType()));
                            return zmnVar4;
                        }
                    });
                }
                if (com.bytedance.sdk.component.utils.cn.zn()) {
                    Thread.currentThread().getName();
                }
                if (fb) {
                    final boolean z2 = z;
                    final com.bytedance.sdk.openadsdk.core.model.zn znVar3 = znVar;
                    fs3.fs(new com.bytedance.sdk.component.nps.zmn.fs() { // from class: com.bytedance.sdk.openadsdk.core.uqh.13
                        @Override // com.bytedance.sdk.component.nps.zmn.zmn
                        public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar4, com.bytedance.sdk.component.nps.fs fsVar2) {
                            uqh.this.zmn(znVar4, fsVar2, z2, requestExtraMap, fs4, adSlot, znVar3, zmnVar, kjbVar, i, list2);
                        }

                        @Override // com.bytedance.sdk.component.nps.zmn.fs
                        public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar4, IOException iOException, com.bytedance.sdk.component.nps.fs fsVar2) {
                            uqh.this.zmn(fs3, iOException, fsVar2, adSlot, z2, requestExtraMap, zmnVar, znVar3, list2);
                            if (znVar4 != null) {
                                com.bytedance.sdk.openadsdk.utils.nqi.zmn(znVar4.hhw());
                            }
                        }
                    });
                    r13 = 0;
                } else {
                    try {
                        com.bytedance.sdk.component.nps.fs btk = fs3.btk();
                        if (btk == null) {
                            r20 = new com.bytedance.sdk.component.nps.fs(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L);
                        }
                        fsVar = btk;
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = 0;
                        map = requestExtraMap;
                    }
                    try {
                        if (fsVar.hhw()) {
                            r13 = 0;
                            r20 = requestExtraMap;
                            zmn(fs3, fsVar, z, requestExtraMap, fs4, adSlot, znVar, zmnVar, kjbVar, i, list2);
                        } else {
                            r13 = 0;
                            Map<String, Object> map2 = requestExtraMap;
                            zmn(fs3, new IOException(fsVar.fs()), fsVar, adSlot, z, map2, zmnVar, znVar, list2);
                            com.bytedance.sdk.openadsdk.utils.nqi.zmn(fs3.hhw());
                            r20 = map2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = r13;
                        map = r20;
                        zmn(fs3, new IOException(th.getMessage()), new com.bytedance.sdk.component.nps.fs(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z, map, zmnVar, znVar, list2);
                        com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(r13);
                    }
                }
                com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(r13);
            }
        }
        znVar = znVar2;
        final List list22 = list;
        fs3.zmn(fs2.toString(), kgc.fb().cyb());
        zmn2 = com.bytedance.sdk.openadsdk.core.klz.zn.zmn(zmn8, fs2.toString());
        if (zmn2 != null) {
            while (r6.hasNext()) {
            }
        }
        fs3.fs("User-Agent", com.bytedance.sdk.openadsdk.utils.oub.fb());
        r13.zmn(fs3, fs2);
        final com.bytedance.sdk.openadsdk.utils.ww fs42 = com.bytedance.sdk.openadsdk.utils.ww.fs();
        final Map requestExtraMap2 = adSlot.getRequestExtraMap();
        if (iv.fs().cn()) {
        }
        if (z) {
        }
        fs3.zmn(10);
        fs3.fs("get_ad");
        if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
        }
        if (com.bytedance.sdk.component.utils.cn.zn()) {
        }
        if (fb) {
        }
        com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(r13);
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        com.bytedance.sdk.openadsdk.core.model.nqi nps;
        if (zmnVar == null || (nps = zmnVar.nps()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.rc.yj(nps.qr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.component.nps.fs.fb fbVar, IOException iOException, com.bytedance.sdk.component.nps.fs fsVar, final AdSlot adSlot, boolean z, Map<String, Object> map, nqi.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar, List<String> list) {
        String str;
        int i;
        if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.14
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar2.fs("get_ad");
                    zmnVar2.zn(adSlot.getCodeId());
                    zmnVar2.fb(com.bytedance.sdk.openadsdk.utils.oub.zn(adSlot.getDurationSlotType()));
                    return zmnVar2;
                }
            });
        }
        if (fsVar != null) {
            str = fsVar.fs();
        } else if (iOException == null) {
            str = "";
        } else {
            str = iOException.getMessage();
        }
        String str2 = str;
        com.bytedance.sdk.openadsdk.utils.ww fs2 = com.bytedance.sdk.openadsdk.utils.ww.fs();
        if (z) {
            map.put("pgad_end", Long.valueOf(fs2.zmn));
        }
        if (kgc.fb().tet() && ev.zmn().fb() == 1) {
            com.bytedance.sdk.openadsdk.utils.oub.zmn("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.zmn);
        }
        if (fsVar != null) {
            i = fsVar.zmn();
        } else {
            i = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
        }
        int i2 = i;
        if (zmnVar != null) {
            zmnVar.zmn(i2, str2);
        }
        znVar.zmn(i2);
        znVar.zn(10);
        znVar.fs(str2);
        com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
        com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("get_ad", fbVar.hhw(), i2, str2, fbVar.zn(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:11:0x002d, B:13:0x0047, B:15:0x0051, B:16:0x0062, B:18:0x0068, B:21:0x0071, B:23:0x0085, B:25:0x0092, B:27:0x0099, B:28:0x00aa, B:30:0x00a3, B:31:0x00b3, B:33:0x00b7, B:35:0x00c0, B:38:0x00c7, B:40:0x00d2, B:42:0x00d6, B:43:0x00db, B:48:0x00e9, B:50:0x00f1, B:52:0x00fd, B:92:0x011d, B:94:0x0129, B:58:0x0136, B:60:0x0143, B:61:0x0154, B:62:0x014c, B:63:0x0157, B:66:0x0178, B:67:0x019f, B:69:0x01bf, B:70:0x01c6, B:72:0x01ce, B:75:0x01dc), top: B:10:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.ww wwVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zn znVar2, nqi.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, int i, List<String> list) {
        nqi.zmn zmnVar2;
        com.bytedance.sdk.openadsdk.core.model.zn znVar3;
        Object[] objArr;
        Map<String, com.bytedance.sdk.openadsdk.core.model.nqi> zmn2;
        JSONObject jSONObject;
        String str;
        com.bytedance.sdk.openadsdk.core.model.so soVar;
        if (z) {
            map.put("pgad_end", wwVar);
        }
        if (fsVar == null) {
            return;
        }
        if (fsVar.hhw()) {
            if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.15
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar3.fs("get_ad");
                        zmnVar3.zn(adSlot.getCodeId());
                        zmnVar3.fb(com.bytedance.sdk.openadsdk.utils.oub.zn(adSlot.getDurationSlotType()));
                        return zmnVar3;
                    }
                });
            }
            try {
                com.bytedance.sdk.openadsdk.utils.ww fs2 = com.bytedance.sdk.openadsdk.utils.ww.fs();
                String fb = fsVar.fb();
                znVar2.zmn(fb);
                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fb);
                if (kgc.fb().tet() && ev.zmn().fb() == 1) {
                    com.bytedance.sdk.openadsdk.utils.oub.zmn("Pangle_Debug_Mode", jsonObjectInit.toString(), this.zmn);
                }
                JSONObject zmn3 = zmn(jsonObjectInit);
                if (zmn3 == null) {
                    znVar2.zn(12);
                    zmn(zmnVar, znVar2);
                    return;
                }
                zmn zmn4 = zmn.zmn(zmn3, adSlot, kjbVar);
                znVar2.zmn(zmn4.iv);
                mw.zmn(zmn4.bvs);
                int i2 = zmn4.fb;
                if (i2 != 20000) {
                    znVar2.zmn(i2);
                    if (!kgc.fb().nu() && zmn4.fb == 40029) {
                        zmnVar.zmn(-100, bvs.zmn(-100));
                    } else {
                        zmnVar.zmn(zmn4.fb, zmn4.btk);
                    }
                    znVar2.zn(9);
                    com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar2);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.zmn zmnVar3 = zmn4.zg;
                if (zmnVar3 == null) {
                    znVar2.zn(13);
                    zmn(zmnVar, znVar2);
                    return;
                }
                if (zmn(zmnVar3, zmnVar)) {
                    return;
                }
                zmn4.zg.zn(fb);
                com.bytedance.sdk.openadsdk.utils.ww fs3 = com.bytedance.sdk.openadsdk.utils.ww.fs();
                if (kjbVar != null && (soVar = kjbVar.rc) != null) {
                    soVar.zmn(wwVar, fs2, zmn4.zmn, fs3);
                }
                Object[] objArr2 = com.bytedance.sdk.openadsdk.uqh.btk.btk() && i == 1;
                if (objArr2 != false && zmn4.zg.btk() != null && !zmn4.zg.btk().isEmpty()) {
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = zmn4.zg.btk().get(0);
                    String zn = com.bytedance.sdk.openadsdk.utils.oub.zn(i);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    long j = 0;
                    if (kjbVar != null) {
                        try {
                            com.bytedance.sdk.openadsdk.utils.ww wwVar2 = kjbVar.iv;
                            jSONObject = jSONObject2;
                            str = zn;
                            if (wwVar2.zmn > 0) {
                                j = fs3.zmn(wwVar2);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        jSONObject = jSONObject2;
                        str = zn;
                    }
                    long j2 = j;
                    if (nqiVar != null) {
                        boolean sxr = nqiVar.sxr();
                        jSONObject3.put("is_new_engine", sxr ? 1 : 0);
                        jSONObject3.put("webview_cache_size", sxr ? com.bytedance.sdk.component.adexpress.btk.btk.zmn().fb() : com.bytedance.sdk.component.adexpress.btk.btk.zmn().zn());
                    }
                    JSONObject jSONObject4 = jSONObject;
                    objArr = objArr2;
                    String str2 = str;
                    try {
                        zmn(fsVar.nps(), kjbVar, wwVar, fs2, zmn4.zmn, fs3, nqiVar, str2, jSONObject3, true);
                        jSONObject4.put(IronSourceConstants.EVENTS_DURATION, j2);
                        jSONObject4.put("extra_data", jSONObject3);
                        jSONObject4.put("tag", str2);
                        jSONObject4.put("callback_start", fs3.zmn());
                        zmn4.zg.zmn(jSONObject4);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn(zmn4.zg);
                    zmnVar.zmn(zmn4.zg, znVar2);
                    zmn(zmn4.zg, i);
                    com.bytedance.sdk.openadsdk.core.btk.zmn.zmn().zmn(zmn4.zg);
                    zmn2 = com.bytedance.sdk.openadsdk.core.model.zmn.zmn(zmn4.zg);
                    if (zmn2 != null) {
                        com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(zmn2);
                    }
                    if (zmn4.zg.btk() != null || zmn4.zg.btk().isEmpty() || objArr == true) {
                        return;
                    }
                    zmnVar2 = zmnVar;
                    znVar3 = znVar2;
                    try {
                        zmn(fsVar.nps(), kjbVar, wwVar, fs2, zmn4.zmn, fs3, zmn4.zg.btk().get(0), com.bytedance.sdk.openadsdk.utils.oub.zn(i));
                        return;
                    } catch (Throwable th) {
                        th = th;
                        com.bytedance.sdk.component.utils.iqz.zmn("NetApiImpl", "get ad error: ", th);
                        znVar3.fs(th.getMessage());
                        znVar3.zn(14);
                        zmn(zmnVar2, znVar3);
                        com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("get_ad", znVar.hhw(), -9, th.getMessage(), znVar.zn(), list);
                        ApmHelper.reportCustomError("", "parse_error", th);
                        return;
                    }
                }
                objArr = objArr2;
                com.bytedance.sdk.openadsdk.core.rt.zn.fb.zmn(zmn4.zg);
                zmnVar.zmn(zmn4.zg, znVar2);
                zmn(zmn4.zg, i);
                com.bytedance.sdk.openadsdk.core.btk.zmn.zmn().zmn(zmn4.zg);
                zmn2 = com.bytedance.sdk.openadsdk.core.model.zmn.zmn(zmn4.zg);
                if (zmn2 != null) {
                }
                if (zmn4.zg.btk() != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                zmnVar2 = zmnVar;
                znVar3 = znVar2;
            }
        } else {
            if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.16
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar4 = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar4.fs("get_ad");
                        zmnVar4.zn(adSlot.getCodeId());
                        zmnVar4.fb(com.bytedance.sdk.openadsdk.utils.oub.zn(adSlot.getDurationSlotType()));
                        return zmnVar4;
                    }
                });
            }
            int zmn5 = fsVar.zmn();
            String fs4 = fsVar.fs();
            zmnVar.zmn(zmn5, fs4);
            znVar2.zmn(zmn5);
            znVar2.zn(11);
            znVar2.fs(fs4);
            com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar2);
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("get_ad", znVar.hhw(), zmn5, fs4, znVar.zn(), list);
        }
    }

    private boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, nqi.zmn zmnVar2) {
        if (zmnVar == null) {
            zmnVar2.zmn(40053, bvs.zmn(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.nqi> btk = zmnVar.btk();
        if (btk.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar : btk) {
            if (TextUtils.isEmpty(nqiVar.ew().fs()) || TextUtils.isEmpty(nqiVar.ew().zn())) {
                zmnVar2.zmn(40053, bvs.zmn(40053));
                com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, com.bytedance.sdk.openadsdk.utils.oub.zmn(nqiVar), "material_error", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.uqh.17
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", nqiVar.ew().nps());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, int i) {
        List<com.bytedance.sdk.openadsdk.core.model.kgc> tj;
        List<com.bytedance.sdk.openadsdk.core.model.nqi> btk = zmnVar.btk();
        if (btk == null || btk.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < btk.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = btk.get(i2);
            if (nqiVar != null && nqiVar.bxw() == null) {
                zmn("", 0, 0, nqiVar.uaq(), nqiVar);
                if (i == 3) {
                    zmn("", 0, 0, nqiVar.quu(), nqiVar);
                }
                if (nqiVar.mrt() != null) {
                    zmn(nqiVar.mrt().iv(), nqiVar.mrt().zn(), nqiVar.mrt().fs(), (com.bytedance.sdk.openadsdk.core.model.kgc) null, nqiVar);
                }
                if ((i != 1 || nqiVar.mrt() == null) && (tj = nqiVar.tj()) != null && tj.size() > 0) {
                    for (int i3 = 0; i3 < tj.size(); i3++) {
                        zmn(nqiVar, tj.get(i3));
                    }
                }
            }
        }
    }

    private void zmn(String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.kgc kgcVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.iv.fb.zmn(str).zmn(i).fs(i2).btk(jy.btk(kgc.zmn())).fb(jy.zn(kgc.zmn())).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, str, null), 4);
        } else {
            if (kgcVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.iv.fb.zmn(kgcVar).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, kgcVar.zmn(), null), 4);
        }
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, com.bytedance.sdk.openadsdk.core.model.kgc kgcVar) {
        if (kgcVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.iv.fb.zmn(kgcVar).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, kgcVar.zmn(), new com.bytedance.sdk.component.btk.cyb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.18
            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(int i, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            }
        }), 4);
    }

    private void zmn(com.bytedance.sdk.component.fs.zmn.iv ivVar, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, com.bytedance.sdk.openadsdk.utils.ww wwVar, com.bytedance.sdk.openadsdk.utils.ww wwVar2, int i, com.bytedance.sdk.openadsdk.utils.ww wwVar3, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str) {
        if (kgc.fb().ve()) {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            if (kjbVar != null) {
                try {
                    com.bytedance.sdk.openadsdk.utils.ww wwVar4 = kjbVar.iv;
                    if (wwVar4.zmn > 0) {
                        j = wwVar3.zmn(wwVar4);
                        long j2 = j;
                        zmn(ivVar, kjbVar, wwVar, wwVar2, i, wwVar3, nqiVar, str, jSONObject, false);
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, "load_ad_time", j2, jSONObject);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            long j22 = j;
            zmn(ivVar, kjbVar, wwVar, wwVar2, i, wwVar3, nqiVar, str, jSONObject, false);
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, "load_ad_time", j22, jSONObject);
        }
    }

    private static void zmn(com.bytedance.sdk.component.fs.zmn.iv ivVar, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar, com.bytedance.sdk.openadsdk.utils.ww wwVar, com.bytedance.sdk.openadsdk.utils.ww wwVar2, int i, com.bytedance.sdk.openadsdk.utils.ww wwVar3, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, JSONObject jSONObject, boolean z) throws JSONException {
        if (kjbVar != null) {
            com.bytedance.sdk.openadsdk.utils.ww wwVar4 = kjbVar.iv;
            if (wwVar4.zmn > 0) {
                jSONObject.put("client_start_time", wwVar.zmn(wwVar4));
            }
        }
        jSONObject.put("network_time", wwVar2.zmn(wwVar));
        jSONObject.put("sever_time", i);
        jSONObject.put("client_end_time", wwVar3.zmn(wwVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", nqiVar.yj() ? 1 : 0);
        }
        if (nqiVar != null) {
            jSONObject.put("render_control_type", nqiVar.nkt());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.btk.btk.zmn().zn());
        jSONObject.put("sync_barrier_open", z ? 1 : 0);
        long j = ivVar.fs;
        if (j > 0) {
            jSONObject.put("enqueue_2_run_ts", ivVar.zn - j);
            jSONObject.put("run_2_connect_end_ts", ivVar.btk - ivVar.fs);
            jSONObject.put("connect_end_2_response_end_ts", ivVar.hhw - ivVar.btk);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - ivVar.hhw);
        }
    }

    private boolean zn(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    @WorkerThread
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.fb.btk zmn(JSONObject jSONObject, String str, List<String> list) {
        String str2;
        boolean z;
        Object obj;
        try {
            byte[] bArr = null;
            if (com.bytedance.sdk.openadsdk.core.settings.nps.zmn() && !com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
                com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
                fs2.zn(str);
                if (com.bytedance.sdk.openadsdk.utils.fs.fs() && list != null && !list.isEmpty()) {
                    fs2.zmn(list);
                    fs2.zmn(60L, TimeUnit.SECONDS);
                }
                if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().nlz()) {
                    fs2.fs("_disable_retry", "1");
                }
                Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(btk(jSONObject.toString()));
                if (encryptType4WithoutBase64 != null && (obj = encryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                    bArr = (byte[]) obj;
                    rp.fs(true);
                } else {
                    int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                    rp.fs(false);
                    rp.zmn(1, PangleEncryptConstant.CryptDataScene.APP_LOG, intValue);
                }
                if (bArr != null) {
                    fs2.fs("Content-Encoding", "union_sdk_encode");
                    fs2.fs("x-pgli18n", "4");
                    fs2.zmn("application/octet-stream;tt-data=a", bArr);
                }
                if (bArr == null) {
                    try {
                        JSONObject zmn2 = com.bytedance.sdk.component.utils.zmn.zmn(jSONObject);
                        if (!zn(zmn2)) {
                            zmn2 = jSONObject;
                        }
                        zmn(btk(zmn2), fs2);
                        fs2.zmn(zmn2.toString(), kgc.fb().cyb());
                    } catch (OutOfMemoryError e) {
                        com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e.toString());
                        return new com.bytedance.sdk.openadsdk.fb.btk(false, -2, "encrypt_error", false);
                    }
                }
                com.bytedance.sdk.component.nps.fs btk = fs2.btk();
                boolean hhw = (btk == null || !btk.hhw() || TextUtils.isEmpty(btk.fb())) ? false : hhw(PangleNetworkBridge.jsonObjectInit(btk.fb()));
                String str3 = "error unknown";
                int zmn3 = btk != null ? btk.zmn() : 0;
                if (!hhw && zmn3 == 200) {
                    str2 = "server say not success";
                    z = true;
                } else {
                    if (btk != null && btk.fs() != null) {
                        str3 = btk.fs();
                    }
                    str2 = str3;
                    z = false;
                }
                if (btk == null) {
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("applog", str, -1, "response is null", fs2.zn(), list);
                } else if (!btk.hhw()) {
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("applog", str, zmn3, btk.fs(), fs2.zn(), list);
                }
                fb(jSONObject);
                return new com.bytedance.sdk.openadsdk.fb.btk(hhw, zmn3, str2, z);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.fb.btk(false, 509, "service_busy", false);
        }
    }

    private void zmn(Map<String, String> map, com.bytedance.sdk.component.nps.fs.fb fbVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    fbVar.fs(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            fbVar.fs("User-Agent", com.bytedance.sdk.openadsdk.utils.oub.fb());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    private void fb(JSONObject jSONObject) {
        byte[] bArr;
        Object obj;
        if (iv.fs().cyb()) {
            try {
                jSONObject.getJSONObject(POBCTAOverlayData.KEY_CTA_HEADER).put(C4913ua.b, "4562");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
            fs2.zn(com.bytedance.sdk.openadsdk.utils.oub.doe());
            Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(btk(jSONObject.toString()));
            if (encryptType4WithoutBase64 != null && (obj = encryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                bArr = (byte[]) obj;
                rp.fs(true);
            } else {
                int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                rp.fs(false);
                rp.zmn(1, PangleEncryptConstant.CryptDataScene.APP_LOG, intValue);
                bArr = null;
            }
            if (bArr != null) {
                fs2.fs("Content-Encoding", "union_sdk_encode");
                fs2.fs("x-pgli18n", "4");
                fs2.zmn("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                JSONObject zmn2 = com.bytedance.sdk.component.utils.zmn.zmn(jSONObject);
                if (zn(zmn2)) {
                    jSONObject = zmn2;
                }
                zmn(btk(jSONObject), fs2);
                fs2.zmn(jSONObject.toString(), kgc.fb().cyb());
            }
            fs2.zmn(7);
            fs2.fs("et_applog");
            fs2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.uqh.2
                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                    if (fsVar == null || !fsVar.hhw()) {
                        return;
                    }
                    fsVar.fb();
                }

                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public void zmn(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject fs2;
        final List<String> list2;
        if (!com.bytedance.sdk.openadsdk.core.settings.nps.zmn() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || (fs2 = fs(str, list, jSONObject, str2, str3)) == null) {
            return;
        }
        com.bytedance.sdk.component.nps.fs.fb fs3 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        final String fb = com.bytedance.sdk.openadsdk.utils.oub.fb("/api/ad/union/dislike_event/");
        JSONObject zmn2 = zmn(PangleEncryptConstant.CryptDataScene.DISLIKE, fs2);
        String jSONObject2 = zmn2 != null ? zmn2.toString() : null;
        zmn(fs3, zmn2);
        fs3.zn(fb);
        if (com.bytedance.sdk.openadsdk.utils.fs.fs()) {
            list2 = com.bytedance.sdk.openadsdk.utils.oub.zmn("/api/ad/union/dislike_event/", false);
            if (!list2.isEmpty()) {
                fs3.zmn(list2);
                fs3.zmn(60L, TimeUnit.SECONDS);
            }
        } else {
            list2 = null;
        }
        fs3.btk(jSONObject2);
        fs3.zmn(7);
        fs3.fs("dislike");
        if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            fs3.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.3
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("dislike");
                    return zmnVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.4
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("dislike");
                    return zmnVar;
                }
            });
        }
        fs3.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.uqh.5
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                boolean zmn3 = com.bytedance.sdk.openadsdk.utils.fs.zmn();
                if (fsVar != null) {
                    if (fsVar.hhw()) {
                        if (zmn3) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.5.1
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("dislike");
                                return zmnVar;
                            }
                        });
                        return;
                    } else {
                        if (!zmn3) {
                            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.5.2
                                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                    zmnVar.fs("dislike");
                                    return zmnVar;
                                }
                            });
                        }
                        com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("dislike", fb, fsVar.zmn(), fsVar.fs(), znVar.zn(), list2);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("dislike", fb, -1, "response is null", znVar.zn(), list2);
                if (zmn3) {
                    return;
                }
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.5.3
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("dislike");
                        return zmnVar;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("dislike", fb, -1, iOException != null ? iOException.getMessage() : POBCommonConstants.NULL_VALUE, znVar.zn(), list2);
                com.bytedance.sdk.openadsdk.utils.nqi.zmn(znVar.hhw());
                if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.5.4
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("dislike");
                        return zmnVar;
                    }
                });
            }
        });
        try {
            String optString = PangleNetworkBridge.jsonObjectInit(str).optString("cid", "");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("dislike", optString, (String) null, (String) null);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn(e.getMessage(), new Object[0]);
        }
    }

    public static JSONObject zmn(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new bjh(cryptDataScene));
        rp.zmn(encryptType4);
        return encryptType4;
    }

    @DungeonFlag
    private JSONObject fs(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            jsonObjectInit.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            jSONObject3.put("extra", jsonObjectInit.toString());
            jSONObject3.put("filter_words", zmn(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.zmn.zmn(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    private JSONArray zmn(List<FilterWord> list) {
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

    @NonNull
    private Map<String, String> btk(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        if (zn(jSONObject)) {
            hashMap.put("Content-Encoding", "union_sdk_encode");
        }
        return hashMap;
    }

    private boolean hhw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString("message").equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private void zmn(nqi.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
        zmnVar.zmn(-1, bvs.zmn(-1));
        znVar.zmn(-1);
        com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(nqi.fs fsVar) {
        fsVar.zmn(-1, bvs.zmn(-1));
    }

    @DungeonFlag
    private JSONObject fs() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", iv.fs().fb());
            jSONObject.put("name", iv.fs().zg());
            nps(jSONObject);
            Context zmn2 = kgc.zmn();
            String str = "";
            if (zmn2 != null) {
                try {
                    str = zmn2.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
            }
            jSONObject.put("package_install_path", str);
            int i = 0;
            jSONObject.put("is_paid_app", false);
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.zn.bvs());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - cn.zmn()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.iv());
            jSONObject.put("is_init", cn.btk() ? 1 : 0);
            if (zmn2 != null) {
                int rotation = ((WindowManager) zmn2.getSystemService("window")).getDefaultDisplay().getRotation();
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

    public static JSONObject zmn(AdSlot adSlot) {
        zak zakVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", kgc.fb().na());
            jSONObject.put("lmt", DeviceUtils.zn());
            if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().rc()) {
                jSONObject.put("pa_consent", iv.fs().iv());
            }
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.rc.fs.zmn().zg());
            jSONObject.put("tcstring", com.bytedance.sdk.openadsdk.core.settings.rc.fs(kgc.zmn()));
            jSONObject.put("tcf_gdpr", com.bytedance.sdk.openadsdk.core.settings.rc.zmn(kgc.zmn()));
            if (adSlot != null && zak.zmn.containsKey(Integer.valueOf(adSlot.getCodeId())) && (zakVar = zak.zmn.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", zakVar.fs());
                jSONObject.put("lastbundle", zakVar.zn());
                jSONObject.put("lastclick", zakVar.fb());
                jSONObject.put("lastskip", zakVar.btk());
            }
            zmn(jSONObject, "data", fs(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String fs(AdSlot adSlot) {
        String klz = iv.fs().klz();
        if (adSlot == null) {
            return TextUtils.isEmpty(klz) ? "" : klz;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(klz)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return klz;
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
                JSONArray jSONArray2 = new JSONArray(klz);
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
            return klz;
        }
    }

    private static void zmn(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    @DungeonFlag
    private void nps(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.oub.hhw());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.oub.nps());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.oub.zg());
        } catch (Exception unused) {
        }
    }

    private JSONObject zmn(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar) {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put(CreativeInfo.c, adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (kjbVar != null) {
                jSONObject.put("render_method", kjbVar.bvs);
                int i2 = kjbVar.bvs;
                if (i2 == 1) {
                    zmn(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i2 == 2) {
                    zmn(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                zmn(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", fs(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", zn(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", zn(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i == 1 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (kjbVar != null && (obj2 = kjbVar.nps) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (kjbVar != null && (obj = kjbVar.zg) != null) {
                jSONObject.put("common_params", obj);
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
            if (kjbVar != null && kjbVar.btk != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void zmn(JSONObject jSONObject, String str, int i, int i2) {
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

    private void zmn(JSONObject jSONObject, String str, float f, float f2) {
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

    public static class zmn {
        final String btk;
        final String bvs;
        final int fb;
        final long fs;
        final int hhw;
        final ArrayList<Integer> iv;
        final String nps;

        @Nullable
        public final com.bytedance.sdk.openadsdk.core.model.zmn zg;
        final int zmn;
        final long zn;

        private zmn(String str, int i, int i2, String str2, int i3, String str3, @Nullable com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.zmn = i;
            this.fb = i2;
            this.btk = str2;
            this.nps = str3;
            this.zg = zmnVar;
            this.bvs = str;
            this.hhw = i3;
            this.fs = j;
            this.zn = j2;
            this.iv = arrayList;
        }

        public static zmn zmn(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kjb kjbVar) {
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.zmn, ArrayList<Integer>> zmn = com.bytedance.sdk.openadsdk.core.fs.zmn(jSONObject, adSlot, kjbVar);
            if (zmn == null) {
                return new zmn(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
            }
            return new zmn(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.model.zmn) zmn.first, optLong, optLong2, (ArrayList) zmn.second);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public void zmn(JSONObject jSONObject, final nqi.fs fsVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.nps.zmn() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            if (fsVar != null) {
                fsVar.zmn(1000, "Ad request is temporarily paused, Please contact your AM");
                return;
            }
            return;
        }
        if (jSONObject == null || fsVar == null) {
            return;
        }
        JSONObject zmn2 = zmn(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        final List<String> list = null;
        try {
            fs2.zn(com.bytedance.sdk.openadsdk.bvs.fb.zmn(fs2, com.bytedance.sdk.openadsdk.utils.oub.fb("/api/ad/union/sdk/reward_video/reward/")));
            if (com.bytedance.sdk.openadsdk.utils.fs.fs()) {
                list = com.bytedance.sdk.openadsdk.utils.oub.zmn("/api/ad/union/sdk/reward_video/reward/", false);
                if (!list.isEmpty()) {
                    fs2.zmn(list);
                    fs2.zmn(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e.getMessage());
        }
        zmn(fs2, zmn2);
        fs2.btk(zmn2 != null ? zmn2.toString() : "");
        fs2.zmn(10);
        fs2.fs("reward");
        if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            fs2.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.6
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("reward");
                    return zmnVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.7
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("reward");
                    return zmnVar;
                }
            });
        }
        fs2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.uqh.8
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar2) {
                fs zmn3;
                int i;
                if (fsVar2 != null) {
                    if (fsVar2.hhw() && !TextUtils.isEmpty(fsVar2.fb())) {
                        try {
                            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fsVar2.fb());
                            String zmn4 = uqh.zmn(jsonObjectInit.optInt("cypher", -1), jsonObjectInit.optString("message"));
                            if (!TextUtils.isEmpty(zmn4)) {
                                try {
                                    jsonObjectInit = PangleNetworkBridge.jsonObjectInit(zmn4);
                                } catch (Throwable unused) {
                                }
                            }
                            zmn3 = fs.zmn(jsonObjectInit);
                            i = zmn3.zmn;
                        } catch (JSONException e2) {
                            com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e2.getMessage());
                            uqh.this.zmn(fsVar);
                        }
                        if (i != 20000) {
                            fsVar.zmn(i, bvs.zmn(i));
                            return;
                        }
                        if (zmn3.zn == null) {
                            uqh.this.zmn(fsVar);
                            return;
                        }
                        fsVar.zmn(zmn3);
                        if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.8.1
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("reward");
                                return zmnVar;
                            }
                        });
                        return;
                    }
                    String zmn5 = bvs.zmn(-2);
                    int zmn6 = fsVar2.zmn();
                    if (!fsVar2.hhw() && !TextUtils.isEmpty(fsVar2.fs())) {
                        zmn5 = fsVar2.fs();
                    }
                    String str = zmn5;
                    fsVar.zmn(zmn6, str);
                    if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.8.2
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("reward");
                                return zmnVar;
                            }
                        });
                    }
                    if (fsVar2.hhw()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("reward", znVar.hhw(), zmn6, str, znVar.zn(), list);
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.8.3
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("reward");
                            return zmnVar;
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("reward", znVar.hhw(), -1, "response is null", znVar.zn(), list);
                uqh.this.zmn(fsVar);
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                String str;
                if (iOException == null) {
                    str = "";
                } else {
                    str = iOException.getMessage();
                }
                String str2 = str;
                fsVar.zmn(-2, str2);
                if (znVar != null) {
                    String hhw = znVar.hhw();
                    com.bytedance.sdk.openadsdk.utils.nqi.zmn(hhw);
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("reward", hhw, -1, str2, znVar.zn(), list);
                }
                if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.uqh.8.4
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("reward");
                        return zmnVar;
                    }
                });
            }
        });
    }

    public static class fs {
        public final boolean fs;
        public final int zmn;
        public final com.bytedance.sdk.openadsdk.core.model.tf zn;

        private fs(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.tf tfVar) {
            this.zmn = i;
            this.fs = z;
            this.zn = tfVar;
        }

        public static fs zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("code");
            boolean optBoolean = jSONObject.optBoolean("verify");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.tf tfVar = new com.bytedance.sdk.openadsdk.core.model.tf();
            if (optJSONObject != null) {
                try {
                    tfVar.zmn(optJSONObject.optInt("reason"));
                    tfVar.fs(optJSONObject.optInt("corp_type"));
                    tfVar.zn(optJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    tfVar.zmn(optJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", th.getMessage());
                }
            }
            return new fs(optInt, optBoolean, tfVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public JSONObject zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("auction_price", "");
            String zmn2 = zmn(optInt, optString);
            if (TextUtils.isEmpty(zmn2)) {
                return jSONObject;
            }
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(zmn2);
            try {
                jsonObjectInit.put("auction_price", optString2);
            } catch (Throwable unused) {
            }
            return jsonObjectInit;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Nullable
    public static String zmn(int i, String str) {
        Object obj;
        if (i == 3) {
            return com.bytedance.sdk.component.utils.zmn.zn(str);
        }
        if (i == 4) {
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(str);
            if (decryptType4 != null && (obj = decryptType4.second) != null) {
                String str2 = (String) obj;
                rp.zmn(true);
                return str2;
            }
            rp.zmn(false);
            rp.zmn(2, PangleEncryptConstant.CryptDataScene.GET_ADS, decryptType4 != null ? ((Integer) decryptType4.first).intValue() : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public com.bytedance.sdk.openadsdk.fb.btk fs(JSONObject jSONObject) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        List<String> zmn2;
        String str = "error unknown";
        if (!com.bytedance.sdk.openadsdk.core.settings.nps.zmn() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        int i2 = 0;
        try {
            JSONObject zmn3 = zmn(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            fs2.zmn(zmn3.toString(), kgc.fb().cyb());
            fs2.zn(com.bytedance.sdk.openadsdk.utils.oub.fb("/api/ad/union/sdk/stats/batch/"));
            if (com.bytedance.sdk.openadsdk.utils.fs.fs() && (zmn2 = com.bytedance.sdk.openadsdk.utils.oub.zmn("/api/ad/union/sdk/stats/batch/", false)) != null && !zmn2.isEmpty()) {
                fs2.zmn(zmn2);
                fs2.zmn(60L, TimeUnit.SECONDS);
            }
            zmn(fs2, zmn3);
            fs2.fs("User-Agent", com.bytedance.sdk.openadsdk.utils.oub.fb());
            if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().es()) {
                fs2.fs("_disable_retry", "1");
            }
            com.bytedance.sdk.component.nps.fs btk = fs2.btk();
            try {
            } catch (Throwable unused) {
                i = 0;
                z = false;
            }
            if (btk == null) {
                return new com.bytedance.sdk.openadsdk.fb.btk(false, 0, "error unknown", false);
            }
            if (!btk.hhw() || TextUtils.isEmpty(btk.fb())) {
                z3 = false;
                z = false;
            } else {
                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(btk.fb());
                int optInt = jsonObjectInit.optInt("code", -1);
                str = jsonObjectInit.optString("data", "");
                z = true;
                boolean z4 = optInt == 20000;
                z3 = z4;
                if (optInt != 60005) {
                    z = false;
                    z3 = z4;
                }
            }
            try {
                i2 = btk.zmn();
                z2 = z3;
                if (!btk.hhw()) {
                    str = btk.fs();
                    com.bytedance.sdk.openadsdk.utils.nqi.zmn(fs2.hhw());
                    z2 = z3;
                }
            } catch (Throwable unused2) {
                i = i2;
                i2 = z3 ? 1 : 0;
                z2 = i2;
                i2 = i;
                return new com.bytedance.sdk.openadsdk.fb.btk(z2, i2, str, z);
            }
            return new com.bytedance.sdk.openadsdk.fb.btk(z2, i2, str, z);
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.fb.btk(false, 0, "error unknown", false);
        }
    }

    private void zmn(com.bytedance.sdk.component.nps.fs.fb fbVar, JSONObject jSONObject) {
        try {
            if (zn(jSONObject) && jSONObject.optInt("cypher") == 4) {
                fbVar.fs("x-pgli18n", "4");
                fbVar.fs("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmn() {
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.nps.zmn() || com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return null;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tpl_fetch_model", "date", 0L);
        String dgt = kgc.fb().dgt();
        String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("tpl_fetch_model", "last_url", "");
        if (currentTimeMillis <= kgc.fb().fkt() && currentTimeMillis >= 0 && TextUtils.equals(dgt, fs2)) {
            String fs3 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(fs3)) {
                    return com.bytedance.sdk.component.adexpress.zmn.zn.zmn.btk(fs3);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
            String zmn2 = com.bytedance.sdk.openadsdk.bvs.fb.zmn(zn, dgt);
            zn.zn(zmn2);
            com.bytedance.sdk.component.nps.fs btk = zn.btk();
            if (btk == null || !btk.hhw()) {
                return null;
            }
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(btk.fb());
            jsonObjectInit.put("template_fetch_url", zmn2);
            zmnVar = com.bytedance.sdk.component.adexpress.zmn.zn.zmn.zmn(jsonObjectInit);
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tpl_fetch_model", "model", jsonObjectInit.toString());
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tpl_fetch_model", "last_url", dgt);
            return zmnVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", th.getMessage());
            return zmnVar;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public void zmn(String str) {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return;
        }
        com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
        zn.zn(str);
        zn.fs("upload_bidding");
        zn.zmn(7);
        zn.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.uqh.9
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                fsVar.fb();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nqi
    public void zmn(JSONObject jSONObject, String str) {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return;
        }
        com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        fs2.zn(str);
        Pair<String, String> generateRequestHeader = ApmHelper.generateRequestHeader();
        fs2.fs("cypher", (String) generateRequestHeader.first);
        fs2.fs("transfer-param", (String) generateRequestHeader.second);
        fs2.fs("x-pangle-target-idc", kgc.fb().eug());
        fs2.zmn(jSONObject);
        fs2.zmn(5);
        fs2.fs("apm_pv");
        fs2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.uqh.10
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                fsVar.fb();
            }
        });
    }

    public static JSONArray fs(String str) {
        try {
            Set<String> fs2 = com.bytedance.sdk.component.adexpress.zmn.fs.fs.fs(str);
            if (fs2 != null && fs2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = fs2.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn2 = com.bytedance.sdk.component.adexpress.zmn.fs.fs.zmn(it.next());
                    if (zmn2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", zmn2.fs());
                        jSONObject.put("md5", zmn2.zn());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    public static JSONArray zn(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.mw.zmn.zmn> zmn2 = com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(str);
            if (zmn2 != null && zmn2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmnVar : zmn2) {
                    if (zmnVar != null && !TextUtils.isEmpty(zmnVar.btk())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = zmnVar.zmn().split("_");
                        if (split.length == 2) {
                            jSONObject.put("id", split[1]);
                            jSONObject.put("md5", zmnVar.fs());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private byte[] btk(String str) {
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
                com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e2.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes(B5.O));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e3.toString());
                }
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e5) {
                        com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e5.toString());
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
                        com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e6.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        com.bytedance.sdk.component.utils.iqz.zn("NetApiImpl", e7.toString());
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

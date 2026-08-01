package com.bytedance.sdk.openadsdk.icD.Jd.pvs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.component.video.api.vG.icD;
import com.bykv.vk.openvk.component.video.api.vG.vG;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.IP;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.Jd;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.Mxy;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.NB;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.Wyp;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.sUS;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.so;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoEventManager.java */
/* loaded from: classes2.dex */
public class pvs {
    private static final Map<com.bykv.vk.openvk.component.video.api.icD.pvs, bNS> pvs = Collections.synchronizedMap(new WeakHashMap());

    public static JSONObject pvs(cR cRVar, String str, int i, vG vGVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (cRVar != null) {
                icD od = cRVar.od();
                if (od != null) {
                    jSONObject.put("video_resolution", od.Mxy());
                    jSONObject.put("video_size", Long.valueOf(od.NB()));
                    jSONObject.put("video_url", od.qh());
                    jSONObject.put("player_type", vGVar.bNS());
                    jSONObject.put("video_encode_type", vGVar.qh() ? 1 : 0);
                }
                jSONObject.put("dp_creative_type", cRVar.xyK());
            }
        } catch (JSONException e) {
            Ju.pvs("TTAD.VideoEventManager", "", e);
        }
        return jSONObject;
    }

    public static void pvs(com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs<Wyp> pvsVar) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("load_video_error", pvsVar);
    }

    public static void icD(com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs<Mxy> pvsVar) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("load_video_cancel", pvsVar);
    }

    public static void pvs(cR cRVar, com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, vG vGVar) {
        if (cRVar == null || pvsVar == null || vGVar == null) {
            return;
        }
        String pvs2 = rCZ.pvs();
        int i = CacheDirFactory.getICacheDir(cRVar.LHy()).pvs(vGVar) ? 1 : 2;
        pvs.put(pvsVar, new bNS(SystemClock.elapsedRealtime(), pvs2, i, vGVar, cRVar));
        JSONObject pvs3 = pvs(cRVar, pvs2, i, vGVar);
        String pvs4 = jlb.pvs(cRVar);
        if (vGVar.Jd > 0) {
            try {
                pvs3.put("play_time", vGVar.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar2 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(cRVar, pvs4, pvs3, null);
        pvsVar2.pvs(vGVar.bNS() == -1);
        pvs(pvsVar2, "play_start");
    }

    public static void pvs(Context context, com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2, yiw yiwVar) {
        bNS bns;
        if (context == null || pvsVar == null || pvsVar2 == null || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        if (!pvsVar2.Wyp()) {
            pvs(NB, Jd, pvsVar2);
        }
        so soVar = new so();
        soVar.pvs(pvsVar2.qh() ? 1 : 0);
        soVar.icD(CacheDirFactory.getICacheDir(NB.LHy()).icD(Jd));
        soVar.pvs(SystemClock.elapsedRealtime() - bns.pvs());
        JSONObject pvs2 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs2.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs2, soVar);
        pvsVar3.pvs(pvsVar2.Wyp());
        pvs(pvsVar3, "feed_play", yiwVar);
    }

    public static void pvs(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2) {
        bNS bns;
        if (pvsVar == null || pvsVar2 == null || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long pvs2 = pvsVar2.pvs();
        long vG = pvsVar2.vG();
        if (vG <= 0 || pvs2 <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.yiw yiwVar = new com.bytedance.sdk.openadsdk.icD.Jd.icD.yiw();
        yiwVar.pvs(pvsVar2.icD());
        yiwVar.icD(vG);
        JSONObject pvs3 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs3.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs3, yiwVar);
        pvsVar3.pvs(pvsVar2.Wyp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_DURATION, pvs2);
            jSONObject.put("percent", pvsVar2.sUS());
            pvs(pvsVar3, "feed_pause", jSONObject);
        } catch (JSONException e2) {
            Ju.pvs("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void icD(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2) {
        bNS bns;
        if (pvsVar == null || pvsVar2 == null || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long pvs2 = pvsVar2.pvs();
        long vG = pvsVar2.vG();
        if (vG <= 0 || pvs2 <= 0) {
            return;
        }
        NB nb = new NB();
        nb.pvs(pvsVar2.icD());
        nb.icD(vG);
        JSONObject pvs3 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs3.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs3, nb);
        pvsVar3.pvs(pvsVar2.Wyp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_DURATION, pvs2);
            jSONObject.put("percent", pvsVar2.sUS());
            pvs(pvsVar3, "feed_continue", jSONObject);
        } catch (JSONException e2) {
            Ju.pvs("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void vG(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2) {
        bNS bns;
        if (pvsVar == null || pvsVar2 == null || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long pvs2 = pvsVar2.pvs();
        long vG = pvsVar2.vG();
        IP ip = new IP(pvsVar2.kj());
        ip.pvs(pvsVar2.icD());
        ip.icD(vG);
        JSONObject pvs3 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs3.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs3, ip);
        pvsVar3.pvs(pvsVar2.Wyp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_DURATION, pvs2);
            jSONObject.put("percent", pvsVar2.sUS());
            pvs(pvsVar3, "play_error", jSONObject);
        } catch (JSONException e2) {
            Ju.pvs("TTAD.VideoEventManager", "", e2);
        }
        pvs.remove(pvsVar);
    }

    public static void Jd(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2) {
        bNS bns;
        if (pvsVar == null || pvsVar2 == null || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long pvs2 = pvsVar2.pvs();
        long vG = pvsVar2.vG();
        com.bytedance.sdk.openadsdk.icD.Jd.icD.icD icd = new com.bytedance.sdk.openadsdk.icD.Jd.icD.icD();
        icd.pvs(pvsVar2.icD());
        icd.icD(vG);
        icd.pvs(pvsVar2.Jd());
        icd.icD(pvsVar2.NB());
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs(NB, bns.icD(), bns.vG(), Jd), icd);
        pvsVar3.pvs(pvsVar2.Wyp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_DURATION, pvs2);
            jSONObject.put("percent", pvsVar2.sUS());
            pvs(pvsVar3, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            Ju.pvs("TTAD.VideoEventManager", "", e);
        }
    }

    public static void pvs(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2, yiw yiwVar) {
        bNS bns;
        if (pvsVar == null || pvsVar2 == null || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long pvs2 = pvsVar2.pvs();
        long vG = pvsVar2.vG();
        Jd jd = new Jd();
        jd.icD(pvsVar2.icD());
        jd.pvs(vG);
        jd.pvs(pvsVar2.yiw());
        jd.icD(pvsVar2.so());
        JSONObject pvs3 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs3.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs3, jd);
        pvsVar3.pvs(pvsVar2.Wyp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_DURATION, pvs2);
            jSONObject.put("percent", pvsVar2.sUS());
            pvs(pvsVar3, "feed_break", jSONObject, yiwVar);
        } catch (JSONException e2) {
            Ju.pvs("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void icD(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2, yiw yiwVar) {
        if (pvsVar == null || pvsVar2 == null) {
            return;
        }
        NB(pvsVar, pvsVar2);
        bNS bns = pvs.get(pvsVar);
        if (bns == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long pvs2 = pvsVar2.pvs();
        long vG = pvsVar2.vG();
        sUS sus = new sUS();
        sus.icD(pvsVar2.icD());
        sus.pvs(vG);
        sus.pvs(pvsVar2.so());
        JSONObject pvs3 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs3.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs3, sus);
        pvsVar3.pvs(pvsVar2.Wyp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TypedValues.TransitionType.S_DURATION, pvs2);
            jSONObject.put("percent", pvsVar2.sUS());
            pvs(pvsVar3, "feed_over", jSONObject, yiwVar);
        } catch (JSONException e2) {
            Ju.pvs("TTAD.VideoEventManager", "", e2);
        }
        pvs.remove(pvsVar);
    }

    public static void NB(com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, bNS.pvs pvsVar2) {
        bNS bns;
        if (pvsVar == null || pvsVar2 == null || pvsVar2.Mxy() <= 0 || (bns = pvs.get(pvsVar)) == null) {
            return;
        }
        vG Jd = bns.Jd();
        cR NB = bns.NB();
        if (Jd == null || NB == null) {
            return;
        }
        long vG = pvsVar2.vG();
        com.bytedance.sdk.openadsdk.icD.Jd.icD.Ju ju = new com.bytedance.sdk.openadsdk.icD.Jd.icD.Ju();
        ju.pvs(pvsVar2.icD());
        ju.icD(vG);
        ju.pvs(pvsVar2.Mxy());
        JSONObject pvs2 = pvs(NB, bns.icD(), bns.vG(), Jd);
        if (Jd.Jd > 0) {
            try {
                pvs2.put("play_time", Jd.Jd);
            } catch (JSONException e) {
                Ju.pvs("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs(NB, jlb.pvs(NB), pvs2, ju);
        pvsVar3.pvs(pvsVar2.Wyp());
        pvs(pvsVar3, "play_buffer");
    }

    private static void pvs(com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar, String str) {
        pvs(pvsVar, str, (JSONObject) null, (yiw) null);
    }

    private static void pvs(com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar, String str, JSONObject jSONObject) {
        pvs(pvsVar, str, jSONObject, (yiw) null);
    }

    private static void pvs(com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar, String str, yiw yiwVar) {
        pvs(pvsVar, str, (JSONObject) null, yiwVar);
    }

    private static void pvs(final com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar, String str, final JSONObject jSONObject, final yiw yiwVar) {
        if (pvsVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (pvsVar.NB() && !TextUtils.isEmpty(pvsVar.icD())) {
            String icD = pvsVar.icD();
            icD.hashCode();
            if (icD.equals("stream") || icD.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), pvsVar.pvs(), pvsVar.icD(), str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                yiw yiwVar2;
                try {
                    JSONObject vG = com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs.this.vG();
                    if (com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs.this.Jd() != null) {
                        com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs.this.Jd().pvs(vG);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (yiwVar2 = yiwVar) != null) {
                        yiwVar2.pvs(vG);
                    }
                    jSONObject.put("ad_extra_data", vG.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static void pvs(final cR cRVar, final vG vGVar, final bNS.pvs pvsVar) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", pvs.vG(vG.this));
                jSONObject.put("player_duration", pvsVar.vG());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put(ImagesContract.URL, vG.this.Ju());
                jSONObject.put("path", pvs.Jd(vG.this));
                jSONObject.put("player_type", vG.this.bNS());
                com.bytedance.sdk.openadsdk.Wyp.pvs.Jd pvs2 = com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("pangle_video_play_state");
                cR cRVar2 = cRVar;
                return pvs2.pvs(cRVar2 != null ? cRVar2.VLm() : 0).icD(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long vG(vG vGVar) {
        if (vGVar == null) {
            return 0L;
        }
        icD rCZ = vGVar.qh() ? vGVar.rCZ() : vGVar.uc();
        if (rCZ != null) {
            return Double.valueOf(rCZ.sUS() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Jd(vG vGVar) {
        return new File(vGVar.icD(), vGVar.IP()).getAbsolutePath();
    }
}

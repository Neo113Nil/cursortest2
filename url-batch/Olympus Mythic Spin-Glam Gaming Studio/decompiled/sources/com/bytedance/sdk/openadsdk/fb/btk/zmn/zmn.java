package com.bytedance.sdk.openadsdk.fb.btk.zmn;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs;
import com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.yj;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.fb.btk.fs.btk;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.btk.fs.hhw;
import com.bytedance.sdk.openadsdk.fb.btk.fs.mw;
import com.bytedance.sdk.openadsdk.fb.btk.fs.rt;
import com.bytedance.sdk.openadsdk.fb.btk.fs.zg;
import com.bytedance.sdk.openadsdk.fb.nps;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zmn {
    private static final Map<com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn, cn> zmn = Collections.synchronizedMap(new WeakHashMap());

    public static com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn(nqi nqiVar, String str, int i, zn znVar) {
        return zmn(nqiVar, str, i, znVar, null);
    }

    public static com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn(nqi nqiVar, String str, int i, zn znVar, cn.zmn zmnVar) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i));
            } catch (JSONException e) {
                iqz.zmn("TTAD.VideoEventManager", "", e);
            }
        }
        if (nqiVar != null) {
            fs mrt = nqiVar.mrt();
            if (mrt != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, mrt.bvs());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(mrt.btk()));
                jSONObject.put("video_url", mrt.rc());
                jSONObject.put("player_type", znVar.kgc());
                jSONObject.put("video_encode_type", znVar.rt() ? 1 : 0);
            }
            jSONObject.put("play_time", znVar.btk);
            r0 = znVar.zmn() ? PangleNetworkBridge.jsonObjectInit(znVar.zn().toString()) : null;
            if (r0 == null) {
                r0 = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                r0.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
            }
            jSONObject.put("dp_creative_type", nqiVar.qj());
        }
        return new com.bytedance.sdk.openadsdk.fb.btk.fs.zmn(nqiVar, oub.zmn(nqiVar), jSONObject, r0);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar) {
        fb.zmn("load_video_error", zmnVar);
    }

    public static void fs(com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar) {
        fb.zmn("load_video_cancel", zmnVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|(1:6)(2:20|(8:22|8|9|10|11|(1:13)|14|15)(1:23))|7|8|9|10|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.VideoEventManager", "", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zmn(nqi nqiVar, com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, zn znVar) {
        int i;
        int i2;
        if (nqiVar == null || zmnVar == null || znVar == null) {
            return;
        }
        String zmn2 = kjb.zmn();
        if (znVar.bjh()) {
            i = 3;
        } else {
            if (CacheDirFactory.getICacheDir(nqiVar.hqs()).zmn(znVar)) {
                i2 = 1;
                zmn.put(zmnVar, new cn(SystemClock.elapsedRealtime(), zmn2, i2, znVar, nqiVar));
                com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn3 = zmn(nqiVar, zmn2, i2, znVar, null);
                zmn3.zn().put("is_mute", znVar.rc() ? 1 : 0);
                zmn3.zmn(znVar.kgc() == -1);
                zmn(zmn3, "play_start");
            }
            i = 2;
        }
        i2 = i;
        zmn.put(zmnVar, new cn(SystemClock.elapsedRealtime(), zmn2, i2, znVar, nqiVar));
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn32 = zmn(nqiVar, zmn2, i2, znVar, null);
        zmn32.zn().put("is_mute", znVar.rc() ? 1 : 0);
        zmn32.zmn(znVar.kgc() == -1);
        zmn(zmn32, "play_start");
    }

    public static void zmn(Context context, com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2, nps npsVar) {
        cn cnVar;
        if (context == null || zmnVar == null || zmnVar2 == null || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        if (!zmnVar2.rc()) {
            zmn(btk, fb, zmnVar2);
        }
        zg zgVar = new zg(fb);
        zgVar.zmn(zmnVar2.klz() ? 1 : 0);
        zgVar.fs(CacheDirFactory.getICacheDir(btk.hqs()).fs(fb));
        zgVar.zmn(SystemClock.elapsedRealtime() - cnVar.zmn());
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(zgVar);
        JSONObject fb2 = zmn2.fb();
        try {
            fb2.put("is_received_video_not_playing_info", zmnVar2.rt() ? 1 : 0);
            fb2.put("new_media_source", com.bykv.vk.openvk.zmn.zmn.fs.zmn.hhw());
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
        zmn2.zmn(zmnVar2.rc());
        zmn(zmn2, "feed_play", npsVar);
    }

    public static void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2) {
        cn cnVar;
        if (zmnVar == null || zmnVar2 == null || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fs = zmnVar2.fs();
        long fb2 = zmnVar2.fb();
        if (fb2 <= 0 || fs <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.btk.fs.nps npsVar = new com.bytedance.sdk.openadsdk.fb.btk.fs.nps();
        npsVar.zmn(zmnVar2.zn());
        npsVar.fs(fb2);
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(npsVar);
        zmn(zmnVar2, btk, zmn2.fb());
        zmn2.zmn(zmnVar2.rc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, fs);
            jSONObject.put("percent", zmnVar2.nps());
            zmn(zmn2, "feed_pause", jSONObject);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
    }

    private static void zmn(cn.zmn zmnVar, nqi nqiVar, JSONObject jSONObject) {
        if (nqiVar != null) {
            try {
                yj el = nqiVar.el();
                if (el != null) {
                    jSONObject.put("speed_type", el.fs());
                    jSONObject.put("speed", el.zmn());
                    jSONObject.put("speed_duration", zmnVar.zmn());
                }
            } catch (Throwable th) {
                iqz.zmn("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2) {
        cn cnVar;
        if (zmnVar == null || zmnVar2 == null || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fs = zmnVar2.fs();
        long fb2 = zmnVar2.fb();
        if (fb2 <= 0 || fs <= 0) {
            return;
        }
        btk btkVar = new btk();
        btkVar.zmn(zmnVar2.zn());
        btkVar.fs(fb2);
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(btkVar);
        zmn2.zmn(zmnVar2.rc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, fs);
            jSONObject.put("percent", zmnVar2.nps());
            zmn(zmn2, "feed_continue", jSONObject);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
    }

    public static void zn(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2) {
        cn cnVar;
        if (zmnVar == null || zmnVar2 == null || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fs = zmnVar2.fs();
        long fb2 = zmnVar2.fb();
        rt rtVar = new rt(zmnVar2.mw());
        rtVar.zmn(zmnVar2.zn());
        rtVar.fs(fb2);
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(rtVar);
        zmn2.zmn(zmnVar2.rc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, fs);
            jSONObject.put("percent", zmnVar2.nps());
            zmn(zmn2, "play_error", jSONObject);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
    }

    public static void fb(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2) {
        cn cnVar;
        if (zmnVar == null || zmnVar2 == null || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fs = zmnVar2.fs();
        long fb2 = zmnVar2.fb();
        com.bytedance.sdk.openadsdk.fb.btk.fs.fs fsVar = new com.bytedance.sdk.openadsdk.fb.btk.fs.fs();
        fsVar.zmn(zmnVar2.zn());
        fsVar.fs(fb2);
        fsVar.zmn(zmnVar2.btk());
        fsVar.fs(zmnVar2.hhw());
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(fsVar);
        zmn2.zmn(zmnVar2.rc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, fs);
            jSONObject.put("percent", zmnVar2.nps());
            zmn(zmn2, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
        zmn.remove(zmnVar);
    }

    public static void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2, nps npsVar) {
        if (zmnVar == null || zmnVar2 == null) {
            return;
        }
        btk(zmnVar, zmnVar2);
        cn cnVar = zmn.get(zmnVar);
        if (cnVar == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fs = zmnVar2.fs();
        long fb2 = zmnVar2.fb();
        com.bytedance.sdk.openadsdk.fb.btk.fs.fb fbVar = new com.bytedance.sdk.openadsdk.fb.btk.fs.fb();
        fbVar.fs(zmnVar2.zn());
        fbVar.zmn(fb2);
        fbVar.zmn(zmnVar2.zg());
        fbVar.fs(zmnVar2.bvs());
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(fbVar);
        zmn(zmnVar2, btk, zmn2.fb());
        zmn2.zmn(zmnVar2.rc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, fs);
            jSONObject.put("percent", zmnVar2.nps());
            zmn(zmn2, "feed_break", jSONObject, npsVar);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
    }

    public static void fs(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2, nps npsVar) {
        if (zmnVar == null || zmnVar2 == null) {
            return;
        }
        btk(zmnVar, zmnVar2);
        cn cnVar = zmn.get(zmnVar);
        if (cnVar == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fs = zmnVar2.fs();
        long fb2 = zmnVar2.fb();
        hhw hhwVar = new hhw(fb);
        hhwVar.fs(zmnVar2.zn());
        hhwVar.zmn(fb2);
        hhwVar.zmn(zmnVar2.bvs());
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(hhwVar);
        JSONObject fb3 = zmn2.fb();
        zmn(zmnVar2, btk, fb3);
        zmn2.zmn(zmnVar2.rc());
        try {
            fb3.put("surface_texture_updated", zmnVar2.cn() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, fs);
            jSONObject.put("percent", zmnVar2.nps());
            zmn(zmn2, "feed_over", jSONObject, npsVar);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
        zmn.remove(zmnVar);
    }

    public static void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, boolean z, String str) {
        cn cnVar;
        if (zmnVar == null || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, null);
        try {
            zmn2.zn().put("is_mute", z ? 1 : 0);
            zmn2.fb().put("from", str);
        } catch (JSONException e) {
            iqz.zmn("TTAD.VideoEventManager", "", e);
        }
        zmn(zmn2, "mute_state_change");
    }

    public static void btk(com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, cn.zmn zmnVar2) {
        cn cnVar;
        if (zmnVar == null || zmnVar2 == null || zmnVar2.iv() <= 0 || (cnVar = zmn.get(zmnVar)) == null) {
            return;
        }
        zn fb = cnVar.fb();
        nqi btk = cnVar.btk();
        if (fb == null || btk == null) {
            return;
        }
        long fb2 = zmnVar2.fb();
        mw mwVar = new mw();
        mwVar.zmn(zmnVar2.zn());
        mwVar.fs(fb2);
        mwVar.zmn(zmnVar2.iv());
        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmn2 = zmn(btk, cnVar.fs(), cnVar.zn(), fb, zmnVar2);
        zmn2.zmn(mwVar);
        zmn2.zmn(zmnVar2.rc());
        zmn(zmn2, "play_buffer");
    }

    private static void zmn(com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar, String str) {
        zmn(zmnVar, str, (JSONObject) null, (nps) null);
    }

    private static void zmn(com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar, String str, JSONObject jSONObject) {
        zmn(zmnVar, str, jSONObject, (nps) null);
    }

    private static void zmn(com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar, String str, nps npsVar) {
        zmn(zmnVar, str, (JSONObject) null, npsVar);
    }

    private static void zmn(final com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar, String str, final JSONObject jSONObject, final nps npsVar) {
        if (zmnVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (zmnVar.hhw() && !TextUtils.isEmpty(zmnVar.fs())) {
            String fs = zmnVar.fs();
            fs.hashCode();
            if (fs.equals("stream") || fs.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), zmnVar.zmn(), zmnVar.fs(), str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                nps npsVar2;
                try {
                    JSONObject zn = com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.zn();
                    if (com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.btk() != null) {
                        com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.btk().zmn(zn);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (npsVar2 = npsVar) != null) {
                        npsVar2.zmn(zn);
                    }
                    return zn;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.nps();
                return com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.fb();
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                return jSONObject;
            }
        });
    }

    private static void zmn(final nqi nqiVar, final zn znVar, final cn.zmn zmnVar) {
        fb.zmn();
        fb.zmn("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", zmn.zn(zn.this));
                jSONObject.put("player_duration", zmnVar.fb());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", zn.this.cyb());
                jSONObject.put("path", zmn.fb(zn.this));
                jSONObject.put("player_type", zn.this.kgc());
                com.bytedance.sdk.openadsdk.cyb.zmn.fb zmn2 = com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("pangle_video_play_state");
                nqi nqiVar2 = nqiVar;
                return zmn2.zmn(nqiVar2 != null ? nqiVar2.ldx() : 0).fs(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long zn(zn znVar) {
        if (znVar == null) {
            return 0L;
        }
        fs uqh = znVar.rt() ? znVar.uqh() : znVar.nqi();
        if (uqh != null) {
            return Double.valueOf(uqh.hhw() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fb(zn znVar) {
        return new File(znVar.btk(), znVar.olo()).getAbsolutePath();
    }

    public static boolean zmn(nqi nqiVar) {
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("video_black_fallback", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
            if (nqiVar != null && jSONObject != null && jSONObject.optInt(a.k) == 1 && nqiVar.jf() != 0) {
                return System.currentTimeMillis() - com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_video_black_file", "video_black_time", 0L) < jSONObject.optLong("work_time", 604800000L);
            }
            return false;
        } catch (Exception e) {
            iqz.zmn("TTAD.VideoEventManager", "isVideoBlack e = ", e);
            return false;
        }
    }

    public static void zmn(nqi nqiVar, final int i, long j) {
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("video_black_fallback", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
            if (nqiVar != null && jSONObject != null) {
                final boolean z = true;
                if (jSONObject.optInt(a.k) == 1 && nqiVar.jf() != 0) {
                    int optInt = jSONObject.optInt("texture_update_count", 5);
                    int optInt2 = jSONObject.optInt("play_duration", 3000);
                    final long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis <= optInt2 || i >= optInt) {
                        z = false;
                    }
                    if (z) {
                        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_video_black_file", "video_black_time", Long.valueOf(System.currentTimeMillis()));
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, nqiVar.btk(), "video_black", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.3
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                        public JSONObject zmn() {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.putOpt("is_black", Integer.valueOf(z ? 1 : 0));
                                jSONObject2.putOpt("play_duration", Long.valueOf(currentTimeMillis));
                                jSONObject2.putOpt("texture_update_count", Integer.valueOf(i));
                            } catch (JSONException e) {
                                iqz.zmn("TTAD.VideoEventManager", "reportVideoBlackEvent e = ", e);
                            }
                            return jSONObject2;
                        }
                    });
                }
            }
        } catch (Exception e) {
            iqz.zmn("TTAD.VideoEventManager", "reportVideoBlackEvent e = ", e);
        }
    }
}

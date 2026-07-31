package com.bytedance.sdk.openadsdk.component.reward.zn;

import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.rp;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zg {
    private static Integer fb;
    private static Integer fs;
    private static Boolean zmn;
    private static Integer zn;

    public static int zmn() {
        if (fb == null) {
            int i = 2;
            int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("unify_web_refresh", 2);
            if (zmn2 >= 0 && zmn2 <= 2) {
                i = zmn2;
            }
            fb = Integer.valueOf(i);
        }
        return fb.intValue();
    }

    public static boolean fs() {
        return zmn() == 1;
    }

    public static boolean zn() {
        return zmn() == 2;
    }

    public static int fb() {
        if (zn == null) {
            int i = 1;
            int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("unify_web_config", "video_preload_type", 1);
            if (zmn2 >= 0 && zmn2 <= 2) {
                i = zmn2;
            }
            zn = Integer.valueOf(i);
        }
        return zn.intValue();
    }

    public static boolean btk() {
        return fb() == 1 || fb() == 2;
    }

    public static boolean hhw() {
        return fb() == 1;
    }

    public static boolean nps() {
        if (zmn == null) {
            zmn = Boolean.valueOf(com.bytedance.sdk.openadsdk.uqh.btk.zmn("unify_web_close_backup_config", a.k, 1) == 1);
        }
        return zmn.booleanValue();
    }

    public static int zg() {
        if (fs == null) {
            int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("unify_web_close_backup_config", "interval", 10000);
            fs = Integer.valueOf(zmn2 > 1000 ? zmn2 : 10000);
        }
        return fs.intValue();
    }

    public static boolean zmn(nqi nqiVar) {
        if (nqiVar == null) {
            return false;
        }
        boolean z = nqiVar.nkt() == 2;
        boolean z2 = nqiVar.skn() == 11;
        boolean ch = nqiVar.ch();
        boolean xup = nqiVar.xup();
        rp xcf = nqiVar.xcf();
        return (!z || !z2 || ch || xup || (xcf != null && (xcf.zmn() == 1 || xcf.zmn() == 2))) ? false : true;
    }

    public static void zmn(final int i, final String str, final nqi nqiVar, final Map<String, String> map) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("unify_web_preload_video", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zg.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", i);
                jSONObject.put("video_url", str);
                nqi nqiVar2 = nqiVar;
                if (nqiVar2 != null) {
                    jSONObject.put("req_id", nqiVar2.wbj());
                }
                Map map2 = map;
                if (map2 != null && !map2.isEmpty()) {
                    jSONObject.put("range", map.get(Command.HTTP_HEADER_RANGE));
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("unify_web_preload_video").fs(jSONObject.toString());
            }
        });
    }
}

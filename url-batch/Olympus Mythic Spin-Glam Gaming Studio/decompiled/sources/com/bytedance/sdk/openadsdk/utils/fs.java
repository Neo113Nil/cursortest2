package com.bytedance.sdk.openadsdk.utils;

import com.ironsource.mediationsdk.metadata.a;
import java.lang.ref.SoftReference;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fs {
    private static Boolean btk;
    private static Boolean fb;
    private static Boolean fs;
    private static Boolean hhw;
    private static volatile com.bytedance.sdk.component.nps.zn.btk nps;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.nqi> zmn;
    private static Boolean zn;

    public static boolean zmn() {
        if (fs == null) {
            try {
                fs = Boolean.valueOf(com.bytedance.sdk.openadsdk.uqh.btk.zmn("stability_sinking", 0) == 1);
            } catch (Throwable unused) {
                fs = Boolean.FALSE;
            }
        }
        return fs.booleanValue();
    }

    public static boolean fs() {
        try {
            if (zn == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("net_opt_multiple_domain_retry", 0) != 1) {
                    z = false;
                }
                zn = Boolean.valueOf(z);
            }
            return zn.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zn() {
        try {
            if (fb == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("iv_rv_load_show_new", 0) != 1) {
                    z = false;
                }
                fb = Boolean.valueOf(z);
            }
            return fb.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean fb() {
        try {
            if (btk == null) {
                btk = Boolean.valueOf(com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_redirect_monitor", false));
            }
            return btk.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean btk() {
        try {
            if (hhw == null) {
                hhw = Boolean.valueOf(com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_optimize", false));
            }
            return hhw.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.nqi hhw() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.nqi> softReference = zmn;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            return;
        }
        zmn = new SoftReference<>(nqiVar);
    }

    public static com.bytedance.sdk.component.nps.zn.btk nps() {
        if (nps != null) {
            return nps;
        }
        com.bytedance.sdk.component.nps.zn.btk btkVar = new com.bytedance.sdk.component.nps.zn.btk();
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("net_multi_domain_config", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
            if (jSONObject != null) {
                btkVar.zmn = jSONObject.optInt(a.k, 0) == 1;
                btkVar.fs = jSONObject.optInt("fail_count", 10);
                btkVar.zn = jSONObject.optLong("interval", 1800000L);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        nps = btkVar;
        Objects.toString(nps);
        return nps;
    }
}

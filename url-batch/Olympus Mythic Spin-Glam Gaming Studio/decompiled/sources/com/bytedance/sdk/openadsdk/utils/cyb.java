package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class cyb implements com.bytedance.sdk.openadsdk.oem.zmn {
    private static boolean btk;
    private static String fb;
    private static com.bytedance.sdk.openadsdk.core.model.nqi fs;
    private static com.bytedance.sdk.openadsdk.core.cn.fb.fs hhw;
    private static com.bytedance.sdk.openadsdk.component.reward.zn.fs nps;
    private static final cyb zmn = new cyb();
    private static Context zn;

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, Context context, String str, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        zmn(nqiVar, context, str, fsVar, null);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, Context context, String str, com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar) {
        zmn(nqiVar, context, str, null, fsVar);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, Context context, String str, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar2) {
        com.bytedance.sdk.openadsdk.core.model.zak rvx = nqiVar.rvx();
        if (rvx != null) {
            if (rvx.nps() || rvx.zg()) {
                fs = nqiVar;
                zn = context;
                fb = str;
                hhw = fsVar;
                nps = fsVar2;
                IPBroadcastReceiver zmn2 = IPBroadcastReceiver.zmn(context, nqiVar);
                if (zmn2 != null) {
                    zmn2.zmn(zmn);
                }
            }
        }
    }

    public static void zmn() {
        if (fs == null) {
            return;
        }
        IPBroadcastReceiver zmn2 = IPBroadcastReceiver.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), fs);
        if (zmn2 != null) {
            zmn2.zmn();
        }
        btk = false;
        fs = null;
        zn = null;
        fb = null;
        hhw = null;
        nps = null;
    }

    public static void fs() {
        btk = true;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.zmn
    public void zmn(String str, final int i) {
        com.bytedance.sdk.openadsdk.core.model.hhw pw;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = fs;
        if (nqiVar == null || zn == null || (pw = nqiVar.pw()) == null) {
            return;
        }
        String zn2 = pw.zn();
        if (TextUtils.isEmpty(zn2) || !zn2.equals(str)) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.cyb.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (cyb.fs == null || cyb.zn == null || (i2 = i) <= 0 || i2 > 5) {
                    return;
                }
                boolean z = true;
                boolean z2 = i2 == 1;
                if (cyb.btk) {
                    if (cyb.hhw != null) {
                        cyb.hhw.xrr();
                    }
                    if (cyb.nps != null) {
                        cyb.nps.zmn();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn("click", cyb.fs, new klz.zmn().zmn(), cyb.fb, true, (Map<String, Object>) hashMap, 1);
                } else {
                    z = z2;
                }
                if (z) {
                    cyb.zmn();
                }
            }
        });
    }
}

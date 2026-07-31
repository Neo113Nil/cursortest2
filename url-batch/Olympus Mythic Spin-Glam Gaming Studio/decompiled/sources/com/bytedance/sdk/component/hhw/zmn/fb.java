package com.bytedance.sdk.component.hhw.zmn;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class fb {
    public static final fb zmn = new fb();

    public void zmn(zmn zmnVar, Context context) {
        fs(zmnVar, context);
        nps.hhw().zmn(context);
        nps.hhw().zmn(zmnVar.iv());
        nps.hhw().fs(zmnVar.nps());
        nps.hhw().zn(zmnVar.zg());
        nps.hhw().zmn(zmnVar.fs());
        nps.hhw().fb(zmnVar.bvs());
        nps.hhw().btk(zmnVar.hhw());
        nps.hhw().zmn(zmnVar.zmn() == null ? com.bytedance.sdk.component.hhw.zmn.zmn.zmn.btk.zmn : zmnVar.zmn());
        nps.hhw().zmn(zmnVar.fb());
        nps.hhw().zmn(zmnVar.zn());
        nps.hhw().zmn(zmnVar.btk());
        com.bytedance.sdk.component.hhw.zmn.fs.fs.zn.zmn(zmnVar.klz());
        com.bytedance.sdk.component.hhw.zmn.fs.fs.zn.fs(zmnVar.rc());
        zmn(zmnVar);
    }

    private void zmn(zmn zmnVar) {
        Executor btk;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.hhw.zmn.zn.zmn.fs()) {
            com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn();
            return;
        }
        btk fb = zmnVar.fb();
        if (fb == null || !com.bytedance.sdk.component.hhw.zmn.zn.zmn.fs() || (btk = fb.btk()) == null) {
            return;
        }
        btk.execute(new Runnable() { // from class: com.bytedance.sdk.component.hhw.zmn.fb.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn();
            }
        });
    }

    public void zmn(boolean z) {
        nps.hhw().zmn(z);
    }

    private void fs(zmn zmnVar, Context context) {
        zn.zmn(context, "context == null");
        zn.zmn(zmnVar, "AdLogConfig == null");
        zn.zmn(zmnVar.fb(), "AdLogDepend ==null");
    }

    public void zmn() {
        btk cn = nps.hhw().cn();
        if (cn == null || nps.hhw().btk() == null || cn.fb() == null) {
            return;
        }
        nps.hhw().zg();
    }

    public void fs() {
        btk cn = nps.hhw().cn();
        if (cn == null || nps.hhw().btk() == null || cn.fb() == null) {
            return;
        }
        nps.hhw().iv();
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        fs(zmnVar);
    }

    private void fs(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        btk cn = nps.hhw().cn();
        if (zmnVar == null || cn == null || nps.hhw().btk() == null || cn.fb() == null) {
            return;
        }
        nps.hhw().zmn(zmnVar);
    }

    public void zmn(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        btk cn = nps.hhw().cn();
        if (cn == null || nps.hhw().btk() == null || cn.fb() == null || !cn.zg()) {
            return;
        }
        if (cn.hhw() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (cn.hhw() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        nps.hhw().zmn(str, list, z, map, i, str2);
    }

    public void zmn(String str, boolean z) {
        btk cn = nps.hhw().cn();
        if (cn == null || nps.hhw().btk() == null || cn.fb() == null || !cn.zg()) {
            return;
        }
        if (cn.hhw() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        nps.hhw().zmn(str, z);
    }
}

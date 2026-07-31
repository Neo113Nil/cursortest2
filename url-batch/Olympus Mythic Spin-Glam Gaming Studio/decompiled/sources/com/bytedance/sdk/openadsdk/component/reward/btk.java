package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes.dex */
class btk {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile btk zmn;
    private final Context fs;

    public void zmn(String str, nqi nqiVar) {
        com.bytedance.sdk.openadsdk.common.fs.zmn("sp_full_screen_video_new").zmn(str, nqiVar);
    }

    public void zmn() {
        com.bytedance.sdk.openadsdk.common.fs.zmn("sp_full_screen_video_new").zmn();
    }

    public void zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (zmnVar == null || zmnVar.nps() == null || !zmnVar.nps().dbc()) {
            com.bytedance.sdk.openadsdk.common.fs.zmn("sp_full_screen_video_new").zmn(adSlot, zmnVar);
        }
    }

    public static btk zmn(Context context) {
        if (zmn == null) {
            synchronized (btk.class) {
                try {
                    if (zmn == null) {
                        zmn = new btk(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private btk(Context context) {
        this.fs = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context.getApplicationContext();
    }

    public String zmn(String str, boolean z) {
        com.bytedance.sdk.openadsdk.common.fs zmn2 = com.bytedance.sdk.openadsdk.common.fs.zmn("sp_full_screen_video_new");
        String zmn3 = zmn2.zmn(str, 10500000L);
        if (z && !TextUtils.isEmpty(zmn3) && zmn2.fb(str)) {
            return null;
        }
        return zmn3;
    }

    public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        return com.bytedance.sdk.openadsdk.common.fs.zmn("sp_full_screen_video_new").zmn(zmnVar, true);
    }

    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.common.fs.zmn("sp_full_screen_video_new").zn(str);
    }
}

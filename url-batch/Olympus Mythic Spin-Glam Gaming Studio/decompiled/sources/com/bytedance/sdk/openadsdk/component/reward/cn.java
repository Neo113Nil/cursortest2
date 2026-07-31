package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class cn {
    private static final ConcurrentHashMap<zmn, cn> zmn = new ConcurrentHashMap<>();
    private final Context fs;
    private final zmn zn;

    public enum zmn {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");

        final String btk;
        final String fb;
        final String zn;

        zmn(String str, String str2, String str3) {
            this.zn = str;
            this.fb = str2;
            this.btk = str3;
        }
    }

    public static cn zmn(Context context, zmn zmnVar) {
        ConcurrentHashMap<zmn, cn> concurrentHashMap = zmn;
        if (!concurrentHashMap.containsKey(zmnVar)) {
            synchronized (cn.class) {
                try {
                    if (!concurrentHashMap.containsKey(zmnVar)) {
                        concurrentHashMap.put(zmnVar, new cn(context, zmnVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return concurrentHashMap.get(zmnVar);
    }

    private cn(Context context, zmn zmnVar) {
        this.fs = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context.getApplicationContext();
        this.zn = zmnVar;
    }

    public void zmn(String str, nqi nqiVar) {
        com.bytedance.sdk.openadsdk.common.fs.zmn(this.zn.fb).zmn(str, nqiVar);
    }

    public void zmn() {
        com.bytedance.sdk.openadsdk.common.fs.zmn(this.zn.fb).zmn();
    }

    public void zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        if (zmnVar == null || zmnVar.nps() == null || !zmnVar.nps().dbc()) {
            com.bytedance.sdk.openadsdk.common.fs.zmn(this.zn.fb).zmn(adSlot, zmnVar);
        }
    }

    public String zmn(String str, boolean z) {
        com.bytedance.sdk.openadsdk.common.fs zmn2 = com.bytedance.sdk.openadsdk.common.fs.zmn(this.zn.fb);
        String zmn3 = zmn2.zmn(str, 10500000L);
        if (z && !TextUtils.isEmpty(zmn3) && zmn2.fb(str)) {
            return null;
        }
        return zmn3;
    }

    public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        return com.bytedance.sdk.openadsdk.common.fs.zmn(this.zn.fb).zmn(zmnVar, true);
    }

    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.common.fs.zmn(this.zn.fb).zn(str);
    }
}

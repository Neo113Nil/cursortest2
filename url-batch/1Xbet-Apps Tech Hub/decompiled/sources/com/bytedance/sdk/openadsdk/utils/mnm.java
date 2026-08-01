package com.bytedance.sdk.openadsdk.utils;

import org.json.JSONObject;

/* compiled from: MemoryUtils.java */
/* loaded from: classes2.dex */
public class mnm {
    public static final long pvs = pvs(0.05f);

    public static long pvs(float f) {
        return Double.valueOf(f * Runtime.getRuntime().maxMemory()).longValue();
    }

    public static boolean pvs(long j, String str) {
        if (!com.bytedance.sdk.openadsdk.core.mnm.Jd().Ju() || Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >= j) {
            return true;
        }
        icD(j, str);
        return false;
    }

    private static void icD(final long j, final String str) {
        ae.icD(new com.bytedance.sdk.component.so.so("isMemoryEnough") { // from class: com.bytedance.sdk.openadsdk.utils.mnm.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scene", str);
                    jSONObject.put("mem_size", j);
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs("dynamic_mem_not_enough", jSONObject);
                    Object[] objArr = new Object[2];
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("MemoryUtils", "run: ", e);
                }
            }
        }, 5);
    }

    public static int pvs() {
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (maxMemory <= 2) {
                return 2;
            }
            if (maxMemory >= 5) {
                return 5;
            }
            return maxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}

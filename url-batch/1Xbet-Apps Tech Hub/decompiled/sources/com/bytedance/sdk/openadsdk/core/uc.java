package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: PglEncryptStatisticsHelper.java */
/* loaded from: classes2.dex */
public class uc {
    private static final AtomicInteger Jd;
    private static final AtomicInteger icD;
    private static final AtomicInteger pvs;
    private static final AtomicInteger vG;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        pvs = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        icD = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        vG = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        Jd = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void pvs() {
        try {
            long pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "upload_time_key", 0L);
            if (pvs2 <= 0 || System.currentTimeMillis() - pvs2 < 86400000) {
                if (pvs2 <= 0 || pvs2 > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            icD();
            synchronized (uc.class) {
                pvs.set(0);
                icD.set(0);
                vG.set(0);
                Jd.set(0);
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void icD() {
        final int i = pvs.get();
        final int i2 = icD.get();
        final int i3 = vG.get();
        final int i4 = Jd.get();
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.core.uc.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("crypt_v4_statistics").icD(jSONObject.toString());
            }
        });
    }

    public static void pvs(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.core.uc.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("crypt_v4_fail").icD(jSONObject.toString());
            }
        });
    }

    public static synchronized void pvs(boolean z) {
        synchronized (uc.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(vG.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(vG.incrementAndGet()));
            }
        }
    }

    public static void pvs(JSONObject jSONObject) {
        icD(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }

    public static synchronized void icD(boolean z) {
        synchronized (uc.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(pvs.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(icD.incrementAndGet()));
            }
        }
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class rp {
    private static final AtomicInteger fb;
    private static final AtomicInteger fs;
    private static final AtomicInteger zmn;
    private static final AtomicInteger zn;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        zmn = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        fs = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        zn = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        fb = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void zmn() {
        try {
            long zmn2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "upload_time_key", 0L);
            if (zmn2 <= 0 || System.currentTimeMillis() - zmn2 < 86400000) {
                if (zmn2 <= 0 || zmn2 > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            fs();
            synchronized (rp.class) {
                zmn.set(0);
                fs.set(0);
                zn.set(0);
                fb.set(0);
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void fs() {
        final int i = zmn.get();
        final int i2 = fs.get();
        final int i3 = zn.get();
        final int i4 = fb.get();
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.rp.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("crypt_v4_statistics").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.core.rp.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put(VastAttributes.VENDOR, Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("crypt_v4_fail").fs(jSONObject.toString());
            }
        });
    }

    public static synchronized void zmn(boolean z) {
        synchronized (rp.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(zn.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(zn.incrementAndGet()));
            }
        }
    }

    public static void zmn(JSONObject jSONObject) {
        fs(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }

    public static synchronized void fs(boolean z) {
        synchronized (rp.class) {
            if (z) {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(zmn.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(fs.incrementAndGet()));
            }
        }
    }
}

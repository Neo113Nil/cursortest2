package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;

/* compiled from: FileCacheUtils.java */
/* loaded from: classes2.dex */
public class Wyp {
    private static String pvs;

    public static String pvs() {
        if (TextUtils.isEmpty(pvs)) {
            pvs = com.bykv.vk.openvk.component.video.api.vG.pvs().getCacheDir() + File.separator + "proxy_cache";
        }
        return pvs;
    }

    public static void pvs(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}

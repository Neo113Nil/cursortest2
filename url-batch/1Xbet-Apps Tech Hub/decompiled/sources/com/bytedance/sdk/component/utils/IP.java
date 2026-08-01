package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: MemorySize.java */
/* loaded from: classes.dex */
public class IP {
    public static long pvs() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}

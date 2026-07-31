package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: classes6.dex */
public final class th {
    public final boolean b(File file, String str) {
        if (file != null && str != null) {
            try {
                File a = a(file, str);
                if (a != null) {
                    return a.exists();
                }
                return false;
            } catch (Exception e) {
                xb.a(e.toString(), (Throwable) null, 2, (Object) null);
            }
        }
        return false;
    }

    public final RandomAccessFile a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }

    public final File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str + ".tmp");
    }
}

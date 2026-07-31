package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes.dex */
public final class o10 {
    public static <T> T a(c53<T> c53Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return c53Var.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Build;

/* loaded from: classes2.dex */
public final class zzcb {
    public static int version() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            zzcl.zzf("Invalid version number", Build.VERSION.SDK);
            return 0;
        }
    }
}

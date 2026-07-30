package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzq {
    public static int zza(int i8) {
        boolean z7;
        if (i8 != 0 && i8 != 1) {
            if (i8 != 2) {
                z7 = false;
                Preconditions.checkArgument(z7, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i8));
                return i8;
            }
            i8 = 2;
        }
        z7 = true;
        Preconditions.checkArgument(z7, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i8));
        return i8;
    }

    public static String zzb(int i8) {
        if (i8 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i8 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i8 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}

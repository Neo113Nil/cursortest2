package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzan {
    public static int zza(int i8) {
        boolean z7;
        if (i8 != 100 && i8 != 102 && i8 != 104) {
            if (i8 != 105) {
                z7 = false;
                Preconditions.checkArgument(z7, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i8));
                return i8;
            }
            i8 = 105;
        }
        z7 = true;
        Preconditions.checkArgument(z7, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i8));
        return i8;
    }

    public static String zzb(int i8) {
        if (i8 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i8 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i8 == 104) {
            return "LOW_POWER";
        }
        if (i8 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}

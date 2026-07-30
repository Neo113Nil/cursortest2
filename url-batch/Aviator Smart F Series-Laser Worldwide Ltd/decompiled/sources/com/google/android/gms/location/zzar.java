package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzar {
    public static int zza(int i8) {
        boolean z7;
        if (i8 != 0 && i8 != 1) {
            if (i8 != 2) {
                z7 = false;
                Preconditions.checkArgument(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i8));
                return i8;
            }
            i8 = 2;
        }
        z7 = true;
        Preconditions.checkArgument(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i8));
        return i8;
    }

    public static String zzb(int i8) {
        if (i8 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i8 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i8 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}

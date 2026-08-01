package com.google.android.gms.internal.ads;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfzi extends zzfzj {
    public static int zza(long j) {
        int i = (int) j;
        zzfty.zzg(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int zzb(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public static int zzc(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}

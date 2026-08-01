package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfyd implements Comparator {
    protected zzfyd() {
    }

    public static zzfyd zzb(Comparator comparator) {
        return comparator instanceof zzfyd ? (zzfyd) comparator : new zzfwf(comparator);
    }

    public static zzfyd zzc() {
        return zzfyb.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfyd zza() {
        return new zzfym(this);
    }
}

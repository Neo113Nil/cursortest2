package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhdq implements zzhdp, zzhdj {
    private static final zzhdq zza = new zzhdq(null);
    private final Object zzb;

    private zzhdq(Object obj) {
        this.zzb = obj;
    }

    public static zzhdp zza(Object obj) {
        zzhdx.zza(obj, "instance cannot be null");
        return new zzhdq(obj);
    }

    public static zzhdp zzc(Object obj) {
        return obj == null ? zza : new zzhdq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final Object zzb() {
        return this.zzb;
    }
}

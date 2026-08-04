package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzui extends zzud {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzui(zzbe zzbeVar, Object obj, Object obj2) {
        super(zzbeVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzui zzp(zzaj zzajVar) {
        return new zzui(new zzuj(zzajVar), zzbd.zza, zzc);
    }

    public static zzui zzq(zzbe zzbeVar, Object obj, Object obj2) {
        return new zzui(zzbeVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        this.zzb.zzb(i, zzbdVar, j);
        if (Objects.equals(zzbdVar.zzb, this.zzd)) {
            zzbdVar.zzb = zzbd.zza;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z) {
        this.zzb.zzd(i, zzbcVar, z);
        if (Objects.equals(zzbcVar.zzb, this.zze) && z) {
            zzbcVar.zzb = zzc;
        }
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        Object zzf = this.zzb.zzf(i);
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zzui zzr(zzbe zzbeVar) {
        return new zzui(zzbeVar, this.zzd, this.zze);
    }

    final /* synthetic */ Object zzs() {
        return this.zze;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
abstract class zzafg {
    protected final zzaeb zza;

    protected zzafg(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    protected abstract boolean zza(zzef zzefVar) throws zzas;

    protected abstract boolean zzb(zzef zzefVar, long j) throws zzas;

    public final boolean zzf(zzef zzefVar, long j) throws zzas {
        return zza(zzefVar) && zzb(zzefVar, j);
    }
}

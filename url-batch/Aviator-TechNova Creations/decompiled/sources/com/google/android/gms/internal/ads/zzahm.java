package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
abstract class zzahm {
    protected final zzagh zza;

    protected zzahm(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    protected abstract boolean zza(zzer zzerVar) throws zzat;

    protected abstract boolean zzb(zzer zzerVar, long j) throws zzat;

    public final boolean zzf(zzer zzerVar, long j) throws zzat {
        return zza(zzerVar) && zzb(zzerVar, j);
    }
}

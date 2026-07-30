package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public interface zzml extends zzmg {
    String zzS();

    default long zzT(long j, long j2) {
        if (zze() != 1) {
            return WorkRequest.MIN_BACKOFF_MILLIS;
        }
        if (zzY() || zzZ()) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    default boolean zzU(long j) {
        return false;
    }

    default void zzV(float f, float f2) throws zziw {
    }

    default void zzW() {
    }

    void zzX(long j, long j2) throws zziw;

    boolean zzY();

    boolean zzZ();

    int zza();

    zzmn zzb();

    void zzc(int i, zzpq zzpqVar, zzdn zzdnVar);

    void zzcT() throws zziw;

    void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j, long j2, zzwk zzwkVar) throws zziw;

    zzyc zzcV();

    boolean zzcW();

    zzlm zzd();

    int zze();

    void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j, boolean z, boolean z2, long j2, long j3, zzwk zzwkVar) throws zziw;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j, boolean z) throws zziw;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}

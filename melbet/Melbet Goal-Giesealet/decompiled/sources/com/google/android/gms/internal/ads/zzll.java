package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzll extends zzlg {
    String zzS();

    default long zzT(long j, long j2) {
        if (zze() != 1) {
            return WorkRequest.MIN_BACKOFF_MILLIS;
        }
        if (zzX() || zzY()) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    default void zzU(float f, float f2) throws zzhz {
    }

    default void zzV() {
    }

    void zzW(long j, long j2) throws zzhz;

    boolean zzX();

    boolean zzY();

    int zza();

    zzln zzb();

    void zzc(int i, zzox zzoxVar, zzdb zzdbVar);

    void zzcY() throws zzhz;

    void zzcZ(zzu[] zzuVarArr, zzwf zzwfVar, long j, long j2, zzup zzupVar) throws zzhz;

    zzkm zzd();

    zzwf zzda();

    boolean zzdb();

    int zze();

    void zzf(zzlo zzloVar, zzu[] zzuVarArr, zzwf zzwfVar, long j, boolean z, boolean z2, long j2, long j3, zzup zzupVar) throws zzhz;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbe zzbeVar);

    void zzp(long j) throws zzhz;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}

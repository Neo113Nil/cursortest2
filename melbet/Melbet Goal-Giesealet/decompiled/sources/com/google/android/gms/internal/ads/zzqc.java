package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzqc {
    void zzA();

    default void zzB() {
    }

    void zza(zzpz zzpzVar);

    default void zzb(zzox zzoxVar) {
    }

    default void zzc(zzdb zzdbVar) {
    }

    boolean zzd(zzu zzuVar);

    int zze(zzu zzuVar);

    default zzpg zzf(zzu zzuVar) {
        throw null;
    }

    long zzg(boolean z);

    void zzh(zzu zzuVar, int i, int[] iArr) throws zzpx;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzpy, zzqb;

    void zzl() throws zzqb;

    boolean zzm();

    boolean zzn();

    void zzo(zzau zzauVar);

    zzau zzp();

    void zzq(boolean z);

    void zzr(zzc zzcVar);

    void zzs(int i);

    void zzt(zzd zzdVar);

    default void zzu(AudioDeviceInfo audioDeviceInfo) {
    }

    long zzv();

    default void zzw(int i, int i2) {
    }

    void zzx(float f);

    void zzy();

    void zzz();
}

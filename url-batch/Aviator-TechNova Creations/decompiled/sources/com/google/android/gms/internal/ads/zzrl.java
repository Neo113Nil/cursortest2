package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzrl {
    private final zzrk zza;
    private final int zzb;
    private final zzsj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzrl(AudioTrack audioTrack, zzsj zzsjVar) {
        this.zza = new zzrk(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzsjVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = WorkRequest.MIN_BACKOFF_MILLIS;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzrk zzrkVar = this.zza;
        return zzh(zzrkVar.zzc(), zzrkVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        return zzfj.zzr(j, this.zzb) + zzfj.zzv(j3 - j2, f);
    }

    public final void zza(long j, float f, long j2) {
        boolean z;
        int i;
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzrk zzrkVar = this.zza;
        boolean zza = zzrkVar.zza();
        if (zza) {
            long zzb = zzrkVar.zzb();
            long zzg = zzg(j, f);
            i = 2;
            if (Math.abs(zzb - j) > 5000000) {
                zzsj zzsjVar = this.zzc;
                long zzc = zzrkVar.zzc();
                long zzq = ((zzrw) zzsjVar).zza.zzq();
                int length = String.valueOf(zzc).length();
                int length2 = String.valueOf(zzb).length();
                int length3 = String.valueOf(j).length();
                StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j2).length() + 2 + String.valueOf(zzq).length());
                sb.append("Spurious audio timestamp (system clock mismatch): ");
                sb.append(zzc);
                sb.append(", ");
                sb.append(zzb);
                sb.append(", ");
                sb.append(j);
                sb.append(", ");
                sb.append(j2);
                sb.append(", ");
                sb.append(zzq);
                zzee.zzc("AudioTrackAudioOutput", sb.toString());
                zzf(4);
                z = zza;
            } else if (Math.abs(zzg - j2) > 5000000) {
                zzsj zzsjVar2 = this.zzc;
                long zzc2 = zzrkVar.zzc();
                long zzq2 = ((zzrw) zzsjVar2).zza.zzq();
                int length4 = String.valueOf(zzc2).length();
                int length5 = String.valueOf(zzb).length();
                int length6 = String.valueOf(j).length();
                int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j2).length() + 2;
                z = zza;
                StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(zzq2).length());
                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(zzc2);
                sb2.append(", ");
                sb2.append(zzb);
                sb2.append(", ");
                sb2.append(j);
                sb2.append(", ");
                sb2.append(j2);
                sb2.append(", ");
                sb2.append(zzq2);
                zzee.zzc("AudioTrackAudioOutput", sb2.toString());
                zzf(4);
            } else {
                z = zza;
                if (this.zzd == 4) {
                    zzf(0);
                }
            }
        } else {
            z = zza;
            i = 2;
        }
        int i2 = this.zzd;
        if (i2 == 0) {
            if (!z) {
                if (j - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzrkVar.zzb() >= this.zze) {
                    this.zzh = zzrkVar.zzc();
                    this.zzi = zzrkVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == i) {
                if (z) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i2 == 3 && z) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!z) {
            zzf(0);
            return;
        }
        long zzc3 = zzrkVar.zzc();
        long j3 = this.zzh;
        if (zzc3 > j3) {
            if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j - this.zze > 2000000) {
            zzf(3);
        } else {
            this.zzh = zzrkVar.zzc();
            this.zzi = zzrkVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}

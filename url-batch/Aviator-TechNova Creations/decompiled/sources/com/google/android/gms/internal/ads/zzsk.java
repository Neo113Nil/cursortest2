package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzsk {
    private boolean zzA;
    private long zzB;
    private final zzsj zza;
    private final zzdn zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzrl zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzsk(zzsj zzsjVar, zzdn zzdnVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.zza = zzsjVar;
        this.zzb = zzdnVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzrl(audioTrack, zzsjVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zzA = zzfj.zzA(i);
        this.zzg = zzA;
        this.zzf = zzA ? zzfj.zzr(i3 / i2, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long zzw = zzfj.zzw(j - j2, this.zzi);
        zzdn zzdnVar = this.zzb;
        long zza = zzdnVar.zza() - zzfj.zzp(zzw);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(zza);
    }

    private final long zzh(long j) {
        long max = Math.max(0L, (this.zzt == 0 ? this.zzu != -9223372036854775807L ? zzfj.zzr(zzl(), this.zze) : zzj() : zzfj.zzv(j + this.zzk, this.zzi)) - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfj.zzr(this.zzx, this.zze), max) : max;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfj.zzr(zzk(), this.zze);
    }

    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long zzb = this.zzb.zzb();
        if (zzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                        this.zzv = -9223372036854775807L;
                    } else if (this.zzv == -9223372036854775807L) {
                        this.zzv = zzb;
                    }
                }
                if (this.zzq > playbackHeadPosition) {
                    this.zzr++;
                }
                this.zzq = playbackHeadPosition;
            }
            this.zzp = zzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfj.zzs(zzfj.zzv(zzfj.zzq(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza() {
        long j;
        int playState;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j2 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long zzc = this.zzb.zzc() / 1000;
            if (zzc - this.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzj = zzj();
                if (zzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfj.zzw(zzj, this.zzi) - zzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i = this.zzt;
                    if (i < 10) {
                        this.zzt = i + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzt;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += jArr[i2] / i3;
                        i2++;
                        j2 = j2;
                    }
                }
            }
            j = j2;
            if (this.zzg && (method = this.zzm) != null && zzc - this.zzo >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    String str = zzfj.zza;
                    Integer num2 = num;
                    long intValue = (num.intValue() * j) - this.zzf;
                    this.zzn = intValue;
                    long max = Math.max(intValue, 0L);
                    this.zzn = max;
                    if (max > 5000000) {
                        this.zza.zza(max);
                        this.zzn = 0L;
                    }
                } catch (Exception unused) {
                    this.zzm = null;
                }
                this.zzo = zzc;
            }
            this.zzh.zza(zzc, this.zzi, zzh(zzc));
            long zzc2 = this.zzb.zzc() / j;
            zzrl zzrlVar = this.zzh;
            boolean zzb = zzrlVar.zzb();
            long zze = !zzb ? zzrlVar.zze(zzc2, this.zzi) : zzh(zzc2);
            playState = audioTrack.getPlayState();
            if (playState != 3) {
                if (zzb || !zzrlVar.zzc()) {
                    zzg(zze);
                }
                long j3 = this.zzz;
                if (j3 != -9223372036854775807L) {
                    long j4 = zze - this.zzy;
                    long zzv = zzfj.zzv(zzc2 - j3, this.zzi);
                    long j5 = this.zzy + zzv;
                    long abs = Math.abs(j5 - zze);
                    if (j4 != 0 && abs < 1000000) {
                        long j6 = (zzv * 10) / 100;
                        zze = Math.max(j5 - j6, Math.min(zze, j5 + j6));
                    }
                }
                this.zzz = zzc2;
                this.zzy = zze;
            } else if (playState == 1) {
                zzg(zze);
                return zze;
            }
            return zze;
        }
        j = 1000;
        long zzc22 = this.zzb.zzc() / j;
        zzrl zzrlVar2 = this.zzh;
        boolean zzb2 = zzrlVar2.zzb();
        if (!zzb2) {
        }
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return zze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfj.zzq(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != -9223372036854775807L && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = zzfj.zzq(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}

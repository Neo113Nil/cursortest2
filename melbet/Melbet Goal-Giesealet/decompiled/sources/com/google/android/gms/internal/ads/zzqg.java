package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzqg {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzdb zzG;
    boolean zza;
    private final zzqf zzb;
    private final long[] zzc;
    private AudioTrack zzd;
    private int zze;
    private zzqe zzf;
    private int zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private Method zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzqg(zzqf zzqfVar) {
        this.zzb = zzqfVar;
        try {
            this.zzo = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzD = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzG = zzdb.zza;
    }

    private final void zzl(long j) {
        if (this.zza) {
            long j2 = this.zzk;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long zza = this.zzG.zza() - zzeo.zzp(zzeo.zzw(j - j2, this.zzi));
            this.zzk = -9223372036854775807L;
            this.zzb.zza(zza);
        }
    }

    private final long zzm(long j) {
        long max = Math.max(0L, (this.zzx == 0 ? this.zzy != -9223372036854775807L ? zzeo.zzr(zzq(), this.zzg) : zzo() : zzeo.zzv(j + this.zzm, this.zzi)) - this.zzp);
        return this.zzy != -9223372036854775807L ? Math.min(zzeo.zzr(this.zzB, this.zzg), max) : max;
    }

    private final void zzn() {
        this.zzm = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzn = 0L;
        this.zzC = -9223372036854775807L;
        this.zzD = -9223372036854775807L;
        this.zzj = false;
    }

    private final long zzo() {
        return zzeo.zzr(zzp(), this.zzg);
    }

    private final long zzp() {
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, zzq());
        }
        long zzb = this.zzG.zzb();
        if (zzb - this.zzt >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.zzu <= 0 || playState != 3) {
                        this.zzz = -9223372036854775807L;
                    } else if (this.zzz == -9223372036854775807L) {
                        this.zzz = zzb;
                    }
                }
                if (this.zzu > playbackHeadPosition) {
                    this.zzv++;
                }
                this.zzu = playbackHeadPosition;
            }
            this.zzt = zzb;
        }
        return this.zzu + this.zzF + (this.zzv << 32);
    }

    private final long zzq() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzA;
        }
        return this.zzA + zzeo.zzs(zzeo.zzv(zzeo.zzq(this.zzG.zzb()) - this.zzy, this.zzi), this.zzg);
    }

    public final void zza(AudioTrack audioTrack, int i, int i2, int i3, boolean z) {
        this.zzd = audioTrack;
        this.zze = i3;
        this.zzf = new zzqe(audioTrack, this.zzb);
        this.zzg = audioTrack.getSampleRate();
        boolean zzA = zzeo.zzA(i);
        this.zzr = zzA;
        this.zzh = zzA ? zzeo.zzr(i3 / i2, this.zzg) : -9223372036854775807L;
        this.zzu = 0L;
        this.zzv = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzq = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzs = 0L;
        this.zzp = 0L;
        this.zzi = 1.0f;
        this.zzl = 0;
        this.zzk = -9223372036854775807L;
        this.zza = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb() {
        long j;
        int playState;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.zzd;
        audioTrack2.getClass();
        long j2 = 1000;
        if (audioTrack2.getPlayState() == 3) {
            long zzc = this.zzG.zzc() / 1000;
            if (zzc - this.zzn >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzo = zzo();
                if (zzo != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzw] = zzeo.zzw(zzo, this.zzi) - zzc;
                    this.zzw = (this.zzw + 1) % 10;
                    int i = this.zzx;
                    if (i < 10) {
                        this.zzx = i + 1;
                    }
                    this.zzn = zzc;
                    this.zzm = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzm += jArr[i2] / i3;
                        i2++;
                        j2 = j2;
                    }
                }
            }
            j = j2;
            if (this.zzr && (method = this.zzo) != null && zzc - this.zzs >= 500000) {
                try {
                    audioTrack = this.zzd;
                } catch (Exception unused) {
                    this.zzo = null;
                }
                if (audioTrack == null) {
                    throw null;
                }
                Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                String str = zzeo.zza;
                Integer num2 = num;
                long intValue = (num.intValue() * j) - this.zzh;
                this.zzp = intValue;
                long max = Math.max(intValue, 0L);
                this.zzp = max;
                if (max > 5000000) {
                    this.zzb.zzd(max);
                    this.zzp = 0L;
                }
                this.zzs = zzc;
            }
            zzqe zzqeVar = this.zzf;
            zzqeVar.getClass();
            zzqeVar.zza(zzc, this.zzi, zzm(zzc));
            long zzc2 = this.zzG.zzc() / j;
            zzqe zzqeVar2 = this.zzf;
            zzqeVar2.getClass();
            boolean zzb = zzqeVar2.zzb();
            long zze = !zzb ? zzqeVar2.zze(zzc2, this.zzi) : zzm(zzc2);
            playState = audioTrack2.getPlayState();
            if (playState != 3) {
                if (zzb || !zzqeVar2.zzc()) {
                    zzl(zze);
                }
                long j3 = this.zzD;
                if (j3 != -9223372036854775807L) {
                    long j4 = zze - this.zzC;
                    long zzv = zzeo.zzv(zzc2 - j3, this.zzi);
                    long j5 = this.zzC + zzv;
                    long abs = Math.abs(j5 - zze);
                    if (j4 != 0 && abs < 1000000) {
                        long j6 = (zzv * 10) / 100;
                        zze = Math.max(j5 - j6, Math.min(zze, j5 + j6));
                    }
                }
                if (!this.zza && !this.zzj) {
                    long j7 = this.zzC;
                    if (j7 != -9223372036854775807L && zze > j7) {
                        this.zzj = true;
                        String str2 = zzeo.zza;
                        this.zzb.zza(this.zzG.zza() - zzeo.zzp(zzeo.zzw(zzeo.zzp(zze - j7), this.zzi)));
                    }
                }
                this.zzD = zzc2;
                this.zzC = zze;
            } else if (playState == 1) {
                zzl(zze);
                return zze;
            }
            return zze;
        }
        j = 1000;
        long zzc22 = this.zzG.zzc() / j;
        zzqe zzqeVar22 = this.zzf;
        zzqeVar22.getClass();
        boolean zzb2 = zzqeVar22.zzb();
        if (!zzb2) {
        }
        playState = audioTrack2.getPlayState();
        if (playState != 3) {
        }
        return zze;
    }

    public final void zzc() {
        if (this.zzy != -9223372036854775807L) {
            this.zzy = zzeo.zzq(this.zzG.zzb());
        }
        this.zzk = zzo();
        zzqe zzqeVar = this.zzf;
        zzqeVar.getClass();
        zzqeVar.zzd();
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zze(long j) {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        audioTrack.getPlayState();
        AudioTrack audioTrack2 = this.zzd;
        audioTrack2.getClass();
        int underrunCount = audioTrack2.getUnderrunCount();
        boolean z = underrunCount > this.zzl;
        this.zzl = underrunCount;
        if (z) {
            this.zzb.zze(this.zze, zzeo.zzp(this.zzh));
        }
        return true;
    }

    public final boolean zzf(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && this.zzG.zzb() - this.zzz >= 200;
    }

    public final void zzg(long j) {
        this.zzA = zzp();
        this.zzy = zzeo.zzq(this.zzG.zzb());
        this.zzB = j;
    }

    public final boolean zzh(long j) {
        return j > zzeo.zzs(zzb(), this.zzg);
    }

    public final void zzi() {
        zzn();
        if (this.zzy == -9223372036854775807L) {
            zzqe zzqeVar = this.zzf;
            zzqeVar.getClass();
            zzqeVar.zzd();
        }
        this.zzA = zzp();
    }

    public final void zzj() {
        zzn();
        this.zzd = null;
        this.zzf = null;
    }

    public final void zzk(zzdb zzdbVar) {
        this.zzG = zzdbVar;
    }
}

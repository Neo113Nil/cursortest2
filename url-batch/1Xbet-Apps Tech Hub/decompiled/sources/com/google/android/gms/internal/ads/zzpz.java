package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzpz {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private zzeg zzJ;
    private final zzpy zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpx zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpz(zzpy zzpyVar) {
        this.zza = zzpyVar;
        int i = zzfs.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzJ = zzeg.zza;
    }

    private final long zzm() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.zzy != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzA;
            }
            return Math.min(this.zzB, this.zzA + zzfs.zzn(zzfs.zzo(zzfs.zzq(elapsedRealtime) - this.zzy, this.zzj), this.zzg));
        }
        if (elapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.zzh) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzv = this.zzt;
                    }
                    playbackHeadPosition += this.zzv;
                    playState = i;
                }
                if (zzfs.zza <= 29) {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.zzt > 0 && playState == 3) {
                        if (this.zzz == -9223372036854775807L) {
                            this.zzz = elapsedRealtime;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                    playbackHeadPosition = j;
                }
                if (this.zzt > playbackHeadPosition) {
                    this.zzu++;
                }
                this.zzt = playbackHeadPosition;
            }
            this.zzs = elapsedRealtime;
        }
        return this.zzt + this.zzI + (this.zzu << 32);
    }

    private final long zzn() {
        return zzfs.zzr(zzm(), this.zzg);
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long zzn;
        zzps zzpsVar;
        zzps zzpsVar2;
        zzpn zzpnVar;
        Method method;
        long zzH;
        long zzI;
        long zzH2;
        long zzI2;
        zzpz zzpzVar = this;
        AudioTrack audioTrack = zzpzVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzpzVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzn2 = zzn();
                if (zzn2 != 0) {
                    zzpzVar.zzb[zzpzVar.zzw] = zzfs.zzp(zzn2, zzpzVar.zzj) - nanoTime;
                    zzpzVar.zzw = (zzpzVar.zzw + 1) % 10;
                    int i = zzpzVar.zzx;
                    if (i < 10) {
                        zzpzVar.zzx = i + 1;
                    }
                    zzpzVar.zzm = nanoTime;
                    zzpzVar.zzl = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = zzpzVar.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        zzpzVar.zzl += zzpzVar.zzb[i2] / i3;
                        i2++;
                    }
                }
            }
            if (!zzpzVar.zzh) {
                zzpx zzpxVar = zzpzVar.zzf;
                zzpxVar.getClass();
                if (zzpxVar.zzg(nanoTime)) {
                    long zzb = zzpxVar.zzb();
                    long zza = zzpxVar.zza();
                    long zzn3 = zzn();
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzqw zzqwVar = ((zzqr) zzpzVar.zza).zza;
                        zzH2 = zzqwVar.zzH();
                        zzI2 = zzqwVar.zzI();
                        zzez.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzn3 + ", " + zzH2 + ", " + zzI2);
                        zzpxVar.zzd();
                    } else if (Math.abs(zzfs.zzr(zza, zzpzVar.zzg) - zzn3) > 5000000) {
                        zzqw zzqwVar2 = ((zzqr) zzpzVar.zza).zza;
                        zzH = zzqwVar2.zzH();
                        zzI = zzqwVar2.zzI();
                        zzez.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzn3 + ", " + zzH + ", " + zzI);
                        zzpxVar.zzd();
                    } else {
                        zzpxVar.zzc();
                    }
                    zzpzVar = this;
                }
                if (zzpzVar.zzq && (method = zzpzVar.zzn) != null && nanoTime - zzpzVar.zzr >= 500000) {
                    try {
                        AudioTrack audioTrack2 = zzpzVar.zzc;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                        int i4 = zzfs.zza;
                        long intValue = (num.intValue() * 1000) - zzpzVar.zzi;
                        zzpzVar.zzo = intValue;
                        long max = Math.max(intValue, 0L);
                        zzpzVar.zzo = max;
                        if (max > 5000000) {
                            zzez.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            zzpzVar.zzo = 0L;
                        }
                    } catch (Exception unused) {
                        zzpzVar.zzn = null;
                    }
                    zzpzVar.zzr = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpx zzpxVar2 = zzpzVar.zzf;
        zzpxVar2.getClass();
        boolean zzf = zzpxVar2.zzf();
        if (zzf) {
            zzn = zzfs.zzr(zzpxVar2.zza(), zzpzVar.zzg) + zzfs.zzo(nanoTime2 - zzpxVar2.zzb(), zzpzVar.zzj);
        } else {
            zzn = zzpzVar.zzx == 0 ? zzn() : zzfs.zzo(zzpzVar.zzl + nanoTime2, zzpzVar.zzj);
            if (!z) {
                zzn = Math.max(0L, zzn - zzpzVar.zzo);
            }
        }
        if (zzpzVar.zzE != zzf) {
            zzpzVar.zzG = zzpzVar.zzD;
            zzpzVar.zzF = zzpzVar.zzC;
        }
        long j = nanoTime2 - zzpzVar.zzG;
        if (j < 1000000) {
            long zzo = zzpzVar.zzF + zzfs.zzo(j, zzpzVar.zzj);
            long j2 = (j * 1000) / 1000000;
            zzn = ((zzn * j2) + ((1000 - j2) * zzo)) / 1000;
        }
        if (!zzpzVar.zzk) {
            long j3 = zzpzVar.zzC;
            if (zzn > j3) {
                zzpzVar.zzk = true;
                int i5 = zzfs.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzfs.zzt(zzfs.zzp(zzfs.zzt(zzn - j3), zzpzVar.zzj));
                zzqw zzqwVar3 = ((zzqr) zzpzVar.zza).zza;
                zzpsVar = zzqwVar3.zzp;
                if (zzpsVar != null) {
                    zzpsVar2 = zzqwVar3.zzp;
                    zzpnVar = ((zzrb) zzpsVar2).zza.zzc;
                    zzpnVar.zzv(currentTimeMillis);
                }
            }
        }
        zzpzVar.zzD = nanoTime2;
        zzpzVar.zzC = zzn;
        zzpzVar.zzE = zzf;
        return zzn;
    }

    public final void zzc(long j) {
        this.zzA = zzm();
        this.zzy = zzfs.zzq(SystemClock.elapsedRealtime());
        this.zzB = j;
    }

    public final void zzd() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zzpx(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        if (z && zzfs.zza < 23) {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.zzh = z2;
            boolean zzG = zzfs.zzG(i);
            this.zzq = zzG;
            this.zzi = !zzG ? zzfs.zzr(i3 / i2, this.zzg) : -9223372036854775807L;
            this.zzt = 0L;
            this.zzu = 0L;
            this.zzH = false;
            this.zzI = 0L;
            this.zzv = 0L;
            this.zzp = false;
            this.zzy = -9223372036854775807L;
            this.zzz = -9223372036854775807L;
            this.zzr = 0L;
            this.zzo = 0L;
            this.zzj = 1.0f;
        }
        z2 = false;
        this.zzh = z2;
        boolean zzG2 = zzfs.zzG(i);
        this.zzq = zzG2;
        this.zzi = !zzG2 ? zzfs.zzr(i3 / i2, this.zzg) : -9223372036854775807L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzH = false;
        this.zzI = 0L;
        this.zzv = 0L;
        this.zzp = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final void zzf(zzeg zzegVar) {
        this.zzJ = zzegVar;
    }

    public final void zzg() {
        if (this.zzy != -9223372036854775807L) {
            this.zzy = zzfs.zzq(SystemClock.elapsedRealtime());
        }
        zzpx zzpxVar = this.zzf;
        zzpxVar.getClass();
        zzpxVar.zze();
    }

    public final boolean zzh(long j) {
        if (j > zzfs.zzn(zzb(false), this.zzg)) {
            return true;
        }
        if (this.zzh) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzm() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200;
    }

    public final boolean zzk(long j) {
        zzps zzpsVar;
        long j2;
        zzps zzpsVar2;
        zzpn zzpnVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzh = zzh(j);
        this.zzp = zzh;
        if (z && !zzh && playState != 1) {
            zzpy zzpyVar = this.zza;
            int i = this.zze;
            long zzt = zzfs.zzt(this.zzi);
            zzqr zzqrVar = (zzqr) zzpyVar;
            zzqw zzqwVar = zzqrVar.zza;
            zzpsVar = zzqwVar.zzp;
            if (zzpsVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = zzqwVar.zzV;
                zzpsVar2 = zzqrVar.zza.zzp;
                zzpnVar = ((zzrb) zzpsVar2).zza.zzc;
                zzpnVar.zzx(i, zzt, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzy != -9223372036854775807L) {
            this.zzA = zzm();
            return false;
        }
        zzpx zzpxVar = this.zzf;
        zzpxVar.getClass();
        zzpxVar.zze();
        return true;
    }
}

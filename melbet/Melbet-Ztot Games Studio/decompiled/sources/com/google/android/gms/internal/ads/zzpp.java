package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzpp {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private final zzpo zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzpn zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpp(zzpo zzpoVar) {
        this.zza = zzpoVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzk() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzet.zzo(zzet.zzp(zzet.zzr(elapsedRealtime) - this.zzx, this.zzi), this.zzf));
        }
        if (elapsedRealtime - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.zzg) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i;
                }
                if (zzet.zza <= 29) {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == -9223372036854775807L) {
                            this.zzy = elapsedRealtime;
                        }
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j;
                }
                if (this.zzs > playbackHeadPosition) {
                    this.zzt++;
                }
                this.zzs = playbackHeadPosition;
            }
            this.zzr = elapsedRealtime;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzl() {
        return zzet.zzs(zzk(), this.zzf);
    }

    private final void zzm() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    public final long zza(boolean z) {
        long zzl;
        zzpi zzpiVar;
        zzpi zzpiVar2;
        zzpd zzpdVar;
        Method method;
        AudioTrack audioTrack;
        long zzJ;
        long zzK;
        long zzJ2;
        long zzK2;
        zzpp zzppVar = this;
        AudioTrack audioTrack2 = zzppVar.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzppVar.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzl2 = zzl();
                if (zzl2 != 0) {
                    zzppVar.zzb[zzppVar.zzv] = zzet.zzq(zzl2, zzppVar.zzi) - nanoTime;
                    zzppVar.zzv = (zzppVar.zzv + 1) % 10;
                    int i = zzppVar.zzw;
                    if (i < 10) {
                        zzppVar.zzw = i + 1;
                    }
                    zzppVar.zzl = nanoTime;
                    zzppVar.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = zzppVar.zzw;
                        if (i2 >= i3) {
                            break;
                        }
                        zzppVar.zzk += zzppVar.zzb[i2] / i3;
                        i2++;
                    }
                }
            }
            if (!zzppVar.zzg) {
                zzpn zzpnVar = zzppVar.zze;
                zzpnVar.getClass();
                if (zzpnVar.zzg(nanoTime)) {
                    long zzb = zzpnVar.zzb();
                    long zza = zzpnVar.zza();
                    long zzl3 = zzl();
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzqp zzqpVar = ((zzqk) zzppVar.zza).zza;
                        zzJ2 = zzqpVar.zzJ();
                        zzK2 = zzqpVar.zzK();
                        zzea.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzl3 + ", " + zzJ2 + ", " + zzK2);
                        zzpnVar.zzd();
                    } else if (Math.abs(zzet.zzs(zza, zzppVar.zzf) - zzl3) > 5000000) {
                        zzqp zzqpVar2 = ((zzqk) zzppVar.zza).zza;
                        zzJ = zzqpVar2.zzJ();
                        zzK = zzqpVar2.zzK();
                        zzea.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzl3 + ", " + zzJ + ", " + zzK);
                        zzpnVar.zzd();
                    } else {
                        zzpnVar.zzc();
                    }
                    zzppVar = this;
                }
                if (zzppVar.zzp && (method = zzppVar.zzm) != null && nanoTime - zzppVar.zzq >= 500000) {
                    try {
                        audioTrack = zzppVar.zzc;
                    } catch (Exception unused) {
                        zzppVar.zzm = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    int i4 = zzet.zza;
                    long intValue = (num.intValue() * 1000) - zzppVar.zzh;
                    zzppVar.zzn = intValue;
                    long max = Math.max(intValue, 0L);
                    zzppVar.zzn = max;
                    if (max > 5000000) {
                        zzea.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                        zzppVar.zzn = 0L;
                    }
                    zzppVar.zzq = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpn zzpnVar2 = zzppVar.zze;
        zzpnVar2.getClass();
        boolean zzf = zzpnVar2.zzf();
        if (zzf) {
            zzl = zzet.zzs(zzpnVar2.zza(), zzppVar.zzf) + zzet.zzp(nanoTime2 - zzpnVar2.zzb(), zzppVar.zzi);
        } else {
            zzl = zzppVar.zzw == 0 ? zzl() : zzet.zzp(zzppVar.zzk + nanoTime2, zzppVar.zzi);
            if (!z) {
                zzl = Math.max(0L, zzl - zzppVar.zzn);
            }
        }
        if (zzppVar.zzD != zzf) {
            zzppVar.zzF = zzppVar.zzC;
            zzppVar.zzE = zzppVar.zzB;
        }
        long j = nanoTime2 - zzppVar.zzF;
        if (j < 1000000) {
            long zzp = zzppVar.zzE + zzet.zzp(j, zzppVar.zzi);
            long j2 = (j * 1000) / 1000000;
            zzl = ((zzl * j2) + ((1000 - j2) * zzp)) / 1000;
        }
        if (!zzppVar.zzj) {
            long j3 = zzppVar.zzB;
            if (zzl > j3) {
                zzppVar.zzj = true;
                int i5 = zzet.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzet.zzu(zzet.zzq(zzet.zzu(zzl - j3), zzppVar.zzi));
                zzqp zzqpVar3 = ((zzqk) zzppVar.zza).zza;
                zzpiVar = zzqpVar3.zzp;
                if (zzpiVar != null) {
                    zzpiVar2 = zzqpVar3.zzp;
                    zzpdVar = ((zzqu) zzpiVar2).zza.zzc;
                    zzpdVar.zzv(currentTimeMillis);
                }
            }
        }
        zzppVar.zzC = nanoTime2;
        zzppVar.zzB = zzl;
        zzppVar.zzD = zzf;
        return zzl;
    }

    public final void zzb(long j) {
        this.zzz = zzk();
        this.zzx = zzet.zzr(SystemClock.elapsedRealtime());
        this.zzA = j;
    }

    public final void zzc() {
        zzm();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i3;
        this.zze = new zzpn(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (z && zzet.zza < 23) {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.zzg = z2;
            boolean zzK = zzet.zzK(i);
            this.zzp = zzK;
            this.zzh = !zzK ? zzet.zzs(i3 / i2, this.zzf) : -9223372036854775807L;
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzG = false;
            this.zzH = 0L;
            this.zzu = 0L;
            this.zzo = false;
            this.zzx = -9223372036854775807L;
            this.zzy = -9223372036854775807L;
            this.zzq = 0L;
            this.zzn = 0L;
            this.zzi = 1.0f;
        }
        z2 = false;
        this.zzg = z2;
        boolean zzK2 = zzet.zzK(i);
        this.zzp = zzK2;
        this.zzh = !zzK2 ? zzet.zzs(i3 / i2, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzet.zzr(SystemClock.elapsedRealtime());
        }
        zzpn zzpnVar = this.zze;
        zzpnVar.getClass();
        zzpnVar.zze();
    }

    public final boolean zzf(long j) {
        if (j > zzet.zzo(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzk() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzg() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzh(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzi(long j) {
        zzpi zzpiVar;
        long j2;
        zzpi zzpiVar2;
        zzpd zzpdVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzk() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zzf = zzf(j);
        this.zzo = zzf;
        if (z && !zzf && playState != 1) {
            zzpo zzpoVar = this.zza;
            int i = this.zzd;
            long zzu = zzet.zzu(this.zzh);
            zzqk zzqkVar = (zzqk) zzpoVar;
            zzqp zzqpVar = zzqkVar.zza;
            zzpiVar = zzqpVar.zzp;
            if (zzpiVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = zzqpVar.zzV;
                zzpiVar2 = zzqkVar.zza.zzp;
                zzpdVar = ((zzqu) zzpiVar2).zza.zzc;
                zzpdVar.zzx(i, zzu, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzj() {
        zzm();
        if (this.zzx != -9223372036854775807L) {
            this.zzz = zzk();
            return false;
        }
        zzpn zzpnVar = this.zze;
        zzpnVar.getClass();
        zzpnVar.zze();
        return true;
    }
}

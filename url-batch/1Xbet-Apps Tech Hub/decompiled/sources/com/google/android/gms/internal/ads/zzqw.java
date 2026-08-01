package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzqw implements zzpv {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzqi zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzqm zzY;
    private final zzqd zzZ;
    private final zzqa zzd;
    private final zzrg zze;
    private final zzfwu zzf;
    private final zzfwu zzg;
    private final zzei zzh;
    private final zzpz zzi;
    private final ArrayDeque zzj;
    private zzqu zzk;
    private final zzqp zzl;
    private final zzqp zzm;
    private final zzqj zzn;
    private zzov zzo;
    private zzps zzp;
    private zzql zzq;
    private zzql zzr;
    private zzdv zzs;
    private AudioTrack zzt;
    private zzox zzu;
    private zzk zzv;
    private zzqo zzw;
    private zzqo zzx;
    private zzcj zzy;
    private boolean zzz;

    /* synthetic */ zzqw(zzqk zzqkVar, zzqv zzqvVar) {
        zzox zzoxVar;
        zzqm zzqmVar;
        zzqj zzqjVar;
        zzqd zzqdVar;
        zzoxVar = zzqkVar.zza;
        this.zzu = zzoxVar;
        zzqmVar = zzqkVar.zzd;
        this.zzY = zzqmVar;
        int i = zzfs.zza;
        zzqjVar = zzqkVar.zzc;
        this.zzn = zzqjVar;
        zzqdVar = zzqkVar.zze;
        zzqdVar.getClass();
        this.zzZ = zzqdVar;
        zzei zzeiVar = new zzei(zzeg.zza);
        this.zzh = zzeiVar;
        zzeiVar.zze();
        this.zzi = new zzpz(new zzqr(this, null));
        zzqa zzqaVar = new zzqa();
        this.zzd = zzqaVar;
        zzrg zzrgVar = new zzrg();
        this.zze = zzrgVar;
        this.zzf = zzfwu.zzo(new zzec(), zzqaVar, zzrgVar);
        this.zzg = zzfwu.zzm(new zzrf());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        this.zzx = new zzqo(zzcj.zza, 0L, 0L, null);
        this.zzy = zzcj.zza;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqp(100L);
        this.zzm = new zzqp(100L);
    }

    static /* synthetic */ void zzF(AudioTrack audioTrack, final zzps zzpsVar, Handler handler, final zzpp zzppVar, zzei zzeiVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpsVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpn zzpnVar;
                        zzpnVar = ((zzrb) zzps.this).zza.zzc;
                        zzpnVar.zzd(zzppVar);
                    }
                });
            }
            zzeiVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzpsVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpn zzpnVar;
                        zzpnVar = ((zzrb) zzps.this).zza.zzc;
                        zzpnVar.zzd(zzppVar);
                    }
                });
            }
            zzeiVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzH() {
        return this.zzr.zzc == 0 ? this.zzA / r0.zzb : this.zzB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzI() {
        zzql zzqlVar = this.zzr;
        if (zzqlVar.zzc != 0) {
            return this.zzD;
        }
        long j = this.zzC;
        long j2 = zzqlVar.zzd;
        int i = zzfs.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzJ(zzql zzqlVar) throws zzpr {
        try {
            return zzqlVar.zza(this.zzv, this.zzS);
        } catch (zzpr e) {
            zzps zzpsVar = this.zzp;
            if (zzpsVar != null) {
                zzpsVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzK(long j) {
        zzcj zzcjVar;
        boolean z;
        zzpn zzpnVar;
        if (zzV()) {
            zzqm zzqmVar = this.zzY;
            zzcjVar = this.zzy;
            zzqmVar.zzc(zzcjVar);
        } else {
            zzcjVar = zzcj.zza;
        }
        zzcj zzcjVar2 = zzcjVar;
        this.zzy = zzcjVar2;
        if (zzV()) {
            zzqm zzqmVar2 = this.zzY;
            z = this.zzz;
            zzqmVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzz = z;
        this.zzj.add(new zzqo(zzcjVar2, Math.max(0L, j), zzfs.zzr(zzI(), this.zzr.zze), null));
        zzQ();
        zzps zzpsVar = this.zzp;
        if (zzpsVar != null) {
            boolean z2 = this.zzz;
            zzpnVar = ((zzrb) zzpsVar).zza.zzc;
            zzpnVar.zzw(z2);
        }
    }

    private final void zzL() {
        if (this.zzr.zzc()) {
            this.zzW = true;
        }
    }

    private final void zzM() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzi.zzc(zzI());
        this.zzt.stop();
    }

    private final void zzN(long j) throws zzpu {
        ByteBuffer zzb2;
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzJ;
            if (byteBuffer == null) {
                byteBuffer = zzdy.zza;
            }
            zzR(byteBuffer, j);
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                zzb2 = this.zzs.zzb();
                if (zzb2.hasRemaining()) {
                    zzR(zzb2, j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzJ;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzJ);
                    }
                }
            } while (!zzb2.hasRemaining());
            return;
        }
    }

    private final void zzO(zzcj zzcjVar) {
        zzqo zzqoVar = new zzqo(zzcjVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzT()) {
            this.zzw = zzqoVar;
        } else {
            this.zzx = zzqoVar;
        }
    }

    private final void zzP() {
        if (zzT()) {
            if (zzfs.zza >= 21) {
                this.zzt.setVolume(this.zzI);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f = this.zzI;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzQ() {
        zzdv zzdvVar = this.zzr.zzi;
        this.zzs = zzdvVar;
        zzdvVar.zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzR(ByteBuffer byteBuffer, long j) throws zzpu {
        int write;
        zzps zzpsVar;
        zzly zzlyVar;
        zzly zzlyVar2;
        zzpu zzpuVar;
        zzps zzpsVar2;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        if (byteBuffer2 != null) {
            zzef.zzd(byteBuffer2 == byteBuffer);
        } else {
            this.zzL = byteBuffer;
            if (zzfs.zza < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzM;
                if (bArr == null || bArr.length < remaining) {
                    this.zzM = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzM, 0, remaining);
                byteBuffer.position(position);
                this.zzN = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zzfs.zza < 21) {
            int zza2 = this.zzi.zza(this.zzC);
            if (zza2 > 0) {
                write = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                if (write > 0) {
                    this.zzN += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            } else {
                write = 0;
            }
        } else {
            write = this.zzt.write(byteBuffer, remaining2, 1);
        }
        this.zzV = SystemClock.elapsedRealtime();
        if (write >= 0) {
            this.zzm.zza();
            if (zzU(this.zzt)) {
                if (this.zzD > 0) {
                    this.zzX = false;
                }
                if (this.zzQ && (zzpsVar = this.zzp) != null && write < remaining2) {
                    zzrc zzrcVar = ((zzrb) zzpsVar).zza;
                    zzlyVar = zzrcVar.zzl;
                    if (zzlyVar != null) {
                        zzlyVar2 = zzrcVar.zzl;
                        zzlyVar2.zza();
                    }
                }
            }
            int i = this.zzr.zzc;
            if (i == 0) {
                this.zzC += write;
            }
            if (write == remaining2) {
                if (i != 0) {
                    zzef.zzf(byteBuffer == this.zzJ);
                    this.zzD += this.zzE * this.zzK;
                }
                this.zzL = null;
                return;
            }
            return;
        }
        if ((zzfs.zza >= 24 && write == -6) || write == -32) {
            if (zzI() <= 0) {
                if (zzU(this.zzt)) {
                    zzL();
                }
            }
            zzpuVar = new zzpu(write, this.zzr.zza, r0);
            zzpsVar2 = this.zzp;
            if (zzpsVar2 != null) {
                zzpsVar2.zza(zzpuVar);
            }
            if (zzpuVar.zzb) {
                this.zzm.zzb(zzpuVar);
                return;
            } else {
                this.zzu = zzox.zza;
                throw zzpuVar;
            }
        }
        r0 = false;
        zzpuVar = new zzpu(write, this.zzr.zza, r0);
        zzpsVar2 = this.zzp;
        if (zzpsVar2 != null) {
        }
        if (zzpuVar.zzb) {
        }
    }

    private final boolean zzS() throws zzpu {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzR(byteBuffer, Long.MIN_VALUE);
            return this.zzL == null;
        }
        this.zzs.zzd();
        zzN(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzT() {
        return this.zzt != null;
    }

    private static boolean zzU(AudioTrack audioTrack) {
        return zzfs.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzV() {
        zzql zzqlVar = this.zzr;
        if (zzqlVar.zzc != 0) {
            return false;
        }
        int i = zzqlVar.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final int zza(zzam zzamVar) {
        if (!"audio/raw".equals(zzamVar.zzm)) {
            return this.zzu.zza(zzamVar) != null ? 2 : 0;
        }
        if (zzfs.zzG(zzamVar.zzB)) {
            return zzamVar.zzB != 2 ? 1 : 2;
        }
        zzez.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzamVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final long zzb(boolean z) {
        long zzo;
        if (!zzT() || this.zzG) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzi.zzb(z), zzfs.zzr(zzI(), this.zzr.zze));
        while (!this.zzj.isEmpty() && min >= ((zzqo) this.zzj.getFirst()).zzc) {
            this.zzx = (zzqo) this.zzj.remove();
        }
        zzqo zzqoVar = this.zzx;
        long j = min - zzqoVar.zzc;
        if (zzqoVar.zza.equals(zzcj.zza)) {
            zzo = this.zzx.zzb + j;
        } else if (this.zzj.isEmpty()) {
            zzo = this.zzY.zza(j) + this.zzx.zzb;
        } else {
            zzqo zzqoVar2 = (zzqo) this.zzj.getFirst();
            zzo = zzqoVar2.zzb - zzfs.zzo(zzqoVar2.zzc - min, this.zzx.zza.zzc);
        }
        zzql zzqlVar = this.zzr;
        zzqm zzqmVar = this.zzY;
        return zzo + zzfs.zzr(zzqmVar.zzb(), zzqlVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final zzcj zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final zzpa zzd(zzam zzamVar) {
        return this.zzW ? zzpa.zza : this.zzZ.zza(zzamVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zze(zzam zzamVar, int i, int[] iArr) throws zzpq {
        int intValue;
        int i2;
        zzdv zzdvVar;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int i6;
        int max;
        int[] iArr2;
        if ("audio/raw".equals(zzamVar.zzm)) {
            zzef.zzd(zzfs.zzG(zzamVar.zzB));
            i3 = zzfs.zzl(zzamVar.zzB, zzamVar.zzz);
            zzfwr zzfwrVar = new zzfwr();
            int i7 = zzamVar.zzB;
            zzfwrVar.zzh(this.zzf);
            zzfwrVar.zzg(this.zzY.zze());
            zzdv zzdvVar2 = new zzdv(zzfwrVar.zzi());
            if (zzdvVar2.equals(this.zzs)) {
                zzdvVar2 = this.zzs;
            }
            this.zze.zzq(zzamVar.zzC, zzamVar.zzD);
            if (zzfs.zza < 21 && zzamVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzd.zzo(iArr2);
            try {
                zzdw zza2 = zzdvVar2.zza(new zzdw(zzamVar.zzA, zzamVar.zzz, zzamVar.zzB));
                intValue = zza2.zzd;
                int i9 = zza2.zzb;
                int i10 = zza2.zzc;
                intValue2 = zzfs.zzg(i10);
                i5 = zzfs.zzl(intValue, i10);
                zzdvVar = zzdvVar2;
                i4 = i9;
                i2 = 0;
            } catch (zzdx e) {
                throw new zzpq(e, zzamVar);
            }
        } else {
            zzdv zzdvVar3 = new zzdv(zzfwu.zzl());
            int i11 = zzamVar.zzA;
            zzpa zzpaVar = zzpa.zza;
            Pair zza3 = this.zzu.zza(zzamVar);
            if (zza3 == null) {
                throw new zzpq("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzamVar))), zzamVar);
            }
            intValue = ((Integer) zza3.first).intValue();
            i2 = 2;
            zzdvVar = zzdvVar3;
            i3 = -1;
            intValue2 = ((Integer) zza3.second).intValue();
            i4 = i11;
            i5 = -1;
        }
        if (intValue == 0) {
            throw new zzpq("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        if (intValue2 == 0) {
            throw new zzpq("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue2, intValue);
        zzef.zzf(minBufferSize != -2);
        int i12 = i5 != -1 ? i5 : 1;
        int i13 = zzamVar.zzi;
        int i14 = 250000;
        if (i2 == 0) {
            i6 = i5;
            max = Math.max(zzqy.zza(250000, i4, i12), Math.min(minBufferSize * 4, zzqy.zza(750000, i4, i12)));
        } else if (i2 != 1) {
            if (intValue == 5) {
                i14 = 500000;
            } else if (intValue == 8) {
                i14 = DurationKt.NANOS_IN_MILLIS;
                intValue = 8;
            }
            i6 = i5;
            max = zzfzi.zza((i14 * (i13 != -1 ? zzfzd.zza(i13, 8, RoundingMode.CEILING) : zzqy.zzb(intValue))) / 1000000);
        } else {
            i6 = i5;
            max = zzfzi.zza((zzqy.zzb(intValue) * 50000000) / 1000000);
        }
        this.zzW = false;
        zzql zzqlVar = new zzql(zzamVar, i3, i2, i6, i4, intValue2, intValue, (((Math.max(minBufferSize, max) + i12) - 1) / i12) * i12, zzdvVar, false, false, false);
        if (zzT()) {
            this.zzq = zzqlVar;
        } else {
            this.zzr = zzqlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzf() {
        if (zzT()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzqo(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzQ();
            if (this.zzi.zzi()) {
                this.zzt.pause();
            }
            if (zzU(this.zzt)) {
                zzqu zzquVar = this.zzk;
                zzquVar.getClass();
                zzquVar.zzb(this.zzt);
            }
            if (zzfs.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            final zzpp zzb2 = this.zzr.zzb();
            zzql zzqlVar = this.zzq;
            if (zzqlVar != null) {
                this.zzr = zzqlVar;
                this.zzq = null;
            }
            this.zzi.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzei zzeiVar = this.zzh;
            final zzps zzpsVar = this.zzp;
            zzeiVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfs.zzD("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqw.zzF(audioTrack, zzpsVar, handler, zzb2, zzeiVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzg() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzh() {
        this.zzQ = false;
        if (zzT()) {
            if (this.zzi.zzl() || zzU(this.zzt)) {
                this.zzt.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzi() {
        this.zzQ = true;
        if (zzT()) {
            this.zzi.zzg();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzj() throws zzpu {
        if (!this.zzO && zzT() && zzS()) {
            zzM();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzk() {
        zzf();
        zzfwu zzfwuVar = this.zzf;
        int size = zzfwuVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdy) zzfwuVar.get(i)).zzf();
        }
        zzfwu zzfwuVar2 = this.zzg;
        int size2 = zzfwuVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdy) zzfwuVar2.get(i2)).zzf();
        }
        zzdv zzdvVar = this.zzs;
        if (zzdvVar != null) {
            zzdvVar.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzl(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzm(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            this.zzR = i != 0;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzn(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        if (this.zzt != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzo(zzeg zzegVar) {
        this.zzi.zzf(zzegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzp(zzps zzpsVar) {
        this.zzp = zzpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzq(int i, int i2) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzU(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzr(zzcj zzcjVar) {
        this.zzy = new zzcj(Math.max(0.1f, Math.min(zzcjVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzcjVar.zzd, 8.0f)));
        zzO(zzcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzs(zzov zzovVar) {
        this.zzo = zzovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzu(boolean z) {
        this.zzz = z;
        zzO(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzv(float f) {
        if (this.zzI != f) {
            this.zzI = f;
            zzP();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e1 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzpv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzw(ByteBuffer byteBuffer, long j, int i) throws zzpr, zzpu {
        AudioTrack zzJ;
        zzpn zzpnVar;
        zzov zzovVar;
        boolean z;
        int zza2;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzJ;
        zzef.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzq != null) {
            if (!zzS()) {
                return false;
            }
            zzql zzqlVar = this.zzq;
            zzql zzqlVar2 = this.zzr;
            if (zzqlVar2.zzc == zzqlVar.zzc && zzqlVar2.zzg == zzqlVar.zzg && zzqlVar2.zze == zzqlVar.zze && zzqlVar2.zzf == zzqlVar.zzf && zzqlVar2.zzd == zzqlVar.zzd) {
                boolean z2 = zzqlVar2.zzj;
                boolean z3 = zzqlVar.zzj;
                boolean z4 = zzqlVar2.zzk;
                boolean z5 = zzqlVar.zzk;
                this.zzr = zzqlVar;
                this.zzq = null;
                AudioTrack audioTrack = this.zzt;
                if (audioTrack != null && zzU(audioTrack)) {
                    boolean z6 = this.zzr.zzk;
                }
            } else {
                zzM();
                if (zzx()) {
                    return false;
                }
                zzf();
            }
            zzK(j);
        }
        if (!zzT()) {
            try {
                if (!this.zzh.zzd()) {
                    return false;
                }
                try {
                    zzql zzqlVar3 = this.zzr;
                    zzqlVar3.getClass();
                    zzJ = zzJ(zzqlVar3);
                } catch (zzpr e) {
                    zzql zzqlVar4 = this.zzr;
                    if (zzqlVar4.zzh > 1000000) {
                        zzam zzamVar = zzqlVar4.zza;
                        int i7 = zzqlVar4.zzb;
                        int i8 = zzqlVar4.zzc;
                        int i9 = zzqlVar4.zzd;
                        int i10 = zzqlVar4.zze;
                        int i11 = zzqlVar4.zzf;
                        int i12 = zzqlVar4.zzg;
                        zzdv zzdvVar = zzqlVar4.zzi;
                        boolean z7 = zzqlVar4.zzj;
                        boolean z8 = zzqlVar4.zzk;
                        boolean z9 = zzqlVar4.zzl;
                        zzql zzqlVar5 = new zzql(zzamVar, i7, i8, i9, i10, i11, i12, DurationKt.NANOS_IN_MILLIS, zzdvVar, false, false, false);
                        try {
                            zzJ = zzJ(zzqlVar5);
                            this.zzr = zzqlVar5;
                        } catch (zzpr e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                            } catch (Exception unused) {
                            }
                            zzL();
                            throw e;
                        }
                    }
                    zzL();
                    throw e;
                }
                this.zzt = zzJ;
                if (zzU(zzJ)) {
                    AudioTrack audioTrack2 = this.zzt;
                    if (this.zzk == null) {
                        this.zzk = new zzqu(this);
                    }
                    this.zzk.zza(audioTrack2);
                    boolean z10 = this.zzr.zzk;
                }
                if (zzfs.zza >= 31 && (zzovVar = this.zzo) != null) {
                    zzqh.zza(this.zzt, zzovVar);
                }
                this.zzS = this.zzt.getAudioSessionId();
                zzpz zzpzVar = this.zzi;
                AudioTrack audioTrack3 = this.zzt;
                zzql zzqlVar6 = this.zzr;
                zzpzVar.zze(audioTrack3, zzqlVar6.zzc == 2, zzqlVar6.zzg, zzqlVar6.zzd, zzqlVar6.zzh);
                zzP();
                int i13 = this.zzT.zza;
                zzqi zzqiVar = this.zzU;
                if (zzqiVar != null && zzfs.zza >= 23) {
                    zzqg.zza(this.zzt, zzqiVar);
                }
                this.zzG = true;
                zzps zzpsVar = this.zzp;
                if (zzpsVar != null) {
                    zzpp zzb2 = this.zzr.zzb();
                    zzpnVar = ((zzrb) zzpsVar).zza.zzc;
                    zzpnVar.zzc(zzb2);
                }
            } catch (zzpr e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzl.zzb(e3);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzG) {
            this.zzH = Math.max(0L, j);
            this.zzF = false;
            this.zzG = false;
            zzK(j);
            if (this.zzQ) {
                zzi();
            }
        }
        if (!this.zzi.zzk(zzI())) {
            return false;
        }
        if (this.zzJ == null) {
            zzef.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzql zzqlVar7 = this.zzr;
            if (zzqlVar7.zzc != 0 && this.zzE == 0) {
                int i14 = zzqlVar7.zzg;
                switch (i14) {
                    case 5:
                    case 6:
                    case 18:
                        z = true;
                        zza2 = zzabf.zza(byteBuffer);
                        this.zzE = zza2;
                        if (zza2 == 0) {
                            return z;
                        }
                        break;
                    case 7:
                    case 8:
                        int i15 = zzacb.zza;
                        if (byteBuffer.getInt(0) != -233094848) {
                            if (byteBuffer.getInt(0) != -398277519) {
                                if (byteBuffer.getInt(0) == 622876772) {
                                    zza2 = 4096;
                                    z = true;
                                } else {
                                    int position = byteBuffer.position();
                                    byte b2 = byteBuffer.get(position);
                                    if (b2 != -2) {
                                        if (b2 == -1) {
                                            i3 = 2;
                                            i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                            b = byteBuffer.get(position + 7);
                                        } else if (b2 != 31) {
                                            i4 = (byteBuffer.get(position + 4) & 1) << 6;
                                            i5 = byteBuffer.get(position + 5) & 252;
                                            i3 = 2;
                                            i2 = (i5 >> i3) | i4;
                                            z = true;
                                        } else {
                                            i3 = 2;
                                            i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                            b = byteBuffer.get(position + 6);
                                        }
                                        i5 = b & 60;
                                        i2 = (i5 >> i3) | i4;
                                        z = true;
                                    } else {
                                        z = true;
                                        i2 = ((byteBuffer.get(position + 5) & 1) << 6) | ((byteBuffer.get(position + 4) & 252) >> 2);
                                    }
                                    zza2 = (i2 + (z ? 1 : 0)) * 32;
                                }
                            }
                            zza2 = 1024;
                            z = true;
                        } else {
                            z = true;
                            zza2 = 1024;
                        }
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 9:
                        zza2 = zzacz.zzc(zzfs.zzh(byteBuffer, byteBuffer.position()));
                        if (zza2 == -1) {
                            throw new IllegalArgumentException();
                        }
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 10:
                    case 16:
                        zza2 = 1024;
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 11:
                    case 12:
                        zza2 = 2048;
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException("Unexpected audio encoding: " + i14);
                    case 14:
                        int i16 = zzabf.zza;
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i17 = position2;
                        while (true) {
                            if (i17 > limit) {
                                i6 = -1;
                            } else if ((zzfs.zzh(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                i6 = i17 - position2;
                            } else {
                                i17++;
                            }
                        }
                        if (i6 == -1) {
                            zza2 = 0;
                        } else {
                            zza2 = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 15:
                        zza2 = 512;
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 17:
                        int i18 = zzabi.zza;
                        byte[] bArr = new byte[16];
                        int position3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position3);
                        zza2 = zzabi.zza(new zzfi(bArr, 16)).zzc;
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 20:
                        zza2 = zzada.zzb(byteBuffer);
                        z = true;
                        this.zzE = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                }
            }
            if (this.zzw != null) {
                if (!zzS()) {
                    return false;
                }
                zzK(j);
                this.zzw = null;
            }
            long zzr = this.zzH + zzfs.zzr(zzH() - this.zze.zzo(), this.zzr.zza.zzA);
            if (!this.zzF && Math.abs(zzr - j) > 200000) {
                zzps zzpsVar2 = this.zzp;
                if (zzpsVar2 != null) {
                    zzpsVar2.zza(new zzpt(j, zzr));
                }
                this.zzF = true;
            }
            if (this.zzF) {
                if (!zzS()) {
                    return false;
                }
                long j2 = j - zzr;
                this.zzH += j2;
                this.zzF = false;
                zzK(j);
                zzps zzpsVar3 = this.zzp;
                if (zzpsVar3 != null && j2 != 0) {
                    ((zzrb) zzpsVar3).zza.zzak();
                }
            }
            if (this.zzr.zzc == 0) {
                this.zzA += byteBuffer.remaining();
            } else {
                this.zzB += this.zzE * i;
            }
            this.zzJ = byteBuffer;
            this.zzK = i;
        }
        zzN(j);
        if (!this.zzJ.hasRemaining()) {
            this.zzJ = null;
            this.zzK = 0;
            return true;
        }
        if (!this.zzi.zzj(zzI())) {
            return false;
        }
        zzez.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final boolean zzx() {
        return zzT() && this.zzi.zzh(zzI());
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final boolean zzy() {
        if (zzT()) {
            return this.zzO && !zzx();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final boolean zzz(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zzt(AudioDeviceInfo audioDeviceInfo) {
        zzqi zzqiVar = audioDeviceInfo == null ? null : new zzqi(audioDeviceInfo);
        this.zzU = zzqiVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzqg.zza(audioTrack, zzqiVar);
        }
    }
}

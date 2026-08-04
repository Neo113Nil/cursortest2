package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzrc implements zzqc {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzqs zzA;
    private zzau zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private boolean zzU;
    private zzd zzV;
    private AudioDeviceInfo zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    private Looper zzaa;
    private long zzab;
    private long zzac;
    private Handler zzad;
    private Context zzae;
    private boolean zzaf;
    private final zzqm zzag;
    private final zzqi zzah;
    private final Context zzd;
    private final zzqh zze;
    private final zzrk zzf;
    private final zzcj zzg;
    private final zzrj zzh;
    private final zzgjz zzi;
    private final zzqg zzj;
    private final ArrayDeque zzk;
    private zzrb zzl;
    private final zzqx zzm;
    private final zzqx zzn;
    private final int zzo;
    private zzox zzp;
    private zzpz zzq;
    private zzql zzr;
    private zzql zzs;
    private zzcb zzt;
    private AudioTrack zzu;
    private zzoz zzv;
    private zzpe zzw;
    private zzqw zzx;
    private zzc zzy;
    private zzqs zzz;

    static /* synthetic */ void zzE(AudioTrack audioTrack, final zzpz zzpzVar, Handler handler, final zzpw zzpwVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpzVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpz.this.zzc(zzpwVar);
                    }
                });
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzpzVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpz.this.zzc(zzpwVar);
                    }
                });
            }
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

    static /* synthetic */ boolean zzH() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    private final void zzN() {
        zzcb zzcbVar = this.zzs.zzi;
        this.zzt = zzcbVar;
        zzcbVar.zzb(zzcd.zza);
    }

    private final AudioTrack zzO(zzql zzqlVar) throws zzpy {
        Context context;
        try {
            int i = this.zzT;
            int i2 = this.zzo;
            Context context2 = null;
            if (i2 != -1 && (context = this.zzd) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.zzae == null) {
                    this.zzae = context.createDeviceContext(i2);
                }
                context2 = this.zzae;
                i = 0;
            }
            return zzaf(zzqlVar.zza(), this.zzy, i, zzqlVar.zza, context2);
        } catch (zzpy e) {
            zzpz zzpzVar = this.zzq;
            if (zzpzVar != null) {
                zzpzVar.zzb(e);
            }
            throw e;
        }
    }

    private final void zzP(long j) throws zzqb {
        zzS(j);
        if (this.zzO != null) {
            return;
        }
        if (!this.zzt.zzc()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer != null) {
                zzR(byteBuffer);
                zzS(j);
                return;
            }
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                ByteBuffer zze = this.zzt.zze();
                if (zze.hasRemaining()) {
                    zzR(zze);
                    zzS(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zzd(this.zzM);
                    }
                }
            } while (this.zzO == null);
            return;
        }
    }

    private final boolean zzQ() throws zzqb {
        if (!this.zzt.zzc()) {
            zzS(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzf();
        zzP(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzO;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzR(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzghc.zzh(this.zzO == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzs.zzc == 0) {
                int zzs = (int) zzeo.zzs(zzeo.zzq(20L), this.zzs.zze);
                long zzG = zzG();
                long j = zzs;
                if (zzG < j) {
                    zzql zzqlVar = this.zzs;
                    int i11 = zzqlVar.zzg;
                    int i12 = zzqlVar.zzd;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i13 = (int) zzG;
                    while (byteBuffer.hasRemaining() && i13 < zzs) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i11 != 4) {
                                if (i11 != 21) {
                                    if (i11 == 22) {
                                        i7 = byteBuffer.get() & 255;
                                        i8 = (byteBuffer.get() & 255) << 8;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 24;
                                    } else if (i11 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i11 == 1342177280) {
                                        i4 = (byteBuffer.get() & 255) << 24;
                                        i5 = (byteBuffer.get() & 255) << 16;
                                        i6 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i11 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i7 = (byteBuffer.get() & 255) << 24;
                                        i8 = (byteBuffer.get() & 255) << 16;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = byteBuffer.get() & 255;
                                    }
                                    i3 = i7 | i8 | i9 | i10;
                                } else {
                                    i4 = (byteBuffer.get() & 255) << 8;
                                    i5 = (byteBuffer.get() & 255) << 16;
                                    i6 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i4 | i5 | i6;
                            } else {
                                float max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i3 = (int) (max < 0.0f ? (-max) * (-2.1474836E9f) : max * 2.1474836E9f);
                            }
                            int i14 = (int) ((i3 * i13) / j);
                            if (i11 != 2) {
                                order.put((byte) (i14 >> 16));
                                order.put((byte) (i14 >> 24));
                            } else if (i11 == 3) {
                                order.put((byte) (i14 >> 24));
                            } else if (i11 != 4) {
                                if (i11 == 21) {
                                    order.put((byte) (i14 >> 8));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 24));
                                } else if (i11 == 22) {
                                    order.put((byte) i14);
                                    order.put((byte) (i14 >> 8));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 24));
                                } else if (i11 == 268435456) {
                                    order.put((byte) (i14 >> 24));
                                    order.put((byte) (i14 >> 16));
                                } else if (i11 == 1342177280) {
                                    order.put((byte) (i14 >> 24));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 8));
                                } else {
                                    if (i11 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    order.put((byte) (i14 >> 24));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 8));
                                    order.put((byte) i14);
                                }
                            } else if (i14 < 0) {
                                order.putFloat((-i14) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i14 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i12) {
                                i13++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        int i142 = (int) ((i3 * i13) / j);
                        if (i11 != 2) {
                        }
                        if (byteBuffer.position() != position + i12) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.zzO = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.zzO = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzS(long j) throws zzqb {
        zzpz zzpzVar;
        zzqb zzqbVar;
        zzpz zzpzVar2;
        if (this.zzO == null) {
            return;
        }
        zzqx zzqxVar = this.zzn;
        if (zzqxVar.zzb()) {
            return;
        }
        int remaining = this.zzO.remaining();
        int write = this.zzu.write(this.zzO, remaining, 1);
        this.zzX = SystemClock.elapsedRealtime();
        if (write >= 0) {
            zzqxVar.zzc();
            if (zzac(this.zzu)) {
                if (this.zzG > 0) {
                    this.zzZ = false;
                }
                if (this.zzS && (zzpzVar = this.zzq) != null && write < remaining) {
                }
            }
            int i = this.zzs.zzc;
            if (i == 0) {
                this.zzF += write;
            }
            if (write == remaining) {
                if (i != 0) {
                    zzghc.zzh(this.zzO == this.zzM);
                    this.zzG += this.zzH * this.zzN;
                }
                this.zzO = null;
                return;
            }
            return;
        }
        if (write == -6 || write == -32) {
            if (zzG() <= 0) {
                if (zzac(this.zzu)) {
                    zzT();
                }
            }
            zzqbVar = new zzqb(write, this.zzs.zza, r2);
            zzpzVar2 = this.zzq;
            if (zzpzVar2 != null) {
                zzpzVar2.zzb(zzqbVar);
            }
            if (zzqbVar.zzb || this.zzd == null) {
                zzqxVar.zza(zzqbVar);
            }
            zzoz zzozVar = zzoz.zza;
            this.zzv = zzozVar;
            this.zzw.zza(zzozVar);
            throw zzqbVar;
        }
        r2 = false;
        zzqbVar = new zzqb(write, this.zzs.zza, r2);
        zzpzVar2 = this.zzq;
        if (zzpzVar2 != null) {
        }
        if (zzqbVar.zzb) {
        }
        zzqxVar.zza(zzqbVar);
    }

    private final void zzT() {
        if (this.zzs.zzc == 1) {
            this.zzY = true;
        }
    }

    private final void zzU() {
        if (zzY()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzV(zzau zzauVar) {
        zzqs zzqsVar = new zzqs(zzauVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzY()) {
            this.zzz = zzqsVar;
        } else {
            this.zzA = zzqsVar;
        }
    }

    private final void zzW(long j) {
        zzau zzauVar;
        boolean z;
        if (zzX()) {
            zzqm zzqmVar = this.zzag;
            zzauVar = this.zzB;
            zzqmVar.zzb(zzauVar);
        } else {
            zzauVar = zzau.zza;
        }
        zzau zzauVar2 = zzauVar;
        this.zzB = zzauVar2;
        if (zzX()) {
            zzqm zzqmVar2 = this.zzag;
            z = this.zzC;
            zzqmVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzqs(zzauVar2, Math.max(0L, j), zzeo.zzr(zzG(), this.zzs.zze), null));
        zzN();
        zzpz zzpzVar = this.zzq;
        if (zzpzVar != null) {
            ((zzrf) zzpzVar).zza.zzav().zzh(this.zzC);
        }
    }

    private final boolean zzX() {
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc != 0) {
            return false;
        }
        int i = zzqlVar.zza.zzI;
        return true;
    }

    private final boolean zzY() {
        return this.zzu != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public final long zzF() {
        return this.zzs.zzc == 0 ? this.zzD / r0.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
    public final long zzG() {
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc != 0) {
            return this.zzG;
        }
        long j = this.zzF;
        long j2 = zzqlVar.zzd;
        String str = zzeo.zza;
        return ((j + j2) - 1) / j2;
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzab() {
        Context context;
        Looper myLooper = Looper.myLooper();
        boolean z = true;
        if (this.zzw != null && this.zzaa != myLooper) {
            z = false;
        }
        zzghc.zzj(z, "DefaultAudioSink accessed on multiple threads: %s and %s", zzae(this.zzaa), zzae(myLooper));
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzaa = myLooper;
            zzpe zzpeVar = new zzpe(context, new zzpd() { // from class: com.google.android.gms.internal.ads.zzqn
                @Override // com.google.android.gms.internal.ads.zzpd
                public final /* synthetic */ void zza(zzoz zzozVar) {
                    zzrc.this.zzC(zzozVar);
                }
            }, this.zzy, this.zzW);
            this.zzw = zzpeVar;
            this.zzv = zzpeVar.zzd();
        }
        this.zzv.getClass();
    }

    private static boolean zzac(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzad() {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzg(zzG());
        if (zzac(this.zzu)) {
            this.zzR = false;
        }
        this.zzu.stop();
    }

    private static String zzae(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private static final AudioTrack zzaf(zzpw zzpwVar, zzc zzcVar, int i, zzu zzuVar, Context context) throws zzpy {
        zzu zzuVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzcVar.zza()).setAudioFormat(zzeo.zzC(zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzpwVar.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    sessionId.setOffloadedPlayback(zzpwVar.zzd);
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    exc = e;
                    zzuVar2 = zzuVar;
                    throw new zzpy(0, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar2, zzpwVar.zzd, exc);
                }
            }
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzpy(state, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar, zzpwVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            zzuVar2 = zzuVar;
            exc = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzA() {
        zzz();
        zzgjz zzgjzVar = this.zzi;
        int size = zzgjzVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcf) zzgjzVar.get(i)).zzj();
        }
        this.zzg.zzj();
        this.zzh.zzj();
        zzcb zzcbVar = this.zzt;
        if (zzcbVar != null) {
            zzcbVar.zzh();
        }
        this.zzS = false;
        this.zzY = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzB() {
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zze();
        }
    }

    public final void zzC(zzoz zzozVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzaa;
        zzghc.zzj(looper == myLooper, "Current looper (%s) is not the playback looper (%s)", zzae(myLooper), zzae(this.zzaa));
        zzoz zzozVar2 = this.zzv;
        if (zzozVar2 == null || zzozVar.equals(zzozVar2)) {
            return;
        }
        this.zzv = zzozVar;
        zzpz zzpzVar = this.zzq;
        if (zzpzVar != null) {
            ((zzrf) zzpzVar).zza.zzR();
        }
    }

    final /* synthetic */ void zzD() {
        if (this.zzac >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzrf) this.zzq).zza.zzax(true);
            this.zzac = 0L;
        }
    }

    final /* synthetic */ zzpz zzI() {
        return this.zzq;
    }

    final /* synthetic */ AudioTrack zzJ() {
        return this.zzu;
    }

    final /* synthetic */ void zzK(boolean z) {
        this.zzR = true;
    }

    final /* synthetic */ boolean zzL() {
        return this.zzS;
    }

    final /* synthetic */ long zzM() {
        return this.zzX;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zza(zzpz zzpzVar) {
        this.zzq = zzpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzb(zzox zzoxVar) {
        this.zzp = zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzc(zzdb zzdbVar) {
        this.zzj.zzk(zzdbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzd(zzu zzuVar) {
        return zze(zzuVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zze(zzu zzuVar) {
        zzab();
        if (!"audio/raw".equals(zzuVar.zzo)) {
            return this.zzv.zzd(zzuVar, this.zzy) != null ? 2 : 0;
        }
        int i = zzuVar.zzI;
        if (zzeo.zzA(i)) {
            return i != 2 ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
        sb.append("Invalid PCM encoding: ");
        sb.append(i);
        zzds.zzc("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final zzpg zzf(zzu zzuVar) {
        return this.zzY ? zzpg.zza : this.zzah.zza(zzuVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzY() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zzb(), zzeo.zzr(zzG(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || min < ((zzqs) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzA = (zzqs) arrayDeque.remove();
        }
        zzqs zzqsVar = this.zzA;
        long j2 = min - zzqsVar.zzc;
        long zzv = zzeo.zzv(j2, zzqsVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zzd = this.zzag.zzd(j2);
            zzqs zzqsVar2 = this.zzA;
            j = zzqsVar2.zzb + zzd;
            zzqsVar2.zzd = zzd - zzv;
        } else {
            zzqs zzqsVar3 = this.zzA;
            j = zzqsVar3.zzb + zzv + zzqsVar3.zzd;
        }
        long zze = this.zzag.zze();
        long zzr = j + zzeo.zzr(zze, this.zzs.zze);
        long j3 = this.zzab;
        if (zze > j3) {
            long zzr2 = zzeo.zzr(zze - j3, this.zzs.zze);
            this.zzab = zze;
            this.zzac += zzr2;
            if (this.zzad == null) {
                this.zzad = new Handler(Looper.myLooper());
            }
            this.zzad.removeCallbacksAndMessages(null);
            this.zzad.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzrc.this.zzD();
                }
            }, 100L);
        }
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzh(zzu zzuVar, int i, int[] iArr) throws zzpx {
        zzcb zzcbVar;
        int i2;
        int i3;
        int i4;
        int intValue;
        int i5;
        int i6;
        zzab();
        if ("audio/raw".equals(zzuVar.zzo)) {
            int i7 = zzuVar.zzI;
            zzghc.zza(zzeo.zzA(i7));
            int i8 = zzuVar.zzG;
            i4 = zzeo.zzE(i7) * i8;
            zzgjw zzgjwVar = new zzgjw();
            zzgjwVar.zzh(this.zzi);
            zzgjwVar.zzf(this.zzg);
            zzgjwVar.zzg(this.zzag.zza());
            zzcbVar = new zzcb(zzgjwVar.zzi());
            if (zzcbVar.equals(this.zzt)) {
                zzcbVar = this.zzt;
            }
            this.zzf.zzq(zzuVar.zzJ, zzuVar.zzK);
            this.zze.zzq(iArr);
            try {
                zzcc zza2 = zzcbVar.zza(new zzcc(zzuVar.zzH, i8, i7));
                int i9 = zza2.zzd;
                i2 = zza2.zzb;
                int i10 = zza2.zzc;
                int zzB = zzeo.zzB(i10);
                int zzE = zzeo.zzE(i9) * i10;
                i3 = 0;
                intValue = zzB;
                i5 = i9;
                i6 = zzE;
            } catch (zzce e) {
                throw new zzpx(e, zzuVar);
            }
        } else {
            zzcbVar = new zzcb(zzgjz.zzi());
            i2 = zzuVar.zzH;
            zzpg zzpgVar = zzpg.zza;
            Pair zzd = this.zzv.zzd(zzuVar, this.zzy);
            if (zzd == null) {
                String valueOf = String.valueOf(zzuVar);
                String.valueOf(valueOf);
                throw new zzpx("Unable to configure passthrough for: ".concat(String.valueOf(valueOf)), zzuVar);
            }
            int intValue2 = ((Integer) zzd.first).intValue();
            i3 = 2;
            i4 = -1;
            intValue = ((Integer) zzd.second).intValue();
            i5 = intValue2;
            i6 = -1;
        }
        int i11 = i2;
        if (i5 == 0) {
            String valueOf2 = String.valueOf(zzuVar);
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 37 + String.valueOf(valueOf2).length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i3);
            sb.append(") for: ");
            sb.append(valueOf2);
            throw new zzpx(sb.toString(), zzuVar);
        }
        if (intValue == 0) {
            String valueOf3 = String.valueOf(zzuVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 43 + String.valueOf(valueOf3).length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i3);
            sb2.append(") for: ");
            sb2.append(valueOf3);
            throw new zzpx(sb2.toString(), zzuVar);
        }
        int i12 = zzuVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzuVar.zzo) && i12 == -1) {
            i12 = 768000;
        }
        int i13 = i12;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, intValue, i5);
        zzghc.zzh(minBufferSize != -2);
        int i14 = i6 != -1 ? i6 : 1;
        int i15 = i5;
        int zzb2 = zzre.zzb(minBufferSize, i15, i3, i14, i11, i13);
        int i16 = i14;
        this.zzY = false;
        zzql zzqlVar = new zzql(zzuVar, i4, i3, i6, i11, intValue, i15, (((Math.max(minBufferSize, zzb2) + i16) - 1) / i16) * i16, zzcbVar, false, false, false);
        if (zzY()) {
            this.zzr = zzqlVar;
        } else {
            this.zzs = zzqlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzi() {
        this.zzS = true;
        if (zzY()) {
            this.zzj.zzc();
            if (!this.zzQ || zzac(this.zzu)) {
                this.zzu.play();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzj() {
        this.zzI = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0299  */
    @Override // com.google.android.gms.internal.ads.zzqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzpy, zzqb {
        AudioTrack zzO;
        zzox zzoxVar;
        zzql zzqlVar;
        boolean z;
        int zzb2;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        ByteBuffer byteBuffer2 = this.zzM;
        zzghc.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzr != null) {
            if (!zzQ()) {
                return false;
            }
            zzql zzqlVar2 = this.zzr;
            zzql zzqlVar3 = this.zzs;
            if (zzqlVar3.zzc == zzqlVar2.zzc && zzqlVar3.zzg == zzqlVar2.zzg && zzqlVar3.zze == zzqlVar2.zze && zzqlVar3.zzf == zzqlVar2.zzf && zzqlVar3.zzd == zzqlVar2.zzd) {
                boolean z2 = zzqlVar3.zzj;
                boolean z3 = zzqlVar2.zzj;
                boolean z4 = zzqlVar3.zzk;
                boolean z5 = zzqlVar2.zzk;
                this.zzs = zzqlVar2;
                this.zzr = null;
                AudioTrack audioTrack = this.zzu;
                if (audioTrack != null && zzac(audioTrack)) {
                    boolean z6 = this.zzs.zzk;
                }
            } else {
                zzad();
                if (zzn()) {
                    return false;
                }
                zzz();
            }
            zzW(j);
        }
        if (!zzY()) {
            try {
                if (this.zzm.zzb()) {
                    return false;
                }
                try {
                    zzqlVar = this.zzs;
                } catch (zzpy e) {
                    zzql zzqlVar4 = this.zzs;
                    if (zzqlVar4.zzh > 1000000) {
                        zzu zzuVar = zzqlVar4.zza;
                        int i6 = zzqlVar4.zzb;
                        int i7 = zzqlVar4.zzc;
                        int i8 = zzqlVar4.zzd;
                        int i9 = zzqlVar4.zze;
                        int i10 = zzqlVar4.zzf;
                        int i11 = zzqlVar4.zzg;
                        zzcb zzcbVar = zzqlVar4.zzi;
                        boolean z7 = zzqlVar4.zzj;
                        boolean z8 = zzqlVar4.zzk;
                        boolean z9 = zzqlVar4.zzl;
                        zzql zzqlVar5 = new zzql(zzuVar, i6, i7, i8, i9, i10, i11, DurationKt.NANOS_IN_MILLIS, zzcbVar, false, false, false);
                        try {
                            zzO = zzO(zzqlVar5);
                            this.zzs = zzqlVar5;
                        } catch (zzpy e2) {
                            e.addSuppressed(e2);
                            zzT();
                            throw e;
                        }
                    }
                    zzT();
                    throw e;
                }
                if (zzqlVar == null) {
                    throw null;
                }
                zzql zzqlVar6 = zzqlVar;
                zzO = zzO(zzqlVar);
                this.zzu = zzO;
                if (zzac(zzO)) {
                    AudioTrack audioTrack2 = this.zzu;
                    if (this.zzl == null) {
                        this.zzl = new zzrb(this);
                    }
                    this.zzl.zza(audioTrack2);
                    boolean z10 = this.zzs.zzk;
                }
                if (Build.VERSION.SDK_INT >= 31 && (zzoxVar = this.zzp) != null) {
                    AudioTrack audioTrack3 = this.zzu;
                    LogSessionId zza2 = zzoxVar.zza();
                    if (!zza2.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                        audioTrack3.setLogSessionId(zza2);
                    }
                }
                zzqg zzqgVar = this.zzj;
                AudioTrack audioTrack4 = this.zzu;
                zzql zzqlVar7 = this.zzs;
                zzqgVar.zza(audioTrack4, zzqlVar7.zzg, zzqlVar7.zzd, zzqlVar7.zzh, this.zzaf);
                zzU();
                int i12 = this.zzV.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzW;
                if (audioDeviceInfo != null) {
                    this.zzu.setPreferredDevice(audioDeviceInfo);
                    zzpe zzpeVar = this.zzw;
                    if (zzpeVar != null) {
                        zzpeVar.zzc(this.zzW);
                    }
                }
                zzpe zzpeVar2 = this.zzw;
                if (zzpeVar2 != null) {
                    this.zzx = new zzqw(this.zzu, zzpeVar2);
                }
                this.zzJ = true;
                int audioSessionId = this.zzu.getAudioSessionId();
                int i13 = this.zzT;
                this.zzT = audioSessionId;
                zzpz zzpzVar = this.zzq;
                if (zzpzVar != null) {
                    ((zzrf) zzpzVar).zza.zzav().zzk(this.zzs.zza());
                    if (audioSessionId != i13) {
                        this.zzU = true;
                        zzpz zzpzVar2 = this.zzq;
                        int i14 = this.zzT;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzrg zzrgVar = ((zzrf) zzpzVar2).zza;
                            if (zzrgVar.zzaw() != null) {
                                zzrgVar.zzaw().zza(i14);
                            }
                        }
                        ((zzrf) zzpzVar2).zza.zzav().zzm(i14);
                    }
                }
            } catch (zzpy e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzm.zza(e3);
                return false;
            }
        }
        this.zzm.zzc();
        if (this.zzJ) {
            this.zzK = Math.max(0L, j);
            this.zzI = false;
            this.zzJ = false;
            zzW(j);
            if (this.zzS) {
                zzi();
            }
        }
        zzqg zzqgVar2 = this.zzj;
        zzqgVar2.zze(zzG());
        if (this.zzM == null) {
            zzghc.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzql zzqlVar8 = this.zzs;
            if (zzqlVar8.zzc != 0 && this.zzH == 0) {
                int i15 = zzqlVar8.zzg;
                if (i15 != 20) {
                    if (i15 != 30) {
                        switch (i15) {
                            case 5:
                            case 6:
                                zzb2 = zzabv.zze(byteBuffer);
                                z = true;
                                break;
                            case 7:
                            case 8:
                                break;
                            case 9:
                                zzb2 = zzadp.zzb(zzeo.zzK(byteBuffer, byteBuffer.position()));
                                if (zzb2 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                z = true;
                                break;
                            case 10:
                                zzb2 = 1024;
                                z = true;
                                break;
                            case 11:
                            case 12:
                                zzb2 = 2048;
                                z = true;
                                break;
                            default:
                                switch (i15) {
                                    case 14:
                                        int i16 = zzabv.zza;
                                        int position = byteBuffer.position();
                                        int limit = byteBuffer.limit() - 10;
                                        int i17 = position;
                                        while (true) {
                                            if (i17 > limit) {
                                                i5 = -1;
                                            } else if ((zzeo.zzK(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                                i5 = i17 - position;
                                            } else {
                                                i17++;
                                            }
                                        }
                                        if (i5 != -1) {
                                            zzb2 = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                            break;
                                        } else {
                                            zzb2 = 0;
                                            break;
                                        }
                                    case 15:
                                        zzb2 = 512;
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        int i18 = zzaby.zza;
                                        byte[] bArr = new byte[16];
                                        int position2 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(position2);
                                        zzb2 = zzaby.zzb(new zzee(bArr, 16)).zzc;
                                        break;
                                    case 18:
                                        break;
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(i15).length() + 27);
                                        sb.append("Unexpected audio encoding: ");
                                        sb.append(i15);
                                        throw new IllegalStateException(sb.toString());
                                }
                                z = true;
                                break;
                        }
                    }
                    int i19 = zzact.zza;
                    if (byteBuffer.getInt(0) != -233094848) {
                        if (byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                zzb2 = 4096;
                                z = true;
                            } else {
                                int position3 = byteBuffer.position();
                                byte b2 = byteBuffer.get(position3);
                                if (b2 != -2) {
                                    if (b2 == -1) {
                                        i3 = (byteBuffer.get(position3 + 4) & 7) << 4;
                                        b = byteBuffer.get(position3 + 7);
                                    } else if (b2 != 31) {
                                        i3 = (byteBuffer.get(position3 + 4) & 1) << 6;
                                        i4 = byteBuffer.get(position3 + 5) & 252;
                                        i2 = (i4 >> 2) | i3;
                                        z = true;
                                    } else {
                                        i3 = (byteBuffer.get(position3 + 5) & 7) << 4;
                                        b = byteBuffer.get(position3 + 6);
                                    }
                                    i4 = b & 60;
                                    i2 = (i4 >> 2) | i3;
                                    z = true;
                                } else {
                                    z = true;
                                    i2 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
                                }
                                zzb2 = (i2 + 1) * 32;
                            }
                        }
                        zzb2 = 1024;
                        z = true;
                    } else {
                        z = true;
                        zzb2 = 1024;
                    }
                } else {
                    z = true;
                    zzb2 = zzadr.zzb(byteBuffer);
                }
                this.zzH = zzb2;
                if (zzb2 == 0) {
                    return z;
                }
            }
            if (this.zzz != null) {
                if (!zzQ()) {
                    return false;
                }
                zzW(j);
                this.zzz = null;
            }
            long zzr = this.zzK + zzeo.zzr(zzF() - this.zzf.zzs(), this.zzs.zza.zzH);
            if (!this.zzI && Math.abs(zzr - j) > 200000) {
                zzpz zzpzVar3 = this.zzq;
                if (zzpzVar3 != null) {
                    zzpzVar3.zzb(new zzqa(j, zzr));
                }
                this.zzI = true;
            }
            if (this.zzI) {
                if (!zzQ()) {
                    return false;
                }
                long j2 = j - zzr;
                this.zzK += j2;
                this.zzI = false;
                zzW(j);
                zzpz zzpzVar4 = this.zzq;
                if (zzpzVar4 != null && j2 != 0) {
                    ((zzrf) zzpzVar4).zza.zzan();
                }
            }
            if (this.zzs.zzc == 0) {
                this.zzD += byteBuffer.remaining();
            } else {
                this.zzE += this.zzH * i;
            }
            this.zzM = byteBuffer;
            this.zzN = i;
        }
        zzP(j);
        if (!this.zzM.hasRemaining()) {
            this.zzM = null;
            this.zzN = 0;
            return true;
        }
        if (!zzqgVar2.zzf(zzG())) {
            return false;
        }
        zzds.zzc("DefaultAudioSink", "Resetting stalled audio track");
        zzz();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzl() throws zzqb {
        if (!this.zzP && zzY() && zzQ()) {
            zzad();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzm() {
        if (zzY()) {
            return this.zzP && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzn() {
        if (zzY()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.zzu.isOffloadedPlayback() && this.zzR) && this.zzj.zzh(zzG());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzo(zzau zzauVar) {
        float f = zzauVar.zzb;
        String str = zzeo.zza;
        this.zzB = new zzau(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzauVar.zzc, 8.0f)));
        zzV(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final zzau zzp() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzq(boolean z) {
        this.zzC = z;
        zzV(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzr(zzc zzcVar) {
        if (this.zzy.equals(zzcVar)) {
            return;
        }
        this.zzy = zzcVar;
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zzb(zzcVar);
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzs(int i) {
        if (this.zzU) {
            if (this.zzT != i) {
                return;
            } else {
                this.zzU = false;
            }
        }
        if (this.zzT != i) {
            this.zzT = i;
            zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzt(zzd zzdVar) {
        if (this.zzV.equals(zzdVar)) {
            return;
        }
        if (this.zzu != null) {
            int i = this.zzV.zza;
        }
        this.zzV = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzW = audioDeviceInfo;
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zzc(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(this.zzW);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzv() {
        if (!zzY()) {
            return -9223372036854775807L;
        }
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc == 0) {
            return zzeo.zzr(this.zzu.getBufferSizeInFrames(), zzqlVar.zze);
        }
        long bufferSizeInFrames = this.zzu.getBufferSizeInFrames();
        int zzf = zzacy.zzf(this.zzs.zzg);
        zzghc.zzh(zzf != -2147483647);
        return zzeo.zzt(bufferSizeInFrames, 1000000L, zzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzw(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzac(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzx(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzU();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzy() {
        this.zzS = false;
        if (zzY()) {
            this.zzj.zzi();
            if (!this.zzQ || zzac(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzz() {
        if (zzY()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzZ = false;
            this.zzH = 0;
            this.zzA = new zzqs(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzr();
            zzN();
            zzqg zzqgVar = this.zzj;
            if (zzqgVar.zzd()) {
                this.zzu.pause();
            }
            if (zzac(this.zzu)) {
                zzrb zzrbVar = this.zzl;
                zzrbVar.getClass();
                zzrbVar.zzb(this.zzu);
            }
            final zzpw zza2 = this.zzs.zza();
            zzql zzqlVar = this.zzr;
            if (zzqlVar != null) {
                this.zzs = zzqlVar;
                this.zzr = null;
            }
            zzqgVar.zzj();
            zzqw zzqwVar = this.zzx;
            if (zzqwVar != null) {
                zzqwVar.zza();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzpz zzpzVar = this.zzq;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzeo.zzg("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqo
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrc.zzE(audioTrack, zzpzVar, handler, zza2);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.zzu = null;
        }
        this.zzn.zzc();
        this.zzm.zzc();
        this.zzab = 0L;
        this.zzac = 0L;
        Handler handler2 = this.zzad;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* synthetic */ zzrc(zzqk zzqkVar, byte[] bArr) {
        int deviceId;
        byte[] bArr2 = null;
        Context applicationContext = zzqkVar.zzb() == null ? null : zzqkVar.zzb().getApplicationContext();
        this.zzd = applicationContext;
        this.zzy = zzc.zza;
        this.zzv = applicationContext != null ? null : zzqkVar.zzc();
        this.zzag = zzqkVar.zzd();
        zzqi zze = zzqkVar.zze();
        zze.getClass();
        this.zzah = zze;
        this.zzj = new zzqg(new zzqy(this, bArr2));
        zzqh zzqhVar = new zzqh();
        this.zze = zzqhVar;
        zzrk zzrkVar = new zzrk();
        this.zzf = zzrkVar;
        this.zzg = new zzcj();
        this.zzh = new zzrj();
        this.zzi = zzgjz.zzk(zzrkVar, zzqhVar);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzV = new zzd(0, 0.0f);
        zzau zzauVar = zzau.zza;
        this.zzA = new zzqs(zzauVar, 0L, 0L, null);
        this.zzB = zzauVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzqx();
        this.zzn = new zzqx();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzqkVar.zzb() != null && (deviceId = zzqkVar.zzb().getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.zzo = i;
        this.zzaf = true;
    }
}

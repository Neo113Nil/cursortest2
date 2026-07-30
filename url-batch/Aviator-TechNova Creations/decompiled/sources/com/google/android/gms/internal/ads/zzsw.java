package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzsw implements zzrj {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private ByteBuffer zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzsr zzZ;
    private final Context zzb;
    private final zzsl zzc;
    private final zzte zzd;
    private final zzcv zze;
    private final zztd zzf;
    private final zzguf zzg;
    private final ArrayDeque zzh;
    private zzsn zzi;
    private final zzsv zzj;
    private final zzsv zzk;
    private zzpq zzl;
    private zzrg zzm;
    private zzsq zzn;
    private zzsq zzo;
    private zzck zzp;
    private final zzqm zzq;
    private zzqj zzr;
    private zzqc zzs;
    private zzd zzt;
    private zzsu zzu;
    private zzsu zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    static /* synthetic */ boolean zzG() {
        return zza.get() > 0;
    }

    private final void zzP() {
        zzck zzl = this.zzo.zzl();
        this.zzp = zzl;
        zzl.zzb(zzcm.zza);
    }

    private final zzqc zzQ(zzql zzqlVar) throws zzrf {
        try {
            return ((zzsi) this.zzq).zzf(zzqlVar);
        } catch (zzqi e) {
            zzrf zzrfVar = new zzrf(0, zzqlVar.zzb, zzqlVar.zzc, zzqlVar.zza, zzqlVar.zze, this.zzo.zzg(), false, e);
            zzrg zzrgVar = this.zzm;
            if (zzrgVar == null) {
                throw zzrfVar;
            }
            zzrgVar.zza(zzrfVar);
            throw zzrfVar;
        }
    }

    private final void zzR(long j) throws zzri {
        zzU(j);
        if (this.zzJ != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzH;
            if (byteBuffer != null) {
                zzT(byteBuffer);
                zzU(j);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer zze = this.zzp.zze();
                if (zze.hasRemaining()) {
                    zzT(zze);
                    zzU(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzH;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzH);
                    }
                }
            } while (this.zzJ == null);
            return;
        }
    }

    private final boolean zzS() throws zzri {
        if (!this.zzp.zzc()) {
            zzU(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzR(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzJ;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzT(ByteBuffer byteBuffer) {
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
        zzgrc.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zzf()) {
                int zzs = (int) zzfj.zzs(zzfj.zzq(20L), this.zzo.zzk().zzb);
                long zzac = zzac();
                long j = zzs;
                if (zzac < j) {
                    int i11 = this.zzo.zzk().zza;
                    int zzj = this.zzo.zzj();
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i12 = (int) zzac;
                    while (byteBuffer.hasRemaining() && i12 < zzs) {
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
                            int i13 = (int) ((i3 * i12) / j);
                            if (i11 != 2) {
                                order.put((byte) (i13 >> 16));
                                order.put((byte) (i13 >> 24));
                            } else if (i11 == 3) {
                                order.put((byte) (i13 >> 24));
                            } else if (i11 != 4) {
                                if (i11 == 21) {
                                    order.put((byte) (i13 >> 8));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 24));
                                } else if (i11 == 22) {
                                    order.put((byte) i13);
                                    order.put((byte) (i13 >> 8));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 24));
                                } else if (i11 == 268435456) {
                                    order.put((byte) (i13 >> 24));
                                    order.put((byte) (i13 >> 16));
                                } else if (i11 == 1342177280) {
                                    order.put((byte) (i13 >> 24));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 8));
                                } else {
                                    if (i11 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    order.put((byte) (i13 >> 24));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 8));
                                    order.put((byte) i13);
                                }
                            } else if (i13 < 0) {
                                order.putFloat((-i13) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i13 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + zzj) {
                                i12++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        int i132 = (int) ((i3 * i12) / j);
                        if (i11 != 2) {
                        }
                        if (byteBuffer.position() != position + zzj) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.zzJ = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzU(long j) throws zzri {
        zzrg zzrgVar;
        zzrg zzrgVar2;
        if (this.zzJ == null || this.zzk.zzb()) {
            return;
        }
        int remaining = this.zzJ.remaining();
        try {
            boolean zzc = this.zzs.zzc(this.zzJ, this.zzI, j);
            this.zzT = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzrgVar2 = this.zzm) != null && !zzc) {
                }
            }
            if (this.zzo.zzf()) {
                this.zzA += remaining - this.zzJ.remaining();
            }
            if (zzc) {
                if (!this.zzo.zzf()) {
                    zzgrc.zzi(this.zzJ == this.zzH);
                    this.zzB += this.zzC * this.zzI;
                }
                this.zzJ = null;
            }
        } catch (zzqb e) {
            boolean z = e.zzb;
            if (z) {
                if (zzac() <= 0) {
                    if (this.zzs.zzg()) {
                        zzV();
                    }
                }
                zzri zzriVar = new zzri(e.zza, this.zzo.zzg(), r3);
                zzrgVar = this.zzm;
                if (zzrgVar != null) {
                    zzrgVar.zza(zzriVar);
                }
                if (!z) {
                    throw zzriVar;
                }
                this.zzk.zza(zzriVar);
                return;
            }
            r3 = false;
            zzri zzriVar2 = new zzri(e.zza, this.zzo.zzg(), r3);
            zzrgVar = this.zzm;
            if (zzrgVar != null) {
            }
            if (!z) {
            }
        }
    }

    private final void zzV() {
        this.zzo.zzk();
    }

    private final void zzW() {
        if (zzab()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzX() {
        if (this.zzo != null) {
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            try {
                this.zzo = new zzsq(this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzo.zzj(), this.zzq.zzb(zzad(this.zzo.zzh(), -1)), this.zzo.zzl(), null);
            } catch (zzqd e) {
                throw new IllegalStateException(new zzre(e, this.zzo.zzg()));
            }
        }
        zzA();
    }

    private final void zzY(zzav zzavVar) {
        zzsu zzsuVar = new zzsu(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzab()) {
            this.zzu = zzsuVar;
        } else {
            this.zzv = zzsuVar;
        }
    }

    private final void zzZ(long j) {
        zzav zzavVar;
        boolean z;
        if (zzaa()) {
            zzsr zzsrVar = this.zzZ;
            zzavVar = this.zzw;
            zzsrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzaa()) {
            zzsr zzsrVar2 = this.zzZ;
            z = this.zzx;
            zzsrVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzx = z;
        this.zzh.add(new zzsu(zzavVar2, Math.max(0L, j), this.zzo.zzd(zzac()), null));
        zzP();
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzaw().zzh(this.zzx);
        }
    }

    private final boolean zzaa() {
        if (!this.zzo.zzf()) {
            return false;
        }
        int i = this.zzo.zzg().zzI;
        return true;
    }

    private final boolean zzab() {
        return this.zzs != null;
    }

    private final long zzac() {
        if (!this.zzo.zzf()) {
            return this.zzB;
        }
        long j = this.zzA;
        long zzj = this.zzo.zzj();
        String str = zzfj.zza;
        return ((j + zzj) - 1) / zzj;
    }

    private final zzqf zzad(zzv zzvVar, int i) {
        zzqe zzqeVar = new zzqe(zzvVar);
        zzqeVar.zza(this.zzt);
        zzqeVar.zzb(this.zzR);
        zzqeVar.zzc(this.zzO);
        zzqeVar.zze(-1);
        zzqeVar.zzd(this.zzS);
        return new zzqf(zzqeVar, null);
    }

    private final void zzae() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    private static int zzaf(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzA() {
        if (zzab()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzsu(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzP();
            this.zzi = null;
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzB() {
        zzA();
        zzguf zzgufVar = this.zzg;
        int size = zzgufVar.size();
        for (int i = 0; i < size; i++) {
            ((zzco) zzgufVar.get(i)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzC() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzE() {
        if (this.zzX >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzsz) this.zzm).zza.zzay(true);
            this.zzX = 0L;
        }
    }

    final /* synthetic */ void zzF() {
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzR();
        }
    }

    final /* synthetic */ zzsn zzI() {
        return this.zzi;
    }

    final /* synthetic */ zzrg zzJ() {
        return this.zzm;
    }

    final /* synthetic */ zzsq zzK() {
        return this.zzo;
    }

    final /* synthetic */ zzqc zzL() {
        return this.zzs;
    }

    final /* synthetic */ void zzM(boolean z) {
        this.zzM = true;
    }

    final /* synthetic */ boolean zzN() {
        return this.zzN;
    }

    final /* synthetic */ long zzO() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zza(zzrg zzrgVar) {
        this.zzm = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzb(zzpq zzpqVar) {
        this.zzl = zzpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzc(zzdn zzdnVar) {
        this.zzq.zzd(zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final int zze(zzv zzvVar) {
        int i = this.zzq.zza(zzad(zzvVar, -1)).zzd;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzpz zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzpz.zza;
        }
        zzqh zza2 = this.zzq.zza(zzad(zzvVar, -1));
        zzpy zzpyVar = new zzpy();
        zzpyVar.zza(zza2.zza);
        zzpyVar.zzb(zza2.zzb);
        zzpyVar.zzc(zza2.zzc);
        return zzpyVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzab() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzs.zzk(), this.zzo.zzd(zzac()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || min < ((zzsu) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzsu) arrayDeque.remove();
        }
        zzsu zzsuVar = this.zzv;
        long j2 = min - zzsuVar.zzc;
        long zzv = zzfj.zzv(j2, zzsuVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zzd = this.zzZ.zzd(j2);
            zzsu zzsuVar2 = this.zzv;
            j = zzsuVar2.zzb + zzd;
            zzsuVar2.zzd = zzd - zzv;
        } else {
            zzsu zzsuVar3 = this.zzv;
            j = zzsuVar3.zzb + zzv + zzsuVar3.zzd;
        }
        long zze = this.zzZ.zze();
        long zzd2 = j + this.zzo.zzd(zze);
        long j3 = this.zzW;
        if (zze > j3) {
            long zzd3 = this.zzo.zzd(zze - j3);
            this.zzW = zze;
            this.zzX += zzd3;
            if (this.zzY == null) {
                this.zzY = new Handler(Looper.myLooper());
            }
            this.zzY.removeCallbacksAndMessages(null);
            this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzst
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzsw.this.zzE();
                }
            }, 100L);
        }
        return zzd2;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzh(zzv zzvVar, int i, int[] iArr) throws zzre {
        zzck zzckVar;
        zzv zzvVar2;
        int i2;
        int i3;
        if (this.zzr == null && this.zzb != null) {
            zzqj zzqjVar = new zzqj() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // com.google.android.gms.internal.ads.zzqj
                public final /* synthetic */ void zza() {
                    zzsw.this.zzF();
                }
            };
            this.zzr = zzqjVar;
            this.zzq.zzc(zzqjVar);
        }
        if ("audio/raw".equals(zzvVar.zzo)) {
            int i4 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i4));
            int i5 = zzvVar.zzG;
            i2 = zzfj.zzD(i4) * i5;
            zzguc zzgucVar = new zzguc();
            zzgucVar.zzh(this.zzg);
            zzgucVar.zzf(this.zze);
            zzgucVar.zzg(this.zzZ.zza());
            zzckVar = new zzck(zzgucVar.zzi());
            if (zzckVar.equals(this.zzp)) {
                zzckVar = this.zzp;
            }
            this.zzd.zzq(zzvVar.zzJ, zzvVar.zzK);
            this.zzc.zzq(iArr);
            try {
                zzcl zza2 = zzckVar.zza(new zzcl(zzvVar.zzH, i5, i4));
                zzt zza3 = zzvVar.zza();
                int i6 = zza2.zzd;
                zza3.zzG(i6);
                zza3.zzF(zza2.zzb);
                int i7 = zza2.zzc;
                zza3.zzE(i7);
                zzvVar2 = zza3.zzM();
                i3 = zzfj.zzD(i6) * i7;
            } catch (zzcn e) {
                throw new zzre(e, zzvVar);
            }
        } else {
            zzckVar = new zzck(zzguf.zzi());
            zzvVar2 = zzvVar;
            i2 = -1;
            i3 = -1;
        }
        zzck zzckVar2 = zzckVar;
        zzqf zzad = zzad(zzvVar2, -1);
        try {
            zzql zzb = this.zzq.zzb(zzad);
            if (zzb.zza == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzre(sb.toString(), zzad.zza);
            }
            if (zzb.zzc == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzre(sb2.toString(), zzad.zza);
            }
            this.zzU = false;
            zzsq zzsqVar = new zzsq(zzvVar, zzvVar2, i2, i3, zzb, zzckVar2, null);
            if (zzab()) {
                this.zzn = zzsqVar;
            } else {
                this.zzo = zzsqVar;
            }
        } catch (zzqd e2) {
            throw new zzre(e2, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzi() {
        this.zzN = true;
        if (zzab()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzrf, zzri {
        zzqc zzqcVar;
        long j2;
        long j3;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgrc.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzS()) {
                return false;
            }
            if (this.zzn.zzb(this.zzo)) {
                this.zzo = this.zzn;
                this.zzn = null;
                zzqc zzqcVar2 = this.zzs;
                if (zzqcVar2 != null && zzqcVar2.zzg()) {
                    this.zzo.zzk();
                }
            } else {
                zzae();
                if (zzn()) {
                    return false;
                }
                zzA();
            }
            zzZ(j);
        }
        if (!zzab()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqcVar = zzQ(this.zzo.zzk());
                } catch (zzrf e) {
                    if (this.zzo.zzk().zze > 1000000) {
                        zzqk zzqkVar = new zzqk(this.zzo.zzk(), null);
                        zzqkVar.zze(DurationKt.NANOS_IN_MILLIS);
                        zzql zzqlVar = new zzql(zzqkVar, null);
                        try {
                            zzqc zzQ = zzQ(zzqlVar);
                            this.zzo = this.zzo.zza(zzqlVar);
                            zzqcVar = zzQ;
                        } catch (zzrf e2) {
                            e.addSuppressed(e2);
                            zzV();
                            throw e;
                        }
                    }
                    zzV();
                    throw e;
                }
                this.zzs = zzqcVar;
                zzsn zzsnVar = new zzsn(this, this.zzo.zzk(), bArr);
                this.zzi = zzsnVar;
                this.zzs.zzm(zzsnVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzk();
                }
                zzpq zzpqVar = this.zzl;
                if (zzpqVar != null) {
                    this.zzs.zzn(zzpqVar);
                }
                zzW();
                int i2 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int zzh = this.zzs.zzh();
                int i3 = this.zzO;
                this.zzO = zzh;
                zzrg zzrgVar = this.zzm;
                if (zzrgVar != null) {
                    ((zzsz) zzrgVar).zza.zzaw().zzk(this.zzo.zze());
                    if (zzh != i3) {
                        this.zzP = true;
                        zzsq zzsqVar = this.zzo;
                        zzqk zzqkVar2 = new zzqk(zzsqVar.zzk(), null);
                        zzqkVar2.zzg(this.zzO);
                        this.zzo = zzsqVar.zza(new zzql(zzqkVar2, null));
                        zzsq zzsqVar2 = this.zzn;
                        if (zzsqVar2 != null) {
                            zzqk zzqkVar3 = new zzqk(zzsqVar2.zzk(), null);
                            zzqkVar3.zzg(this.zzO);
                            this.zzn = zzsqVar2.zza(new zzql(zzqkVar3, null));
                        }
                        zzrg zzrgVar2 = this.zzm;
                        int i4 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzta zztaVar = ((zzsz) zzrgVar2).zza;
                            if (zztaVar.zzax() != null) {
                                zztaVar.zzax().zza(i4);
                            }
                        }
                        ((zzsz) zzrgVar2).zza.zzaw().zzm(i4);
                    }
                }
            } catch (zzrf e3) {
                this.zzj.zza(e3);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzZ(j);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgrc.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zzf() && this.zzC == 0) {
                int zzD = zzD(this.zzo.zzk().zza, byteBuffer);
                this.zzC = zzD;
                if (zzD == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzS()) {
                    return false;
                }
                zzZ(j);
                this.zzu = null;
            }
            long j4 = this.zzF;
            zzsq zzsqVar3 = this.zzo;
            if (zzsqVar3.zzf()) {
                j2 = 0;
                j3 = this.zzy / this.zzo.zzi();
            } else {
                j2 = 0;
                j3 = this.zzz;
            }
            long zzc = j4 + zzsqVar3.zzc(j3 - this.zzd.zzs());
            if (!this.zzD && Math.abs(zzc - j) > 200000) {
                zzrg zzrgVar3 = this.zzm;
                if (zzrgVar3 != null) {
                    zzrgVar3.zza(new zzrh(j, zzc));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzS()) {
                    return false;
                }
                long j5 = j - zzc;
                this.zzF += j5;
                this.zzD = false;
                zzZ(j);
                zzrg zzrgVar4 = this.zzm;
                if (zzrgVar4 != null && j5 != j2) {
                    ((zzsz) zzrgVar4).zza.zzao();
                }
            }
            if (this.zzo.zzf()) {
                this.zzy += byteBuffer.remaining();
            } else {
                this.zzz += this.zzC * i;
            }
            this.zzH = byteBuffer;
            this.zzI = i;
        }
        zzR(j);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzee.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzA();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzl() throws zzri {
        if (!this.zzK && zzab() && zzS()) {
            zzae();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzm() {
        if (zzab()) {
            return this.zzK && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzn() {
        if (!zzab()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzM) {
            return false;
        }
        long zzac = zzac();
        long zzk = this.zzs.zzk();
        zzqc zzqcVar = this.zzs;
        zzqcVar.getClass();
        return zzac > zzfj.zzs(zzk, zzqcVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzo(zzav zzavVar) {
        float f = zzavVar.zzb;
        String str = zzfj.zza;
        this.zzw = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        zzY(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzq(boolean z) {
        this.zzx = z;
        zzY(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzs(int i) {
        if (this.zzP) {
            if (this.zzO != i) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i) {
            this.zzO = i;
            zzX();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzt(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzv(int i) {
        int i2 = this.zzS;
        int zzaf = zzaf(i);
        if (i2 == zzaf) {
            return;
        }
        this.zzS = zzaf;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzw() {
        if (!zzab()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zzf()) {
            return this.zzo.zzd(this.zzs.zzj());
        }
        long zzj = this.zzs.zzj();
        int zzf = zzaey.zzf(this.zzo.zzk().zza);
        zzgrc.zzi(zzf != -2147483647);
        return zzfj.zzt(zzj, 1000000L, zzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzx(int i, int i2) {
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzy(float f) {
        if (this.zzG != f) {
            this.zzG = f;
            zzW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzz() {
        this.zzN = false;
        if (zzab()) {
            this.zzs.zzb();
        }
    }

    /* synthetic */ zzsw(zzsp zzspVar, byte[] bArr) {
        this.zzb = zzspVar.zzb() == null ? null : zzspVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzZ = zzspVar.zzd();
        this.zzq = zzspVar.zzc();
        zzsl zzslVar = new zzsl();
        this.zzc = zzslVar;
        zzte zzteVar = new zzte();
        this.zzd = zzteVar;
        this.zze = new zzcv();
        this.zzf = new zztd();
        this.zzg = zzguf.zzk(zzteVar, zzslVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzsu(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zzsv();
        this.zzk = new zzsv();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzspVar.zzb() != null) {
            i = zzaf(zzspVar.zzb().getDeviceId());
        }
        this.zzS = i;
    }

    static int zzD(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        if (i == 20) {
            return zzafu.zzb(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int zzb = zzafs.zzb(zzfj.zzJ(byteBuffer, byteBuffer.position()));
                    if (zzb != -1) {
                        return zzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int i6 = zzadv.zza;
                            int position = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i7 = position;
                            while (true) {
                                if (i7 > limit) {
                                    i5 = -1;
                                } else if ((zzfj.zzJ(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                                    i5 = i7 - position;
                                } else {
                                    i7++;
                                }
                            }
                            if (i5 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i8 = zzady.zza;
                            byte[] bArr = new byte[16];
                            int position2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position2);
                            return zzady.zzb(new zzeq(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
            }
            return zzadv.zze(byteBuffer);
        }
        int i9 = zzaet.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
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
            } else {
                i3 = (byteBuffer.get(position3 + 5) & 7) << 4;
                b = byteBuffer.get(position3 + 6);
            }
            i4 = b & 60;
            i2 = (i4 >> 2) | i3;
        } else {
            i2 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
        }
        return (i2 + 1) * 32;
    }
}

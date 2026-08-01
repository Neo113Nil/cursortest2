package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzsd {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzei zzg;
    private boolean zzh;

    public zzsd(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzei zzeiVar = new zzei(zzeg.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzeiVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zza(zzsd zzsdVar, Message message) {
        zzsc zzscVar;
        int i = message.what;
        zzsc zzscVar2 = null;
        if (i == 0) {
            zzscVar = (zzsc) message.obj;
            int i2 = zzscVar.zza;
            int i3 = zzscVar.zzb;
            try {
                zzsdVar.zzc.queueInputBuffer(i2, 0, zzscVar.zzc, zzscVar.zze, zzscVar.zzf);
            } catch (RuntimeException e) {
                zzsa.zza(zzsdVar.zzf, null, e);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzsa.zza(zzsdVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    zzsdVar.zzg.zze();
                }
                if (zzscVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzscVar2);
                    }
                    return;
                }
                return;
            }
            zzscVar = (zzsc) message.obj;
            int i4 = zzscVar.zza;
            int i5 = zzscVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzscVar.zzd;
            long j = zzscVar.zze;
            int i6 = zzscVar.zzf;
            try {
                synchronized (zzb) {
                    zzsdVar.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e2) {
                zzsa.zza(zzsdVar.zzf, null, e2);
            }
        }
        zzscVar2 = zzscVar;
        if (zzscVar2 == null) {
        }
    }

    private static zzsc zzh() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzsc();
            }
            return (zzsc) arrayDeque.removeFirst();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzsc zzh = zzh();
        zzh.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzfs.zza;
        handler.obtainMessage(0, zzh).sendToTarget();
    }

    public final void zze(int i, int i2, zzhy zzhyVar, long j, int i3) {
        zzc();
        zzsc zzh = zzh();
        zzh.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzh.zzd;
        cryptoInfo.numSubSamples = zzhyVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhyVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhyVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzhyVar.zzb, cryptoInfo.key);
        zzi.getClass();
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzhyVar.zza, cryptoInfo.iv);
        zzi2.getClass();
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzhyVar.zzc;
        if (zzfs.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhyVar.zzg, zzhyVar.zzh));
        }
        this.zze.obtainMessage(1, zzh).sendToTarget();
    }

    public final void zzf() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzsb(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}

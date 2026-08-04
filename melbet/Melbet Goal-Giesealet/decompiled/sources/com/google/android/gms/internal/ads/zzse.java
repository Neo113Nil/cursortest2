package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzse implements zzsr {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzde zzg;
    private boolean zzh;

    public zzse(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzde zzdeVar = new zzde(zzdb.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdeVar;
        this.zzf = new AtomicReference();
    }

    private static zzsd zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzsd();
            }
            return (zzsd) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzsc(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        zzsd zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzc(int i, int i2, zzhd zzhdVar, long j, int i3) {
        zzg();
        zzsd zzi = zzi();
        zzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzhdVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhdVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhdVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzk = zzk(zzhdVar.zzb, cryptoInfo.key);
        zzk.getClass();
        cryptoInfo.key = zzk;
        byte[] zzk2 = zzk(zzhdVar.zza, cryptoInfo.iv);
        zzk2.getClass();
        cryptoInfo.iv = zzk2;
        cryptoInfo.mode = zzhdVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhdVar.zzg, zzhdVar.zzh));
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzeo.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                Handler handler2 = handler;
                handler.removeCallbacksAndMessages(null);
                zzde zzdeVar = this.zzg;
                zzdeVar.zzb();
                Handler handler3 = this.zze;
                if (handler3 == null) {
                    throw null;
                }
                Handler handler4 = handler3;
                handler3.obtainMessage(3).sendToTarget();
                zzdeVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzh(Message message) {
        zzsd zzsdVar;
        int i = message.what;
        zzsd zzsdVar2 = null;
        if (i == 1) {
            zzsdVar = (zzsd) message.obj;
            int i2 = zzsdVar.zza;
            int i3 = zzsdVar.zzb;
            try {
                this.zzc.queueInputBuffer(i2, 0, zzsdVar.zzc, zzsdVar.zze, zzsdVar.zzf);
            } catch (RuntimeException e) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e);
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    this.zzg.zza();
                } else if (i != 4) {
                    LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    try {
                        this.zzc.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e2) {
                        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e2);
                    }
                }
                if (zzsdVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzsdVar2);
                    }
                    return;
                }
                return;
            }
            zzsdVar = (zzsd) message.obj;
            int i4 = zzsdVar.zza;
            int i5 = zzsdVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzsdVar.zzd;
            long j = zzsdVar.zze;
            int i6 = zzsdVar.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e3);
            }
        }
        zzsdVar2 = zzsdVar;
        if (zzsdVar2 == null) {
        }
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

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
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
}

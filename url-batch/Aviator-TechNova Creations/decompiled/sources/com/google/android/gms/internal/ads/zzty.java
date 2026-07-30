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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzty implements zzul {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zzty(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zztx();
            }
            return (zztx) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zztw(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        zztx zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzc(int i, int i2, zzie zzieVar, long j, int i3) {
        zzg();
        zztx zzi = zzi();
        zzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzk = zzk(zzieVar.zzb, cryptoInfo.key);
        zzk.getClass();
        cryptoInfo.key = zzk;
        byte[] zzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        zzk2.getClass();
        cryptoInfo.iv = zzk2;
        cryptoInfo.mode = zzieVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                Handler handler2 = handler;
                handler.removeCallbacksAndMessages(null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler3 = this.zze;
                if (handler3 == null) {
                    throw null;
                }
                Handler handler4 = handler3;
                handler3.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzul
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
        zztx zztxVar;
        int i = message.what;
        zztx zztxVar2 = null;
        if (i == 1) {
            zztxVar = (zztx) message.obj;
            int i2 = zztxVar.zza;
            int i3 = zztxVar.zzb;
            try {
                this.zzc.queueInputBuffer(i2, 0, zztxVar.zzc, zztxVar.zze, zztxVar.zzf);
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
                if (zztxVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zztxVar2);
                    }
                    return;
                }
                return;
            }
            zztxVar = (zztx) message.obj;
            int i4 = zztxVar.zza;
            int i5 = zztxVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zztxVar.zzd;
            long j = zztxVar.zze;
            int i6 = zztxVar.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e3);
            }
        }
        zztxVar2 = zztxVar;
        if (zztxVar2 == null) {
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

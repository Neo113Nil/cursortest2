package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzru implements zzsd {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdm zzg;
    private boolean zzh;

    public zzru(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdmVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zza(zzru zzruVar, Message message) {
        zzrt zzrtVar;
        int i = message.what;
        zzrt zzrtVar2 = null;
        if (i == 0) {
            zzrtVar = (zzrt) message.obj;
            int i2 = zzrtVar.zza;
            int i3 = zzrtVar.zzb;
            try {
                zzruVar.zzc.queueInputBuffer(i2, 0, zzrtVar.zzc, zzrtVar.zze, zzrtVar.zzf);
            } catch (RuntimeException e) {
                zzrr.zza(zzruVar.zzf, null, e);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    zzruVar.zzg.zze();
                } else if (i != 3) {
                    zzrr.zza(zzruVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    try {
                        zzruVar.zzc.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e2) {
                        zzrr.zza(zzruVar.zzf, null, e2);
                    }
                }
                if (zzrtVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzrtVar2);
                    }
                    return;
                }
                return;
            }
            zzrtVar = (zzrt) message.obj;
            int i4 = zzrtVar.zza;
            int i5 = zzrtVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzrtVar.zzd;
            long j = zzrtVar.zze;
            int i6 = zzrtVar.zzf;
            try {
                synchronized (zzb) {
                    zzruVar.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                zzrr.zza(zzruVar.zzf, null, e3);
            }
        }
        zzrtVar2 = zzrtVar;
        if (zzrtVar2 == null) {
        }
    }

    private static zzrt zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrt();
            }
            return (zzrt) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzrt zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzet.zza;
        handler.obtainMessage(0, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zze(int i, int i2, zzha zzhaVar, long j, int i3) {
        zzc();
        zzrt zzi = zzi();
        zzi.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzhaVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhaVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhaVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzhaVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzhaVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzhaVar.zzc;
        if (zzet.zza >= 24) {
            DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m$1();
            cryptoInfo.setPattern(zzn$$ExternalSyntheticApiModelOutline0.m(zzhaVar.zzg, zzhaVar.zzh));
        }
        this.zze.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i = zzet.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzrs(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
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

    private static int[] zzk(int[] iArr, int[] iArr2) {
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

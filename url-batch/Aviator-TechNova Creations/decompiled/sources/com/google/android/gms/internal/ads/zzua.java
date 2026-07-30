package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzua extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzuj zzo;
    private final Object zza = new Object();
    private final CircularIntArray zzd = new CircularIntArray();
    private final CircularIntArray zze = new CircularIntArray();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    zzua(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzl(MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.addLast(i);
            zzuj zzujVar = this.zzo;
            if (zzujVar != null) {
                zzuu zzuuVar = ((zzus) zzujVar).zza;
                if (zzuuVar.zzbf() != null) {
                    zzuuVar.zzbf().zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzl(mediaFormat);
                this.zzi = null;
            }
            this.zze.addLast(i);
            this.zzf.add(bufferInfo);
            zzuj zzujVar = this.zzo;
            if (zzujVar != null) {
                zzuu zzuuVar = ((zzus) zzujVar).zza;
                if (zzuuVar.zzbf() != null) {
                    zzuuVar.zzbf().zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgrc.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            zzm();
            int i = -1;
            if (zzk()) {
                return -1;
            }
            CircularIntArray circularIntArray = this.zzd;
            if (!circularIntArray.isEmpty()) {
                i = circularIntArray.popFirst();
            }
            return i;
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzm();
            if (zzk()) {
                return -1;
            }
            CircularIntArray circularIntArray = this.zze;
            if (circularIntArray.isEmpty()) {
                return -1;
            }
            int popFirst = circularIntArray.popFirst();
            if (popFirst >= 0) {
                if (this.zzh == null) {
                    throw null;
                }
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (popFirst == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                popFirst = -2;
            }
            return popFirst;
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfj.zza;
            Handler handler2 = handler;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzua.this.zzi();
                }
            });
        }
    }

    public final void zzh(zzuj zzujVar) {
        synchronized (this.zza) {
            this.zzo = zzujVar;
        }
    }

    final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            if (this.zzm) {
                return;
            }
            long j = this.zzl - 1;
            this.zzl = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                zzj();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (obj) {
                this.zzn = illegalStateException;
            }
        }
    }
}

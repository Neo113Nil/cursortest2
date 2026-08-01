package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzsf extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private long zzk;
    private boolean zzl;
    private IllegalStateException zzm;
    private final Object zza = new Object();
    private final CircularIntArray zzd = new CircularIntArray();
    private final CircularIntArray zze = new CircularIntArray();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    zzsf(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzsf zzsfVar) {
        synchronized (zzsfVar.zza) {
            if (zzsfVar.zzl) {
                return;
            }
            long j = zzsfVar.zzk - 1;
            zzsfVar.zzk = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                zzsfVar.zzi();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (zzsfVar.zza) {
                zzsfVar.zzm = illegalStateException;
            }
        }
    }

    private final void zzh(MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        IllegalStateException illegalStateException = this.zzm;
        if (illegalStateException == null) {
            return;
        }
        this.zzm = null;
        throw illegalStateException;
    }

    private final void zzk() {
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException == null) {
            return;
        }
        this.zzj = null;
        throw codecException;
    }

    private final boolean zzl() {
        return this.zzk > 0 || this.zzl;
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
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzh(mediaFormat);
                this.zzi = null;
            }
            this.zze.addLast(i);
            this.zzf.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            zzj();
            zzk();
            int i = -1;
            if (zzl()) {
                return -1;
            }
            if (!this.zzd.isEmpty()) {
                i = this.zzd.popFirst();
            }
            return i;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzj();
            zzk();
            if (zzl()) {
                return -1;
            }
            if (this.zze.isEmpty()) {
                return -1;
            }
            int popFirst = this.zze.popFirst();
            if (popFirst >= 0) {
                zzef.zzb(this.zzh);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (popFirst == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                popFirst = -2;
            }
            return popFirst;
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzk++;
            Handler handler = this.zzc;
            int i = zzfs.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzse
                @Override // java.lang.Runnable
                public final void run() {
                    zzsf.zzd(zzsf.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzef.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl = true;
            this.zzb.quit();
            zzi();
        }
    }
}

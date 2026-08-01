package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzrz implements zzsk {
    private final MediaCodec zza;
    private final zzsf zzb;
    private final zzsd zzc;
    private boolean zzd;
    private int zze = 0;

    /* synthetic */ zzrz(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, zzry zzryVar) {
        this.zza = mediaCodec;
        this.zzb = new zzsf(handlerThread);
        this.zzc = new zzsd(mediaCodec, handlerThread2);
    }

    static /* synthetic */ void zzh(zzrz zzrzVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzrzVar.zzb.zzf(zzrzVar.zza);
        int i2 = zzfs.zza;
        Trace.beginSection("configureCodec");
        zzrzVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzrzVar.zzc.zzg();
        Trace.beginSection("startCodec");
        zzrzVar.zza.start();
        Trace.endSection();
        zzrzVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzr(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzk(int i, int i2, zzhy zzhyVar, long j, int i3) {
        this.zzc.zze(i, 0, zzhyVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzf();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
                return;
            }
            this.zza.release();
            this.zzd = true;
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzm(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzn(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }
}

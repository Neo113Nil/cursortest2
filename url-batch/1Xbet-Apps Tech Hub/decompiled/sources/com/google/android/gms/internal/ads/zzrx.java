package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzrx implements zzsj {
    private final zzfuo zzb;
    private final zzfuo zzc;

    public zzrx(int i, boolean z) {
        zzrv zzrvVar = new zzrv(i);
        zzrw zzrwVar = new zzrw(i);
        this.zzb = zzrvVar;
        this.zzc = zzrwVar;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        String zzr;
        zzr = zzrz.zzr(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzr);
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        String zzr;
        zzr = zzrz.zzr(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzr);
    }

    public final zzrz zzc(zzsi zzsiVar) throws IOException {
        MediaCodec mediaCodec;
        zzrz zzrzVar;
        String str = zzsiVar.zza.zza;
        zzrz zzrzVar2 = null;
        try {
            int i = zzfs.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzrzVar = new zzrz(mediaCodec, zza(((zzrv) this.zzb).zza), zzb(((zzrw) this.zzc).zza), false, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            zzrz.zzh(zzrzVar, zzsiVar.zzb, zzsiVar.zzd, null, 0);
            return zzrzVar;
        } catch (Exception e3) {
            e = e3;
            zzrzVar2 = zzrzVar;
            if (zzrzVar2 != null) {
                zzrzVar2.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}

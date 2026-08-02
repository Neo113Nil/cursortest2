package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzro implements zzsa {
    private final zzfvk zza;
    private final zzfvk zzb;
    private boolean zzc;

    public zzro(int i) {
        zzrm zzrmVar = new zzrm(i);
        zzrn zzrnVar = new zzrn(i);
        this.zza = zzrmVar;
        this.zzb = zzrnVar;
        this.zzc = true;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        String zzs;
        zzs = zzrq.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        String zzs;
        zzs = zzrq.zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzrp] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.zzrq] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final zzrq zzc(zzrz zzrzVar) throws IOException {
        MediaCodec mediaCodec;
        zzsd zzruVar;
        int i;
        zzrq zzrqVar;
        String str = zzrzVar.zza.zza;
        ?? r2 = 0;
        r2 = 0;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            if (this.zzc) {
                zzaf zzafVar = zzrzVar.zzc;
                if (zzet.zza >= 34 && (zzet.zza >= 35 || zzbn.zzi(zzafVar.zzm))) {
                    zzruVar = new zztf(mediaCodec);
                    i = 4;
                    zzrqVar = new zzrq(mediaCodec, zza(((zzrm) this.zza).zza), zzruVar, r2);
                    Trace.endSection();
                    zzrq.zzh(zzrqVar, zzrzVar.zzb, zzrzVar.zzd, null, i);
                    return zzrqVar;
                }
            }
            Trace.endSection();
            zzrq.zzh(zzrqVar, zzrzVar.zzb, zzrzVar.zzd, null, i);
            return zzrqVar;
        } catch (Exception e3) {
            e = e3;
            r2 = zzrqVar;
            if (r2 != 0) {
                r2.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
        zzruVar = new zzru(mediaCodec, zzb(((zzrn) this.zzb).zza));
        i = 0;
        zzrqVar = new zzrq(mediaCodec, zza(((zzrm) this.zza).zza), zzruVar, r2);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    public final /* bridge */ /* synthetic */ zzsc zzd(zzrz zzrzVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzc = true;
    }
}

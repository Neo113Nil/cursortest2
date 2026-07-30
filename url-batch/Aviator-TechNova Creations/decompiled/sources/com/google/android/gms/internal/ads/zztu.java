package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zztu implements zzui {
    private final zzgru zza;
    private final zzgru zzb;

    public zztu(final int i) {
        zzgru zzgruVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zztt
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                String zzw;
                zzw = zztv.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:");
                return new HandlerThread(zzw);
            }
        };
        zzgru zzgruVar2 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                String zzw;
                zzw = zztv.zzw(i, "ExoPlayer:MediaCodecQueueingThread:");
                return new HandlerThread(zzw);
            }
        };
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
    }

    public final zztv zza(zzuh zzuhVar) throws IOException {
        Exception exc;
        MediaCodec mediaCodec;
        zztv zztvVar;
        zzun zzunVar = zzuhVar.zza;
        String str = zzunVar.zza;
        zztv zztvVar2 = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zztvVar = new zztv(mediaCodec, (HandlerThread) this.zza.zza(), new zzty(mediaCodec, (HandlerThread) this.zzb.zza()), zzuhVar.zzf, null);
            } catch (Exception e) {
                exc = e;
            }
            try {
                Trace.endSection();
                Surface surface = zzuhVar.zzd;
                int i = 0;
                if (surface == null && zzunVar.zzh && Build.VERSION.SDK_INT >= 35) {
                    i = 8;
                }
                zztvVar.zzt(zzuhVar.zzb, surface, null, i);
                return zztvVar;
            } catch (Exception e2) {
                exc = e2;
                zztvVar2 = zztvVar;
                if (zztvVar2 != null) {
                    zztvVar2.zzl();
                    throw exc;
                }
                if (mediaCodec == null) {
                    throw exc;
                }
                mediaCodec.release();
                throw exc;
            }
        } catch (Exception e3) {
            exc = e3;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final /* bridge */ /* synthetic */ zzuk zzb(zzuh zzuhVar) throws IOException {
        throw null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzuc implements zzui {
    private final Context zza;

    @Deprecated
    public zzuc() {
        this.zza = null;
    }

    public zzuc(Context context, zzgru zzgruVar, zzgru zzgruVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzuk zzb(zzuh zzuhVar) throws IOException {
        Context context;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzf = zzas.zzf(zzuhVar.zzc.zzo);
            zzee.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfj.zzP(zzf)));
            return new zztu(zzf).zza(zzuhVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzun zzunVar = zzuhVar.zza;
            String str = zzunVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzuhVar.zzd;
                int i = 0;
                if (surface == null && zzunVar.zzh && Build.VERSION.SDK_INT >= 35) {
                    i = 8;
                }
                createByCodecName.configure(zzuhVar.zzb, surface, (MediaCrypto) null, i);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zzvh(createByCodecName, zzuhVar.zzf, null);
            } catch (IOException | RuntimeException e) {
                e = e;
                mediaCodec = createByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }
}

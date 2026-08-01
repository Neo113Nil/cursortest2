package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzsl extends zzhz {
    public final zzsn zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsl(Throwable th, zzsn zzsnVar) {
        super("Decoder failed: ".concat(String.valueOf(zzsnVar == null ? null : zzsnVar.zza)), th);
        String str = null;
        this.zza = zzsnVar;
        if (zzfs.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}

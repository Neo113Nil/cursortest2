package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public class zzse extends zzhb {
    public final String zza;
    public final int zzb;

    public zzse(Throwable th, zzsf zzsfVar) {
        super("Decoder failed: ".concat(String.valueOf(zzsfVar == null ? null : zzsfVar.zza)), th);
        int i = zzet.zza;
        boolean z = th instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.zza = diagnosticInfo;
        this.zzb = zzet.zza >= 23 ? z ? ((MediaCodec.CodecException) th).getErrorCode() : 0 : zzet.zzk(diagnosticInfo);
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzss extends zzhe {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzss(Throwable th, zzst zzstVar) {
        super("Decoder failed: ".concat(String.valueOf(r3)), th);
        int i;
        String str = zzstVar == null ? null : zzstVar.zza;
        String.valueOf(str);
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            i = codecException.getErrorCode();
        } else {
            i = 0;
        }
        this.zza = i;
    }
}

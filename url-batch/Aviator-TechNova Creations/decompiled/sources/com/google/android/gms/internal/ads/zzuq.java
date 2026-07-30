package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzuq extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzun zzc;
    public final String zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzuq(zzv zzvVar, Throwable th, boolean z, int i) {
        this(r4, th, r6, false, null, r15.toString(), null);
        String obj = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + obj.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(obj);
        String sb2 = sb.toString();
        String str = zzvVar.zzo;
        int abs = Math.abs(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(abs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(abs);
    }

    final /* synthetic */ zzuq zza(zzuq zzuqVar) {
        return new zzuq(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzuqVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzuq(zzv zzvVar, Throwable th, boolean z, zzun zzunVar) {
        this(r6.toString(), th, zzvVar.zzo, false, zzunVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        String str = zzunVar.zza;
        int length = str.length();
        String obj = zzvVar.toString();
        StringBuilder sb = new StringBuilder(length + 23 + obj.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(obj);
    }

    private zzuq(String str, Throwable th, String str2, boolean z, zzun zzunVar, String str3, zzuq zzuqVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzunVar;
        this.zzd = str3;
    }
}

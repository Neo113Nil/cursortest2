package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzsq extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzsn zzc;
    public final String zzd;
    public final zzsq zze;

    public zzsq(zzam zzamVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzamVar.toString(), th, zzamVar.zzm, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ zzsq zza(zzsq zzsqVar, zzsq zzsqVar2) {
        return new zzsq(zzsqVar.getMessage(), zzsqVar.getCause(), zzsqVar.zza, false, zzsqVar.zzc, zzsqVar.zzd, zzsqVar2);
    }

    public zzsq(zzam zzamVar, Throwable th, boolean z, zzsn zzsnVar) {
        this("Decoder init failed: " + zzsnVar.zza + ", " + zzamVar.toString(), th, zzamVar.zzm, false, zzsnVar, (zzfs.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzsq(String str, Throwable th, String str2, boolean z, zzsn zzsnVar, String str3, zzsq zzsqVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsnVar;
        this.zzd = str3;
        this.zze = zzsqVar;
    }
}

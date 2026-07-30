package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzche extends zzatf {
    static final zzche zzb = new zzche();

    zzche() {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzatj zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzatl() : "mvhd".equals(str) ? new zzatm() : new zzatn(str);
    }
}

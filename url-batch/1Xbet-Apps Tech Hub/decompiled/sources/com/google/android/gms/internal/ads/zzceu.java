package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzceu extends zzaoi {
    static final zzceu zzb = new zzceu();

    zzceu() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoi
    public final zzaom zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzaoo() : "mvhd".equals(str) ? new zzaop() : new zzaoq(str);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzapi extends zzaeg {
    public zzapi(zzfg zzfgVar, long j, long j2) {
        super(new zzaeb(), new zzaph(zzfgVar, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    static /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzatz implements zzaty {
    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i) {
        return zzaukVar.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i, int i2) {
        byte[] bArr;
        int length;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzaukVar.zza).length) || i > i2 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzauk(zzauk.zzh(bArr, i, i2 - i));
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzaty zzc() {
        return new zzatz();
    }
}

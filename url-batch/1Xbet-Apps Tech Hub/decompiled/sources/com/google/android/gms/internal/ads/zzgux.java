package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgux extends zzgva {
    private final int zzc;
    private final int zzd;

    zzgux(byte[] bArr, int i, int i2) {
        super(bArr);
        zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgva, com.google.android.gms.internal.ads.zzgve
    public final byte zza(int i) {
        zzy(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgva, com.google.android.gms.internal.ads.zzgve
    final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgva
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgva, com.google.android.gms.internal.ads.zzgve
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgva, com.google.android.gms.internal.ads.zzgve
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzhgv extends zzhgz {
    private final int zzc;
    private final int zzd;

    zzhgv(byte[] bArr, int i, int i2) {
        super(bArr);
        zzA(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final byte zza(int i) {
        zzz(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz
    protected final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}

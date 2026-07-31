package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzaja extends zzajh {
    private final int zzc;
    private final int zzd;

    zzaja(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzaiw.zza(i4, i4 + i5, bArr.length);
        this.zzc = i4;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final byte zza(int i4) {
        int zzb = zzb();
        if (((zzb - (i4 + 1)) | i4) >= 0) {
            return this.zzb[this.zzc + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    final byte zzb(int i4) {
        return this.zzb[this.zzc + i4];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh
    protected final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    protected final void zza(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i6);
    }
}

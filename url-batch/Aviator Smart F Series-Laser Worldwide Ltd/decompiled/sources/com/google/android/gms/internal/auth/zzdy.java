package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzdy extends zzeb {
    private final int zzc;

    zzdy(byte[] bArr, int i8, int i9) {
        super(bArr);
        zzee.zzi(0, i9, bArr.length);
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i8) {
        int i9 = this.zzc;
        if (((i9 - (i8 + 1)) | i8) >= 0) {
            return this.zza[i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    final byte zzb(int i8) {
        return this.zza[i8];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}

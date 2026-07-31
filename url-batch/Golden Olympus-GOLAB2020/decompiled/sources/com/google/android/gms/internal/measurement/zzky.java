package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzky extends zzlb {
    private final int zzc;

    zzky(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzld.zzh(0, i5, bArr.length);
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final byte zza(int i4) {
        int i5 = this.zzc;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return ((zzlb) this).zza[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    final byte zzb(int i4) {
        return ((zzlb) this).zza[i4];
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final int zzd() {
        return this.zzc;
    }
}

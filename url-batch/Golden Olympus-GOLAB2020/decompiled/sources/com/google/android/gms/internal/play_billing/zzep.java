package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzep extends zzes {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzep(byte[] bArr, int i4, int i5) {
        super(null);
        zzev.zzj(i4, i4 + i5, bArr.length);
        this.zzb = bArr;
        this.zzc = i4;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zza(int i4) {
        int i5 = this.zzd;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.zzb[this.zzc + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    final byte zzb(int i4) {
        return this.zzb[this.zzc + i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    protected final int zzd(int i4, int i5, int i6) {
        return zzga.zzb(i4, this.zzb, this.zzc, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final zzev zzf(int i4, int i5) {
        int zzj = zzev.zzj(i4, i5, this.zzd);
        return zzj == 0 ? zzev.zza : new zzep(this.zzb, this.zzc + i4, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    final void zzg(zzem zzemVar) {
        ((zzez) zzemVar).zzc(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    protected final boolean zzh(zzev zzevVar) {
        boolean z4 = zzevVar instanceof zzet;
        if (!z4 && !(zzevVar instanceof zzep)) {
            return zzevVar.zzh(this);
        }
        int i4 = this.zzd;
        if (i4 > zzevVar.zze()) {
            throw new IllegalArgumentException("Length too large: " + i4 + i4);
        }
        if (i4 > zzevVar.zze()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i4 + ", " + zzevVar.zze());
        }
        if (z4) {
            return zzev.zzl(this.zzb, this.zzc, ((zzet) zzevVar).zzb, 0, i4);
        }
        if (zzevVar instanceof zzep) {
            zzep zzepVar = (zzep) zzevVar;
            return zzev.zzl(this.zzb, this.zzc, zzepVar.zzb, zzepVar.zzc, i4);
        }
        zzev zzf = zzevVar.zzf(0, i4);
        int i5 = this.zzc;
        return zzf.equals(zzf(i5, i4 + i5));
    }
}

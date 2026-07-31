package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
class zzlb extends zzla {
    protected final byte[] zza;

    zzlb(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzld) || zzd() != ((zzld) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlb)) {
            return obj.equals(this);
        }
        zzlb zzlbVar = (zzlb) obj;
        int zzi = zzi();
        int zzi2 = zzlbVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlbVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzlbVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzlbVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlbVar.zza;
        zzlbVar.zzc();
        int i4 = 0;
        int i5 = 0;
        while (i4 < zzd) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public byte zza(int i4) {
        return this.zza[i4];
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    byte zzb(int i4) {
        return this.zza[i4];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    protected final int zze(int i4, int i5, int i6) {
        return zzmk.zzb(i4, this.zza, 0, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final zzld zzf(int i4, int i5) {
        int zzh = zzld.zzh(0, i5, zzd());
        return zzh == 0 ? zzld.zzb : new zzky(this.zza, 0, zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    final void zzg(zzkv zzkvVar) {
        ((zzlh) zzkvVar).zzc(this.zza, 0, zzd());
    }
}

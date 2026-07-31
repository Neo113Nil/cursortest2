package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
class zzajh extends zzaje {
    protected final byte[] zzb;

    zzajh(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaiw) || zzb() != ((zzaiw) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajh)) {
            return obj.equals(this);
        }
        zzajh zzajhVar = (zzajh) obj;
        int zza = zza();
        int zza2 = zzajhVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzajhVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public byte zza(int i4) {
        return this.zzb[i4];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    byte zzb(int i4) {
        return this.zzb[i4];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final zzaji zzc() {
        return zzaji.zza(this.zzb, zze(), zzb(), true);
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final zzaiw zza(int i4, int i5) {
        int zza = zzaiw.zza(0, i5, zzb());
        return zza == 0 ? zzaiw.zza : new zzaja(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    protected final int zzb(int i4, int i5, int i6) {
        return zzaki.zza(i4, this.zzb, zze(), i6);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    protected void zza(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zzb, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    final void zza(zzaix zzaixVar) {
        zzaixVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    final boolean zza(zzaiw zzaiwVar, int i4, int i5) {
        if (i5 <= zzaiwVar.zzb()) {
            if (i5 <= zzaiwVar.zzb()) {
                if (zzaiwVar instanceof zzajh) {
                    zzajh zzajhVar = (zzajh) zzaiwVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzajhVar.zzb;
                    int zze = zze() + i5;
                    int zze2 = zze();
                    int zze3 = zzajhVar.zze();
                    while (zze2 < zze) {
                        if (bArr[zze2] != bArr2[zze3]) {
                            return false;
                        }
                        zze2++;
                        zze3++;
                    }
                    return true;
                }
                return zzaiwVar.zza(0, i5).equals(zza(0, i5));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i5 + ", " + zzaiwVar.zzb());
        }
        throw new IllegalArgumentException("Length too large: " + i5 + zzb());
    }
}

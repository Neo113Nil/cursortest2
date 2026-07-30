package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class zzeb extends zzea {
    protected final byte[] zza;

    zzeb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeb)) {
            return obj.equals(this);
        }
        zzeb zzebVar = (zzeb) obj;
        int zzj = zzj();
        int zzj2 = zzebVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzebVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzebVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzebVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzebVar.zza;
        zzebVar.zzc();
        int i8 = 0;
        int i9 = 0;
        while (i8 < zzd) {
            if (bArr[i8] != bArr2[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zza(int i8) {
        return this.zza[i8];
    }

    @Override // com.google.android.gms.internal.auth.zzee
    byte zzb(int i8) {
        return this.zza[i8];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    protected final int zze(int i8, int i9, int i10) {
        return zzez.zzd(i8, this.zza, 0, i10);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final zzee zzf(int i8, int i9) {
        int zzi = zzee.zzi(0, i9, zzd());
        return zzi == 0 ? zzee.zzb : new zzdy(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean zzh() {
        return zzhm.zzd(this.zza, 0, zzd());
    }
}

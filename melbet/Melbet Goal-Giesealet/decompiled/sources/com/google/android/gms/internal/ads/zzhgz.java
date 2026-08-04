package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
class zzhgz extends zzhgy {
    protected final byte[] zza;

    zzhgz(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhhb) || zzc() != ((zzhhb) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzhgz)) {
            return obj.equals(this);
        }
        zzhgz zzhgzVar = (zzhgz) obj;
        int zzy = zzy();
        int zzy2 = zzhgzVar.zzy();
        if (zzy == 0 || zzy2 == 0 || zzy == zzy2) {
            return zzh(zzhgzVar, 0, zzc());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    final boolean zzh(zzhhb zzhhbVar, int i, int i2) {
        if (i2 > zzhhbVar.zzc()) {
            int zzc = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(zzc).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzhhbVar.zzc()) {
            int zzc2 = zzhhbVar.zzc();
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(zzc2).length());
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzhhbVar instanceof zzhgz)) {
            return zzhhbVar.zzi(i, i3).equals(zzi(0, i2));
        }
        zzhgz zzhgzVar = (zzhgz) zzhhbVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzhgzVar.zza;
        int zzd = zzd() + i2;
        int zzd2 = zzd();
        int zzd3 = zzhgzVar.zzd() + i;
        while (zzd2 < zzd) {
            if (bArr[zzd2] != bArr2[zzd3]) {
                return false;
            }
            zzd2++;
            zzd3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhb zzi(int i, int i2) {
        int zzA = zzA(i, i2, zzc());
        return zzA == 0 ? zzhhb.zzb : new zzhgv(this.zza, zzd() + i, zzA);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    final void zzk(zzhgs zzhgsVar) throws IOException {
        zzhgsVar.zza(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean zzm() {
        int zzd = zzd();
        return zzhlh.zza(this.zza, zzd, zzc() + zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzn(int i, int i2, int i3) {
        int zzd = zzd() + i2;
        return zzhlh.zzb(i, this.zza, zzd, i3 + zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    protected final int zzo(int i, int i2, int i3) {
        return zzhiu.zzc(i, this.zza, zzd() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhg zzp() {
        return zzhhg.zzG(this.zza, zzd(), zzc(), true);
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
class zzgwk extends zzgwj {
    protected final byte[] zza;

    zzgwk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwm) || zzd() != ((zzgwm) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgwk)) {
            return obj.equals(this);
        }
        zzgwk zzgwkVar = (zzgwk) obj;
        int zzr = zzr();
        int zzr2 = zzgwkVar.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgwkVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    final boolean zzg(zzgwm zzgwmVar, int i, int i2) {
        if (i2 > zzgwmVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgwmVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgwmVar.zzd());
        }
        if (!(zzgwmVar instanceof zzgwk)) {
            return zzgwmVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgwk zzgwkVar = (zzgwk) zzgwmVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgwkVar.zza;
        int zzc = zzc() + i2;
        int zzc2 = zzc();
        int zzc3 = zzgwkVar.zzc() + i;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final int zzi(int i, int i2, int i3) {
        return zzgyl.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzhbe.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgwm zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        return zzq == 0 ? zzgwm.zzb : new zzgwg(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgww zzl() {
        return zzgww.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    final void zzo(zzgwd zzgwdVar) throws IOException {
        zzgwdVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean zzp() {
        int zzc = zzc();
        return zzhbe.zzi(this.zza, zzc, zzd() + zzc);
    }
}

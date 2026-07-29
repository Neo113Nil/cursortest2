package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbg extends zzbfc<zzbg> {
    public Integer zzfe;
    private Integer zzff;
    public byte[][] zzgv = zzbfl.zzece;
    public byte[] zzgq = null;

    public zzbg() {
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzbg zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                int zzb = zzbfl.zzb(zzbezVar, 10);
                int length = this.zzgv == null ? 0 : this.zzgv.length;
                byte[][] bArr = new byte[zzb + length][];
                if (length != 0) {
                    System.arraycopy(this.zzgv, 0, bArr, 0, length);
                }
                while (length < bArr.length - 1) {
                    bArr[length] = zzbezVar.readBytes();
                    zzbezVar.zzabk();
                    length++;
                }
                bArr[length] = zzbezVar.readBytes();
                this.zzgv = bArr;
            } else if (zzabk == 18) {
                this.zzgq = zzbezVar.readBytes();
            } else if (zzabk == 24) {
                zzbezVar.getPosition();
                this.zzff = Integer.valueOf(zzaz.zze(zzbezVar.zzacc()));
            } else if (zzabk == 32) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzfe = Integer.valueOf(zzaz.zzf(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzgv != null && this.zzgv.length > 0) {
            for (int i = 0; i < this.zzgv.length; i++) {
                byte[] bArr = this.zzgv[i];
                if (bArr != null) {
                    zzbfaVar.zza(1, bArr);
                }
            }
        }
        if (this.zzgq != null) {
            zzbfaVar.zza(2, this.zzgq);
        }
        if (this.zzff != null) {
            zzbfaVar.zzm(3, this.zzff.intValue());
        }
        if (this.zzfe != null) {
            zzbfaVar.zzm(4, this.zzfe.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzgv != null && this.zzgv.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzgv.length; i3++) {
                byte[] bArr = this.zzgv[i3];
                if (bArr != null) {
                    i2++;
                    i += zzbfa.zzv(bArr);
                }
            }
            zzr = zzr + i + (i2 * 1);
        }
        if (this.zzgq != null) {
            zzr += zzbfa.zzb(2, this.zzgq);
        }
        if (this.zzff != null) {
            zzr += zzbfa.zzq(3, this.zzff.intValue());
        }
        return this.zzfe != null ? zzr + zzbfa.zzq(4, this.zzfe.intValue()) : zzr;
    }
}

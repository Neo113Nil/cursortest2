package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzik extends zzbfc<zzik> {
    private Integer zzanu = null;
    private int[] zzans = zzbfl.zzeby;

    public zzik() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final zzik zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 16) {
                int zzb = zzbfl.zzb(zzbezVar, 16);
                int length = this.zzans == null ? 0 : this.zzans.length;
                int[] iArr = new int[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzans, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = zzbezVar.zzacc();
                    zzbezVar.zzabk();
                    length++;
                }
                iArr[length] = zzbezVar.zzacc();
                this.zzans = iArr;
            } else if (zzabk == 18) {
                int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                int position2 = zzbezVar.getPosition();
                int i = 0;
                while (zzbezVar.zzagn() > 0) {
                    zzbezVar.zzacc();
                    i++;
                }
                zzbezVar.zzdc(position2);
                int length2 = this.zzans == null ? 0 : this.zzans.length;
                int[] iArr2 = new int[i + length2];
                if (length2 != 0) {
                    System.arraycopy(this.zzans, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = zzbezVar.zzacc();
                    length2++;
                }
                this.zzans = iArr2;
                zzbezVar.zzbs(zzbr);
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzanu != null) {
            zzbfaVar.zzm(1, this.zzanu.intValue());
        }
        if (this.zzans != null && this.zzans.length > 0) {
            for (int i = 0; i < this.zzans.length; i++) {
                zzbfaVar.zzm(2, this.zzans[i]);
            }
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzanu != null) {
            zzr += zzbfa.zzq(1, this.zzanu.intValue());
        }
        if (this.zzans == null || this.zzans.length <= 0) {
            return zzr;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzans.length; i2++) {
            i += zzbfa.zzce(this.zzans[i2]);
        }
        return zzr + i + (this.zzans.length * 1);
    }
}

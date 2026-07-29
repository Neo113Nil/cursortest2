package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbd extends zzbfc<zzbd> {
    private Long zzgl = null;
    private Integer zzgm = null;
    private Boolean zzgn = null;
    private int[] zzgo = zzbfl.zzeby;
    private Long zzgp = null;

    public zzbd() {
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                this.zzgl = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 16) {
                this.zzgm = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 24) {
                this.zzgn = Boolean.valueOf(zzbezVar.zzabq());
            } else if (zzabk == 32) {
                int zzb = zzbfl.zzb(zzbezVar, 32);
                int length = this.zzgo == null ? 0 : this.zzgo.length;
                int[] iArr = new int[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzgo, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = zzbezVar.zzacc();
                    zzbezVar.zzabk();
                    length++;
                }
                iArr[length] = zzbezVar.zzacc();
                this.zzgo = iArr;
            } else if (zzabk == 34) {
                int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                int position = zzbezVar.getPosition();
                int i = 0;
                while (zzbezVar.zzagn() > 0) {
                    zzbezVar.zzacc();
                    i++;
                }
                zzbezVar.zzdc(position);
                int length2 = this.zzgo == null ? 0 : this.zzgo.length;
                int[] iArr2 = new int[i + length2];
                if (length2 != 0) {
                    System.arraycopy(this.zzgo, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = zzbezVar.zzacc();
                    length2++;
                }
                this.zzgo = iArr2;
                zzbezVar.zzbs(zzbr);
            } else if (zzabk == 40) {
                this.zzgp = Long.valueOf(zzbezVar.zzacd());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzgl != null) {
            zzbfaVar.zzi(1, this.zzgl.longValue());
        }
        if (this.zzgm != null) {
            zzbfaVar.zzm(2, this.zzgm.intValue());
        }
        if (this.zzgn != null) {
            zzbfaVar.zzf(3, this.zzgn.booleanValue());
        }
        if (this.zzgo != null && this.zzgo.length > 0) {
            for (int i = 0; i < this.zzgo.length; i++) {
                zzbfaVar.zzm(4, this.zzgo[i]);
            }
        }
        if (this.zzgp != null) {
            zzbfaVar.zza(5, this.zzgp.longValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzgl != null) {
            zzr += zzbfa.zzd(1, this.zzgl.longValue());
        }
        if (this.zzgm != null) {
            zzr += zzbfa.zzq(2, this.zzgm.intValue());
        }
        if (this.zzgn != null) {
            this.zzgn.booleanValue();
            zzr += zzbfa.zzcd(3) + 1;
        }
        if (this.zzgo != null && this.zzgo.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzgo.length; i2++) {
                i += zzbfa.zzce(this.zzgo[i2]);
            }
            zzr = zzr + i + (this.zzgo.length * 1);
        }
        return this.zzgp != null ? zzr + zzbfa.zze(5, this.zzgp.longValue()) : zzr;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzie extends zzbfc<zzie> {
    private String zzamj = null;
    private zzic[] zzamk = zzic.zzhr();
    private Integer zzaml = null;
    private Integer zzamm = null;
    private Integer zzamn = null;

    public zzie() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzie zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzamj = zzbezVar.readString();
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                int length = this.zzamk == null ? 0 : this.zzamk.length;
                zzic[] zzicVarArr = new zzic[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzamk, 0, zzicVarArr, 0, length);
                }
                while (length < zzicVarArr.length - 1) {
                    zzicVarArr[length] = new zzic();
                    zzbezVar.zza(zzicVarArr[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzicVarArr[length] = new zzic();
                zzbezVar.zza(zzicVarArr[length]);
                this.zzamk = zzicVarArr;
            } else if (zzabk == 24) {
                zzbezVar.getPosition();
                this.zzaml = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
            } else if (zzabk == 32) {
                zzbezVar.getPosition();
                this.zzamm = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
            } else if (zzabk == 40) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzamn = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
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
        if (this.zzamj != null) {
            zzbfaVar.zzf(1, this.zzamj);
        }
        if (this.zzamk != null && this.zzamk.length > 0) {
            for (int i = 0; i < this.zzamk.length; i++) {
                zzic zzicVar = this.zzamk[i];
                if (zzicVar != null) {
                    zzbfaVar.zza(2, zzicVar);
                }
            }
        }
        if (this.zzaml != null) {
            zzbfaVar.zzm(3, this.zzaml.intValue());
        }
        if (this.zzamm != null) {
            zzbfaVar.zzm(4, this.zzamm.intValue());
        }
        if (this.zzamn != null) {
            zzbfaVar.zzm(5, this.zzamn.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzamj != null) {
            zzr += zzbfa.zzg(1, this.zzamj);
        }
        if (this.zzamk != null && this.zzamk.length > 0) {
            for (int i = 0; i < this.zzamk.length; i++) {
                zzic zzicVar = this.zzamk[i];
                if (zzicVar != null) {
                    zzr += zzbfa.zzb(2, zzicVar);
                }
            }
        }
        if (this.zzaml != null) {
            zzr += zzbfa.zzq(3, this.zzaml.intValue());
        }
        if (this.zzamm != null) {
            zzr += zzbfa.zzq(4, this.zzamm.intValue());
        }
        return this.zzamn != null ? zzr + zzbfa.zzq(5, this.zzamn.intValue()) : zzr;
    }
}

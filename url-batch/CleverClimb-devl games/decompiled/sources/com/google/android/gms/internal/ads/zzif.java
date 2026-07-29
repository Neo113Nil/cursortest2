package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzif extends zzbfc<zzif> {
    private Integer zzamo = null;
    private zzis zzamp = null;
    private zzis zzamq = null;
    private zzis zzamr = null;
    private zzis[] zzams = zzis.zzht();
    private Integer zzamt = null;

    public zzif() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk != 8) {
                if (zzabk == 18) {
                    if (this.zzamp == null) {
                        this.zzamp = new zzis();
                    }
                    zzbfiVar = this.zzamp;
                } else if (zzabk == 26) {
                    if (this.zzamq == null) {
                        this.zzamq = new zzis();
                    }
                    zzbfiVar = this.zzamq;
                } else if (zzabk == 34) {
                    if (this.zzamr == null) {
                        this.zzamr = new zzis();
                    }
                    zzbfiVar = this.zzamr;
                } else if (zzabk == 42) {
                    int zzb = zzbfl.zzb(zzbezVar, 42);
                    int length = this.zzams == null ? 0 : this.zzams.length;
                    zzis[] zzisVarArr = new zzis[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzams, 0, zzisVarArr, 0, length);
                    }
                    while (length < zzisVarArr.length - 1) {
                        zzisVarArr[length] = new zzis();
                        zzbezVar.zza(zzisVarArr[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzisVarArr[length] = new zzis();
                    zzbezVar.zza(zzisVarArr[length]);
                    this.zzams = zzisVarArr;
                } else if (zzabk == 48) {
                    this.zzamt = Integer.valueOf(zzbezVar.zzacc());
                } else if (!super.zza(zzbezVar, zzabk)) {
                    return this;
                }
                zzbezVar.zza(zzbfiVar);
            } else {
                this.zzamo = Integer.valueOf(zzbezVar.zzacc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzamo != null) {
            zzbfaVar.zzm(1, this.zzamo.intValue());
        }
        if (this.zzamp != null) {
            zzbfaVar.zza(2, this.zzamp);
        }
        if (this.zzamq != null) {
            zzbfaVar.zza(3, this.zzamq);
        }
        if (this.zzamr != null) {
            zzbfaVar.zza(4, this.zzamr);
        }
        if (this.zzams != null && this.zzams.length > 0) {
            for (int i = 0; i < this.zzams.length; i++) {
                zzis zzisVar = this.zzams[i];
                if (zzisVar != null) {
                    zzbfaVar.zza(5, zzisVar);
                }
            }
        }
        if (this.zzamt != null) {
            zzbfaVar.zzm(6, this.zzamt.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzamo != null) {
            zzr += zzbfa.zzq(1, this.zzamo.intValue());
        }
        if (this.zzamp != null) {
            zzr += zzbfa.zzb(2, this.zzamp);
        }
        if (this.zzamq != null) {
            zzr += zzbfa.zzb(3, this.zzamq);
        }
        if (this.zzamr != null) {
            zzr += zzbfa.zzb(4, this.zzamr);
        }
        if (this.zzams != null && this.zzams.length > 0) {
            for (int i = 0; i < this.zzams.length; i++) {
                zzis zzisVar = this.zzams[i];
                if (zzisVar != null) {
                    zzr += zzbfa.zzb(5, zzisVar);
                }
            }
        }
        return this.zzamt != null ? zzr + zzbfa.zzq(6, this.zzamt.intValue()) : zzr;
    }
}

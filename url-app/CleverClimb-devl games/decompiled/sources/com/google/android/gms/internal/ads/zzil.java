package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzil extends zzbfc<zzil> {
    private zzij zzanv = null;
    private zzir[] zzanw = zzir.zzhs();
    private Integer zzanu = null;
    private zzis zzant = null;

    public zzil() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzil zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                if (this.zzanv == null) {
                    this.zzanv = new zzij();
                }
                zzbfiVar = this.zzanv;
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                int length = this.zzanw == null ? 0 : this.zzanw.length;
                zzir[] zzirVarArr = new zzir[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzanw, 0, zzirVarArr, 0, length);
                }
                while (length < zzirVarArr.length - 1) {
                    zzirVarArr[length] = new zzir();
                    zzbezVar.zza(zzirVarArr[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzirVarArr[length] = new zzir();
                zzbezVar.zza(zzirVarArr[length]);
                this.zzanw = zzirVarArr;
            } else if (zzabk == 24) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 34) {
                if (this.zzant == null) {
                    this.zzant = new zzis();
                }
                zzbfiVar = this.zzant;
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
            zzbezVar.zza(zzbfiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzanv != null) {
            zzbfaVar.zza(1, this.zzanv);
        }
        if (this.zzanw != null && this.zzanw.length > 0) {
            for (int i = 0; i < this.zzanw.length; i++) {
                zzir zzirVar = this.zzanw[i];
                if (zzirVar != null) {
                    zzbfaVar.zza(2, zzirVar);
                }
            }
        }
        if (this.zzanu != null) {
            zzbfaVar.zzm(3, this.zzanu.intValue());
        }
        if (this.zzant != null) {
            zzbfaVar.zza(4, this.zzant);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzanv != null) {
            zzr += zzbfa.zzb(1, this.zzanv);
        }
        if (this.zzanw != null && this.zzanw.length > 0) {
            for (int i = 0; i < this.zzanw.length; i++) {
                zzir zzirVar = this.zzanw[i];
                if (zzirVar != null) {
                    zzr += zzbfa.zzb(2, zzirVar);
                }
            }
        }
        if (this.zzanu != null) {
            zzr += zzbfa.zzq(3, this.zzanu.intValue());
        }
        return this.zzant != null ? zzr + zzbfa.zzb(4, this.zzant) : zzr;
    }
}

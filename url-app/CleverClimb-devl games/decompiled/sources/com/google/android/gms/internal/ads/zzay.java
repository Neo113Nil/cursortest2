package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzay extends zzbfc<zzay> {
    public String zzcx;
    private String zzcy;
    private String zzcz;
    private String zzda;
    private String zzdb;

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzcx = zzbezVar.readString();
            } else if (zzabk == 18) {
                this.zzcy = zzbezVar.readString();
            } else if (zzabk == 26) {
                this.zzcz = zzbezVar.readString();
            } else if (zzabk == 34) {
                this.zzda = zzbezVar.readString();
            } else if (zzabk == 42) {
                this.zzdb = zzbezVar.readString();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzcx != null) {
            zzbfaVar.zzf(1, this.zzcx);
        }
        if (this.zzcy != null) {
            zzbfaVar.zzf(2, this.zzcy);
        }
        if (this.zzcz != null) {
            zzbfaVar.zzf(3, this.zzcz);
        }
        if (this.zzda != null) {
            zzbfaVar.zzf(4, this.zzda);
        }
        if (this.zzdb != null) {
            zzbfaVar.zzf(5, this.zzdb);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzcx != null) {
            zzr += zzbfa.zzg(1, this.zzcx);
        }
        if (this.zzcy != null) {
            zzr += zzbfa.zzg(2, this.zzcy);
        }
        if (this.zzcz != null) {
            zzr += zzbfa.zzg(3, this.zzcz);
        }
        if (this.zzda != null) {
            zzr += zzbfa.zzg(4, this.zzda);
        }
        return this.zzdb != null ? zzr + zzbfa.zzg(5, this.zzdb) : zzr;
    }
}

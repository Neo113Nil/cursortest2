package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbfv extends zzbfc<zzbfv> {
    public String zzedv = null;
    public Long zzedw = null;
    public Boolean zzedx = null;

    public zzbfv() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzedv = zzbezVar.readString();
            } else if (zzabk == 16) {
                this.zzedw = Long.valueOf(zzbezVar.zzabm());
            } else if (zzabk == 24) {
                this.zzedx = Boolean.valueOf(zzbezVar.zzabq());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzedv != null) {
            zzbfaVar.zzf(1, this.zzedv);
        }
        if (this.zzedw != null) {
            zzbfaVar.zzi(2, this.zzedw.longValue());
        }
        if (this.zzedx != null) {
            zzbfaVar.zzf(3, this.zzedx.booleanValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzedv != null) {
            zzr += zzbfa.zzg(1, this.zzedv);
        }
        if (this.zzedw != null) {
            zzr += zzbfa.zzd(2, this.zzedw.longValue());
        }
        if (this.zzedx == null) {
            return zzr;
        }
        this.zzedx.booleanValue();
        return zzr + zzbfa.zzcd(3) + 1;
    }
}

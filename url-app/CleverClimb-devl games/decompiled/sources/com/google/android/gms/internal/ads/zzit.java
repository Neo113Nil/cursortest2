package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzit extends zzbfc<zzit> {
    public Integer zzaot = null;
    public Integer zzaou = null;
    public Integer zzaov = null;

    public zzit() {
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
            if (zzabk == 8) {
                this.zzaot = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 16) {
                this.zzaou = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 24) {
                this.zzaov = Integer.valueOf(zzbezVar.zzacc());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzaot != null) {
            zzbfaVar.zzm(1, this.zzaot.intValue());
        }
        if (this.zzaou != null) {
            zzbfaVar.zzm(2, this.zzaou.intValue());
        }
        if (this.zzaov != null) {
            zzbfaVar.zzm(3, this.zzaov.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzaot != null) {
            zzr += zzbfa.zzq(1, this.zzaot.intValue());
        }
        if (this.zzaou != null) {
            zzr += zzbfa.zzq(2, this.zzaou.intValue());
        }
        return this.zzaov != null ? zzr + zzbfa.zzq(3, this.zzaov.intValue()) : zzr;
    }
}

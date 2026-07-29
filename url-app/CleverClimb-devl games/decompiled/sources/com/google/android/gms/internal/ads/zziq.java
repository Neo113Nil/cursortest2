package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zziq extends zzbfc<zziq> {
    private Integer zzaon = null;
    private Integer zzaoo = null;

    public zziq() {
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
                this.zzaon = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 16) {
                this.zzaoo = Integer.valueOf(zzbezVar.zzacc());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzaon != null) {
            zzbfaVar.zzm(1, this.zzaon.intValue());
        }
        if (this.zzaoo != null) {
            zzbfaVar.zzm(2, this.zzaoo.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzaon != null) {
            zzr += zzbfa.zzq(1, this.zzaon.intValue());
        }
        return this.zzaoo != null ? zzr + zzbfa.zzq(2, this.zzaoo.intValue()) : zzr;
    }
}

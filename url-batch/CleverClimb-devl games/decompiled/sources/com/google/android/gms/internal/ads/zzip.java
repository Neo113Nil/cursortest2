package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzip extends zzbfc<zzip> {
    private Integer zzaol = null;
    private Integer zzaom = null;

    public zzip() {
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
                this.zzaol = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 16) {
                this.zzaom = Integer.valueOf(zzbezVar.zzacc());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzaol != null) {
            zzbfaVar.zzm(1, this.zzaol.intValue());
        }
        if (this.zzaom != null) {
            zzbfaVar.zzm(2, this.zzaom.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzaol != null) {
            zzr += zzbfa.zzq(1, this.zzaol.intValue());
        }
        return this.zzaom != null ? zzr + zzbfa.zzq(2, this.zzaom.intValue()) : zzr;
    }
}

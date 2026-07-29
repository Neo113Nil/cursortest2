package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zziv extends zzbfc<zziv> {
    private Integer zzanu = null;
    private zziw zzapn = null;
    private zzis zzapo = null;

    public zziv() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public final zziv zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk != 8) {
                if (zzabk == 18) {
                    if (this.zzapn == null) {
                        this.zzapn = new zziw();
                    }
                    zzbfiVar = this.zzapn;
                } else if (zzabk == 26) {
                    if (this.zzapo == null) {
                        this.zzapo = new zzis();
                    }
                    zzbfiVar = this.zzapo;
                } else if (!super.zza(zzbezVar, zzabk)) {
                    return this;
                }
                zzbezVar.zza(zzbfiVar);
            } else {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzanu != null) {
            zzbfaVar.zzm(1, this.zzanu.intValue());
        }
        if (this.zzapn != null) {
            zzbfaVar.zza(2, this.zzapn);
        }
        if (this.zzapo != null) {
            zzbfaVar.zza(3, this.zzapo);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzanu != null) {
            zzr += zzbfa.zzq(1, this.zzanu.intValue());
        }
        if (this.zzapn != null) {
            zzr += zzbfa.zzb(2, this.zzapn);
        }
        return this.zzapo != null ? zzr + zzbfa.zzb(3, this.zzapo) : zzr;
    }
}

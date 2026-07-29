package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzin extends zzbfc<zzin> {
    private Integer zzany = null;
    private zzis zzanz = null;

    public zzin() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzin zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzany = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 18) {
                if (this.zzanz == null) {
                    this.zzanz = new zzis();
                }
                zzbezVar.zza(this.zzanz);
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzany != null) {
            zzbfaVar.zzm(1, this.zzany.intValue());
        }
        if (this.zzanz != null) {
            zzbfaVar.zza(2, this.zzanz);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzany != null) {
            zzr += zzbfa.zzq(1, this.zzany.intValue());
        }
        return this.zzanz != null ? zzr + zzbfa.zzb(2, this.zzanz) : zzr;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzja extends zzbfc<zzja> {
    private Integer zzanu = null;
    private zziw zzapn = null;
    private Integer zzape = null;
    private Integer zzapf = null;
    private Integer zzapr = null;
    private Long zzaps = null;

    public zzja() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final zzja zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 18) {
                if (this.zzapn == null) {
                    this.zzapn = new zziw();
                }
                zzbezVar.zza(this.zzapn);
            } else if (zzabk == 24) {
                this.zzape = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 32) {
                this.zzapf = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 40) {
                this.zzapr = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 48) {
                this.zzaps = Long.valueOf(zzbezVar.zzacd());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
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
        if (this.zzape != null) {
            zzbfaVar.zzm(3, this.zzape.intValue());
        }
        if (this.zzapf != null) {
            zzbfaVar.zzm(4, this.zzapf.intValue());
        }
        if (this.zzapr != null) {
            zzbfaVar.zzm(5, this.zzapr.intValue());
        }
        if (this.zzaps != null) {
            zzbfaVar.zza(6, this.zzaps.longValue());
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
        if (this.zzape != null) {
            zzr += zzbfa.zzq(3, this.zzape.intValue());
        }
        if (this.zzapf != null) {
            zzr += zzbfa.zzq(4, this.zzapf.intValue());
        }
        if (this.zzapr != null) {
            zzr += zzbfa.zzq(5, this.zzapr.intValue());
        }
        return this.zzaps != null ? zzr + zzbfa.zze(6, this.zzaps.longValue()) : zzr;
    }
}

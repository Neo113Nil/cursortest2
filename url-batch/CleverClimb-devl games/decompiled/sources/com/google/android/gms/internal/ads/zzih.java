package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzih extends zzbfc<zzih> {
    private Integer zzanc = null;
    private zzit zzand = null;
    private String zzane = null;
    private String zzanf = null;

    public zzih() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzih zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 40) {
                int position = zzbezVar.getPosition();
                try {
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc < 0 || zzacc > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum Platform");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.zzanc = Integer.valueOf(zzacc);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 50) {
                if (this.zzand == null) {
                    this.zzand = new zzit();
                }
                zzbezVar.zza(this.zzand);
            } else if (zzabk == 58) {
                this.zzane = zzbezVar.readString();
            } else if (zzabk == 66) {
                this.zzanf = zzbezVar.readString();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzanc != null) {
            zzbfaVar.zzm(5, this.zzanc.intValue());
        }
        if (this.zzand != null) {
            zzbfaVar.zza(6, this.zzand);
        }
        if (this.zzane != null) {
            zzbfaVar.zzf(7, this.zzane);
        }
        if (this.zzanf != null) {
            zzbfaVar.zzf(8, this.zzanf);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzanc != null) {
            zzr += zzbfa.zzq(5, this.zzanc.intValue());
        }
        if (this.zzand != null) {
            zzr += zzbfa.zzb(6, this.zzand);
        }
        if (this.zzane != null) {
            zzr += zzbfa.zzg(7, this.zzane);
        }
        return this.zzanf != null ? zzr + zzbfa.zzg(8, this.zzanf) : zzr;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzis extends zzbfc<zzis> {
    private static volatile zzis[] zzaoq;
    private Integer zzaor = null;
    private Integer zzaos = null;

    public zzis() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    public static zzis[] zzht() {
        if (zzaoq == null) {
            synchronized (zzbfg.zzebs) {
                if (zzaoq == null) {
                    zzaoq = new zzis[0];
                }
            }
        }
        return zzaoq;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                this.zzaor = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 16) {
                this.zzaos = Integer.valueOf(zzbezVar.zzacc());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzaor != null) {
            zzbfaVar.zzm(1, this.zzaor.intValue());
        }
        if (this.zzaos != null) {
            zzbfaVar.zzm(2, this.zzaos.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzaor != null) {
            zzr += zzbfa.zzq(1, this.zzaor.intValue());
        }
        return this.zzaos != null ? zzr + zzbfa.zzq(2, this.zzaos.intValue()) : zzr;
    }
}

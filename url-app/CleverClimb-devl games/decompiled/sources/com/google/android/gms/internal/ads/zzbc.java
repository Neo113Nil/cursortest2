package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbc extends zzbfc<zzbc> {
    private Long zzeq = null;
    private Long zzer = null;
    public Long zzgi = null;
    public Long zzgj = null;
    public Long zzgk = null;

    public zzbc() {
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
                this.zzeq = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 16) {
                this.zzer = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 24) {
                this.zzgi = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 32) {
                this.zzgj = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 40) {
                this.zzgk = Long.valueOf(zzbezVar.zzacd());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzeq != null) {
            zzbfaVar.zzi(1, this.zzeq.longValue());
        }
        if (this.zzer != null) {
            zzbfaVar.zzi(2, this.zzer.longValue());
        }
        if (this.zzgi != null) {
            zzbfaVar.zzi(3, this.zzgi.longValue());
        }
        if (this.zzgj != null) {
            zzbfaVar.zzi(4, this.zzgj.longValue());
        }
        if (this.zzgk != null) {
            zzbfaVar.zzi(5, this.zzgk.longValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzeq != null) {
            zzr += zzbfa.zzd(1, this.zzeq.longValue());
        }
        if (this.zzer != null) {
            zzr += zzbfa.zzd(2, this.zzer.longValue());
        }
        if (this.zzgi != null) {
            zzr += zzbfa.zzd(3, this.zzgi.longValue());
        }
        if (this.zzgj != null) {
            zzr += zzbfa.zzd(4, this.zzgj.longValue());
        }
        return this.zzgk != null ? zzr + zzbfa.zzd(5, this.zzgk.longValue()) : zzr;
    }
}

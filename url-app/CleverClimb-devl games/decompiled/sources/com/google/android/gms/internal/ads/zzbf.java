package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbf extends zzbfc<zzbf> {
    public Long zzgl = null;
    private String zzgt = null;
    private byte[] zzgu = null;

    public zzbf() {
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
                this.zzgl = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 26) {
                this.zzgt = zzbezVar.readString();
            } else if (zzabk == 34) {
                this.zzgu = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzgl != null) {
            zzbfaVar.zzi(1, this.zzgl.longValue());
        }
        if (this.zzgt != null) {
            zzbfaVar.zzf(3, this.zzgt);
        }
        if (this.zzgu != null) {
            zzbfaVar.zza(4, this.zzgu);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzgl != null) {
            zzr += zzbfa.zzd(1, this.zzgl.longValue());
        }
        if (this.zzgt != null) {
            zzr += zzbfa.zzg(3, this.zzgt);
        }
        return this.zzgu != null ? zzr + zzbfa.zzb(4, this.zzgu) : zzr;
    }
}

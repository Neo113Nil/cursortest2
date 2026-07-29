package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbfs extends zzbfc<zzbfs> {
    private Integer zzedj = null;
    private byte[] zzedk = null;
    private byte[] zzedg = null;

    public zzbfs() {
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
                this.zzedj = Integer.valueOf(zzbezVar.zzabn());
            } else if (zzabk == 18) {
                this.zzedk = zzbezVar.readBytes();
            } else if (zzabk == 26) {
                this.zzedg = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzedj != null) {
            zzbfaVar.zzm(1, this.zzedj.intValue());
        }
        if (this.zzedk != null) {
            zzbfaVar.zza(2, this.zzedk);
        }
        if (this.zzedg != null) {
            zzbfaVar.zza(3, this.zzedg);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzedj != null) {
            zzr += zzbfa.zzq(1, this.zzedj.intValue());
        }
        if (this.zzedk != null) {
            zzr += zzbfa.zzb(2, this.zzedk);
        }
        return this.zzedg != null ? zzr + zzbfa.zzb(3, this.zzedg) : zzr;
    }
}

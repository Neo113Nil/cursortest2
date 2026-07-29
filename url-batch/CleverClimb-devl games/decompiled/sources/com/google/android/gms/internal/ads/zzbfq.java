package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbfq extends zzbfc<zzbfq> {
    private byte[] zzede = null;
    private byte[] zzedf = null;
    private byte[] zzedg = null;

    public zzbfq() {
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
            if (zzabk == 10) {
                this.zzede = zzbezVar.readBytes();
            } else if (zzabk == 18) {
                this.zzedf = zzbezVar.readBytes();
            } else if (zzabk == 26) {
                this.zzedg = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzede != null) {
            zzbfaVar.zza(1, this.zzede);
        }
        if (this.zzedf != null) {
            zzbfaVar.zza(2, this.zzedf);
        }
        if (this.zzedg != null) {
            zzbfaVar.zza(3, this.zzedg);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzede != null) {
            zzr += zzbfa.zzb(1, this.zzede);
        }
        if (this.zzedf != null) {
            zzr += zzbfa.zzb(2, this.zzedf);
        }
        return this.zzedg != null ? zzr + zzbfa.zzb(3, this.zzedg) : zzr;
    }
}

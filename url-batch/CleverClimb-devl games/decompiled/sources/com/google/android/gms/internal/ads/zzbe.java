package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbe extends zzbfc<zzbe> {
    public byte[] data = null;
    public byte[] zzgq = null;
    public byte[] zzgr = null;
    public byte[] zzgs = null;

    public zzbe() {
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
                this.data = zzbezVar.readBytes();
            } else if (zzabk == 18) {
                this.zzgq = zzbezVar.readBytes();
            } else if (zzabk == 26) {
                this.zzgr = zzbezVar.readBytes();
            } else if (zzabk == 34) {
                this.zzgs = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.data != null) {
            zzbfaVar.zza(1, this.data);
        }
        if (this.zzgq != null) {
            zzbfaVar.zza(2, this.zzgq);
        }
        if (this.zzgr != null) {
            zzbfaVar.zza(3, this.zzgr);
        }
        if (this.zzgs != null) {
            zzbfaVar.zza(4, this.zzgs);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.data != null) {
            zzr += zzbfa.zzb(1, this.data);
        }
        if (this.zzgq != null) {
            zzr += zzbfa.zzb(2, this.zzgq);
        }
        if (this.zzgr != null) {
            zzr += zzbfa.zzb(3, this.zzgr);
        }
        return this.zzgs != null ? zzr + zzbfa.zzb(4, this.zzgs) : zzr;
    }
}

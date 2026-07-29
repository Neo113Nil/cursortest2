package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbft extends zzbfc<zzbft> {
    public Integer zzamf = null;
    public String mimeType = null;
    public byte[] zzedl = null;

    public zzbft() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
    public final zzbft zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    int zzabn = zzbezVar.zzabn();
                    if (zzabn < 0 || zzabn > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(zzabn);
                        sb.append(" is not a valid enum Type");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.zzamf = Integer.valueOf(zzabn);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 18) {
                this.mimeType = zzbezVar.readString();
            } else if (zzabk == 26) {
                this.zzedl = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzamf != null) {
            zzbfaVar.zzm(1, this.zzamf.intValue());
        }
        if (this.mimeType != null) {
            zzbfaVar.zzf(2, this.mimeType);
        }
        if (this.zzedl != null) {
            zzbfaVar.zza(3, this.zzedl);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzamf != null) {
            zzr += zzbfa.zzq(1, this.zzamf.intValue());
        }
        if (this.mimeType != null) {
            zzr += zzbfa.zzg(2, this.mimeType);
        }
        return this.zzedl != null ? zzr + zzbfa.zzb(3, this.zzedl) : zzr;
    }
}

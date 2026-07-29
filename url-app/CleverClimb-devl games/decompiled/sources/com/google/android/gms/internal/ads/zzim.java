package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzim extends zzbfc<zzim> {
    private Integer zzamf = null;
    private Integer zzanx = null;

    public zzim() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        r5 = new java.lang.StringBuilder(43);
        r5.append(r3);
        r5.append(" is not a valid enum NetworkType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzim zza(zzbez zzbezVar) throws IOException {
        int zzacc;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                zzbezVar.getPosition();
                int zzacc2 = zzbezVar.zzacc();
                if (zzacc2 < 0 || zzacc2 > 2) {
                    break;
                }
                this.zzamf = Integer.valueOf(zzacc2);
            } else if (zzabk == 16) {
                try {
                    zzacc = zzbezVar.zzacc();
                    if ((zzacc < 0 || zzacc > 2) && (zzacc < 4 || zzacc > 4)) {
                        break;
                    }
                    this.zzanx = Integer.valueOf(zzacc);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(zzbezVar.getPosition());
                    zza(zzbezVar, zzabk);
                }
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append(zzacc);
        sb.append(" is not a valid enum CellularNetworkType");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzamf != null) {
            zzbfaVar.zzm(1, this.zzamf.intValue());
        }
        if (this.zzanx != null) {
            zzbfaVar.zzm(2, this.zzanx.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzamf != null) {
            zzr += zzbfa.zzq(1, this.zzamf.intValue());
        }
        return this.zzanx != null ? zzr + zzbfa.zzq(2, this.zzanx.intValue()) : zzr;
    }
}

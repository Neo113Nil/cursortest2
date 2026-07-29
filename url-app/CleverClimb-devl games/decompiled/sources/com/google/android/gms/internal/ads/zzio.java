package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzio extends zzbfc<zzio> {
    private Integer zzaoa = null;
    private Integer zzaob = null;
    private Integer zzaoc = null;
    private Integer zzaod = null;
    private Integer zzaoe = null;
    private Integer zzaof = null;
    private Integer zzaog = null;
    private Integer zzaoh = null;
    private Integer zzaoi = null;
    private Integer zzaoj = null;
    private zzip zzaok = null;

    public zzio() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final zzio zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 8:
                    zzbezVar.getPosition();
                    this.zzaoa = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                    break;
                case 16:
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzaob = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                        break;
                    }
                case 24:
                    this.zzaoc = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 32:
                    this.zzaod = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 40:
                    this.zzaoe = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 48:
                    this.zzaof = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 56:
                    this.zzaog = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 64:
                    this.zzaoh = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 72:
                    this.zzaoi = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 80:
                    this.zzaoj = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 90:
                    if (this.zzaok == null) {
                        this.zzaok = new zzip();
                    }
                    zzbezVar.zza(this.zzaok);
                    break;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzaoa != null) {
            zzbfaVar.zzm(1, this.zzaoa.intValue());
        }
        if (this.zzaob != null) {
            zzbfaVar.zzm(2, this.zzaob.intValue());
        }
        if (this.zzaoc != null) {
            zzbfaVar.zzm(3, this.zzaoc.intValue());
        }
        if (this.zzaod != null) {
            zzbfaVar.zzm(4, this.zzaod.intValue());
        }
        if (this.zzaoe != null) {
            zzbfaVar.zzm(5, this.zzaoe.intValue());
        }
        if (this.zzaof != null) {
            zzbfaVar.zzm(6, this.zzaof.intValue());
        }
        if (this.zzaog != null) {
            zzbfaVar.zzm(7, this.zzaog.intValue());
        }
        if (this.zzaoh != null) {
            zzbfaVar.zzm(8, this.zzaoh.intValue());
        }
        if (this.zzaoi != null) {
            zzbfaVar.zzm(9, this.zzaoi.intValue());
        }
        if (this.zzaoj != null) {
            zzbfaVar.zzm(10, this.zzaoj.intValue());
        }
        if (this.zzaok != null) {
            zzbfaVar.zza(11, this.zzaok);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzaoa != null) {
            zzr += zzbfa.zzq(1, this.zzaoa.intValue());
        }
        if (this.zzaob != null) {
            zzr += zzbfa.zzq(2, this.zzaob.intValue());
        }
        if (this.zzaoc != null) {
            zzr += zzbfa.zzq(3, this.zzaoc.intValue());
        }
        if (this.zzaod != null) {
            zzr += zzbfa.zzq(4, this.zzaod.intValue());
        }
        if (this.zzaoe != null) {
            zzr += zzbfa.zzq(5, this.zzaoe.intValue());
        }
        if (this.zzaof != null) {
            zzr += zzbfa.zzq(6, this.zzaof.intValue());
        }
        if (this.zzaog != null) {
            zzr += zzbfa.zzq(7, this.zzaog.intValue());
        }
        if (this.zzaoh != null) {
            zzr += zzbfa.zzq(8, this.zzaoh.intValue());
        }
        if (this.zzaoi != null) {
            zzr += zzbfa.zzq(9, this.zzaoi.intValue());
        }
        if (this.zzaoj != null) {
            zzr += zzbfa.zzq(10, this.zzaoj.intValue());
        }
        return this.zzaok != null ? zzr + zzbfa.zzb(11, this.zzaok) : zzr;
    }
}

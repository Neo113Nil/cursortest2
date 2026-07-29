package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzaw extends zzbfc<zzaw> {
    public String zzco = null;
    public Long zzcp = null;
    private String stackTrace = null;
    private String zzcq = null;
    private String zzcr = null;
    private Long zzcs = null;
    private Long zzct = null;
    private String zzcu = null;
    private Long zzcv = null;
    private String zzcw = null;

    public zzaw() {
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 10:
                    this.zzco = zzbezVar.readString();
                    break;
                case 16:
                    this.zzcp = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 26:
                    this.stackTrace = zzbezVar.readString();
                    break;
                case 34:
                    this.zzcq = zzbezVar.readString();
                    break;
                case 42:
                    this.zzcr = zzbezVar.readString();
                    break;
                case 48:
                    this.zzcs = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 56:
                    this.zzct = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 66:
                    this.zzcu = zzbezVar.readString();
                    break;
                case 72:
                    this.zzcv = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 82:
                    this.zzcw = zzbezVar.readString();
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
        if (this.zzco != null) {
            zzbfaVar.zzf(1, this.zzco);
        }
        if (this.zzcp != null) {
            zzbfaVar.zzi(2, this.zzcp.longValue());
        }
        if (this.stackTrace != null) {
            zzbfaVar.zzf(3, this.stackTrace);
        }
        if (this.zzcq != null) {
            zzbfaVar.zzf(4, this.zzcq);
        }
        if (this.zzcr != null) {
            zzbfaVar.zzf(5, this.zzcr);
        }
        if (this.zzcs != null) {
            zzbfaVar.zzi(6, this.zzcs.longValue());
        }
        if (this.zzct != null) {
            zzbfaVar.zzi(7, this.zzct.longValue());
        }
        if (this.zzcu != null) {
            zzbfaVar.zzf(8, this.zzcu);
        }
        if (this.zzcv != null) {
            zzbfaVar.zzi(9, this.zzcv.longValue());
        }
        if (this.zzcw != null) {
            zzbfaVar.zzf(10, this.zzcw);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzco != null) {
            zzr += zzbfa.zzg(1, this.zzco);
        }
        if (this.zzcp != null) {
            zzr += zzbfa.zzd(2, this.zzcp.longValue());
        }
        if (this.stackTrace != null) {
            zzr += zzbfa.zzg(3, this.stackTrace);
        }
        if (this.zzcq != null) {
            zzr += zzbfa.zzg(4, this.zzcq);
        }
        if (this.zzcr != null) {
            zzr += zzbfa.zzg(5, this.zzcr);
        }
        if (this.zzcs != null) {
            zzr += zzbfa.zzd(6, this.zzcs.longValue());
        }
        if (this.zzct != null) {
            zzr += zzbfa.zzd(7, this.zzct.longValue());
        }
        if (this.zzcu != null) {
            zzr += zzbfa.zzg(8, this.zzcu);
        }
        if (this.zzcv != null) {
            zzr += zzbfa.zzd(9, this.zzcv.longValue());
        }
        return this.zzcw != null ? zzr + zzbfa.zzg(10, this.zzcw) : zzr;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzig extends zzbfc<zzig> {
    public String zzamu = null;
    private zzis zzamv = null;
    private Integer zzamw = null;
    public zzit zzamx = null;
    private Integer zzamy = null;
    private Integer zzamz = null;
    private Integer zzana = null;
    private Integer zzanb = null;

    public zzig() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzig zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk != 10) {
                if (zzabk == 18) {
                    if (this.zzamv == null) {
                        this.zzamv = new zzis();
                    }
                    zzbfiVar = this.zzamv;
                } else if (zzabk == 24) {
                    this.zzamw = Integer.valueOf(zzbezVar.zzacc());
                } else if (zzabk == 34) {
                    if (this.zzamx == null) {
                        this.zzamx = new zzit();
                    }
                    zzbfiVar = this.zzamx;
                } else if (zzabk == 40) {
                    this.zzamy = Integer.valueOf(zzbezVar.zzacc());
                } else if (zzabk == 48) {
                    zzbezVar.getPosition();
                    this.zzamz = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } else if (zzabk == 56) {
                    zzbezVar.getPosition();
                    this.zzana = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } else if (zzabk == 64) {
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzanb = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                    }
                } else if (!super.zza(zzbezVar, zzabk)) {
                    return this;
                }
                zzbezVar.zza(zzbfiVar);
            } else {
                this.zzamu = zzbezVar.readString();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzamu != null) {
            zzbfaVar.zzf(1, this.zzamu);
        }
        if (this.zzamv != null) {
            zzbfaVar.zza(2, this.zzamv);
        }
        if (this.zzamw != null) {
            zzbfaVar.zzm(3, this.zzamw.intValue());
        }
        if (this.zzamx != null) {
            zzbfaVar.zza(4, this.zzamx);
        }
        if (this.zzamy != null) {
            zzbfaVar.zzm(5, this.zzamy.intValue());
        }
        if (this.zzamz != null) {
            zzbfaVar.zzm(6, this.zzamz.intValue());
        }
        if (this.zzana != null) {
            zzbfaVar.zzm(7, this.zzana.intValue());
        }
        if (this.zzanb != null) {
            zzbfaVar.zzm(8, this.zzanb.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzamu != null) {
            zzr += zzbfa.zzg(1, this.zzamu);
        }
        if (this.zzamv != null) {
            zzr += zzbfa.zzb(2, this.zzamv);
        }
        if (this.zzamw != null) {
            zzr += zzbfa.zzq(3, this.zzamw.intValue());
        }
        if (this.zzamx != null) {
            zzr += zzbfa.zzb(4, this.zzamx);
        }
        if (this.zzamy != null) {
            zzr += zzbfa.zzq(5, this.zzamy.intValue());
        }
        if (this.zzamz != null) {
            zzr += zzbfa.zzq(6, this.zzamz.intValue());
        }
        if (this.zzana != null) {
            zzr += zzbfa.zzq(7, this.zzana.intValue());
        }
        return this.zzanb != null ? zzr + zzbfa.zzq(8, this.zzanb.intValue()) : zzr;
    }
}

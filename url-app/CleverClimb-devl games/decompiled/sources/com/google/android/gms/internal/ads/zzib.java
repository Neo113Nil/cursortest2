package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzib extends zzbfc<zzib> {
    public Integer zzalt = null;
    private Integer zzalu = null;
    private zzid zzalv = null;
    public zzie zzalw = null;
    private zzic[] zzalx = zzic.zzhr();
    private zzif zzaly = null;
    private zzio zzalz = null;
    private zzin zzama = null;
    private zzik zzamb = null;
    private zzil zzamc = null;
    private zziu[] zzamd = zziu.zzhu();

    public zzib() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzib zza(zzbez zzbezVar) throws IOException {
        int position;
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 56:
                    position = zzbezVar.getPosition();
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc < 0 || zzacc > 9) {
                        StringBuilder sb = new StringBuilder(43);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum AdInitiater");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    } else {
                        this.zzalt = Integer.valueOf(zzacc);
                    }
                    break;
                case 64:
                    position = zzbezVar.getPosition();
                    try {
                        this.zzalu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                    }
                case 74:
                    if (this.zzalv == null) {
                        this.zzalv = new zzid();
                    }
                    zzbfiVar = this.zzalv;
                    zzbezVar.zza(zzbfiVar);
                case 82:
                    if (this.zzalw == null) {
                        this.zzalw = new zzie();
                    }
                    zzbfiVar = this.zzalw;
                    zzbezVar.zza(zzbfiVar);
                case 90:
                    int zzb = zzbfl.zzb(zzbezVar, 90);
                    int length = this.zzalx == null ? 0 : this.zzalx.length;
                    zzic[] zzicVarArr = new zzic[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzalx, 0, zzicVarArr, 0, length);
                    }
                    while (length < zzicVarArr.length - 1) {
                        zzicVarArr[length] = new zzic();
                        zzbezVar.zza(zzicVarArr[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzicVarArr[length] = new zzic();
                    zzbezVar.zza(zzicVarArr[length]);
                    this.zzalx = zzicVarArr;
                case 98:
                    if (this.zzaly == null) {
                        this.zzaly = new zzif();
                    }
                    zzbfiVar = this.zzaly;
                    zzbezVar.zza(zzbfiVar);
                case 106:
                    if (this.zzalz == null) {
                        this.zzalz = new zzio();
                    }
                    zzbfiVar = this.zzalz;
                    zzbezVar.zza(zzbfiVar);
                case 114:
                    if (this.zzama == null) {
                        this.zzama = new zzin();
                    }
                    zzbfiVar = this.zzama;
                    zzbezVar.zza(zzbfiVar);
                case 122:
                    if (this.zzamb == null) {
                        this.zzamb = new zzik();
                    }
                    zzbfiVar = this.zzamb;
                    zzbezVar.zza(zzbfiVar);
                case 130:
                    if (this.zzamc == null) {
                        this.zzamc = new zzil();
                    }
                    zzbfiVar = this.zzamc;
                    zzbezVar.zza(zzbfiVar);
                case 138:
                    int zzb2 = zzbfl.zzb(zzbezVar, 138);
                    int length2 = this.zzamd == null ? 0 : this.zzamd.length;
                    zziu[] zziuVarArr = new zziu[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzamd, 0, zziuVarArr, 0, length2);
                    }
                    while (length2 < zziuVarArr.length - 1) {
                        zziuVarArr[length2] = new zziu();
                        zzbezVar.zza(zziuVarArr[length2]);
                        zzbezVar.zzabk();
                        length2++;
                    }
                    zziuVarArr[length2] = new zziu();
                    zzbezVar.zza(zziuVarArr[length2]);
                    this.zzamd = zziuVarArr;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzalt != null) {
            zzbfaVar.zzm(7, this.zzalt.intValue());
        }
        if (this.zzalu != null) {
            zzbfaVar.zzm(8, this.zzalu.intValue());
        }
        if (this.zzalv != null) {
            zzbfaVar.zza(9, this.zzalv);
        }
        if (this.zzalw != null) {
            zzbfaVar.zza(10, this.zzalw);
        }
        if (this.zzalx != null && this.zzalx.length > 0) {
            for (int i = 0; i < this.zzalx.length; i++) {
                zzic zzicVar = this.zzalx[i];
                if (zzicVar != null) {
                    zzbfaVar.zza(11, zzicVar);
                }
            }
        }
        if (this.zzaly != null) {
            zzbfaVar.zza(12, this.zzaly);
        }
        if (this.zzalz != null) {
            zzbfaVar.zza(13, this.zzalz);
        }
        if (this.zzama != null) {
            zzbfaVar.zza(14, this.zzama);
        }
        if (this.zzamb != null) {
            zzbfaVar.zza(15, this.zzamb);
        }
        if (this.zzamc != null) {
            zzbfaVar.zza(16, this.zzamc);
        }
        if (this.zzamd != null && this.zzamd.length > 0) {
            for (int i2 = 0; i2 < this.zzamd.length; i2++) {
                zziu zziuVar = this.zzamd[i2];
                if (zziuVar != null) {
                    zzbfaVar.zza(17, zziuVar);
                }
            }
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzalt != null) {
            zzr += zzbfa.zzq(7, this.zzalt.intValue());
        }
        if (this.zzalu != null) {
            zzr += zzbfa.zzq(8, this.zzalu.intValue());
        }
        if (this.zzalv != null) {
            zzr += zzbfa.zzb(9, this.zzalv);
        }
        if (this.zzalw != null) {
            zzr += zzbfa.zzb(10, this.zzalw);
        }
        if (this.zzalx != null && this.zzalx.length > 0) {
            int i = zzr;
            for (int i2 = 0; i2 < this.zzalx.length; i2++) {
                zzic zzicVar = this.zzalx[i2];
                if (zzicVar != null) {
                    i += zzbfa.zzb(11, zzicVar);
                }
            }
            zzr = i;
        }
        if (this.zzaly != null) {
            zzr += zzbfa.zzb(12, this.zzaly);
        }
        if (this.zzalz != null) {
            zzr += zzbfa.zzb(13, this.zzalz);
        }
        if (this.zzama != null) {
            zzr += zzbfa.zzb(14, this.zzama);
        }
        if (this.zzamb != null) {
            zzr += zzbfa.zzb(15, this.zzamb);
        }
        if (this.zzamc != null) {
            zzr += zzbfa.zzb(16, this.zzamc);
        }
        if (this.zzamd != null && this.zzamd.length > 0) {
            for (int i3 = 0; i3 < this.zzamd.length; i3++) {
                zziu zziuVar = this.zzamd[i3];
                if (zziuVar != null) {
                    zzr += zzbfa.zzb(17, zziuVar);
                }
            }
        }
        return zzr;
    }
}

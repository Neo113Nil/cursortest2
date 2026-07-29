package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbfm extends zzbfc<zzbfm> {
    public Integer zzamf = null;
    private Integer zzecg = null;
    public String url = null;
    public String zzech = null;
    private String zzeci = null;
    public zzbfn zzecj = null;
    public zzbfu[] zzeck = zzbfu.zzagu();
    public String zzecl = null;
    public zzbft zzecm = null;
    private Boolean zzecn = null;
    private String[] zzeco = zzbfl.zzecd;
    private String zzecp = null;
    private Boolean zzecq = null;
    private Boolean zzecr = null;
    private byte[] zzecs = null;
    public zzbfv zzect = null;
    public String[] zzecu = zzbfl.zzecd;
    public String[] zzecv = zzbfl.zzecd;

    public zzbfm() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c8, code lost:
    
        r5 = new java.lang.StringBuilder(39);
        r5.append(r2);
        r5.append(" is not a valid enum Verdict");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbfm zza(zzbez zzbezVar) throws IOException {
        int zzabn;
        int zzabn2;
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 10:
                    this.url = zzbezVar.readString();
                    continue;
                case 18:
                    this.zzech = zzbezVar.readString();
                    continue;
                case 26:
                    this.zzeci = zzbezVar.readString();
                    continue;
                case 34:
                    int zzb = zzbfl.zzb(zzbezVar, 34);
                    int length = this.zzeck == null ? 0 : this.zzeck.length;
                    zzbfu[] zzbfuVarArr = new zzbfu[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzeck, 0, zzbfuVarArr, 0, length);
                    }
                    while (length < zzbfuVarArr.length - 1) {
                        zzbfuVarArr[length] = new zzbfu();
                        zzbezVar.zza(zzbfuVarArr[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzbfuVarArr[length] = new zzbfu();
                    zzbezVar.zza(zzbfuVarArr[length]);
                    this.zzeck = zzbfuVarArr;
                    continue;
                case 40:
                    this.zzecn = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 50:
                    int zzb2 = zzbfl.zzb(zzbezVar, 50);
                    int length2 = this.zzeco == null ? 0 : this.zzeco.length;
                    String[] strArr = new String[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzeco, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length2++;
                    }
                    strArr[length2] = zzbezVar.readString();
                    this.zzeco = strArr;
                    continue;
                case 58:
                    this.zzecp = zzbezVar.readString();
                    continue;
                case 64:
                    this.zzecq = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 72:
                    this.zzecr = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 80:
                    zzbezVar.getPosition();
                    zzabn = zzbezVar.zzabn();
                    if (zzabn >= 0 && zzabn <= 9) {
                        this.zzamf = Integer.valueOf(zzabn);
                        continue;
                    }
                    break;
                case 88:
                    try {
                        zzabn2 = zzbezVar.zzabn();
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(zzbezVar.getPosition());
                        zza(zzbezVar, zzabk);
                    }
                    if (zzabn2 >= 0 && zzabn2 <= 4) {
                        this.zzecg = Integer.valueOf(zzabn2);
                        continue;
                    }
                    break;
                case 98:
                    if (this.zzecj == null) {
                        this.zzecj = new zzbfn();
                    }
                    zzbfiVar = this.zzecj;
                    break;
                case 106:
                    this.zzecl = zzbezVar.readString();
                    continue;
                case 114:
                    if (this.zzecm == null) {
                        this.zzecm = new zzbft();
                    }
                    zzbfiVar = this.zzecm;
                    break;
                case 122:
                    this.zzecs = zzbezVar.readBytes();
                    continue;
                case 138:
                    if (this.zzect == null) {
                        this.zzect = new zzbfv();
                    }
                    zzbfiVar = this.zzect;
                    break;
                case 162:
                    int zzb3 = zzbfl.zzb(zzbezVar, 162);
                    int length3 = this.zzecu == null ? 0 : this.zzecu.length;
                    String[] strArr2 = new String[zzb3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzecu, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length3++;
                    }
                    strArr2[length3] = zzbezVar.readString();
                    this.zzecu = strArr2;
                    continue;
                case 170:
                    int zzb4 = zzbfl.zzb(zzbezVar, 170);
                    int length4 = this.zzecv == null ? 0 : this.zzecv.length;
                    String[] strArr3 = new String[zzb4 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.zzecv, 0, strArr3, 0, length4);
                    }
                    while (length4 < strArr3.length - 1) {
                        strArr3[length4] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length4++;
                    }
                    strArr3[length4] = zzbezVar.readString();
                    this.zzecv = strArr3;
                    continue;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
                    continue;
            }
            zzbezVar.zza(zzbfiVar);
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append(zzabn);
        sb.append(" is not a valid enum ReportType");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.url != null) {
            zzbfaVar.zzf(1, this.url);
        }
        if (this.zzech != null) {
            zzbfaVar.zzf(2, this.zzech);
        }
        if (this.zzeci != null) {
            zzbfaVar.zzf(3, this.zzeci);
        }
        if (this.zzeck != null && this.zzeck.length > 0) {
            for (int i = 0; i < this.zzeck.length; i++) {
                zzbfu zzbfuVar = this.zzeck[i];
                if (zzbfuVar != null) {
                    zzbfaVar.zza(4, zzbfuVar);
                }
            }
        }
        if (this.zzecn != null) {
            zzbfaVar.zzf(5, this.zzecn.booleanValue());
        }
        if (this.zzeco != null && this.zzeco.length > 0) {
            for (int i2 = 0; i2 < this.zzeco.length; i2++) {
                String str = this.zzeco[i2];
                if (str != null) {
                    zzbfaVar.zzf(6, str);
                }
            }
        }
        if (this.zzecp != null) {
            zzbfaVar.zzf(7, this.zzecp);
        }
        if (this.zzecq != null) {
            zzbfaVar.zzf(8, this.zzecq.booleanValue());
        }
        if (this.zzecr != null) {
            zzbfaVar.zzf(9, this.zzecr.booleanValue());
        }
        if (this.zzamf != null) {
            zzbfaVar.zzm(10, this.zzamf.intValue());
        }
        if (this.zzecg != null) {
            zzbfaVar.zzm(11, this.zzecg.intValue());
        }
        if (this.zzecj != null) {
            zzbfaVar.zza(12, this.zzecj);
        }
        if (this.zzecl != null) {
            zzbfaVar.zzf(13, this.zzecl);
        }
        if (this.zzecm != null) {
            zzbfaVar.zza(14, this.zzecm);
        }
        if (this.zzecs != null) {
            zzbfaVar.zza(15, this.zzecs);
        }
        if (this.zzect != null) {
            zzbfaVar.zza(17, this.zzect);
        }
        if (this.zzecu != null && this.zzecu.length > 0) {
            for (int i3 = 0; i3 < this.zzecu.length; i3++) {
                String str2 = this.zzecu[i3];
                if (str2 != null) {
                    zzbfaVar.zzf(20, str2);
                }
            }
        }
        if (this.zzecv != null && this.zzecv.length > 0) {
            for (int i4 = 0; i4 < this.zzecv.length; i4++) {
                String str3 = this.zzecv[i4];
                if (str3 != null) {
                    zzbfaVar.zzf(21, str3);
                }
            }
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.url != null) {
            zzr += zzbfa.zzg(1, this.url);
        }
        if (this.zzech != null) {
            zzr += zzbfa.zzg(2, this.zzech);
        }
        if (this.zzeci != null) {
            zzr += zzbfa.zzg(3, this.zzeci);
        }
        if (this.zzeck != null && this.zzeck.length > 0) {
            int i = zzr;
            for (int i2 = 0; i2 < this.zzeck.length; i2++) {
                zzbfu zzbfuVar = this.zzeck[i2];
                if (zzbfuVar != null) {
                    i += zzbfa.zzb(4, zzbfuVar);
                }
            }
            zzr = i;
        }
        if (this.zzecn != null) {
            this.zzecn.booleanValue();
            zzr += zzbfa.zzcd(5) + 1;
        }
        if (this.zzeco != null && this.zzeco.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.zzeco.length; i5++) {
                String str = this.zzeco[i5];
                if (str != null) {
                    i4++;
                    i3 += zzbfa.zzeo(str);
                }
            }
            zzr = zzr + i3 + (i4 * 1);
        }
        if (this.zzecp != null) {
            zzr += zzbfa.zzg(7, this.zzecp);
        }
        if (this.zzecq != null) {
            this.zzecq.booleanValue();
            zzr += zzbfa.zzcd(8) + 1;
        }
        if (this.zzecr != null) {
            this.zzecr.booleanValue();
            zzr += zzbfa.zzcd(9) + 1;
        }
        if (this.zzamf != null) {
            zzr += zzbfa.zzq(10, this.zzamf.intValue());
        }
        if (this.zzecg != null) {
            zzr += zzbfa.zzq(11, this.zzecg.intValue());
        }
        if (this.zzecj != null) {
            zzr += zzbfa.zzb(12, this.zzecj);
        }
        if (this.zzecl != null) {
            zzr += zzbfa.zzg(13, this.zzecl);
        }
        if (this.zzecm != null) {
            zzr += zzbfa.zzb(14, this.zzecm);
        }
        if (this.zzecs != null) {
            zzr += zzbfa.zzb(15, this.zzecs);
        }
        if (this.zzect != null) {
            zzr += zzbfa.zzb(17, this.zzect);
        }
        if (this.zzecu != null && this.zzecu.length > 0) {
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < this.zzecu.length; i8++) {
                String str2 = this.zzecu[i8];
                if (str2 != null) {
                    i7++;
                    i6 += zzbfa.zzeo(str2);
                }
            }
            zzr = zzr + i6 + (i7 * 2);
        }
        if (this.zzecv == null || this.zzecv.length <= 0) {
            return zzr;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzecv.length; i11++) {
            String str3 = this.zzecv[i11];
            if (str3 != null) {
                i10++;
                i9 += zzbfa.zzeo(str3);
            }
        }
        return zzr + i9 + (i10 * 2);
    }
}

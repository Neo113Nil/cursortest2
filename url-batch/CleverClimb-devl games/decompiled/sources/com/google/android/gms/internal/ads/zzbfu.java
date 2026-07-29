package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbfu extends zzbfc<zzbfu> {
    private static volatile zzbfu[] zzedm;
    public Integer zzedn = null;
    public String url = null;
    public zzbfp zzedo = null;
    private zzbfr zzedp = null;
    private Integer zzedq = null;
    private int[] zzedr = zzbfl.zzeby;
    private String zzeds = null;
    public Integer zzedt = null;
    public String[] zzedu = zzbfl.zzecd;

    public zzbfu() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final zzbfu zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        int zzabn;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 8:
                    this.zzedn = Integer.valueOf(zzbezVar.zzabn());
                    continue;
                case 18:
                    this.url = zzbezVar.readString();
                    continue;
                case 26:
                    if (this.zzedo == null) {
                        this.zzedo = new zzbfp();
                    }
                    zzbfiVar = this.zzedo;
                    break;
                case 34:
                    if (this.zzedp == null) {
                        this.zzedp = new zzbfr();
                    }
                    zzbfiVar = this.zzedp;
                    break;
                case 40:
                    this.zzedq = Integer.valueOf(zzbezVar.zzabn());
                    continue;
                case 48:
                    int zzb = zzbfl.zzb(zzbezVar, 48);
                    int length = this.zzedr == null ? 0 : this.zzedr.length;
                    int[] iArr = new int[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzedr, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = zzbezVar.zzabn();
                        zzbezVar.zzabk();
                        length++;
                    }
                    iArr[length] = zzbezVar.zzabn();
                    this.zzedr = iArr;
                    continue;
                case 50:
                    int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                    int position = zzbezVar.getPosition();
                    int i = 0;
                    while (zzbezVar.zzagn() > 0) {
                        zzbezVar.zzabn();
                        i++;
                    }
                    zzbezVar.zzdc(position);
                    int length2 = this.zzedr == null ? 0 : this.zzedr.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzedr, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = zzbezVar.zzabn();
                        length2++;
                    }
                    this.zzedr = iArr2;
                    zzbezVar.zzbs(zzbr);
                    continue;
                case 58:
                    this.zzeds = zzbezVar.readString();
                    continue;
                case 64:
                    int position2 = zzbezVar.getPosition();
                    try {
                        zzabn = zzbezVar.zzabn();
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position2);
                        zza(zzbezVar, zzabk);
                    }
                    if (zzabn < 0 || zzabn > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(zzabn);
                        sb.append(" is not a valid enum AdResourceType");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    } else {
                        this.zzedt = Integer.valueOf(zzabn);
                        continue;
                    }
                    break;
                case 74:
                    int zzb2 = zzbfl.zzb(zzbezVar, 74);
                    int length3 = this.zzedu == null ? 0 : this.zzedu.length;
                    String[] strArr = new String[zzb2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzedu, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length3++;
                    }
                    strArr[length3] = zzbezVar.readString();
                    this.zzedu = strArr;
                    continue;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
                    continue;
            }
            zzbezVar.zza(zzbfiVar);
        }
    }

    public static zzbfu[] zzagu() {
        if (zzedm == null) {
            synchronized (zzbfg.zzebs) {
                if (zzedm == null) {
                    zzedm = new zzbfu[0];
                }
            }
        }
        return zzedm;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        zzbfaVar.zzm(1, this.zzedn.intValue());
        if (this.url != null) {
            zzbfaVar.zzf(2, this.url);
        }
        if (this.zzedo != null) {
            zzbfaVar.zza(3, this.zzedo);
        }
        if (this.zzedp != null) {
            zzbfaVar.zza(4, this.zzedp);
        }
        if (this.zzedq != null) {
            zzbfaVar.zzm(5, this.zzedq.intValue());
        }
        if (this.zzedr != null && this.zzedr.length > 0) {
            for (int i = 0; i < this.zzedr.length; i++) {
                zzbfaVar.zzm(6, this.zzedr[i]);
            }
        }
        if (this.zzeds != null) {
            zzbfaVar.zzf(7, this.zzeds);
        }
        if (this.zzedt != null) {
            zzbfaVar.zzm(8, this.zzedt.intValue());
        }
        if (this.zzedu != null && this.zzedu.length > 0) {
            for (int i2 = 0; i2 < this.zzedu.length; i2++) {
                String str = this.zzedu[i2];
                if (str != null) {
                    zzbfaVar.zzf(9, str);
                }
            }
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr() + zzbfa.zzq(1, this.zzedn.intValue());
        if (this.url != null) {
            zzr += zzbfa.zzg(2, this.url);
        }
        if (this.zzedo != null) {
            zzr += zzbfa.zzb(3, this.zzedo);
        }
        if (this.zzedp != null) {
            zzr += zzbfa.zzb(4, this.zzedp);
        }
        if (this.zzedq != null) {
            zzr += zzbfa.zzq(5, this.zzedq.intValue());
        }
        if (this.zzedr != null && this.zzedr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzedr.length; i2++) {
                i += zzbfa.zzce(this.zzedr[i2]);
            }
            zzr = zzr + i + (this.zzedr.length * 1);
        }
        if (this.zzeds != null) {
            zzr += zzbfa.zzg(7, this.zzeds);
        }
        if (this.zzedt != null) {
            zzr += zzbfa.zzq(8, this.zzedt.intValue());
        }
        if (this.zzedu == null || this.zzedu.length <= 0) {
            return zzr;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzedu.length; i5++) {
            String str = this.zzedu[i5];
            if (str != null) {
                i4++;
                i3 += zzbfa.zzeo(str);
            }
        }
        return zzr + i3 + (i4 * 1);
    }
}

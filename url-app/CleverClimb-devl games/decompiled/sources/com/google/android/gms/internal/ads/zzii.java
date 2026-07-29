package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzii extends zzbfc<zzii> {
    private Integer zzang = null;
    public String zzanh = null;
    private Integer zzani = null;
    private Integer zzanj = null;
    private zzit zzank = null;
    public long[] zzanl = zzbfl.zzebz;
    public zzig zzanm = null;
    private zzih zzann = null;
    private zzim zzano = null;
    public zzib zzanp = null;

    public zzii() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzii zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 72:
                    this.zzang = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 82:
                    this.zzanh = zzbezVar.readString();
                    continue;
                case 88:
                    this.zzani = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 96:
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzanj = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                    }
                case 106:
                    if (this.zzank == null) {
                        this.zzank = new zzit();
                    }
                    zzbfiVar = this.zzank;
                    break;
                case 112:
                    int zzb = zzbfl.zzb(zzbezVar, 112);
                    int length = this.zzanl == null ? 0 : this.zzanl.length;
                    long[] jArr = new long[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzanl, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = zzbezVar.zzacd();
                        zzbezVar.zzabk();
                        length++;
                    }
                    jArr[length] = zzbezVar.zzacd();
                    this.zzanl = jArr;
                    continue;
                case 114:
                    int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                    int position2 = zzbezVar.getPosition();
                    int i = 0;
                    while (zzbezVar.zzagn() > 0) {
                        zzbezVar.zzacd();
                        i++;
                    }
                    zzbezVar.zzdc(position2);
                    int length2 = this.zzanl == null ? 0 : this.zzanl.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzanl, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = zzbezVar.zzacd();
                        length2++;
                    }
                    this.zzanl = jArr2;
                    zzbezVar.zzbs(zzbr);
                    continue;
                case 122:
                    if (this.zzanm == null) {
                        this.zzanm = new zzig();
                    }
                    zzbfiVar = this.zzanm;
                    break;
                case 130:
                    if (this.zzann == null) {
                        this.zzann = new zzih();
                    }
                    zzbfiVar = this.zzann;
                    break;
                case 138:
                    if (this.zzano == null) {
                        this.zzano = new zzim();
                    }
                    zzbfiVar = this.zzano;
                    break;
                case 146:
                    if (this.zzanp == null) {
                        this.zzanp = new zzib();
                    }
                    zzbfiVar = this.zzanp;
                    break;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
                    continue;
            }
            zzbezVar.zza(zzbfiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzang != null) {
            zzbfaVar.zzm(9, this.zzang.intValue());
        }
        if (this.zzanh != null) {
            zzbfaVar.zzf(10, this.zzanh);
        }
        if (this.zzani != null) {
            int intValue = this.zzani.intValue();
            zzbfaVar.zzl(11, 0);
            zzbfaVar.zzde(intValue);
        }
        if (this.zzanj != null) {
            zzbfaVar.zzm(12, this.zzanj.intValue());
        }
        if (this.zzank != null) {
            zzbfaVar.zza(13, this.zzank);
        }
        if (this.zzanl != null && this.zzanl.length > 0) {
            for (int i = 0; i < this.zzanl.length; i++) {
                zzbfaVar.zza(14, this.zzanl[i]);
            }
        }
        if (this.zzanm != null) {
            zzbfaVar.zza(15, this.zzanm);
        }
        if (this.zzann != null) {
            zzbfaVar.zza(16, this.zzann);
        }
        if (this.zzano != null) {
            zzbfaVar.zza(17, this.zzano);
        }
        if (this.zzanp != null) {
            zzbfaVar.zza(18, this.zzanp);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzang != null) {
            zzr += zzbfa.zzq(9, this.zzang.intValue());
        }
        if (this.zzanh != null) {
            zzr += zzbfa.zzg(10, this.zzanh);
        }
        if (this.zzani != null) {
            zzr += zzbfa.zzcd(11) + zzbfa.zzcl(this.zzani.intValue());
        }
        if (this.zzanj != null) {
            zzr += zzbfa.zzq(12, this.zzanj.intValue());
        }
        if (this.zzank != null) {
            zzr += zzbfa.zzb(13, this.zzank);
        }
        if (this.zzanl != null && this.zzanl.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzanl.length; i2++) {
                i += zzbfa.zzy(this.zzanl[i2]);
            }
            zzr = zzr + i + (this.zzanl.length * 1);
        }
        if (this.zzanm != null) {
            zzr += zzbfa.zzb(15, this.zzanm);
        }
        if (this.zzann != null) {
            zzr += zzbfa.zzb(16, this.zzann);
        }
        if (this.zzano != null) {
            zzr += zzbfa.zzb(17, this.zzano);
        }
        return this.zzanp != null ? zzr + zzbfa.zzb(18, this.zzanp) : zzr;
    }
}

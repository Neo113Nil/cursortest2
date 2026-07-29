package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbfr extends zzbfc<zzbfr> {
    private zzbfs zzedh = null;
    private zzbfo[] zzeda = zzbfo.zzagt();
    private byte[] zzedb = null;
    private byte[] zzedc = null;
    private Integer zzedd = null;
    private byte[] zzedi = null;

    public zzbfr() {
        this.zzebk = null;
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
                if (this.zzedh == null) {
                    this.zzedh = new zzbfs();
                }
                zzbezVar.zza(this.zzedh);
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                int length = this.zzeda == null ? 0 : this.zzeda.length;
                zzbfo[] zzbfoVarArr = new zzbfo[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzeda, 0, zzbfoVarArr, 0, length);
                }
                while (length < zzbfoVarArr.length - 1) {
                    zzbfoVarArr[length] = new zzbfo();
                    zzbezVar.zza(zzbfoVarArr[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzbfoVarArr[length] = new zzbfo();
                zzbezVar.zza(zzbfoVarArr[length]);
                this.zzeda = zzbfoVarArr;
            } else if (zzabk == 26) {
                this.zzedb = zzbezVar.readBytes();
            } else if (zzabk == 34) {
                this.zzedc = zzbezVar.readBytes();
            } else if (zzabk == 40) {
                this.zzedd = Integer.valueOf(zzbezVar.zzabn());
            } else if (zzabk == 50) {
                this.zzedi = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzedh != null) {
            zzbfaVar.zza(1, this.zzedh);
        }
        if (this.zzeda != null && this.zzeda.length > 0) {
            for (int i = 0; i < this.zzeda.length; i++) {
                zzbfo zzbfoVar = this.zzeda[i];
                if (zzbfoVar != null) {
                    zzbfaVar.zza(2, zzbfoVar);
                }
            }
        }
        if (this.zzedb != null) {
            zzbfaVar.zza(3, this.zzedb);
        }
        if (this.zzedc != null) {
            zzbfaVar.zza(4, this.zzedc);
        }
        if (this.zzedd != null) {
            zzbfaVar.zzm(5, this.zzedd.intValue());
        }
        if (this.zzedi != null) {
            zzbfaVar.zza(6, this.zzedi);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzedh != null) {
            zzr += zzbfa.zzb(1, this.zzedh);
        }
        if (this.zzeda != null && this.zzeda.length > 0) {
            for (int i = 0; i < this.zzeda.length; i++) {
                zzbfo zzbfoVar = this.zzeda[i];
                if (zzbfoVar != null) {
                    zzr += zzbfa.zzb(2, zzbfoVar);
                }
            }
        }
        if (this.zzedb != null) {
            zzr += zzbfa.zzb(3, this.zzedb);
        }
        if (this.zzedc != null) {
            zzr += zzbfa.zzb(4, this.zzedc);
        }
        if (this.zzedd != null) {
            zzr += zzbfa.zzq(5, this.zzedd.intValue());
        }
        return this.zzedi != null ? zzr + zzbfa.zzb(6, this.zzedi) : zzr;
    }
}

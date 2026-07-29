package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzid extends zzbfc<zzid> {
    private String zzacp = null;
    private zzic[] zzamh = zzic.zzhr();
    private Integer zzami = null;

    public zzid() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzid zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzacp = zzbezVar.readString();
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                int length = this.zzamh == null ? 0 : this.zzamh.length;
                zzic[] zzicVarArr = new zzic[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzamh, 0, zzicVarArr, 0, length);
                }
                while (length < zzicVarArr.length - 1) {
                    zzicVarArr[length] = new zzic();
                    zzbezVar.zza(zzicVarArr[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzicVarArr[length] = new zzic();
                zzbezVar.zza(zzicVarArr[length]);
                this.zzamh = zzicVarArr;
            } else if (zzabk == 24) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzami = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzacp != null) {
            zzbfaVar.zzf(1, this.zzacp);
        }
        if (this.zzamh != null && this.zzamh.length > 0) {
            for (int i = 0; i < this.zzamh.length; i++) {
                zzic zzicVar = this.zzamh[i];
                if (zzicVar != null) {
                    zzbfaVar.zza(2, zzicVar);
                }
            }
        }
        if (this.zzami != null) {
            zzbfaVar.zzm(3, this.zzami.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzacp != null) {
            zzr += zzbfa.zzg(1, this.zzacp);
        }
        if (this.zzamh != null && this.zzamh.length > 0) {
            for (int i = 0; i < this.zzamh.length; i++) {
                zzic zzicVar = this.zzamh[i];
                if (zzicVar != null) {
                    zzr += zzbfa.zzb(2, zzicVar);
                }
            }
        }
        return this.zzami != null ? zzr + zzbfa.zzq(3, this.zzami.intValue()) : zzr;
    }
}

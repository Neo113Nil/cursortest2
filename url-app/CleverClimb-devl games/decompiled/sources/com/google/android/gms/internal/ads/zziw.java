package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zziw extends zzbfc<zziw> {
    private Integer zzapp = null;

    public zziw() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final zziw zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc < 0 || zzacc > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum VideoErrorCode");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.zzapp = Integer.valueOf(zzacc);
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
        if (this.zzapp != null) {
            zzbfaVar.zzm(1, this.zzapp.intValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        return this.zzapp != null ? zzr + zzbfa.zzq(1, this.zzapp.intValue()) : zzr;
    }
}

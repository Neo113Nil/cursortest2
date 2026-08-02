package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzpt {
    private final Context zza;
    private Boolean zzb;

    public zzpt() {
        this.zza = null;
    }

    public zzpt(Context context) {
        this.zza = context;
    }

    public final zzoq zza(zzaf zzafVar, zzh zzhVar) {
        boolean booleanValue;
        zzafVar.getClass();
        zzhVar.getClass();
        if (zzet.zza < 29 || zzafVar.zzA == -1) {
            return zzoq.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            boolean z = false;
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z = true;
                    }
                    this.zzb = Boolean.valueOf(z);
                } else {
                    this.zzb = false;
                }
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzafVar.zzm;
        str.getClass();
        int zza = zzbn.zza(str, zzafVar.zzj);
        if (zza == 0 || zzet.zza < zzet.zzg(zza)) {
            return zzoq.zza;
        }
        int zzh = zzet.zzh(zzafVar.zzz);
        if (zzh == 0) {
            return zzoq.zza;
        }
        try {
            AudioFormat zzw = zzet.zzw(zzafVar.zzA, zzh, zza);
            return zzet.zza >= 31 ? zzps.zza(zzw, zzhVar.zza().zza, booleanValue) : zzpr.zza(zzw, zzhVar.zza().zza, booleanValue);
        } catch (IllegalArgumentException unused) {
            return zzoq.zza;
        }
    }
}

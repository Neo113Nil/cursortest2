package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzqi {
    private final Context zza;
    private Boolean zzb;

    public zzqi() {
        this(null);
    }

    public zzqi(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzpg zza(zzu zzuVar, zzc zzcVar) {
        int i;
        boolean booleanValue;
        zzuVar.getClass();
        zzcVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzuVar.zzH) == -1) {
            return zzpg.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzca.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzuVar.zzo;
        str.getClass();
        int zzh = zzar.zzh(str, zzuVar.zzk);
        if (zzh == 0 || Build.VERSION.SDK_INT < zzeo.zzD(zzh)) {
            return zzpg.zza;
        }
        int zzB = zzeo.zzB(zzuVar.zzG);
        if (zzB == 0) {
            return zzpg.zza;
        }
        try {
            AudioFormat zzC = zzeo.zzC(i, zzB, zzh);
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(zzC, zzcVar.zza())) {
                    return zzpg.zza;
                }
                zzpf zzpfVar = new zzpf();
                zzpfVar.zza(true);
                zzpfVar.zzc(booleanValue);
                return zzpfVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(zzC, zzcVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzpg.zza;
            }
            zzpf zzpfVar2 = new zzpf();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzpfVar2.zza(true);
            zzpfVar2.zzb(z);
            zzpfVar2.zzc(booleanValue);
            return zzpfVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpg.zza;
        }
    }
}

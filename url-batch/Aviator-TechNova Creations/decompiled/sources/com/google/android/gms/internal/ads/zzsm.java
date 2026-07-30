package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzsm {
    private final Context zza;
    private Boolean zzb;

    public zzsm() {
        this(null);
    }

    public zzsm(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzpz zza(zzv zzvVar, zzd zzdVar) {
        int i;
        boolean booleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzvVar.zzH) == -1) {
            return zzpz.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzo;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (zzg == 0 || Build.VERSION.SDK_INT < zzfj.zzC(zzg)) {
            return zzpz.zza;
        }
        int zzB = zzfj.zzB(zzvVar.zzG);
        if (zzB == 0) {
            return zzpz.zza;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(zzB).setEncoding(zzg).build();
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, zzdVar.zza())) {
                    return zzpz.zza;
                }
                zzpy zzpyVar = new zzpy();
                zzpyVar.zza(true);
                zzpyVar.zzc(booleanValue);
                return zzpyVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzpz.zza;
            }
            zzpy zzpyVar2 = new zzpy();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzpyVar2.zza(true);
            zzpyVar2.zzb(z);
            zzpyVar2.zzc(booleanValue);
            return zzpyVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpz.zza;
        }
    }
}

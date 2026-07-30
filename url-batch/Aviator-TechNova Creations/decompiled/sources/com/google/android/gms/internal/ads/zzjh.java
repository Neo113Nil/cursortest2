package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public interface zzjh extends zzbb {
    static {
        String str = zzfj.zza;
        String zza = zzgql.zza(Build.DEVICE);
        if (zza.contains("emulator") || zza.contains("emu64a") || zza.contains("emu64x")) {
            return;
        }
        zza.contains("generic");
    }

    void zzD(zzna zznaVar);

    void zzE(zzna zznaVar);

    int zzF();

    void zzG(zzwm zzwmVar);

    void zzH();
}

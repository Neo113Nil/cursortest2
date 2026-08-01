package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfmt {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfms(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfmp.zza() != zzfll.CTV) {
            return 2;
        }
        return zza;
    }
}

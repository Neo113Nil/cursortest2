package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfmp {
    private static UiModeManager zza;

    public static zzfll zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfll.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfll.OTHER : zzfll.CTV : zzfll.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

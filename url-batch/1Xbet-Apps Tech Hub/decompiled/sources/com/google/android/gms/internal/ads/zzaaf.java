package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaaf implements zzaae {
    private final WindowManager zza;

    private zzaaf(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzaae zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzaaf(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final void zzb(zzaab zzaabVar) {
        zzaai.zzb(zzaabVar.zza, this.zza.getDefaultDisplay());
    }
}

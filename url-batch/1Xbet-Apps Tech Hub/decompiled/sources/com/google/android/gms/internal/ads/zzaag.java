package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaag implements DisplayManager.DisplayListener, zzaae {
    private final DisplayManager zza;
    private zzaab zzb;

    private zzaag(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzaae zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzaag(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzaab zzaabVar = this.zzb;
        if (zzaabVar == null || i != 0) {
            return;
        }
        zzaai.zzb(zzaabVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final void zzb(zzaab zzaabVar) {
        this.zzb = zzaabVar;
        this.zza.registerDisplayListener(this, zzfs.zzw(null));
        zzaai.zzb(zzaabVar.zza, zzd());
    }
}

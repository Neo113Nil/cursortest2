package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzace extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacd zzd;
    private boolean zze;

    /* synthetic */ zzace(zzacd zzacdVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacdVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        int i2;
        synchronized (zzace.class) {
            if (!zzc) {
                try {
                } catch (zzdu e) {
                    String message = e.getMessage();
                    String.valueOf(message);
                    zzee.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(message)));
                }
                if (zzdv.zza(context)) {
                    i = zzdv.zzb() ? 1 : 2;
                    zzb = i;
                    zzc = true;
                }
                i = 0;
                zzb = i;
                zzc = true;
            }
            i2 = zzb;
        }
        return i2 != 0;
    }

    public static zzace zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzgrc.zzi(z2);
        return new zzacd().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzacd zzacdVar = this.zzd;
        synchronized (zzacdVar) {
            if (!this.zze) {
                zzacdVar.zzb();
                this.zze = true;
            }
        }
    }
}

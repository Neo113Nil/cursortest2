package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaag extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaaf zzd;
    private boolean zze;

    /* synthetic */ zzaag(zzaaf zzaafVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzaafVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        int i2;
        synchronized (zzaag.class) {
            if (!zzc) {
                try {
                } catch (zzdi e) {
                    String message = e.getMessage();
                    String.valueOf(message);
                    zzds.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(message)));
                }
                if (zzdj.zza(context)) {
                    i = zzdj.zzb() ? 1 : 2;
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

    public static zzaag zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzghc.zzh(z2);
        return new zzaaf().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzaaf zzaafVar = this.zzd;
        synchronized (zzaafVar) {
            if (!this.zze) {
                zzaafVar.zzb();
                this.zze = true;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzzz extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzx zzd;
    private boolean zze;

    /* synthetic */ zzzz(zzzx zzzxVar, SurfaceTexture surfaceTexture, boolean z, zzzy zzzyVar) {
        super(surfaceTexture);
        this.zzd = zzzxVar;
        this.zza = z;
    }

    public static zzzz zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzef.zzf(z2);
        return new zzzx().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzzz.class) {
            if (!zzc) {
                zzb = zzeo.zzc(context) ? zzeo.zzd() ? 1 : 2 : 0;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}

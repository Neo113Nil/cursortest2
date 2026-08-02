package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaad extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaab zzd;
    private boolean zze;

    /* synthetic */ zzaad(zzaab zzaabVar, SurfaceTexture surfaceTexture, boolean z, zzaac zzaacVar) {
        super(surfaceTexture);
        this.zzd = zzaabVar;
        this.zza = z;
    }

    public static zzaad zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdi.zzf(z2);
        return new zzaab().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzaad.class) {
            if (!zzc) {
                zzb = zzdr.zzb(context) ? zzdr.zzc() ? 1 : 2 : 0;
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

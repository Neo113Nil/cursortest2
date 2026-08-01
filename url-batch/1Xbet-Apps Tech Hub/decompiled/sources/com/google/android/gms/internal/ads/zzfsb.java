package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfsb {
    private static final zzfso zzb = new zzfso("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfsz zza;
    private final String zzd;

    zzfsb(Context context) {
        if (zzftc.zza(context)) {
            this.zza = new zzfsz(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfrw.zza, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    final void zzd(zzfrs zzfrsVar, zzfsg zzfsgVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfry(this, taskCompletionSource, zzfrsVar, zzfsgVar, taskCompletionSource), taskCompletionSource);
        }
    }

    final void zze(zzfsd zzfsdVar, zzfsg zzfsgVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfsdVar.zzg() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfrx(this, taskCompletionSource, zzfsdVar, zzfsgVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfse zzc2 = zzfsf.zzc();
            zzc2.zzb(8160);
            zzfsgVar.zza(zzc2.zzc());
        }
    }

    final void zzf(zzfsi zzfsiVar, zzfsg zzfsgVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfrz(this, taskCompletionSource, zzfsiVar, i, zzfsgVar, taskCompletionSource), taskCompletionSource);
        }
    }
}

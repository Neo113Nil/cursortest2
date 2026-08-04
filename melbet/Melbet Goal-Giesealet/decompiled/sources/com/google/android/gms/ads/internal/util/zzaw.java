package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzaw(zzax zzaxVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder zzO = zzs.zzO(context);
        zzO.setMessage(this.zzb);
        if (this.zzc) {
            zzO.setTitle("Error");
        } else {
            zzO.setTitle("Info");
        }
        if (this.zzd) {
            zzO.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzO.setPositiveButton("Learn More", new zzav(this, context));
            zzO.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzO.create().show();
    }
}

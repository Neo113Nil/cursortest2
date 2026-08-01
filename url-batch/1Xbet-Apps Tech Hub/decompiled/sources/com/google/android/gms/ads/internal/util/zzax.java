package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzax implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzax(zzay zzayVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = zzt.zzJ(this.zza);
        zzJ.setMessage(this.zzb);
        if (this.zzc) {
            zzJ.setTitle("Error");
        } else {
            zzJ.setTitle("Info");
        }
        if (this.zzd) {
            zzJ.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzJ.setPositiveButton("Learn More", new zzaw(this));
            zzJ.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzJ.create().show();
    }
}

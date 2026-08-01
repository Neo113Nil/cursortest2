package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbsi implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsk zza;

    zzbsi(zzbsk zzbskVar) {
        this.zza = zzbskVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        zzbsk zzbskVar = this.zza;
        Intent zzb = zzbskVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = zzbskVar.zzb;
        com.google.android.gms.ads.internal.util.zzt.zzS(context, zzb);
    }
}

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbrq implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrs zza;

    zzbrq(zzbrs zzbrsVar) {
        Objects.requireNonNull(zzbrsVar);
        this.zza = zzbrsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbrs zzbrsVar = this.zza;
        Intent zzb = zzbrsVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(zzbrsVar.zzc(), zzb);
    }
}

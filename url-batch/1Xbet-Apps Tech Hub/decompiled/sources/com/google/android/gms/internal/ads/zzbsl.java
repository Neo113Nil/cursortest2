package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbsl implements View.OnClickListener {
    final /* synthetic */ zzbsm zza;

    zzbsl(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}

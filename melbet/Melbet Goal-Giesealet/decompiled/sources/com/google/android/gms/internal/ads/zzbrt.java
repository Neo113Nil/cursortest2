package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbrt implements View.OnClickListener {
    final /* synthetic */ zzbrv zza;

    zzbrt(zzbrv zzbrvVar) {
        Objects.requireNonNull(zzbrvVar);
        this.zza = zzbrvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}

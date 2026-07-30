package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbwp implements View.OnClickListener {
    final /* synthetic */ zzbwr zza;

    zzbwp(zzbwr zzbwrVar) {
        Objects.requireNonNull(zzbwrVar);
        this.zza = zzbwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}

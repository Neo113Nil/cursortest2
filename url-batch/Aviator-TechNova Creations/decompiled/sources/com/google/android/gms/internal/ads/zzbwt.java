package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbwt implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwu zza;

    zzbwt(zzbwu zzbwuVar) {
        Objects.requireNonNull(zzbwuVar);
        this.zza = zzbwuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}

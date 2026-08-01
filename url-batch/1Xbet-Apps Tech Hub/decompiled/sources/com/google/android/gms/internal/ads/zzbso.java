package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbso implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsp zza;

    zzbso(zzbsp zzbspVar) {
        this.zza = zzbspVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}

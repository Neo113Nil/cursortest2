package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzebf extends zzbvs {
    final /* synthetic */ zzebg zza;

    protected zzebf(zzebg zzebgVar) {
        this.zza = zzebgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}

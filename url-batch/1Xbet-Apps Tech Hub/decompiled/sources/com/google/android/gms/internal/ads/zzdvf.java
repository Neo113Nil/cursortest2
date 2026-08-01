package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdvf implements zzdup {
    private final long zza;
    private final zzduu zzb;
    private final zzfdl zzc;

    zzdvf(long j, Context context, zzduu zzduuVar, zzciq zzciqVar, String str) {
        this.zza = j;
        this.zzb = zzduuVar;
        zzfdn zzv = zzciqVar.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdvd(this));
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdve(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }
}

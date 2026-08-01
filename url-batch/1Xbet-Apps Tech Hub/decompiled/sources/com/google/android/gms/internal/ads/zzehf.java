package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzehf extends zzbrc {
    final /* synthetic */ zzehg zza;
    private final zzefy zzb;

    /* synthetic */ zzehf(zzehg zzehgVar, zzefy zzefyVar, zzehe zzeheVar) {
        this.zza = zzehgVar;
        this.zzb = zzefyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str) throws RemoteException {
        ((zzehr) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzehr) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzehr) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(zzbqa zzbqaVar) throws RemoteException {
        this.zza.zzd = zzbqaVar;
        ((zzehr) this.zzb.zzc).zzo();
    }
}

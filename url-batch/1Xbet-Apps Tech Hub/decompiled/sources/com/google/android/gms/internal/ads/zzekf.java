package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzekf extends zzbrl {
    private final zzefy zza;

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zze(String str) throws RemoteException {
        ((zzehr) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzehr) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzg() throws RemoteException {
        ((zzehr) this.zza.zzc).zzo();
    }
}

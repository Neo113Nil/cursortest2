package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzegp extends zzbqp {
    final /* synthetic */ zzegq zza;
    private final zzeec zzb;

    /* synthetic */ zzegp(zzegq zzegqVar, zzeec zzeecVar, byte[] bArr) {
        Objects.requireNonNull(zzegqVar);
        this.zza = zzegqVar;
        this.zzb = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zze(zzbpm zzbpmVar) throws RemoteException {
        this.zza.zzc(zzbpmVar);
        ((zzefo) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzf(String str) throws RemoteException {
        ((zzefo) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzefo) this.zzb.zzc).zzx(zzeVar);
    }
}

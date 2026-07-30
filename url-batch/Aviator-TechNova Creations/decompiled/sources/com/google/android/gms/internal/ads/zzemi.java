package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzemi extends zzbvi {
    private final zzekj zza;

    /* synthetic */ zzemi(zzemj zzemjVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzemjVar);
        this.zza = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze() throws RemoteException {
        ((zzelv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(String str) throws RemoteException {
        ((zzelv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzelv) this.zza.zzc).zzx(zzeVar);
    }
}

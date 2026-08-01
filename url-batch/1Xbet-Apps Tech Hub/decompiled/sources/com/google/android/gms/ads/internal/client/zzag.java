package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzag extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpr zzb;

    zzag(zzaw zzawVar, Context context, zzbpr zzbprVar) {
        this.zza = context;
        this.zzb = zzbprVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 234310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbtl) zzcbr.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    return zzbtk.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 234310000);
        } catch (RemoteException | zzcbq | NullPointerException unused) {
            return null;
        }
    }
}

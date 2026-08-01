package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzae extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpr zzb;

    zzae(zzaw zzawVar, Context context, zzbpr zzbprVar) {
        this.zza = context;
        this.zzb = zzbprVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzp(ObjectWrapper.wrap(this.zza), this.zzb, 234310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzcah) zzcbr.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    return zzcag.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 234310000);
        } catch (RemoteException | zzcbq | NullPointerException unused) {
            return null;
        }
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpr zzc;
    final /* synthetic */ zzaw zzd;

    zzao(zzaw zzawVar, Context context, String str, zzbpr zzbprVar) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbprVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 234310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        zzbuu zzbuuVar;
        zzbdc.zza(this.zza);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjX)).booleanValue()) {
            zzaw zzawVar = this.zzd;
            Context context = this.zza;
            String str = this.zzb;
            zzbpr zzbprVar = this.zzc;
            zziVar = zzawVar.zzb;
            return zziVar.zza(context, str, zzbprVar);
        }
        try {
            IBinder zze = ((zzbr) zzcbr.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 234310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | zzcbq | NullPointerException e) {
            this.zzd.zzh = zzbus.zza(this.zza);
            zzbuuVar = this.zzd.zzh;
            zzbuuVar.zzf(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    zzaq(zzaw zzawVar, Context context) {
        this.zzb = zzawVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzg(ObjectWrapper.wrap(this.zza), 234310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzeq zzeqVar;
        zzbuu zzbuuVar;
        zzbdc.zza(this.zza);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjX)).booleanValue()) {
            zzaw zzawVar = this.zzb;
            Context context = this.zza;
            zzeqVar = zzawVar.zzc;
            return zzeqVar.zza(context);
        }
        try {
            IBinder zze = ((zzcp) zzcbr.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof zzcp ? (zzcp) queryLocalInterface : new zzcp(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), 234310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
        } catch (RemoteException | zzcbq | NullPointerException e) {
            this.zzb.zzh = zzbus.zza(this.zza);
            zzbuuVar = this.zzb.zzh;
            zzbuuVar.zzf(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}

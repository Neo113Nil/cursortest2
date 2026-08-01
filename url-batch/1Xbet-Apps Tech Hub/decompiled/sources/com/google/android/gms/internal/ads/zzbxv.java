package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbxv {
    public static final zzbxj zza(Context context, String str, zzbpr zzbprVar) {
        try {
            IBinder zze = ((zzbxn) zzcbr.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcbp() { // from class: com.google.android.gms.internal.ads.zzbxu
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzbxn ? (zzbxn) queryLocalInterface : new zzbxn(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbprVar, 234310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbxj ? (zzbxj) queryLocalInterface : new zzbxh(zze);
        } catch (RemoteException | zzcbq e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}

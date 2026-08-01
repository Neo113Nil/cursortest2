package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private zzbuu zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, zzbpr zzbprVar, int i) {
        zzbdc.zza(context);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjX)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbprVar, 234310000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                zzcbn.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) zzcbr.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof zzbv ? (zzbv) queryLocalInterface2 : new zzbv(obj);
                }
            })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbprVar, 234310000, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
        } catch (RemoteException | zzcbq | NullPointerException e2) {
            zzbuu zza = zzbus.zza(context);
            this.zza = zza;
            zza.zzf(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzcbn.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpr zzb;

    zzac(zzaw zzawVar, Context context, zzbpr zzbprVar) {
        this.zza = context;
        this.zzb = zzbprVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbdc.zza(context);
        if (((Boolean) zzba.zzc().zza(zzbdc.zzji)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, 234310000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbdc.zza(context);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzji)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzcbr.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdk(obj);
                }
            })).zze(wrap, this.zzb, 234310000);
        } catch (RemoteException | zzcbq | NullPointerException e) {
            zzbus.zza(this.zza).zzf(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}

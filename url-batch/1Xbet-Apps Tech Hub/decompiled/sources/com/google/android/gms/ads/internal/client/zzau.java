package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        HashMap hashMap = this.zzc;
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbuu zzbuuVar;
        zzbii zzbiiVar;
        zzbdc.zza(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjX)).booleanValue()) {
            zzaw zzawVar = this.zzd;
            View view = this.zza;
            HashMap hashMap = this.zzb;
            HashMap hashMap2 = this.zzc;
            zzbiiVar = zzawVar.zzg;
            return zzbiiVar.zza(view, hashMap, hashMap2);
        }
        try {
            return zzbgr.zze(((zzbgv) zzcbr.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    return zzbgu.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzcbq | NullPointerException e) {
            this.zzd.zzh = zzbus.zza(this.zza.getContext());
            zzbuuVar = this.zzd.zzh;
            zzbuuVar.zzf(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}

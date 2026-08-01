package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    zzaa(zzaw zzawVar, Activity activity) {
        this.zzb = zzawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbuu zzbuuVar;
        zzbtm zzbtmVar;
        zzbdc.zza(this.zza);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjX)).booleanValue()) {
            zzaw zzawVar = this.zzb;
            Activity activity = this.zza;
            zzbtmVar = zzawVar.zzf;
            return zzbtmVar.zza(activity);
        }
        try {
            return zzbto.zzI(((zzbts) zzcbr.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    return zzbtr.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzcbq | NullPointerException e) {
            this.zzb.zzh = zzbus.zza(this.zza.getApplicationContext());
            zzbuuVar = this.zzb.zzh;
            zzbuuVar.zzf(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}

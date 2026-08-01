package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzas extends zzax {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaw zzd;

    zzas(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzawVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbuu zzbuuVar;
        zzbih zzbihVar;
        zzbdc.zza(this.zzc);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjX)).booleanValue()) {
            zzaw zzawVar = this.zzd;
            Context context = this.zzc;
            FrameLayout frameLayout = this.zza;
            FrameLayout frameLayout2 = this.zzb;
            zzbihVar = zzawVar.zzd;
            return zzbihVar.zza(context, frameLayout, frameLayout2);
        }
        try {
            return zzbgl.zzbF(((zzbgp) zzcbr.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    return zzbgo.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 234310000));
        } catch (RemoteException | zzcbq | NullPointerException e) {
            this.zzd.zzh = zzbus.zza(this.zzc);
            zzbuuVar = this.zzd.zzh;
            zzbuuVar.zzf(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}

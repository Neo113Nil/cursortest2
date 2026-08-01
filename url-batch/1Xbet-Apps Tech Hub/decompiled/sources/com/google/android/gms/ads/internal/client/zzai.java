package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcbr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzai extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpr zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzai(zzaw zzawVar, Context context, zzbpr zzbprVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbprVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* synthetic */ Object zza() {
        return new zzbll();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 234310000, new zzbky(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzblh) zzcbr.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzcbp() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    return zzblg.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 234310000, new zzbky(this.zzc));
        } catch (RemoteException | zzcbq | NullPointerException unused) {
            return null;
        }
    }
}

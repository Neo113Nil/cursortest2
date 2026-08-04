package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaq extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbox zzc;
    final /* synthetic */ zzaz zzd;

    zzaq(zzaz zzazVar, Context context, String str, zzbox zzboxVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzboxVar;
        Objects.requireNonNull(zzazVar);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "native_ad");
        return new zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        zzbci.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzlx)).booleanValue()) {
            return this.zzd.zzo().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbu) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzap.zza)).zze(ObjectWrapper.wrap(context), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(zze);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            zzaz zzazVar = this.zzd;
            zzazVar.zzu(zzbtt.zza(this.zza));
            zzazVar.zzt().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzehg implements zzegb {
    private final Context zza;
    private final zzcsm zzb;
    private View zzc;
    private zzbqa zzd;

    public zzehg(Context context, zzcsm zzcsmVar) {
        this.zza = context;
        this.zzb = zzcsmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, final zzfdu zzfduVar, final zzefy zzefyVar) throws zzfev, zzejt {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && zzfduVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfev(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzehd
                            @Override // com.google.android.gms.internal.ads.zzgai
                            public final ListenableFuture zza(Object obj) {
                                return zzehg.this.zzc(view, zzfduVar, obj);
                            }
                        }, zzcca.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfev(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfev(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcrq zza = this.zzb.zza(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzcrw(view, null, new zzctp() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzctp
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbrp) zzefy.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfev(e3);
                }
            }
        }, (zzfdv) zzfduVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzehr) zzefyVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        try {
            ((zzbrp) zzefyVar.zzb).zzq(zzfduVar.zzaa);
            zzehe zzeheVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && zzfduVar.zzah) {
                ((zzbrp) zzefyVar.zzb).zzk(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehf(this, zzefyVar, zzeheVar), (zzbpx) zzefyVar.zzc, zzfehVar.zza.zza.zze);
            } else {
                ((zzbrp) zzefyVar.zzb).zzj(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehf(this, zzefyVar, zzeheVar), (zzbpx) zzefyVar.zzc, zzfehVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfev(e);
        }
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfdu zzfduVar, Object obj) throws Exception {
        return zzgbb.zzh(zzctd.zza(this.zza, view, zzfduVar));
    }
}

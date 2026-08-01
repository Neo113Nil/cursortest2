package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeia implements zzdig {
    private final zzfdu zza;
    private final zzbrp zzb;
    private final AdFormat zzc;
    private zzcyz zzd = null;

    zzeia(zzfdu zzfduVar, zzbrp zzbrpVar, AdFormat adFormat) {
        this.zza = zzfduVar;
        this.zzb = zzbrpVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zza(boolean z, Context context, zzcyu zzcyuVar) throws zzdif {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 6) {
                        zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdif("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbu)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdif("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdif(th);
        }
    }

    public final void zzb(zzcyz zzcyzVar) {
        this.zzd = zzcyzVar;
    }
}

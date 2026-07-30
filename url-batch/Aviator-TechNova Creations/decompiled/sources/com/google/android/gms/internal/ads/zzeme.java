package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzeme implements zzdmc {
    private final zzfir zza;
    private final zzbvs zzb;
    private final AdFormat zzc;
    private zzdbx zzd = null;

    zzeme(zzfir zzfirVar, zzbvs zzbvsVar, AdFormat adFormat) {
        this.zza = zzfirVar;
        this.zzb = zzbvsVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        boolean zzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdmb("Adapter failed to show.");
                }
                zzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zzk) {
                zzdbx zzdbxVar = this.zzd;
                if (zzdbxVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcc)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdbxVar.zza();
                return;
            }
            throw new zzdmb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdmb(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zza;
    }

    public final void zzc(zzdbx zzdbxVar) {
        this.zzd = zzdbxVar;
    }
}

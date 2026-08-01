package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbol {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbou zzc;
    private zzbou zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbou zza(Context context, zzcbt zzcbtVar, zzfkk zzfkkVar) {
        zzbou zzbouVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbou(zzc(context), zzcbtVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zza), zzfkkVar);
            }
            zzbouVar = this.zzc;
        }
        return zzbouVar;
    }

    public final zzbou zzb(Context context, zzcbt zzcbtVar, zzfkk zzfkkVar) {
        zzbou zzbouVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbou(zzc(context), zzcbtVar, (String) zzbff.zzb.zze(), zzfkkVar);
            }
            zzbouVar = this.zzd;
        }
        return zzbouVar;
    }
}

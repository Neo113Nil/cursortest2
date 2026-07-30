package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbsq {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbsz zzc;
    private zzbsz zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbjk.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzm(zzd(context)).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbsz zza(Context context, VersionInfoParcel versionInfoParcel, zzfor zzforVar) {
        zzbsz zzbszVar;
        String str;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                Context zzd = zzd(context);
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzc);
                } else {
                    str = (String) zzbjo.zza.zze();
                }
                this.zzd = new zzbsz(zzd, versionInfoParcel, str, zzforVar);
            }
            zzbszVar = this.zzd;
        }
        return zzbszVar;
    }

    public final zzbsz zzb(Context context, VersionInfoParcel versionInfoParcel, zzfor zzforVar) {
        zzbsz zzbszVar;
        String str;
        synchronized (this.zza) {
            if (this.zzc == null) {
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzc);
                } else if (((Boolean) zzbjk.zzg.zze()).booleanValue()) {
                    str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zza);
                } else {
                    str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzb);
                }
                this.zzc = new zzbsz(zzd(context), versionInfoParcel, str, zzforVar);
            }
            zzbszVar = this.zzc;
        }
        return zzbszVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            zzbsz zzbszVar = this.zzc;
            if (zzbszVar != null) {
                zzbszVar.zzc();
                this.zzc = null;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbzt {
    static zzbzt zza;

    public static synchronized zzbzt zzd(Context context) {
        synchronized (zzbzt.class) {
            zzbzt zzbztVar = zza;
            if (zzbztVar != null) {
                return zzbztVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbdc.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzt.zzo().zzi();
            zzi.zzr(applicationContext);
            zzbyx zzbyxVar = new zzbyx(null);
            zzbyxVar.zzb(applicationContext);
            zzbyxVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
            zzbyxVar.zza(zzi);
            zzbyxVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzbzt zze = zzbyxVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbzx zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaq)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                Map zzu = com.google.android.gms.ads.internal.util.zzt.zzu((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzas));
                Iterator it = zzu.keySet().iterator();
                while (it.hasNext()) {
                    zzc.zzc((String) it.next());
                }
                zzc.zzd(new zzbzv(zzc, zzu));
            }
            return zza;
        }
    }

    abstract zzbyq zza();

    abstract zzbyu zzb();

    abstract zzbzx zzc();
}

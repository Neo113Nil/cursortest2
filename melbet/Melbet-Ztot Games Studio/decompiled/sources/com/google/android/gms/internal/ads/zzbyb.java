package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzbyb {
    static zzbyb zza;

    public static synchronized zzbyb zzd(Context context) {
        synchronized (zzbyb.class) {
            zzbyb zzbybVar = zza;
            if (zzbybVar != null) {
                return zzbybVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbbw.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
            zzi.zzs(applicationContext);
            zzbxt zzbxtVar = new zzbxt(null);
            zzbxtVar.zzb(applicationContext);
            zzbxtVar.zzc(com.google.android.gms.ads.internal.zzu.zzB());
            zzbxtVar.zza(zzi);
            zzbxtVar.zzd(com.google.android.gms.ads.internal.zzu.zzn());
            zzbyb zze = zzbxtVar.zze();
            zza = zze;
            zze.zza().zza();
            zzbyf zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzal)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzp();
                Map zzv = com.google.android.gms.ads.internal.util.zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzam));
                Iterator it = zzv.keySet().iterator();
                while (it.hasNext()) {
                    zzc.zzc((String) it.next());
                }
                zzc.zzd(new zzbyd(zzc, zzv));
            }
            return zza;
        }
    }

    abstract zzbxm zza();

    abstract zzbxq zzb();

    abstract zzbyf zzc();
}

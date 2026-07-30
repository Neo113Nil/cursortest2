package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzccr {
    static zzccr zzi;

    public static synchronized zzccr zzb(Context context) {
        synchronized (zzccr.class) {
            zzccr zzccrVar = zzi;
            if (zzccrVar != null) {
                return zzccrVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbhe.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
            zzo.zza(applicationContext);
            zzccl zzcclVar = new zzccl(null);
            zzcclVar.zza(applicationContext);
            zzcclVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
            zzcclVar.zzc(zzo);
            zzcclVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
            zzccr zze = zzcclVar.zze();
            zzi = zze;
            ((zzccf) ((zzccm) zze).zzc.zzb()).zza();
            final zzccw zzccwVar = (zzccw) ((zzccm) zzi).zzh.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final Map zzz = com.google.android.gms.ads.internal.util.zzs.zzz((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbc));
                Iterator it = zzz.keySet().iterator();
                while (it.hasNext()) {
                    zzccwVar.zzb((String) it.next());
                }
                zzccwVar.zza(new zzccu() { // from class: com.google.android.gms.internal.ads.zzccv
                    @Override // com.google.android.gms.internal.ads.zzccu
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzccw.this.zzc(zzz, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        }
    }

    abstract zzccj zza();
}

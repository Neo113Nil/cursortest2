package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzeil implements zzgcf {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfeo zzb;
    final /* synthetic */ zzfel zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzflh zze;
    final /* synthetic */ zzfex zzf;
    final /* synthetic */ zzein zzg;

    zzeil(zzein zzeinVar, long j, zzfeo zzfeoVar, zzfel zzfelVar, String str, zzflh zzflhVar, zzfex zzfexVar) {
        this.zza = j;
        this.zzb = zzfeoVar;
        this.zzc = zzfelVar;
        this.zzd = str;
        this.zze = zzflhVar;
        this.zzf = zzfexVar;
        this.zzg = zzeinVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        Clock clock;
        Integer num;
        int i;
        com.google.android.gms.ads.internal.client.zze zzb;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzeey zzeeyVar;
        zzfll zzfllVar;
        zzeip zzeipVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzehv) {
                num = null;
                i = 3;
            } else if (th instanceof CancellationException) {
                i = 4;
            } else if (th instanceof zzffn) {
                i = 5;
            } else {
                if (th instanceof zzdwl) {
                    int i2 = zzfgi.zza(th).zza == 3 ? 1 : 6;
                    num = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbs)).booleanValue() && (th instanceof zzeex) && (zzb = ((zzeex) th).zzb()) != null) ? Integer.valueOf(zzb.zza) : null;
                    i = i2;
                } else {
                    num = null;
                    i = 6;
                }
            }
            synchronized (this.zzg) {
                zzein zzeinVar = this.zzg;
                z = zzeinVar.zze;
                if (z) {
                    zzeipVar = zzeinVar.zzb;
                    zzeipVar.zza(this.zzb, this.zzc, i, th instanceof zzeex ? (zzeex) th : null, elapsedRealtime);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhz)).booleanValue()) {
                    zzfllVar = this.zzg.zzc;
                    zzflh zzflhVar = this.zze;
                    zzfex zzfexVar = this.zzf;
                    zzfel zzfelVar = this.zzc;
                    zzfllVar.zzd(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzn));
                }
                zzein zzeinVar2 = this.zzg;
                z2 = zzeinVar2.zzg;
                if (z2) {
                    return;
                }
                linkedHashMap = zzeinVar2.zzd;
                zzfel zzfelVar2 = this.zzc;
                linkedHashMap.put(zzfelVar2, new zzeim(this.zzd, zzfelVar2.zzaf, i, elapsedRealtime, num));
                com.google.android.gms.ads.internal.client.zze zza = zzfgi.zza(th);
                int i3 = zza.zza;
                if ((i3 == 3 || i3 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                    zza = zzfgi.zza(new zzeex(13, zza.zzd));
                }
                zzeeyVar = this.zzg.zzf;
                zzeeyVar.zzf(this.zzc, elapsedRealtime, zza);
                return;
            }
        }
        i = 2;
        num = null;
        synchronized (this.zzg) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        boolean z2;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzeey zzeeyVar;
        LinkedHashMap linkedHashMap2;
        zzeip zzeipVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzein zzeinVar = this.zzg;
            z = zzeinVar.zze;
            if (z) {
                zzeipVar = zzeinVar.zzb;
                zzeipVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            zzein zzeinVar2 = this.zzg;
            z2 = zzeinVar2.zzg;
            if (z2) {
                return;
            }
            zzq = zzeinVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzeim) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzfel zzfelVar = this.zzc;
                linkedHashMap.put(zzfelVar, new zzeim(this.zzd, zzfelVar.zzaf, 0, elapsedRealtime, null));
            }
            zzeeyVar = this.zzg.zzf;
            zzeeyVar.zzg(this.zzc, elapsedRealtime, null);
        }
    }
}

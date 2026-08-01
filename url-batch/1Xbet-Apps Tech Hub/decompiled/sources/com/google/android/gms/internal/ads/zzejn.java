package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzejn implements zzgax {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfdy zzb;
    final /* synthetic */ zzfdu zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfkw zze;
    final /* synthetic */ zzfeh zzf;
    final /* synthetic */ zzejp zzg;

    zzejn(zzejp zzejpVar, long j, zzfdy zzfdyVar, zzfdu zzfduVar, String str, zzfkw zzfkwVar, zzfeh zzfehVar) {
        this.zzg = zzejpVar;
        this.zza = j;
        this.zzb = zzfdyVar;
        this.zzc = zzfduVar;
        this.zzd = str;
        this.zze = zzfkwVar;
        this.zzf = zzfehVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgax
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
        zzega zzegaVar;
        zzfla zzflaVar;
        zzejr zzejrVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzeix) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfev) {
            i = 5;
        } else {
            if (th instanceof zzdxn) {
                r7 = zzffr.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbA)).booleanValue() && (th instanceof zzefz) && (zzb = ((zzefz) th).zzb()) != null) {
                    num = Integer.valueOf(zzb.zza);
                    i = r7;
                    synchronized (this.zzg) {
                        zzejp zzejpVar = this.zzg;
                        z = zzejpVar.zze;
                        if (z) {
                            zzejrVar = zzejpVar.zzb;
                            zzejrVar.zza(this.zzb, this.zzc, i, th instanceof zzefz ? (zzefz) th : null, elapsedRealtime);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzii)).booleanValue()) {
                            zzflaVar = this.zzg.zzc;
                            zzfkw zzfkwVar = this.zze;
                            zzfeh zzfehVar = this.zzf;
                            zzfdu zzfduVar = this.zzc;
                            zzflaVar.zzd(zzfkwVar.zzc(zzfehVar, zzfduVar, zzfduVar.zzo));
                        }
                        zzejp zzejpVar2 = this.zzg;
                        z2 = zzejpVar2.zzg;
                        if (z2) {
                            return;
                        }
                        linkedHashMap = zzejpVar2.zzd;
                        zzfdu zzfduVar2 = this.zzc;
                        linkedHashMap.put(zzfduVar2, new zzejo(this.zzd, zzfduVar2.zzag, i, elapsedRealtime, num));
                        com.google.android.gms.ads.internal.client.zze zza = zzffr.zza(th);
                        int i2 = zza.zza;
                        if ((i2 == 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            zza = zzffr.zza(new zzefz(13, zza.zzd));
                        }
                        zzegaVar = this.zzg.zzf;
                        zzegaVar.zzf(this.zzc, elapsedRealtime, zza);
                        return;
                    }
                }
            }
            num = null;
            i = r7;
            synchronized (this.zzg) {
            }
        }
        num = null;
        synchronized (this.zzg) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        boolean z2;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzega zzegaVar;
        LinkedHashMap linkedHashMap2;
        zzejr zzejrVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzejp zzejpVar = this.zzg;
            z = zzejpVar.zze;
            if (z) {
                zzejrVar = zzejpVar.zzb;
                zzejrVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            zzejp zzejpVar2 = this.zzg;
            z2 = zzejpVar2.zzg;
            if (z2) {
                return;
            }
            zzq = zzejpVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzejo) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzfdu zzfduVar = this.zzc;
                linkedHashMap.put(zzfduVar, new zzejo(this.zzd, zzfduVar.zzag, 0, elapsedRealtime, null));
            }
            zzegaVar = this.zzg.zzf;
            zzegaVar.zzg(this.zzc, elapsedRealtime, null);
        }
    }
}

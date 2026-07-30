package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzenp implements zzgzl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfqg zze;
    final /* synthetic */ zzfjc zzf;
    final /* synthetic */ zzenr zzg;

    zzenp(zzenr zzenrVar, long j, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        int i;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzb;
        Integer valueOf;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzenr zzenrVar = this.zzg;
        long elapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else {
            if (th instanceof zzemz) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else if (th instanceof zzfjr) {
                i2 = 5;
            } else if (th instanceof zzecr) {
                i2 = zzfkm.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzci)).booleanValue() && (th instanceof zzekk) && (zzb = ((zzekk) th).zzb()) != null) {
                    valueOf = Integer.valueOf(zzb.zza);
                    i = i2;
                    synchronized (zzenrVar) {
                        if (zzenrVar.zzn()) {
                            zzenrVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzekk ? (zzekk) th : null, elapsedRealtime);
                            elapsedRealtime = elapsedRealtime;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjG)).booleanValue()) {
                            zzfqk zzl = zzenrVar.zzl();
                            zzfqg zzfqgVar = this.zze;
                            zzfjc zzfjcVar = this.zzf;
                            zzfir zzfirVar = this.zzc;
                            zzl.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzn), zzfirVar.zzax);
                        }
                        if (zzenrVar.zzp()) {
                            return;
                        }
                        LinkedHashMap zzm = zzenrVar.zzm();
                        zzfir zzfirVar2 = this.zzc;
                        zzm.put(zzfirVar2, new zzenq(this.zzd, zzfirVar2.zzaf, i, elapsedRealtime, valueOf));
                        com.google.android.gms.ads.internal.client.zze zza = zzfkm.zza(th);
                        int i3 = zza.zza;
                        if ((i3 == 3 || i3 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            zza = zzfkm.zza(new zzekk(13, zza.zzd));
                        }
                        zzenrVar.zzo().zze(zzfirVar2, elapsedRealtime, zza);
                        return;
                    }
                }
            } else {
                i = 6;
            }
            valueOf = null;
            synchronized (zzenrVar) {
            }
        }
        i = i2;
        valueOf = null;
        synchronized (zzenrVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        long j;
        zzenr zzenrVar = this.zzg;
        long elapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzenrVar) {
            if (zzenrVar.zzn()) {
                j = elapsedRealtime;
                zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
            } else {
                j = elapsedRealtime;
            }
            if (zzenrVar.zzp()) {
                return;
            }
            zzfir zzfirVar = this.zzc;
            if (zzenrVar.zzi(zzfirVar)) {
                ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = j;
            } else {
                long j2 = j;
                j = j2;
                zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, j2, null));
            }
            zzenrVar.zzo().zzd(zzfirVar, j, null);
        }
    }
}

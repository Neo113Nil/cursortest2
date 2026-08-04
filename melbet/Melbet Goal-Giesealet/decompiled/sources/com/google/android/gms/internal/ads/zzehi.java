package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzehi implements zzgoq {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcm zzb;
    final /* synthetic */ zzfcj zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjr zze;
    final /* synthetic */ zzfcu zzf;
    final /* synthetic */ zzehk zzg;

    zzehi(zzehk zzehkVar, long j, zzfcm zzfcmVar, zzfcj zzfcjVar, String str, zzfjr zzfjrVar, zzfcu zzfcuVar) {
        this.zza = j;
        this.zzb = zzfcmVar;
        this.zzc = zzfcjVar;
        this.zzd = str;
        this.zze = zzfjrVar;
        this.zzf = zzfcuVar;
        Objects.requireNonNull(zzehkVar);
        this.zzg = zzehkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        int i;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzb;
        Integer valueOf;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzehk zzehkVar = this.zzg;
        long elapsedRealtime = zzehkVar.zzj().elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else {
            if (th instanceof zzegs) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else if (th instanceof zzfdj) {
                i2 = 5;
            } else if (th instanceof zzdwz) {
                i2 = zzfee.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbP)).booleanValue() && (th instanceof zzeed) && (zzb = ((zzeed) th).zzb()) != null) {
                    valueOf = Integer.valueOf(zzb.zza);
                    i = i2;
                    synchronized (zzehkVar) {
                        if (zzehkVar.zzn()) {
                            zzehkVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzeed ? (zzeed) th : null, elapsedRealtime);
                            elapsedRealtime = elapsedRealtime;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjd)).booleanValue()) {
                            zzfjv zzl = zzehkVar.zzl();
                            zzfjr zzfjrVar = this.zze;
                            zzfcu zzfcuVar = this.zzf;
                            zzfcj zzfcjVar = this.zzc;
                            zzl.zza(zzfjrVar.zza(zzfcuVar, zzfcjVar, zzfcjVar.zzn), zzfcjVar.zzax);
                        }
                        if (zzehkVar.zzp()) {
                            return;
                        }
                        LinkedHashMap zzm = zzehkVar.zzm();
                        zzfcj zzfcjVar2 = this.zzc;
                        zzm.put(zzfcjVar2, new zzehj(this.zzd, zzfcjVar2.zzaf, i, elapsedRealtime, valueOf));
                        com.google.android.gms.ads.internal.client.zze zza = zzfee.zza(th);
                        int i3 = zza.zza;
                        if ((i3 == 3 || i3 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            zza = zzfee.zza(new zzeed(13, zza.zzd));
                        }
                        zzehkVar.zzo().zze(zzfcjVar2, elapsedRealtime, zza);
                        return;
                    }
                }
            } else {
                i = 6;
            }
            valueOf = null;
            synchronized (zzehkVar) {
            }
        }
        i = i2;
        valueOf = null;
        synchronized (zzehkVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        long j;
        zzehk zzehkVar = this.zzg;
        long elapsedRealtime = zzehkVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzehkVar) {
            if (zzehkVar.zzn()) {
                j = elapsedRealtime;
                zzehkVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
            } else {
                j = elapsedRealtime;
            }
            if (zzehkVar.zzp()) {
                return;
            }
            zzfcj zzfcjVar = this.zzc;
            if (zzehkVar.zzi(zzfcjVar)) {
                ((zzehj) zzehkVar.zzm().get(zzfcjVar)).zzd = j;
            } else {
                long j2 = j;
                j = j2;
                zzehkVar.zzm().put(zzfcjVar, new zzehj(this.zzd, zzfcjVar.zzaf, 0, j2, null));
            }
            zzehkVar.zzo().zzd(zzfcjVar, j, null);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfqw {
    private final Map zza;
    private final zzfsb zzb;
    private final zzfrf zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;
    private final zzfqr zzi;

    zzfqw(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, Clock clock, zzfqr zzfqrVar) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put(AdFormat.APP_OPEN_AD, new HashMap());
        hashMap.put(AdFormat.INTERSTITIAL, new HashMap());
        hashMap.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfsbVar;
        this.zzc = zzfrfVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzfqrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzl(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            for (zzfsa zzfsaVar : ((Map) it.next()).values()) {
                if (z) {
                    zzfsaVar.zzj();
                } else {
                    zzfsaVar.zzi();
                }
            }
        }
    }

    private final synchronized Object zzo(Class cls, AdFormat adFormat, String str) {
        zzfrf zzfrfVar = this.zzc;
        Clock clock = this.zzg;
        zzfrfVar.zze(clock.currentTimeMillis(), ExifInterface.GPS_MEASUREMENT_2D);
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        if (zzfsaVar != null && adFormat.equals(zzfsaVar.zzo())) {
            zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.zza, zzfsaVar.zzo());
            zzfrlVar.zza(str);
            zzfrm zzfrmVar = new zzfrm(zzfrlVar, null);
            zzfrfVar.zzf(clock.currentTimeMillis(), zzfrmVar, zzfsaVar.zze.zzd, zzfsaVar.zzp(), ExifInterface.GPS_MEASUREMENT_2D);
            try {
                String zzk = zzfsaVar.zzk();
                Object zzg = zzfsaVar.zzg();
                Object cast = zzg == null ? null : cls.cast(zzg);
                if (cast != null) {
                    zzfrfVar.zzh(clock.currentTimeMillis(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzk, zzfrmVar, ExifInterface.GPS_MEASUREMENT_2D);
                }
                return cast;
            } catch (ClassCastException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
                String name = cls.getName();
                String.valueOf(name);
                com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(name)), e);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(AdFormat adFormat) {
        int size;
        int ordinal;
        Map map = this.zza;
        size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        ordinal = adFormat.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfu)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzft)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfs)).intValue(), 1));
    }

    public final synchronized boolean zza(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzfsa zzb;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfqu(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfqv(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzp(adFormat) && (zzb = this.zzb.zzb(str, zzftVar, zzchVar)) != null) {
                AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zzb.zzm(atomicInteger.get());
                }
                zzfrf zzfrfVar = this.zzc;
                zzb.zzl(zzfrfVar);
                zzfqr zzfqrVar = this.zzi;
                if (zzfqrVar != null) {
                    zzfqrVar.zzd(str, adFormat, zzb);
                } else {
                    zzb.zzd();
                }
                ((Map) map.get(adFormat)).put(str, zzb);
                zzfrl zzfrlVar = new zzfrl(zzftVar.zza, adFormat);
                zzfrlVar.zza(str);
                zzfrfVar.zza(zzftVar.zzd, this.zzg.currentTimeMillis(), new zzfrm(zzfrlVar, null), ExifInterface.GPS_MEASUREMENT_2D);
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zzb(AdFormat adFormat, String str) {
        zzfrm zzfrmVar;
        Clock clock = this.zzg;
        long currentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        int i = 0;
        if (!map.containsKey(adFormat)) {
            return false;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        String zzk = zzfsaVar == null ? null : zzfsaVar.zzk();
        boolean z = zzk != null && adFormat.equals(zzfsaVar.zzo());
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        if (zzfsaVar == null) {
            zzfrmVar = null;
        } else {
            zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.zza, adFormat);
            zzfrlVar.zza(str);
            zzfrmVar = new zzfrm(zzfrlVar, null);
        }
        zzfrf zzfrfVar = this.zzc;
        int i2 = zzfsaVar == null ? 0 : zzfsaVar.zze.zzd;
        if (zzfsaVar != null) {
            i = zzfsaVar.zzp();
        }
        zzfrfVar.zzd(i2, i, currentTimeMillis, valueOf, zzk, zzfrmVar, ExifInterface.GPS_MEASUREMENT_2D);
        return z;
    }

    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzo(zzcaz.class, AdFormat.REWARDED, str);
    }

    public final synchronized zzbex zzd(String str) {
        return (zzbex) zzo(zzbex.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzo(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzft zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
            this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.zze.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.zze.zzd, zzfsaVar != null ? zzfsaVar.zzp() : -1);
            if (zzfsaVar != null) {
                return zzfsaVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        int zzp = zzfsaVar != null ? zzfsaVar.zzp() : 0;
        this.zzc.zzp(zzp, this.zzg.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.zze.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.zze.zzd);
        return zzp;
    }

    public final synchronized Map zzh(int i) {
        HashMap hashMap = new HashMap();
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat)) {
                for (zzfsa zzfsaVar : ((Map) map.get(adFormat)).values()) {
                    hashMap.put(zzfsaVar.zzn(), zzfsaVar.zze);
                }
                this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), hashMap.size());
                return hashMap;
            }
        }
        return hashMap;
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzfsa zzfsaVar;
        Map map = this.zza;
        if (map.containsKey(adFormat) && (zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str)) != null) {
            ((Map) map.get(adFormat)).remove(str);
            zzfsaVar.zzh();
            zzfqr zzfqrVar = this.zzi;
            if (zzfqrVar != null) {
                zzfqrVar.zze(str, adFormat);
            }
            zzfsaVar.zzr();
            zzfrf zzfrfVar = this.zzc;
            long currentTimeMillis = this.zzg.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzft zzftVar = zzfsaVar.zze;
            zzfrfVar.zzm(currentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzfsaVar.zzp());
            return true;
        }
        return false;
    }

    public final synchronized void zzj(int i) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat)) {
                Map map2 = (Map) map.get(adFormat);
                int size = map2.size();
                for (String str : map2.keySet()) {
                    zzfsa zzfsaVar = (zzfsa) map2.get(str);
                    if (zzfsaVar != null) {
                        zzfsaVar.zzh();
                        zzfqr zzfqrVar = this.zzi;
                        if (zzfqrVar != null) {
                            zzfqrVar.zze(str, adFormat);
                        }
                        zzfsaVar.zzr();
                        String.valueOf(str);
                        String valueOf = String.valueOf(str);
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(valueOf));
                    }
                }
                map2.clear();
                String concat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
                this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
            }
        }
    }
}

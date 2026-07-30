package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfrj {
    private final zzfsb zzc;
    private final zzfrf zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    zzfrj(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, Clock clock) {
        this.zzc = zzfsbVar;
        this.zzd = zzfrfVar;
        this.zze = context;
        this.zzh = clock;
    }

    static String zzh(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append("#");
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        if (z) {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                ((zzfsa) it.next()).zzj();
            }
        } else {
            Iterator it2 = this.zza.values().iterator();
            while (it2.hasNext()) {
                ((zzfsa) it2.next()).zzi();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzB)).booleanValue() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
            String zzh = zzh(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
            hashSet.add(zzh);
            ConcurrentMap concurrentMap = this.zza;
            zzfsa zzfsaVar = (zzfsa) concurrentMap.get(zzh);
            if (zzfsaVar == null) {
                ConcurrentMap concurrentMap2 = this.zzb;
                if (concurrentMap2.containsKey(zzh)) {
                    zzfsa zzfsaVar2 = (zzfsa) concurrentMap2.get(zzh);
                    if (zzfsaVar2.zze.equals(zzftVar)) {
                        zzfsaVar2.zzw(zzftVar.zzd);
                        zzfsaVar2.zzj();
                        concurrentMap.put(zzh, zzfsaVar2);
                        concurrentMap2.remove(zzh);
                    } else {
                        arrayList.add(zzftVar);
                    }
                } else {
                    arrayList.add(zzftVar);
                }
            } else if (zzfsaVar.zze.equals(zzftVar)) {
                zzfsaVar.zzw(zzftVar.zzd);
            } else {
                this.zzb.put(zzh, zzfsaVar);
                concurrentMap.remove(zzh);
                arrayList.add(zzftVar);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzfsa) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzfsa zzfsaVar3 = (zzfsa) ((Map.Entry) it3.next()).getValue();
            zzfsaVar3.zzh();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzA)).booleanValue()) {
            }
            zzfsaVar3.zzr();
            if (!zzfsaVar3.zzf()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzfsa zzfsaVar) {
        zzfsaVar.zzd();
        this.zza.put(str, zzfsaVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z;
        Clock clock = this.zzh;
        long currentTimeMillis = clock.currentTimeMillis();
        zzfsa zzq = zzq(str, adFormat);
        int i = 0;
        z = zzq != null && zzq.zzf();
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
        zzfrf zzfrfVar = this.zzd;
        int i2 = zzq == null ? 0 : zzq.zze.zzd;
        if (zzq != null) {
            i = zzq.zzp();
        }
        zzfrfVar.zzd(i2, i, currentTimeMillis, valueOf, zzq != null ? zzq.zzk() : null, zzfrmVar, AppEventsConstants.EVENT_PARAM_VALUE_YES);
        return z;
    }

    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
        zzfrf zzfrfVar = this.zzd;
        Clock clock = this.zzh;
        zzfrfVar.zzf(clock.currentTimeMillis(), zzfrmVar, -1, -1, AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzfsa zzq = zzq(str, adFormat);
        if (zzq == null) {
            return null;
        }
        try {
            String zzk = zzq.zzk();
            Object zzg = zzq.zzg();
            Object cast = zzg == null ? null : cls.cast(zzg);
            if (cast != null) {
                zzfrfVar.zzh(clock.currentTimeMillis(), zzq.zze.zzd, zzq.zzp(), zzk, zzfrmVar, AppEventsConstants.EVENT_PARAM_VALUE_YES);
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

    private final synchronized zzfsa zzq(String str, AdFormat adFormat) {
        return (zzfsa) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        if (!this.zzg.getAndSet(true)) {
            if (this.zzf == null) {
                synchronized (this) {
                    if (this.zzf == null) {
                        try {
                            this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
            } else {
                try {
                    this.zzf.registerDefaultNetworkCallback(new zzfri(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfrh(this));
        }
        List<com.google.android.gms.ads.internal.client.zzft> zzm = zzm(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzft zzftVar : zzm) {
            String str = zzftVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            zzfsa zza = this.zzc.zza(zzftVar, zzceVar);
            if (adFormat != null && zza != null) {
                AtomicInteger atomicInteger = this.zzi;
                if (atomicInteger != null) {
                    zza.zzm(atomicInteger.get());
                }
                zzfrf zzfrfVar = this.zzd;
                zza.zzl(zzfrfVar);
                zzn(zzh(str, adFormat), zza);
                enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                zzfrfVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfrm(new zzfrl(str, adFormat), null), AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
        }
        this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), AppEventsConstants.EVENT_PARAM_VALUE_YES);
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzp(zzcaz.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized zzbex zze(String str) {
        return (zzbex) zzp(zzbex.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}

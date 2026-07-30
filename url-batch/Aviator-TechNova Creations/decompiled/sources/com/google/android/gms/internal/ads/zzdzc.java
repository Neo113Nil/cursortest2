package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdzc {
    private final Map zza = new ConcurrentHashMap();

    zzdzc() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: all -> 0x015e, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0019, B:13:0x0032, B:15:0x0038, B:17:0x0041, B:19:0x0045, B:26:0x0063, B:28:0x0099, B:30:0x00a3, B:31:0x00ab, B:32:0x00b2, B:34:0x00b8, B:36:0x00bc, B:38:0x00d1, B:39:0x00da, B:41:0x00e0, B:44:0x00ee, B:47:0x00f4, B:48:0x0106, B:50:0x010c, B:53:0x011e, B:56:0x0126, B:68:0x0137, B:71:0x013f, B:74:0x0145, B:77:0x014e, B:86:0x0157, B:89:0x0074, B:90:0x0085), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(long j, int i, long j2) {
        int i2;
        ArrayDeque arrayDeque;
        Long l;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            if (i == 2) {
                zzdza zzdzaVar = new zzdza();
                zzdzaVar.zza(j);
                zzdzaVar.zzb(1);
                zzdzf zzc = zzdzaVar.zzc();
                Map map = this.zza;
                ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzc);
                if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                    arrayDeque2.removeFirst();
                    if (arrayDeque2.isEmpty()) {
                        map.remove(zzc);
                    }
                }
                i = 2;
            }
            zzdza zzdzaVar2 = new zzdza();
            zzdzaVar2.zza(j);
            zzdzaVar2.zzb(i);
            zzdzf zzc2 = zzdzaVar2.zzc();
            int zzb = zzc2.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    i2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziV)).intValue();
                } else if (zzb == 2) {
                    i2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziW)).intValue();
                } else if (zzb == 3) {
                    i2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziX)).intValue();
                }
                if (i2 > 0) {
                    Map map2 = this.zza;
                    ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzc2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new ArrayDeque();
                        map2.put(zzc2, arrayDeque3);
                    }
                    arrayDeque3.addLast(Long.valueOf(j2));
                    while (arrayDeque3.size() > i2) {
                        arrayDeque3.removeFirst();
                    }
                    zzc();
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziY)).intValue();
                    if (intValue <= 0) {
                        map2.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = map2.values().iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            i3 += ((ArrayDeque) it.next()).size();
                        }
                        if (i3 <= intValue) {
                            break;
                        }
                        if (!map2.isEmpty()) {
                            Long l2 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : map2.entrySet()) {
                                ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                    entry = entry2;
                                    l2 = l;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    map2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
            i2 = 0;
            if (i2 > 0) {
            }
        }
    }

    public final synchronized Map zzb() {
        HashMap hashMap;
        hashMap = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                hashMap.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzc() {
        long j;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdzf zzdzfVar = (zzdzf) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int zzb = zzdzfVar.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziS)).longValue();
                } else if (zzb == 2) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziT)).longValue();
                } else if (zzb == 3) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziU)).longValue();
                }
                if (j == 0) {
                    it.remove();
                    j = 0;
                }
                if (j <= 0) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext() && currentTimeMillis - ((Long) it2.next()).longValue() > j) {
                        it2.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        it.remove();
                    }
                }
            }
            j = 0;
            if (j == 0) {
            }
            if (j <= 0) {
            }
        }
    }
}

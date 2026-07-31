package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzw {
    private String zza;
    private boolean zzb;
    private zzfn.zzm zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzu zzh;

    final zzfn.zzd zza(int i) {
        ArrayList arrayList;
        List list;
        zzfn.zzd.zza zzb = zzfn.zzd.zzb();
        zzb.zza(i);
        zzb.zza(this.zzb);
        zzfn.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzb.zza(zzmVar);
        }
        zzfn.zzm.zza zzd = zzfn.zzm.zze().zzb(zznl.zza(this.zzd)).zzd(zznl.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            Iterator<Integer> it = this.zzf.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Long l = this.zzf.get(Integer.valueOf(intValue));
                if (l != null) {
                    arrayList.add((zzfn.zze) ((com.google.android.gms.internal.measurement.zzjk) zzfn.zze.zzc().zza(intValue).zza(l.longValue()).zzai()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.zzg == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.zzg.size());
            for (Integer num : this.zzg.keySet()) {
                zzfn.zzn.zza zza = zzfn.zzn.zzc().zza(num.intValue());
                List<Long> list2 = this.zzg.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    zza.zza(list2);
                }
                arrayList2.add((zzfn.zzn) ((com.google.android.gms.internal.measurement.zzjk) zza.zzai()));
            }
            list = arrayList2;
        }
        zzd.zzc(list);
        zzb.zza(zzd);
        return (zzfn.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzb.zzai());
    }

    private zzw(zzu zzuVar, String str) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzw(zzu zzuVar, String str, zzfn.zzm zzmVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzmVar;
    }

    final void zza(zzz zzzVar) {
        int zza = zzzVar.zza();
        if (zzzVar.zzc != null) {
            this.zze.set(zza, zzzVar.zzc.booleanValue());
        }
        if (zzzVar.zzd != null) {
            this.zzd.set(zza, zzzVar.zzd.booleanValue());
        }
        if (zzzVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzzVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzzVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzzVar.zzc()) {
                list.clear();
            }
            if (zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbk) && zzzVar.zzb()) {
                list.clear();
            }
            if (zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbk)) {
                long longValue2 = zzzVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzzVar.zzf.longValue() / 1000));
        }
    }
}

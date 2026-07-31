package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzu extends zzmx {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzw> zzc;
    private Long zzd;
    private Long zze;

    private final zzw zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzw zzwVar = new zzw(this, this.zza);
        this.zzc.put(num, zzwVar);
        return zzwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    protected final boolean zzc() {
        return false;
    }

    final List<zzfn.zzd> zza(String str, List<zzfn.zzf> list, List<zzfn.zzo> list2, Long l, Long l2) {
        return zza(str, list, list2, l, l2, false);
    }

    final List<zzfn.zzd> zza(String str, List<zzfn.zzf> list, List<zzfn.zzo> list2, Long l, Long l2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        HashSet hashSet;
        Map<Integer, zzfn.zzm> map;
        List<zzff.zzb> list3;
        Iterator it;
        boolean z5;
        Iterator<zzfn.zzn> it2;
        Map<Integer, zzfn.zzm> map2;
        zzfn.zzm zzmVar;
        HashSet hashSet2;
        Map<Integer, List<Integer>> map3;
        Iterator<Integer> it3;
        boolean z6;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator<zzfn.zzf> it4 = list.iterator();
        while (true) {
            z2 = true;
            if (!it4.hasNext()) {
                z3 = false;
                break;
            }
            if ("_s".equals(it4.next().zzg())) {
                z3 = true;
                break;
            }
        }
        boolean z7 = zzoc.zza() && zze().zzf(this.zza, zzbf.zzbk);
        boolean z8 = zzoc.zza() && zze().zzf(this.zza, zzbf.zzbj);
        if (z3) {
            zzal zzh = zzh();
            String str2 = this.zza;
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzh.e_().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error resetting session-scoped event counts. appId", zzfw.zza(str2), e);
            }
        }
        Map<Integer, List<zzff.zzb>> emptyMap = Collections.emptyMap();
        if (z8 && z7) {
            emptyMap = zzh().zzm(this.zza);
        }
        Map<Integer, zzfn.zzm> zzl = zzh().zzl(this.zza);
        if (zzl.isEmpty()) {
            z4 = true;
        } else {
            HashSet hashSet3 = new HashSet(zzl.keySet());
            if (z3) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> zzn = zzh().zzn(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzl);
                ArrayMap arrayMap = new ArrayMap();
                if (!zzl.isEmpty()) {
                    Iterator<Integer> it5 = zzl.keySet().iterator();
                    while (it5.hasNext()) {
                        int intValue = it5.next().intValue();
                        zzfn.zzm zzmVar2 = zzl.get(Integer.valueOf(intValue));
                        List<Integer> list4 = zzn.get(Integer.valueOf(intValue));
                        if (list4 == null || list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            map3 = zzn;
                            it3 = it5;
                            z6 = z2;
                            arrayMap.put(Integer.valueOf(intValue), zzmVar2);
                        } else {
                            z6 = z2;
                            hashSet2 = hashSet3;
                            List<Long> zza = g_().zza(zzmVar2.zzi(), list4);
                            if (zza.isEmpty()) {
                                z2 = z6;
                                hashSet3 = hashSet2;
                            } else {
                                zzfn.zzm.zza zzb = zzmVar2.zzcc().zzb().zzb(zza);
                                zzb.zzd().zzd(g_().zza(zzmVar2.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfn.zze zzeVar : zzmVar2.zzh()) {
                                    Map<Integer, List<Integer>> map4 = zzn;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(zzeVar.zza()))) {
                                        arrayList.add(zzeVar);
                                    }
                                    zzn = map4;
                                    it5 = it6;
                                }
                                map3 = zzn;
                                it3 = it5;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfn.zzn zznVar : zzmVar2.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zznVar.zzb()))) {
                                        arrayList2.add(zznVar);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                arrayMap.put(Integer.valueOf(intValue), (zzfn.zzm) ((com.google.android.gms.internal.measurement.zzjk) zzb.zzai()));
                            }
                        }
                        z2 = z6;
                        hashSet3 = hashSet2;
                        zzn = map3;
                        it5 = it3;
                    }
                }
                hashSet = hashSet3;
                z4 = z2;
                map = arrayMap;
            } else {
                hashSet = hashSet3;
                z4 = true;
                map = zzl;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                int intValue2 = ((Integer) it7.next()).intValue();
                zzfn.zzm zzmVar3 = map.get(Integer.valueOf(intValue2));
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap2 = new ArrayMap();
                if (zzmVar3 != null && zzmVar3.zza() != 0) {
                    for (zzfn.zze zzeVar2 : zzmVar3.zzh()) {
                        if (zzeVar2.zzf()) {
                            zzmVar = zzmVar3;
                            arrayMap2.put(Integer.valueOf(zzeVar2.zza()), zzeVar2.zze() ? Long.valueOf(zzeVar2.zzb()) : null);
                        } else {
                            zzmVar = zzmVar3;
                        }
                        zzmVar3 = zzmVar;
                    }
                }
                zzfn.zzm zzmVar4 = zzmVar3;
                ArrayMap arrayMap3 = new ArrayMap();
                if (zzmVar4 != null && zzmVar4.zzc() != 0) {
                    Iterator<zzfn.zzn> it8 = zzmVar4.zzj().iterator();
                    while (it8.hasNext()) {
                        zzfn.zzn next = it8.next();
                        if (!next.zzf() || next.zza() <= 0) {
                            it2 = it8;
                            map2 = map;
                        } else {
                            it2 = it8;
                            map2 = map;
                            arrayMap3.put(Integer.valueOf(next.zzb()), Long.valueOf(next.zza(next.zza() - 1)));
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map<Integer, zzfn.zzm> map5 = map;
                if (zzmVar4 != null) {
                    int i = 0;
                    while (i < (zzmVar4.zzd() << 6)) {
                        if (zznl.zza(zzmVar4.zzk(), i)) {
                            it = it7;
                            z5 = z7;
                            zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i));
                            bitSet2.set(i);
                            if (zznl.zza(zzmVar4.zzi(), i)) {
                                bitSet.set(i);
                                i++;
                                it7 = it;
                                z7 = z5;
                            }
                        } else {
                            it = it7;
                            z5 = z7;
                        }
                        arrayMap2.remove(Integer.valueOf(i));
                        i++;
                        it7 = it;
                        z7 = z5;
                    }
                }
                Iterator it9 = it7;
                boolean z9 = z7;
                zzfn.zzm zzmVar5 = zzl.get(Integer.valueOf(intValue2));
                if (z8 && z9 && (list3 = emptyMap.get(Integer.valueOf(intValue2))) != null && this.zze != null && this.zzd != null) {
                    for (zzff.zzb zzbVar : list3) {
                        int zzb2 = zzbVar.zzb();
                        long longValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            longValue = this.zzd.longValue() / 1000;
                        }
                        if (arrayMap2.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap2.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(intValue2), new zzw(this, this.zza, zzmVar5, bitSet, bitSet2, arrayMap2, arrayMap3));
                zzl = zzl;
                emptyMap = emptyMap;
                it7 = it9;
                z7 = z9;
                map = map5;
            }
        }
        if (com.google.android.gms.internal.measurement.zznk.zza() && zze().zzf(null, zzbf.zzcv)) {
            zza(list, z);
            if (z) {
                return new ArrayList();
            }
            zza(list2);
            return zzu();
        }
        zza(list, z4);
        zza(list2);
        return zzu();
    }

    private final List<zzfn.zzd> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            zzw zzwVar = this.zzc.get(Integer.valueOf(intValue));
            Preconditions.checkNotNull(zzwVar);
            zzfn.zzd zza = zzwVar.zza(intValue);
            arrayList.add(zza);
            zzal zzh = zzh();
            String str = this.zza;
            zzfn.zzm zzd = zza.zzd();
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzd);
            byte[] zzbz = zzd.zzbz();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(intValue));
            contentValues.put("current_results", zzbz);
            try {
                if (zzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzfw.zza(str));
                }
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error storing filter results. appId", zzfw.zza(str), e);
            }
        }
        return arrayList;
    }

    zzu(zznc zzncVar) {
        super(zzncVar);
    }

    private final void zza(List<zzfn.zzf> list, boolean z) {
        ArrayMap arrayMap;
        zzy zzyVar;
        zzaz zzazVar;
        zzx zzxVar;
        if (list.isEmpty()) {
            return;
        }
        zzx zzxVar2 = null;
        zzy zzyVar2 = new zzy(this);
        ArrayMap arrayMap2 = new ArrayMap();
        for (zzfn.zzf zzfVar : list) {
            zzfn.zzf zza = zzyVar2.zza(this.zza, zzfVar);
            if (zza != null) {
                zzal zzh = zzh();
                String str = this.zza;
                String zzg = zza.zzg();
                zzaz zzd = zzh.zzd(str, zzfVar.zzg());
                if (zzd == null) {
                    zzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzfw.zza(str), zzh.zzi().zza(zzg));
                    zzyVar = zzyVar2;
                    arrayMap = arrayMap2;
                    zzazVar = new zzaz(str, zzfVar.zzg(), 1L, 1L, 1L, zzfVar.zzd(), 0L, null, null, null, null);
                } else {
                    arrayMap = arrayMap2;
                    zzyVar = zzyVar2;
                    zzazVar = new zzaz(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                }
                zzh().zza(zzazVar);
                if (com.google.android.gms.internal.measurement.zznk.zza()) {
                    zzxVar = null;
                    if (zze().zzf(null, zzbf.zzcv) && z) {
                        zzxVar2 = null;
                        arrayMap2 = arrayMap;
                        zzyVar2 = zzyVar;
                    }
                } else {
                    zzxVar = null;
                }
                long j = zzazVar.zzc;
                String zzg2 = zza.zzg();
                ArrayMap arrayMap3 = arrayMap;
                Map<Integer, List<zzff.zzb>> map = (Map) arrayMap3.get(zzg2);
                if (map == null) {
                    map = zzh().zzf(this.zza, zzg2);
                    arrayMap3.put(zzg2, map);
                }
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (this.zzb.contains(Integer.valueOf(intValue))) {
                        zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(intValue));
                    } else {
                        Iterator<zzff.zzb> it2 = map.get(Integer.valueOf(intValue)).iterator();
                        boolean z2 = true;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            zzff.zzb next = it2.next();
                            zzaa zzaaVar = new zzaa(this, this.zza, intValue, next);
                            boolean zza2 = zzaaVar.zza(this.zzd, this.zze, zza, j, zzazVar, zza(intValue, next.zzb()));
                            if (zza2) {
                                zza(Integer.valueOf(intValue)).zza(zzaaVar);
                                z2 = zza2;
                            } else {
                                this.zzb.add(Integer.valueOf(intValue));
                                z2 = zza2;
                                break;
                            }
                        }
                        if (!z2) {
                            this.zzb.add(Integer.valueOf(intValue));
                        }
                    }
                }
                zzx zzxVar3 = zzxVar;
                arrayMap2 = arrayMap3;
                zzxVar2 = zzxVar3;
                zzyVar2 = zzyVar;
            } else {
                arrayMap2 = arrayMap2;
                zzxVar2 = zzxVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
    
        r5 = zzj().zzu();
        r7 = com.google.android.gms.measurement.internal.zzfw.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
    
        if (r6.zzi() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        r8 = java.lang.Integer.valueOf(r6.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0130, code lost:
    
        r5.zza("Invalid property filter ID. appId, id", r7, java.lang.String.valueOf(r8));
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(List<zzfn.zzo> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzfn.zzo zzoVar : list) {
            String zzg = zzoVar.zzg();
            Map<Integer, List<zzff.zze>> map = (Map) arrayMap.get(zzg);
            if (map == null) {
                map = zzh().zzg(this.zza, zzg);
                arrayMap.put(zzg, map);
            }
            Iterator<Integer> it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (this.zzb.contains(Integer.valueOf(intValue))) {
                        zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(intValue));
                        break;
                    }
                    Iterator<zzff.zze> it2 = map.get(Integer.valueOf(intValue)).iterator();
                    boolean z = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        zzff.zze next = it2.next();
                        Integer num = null;
                        if (zzj().zza(2)) {
                            zzj().zzp().zza("Evaluating filter. audience, filter, property", Integer.valueOf(intValue), next.zzi() ? Integer.valueOf(next.zza()) : null, zzi().zzc(next.zze()));
                            zzj().zzp().zza("Filter definition", g_().zza(next));
                        }
                        if (!next.zzi() || next.zza() > 256) {
                            break;
                        }
                        zzac zzacVar = new zzac(this, this.zza, intValue, next);
                        z = zzacVar.zza(this.zzd, this.zze, zzoVar, zza(intValue, next.zza()));
                        if (z) {
                            zza(Integer.valueOf(intValue)).zza(zzacVar);
                        } else {
                            this.zzb.add(Integer.valueOf(intValue));
                            break;
                        }
                    }
                    if (!z) {
                        this.zzb.add(Integer.valueOf(intValue));
                    }
                }
            }
        }
    }

    private final boolean zza(int i, int i2) {
        BitSet bitSet;
        zzw zzwVar = this.zzc.get(Integer.valueOf(i));
        if (zzwVar == null) {
            return false;
        }
        bitSet = zzwVar.zzd;
        return bitSet.get(i2);
    }
}

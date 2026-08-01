package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxg extends zzgxk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgxg() {
        super(null);
    }

    /* synthetic */ zzgxg(zzgxf zzgxfVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzgxd zzgxdVar;
        List list = (List) zzgzq.zzh(obj, j);
        if (list.isEmpty()) {
            List zzgxdVar2 = list instanceof zzgxe ? new zzgxd(i) : ((list instanceof zzgyd) && (list instanceof zzgwv)) ? ((zzgwv) list).zzd(i) : new ArrayList(i);
            zzgzq.zzv(obj, j, zzgxdVar2);
            return zzgxdVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzgzq.zzv(obj, j, arrayList);
            zzgxdVar = arrayList;
        } else {
            if (!(list instanceof zzgzl)) {
                if (!(list instanceof zzgyd) || !(list instanceof zzgwv)) {
                    return list;
                }
                zzgwv zzgwvVar = (zzgwv) list;
                if (zzgwvVar.zzc()) {
                    return list;
                }
                zzgwv zzd = zzgwvVar.zzd(list.size() + i);
                zzgzq.zzv(obj, j, zzd);
                return zzd;
            }
            zzgxd zzgxdVar3 = new zzgxd(list.size() + i);
            zzgxdVar3.addAll(zzgxdVar3.size(), (zzgzl) list);
            zzgzq.zzv(obj, j, zzgxdVar3);
            zzgxdVar = zzgxdVar3;
        }
        return zzgxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgzq.zzh(obj, j);
        if (list instanceof zzgxe) {
            unmodifiableList = ((zzgxe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgyd) && (list instanceof zzgwv)) {
                zzgwv zzgwvVar = (zzgwv) list;
                if (zzgwvVar.zzc()) {
                    zzgwvVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgzq.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgzq.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgzq.zzv(obj, j, list);
    }
}

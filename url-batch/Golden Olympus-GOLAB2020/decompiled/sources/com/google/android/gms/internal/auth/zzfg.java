package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzfg extends zzfk {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ zzfg(zzff zzffVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    final void zza(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) zzhi.zzf(obj, j4);
        if (list instanceof zzfe) {
            unmodifiableList = ((zzfe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgd) && (list instanceof zzey)) {
                zzey zzeyVar = (zzey) list;
                if (zzeyVar.zzc()) {
                    zzeyVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhi.zzp(obj, j4, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfk
    final void zzb(Object obj, Object obj2, long j4) {
        zzfd zzfdVar;
        List list = (List) zzhi.zzf(obj2, j4);
        int size = list.size();
        List list2 = (List) zzhi.zzf(obj, j4);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzfe ? new zzfd(size) : ((list2 instanceof zzgd) && (list2 instanceof zzey)) ? ((zzey) list2).zzd(size) : new ArrayList(size);
            zzhi.zzp(obj, j4, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzhi.zzp(obj, j4, arrayList);
                zzfdVar = arrayList;
            } else if (list2 instanceof zzhd) {
                zzfd zzfdVar2 = new zzfd(list2.size() + size);
                zzfdVar2.addAll(zzfdVar2.size(), (zzhd) list2);
                zzhi.zzp(obj, j4, zzfdVar2);
                zzfdVar = zzfdVar2;
            } else if ((list2 instanceof zzgd) && (list2 instanceof zzey)) {
                zzey zzeyVar = (zzey) list2;
                if (!zzeyVar.zzc()) {
                    list2 = zzeyVar.zzd(list2.size() + size);
                    zzhi.zzp(obj, j4, list2);
                }
            }
            list2 = zzfdVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzhi.zzp(obj, j4, list);
    }

    private zzfg() {
        super(null);
    }
}

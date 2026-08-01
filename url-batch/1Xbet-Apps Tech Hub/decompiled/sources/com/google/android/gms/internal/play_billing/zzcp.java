package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
final class zzcp extends zzct {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzcp() {
        super(null);
    }

    /* synthetic */ zzcp(zzco zzcoVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzct
    final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzeq.zzf(obj, j);
        if (list instanceof zzcn) {
            unmodifiableList = ((zzcn) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzdm) && (list instanceof zzcf)) {
                zzcf zzcfVar = (zzcf) list;
                if (zzcfVar.zzc()) {
                    zzcfVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzeq.zzs(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzct
    final void zzb(Object obj, Object obj2, long j) {
        zzcm zzcmVar;
        List list = (List) zzeq.zzf(obj2, j);
        int size = list.size();
        List list2 = (List) zzeq.zzf(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzcn ? new zzcm(size) : ((list2 instanceof zzdm) && (list2 instanceof zzcf)) ? ((zzcf) list2).zzd(size) : new ArrayList(size);
            zzeq.zzs(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzeq.zzs(obj, j, arrayList);
                zzcmVar = arrayList;
            } else if (list2 instanceof zzel) {
                zzcm zzcmVar2 = new zzcm(list2.size() + size);
                zzcmVar2.addAll(zzcmVar2.size(), (zzel) list2);
                zzeq.zzs(obj, j, zzcmVar2);
                zzcmVar = zzcmVar2;
            } else if ((list2 instanceof zzdm) && (list2 instanceof zzcf)) {
                zzcf zzcfVar = (zzcf) list2;
                if (!zzcfVar.zzc()) {
                    list2 = zzcfVar.zzd(list2.size() + size);
                    zzeq.zzs(obj, j, list2);
                }
            }
            list2 = zzcmVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzeq.zzs(obj, j, list);
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhea implements zzhdp {
    private static final zzhdp zza = zzhdq.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    /* synthetic */ zzhea(List list, List list2, zzhdy zzhdyVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzhdz zza(int i, int i2) {
        return new zzhdz(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhec) this.zzc.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzhdm.zza(size);
        int size3 = this.zzb.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((zzhec) this.zzb.get(i2)).zzb();
            zzb.getClass();
            zza2.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                zza2.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}

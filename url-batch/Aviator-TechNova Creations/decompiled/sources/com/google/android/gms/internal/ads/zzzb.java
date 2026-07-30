package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzzb implements Comparator {
    static final /* synthetic */ zzzb zza = new zzzb();

    private /* synthetic */ zzzb() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgts.zzg().zza((zzzz) Collections.max(list2, zzzy.zza), (zzzz) Collections.max(list, zzzt.zza), zzzu.zza).zzb(list2.size(), list.size()).zza((zzzz) Collections.max(list2, zzzv.zza), (zzzz) Collections.max(list, zzzw.zza), zzzx.zza).zze();
    }
}

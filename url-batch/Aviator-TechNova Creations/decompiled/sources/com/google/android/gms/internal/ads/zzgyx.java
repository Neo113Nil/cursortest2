package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgyx extends zzgyz {
    zzgyx(zzgub zzgubVar, boolean z) {
        super(zzgubVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList zzb = zzgvf.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgyy zzgyyVar = (zzgyy) it.next();
            zzb.add(zzgyyVar != null ? zzgyyVar.zza : null);
        }
        return Collections.unmodifiableList(zzb);
    }
}

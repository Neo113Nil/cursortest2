package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgoc extends zzgoe {
    zzgoc(zzgjv zzgjvVar, boolean z) {
        super(zzgjvVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList zzb = zzgkp.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgod zzgodVar = (zzgod) it.next();
            zzb.add(zzgodVar != null ? zzgodVar.zza : null);
        }
        return Collections.unmodifiableList(zzb);
    }
}

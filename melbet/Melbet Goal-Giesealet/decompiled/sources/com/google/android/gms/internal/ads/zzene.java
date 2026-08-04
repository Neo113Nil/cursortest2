package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzene implements zzeup {
    private final Set zza;

    zzene(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgot.zza(new zzend(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 8;
    }
}

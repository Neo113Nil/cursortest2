package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzepi implements zzeuy {
    private final Set zza;

    zzepi(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgbb.zzh(new zzeux() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}

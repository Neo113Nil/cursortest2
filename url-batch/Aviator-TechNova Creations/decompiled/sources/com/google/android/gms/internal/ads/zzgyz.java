package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
abstract class zzgyz extends zzgyq {
    private List zza;

    zzgyz(zzgub zzgubVar, boolean z) {
        super(zzgubVar, z, true);
        List emptyList = zzgubVar.isEmpty() ? Collections.emptyList() : zzgvf.zzb(zzgubVar.size());
        for (int i = 0; i < zzgubVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgyy(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}

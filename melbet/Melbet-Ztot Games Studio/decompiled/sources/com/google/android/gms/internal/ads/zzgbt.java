package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
abstract class zzgbt extends zzgbi {

    @CheckForNull
    private List zza;

    zzgbt(zzfxm zzfxmVar, boolean z) {
        super(zzfxmVar, z, true);
        List emptyList = zzfxmVar.isEmpty() ? Collections.emptyList() : zzfyh.zza(zzfxmVar.size());
        for (int i = 0; i < zzfxmVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgbs(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}

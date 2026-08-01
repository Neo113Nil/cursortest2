package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzctz implements zzejq {
    public final List zza;

    public zzctz(zzctr zzctrVar) {
        this.zza = Collections.singletonList(zzgbb.zzh(zzctrVar));
    }

    public zzctz(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzejq
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgbb.zzr((ListenableFuture) it.next(), new zzcty(this), zzgbr.zzb());
        }
    }
}

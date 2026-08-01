package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeqv implements zzeuy {
    private final zzfas zza;

    zzeqv(zzfas zzfasVar) {
        this.zza = zzfasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        zzfas zzfasVar = this.zza;
        zzeux zzeuxVar = null;
        if (zzfasVar != null && zzfasVar.zza() != null && !zzfasVar.zza().isEmpty()) {
            zzeuxVar = new zzeux() { // from class: com.google.android.gms.internal.ads.zzequ
                @Override // com.google.android.gms.internal.ads.zzeux
                public final void zzj(Object obj) {
                    zzeqv.this.zzc((Bundle) obj);
                }
            };
        }
        return zzgbb.zzh(zzeuxVar);
    }

    final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzepx implements zzeuy {
    private final Executor zza;
    private final zzcaw zzb;

    zzepx(Executor executor, zzcaw zzcawVar) {
        this.zza = executor;
        this.zzb = zzcawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcz)).booleanValue()) {
            return zzgbb.zzh(null);
        }
        zzcaw zzcawVar = this.zzb;
        return zzgbb.zzm(zzcawVar.zzk(), new zzftn() { // from class: com.google.android.gms.internal.ads.zzepw
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzeux() { // from class: com.google.android.gms.internal.ads.zzepv
                    @Override // com.google.android.gms.internal.ads.zzeux
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}

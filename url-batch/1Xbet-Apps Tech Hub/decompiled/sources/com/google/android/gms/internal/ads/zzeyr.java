package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeyr implements zzeuy {
    private final zzgbl zza;

    public zzeyr(zzgbl zzgblVar) {
        this.zza = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzK);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzL)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzcn.zza(str2));
                        }
                    }
                }
                return new zzeys(hashMap);
            }
        });
    }
}

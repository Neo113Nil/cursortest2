package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeok implements zzeuy {
    private final Context zza;

    zzeok(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcH)).booleanValue()) {
            return zzgbb.zzh(new zzeol(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzgbb.zzh(null);
    }
}

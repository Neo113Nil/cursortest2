package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzemg implements zzeup {
    private final Context zza;

    zzemg(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzemh(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 2;
    }
}

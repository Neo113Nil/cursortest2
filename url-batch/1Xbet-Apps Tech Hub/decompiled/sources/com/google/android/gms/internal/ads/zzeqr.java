package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeqr implements zzeuy {
    private final zzgbl zza;
    private final Context zzb;

    zzeqr(zzgbl zzgblVar, Context context) {
        this.zza = zzgblVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqr.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeqs zzc() throws Exception {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkj)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            double intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            r1 = intExtra == 2 || intExtra == 5;
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new zzeqs(d, r1);
    }
}

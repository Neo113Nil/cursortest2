package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzefr {
    private MeasurementManagerFutures zza;
    private final Context zzb;

    zzefr(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        MeasurementManagerFutures from = MeasurementManagerFutures.from(this.zzb);
        this.zza = from;
        return from == null ? zzgbb.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : from.getMeasurementApiStatusAsync();
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        MeasurementManagerFutures measurementManagerFutures = this.zza;
        measurementManagerFutures.getClass();
        return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
    }
}

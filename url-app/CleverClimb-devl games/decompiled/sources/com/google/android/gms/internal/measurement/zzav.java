package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzav {
    private final Context zzwa;
    private final Context zzwb;

    public zzav(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext, "Application context can't be null");
        this.zzwa = applicationContext;
        this.zzwb = applicationContext;
    }

    public final Context getApplicationContext() {
        return this.zzwa;
    }

    public final Context zzci() {
        return this.zzwb;
    }
}

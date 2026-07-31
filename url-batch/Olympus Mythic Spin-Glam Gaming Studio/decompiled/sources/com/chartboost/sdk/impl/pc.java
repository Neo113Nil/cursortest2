package com.chartboost.sdk.impl;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class pc implements ad {
    public final Context a;

    public pc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.chartboost.sdk.impl.ad
    public xc a() {
        int i = this.a.getResources().getConfiguration().orientation;
        if (i == 1) {
            return xc.d;
        }
        if (i != 2) {
            return null;
        }
        return xc.c;
    }

    @Override // com.chartboost.sdk.impl.ad
    public boolean isLocked() {
        return Settings.System.getInt(this.a.getContentResolver(), "accelerometer_rotation", 0) != 0;
    }
}

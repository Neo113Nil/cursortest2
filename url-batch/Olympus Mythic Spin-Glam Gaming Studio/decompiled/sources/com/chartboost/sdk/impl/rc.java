package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class rc implements bd {
    public final AudioManager a;

    public rc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        this.a = systemService instanceof AudioManager ? (AudioManager) systemService : null;
    }

    @Override // com.chartboost.sdk.impl.bd
    public Float a() {
        if (this.a == null) {
            return null;
        }
        return Float.valueOf((r0.getStreamVolume(3) / r0.getStreamMaxVolume(3)) * 100);
    }
}

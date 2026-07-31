package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ph {
    public final SharedPreferences a;

    public ph(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.a = defaultSharedPreferences;
    }

    public final String a() {
        return this.a.getString("IABTCF_TCString", null);
    }
}

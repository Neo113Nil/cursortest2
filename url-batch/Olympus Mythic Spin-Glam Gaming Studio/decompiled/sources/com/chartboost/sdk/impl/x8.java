package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x8 {
    public final SharedPreferences a;

    public x8(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.a = defaultSharedPreferences;
    }

    public final String b() {
        return this.a.getString("IABGPP_HDR_GppString", null);
    }

    public final String a() {
        return this.a.getString("IABGPP_GppSID", null);
    }
}

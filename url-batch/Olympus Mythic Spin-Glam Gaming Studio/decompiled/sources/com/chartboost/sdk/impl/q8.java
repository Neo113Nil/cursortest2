package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract class q8 {
    @NotNull
    public static final <T> List<T> asList(@NotNull JSONArray jSONArray) {
        return r8.a(jSONArray);
    }

    @NotNull
    public static final <T> List<T> asListSkipNull(@NotNull JSONArray jSONArray) {
        return r8.b(jSONArray);
    }

    @NotNull
    public static final PackageInfo getPackageInfoCompat(@NotNull PackageManager packageManager, @NotNull String str, int i) {
        return r8.a(packageManager, str, i);
    }

    @NotNull
    public static final String getPackageVersionName(@NotNull PackageManager packageManager, @NotNull String str) {
        return r8.a(packageManager, str);
    }

    @NotNull
    public static final wh toBodyFields(@NotNull vh vhVar) {
        return r8.a(vhVar);
    }

    @NotNull
    public static final pf toReachabilityBodyFields(@NotNull j3 j3Var) {
        return r8.a(j3Var);
    }
}

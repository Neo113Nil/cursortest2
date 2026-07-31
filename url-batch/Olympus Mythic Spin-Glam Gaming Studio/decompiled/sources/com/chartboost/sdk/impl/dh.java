package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class dh {
    public static final a b = new a(null);
    public final SharedPreferences a;

    public dh(SharedPreferences sharedPrefs) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.a = sharedPrefs;
    }

    public final String a(String sharedPrefsKey) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.a.getString(sharedPrefsKey, null);
        } catch (Exception e) {
            xb.b("Load from shared prefs exception", e);
            return null;
        }
    }

    public final void b(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.a.edit().putBoolean(key, z).apply();
        } catch (Exception e) {
            xb.b("Save boolean to shared prefs exception", e);
        }
    }

    public final boolean a(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.a.getBoolean(key, z);
        } catch (Exception e) {
            xb.b("Load boolean from shared prefs exception", e);
            return z;
        }
    }

    public final void a(String sharedPrefsKey, String str) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e) {
            xb.b("Save to shared prefs exception", e);
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

package com.anythink.core.common.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    private static volatile b f14415f;

    /* renamed from: a, reason: collision with root package name */
    SharedPreferences f14416a;

    /* renamed from: b, reason: collision with root package name */
    final String f14417b = "IABTCF_PurposeConsents";

    /* renamed from: c, reason: collision with root package name */
    final String f14418c = "IABTCF_TCString";

    /* renamed from: d, reason: collision with root package name */
    final String f14419d = "IABTCF_AddtlConsent";

    /* renamed from: e, reason: collision with root package name */
    final String f14420e = "IABTCF_VendorConsents";

    private b(Context context) {
        this.f14416a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static b a(Context context) {
        if (f14415f == null) {
            synchronized (a.class) {
                try {
                    if (f14415f == null) {
                        f14415f = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14415f;
    }

    public final String b() {
        SharedPreferences sharedPreferences = this.f14416a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_TCString", "") : "";
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.f14416a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_AddtlConsent", "") : "";
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.f14416a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_VendorConsents", "") : "";
    }

    public final String a() {
        SharedPreferences sharedPreferences = this.f14416a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_PurposeConsents", "") : "";
    }
}

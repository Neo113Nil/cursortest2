package com.tapjoy.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class o extends m {

    /* renamed from: c, reason: collision with root package name */
    private final String f8509c;

    public o(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
        this.f8509c = null;
    }

    public final String a() {
        return this.f8507a.getString(this.f8508b, this.f8509c);
    }

    public final void a(String str) {
        this.f8507a.edit().putString(this.f8508b, str).apply();
    }

    public final SharedPreferences.Editor a(SharedPreferences.Editor editor, String str) {
        return str != null ? editor.putString(this.f8508b, str) : editor.remove(this.f8508b);
    }
}

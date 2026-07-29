package com.tapjoy.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class h extends m {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8233c;

    public h(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
        this.f8233c = false;
    }

    public final void a(boolean z) {
        this.f8507a.edit().putBoolean(this.f8508b, z).apply();
    }

    public final Boolean a() {
        return Boolean.valueOf(this.f8507a.getBoolean(this.f8508b, this.f8233c));
    }
}

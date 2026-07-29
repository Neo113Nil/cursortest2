package com.tapjoy.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    protected SharedPreferences f8507a;

    /* renamed from: b, reason: collision with root package name */
    protected String f8508b;

    public m(SharedPreferences sharedPreferences, String str) {
        this.f8507a = sharedPreferences;
        this.f8508b = str;
    }

    public final void c() {
        this.f8507a.edit().remove(this.f8508b).apply();
    }
}

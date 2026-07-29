package com.tapjoy.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class k extends m {

    /* renamed from: c, reason: collision with root package name */
    private final int f8481c;

    public k(SharedPreferences sharedPreferences, String str, int i) {
        super(sharedPreferences, str);
        this.f8481c = i;
    }

    public final Integer a() {
        return Integer.valueOf(b());
    }

    public final int b() {
        return this.f8507a.getInt(this.f8508b, this.f8481c);
    }

    public final void a(Integer num) {
        if (num != null) {
            a(num.intValue());
        } else {
            c();
        }
    }

    public final void a(int i) {
        this.f8507a.edit().putInt(this.f8508b, i).apply();
    }

    public final SharedPreferences.Editor a(SharedPreferences.Editor editor, int i) {
        return editor.putInt(this.f8508b, i);
    }
}

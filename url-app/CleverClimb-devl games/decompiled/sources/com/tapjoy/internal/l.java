package com.tapjoy.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class l extends m {

    /* renamed from: c, reason: collision with root package name */
    private final long f8506c;

    public l(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
        this.f8506c = 0L;
    }

    public final long a() {
        return this.f8507a.getLong(this.f8508b, this.f8506c);
    }

    public final void a(long j) {
        this.f8507a.edit().putLong(this.f8508b, j).apply();
    }

    public final SharedPreferences.Editor a(SharedPreferences.Editor editor) {
        return editor.remove(this.f8508b);
    }

    public final SharedPreferences.Editor a(SharedPreferences.Editor editor, long j) {
        return editor.putLong(this.f8508b, j);
    }
}

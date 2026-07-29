package com.tapjoy.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class i extends m {

    /* renamed from: c, reason: collision with root package name */
    private final double f8349c;

    public i(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
        this.f8349c = 0.0d;
    }

    public final double a() {
        String string = this.f8507a.getString(this.f8508b, null);
        if (string != null) {
            try {
                return Double.parseDouble(string);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f8349c;
    }

    public final SharedPreferences.Editor a(SharedPreferences.Editor editor) {
        return editor.remove(this.f8508b);
    }

    public final SharedPreferences.Editor a(SharedPreferences.Editor editor, double d2) {
        return editor.putString(this.f8508b, Double.toString(d2));
    }
}

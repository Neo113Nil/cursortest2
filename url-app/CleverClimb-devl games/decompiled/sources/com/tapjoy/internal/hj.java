package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class hj {

    /* renamed from: a, reason: collision with root package name */
    final o f8283a;

    /* renamed from: b, reason: collision with root package name */
    public final o f8284b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f8285c;

    public hj(Context context) {
        this.f8285c = context.getApplicationContext().getSharedPreferences("fiverocks", 0);
        this.f8283a = new o(this.f8285c, "noMoreToday.date");
        this.f8284b = new o(this.f8285c, "noMoreToday.actionIds");
        b();
    }

    static String a() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }

    public final void b() {
        String a2 = this.f8283a.a();
        if (a2 == null || a().equals(a2)) {
            return;
        }
        this.f8283a.a(null);
        this.f8284b.a(null);
    }
}

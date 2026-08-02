package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Uk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f11061d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11062e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final String f11063f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11064g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f11065h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f11066i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f11067a;

    /* renamed from: b, reason: collision with root package name */
    protected final We f11068b;

    /* renamed from: c, reason: collision with root package name */
    public C0611fb f11069c;

    public Uk(We we, String str) {
        this.f11068b = we;
        this.f11067a = str;
        C0611fb c0611fb = new C0611fb();
        try {
            String h2 = we.h(str);
            if (!TextUtils.isEmpty(h2)) {
                c0611fb = new C0611fb(h2);
            }
        } catch (Throwable unused) {
        }
        this.f11069c = c0611fb;
    }

    public final Uk a(long j4) {
        a(f11065h, Long.valueOf(j4));
        return this;
    }

    public final Uk b(long j4) {
        a(f11062e, Long.valueOf(j4));
        return this;
    }

    public final Long c() {
        return this.f11069c.a(f11065h);
    }

    public final Uk d(long j4) {
        a(f11063f, Long.valueOf(j4));
        return this;
    }

    public final Long e() {
        return this.f11069c.a(f11064g);
    }

    public final Long f() {
        return this.f11069c.a(f11063f);
    }

    public final Long g() {
        return this.f11069c.a(f11061d);
    }

    public final boolean h() {
        return this.f11069c.length() > 0;
    }

    public final Boolean i() {
        C0611fb c0611fb = this.f11069c;
        c0611fb.getClass();
        try {
            return Boolean.valueOf(c0611fb.getBoolean(f11066i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Uk a(boolean z) {
        a(f11066i, Boolean.valueOf(z));
        return this;
    }

    public final void b() {
        this.f11068b.e(this.f11067a, this.f11069c.toString());
        this.f11068b.b();
    }

    public final Uk c(long j4) {
        a(f11064g, Long.valueOf(j4));
        return this;
    }

    public final Long d() {
        return this.f11069c.a(f11062e);
    }

    public final Uk e(long j4) {
        a(f11061d, Long.valueOf(j4));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f11069c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f11069c = new C0611fb();
        b();
    }
}

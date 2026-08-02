package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Zk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6956d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6957e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6958g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6959h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f6960i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f6961a;

    /* renamed from: b, reason: collision with root package name */
    protected final C0390bf f6962b;

    /* renamed from: c, reason: collision with root package name */
    public C0670mb f6963c;

    public Zk(C0390bf c0390bf, String str) {
        this.f6962b = c0390bf;
        this.f6961a = str;
        C0670mb c0670mb = new C0670mb();
        try {
            String h3 = c0390bf.h(str);
            if (!TextUtils.isEmpty(h3)) {
                c0670mb = new C0670mb(h3);
            }
        } catch (Throwable unused) {
        }
        this.f6963c = c0670mb;
    }

    public final Zk a(long j3) {
        a(f6959h, Long.valueOf(j3));
        return this;
    }

    public final Zk b(long j3) {
        a(f6957e, Long.valueOf(j3));
        return this;
    }

    public final Long c() {
        return this.f6963c.a(f6959h);
    }

    public final Zk d(long j3) {
        a(f, Long.valueOf(j3));
        return this;
    }

    public final Long e() {
        return this.f6963c.a(f6958g);
    }

    public final Long f() {
        return this.f6963c.a(f);
    }

    public final Long g() {
        return this.f6963c.a(f6956d);
    }

    public final boolean h() {
        return this.f6963c.length() > 0;
    }

    public final Boolean i() {
        C0670mb c0670mb = this.f6963c;
        c0670mb.getClass();
        try {
            return Boolean.valueOf(c0670mb.getBoolean(f6960i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Zk a(boolean z) {
        a(f6960i, Boolean.valueOf(z));
        return this;
    }

    public final void b() {
        this.f6962b.e(this.f6961a, this.f6963c.toString());
        this.f6962b.b();
    }

    public final Zk c(long j3) {
        a(f6958g, Long.valueOf(j3));
        return this;
    }

    public final Long d() {
        return this.f6963c.a(f6957e);
    }

    public final Zk e(long j3) {
        a(f6956d, Long.valueOf(j3));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f6963c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f6963c = new C0670mb();
        b();
    }
}

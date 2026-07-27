package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618ef extends Fd implements Do {

    /* renamed from: d, reason: collision with root package name */
    public static final C0593df f8132d = new C0593df("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C0593df f8133e = new C0593df("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C0593df f8134f = new C0593df("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0593df f8135g = new C0593df("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C0593df f8136h = new C0593df("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0593df f8137i = new C0593df("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0593df f8138j = new C0593df("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0593df f8139k = new C0593df("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0593df f8140l = new C0593df("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0593df f8141m = new C0593df("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0593df f8142n = new C0593df("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0593df f8143o = new C0593df("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0593df f8144p = new C0593df("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0593df f8145q = new C0593df("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0593df f8146r = new C0593df("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0593df f8147s = new C0593df("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C0618ef(Oa oa) {
        super(oa);
    }

    public final long a(int i2) {
        return this.f7998a.getLong(f8133e.f8043b, i2);
    }

    public final boolean b(boolean z) {
        return this.f7998a.getBoolean(f8134f.f8043b, z);
    }

    public final C0618ef c(boolean z) {
        return (C0618ef) b(f8135g.f8043b, z);
    }

    public final C0618ef d(long j2) {
        return (C0618ef) b(f8133e.f8043b, j2);
    }

    public final boolean e() {
        return this.f7998a.getBoolean(f8132d.f8043b, false);
    }

    public final void f(boolean z) {
        b(f8132d.f8043b, z).b();
    }

    public final C0618ef g() {
        return (C0618ef) b(f8144p.f8043b, true);
    }

    public final C0618ef h() {
        return (C0618ef) b(f8143o.f8043b, true);
    }

    public final boolean i() {
        return this.f7998a.getBoolean(f8143o.f8043b, false);
    }

    public final boolean j() {
        return this.f7998a.getBoolean(f8144p.f8043b, false);
    }

    public final long a(long j2) {
        return this.f7998a.getLong(f8136h.f8043b, j2);
    }

    public final C0618ef b(long j2) {
        return (C0618ef) b(f8136h.f8043b, j2);
    }

    public final C0618ef c(long j2) {
        return (C0618ef) b(f8146r.f8043b, j2);
    }

    public final C0618ef d(boolean z) {
        return (C0618ef) b(f8134f.f8043b, z);
    }

    public final void e(boolean z) {
        b(f8147s.f8043b, z).b();
    }

    public final long f() {
        return this.f7998a.getLong(f8146r.f8043b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        return this.f7998a.getString(f8145q.f8043b, null);
    }

    public final C0618ef b(EnumC0514ae enumC0514ae, int i2) {
        C0593df c0593df;
        int ordinal = enumC0514ae.ordinal();
        if (ordinal == 0) {
            c0593df = f8137i;
        } else if (ordinal != 1) {
            c0593df = ordinal != 2 ? null : f8139k;
        } else {
            c0593df = f8138j;
        }
        return c0593df != null ? (C0618ef) b(c0593df.f8043b, i2) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0567cf
    public final Set<String> c() {
        return this.f7998a.a();
    }

    public final Boolean d() {
        C0593df c0593df = f8135g;
        if (!this.f7998a.a(c0593df.f8043b)) {
            return null;
        }
        return Boolean.valueOf(this.f7998a.getBoolean(c0593df.f8043b, true));
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0593df(str, null).f8043b;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        b(f8145q.f8043b, str).b();
    }

    public final boolean a(boolean z) {
        return this.f7998a.getBoolean(f8147s.f8043b, z);
    }

    public final C0618ef b(EnumC0514ae enumC0514ae, long j2) {
        C0593df c0593df;
        int ordinal = enumC0514ae.ordinal();
        if (ordinal == 0) {
            c0593df = f8140l;
        } else if (ordinal != 1) {
            c0593df = ordinal != 2 ? null : f8142n;
        } else {
            c0593df = f8141m;
        }
        return c0593df != null ? (C0618ef) b(c0593df.f8043b, j2) : this;
    }

    public final int a(EnumC0514ae enumC0514ae, int i2) {
        C0593df c0593df;
        int ordinal = enumC0514ae.ordinal();
        if (ordinal == 0) {
            c0593df = f8137i;
        } else if (ordinal != 1) {
            c0593df = ordinal != 2 ? null : f8139k;
        } else {
            c0593df = f8138j;
        }
        if (c0593df == null) {
            return i2;
        }
        return this.f7998a.getInt(c0593df.f8043b, i2);
    }

    public final long a(EnumC0514ae enumC0514ae, long j2) {
        C0593df c0593df;
        int ordinal = enumC0514ae.ordinal();
        if (ordinal == 0) {
            c0593df = f8140l;
        } else if (ordinal != 1) {
            c0593df = ordinal != 2 ? null : f8142n;
        } else {
            c0593df = f8141m;
        }
        if (c0593df == null) {
            return j2;
        }
        return this.f7998a.getLong(c0593df.f8043b, j2);
    }
}

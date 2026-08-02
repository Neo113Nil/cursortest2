package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467ef extends Fd implements Do {

    /* renamed from: d, reason: collision with root package name */
    public static final C0442df f7267d = new C0442df("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C0442df f7268e = new C0442df("PREF_KEY_OFFSET", null);
    public static final C0442df f = new C0442df("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0442df f7269g = new C0442df("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C0442df f7270h = new C0442df("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0442df f7271i = new C0442df("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0442df f7272j = new C0442df("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0442df f7273k = new C0442df("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0442df f7274l = new C0442df("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0442df f7275m = new C0442df("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0442df f7276n = new C0442df("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final C0442df o = new C0442df("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0442df f7277p = new C0442df("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0442df f7278q = new C0442df("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0442df f7279r = new C0442df("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0442df f7280s = new C0442df("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C0467ef(Oa oa) {
        super(oa);
    }

    public final long a(int i3) {
        return this.f7142a.getLong(f7268e.f7185b, i3);
    }

    public final boolean b(boolean z) {
        return this.f7142a.getBoolean(f.f7185b, z);
    }

    public final C0467ef c(boolean z) {
        return (C0467ef) b(f7269g.f7185b, z);
    }

    public final C0467ef d(long j3) {
        return (C0467ef) b(f7268e.f7185b, j3);
    }

    public final boolean e() {
        return this.f7142a.getBoolean(f7267d.f7185b, false);
    }

    public final void f(boolean z) {
        b(f7267d.f7185b, z).b();
    }

    public final C0467ef g() {
        return (C0467ef) b(f7277p.f7185b, true);
    }

    public final C0467ef h() {
        return (C0467ef) b(o.f7185b, true);
    }

    public final boolean i() {
        return this.f7142a.getBoolean(o.f7185b, false);
    }

    public final boolean j() {
        return this.f7142a.getBoolean(f7277p.f7185b, false);
    }

    public final long a(long j3) {
        return this.f7142a.getLong(f7270h.f7185b, j3);
    }

    public final C0467ef b(long j3) {
        return (C0467ef) b(f7270h.f7185b, j3);
    }

    public final C0467ef c(long j3) {
        return (C0467ef) b(f7279r.f7185b, j3);
    }

    public final C0467ef d(boolean z) {
        return (C0467ef) b(f.f7185b, z);
    }

    public final void e(boolean z) {
        b(f7280s.f7185b, z).b();
    }

    public final long f() {
        return this.f7142a.getLong(f7279r.f7185b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        return this.f7142a.getString(f7278q.f7185b, null);
    }

    public final C0467ef b(EnumC0363ae enumC0363ae, int i3) {
        C0442df c0442df;
        int ordinal = enumC0363ae.ordinal();
        if (ordinal == 0) {
            c0442df = f7271i;
        } else if (ordinal != 1) {
            c0442df = ordinal != 2 ? null : f7273k;
        } else {
            c0442df = f7272j;
        }
        return c0442df != null ? (C0467ef) b(c0442df.f7185b, i3) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0416cf
    public final Set<String> c() {
        return this.f7142a.a();
    }

    public final Boolean d() {
        C0442df c0442df = f7269g;
        if (!this.f7142a.a(c0442df.f7185b)) {
            return null;
        }
        return Boolean.valueOf(this.f7142a.getBoolean(c0442df.f7185b, true));
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0442df(str, null).f7185b;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        b(f7278q.f7185b, str).b();
    }

    public final boolean a(boolean z) {
        return this.f7142a.getBoolean(f7280s.f7185b, z);
    }

    public final C0467ef b(EnumC0363ae enumC0363ae, long j3) {
        C0442df c0442df;
        int ordinal = enumC0363ae.ordinal();
        if (ordinal == 0) {
            c0442df = f7274l;
        } else if (ordinal != 1) {
            c0442df = ordinal != 2 ? null : f7276n;
        } else {
            c0442df = f7275m;
        }
        return c0442df != null ? (C0467ef) b(c0442df.f7185b, j3) : this;
    }

    public final int a(EnumC0363ae enumC0363ae, int i3) {
        C0442df c0442df;
        int ordinal = enumC0363ae.ordinal();
        if (ordinal == 0) {
            c0442df = f7271i;
        } else if (ordinal != 1) {
            c0442df = ordinal != 2 ? null : f7273k;
        } else {
            c0442df = f7272j;
        }
        if (c0442df == null) {
            return i3;
        }
        return this.f7142a.getInt(c0442df.f7185b, i3);
    }

    public final long a(EnumC0363ae enumC0363ae, long j3) {
        C0442df c0442df;
        int ordinal = enumC0363ae.ordinal();
        if (ordinal == 0) {
            c0442df = f7274l;
        } else if (ordinal != 1) {
            c0442df = ordinal != 2 ? null : f7276n;
        } else {
            c0442df = f7275m;
        }
        if (c0442df == null) {
            return j3;
        }
        return this.f7142a.getLong(c0442df.f7185b, j3);
    }
}

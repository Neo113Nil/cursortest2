package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public final class Ze extends AbstractC1105yd implements Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final Ye f11374d = new Ye("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final Ye f11375e = new Ye("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final Ye f11376f = new Ye("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final Ye f11377g = new Ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f11378h = new Ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f11379i = new Ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final Ye f11380j = new Ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f11381k = new Ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f11382l = new Ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f11383m = new Ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final Ye n = new Ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final Ye o = new Ye("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f11384p = new Ye("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ye f11385q = new Ye("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final Ye f11386r = new Ye("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f11387s = new Ye("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public Ze(Ha ha) {
        super(ha);
    }

    public final long a(int i4) {
        return this.f11265a.getLong(f11375e.f11306b, i4);
    }

    public final boolean b(boolean z) {
        return this.f11265a.getBoolean(f11376f.f11306b, z);
    }

    public final Ze c(boolean z) {
        return (Ze) b(f11377g.f11306b, z);
    }

    public final Ze d(long j4) {
        return (Ze) b(f11375e.f11306b, j4);
    }

    public final boolean e() {
        return this.f11265a.getBoolean(f11374d.f11306b, false);
    }

    public final void f(boolean z) {
        b(f11374d.f11306b, z).b();
    }

    public final Ze g() {
        return (Ze) b(f11384p.f11306b, true);
    }

    public final Ze h() {
        return (Ze) b(o.f11306b, true);
    }

    public final boolean i() {
        return this.f11265a.getBoolean(o.f11306b, false);
    }

    public final boolean j() {
        return this.f11265a.getBoolean(f11384p.f11306b, false);
    }

    public final long a(long j4) {
        return this.f11265a.getLong(f11378h.f11306b, j4);
    }

    public final Ze b(long j4) {
        return (Ze) b(f11378h.f11306b, j4);
    }

    public final Ze c(long j4) {
        return (Ze) b(f11386r.f11306b, j4);
    }

    public final Ze d(boolean z) {
        return (Ze) b(f11376f.f11306b, z);
    }

    public final void e(boolean z) {
        b(f11387s.f11306b, z).b();
    }

    public final long f() {
        return this.f11265a.getLong(f11386r.f11306b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        return this.f11265a.getString(f11385q.f11306b, null);
    }

    public final Ze b(Td td, int i4) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f11379i;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f11381k;
        } else {
            ye = f11380j;
        }
        return ye != null ? (Ze) b(ye.f11306b, i4) : this;
    }

    @Override // io.appmetrica.analytics.impl.Xe
    public final Set<String> c() {
        return this.f11265a.a();
    }

    public final Boolean d() {
        Ye ye = f11377g;
        if (!this.f11265a.a(ye.f11306b)) {
            return null;
        }
        return Boolean.valueOf(this.f11265a.getBoolean(ye.f11306b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1105yd
    public final String f(String str) {
        return new Ye(str, null).f11306b;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String str) {
        b(f11385q.f11306b, str).b();
    }

    public final boolean a(boolean z) {
        return this.f11265a.getBoolean(f11387s.f11306b, z);
    }

    public final Ze b(Td td, long j4) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f11382l;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : n;
        } else {
            ye = f11383m;
        }
        return ye != null ? (Ze) b(ye.f11306b, j4) : this;
    }

    public final int a(Td td, int i4) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f11379i;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f11381k;
        } else {
            ye = f11380j;
        }
        if (ye == null) {
            return i4;
        }
        return this.f11265a.getInt(ye.f11306b, i4);
    }

    public final long a(Td td, long j4) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f11382l;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : n;
        } else {
            ye = f11383m;
        }
        if (ye == null) {
            return j4;
        }
        return this.f11265a.getLong(ye.f11306b, j4);
    }
}

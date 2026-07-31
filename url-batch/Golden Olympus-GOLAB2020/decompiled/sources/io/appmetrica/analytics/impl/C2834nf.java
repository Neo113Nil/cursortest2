package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2834nf extends Nd implements InterfaceC3128yo {

    /* renamed from: d, reason: collision with root package name */
    public static final C2808mf f39500d = new C2808mf("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C2808mf f39501e = new C2808mf("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C2808mf f39502f = new C2808mf("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C2808mf f39503g = new C2808mf("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C2808mf f39504h = new C2808mf("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C2808mf f39505i = new C2808mf("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C2808mf f39506j = new C2808mf("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C2808mf f39507k = new C2808mf("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C2808mf f39508l = new C2808mf("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C2808mf f39509m = new C2808mf("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C2808mf f39510n = new C2808mf("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C2808mf f39511o = new C2808mf("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C2808mf f39512p = new C2808mf("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C2808mf f39513q = new C2808mf("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C2808mf f39514r = new C2808mf("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C2808mf f39515s = new C2808mf("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C2834nf(InterfaceC2542cb interfaceC2542cb) {
        super(interfaceC2542cb);
    }

    public final long a(int i4) {
        return this.f39400a.getLong(f39501e.f39447b, i4);
    }

    public final boolean b(boolean z4) {
        return this.f39400a.getBoolean(f39502f.f39447b, z4);
    }

    public final C2834nf c(boolean z4) {
        return (C2834nf) b(f39503g.f39447b, z4);
    }

    public final C2834nf d(long j4) {
        return (C2834nf) b(f39501e.f39447b, j4);
    }

    public final boolean e() {
        return this.f39400a.getBoolean(f39500d.f39447b, false);
    }

    public final void f(boolean z4) {
        b(f39500d.f39447b, z4).b();
    }

    public final C2834nf g() {
        return (C2834nf) b(f39512p.f39447b, true);
    }

    public final C2834nf h() {
        return (C2834nf) b(f39511o.f39447b, true);
    }

    public final boolean i() {
        return this.f39400a.getBoolean(f39511o.f39447b, false);
    }

    public final boolean j() {
        return this.f39400a.getBoolean(f39512p.f39447b, false);
    }

    public final long a(long j4) {
        return this.f39400a.getLong(f39504h.f39447b, j4);
    }

    public final C2834nf b(long j4) {
        return (C2834nf) b(f39504h.f39447b, j4);
    }

    public final C2834nf c(long j4) {
        return (C2834nf) b(f39514r.f39447b, j4);
    }

    public final C2834nf d(boolean z4) {
        return (C2834nf) b(f39502f.f39447b, z4);
    }

    public final void e(boolean z4) {
        b(f39515s.f39447b, z4).b();
    }

    public final long f() {
        return this.f39400a.getLong(f39514r.f39447b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    public final String a() {
        return this.f39400a.getString(f39513q.f39447b, null);
    }

    public final C2834nf b(@NonNull EnumC2704ie enumC2704ie, int i4) {
        C2808mf c2808mf;
        int ordinal = enumC2704ie.ordinal();
        if (ordinal == 0) {
            c2808mf = f39505i;
        } else if (ordinal != 1) {
            c2808mf = ordinal != 2 ? null : f39507k;
        } else {
            c2808mf = f39506j;
        }
        return c2808mf != null ? (C2834nf) b(c2808mf.f39447b, i4) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2782lf
    @NonNull
    public final Set<String> c() {
        return this.f39400a.a();
    }

    public final Boolean d() {
        C2808mf c2808mf = f39503g;
        if (!this.f39400a.a(c2808mf.f39447b)) {
            return null;
        }
        return Boolean.valueOf(this.f39400a.getBoolean(c2808mf.f39447b, true));
    }

    @Override // io.appmetrica.analytics.impl.Nd
    @NonNull
    public final String f(@NonNull String str) {
        return new C2808mf(str, null).f39447b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    public final void a(@NonNull String str) {
        b(f39513q.f39447b, str).b();
    }

    public final boolean a(boolean z4) {
        return this.f39400a.getBoolean(f39515s.f39447b, z4);
    }

    public final C2834nf b(@NonNull EnumC2704ie enumC2704ie, long j4) {
        C2808mf c2808mf;
        int ordinal = enumC2704ie.ordinal();
        if (ordinal == 0) {
            c2808mf = f39508l;
        } else if (ordinal != 1) {
            c2808mf = ordinal != 2 ? null : f39510n;
        } else {
            c2808mf = f39509m;
        }
        return c2808mf != null ? (C2834nf) b(c2808mf.f39447b, j4) : this;
    }

    public final int a(@NonNull EnumC2704ie enumC2704ie, int i4) {
        C2808mf c2808mf;
        int ordinal = enumC2704ie.ordinal();
        if (ordinal == 0) {
            c2808mf = f39505i;
        } else if (ordinal != 1) {
            c2808mf = ordinal != 2 ? null : f39507k;
        } else {
            c2808mf = f39506j;
        }
        if (c2808mf == null) {
            return i4;
        }
        return this.f39400a.getInt(c2808mf.f39447b, i4);
    }

    public final long a(@NonNull EnumC2704ie enumC2704ie, long j4) {
        C2808mf c2808mf;
        int ordinal = enumC2704ie.ordinal();
        if (ordinal == 0) {
            c2808mf = f39508l;
        } else if (ordinal != 1) {
            c2808mf = ordinal != 2 ? null : f39510n;
        } else {
            c2808mf = f39509m;
        }
        if (c2808mf == null) {
            return j4;
        }
        return this.f39400a.getLong(c2808mf.f39447b, j4);
    }
}

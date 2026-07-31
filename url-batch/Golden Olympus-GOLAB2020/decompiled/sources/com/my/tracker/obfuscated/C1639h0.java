package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

/* renamed from: com.my.tracker.obfuscated.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1639h0 {

    /* renamed from: l, reason: collision with root package name */
    private static volatile C1639h0 f21348l;

    /* renamed from: a, reason: collision with root package name */
    private final C1638h f21349a = new C1638h();

    /* renamed from: b, reason: collision with root package name */
    private final C1710z0 f21350b = new C1710z0();

    /* renamed from: c, reason: collision with root package name */
    private final C1612b0 f21351c = new C1612b0();

    /* renamed from: d, reason: collision with root package name */
    private final C1659m0 f21352d = new C1659m0();

    /* renamed from: e, reason: collision with root package name */
    private final C1694v0 f21353e = new C1694v0();

    /* renamed from: f, reason: collision with root package name */
    private final C1648j1 f21354f = new C1648j1();

    /* renamed from: g, reason: collision with root package name */
    private final C1613b1 f21355g = new C1613b1();

    /* renamed from: h, reason: collision with root package name */
    private final C1650k f21356h = new C1650k();

    /* renamed from: i, reason: collision with root package name */
    private final C1627e0 f21357i = new C1627e0();

    /* renamed from: j, reason: collision with root package name */
    private final C1670p f21358j = new C1670p();

    /* renamed from: k, reason: collision with root package name */
    private final C1647j0 f21359k = new C1647j0();

    private C1639h0() {
    }

    public C1635g0 a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z4, int i4, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        return new C1635g0(this.f21349a.a(context), this.f21350b.a(str, okHttpClientProvider), this.f21351c.a(context), this.f21352d.a(context), this.f21353e.a(context), this.f21354f.a(context), this.f21355g.a(i4, context), this.f21356h.a(installedPackagesProvider, context), z4 ? this.f21357i.b(context) : C1622d0.f21175c, this.f21358j.a(context), this.f21359k.a(context));
    }

    public static C1639h0 a() {
        C1639h0 c1639h0;
        C1639h0 c1639h02 = f21348l;
        if (c1639h02 != null) {
            return c1639h02;
        }
        synchronized (C1639h0.class) {
            try {
                c1639h0 = f21348l;
                if (c1639h0 == null) {
                    c1639h0 = new C1639h0();
                    f21348l = c1639h0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1639h0;
    }
}

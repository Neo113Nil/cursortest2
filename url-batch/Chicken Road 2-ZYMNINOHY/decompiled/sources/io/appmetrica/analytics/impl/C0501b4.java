package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import w3.AbstractC1510g;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501b4 {

    /* renamed from: w, reason: collision with root package name */
    public static volatile C0501b4 f11454w;

    /* renamed from: a, reason: collision with root package name */
    public final C0916r6 f11455a;

    /* renamed from: b, reason: collision with root package name */
    public final D7 f11456b;

    /* renamed from: c, reason: collision with root package name */
    public final R3 f11457c;

    /* renamed from: d, reason: collision with root package name */
    public final F1 f11458d;

    /* renamed from: e, reason: collision with root package name */
    public final C0832o f11459e;

    /* renamed from: f, reason: collision with root package name */
    public final Wk f11460f;

    /* renamed from: g, reason: collision with root package name */
    public final E5 f11461g;

    /* renamed from: h, reason: collision with root package name */
    public final C0780m f11462h;

    /* renamed from: i, reason: collision with root package name */
    public final C0804mn f11463i;

    /* renamed from: j, reason: collision with root package name */
    public C1027vd f11464j;

    /* renamed from: k, reason: collision with root package name */
    public final C0910r0 f11465k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Y3 f11466l;

    /* renamed from: m, reason: collision with root package name */
    public final Sc f11467m;
    public volatile Ve n;
    public C0516bj o;

    /* renamed from: p, reason: collision with root package name */
    public final C1118z0 f11468p;

    /* renamed from: q, reason: collision with root package name */
    public final K1 f11469q;

    /* renamed from: r, reason: collision with root package name */
    public final C0533ca f11470r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0497b0 f11471s;

    /* renamed from: t, reason: collision with root package name */
    public volatile M9 f11472t;

    /* renamed from: u, reason: collision with root package name */
    public volatile G7 f11473u;
    public volatile C0527c4 v;

    public C0501b4(C0916r6 c0916r6, C0832o c0832o, R3 r32) {
        this(c0916r6, c0832o, r32, new C0780m(c0832o));
    }

    public static C0501b4 l() {
        if (f11454w == null) {
            synchronized (C0501b4.class) {
                try {
                    if (f11454w == null) {
                        f11454w = new C0501b4(new C0916r6(), new C0832o(), new R3());
                    }
                } finally {
                }
            }
        }
        return f11454w;
    }

    public final C0832o a() {
        return this.f11459e;
    }

    public final Ve b(Context context) {
        Ve ve;
        Ve ve2 = this.n;
        if (ve2 != null) {
            return ve2;
        }
        synchronized (this) {
            try {
                ve = this.n;
                if (ve == null) {
                    ve = new Ve(c(context).a(context));
                    this.n = ve;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ve;
    }

    public final C0910r0 c() {
        return this.f11465k;
    }

    public final C1118z0 d() {
        return this.f11468p;
    }

    public final F1 e() {
        return this.f11458d;
    }

    public final K1 f() {
        return this.f11469q;
    }

    public final R3 g() {
        return this.f11457c;
    }

    public final E5 h() {
        return this.f11461g;
    }

    public final C0916r6 i() {
        return this.f11455a;
    }

    public final D7 j() {
        return this.f11456b;
    }

    public final C0533ca k() {
        return this.f11470r;
    }

    public final Y3 m() {
        Y3 y32;
        Y3 y33 = this.f11466l;
        if (y33 != null) {
            return y33;
        }
        synchronized (this) {
            try {
                y32 = this.f11466l;
                if (y32 == null) {
                    y32 = new Y3();
                    this.f11466l = y32;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y32;
    }

    public final C0916r6 n() {
        return this.f11455a;
    }

    public final Wk o() {
        return this.f11460f;
    }

    public C0501b4(C0916r6 c0916r6, C0832o c0832o, R3 r32, C0780m c0780m) {
        this(c0916r6, new D7(), r32, c0780m, new F1(), c0832o, new Wk(c0832o, c0780m), new E5(c0832o), new C0804mn(), new C0910r0());
    }

    public final synchronized C1027vd a(Context context) {
        try {
            if (this.f11464j == null) {
                this.f11464j = new C1027vd(context, new C0805mo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11464j;
    }

    public final C0527c4 c(Context context) {
        C0527c4 c0527c4;
        File file;
        C0527c4 c0527c42 = this.v;
        if (c0527c42 != null) {
            return c0527c42;
        }
        synchronized (this) {
            c0527c4 = this.v;
            if (c0527c4 == null) {
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (AbstractC1510g.j0(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!AbstractC1510g.j0(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    c0527c4 = new C0527c4(file);
                    this.v = c0527c4;
                }
                file = null;
                c0527c4 = new C0527c4(file);
                this.v = c0527c4;
            }
        }
        return c0527c4;
    }

    public C0501b4(C0916r6 c0916r6, D7 d7, R3 r32, C0780m c0780m, F1 f12, C0832o c0832o, Wk wk, E5 e5, C0804mn c0804mn, C0910r0 c0910r0) {
        this.f11467m = new Sc();
        this.f11468p = new C1118z0();
        this.f11469q = new K1();
        this.f11470r = new C0533ca();
        new C7();
        this.f11473u = new G7();
        this.f11455a = c0916r6;
        this.f11456b = d7;
        this.f11457c = r32;
        this.f11462h = c0780m;
        this.f11458d = f12;
        this.f11459e = c0832o;
        this.f11460f = wk;
        this.f11461g = e5;
        this.f11463i = c0804mn;
        this.f11465k = c0910r0;
    }

    public final C0497b0 b() {
        C0497b0 c0497b0;
        C0497b0 c0497b02 = this.f11471s;
        if (c0497b02 != null) {
            return c0497b02;
        }
        synchronized (this) {
            try {
                c0497b0 = this.f11471s;
                if (c0497b0 == null) {
                    c0497b0 = new C0497b0(this.f11468p, this.f11460f, this.f11457c);
                    this.f11471s = c0497b0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0497b0;
    }
}

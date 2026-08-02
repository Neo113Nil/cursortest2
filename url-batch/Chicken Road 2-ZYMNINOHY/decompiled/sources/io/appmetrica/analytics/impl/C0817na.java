package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;
import w3.AbstractC1510g;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817na {

    /* renamed from: I, reason: collision with root package name */
    public static volatile C0817na f12417I;

    /* renamed from: C, reason: collision with root package name */
    public volatile M9 f12420C;

    /* renamed from: H, reason: collision with root package name */
    public C1112yk f12425H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12426a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0771lg f12427b;

    /* renamed from: c, reason: collision with root package name */
    public volatile E6 f12428c;

    /* renamed from: e, reason: collision with root package name */
    public volatile R2 f12430e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0800mj f12431f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U f12432g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0473a2 f12433h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f12434i;

    /* renamed from: j, reason: collision with root package name */
    public volatile C0977tf f12435j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C1121z3 f12436k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Ze f12437l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Ao f12438m;
    public volatile C0593ej n;
    public volatile Fb o;

    /* renamed from: p, reason: collision with root package name */
    public Al f12439p;

    /* renamed from: r, reason: collision with root package name */
    public volatile C1086xk f12441r;

    /* renamed from: w, reason: collision with root package name */
    public volatile Kb f12445w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0856on f12446x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C0983tl f12447y;
    public volatile C1027vd z;

    /* renamed from: q, reason: collision with root package name */
    public final C0791ma f12440q = new C0791ma();

    /* renamed from: s, reason: collision with root package name */
    public final Sc f12442s = new Sc();

    /* renamed from: t, reason: collision with root package name */
    public final Uc f12443t = new Uc();

    /* renamed from: u, reason: collision with root package name */
    public final C0674hm f12444u = new C0674hm();
    public final C0594ek v = new C0594ek();

    /* renamed from: A, reason: collision with root package name */
    public final Od f12418A = new Od();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f12419B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C0801mk f12421D = new C0801mk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f12422E = new ReferenceHolder();

    /* renamed from: F, reason: collision with root package name */
    public final C1060wk f12423F = new C1060wk();

    /* renamed from: G, reason: collision with root package name */
    public final C0702j f12424G = new C0702j();

    /* renamed from: d, reason: collision with root package name */
    public final C0749kk f12429d = new C0749kk();

    public C0817na(Context context) {
        this.f12426a = context;
    }

    public static void a(Context context) {
        if (f12417I == null) {
            synchronized (C0817na.class) {
                try {
                    if (f12417I == null) {
                        f12417I = new C0817na(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C0817na k() {
        return f12417I;
    }

    public final C0674hm A() {
        return this.f12444u;
    }

    public final C1112yk B() {
        C1112yk c1112yk;
        File file;
        C1112yk c1112yk2 = this.f12425H;
        if (c1112yk2 != null) {
            return c1112yk2;
        }
        synchronized (this) {
            c1112yk = this.f12425H;
            if (c1112yk == null) {
                Context context = this.f12426a;
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
                    c1112yk = new C1112yk(file);
                    this.f12425H = c1112yk;
                }
                file = null;
                c1112yk = new C1112yk(file);
                this.f12425H = c1112yk;
            }
        }
        return c1112yk;
    }

    public final C0856on C() {
        C0856on c0856on;
        C0856on c0856on2 = this.f12446x;
        if (c0856on2 != null) {
            return c0856on2;
        }
        synchronized (this) {
            try {
                c0856on = this.f12446x;
                if (c0856on == null) {
                    c0856on = new C0856on(this.f12426a);
                    this.f12446x = c0856on;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0856on;
    }

    public final synchronized Ao D() {
        try {
            if (this.f12438m == null) {
                this.f12438m = new Ao(this.f12426a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12438m;
    }

    public final void E() {
        if (this.f12435j == null) {
            synchronized (this) {
                try {
                    if (this.f12435j == null) {
                        Qm a3 = Pm.a(C0564df.class);
                        Context context = this.f12426a;
                        Rm rm = (Rm) a3;
                        ProtobufStateStorage<Object> a4 = rm.a(context, rm.a(context));
                        C0564df c0564df = (C0564df) a4.read();
                        this.f12435j = new C0977tf(this.f12426a, a4, new C0744kf(), new C0512bf(c0564df), new C0951sf(), new C0718jf(this.f12426a), new C0848of(k().y()), new C0589ef(), c0564df, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C0702j b() {
        return this.f12424G;
    }

    public final U c() {
        U u4;
        U u5 = this.f12432g;
        if (u5 != null) {
            return u5;
        }
        synchronized (this) {
            try {
                u4 = this.f12432g;
                if (u4 == null) {
                    u4 = new U(this.f12426a, this.f12429d.a(), this.f12444u.b());
                    this.f12444u.a(u4);
                    this.f12432g = u4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u4;
    }

    public final C0473a2 d() {
        C0473a2 c0473a2;
        C0473a2 c0473a22 = this.f12433h;
        if (c0473a22 != null) {
            return c0473a22;
        }
        synchronized (this) {
            try {
                c0473a2 = this.f12433h;
                if (c0473a2 == null) {
                    c0473a2 = new C0473a2(this.f12426a, AbstractC0499b2.a());
                    this.f12433h = c0473a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0473a2;
    }

    public final C0628g2 e() {
        return l().f10276b;
    }

    public final C1121z3 f() {
        if (this.f12436k == null) {
            synchronized (this) {
                try {
                    if (this.f12436k == null) {
                        Qm a3 = Pm.a(C0939s3.class);
                        Context context = this.f12426a;
                        Rm rm = (Rm) a3;
                        ProtobufStateStorage<Object> a4 = rm.a(context, rm.a(context));
                        this.f12436k = new C1121z3(this.f12426a, a4, new A3(), new C0810n3(), new D3(), new Ti(this.f12426a), new B3(y()), new C0836o3(), (C0939s3) a4.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f12436k;
    }

    public final Context g() {
        return this.f12426a;
    }

    public final E6 h() {
        if (this.f12428c == null) {
            synchronized (this) {
                try {
                    if (this.f12428c == null) {
                        this.f12428c = new E6(new D6(y()));
                    }
                } finally {
                }
            }
        }
        return this.f12428c;
    }

    public final M9 i() {
        M9 m9;
        M9 m92 = this.f12420C;
        if (m92 != null) {
            return m92;
        }
        synchronized (this) {
            try {
                m9 = this.f12420C;
                if (m9 == null) {
                    m9 = new M9(this.f12426a);
                    this.f12420C = m9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m9;
    }

    public final PermissionExtractor j() {
        C0983tl c0983tl = this.f12447y;
        if (c0983tl != null) {
            return c0983tl;
        }
        synchronized (this) {
            try {
                C0983tl c0983tl2 = this.f12447y;
                if (c0983tl2 != null) {
                    return c0983tl2;
                }
                C0983tl c0983tl3 = new C0983tl(p().f13038c.getAskForPermissionStrategy());
                this.f12447y = c0983tl3;
                return c0983tl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Fb l() {
        Fb fb;
        Fb fb2 = this.o;
        if (fb2 != null) {
            return fb2;
        }
        synchronized (this) {
            try {
                fb = this.o;
                if (fb == null) {
                    fb = new Fb(new O2(this.f12426a, this.f12429d.a()), new C0628g2());
                    this.o = fb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fb;
    }

    public final Kb m() {
        Kb kb;
        Kb kb2 = this.f12445w;
        if (kb2 != null) {
            return kb2;
        }
        synchronized (this) {
            try {
                kb = this.f12445w;
                if (kb == null) {
                    Context context = this.f12426a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    kb = locationClient == null ? new Mb() : new Lb(context, new Sb(), locationClient);
                    this.f12445w = kb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kb;
    }

    public final Kb n() {
        return m();
    }

    public final Uc o() {
        return this.f12443t;
    }

    public final C1086xk p() {
        C1086xk c1086xk;
        C1086xk c1086xk2 = this.f12441r;
        if (c1086xk2 != null) {
            return c1086xk2;
        }
        synchronized (this) {
            try {
                c1086xk = this.f12441r;
                if (c1086xk == null) {
                    c1086xk = new C1086xk();
                    this.f12441r = c1086xk;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1086xk;
    }

    public final C1027vd q() {
        C1027vd c1027vd;
        C1027vd c1027vd2 = this.z;
        if (c1027vd2 != null) {
            return c1027vd2;
        }
        synchronized (this) {
            try {
                c1027vd = this.z;
                if (c1027vd == null) {
                    c1027vd = new C1027vd(this.f12426a, new C0831no());
                    this.z = c1027vd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1027vd;
    }

    public final Od r() {
        return this.f12418A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.f12434i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.f12434i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f12434i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final C0977tf t() {
        E();
        return this.f12435j;
    }

    public final C0771lg u() {
        if (this.f12427b == null) {
            synchronized (this) {
                try {
                    if (this.f12427b == null) {
                        this.f12427b = new C0771lg(this.f12426a, f12417I.D().f10065c);
                    }
                } finally {
                }
            }
        }
        return this.f12427b;
    }

    public final C0593ej v() {
        C0593ej c0593ej;
        C0593ej c0593ej2 = this.n;
        if (c0593ej2 != null) {
            return c0593ej2;
        }
        synchronized (this) {
            try {
                c0593ej = this.n;
                if (c0593ej == null) {
                    c0593ej = new C0593ej(this.f12426a);
                    this.n = c0593ej;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0593ej;
    }

    public final C0749kk w() {
        return this.f12429d;
    }

    public final C1060wk x() {
        return this.f12423F;
    }

    public final Ze y() {
        if (this.f12437l == null) {
            synchronized (this) {
                try {
                    if (this.f12437l == null) {
                        this.f12437l = new Ze(B().d(this.f12426a));
                    }
                } finally {
                }
            }
        }
        return this.f12437l;
    }

    public final synchronized K2 z() {
        try {
            if (this.f12439p == null) {
                Al al = new Al(this.f12426a);
                this.f12439p = al;
                this.f12444u.a(al);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12439p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f12419B.getActivationBarrier();
    }
}

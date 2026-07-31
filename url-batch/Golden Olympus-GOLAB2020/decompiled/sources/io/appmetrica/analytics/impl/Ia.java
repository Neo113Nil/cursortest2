package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* loaded from: classes3.dex */
public final class Ia {

    /* renamed from: F, reason: collision with root package name */
    public static volatile Ia f37730F;

    /* renamed from: C, reason: collision with root package name */
    public volatile C2674ha f37733C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f37736a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C3120yg f37737b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Z6 f37738c;

    /* renamed from: e, reason: collision with root package name */
    public volatile C2587e3 f37740e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C3149zj f37741f;

    /* renamed from: g, reason: collision with root package name */
    public volatile T f37742g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C2640g2 f37743h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f37744i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Hf f37745j;

    /* renamed from: k, reason: collision with root package name */
    public volatile V3 f37746k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C2834nf f37747l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C3102xo f37748m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C2941rj f37749n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C2489ac f37750o;

    /* renamed from: p, reason: collision with root package name */
    public Al f37751p;

    /* renamed from: r, reason: collision with root package name */
    public volatile C3124yk f37753r;

    /* renamed from: w, reason: collision with root package name */
    public volatile InterfaceC2623fc f37758w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C2790ln f37759x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C2995tl f37760y;

    /* renamed from: z, reason: collision with root package name */
    public volatile Kd f37761z;

    /* renamed from: q, reason: collision with root package name */
    public final Ha f37752q = new Ha();

    /* renamed from: s, reason: collision with root package name */
    public final C2832nd f37754s = new C2832nd();

    /* renamed from: t, reason: collision with root package name */
    public final C2884pd f37755t = new C2884pd();

    /* renamed from: u, reason: collision with root package name */
    public final C2686hm f37756u = new C2686hm();

    /* renamed from: v, reason: collision with root package name */
    public final C2813mk f37757v = new C2813mk();

    /* renamed from: A, reason: collision with root package name */
    public final C2572de f37731A = new C2572de();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f37732B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C2994tk f37734D = new C2994tk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f37735E = new ReferenceHolder();

    /* renamed from: d, reason: collision with root package name */
    public final C2942rk f37739d = new C2942rk();

    public Ia(Context context) {
        this.f37736a = context;
    }

    public static void a(Context context) {
        if (f37730F == null) {
            synchronized (Ia.class) {
                try {
                    if (f37730F == null) {
                        f37730F = new Ia(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Ia j() {
        return f37730F;
    }

    public final C2790ln A() {
        C2790ln c2790ln;
        C2790ln c2790ln2 = this.f37759x;
        if (c2790ln2 != null) {
            return c2790ln2;
        }
        synchronized (this) {
            try {
                c2790ln = this.f37759x;
                if (c2790ln == null) {
                    c2790ln = new C2790ln(this.f37736a);
                    this.f37759x = c2790ln;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2790ln;
    }

    public final synchronized C3102xo B() {
        try {
            if (this.f37748m == null) {
                this.f37748m = new C3102xo(this.f37736a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37748m;
    }

    public final void C() {
        if (this.f37745j == null) {
            synchronized (this) {
                try {
                    if (this.f37745j == null) {
                        Rm a4 = Qm.a(C2937rf.class);
                        Context context = this.f37736a;
                        ProtobufStateStorage<Object> a5 = a4.a(context, a4.c(context));
                        C2937rf c2937rf = (C2937rf) a5.read();
                        this.f37745j = new Hf(this.f37736a, a5, new C3119yf(), new C2886pf(c2937rf), new Gf(), new C3093xf(this.f37736a), new Cf(j().x()), new C2963sf(), c2937rf, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final T b() {
        T t4;
        T t5 = this.f37742g;
        if (t5 != null) {
            return t5;
        }
        synchronized (this) {
            try {
                t4 = this.f37742g;
                if (t4 == null) {
                    t4 = new T(this.f37736a, this.f37739d.a(), this.f37756u.b());
                    this.f37756u.a(t4);
                    this.f37742g = t4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t4;
    }

    public final C2640g2 c() {
        C2640g2 c2640g2;
        C2640g2 c2640g22 = this.f37743h;
        if (c2640g22 != null) {
            return c2640g22;
        }
        synchronized (this) {
            try {
                c2640g2 = this.f37743h;
                if (c2640g2 == null) {
                    c2640g2 = new C2640g2(this.f37736a, AbstractC2666h2.a());
                    this.f37743h = c2640g2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2640g2;
    }

    public final C2795m2 d() {
        return k().f38670b;
    }

    public final V3 e() {
        if (this.f37746k == null) {
            synchronized (this) {
                try {
                    if (this.f37746k == null) {
                        Rm a4 = Qm.a(O3.class);
                        Context context = this.f37736a;
                        ProtobufStateStorage<Object> a5 = a4.a(context, a4.c(context));
                        this.f37746k = new V3(this.f37736a, a5, new W3(), new J3(), new Z3(), new C2657gj(this.f37736a), new X3(x()), new K3(), (O3) a5.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f37746k;
    }

    public final Context f() {
        return this.f37736a;
    }

    public final Z6 g() {
        if (this.f37738c == null) {
            synchronized (this) {
                try {
                    if (this.f37738c == null) {
                        this.f37738c = new Z6(new Y6(x()));
                    }
                } finally {
                }
            }
        }
        return this.f37738c;
    }

    public final C2674ha h() {
        C2674ha c2674ha;
        C2674ha c2674ha2 = this.f37733C;
        if (c2674ha2 != null) {
            return c2674ha2;
        }
        synchronized (this) {
            try {
                c2674ha = this.f37733C;
                if (c2674ha == null) {
                    c2674ha = new C2674ha(this.f37736a);
                    this.f37733C = c2674ha;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2674ha;
    }

    public final PermissionExtractor i() {
        C2995tl c2995tl = this.f37760y;
        if (c2995tl != null) {
            return c2995tl;
        }
        synchronized (this) {
            try {
                C2995tl c2995tl2 = this.f37760y;
                if (c2995tl2 != null) {
                    return c2995tl2;
                }
                C2995tl c2995tl3 = new C2995tl(o().f40291c.getAskForPermissionStrategy());
                this.f37760y = c2995tl3;
                return c2995tl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2489ac k() {
        C2489ac c2489ac;
        C2489ac c2489ac2 = this.f37750o;
        if (c2489ac2 != null) {
            return c2489ac2;
        }
        synchronized (this) {
            try {
                c2489ac = this.f37750o;
                if (c2489ac == null) {
                    c2489ac = new C2489ac(new C2507b3(this.f37736a, this.f37739d.a()), new C2795m2());
                    this.f37750o = c2489ac;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2489ac;
    }

    public final InterfaceC2623fc l() {
        InterfaceC2623fc interfaceC2623fc;
        InterfaceC2623fc interfaceC2623fc2 = this.f37758w;
        if (interfaceC2623fc2 != null) {
            return interfaceC2623fc2;
        }
        synchronized (this) {
            try {
                interfaceC2623fc = this.f37758w;
                if (interfaceC2623fc == null) {
                    Context context = this.f37736a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    interfaceC2623fc = locationClient == null ? new C2676hc() : new C2650gc(context, new C2831nc(), locationClient);
                    this.f37758w = interfaceC2623fc;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2623fc;
    }

    public final InterfaceC2623fc m() {
        return l();
    }

    public final C2884pd n() {
        return this.f37755t;
    }

    public final C3124yk o() {
        C3124yk c3124yk;
        C3124yk c3124yk2 = this.f37753r;
        if (c3124yk2 != null) {
            return c3124yk2;
        }
        synchronized (this) {
            try {
                c3124yk = this.f37753r;
                if (c3124yk == null) {
                    c3124yk = new C3124yk();
                    this.f37753r = c3124yk;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3124yk;
    }

    public final Kd p() {
        Kd kd;
        Kd kd2 = this.f37761z;
        if (kd2 != null) {
            return kd2;
        }
        synchronized (this) {
            try {
                kd = this.f37761z;
                if (kd == null) {
                    kd = new Kd(this.f37736a, new C2765ko());
                    this.f37761z = kd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kd;
    }

    public final C2572de q() {
        return this.f37731A;
    }

    public final PlatformIdentifiers r() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.f37744i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.f37744i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(b(), c());
                    this.f37744i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final Hf s() {
        C();
        return this.f37745j;
    }

    public final C3120yg t() {
        if (this.f37737b == null) {
            synchronized (this) {
                try {
                    if (this.f37737b == null) {
                        this.f37737b = new C3120yg(this.f37736a, f37730F.B().f40240c);
                    }
                } finally {
                }
            }
        }
        return this.f37737b;
    }

    public final C2941rj u() {
        C2941rj c2941rj;
        C2941rj c2941rj2 = this.f37749n;
        if (c2941rj2 != null) {
            return c2941rj2;
        }
        synchronized (this) {
            try {
                c2941rj = this.f37749n;
                if (c2941rj == null) {
                    c2941rj = new C2941rj(this.f37736a);
                    this.f37749n = c2941rj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2941rj;
    }

    public final synchronized C3149zj v() {
        return this.f37741f;
    }

    public final C2942rk w() {
        return this.f37739d;
    }

    public final C2834nf x() {
        if (this.f37747l == null) {
            synchronized (this) {
                try {
                    if (this.f37747l == null) {
                        this.f37747l = new C2834nf(C3007u7.a(this.f37736a).c());
                    }
                } finally {
                }
            }
        }
        return this.f37747l;
    }

    public final synchronized X2 y() {
        try {
            if (this.f37751p == null) {
                Al al = new Al(this.f37736a);
                this.f37751p = al;
                this.f37756u.a(al);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37751p;
    }

    public final C2686hm z() {
        return this.f37756u;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f37732B.getActivationBarrier();
    }
}

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

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876ua {

    /* renamed from: H, reason: collision with root package name */
    public static volatile C0876ua f8420H;

    /* renamed from: C, reason: collision with root package name */
    public volatile T9 f8423C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8428a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0779qg f8429b;

    /* renamed from: c, reason: collision with root package name */
    public volatile L6 f8430c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Z2 f8432e;
    public volatile C0807rj f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U f8433g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0583j2 f8434h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f8435i;

    /* renamed from: j, reason: collision with root package name */
    public volatile C0984yf f8436j;

    /* renamed from: k, reason: collision with root package name */
    public volatile H3 f8437k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0467ef f8438l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Co f8439m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0600jj f8440n;
    public volatile Mb o;

    /* renamed from: p, reason: collision with root package name */
    public El f8441p;

    /* renamed from: r, reason: collision with root package name */
    public volatile Ck f8443r;

    /* renamed from: w, reason: collision with root package name */
    public volatile Rb f8447w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0786qn f8448x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C0965xl f8449y;
    public volatile Cd z;

    /* renamed from: q, reason: collision with root package name */
    public final C0850ta f8442q = new C0850ta();

    /* renamed from: s, reason: collision with root package name */
    public final Zc f8444s = new Zc();

    /* renamed from: t, reason: collision with root package name */
    public final C0388bd f8445t = new C0388bd();

    /* renamed from: u, reason: collision with root package name */
    public final C0655lm f8446u = new C0655lm();
    public final C0601jk v = new C0601jk();

    /* renamed from: A, reason: collision with root package name */
    public final Vd f8421A = new Vd();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f8422B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C0783qk f8424D = new C0783qk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f8425E = new ReferenceHolder();

    /* renamed from: F, reason: collision with root package name */
    public final Bk f8426F = new Bk();

    /* renamed from: G, reason: collision with root package name */
    public final C0580j f8427G = new C0580j();

    /* renamed from: d, reason: collision with root package name */
    public final C0731ok f8431d = new C0731ok();

    public C0876ua(Context context) {
        this.f8428a = context;
    }

    public static void a(Context context) {
        if (f8420H == null) {
            synchronized (C0876ua.class) {
                try {
                    if (f8420H == null) {
                        f8420H = new C0876ua(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C0876ua k() {
        return f8420H;
    }

    public final synchronized S2 A() {
        try {
            if (this.f8441p == null) {
                El el = new El(this.f8428a);
                this.f8441p = el;
                this.f8446u.a(el);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8441p;
    }

    public final C0655lm B() {
        return this.f8446u;
    }

    public final C0786qn C() {
        C0786qn c0786qn;
        C0786qn c0786qn2 = this.f8448x;
        if (c0786qn2 != null) {
            return c0786qn2;
        }
        synchronized (this) {
            try {
                c0786qn = this.f8448x;
                if (c0786qn == null) {
                    c0786qn = new C0786qn(this.f8428a);
                    this.f8448x = c0786qn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0786qn;
    }

    public final synchronized Co D() {
        try {
            if (this.f8439m == null) {
                this.f8439m = new Co(this.f8428a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8439m;
    }

    public final void E() {
        if (this.f8436j == null) {
            synchronized (this) {
                try {
                    if (this.f8436j == null) {
                        Um a3 = Tm.a(Cif.class);
                        Context context = this.f8428a;
                        Vm vm = (Vm) a3;
                        ProtobufStateStorage<Object> a4 = vm.a(context, vm.a(context));
                        Cif cif = (Cif) a4.read();
                        this.f8436j = new C0984yf(this.f8428a, a4, new C0752pf(), new C0519gf(cif), new C0959xf(), new C0726of(this.f8428a), new C0855tf(k().z()), new C0596jf(), cif, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C0580j b() {
        return this.f8427G;
    }

    public final U c() {
        U u3;
        U u4 = this.f8433g;
        if (u4 != null) {
            return u4;
        }
        synchronized (this) {
            try {
                u3 = this.f8433g;
                if (u3 == null) {
                    u3 = new U(this.f8428a, this.f8431d.a(), this.f8446u.b());
                    this.f8446u.a(u3);
                    this.f8433g = u3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u3;
    }

    public final C0583j2 d() {
        C0583j2 c0583j2;
        C0583j2 c0583j22 = this.f8434h;
        if (c0583j22 != null) {
            return c0583j22;
        }
        synchronized (this) {
            try {
                c0583j2 = this.f8434h;
                if (c0583j2 == null) {
                    c0583j2 = new C0583j2(this.f8428a, AbstractC0609k2.a());
                    this.f8434h = c0583j2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0583j2;
    }

    public final C0739p2 e() {
        return l().f6329b;
    }

    public final H3 f() {
        if (this.f8437k == null) {
            synchronized (this) {
                try {
                    if (this.f8437k == null) {
                        Um a3 = Tm.a(A3.class);
                        Context context = this.f8428a;
                        Vm vm = (Vm) a3;
                        ProtobufStateStorage<Object> a4 = vm.a(context, vm.a(context));
                        this.f8437k = new H3(this.f8428a, a4, new I3(), new C0895v3(), new L3(), new Yi(this.f8428a), new J3(z()), new C0921w3(), (A3) a4.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f8437k;
    }

    public final Context g() {
        return this.f8428a;
    }

    public final L6 h() {
        if (this.f8430c == null) {
            synchronized (this) {
                try {
                    if (this.f8430c == null) {
                        this.f8430c = new L6(new K6(z()));
                    }
                } finally {
                }
            }
        }
        return this.f8430c;
    }

    public final T9 i() {
        T9 t9;
        T9 t92 = this.f8423C;
        if (t92 != null) {
            return t92;
        }
        synchronized (this) {
            try {
                t9 = this.f8423C;
                if (t9 == null) {
                    t9 = new T9(this.f8428a);
                    this.f8423C = t9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t9;
    }

    public final PermissionExtractor j() {
        C0965xl c0965xl = this.f8449y;
        if (c0965xl != null) {
            return c0965xl;
        }
        synchronized (this) {
            try {
                C0965xl c0965xl2 = this.f8449y;
                if (c0965xl2 != null) {
                    return c0965xl2;
                }
                C0965xl c0965xl3 = new C0965xl(p().f5860c.getAskForPermissionStrategy());
                this.f8449y = c0965xl3;
                return c0965xl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Mb l() {
        Mb mb;
        Mb mb2 = this.o;
        if (mb2 != null) {
            return mb2;
        }
        synchronized (this) {
            try {
                mb = this.o;
                if (mb == null) {
                    mb = new Mb(new W2(this.f8428a, this.f8431d.a()), new C0739p2());
                    this.o = mb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mb;
    }

    public final Rb m() {
        Rb rb;
        Rb rb2 = this.f8447w;
        if (rb2 != null) {
            return rb2;
        }
        synchronized (this) {
            try {
                rb = this.f8447w;
                if (rb == null) {
                    Context context = this.f8428a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    rb = locationClient == null ? new Tb() : new Sb(context, new Zb(), locationClient);
                    this.f8447w = rb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rb;
    }

    public final Rb n() {
        return m();
    }

    public final C0388bd o() {
        return this.f8445t;
    }

    public final Ck p() {
        Ck ck;
        Ck ck2 = this.f8443r;
        if (ck2 != null) {
            return ck2;
        }
        synchronized (this) {
            try {
                ck = this.f8443r;
                if (ck == null) {
                    ck = new Ck();
                    this.f8443r = ck;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ck;
    }

    public final Cd q() {
        Cd cd;
        Cd cd2 = this.z;
        if (cd2 != null) {
            return cd2;
        }
        synchronized (this) {
            try {
                cd = this.z;
                if (cd == null) {
                    cd = new Cd(this.f8428a, new C0761po());
                    this.z = cd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cd;
    }

    public final Vd r() {
        return this.f8421A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.f8435i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.f8435i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f8435i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final C0984yf t() {
        E();
        return this.f8436j;
    }

    public final C0779qg u() {
        if (this.f8429b == null) {
            synchronized (this) {
                try {
                    if (this.f8429b == null) {
                        this.f8429b = new C0779qg(this.f8428a, f8420H.D().f5870c);
                    }
                } finally {
                }
            }
        }
        return this.f8429b;
    }

    public final C0600jj v() {
        C0600jj c0600jj;
        C0600jj c0600jj2 = this.f8440n;
        if (c0600jj2 != null) {
            return c0600jj2;
        }
        synchronized (this) {
            try {
                c0600jj = this.f8440n;
                if (c0600jj == null) {
                    c0600jj = new C0600jj(this.f8428a);
                    this.f8440n = c0600jj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0600jj;
    }

    public final synchronized C0807rj w() {
        return this.f;
    }

    public final C0731ok x() {
        return this.f8431d;
    }

    public final Bk y() {
        return this.f8426F;
    }

    public final C0467ef z() {
        if (this.f8438l == null) {
            synchronized (this) {
                try {
                    if (this.f8438l == null) {
                        this.f8438l = new C0467ef(C0511g7.a(this.f8428a).c());
                    }
                } finally {
                }
            }
        }
        return this.f8438l;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f8422B.getActivationBarrier();
    }
}

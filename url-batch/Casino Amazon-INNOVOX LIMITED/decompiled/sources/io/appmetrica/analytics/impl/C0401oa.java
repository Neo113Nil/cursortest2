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
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0401oa {
    public static volatile C0401oa I;
    public volatile N9 C;
    public C0685zk H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1412a;
    public volatile C0357mg b;
    public volatile F6 c;
    public volatile S2 e;
    public volatile C0385nj f;
    public volatile U g;
    public volatile C0060b2 h;
    public volatile PlatformIdentifiers i;
    public volatile C0555uf j;
    public volatile A3 k;
    public volatile C0047af l;
    public volatile Bo m;
    public volatile C0180fj n;
    public volatile Gb o;
    public Bl p;
    public volatile C0660yk r;
    public volatile Lb w;
    public volatile C0439pn x;
    public volatile C0561ul y;
    public volatile C0603wd z;
    public final C0376na q = new C0376na();
    public final Tc s = new Tc();
    public final Vc t = new Vc();
    public final C0260im u = new C0260im();
    public final C0181fk v = new C0181fk();
    public final Pd A = new Pd();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C0386nk D = new C0386nk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final C0635xk F = new C0635xk();
    public final C0263j G = new C0263j();
    public final C0336lk d = new C0336lk();

    public C0401oa(Context context) {
        this.f1412a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (C0401oa.class) {
                if (I == null) {
                    I = new C0401oa(context.getApplicationContext());
                }
            }
        }
    }

    public static C0401oa k() {
        return I;
    }

    public final C0260im A() {
        return this.u;
    }

    public final C0685zk B() {
        C0685zk c0685zk;
        File file;
        C0685zk c0685zk2 = this.H;
        if (c0685zk2 != null) {
            return c0685zk2;
        }
        synchronized (this) {
            c0685zk = this.H;
            if (c0685zk == null) {
                Context context = this.f1412a;
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (StringsKt.isBlank(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!StringsKt.isBlank(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    c0685zk = new C0685zk(file);
                    this.H = c0685zk;
                }
                file = null;
                c0685zk = new C0685zk(file);
                this.H = c0685zk;
            }
        }
        return c0685zk;
    }

    public final C0439pn C() {
        C0439pn c0439pn;
        C0439pn c0439pn2 = this.x;
        if (c0439pn2 != null) {
            return c0439pn2;
        }
        synchronized (this) {
            c0439pn = this.x;
            if (c0439pn == null) {
                c0439pn = new C0439pn(this.f1412a);
                this.x = c0439pn;
            }
        }
        return c0439pn;
    }

    public final synchronized Bo D() {
        if (this.m == null) {
            this.m = new Bo(this.f1412a);
        }
        return this.m;
    }

    public final void E() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    Rm a2 = Qm.a(C0150ef.class);
                    Context context = this.f1412a;
                    Sm sm = (Sm) a2;
                    ProtobufStateStorage<Object> a3 = sm.a(context, sm.a(context));
                    C0150ef c0150ef = (C0150ef) a3.read();
                    this.j = new C0555uf(this.f1412a, a3, new C0331lf(), new C0099cf(c0150ef), new C0530tf(), new C0305kf(this.f1412a), new C0431pf(k().y()), new C0176ff(), c0150ef, "[PreloadInfoStorage]");
                }
            }
        }
    }

    public final C0263j b() {
        return this.G;
    }

    public final U c() {
        U u;
        U u2 = this.g;
        if (u2 != null) {
            return u2;
        }
        synchronized (this) {
            u = this.g;
            if (u == null) {
                u = new U(this.f1412a, this.d.a(), this.u.b());
                this.u.a(u);
                this.g = u;
            }
        }
        return u;
    }

    public final C0060b2 d() {
        C0060b2 c0060b2;
        C0060b2 c0060b22 = this.h;
        if (c0060b22 != null) {
            return c0060b22;
        }
        synchronized (this) {
            c0060b2 = this.h;
            if (c0060b2 == null) {
                c0060b2 = new C0060b2(this.f1412a, AbstractC0086c2.a());
                this.h = c0060b2;
            }
        }
        return c0060b2;
    }

    public final C0215h2 e() {
        return l().b;
    }

    public final A3 f() {
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    Rm a2 = Qm.a(C0518t3.class);
                    Context context = this.f1412a;
                    Sm sm = (Sm) a2;
                    ProtobufStateStorage<Object> a3 = sm.a(context, sm.a(context));
                    this.k = new A3(this.f1412a, a3, new B3(), new C0394o3(), new E3(), new Ui(this.f1412a), new C3(y()), new C0419p3(), (C0518t3) a3.read(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.k;
    }

    public final Context g() {
        return this.f1412a;
    }

    public final F6 h() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = new F6(new E6(y()));
                }
            }
        }
        return this.c;
    }

    public final N9 i() {
        N9 n9;
        N9 n92 = this.C;
        if (n92 != null) {
            return n92;
        }
        synchronized (this) {
            n9 = this.C;
            if (n9 == null) {
                n9 = new N9(this.f1412a);
                this.C = n9;
            }
        }
        return n9;
    }

    public final PermissionExtractor j() {
        C0561ul c0561ul = this.y;
        if (c0561ul != null) {
            return c0561ul;
        }
        synchronized (this) {
            C0561ul c0561ul2 = this.y;
            if (c0561ul2 != null) {
                return c0561ul2;
            }
            C0561ul c0561ul3 = new C0561ul(p().c.getAskForPermissionStrategy());
            this.y = c0561ul3;
            return c0561ul3;
        }
    }

    public final Gb l() {
        Gb gb;
        Gb gb2 = this.o;
        if (gb2 != null) {
            return gb2;
        }
        synchronized (this) {
            gb = this.o;
            if (gb == null) {
                gb = new Gb(new P2(this.f1412a, this.d.a()), new C0215h2());
                this.o = gb;
            }
        }
        return gb;
    }

    public final Lb m() {
        Lb lb;
        Lb lb2 = this.w;
        if (lb2 != null) {
            return lb2;
        }
        synchronized (this) {
            lb = this.w;
            if (lb == null) {
                Context context = this.f1412a;
                ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                lb = locationClient == null ? new Nb() : new Mb(context, new Tb(), locationClient);
                this.w = lb;
            }
        }
        return lb;
    }

    public final Lb n() {
        return m();
    }

    public final Vc o() {
        return this.t;
    }

    public final C0660yk p() {
        C0660yk c0660yk;
        C0660yk c0660yk2 = this.r;
        if (c0660yk2 != null) {
            return c0660yk2;
        }
        synchronized (this) {
            c0660yk = this.r;
            if (c0660yk == null) {
                c0660yk = new C0660yk();
                this.r = c0660yk;
            }
        }
        return c0660yk;
    }

    public final C0603wd q() {
        C0603wd c0603wd;
        C0603wd c0603wd2 = this.z;
        if (c0603wd2 != null) {
            return c0603wd2;
        }
        synchronized (this) {
            c0603wd = this.z;
            if (c0603wd == null) {
                c0603wd = new C0603wd(this.f1412a, new oo());
                this.z = c0603wd;
            }
        }
        return c0603wd;
    }

    public final Pd r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            platformIdentifiers = this.i;
            if (platformIdentifiers == null) {
                platformIdentifiers = new PlatformIdentifiers(c(), d());
                this.i = platformIdentifiers;
            }
        }
        return platformIdentifiers;
    }

    public final C0555uf t() {
        E();
        return this.j;
    }

    public final C0357mg u() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new C0357mg(this.f1412a, I.D().c);
                }
            }
        }
        return this.b;
    }

    public final C0180fj v() {
        C0180fj c0180fj;
        C0180fj c0180fj2 = this.n;
        if (c0180fj2 != null) {
            return c0180fj2;
        }
        synchronized (this) {
            c0180fj = this.n;
            if (c0180fj == null) {
                c0180fj = new C0180fj(this.f1412a);
                this.n = c0180fj;
            }
        }
        return c0180fj;
    }

    public final C0336lk w() {
        return this.d;
    }

    public final C0635xk x() {
        return this.F;
    }

    public final C0047af y() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    this.l = new C0047af(B().d(this.f1412a));
                }
            }
        }
        return this.l;
    }

    public final synchronized L2 z() {
        if (this.p == null) {
            Bl bl = new Bl(this.f1412a);
            this.p = bl;
            this.u.a(bl);
        }
        return this.p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}

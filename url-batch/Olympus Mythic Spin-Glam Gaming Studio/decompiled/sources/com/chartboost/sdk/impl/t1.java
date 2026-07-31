package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.jk;
import com.chartboost.sdk.impl.rk;
import com.chartboost.sdk.impl.tk;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.internal.Networking.okhttp.OkHttpNetworkClient;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final class t1 implements r1 {
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public final Lazy F;
    public final Lazy G;
    public final Lazy H;
    public final Lazy I;
    public final Lazy J;
    public final Lazy K;
    public final Lazy L;
    public final Lazy M;
    public final m1 a;
    public final u7 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rk.b.values().length];
            try {
                iArr[rk.b.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rk.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class a0 extends Lambda implements Function0 {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zg mo4828invoke() {
            return new zg(t1.this.a.i());
        }
    }

    public static final class b extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function5 {
            public final /* synthetic */ t1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t1 t1Var) {
                super(5);
                this.b = t1Var;
            }

            @Override // kotlin.jvm.functions.Function5
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c1 invoke(Context cxt, SurfaceView s, g1 g1Var, yi h, u8 u8Var) {
                Intrinsics.checkNotNullParameter(cxt, "cxt");
                Intrinsics.checkNotNullParameter(s, "s");
                Intrinsics.checkNotNullParameter(h, "h");
                Intrinsics.checkNotNullParameter(u8Var, "<anonymous parameter 4>");
                return new c1(cxt, null, this.b.A(), s, g1Var, h, this.b.L(), 2, null);
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function5 mo4828invoke() {
            return new a(t1.this);
        }
    }

    public static final class b0 extends Lambda implements Function0 {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rh mo4828invoke() {
            return new rh(t1.this.G(), t1.this.E(), null, 0L, 0, t1.this.I(), 0, 92, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function5 {
            public final /* synthetic */ t1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t1 t1Var) {
                super(5);
                this.b = t1Var;
            }

            @Override // kotlin.jvm.functions.Function5
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e1 invoke(Context context, SurfaceView s, g1 g1Var, yi h, u8 fc) {
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(s, "s");
                Intrinsics.checkNotNullParameter(h, "h");
                Intrinsics.checkNotNullParameter(fc, "fc");
                return new e1(null, s, g1Var, h, this.b.L(), this.b.J(), null, fc, 65, null);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function5 mo4828invoke() {
            return new a(t1.this);
        }
    }

    public static final class c0 extends Lambda implements Function0 {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sh mo4828invoke() {
            return new sh(t1.this.f(), new bc(null, 1, null), null, 4, null);
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1 mo4828invoke() {
            return new j1(t1.this.a.getContext(), t1.this.a.b());
        }
    }

    public static final class d0 extends Lambda implements Function0 {
        public static final d0 b = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final th mo4828invoke() {
            return new th();
        }
    }

    public static final class e extends Lambda implements Function0 {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z3 mo4828invoke() {
            return new z3();
        }
    }

    public static final class e0 extends Lambda implements Function0 {
        public static final e0 b = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vh mo4828invoke() {
            return new vh();
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m6 mo4828invoke() {
            return new m6(t1.this.a.getContext(), t1.this.a.j(), t1.this.a.f());
        }
    }

    public static final class f0 extends Lambda implements Function0 {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ji mo4828invoke() {
            return new ji(t1.this.b());
        }
    }

    public static final class g extends Lambda implements Function0 {
        public final /* synthetic */ x7 b;
        public final /* synthetic */ t1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x7 x7Var, t1 t1Var) {
            super(0);
            this.b = x7Var;
            this.c = t1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a7 mo4828invoke() {
            return new a7(this.b.b(), this.c.h(), this.c.g(), this.c.j(), this.c.b(), this.c.s(), this.c.b);
        }
    }

    public static final class g0 extends Lambda implements Function0 {
        public static final g0 b = new g0();

        public static final class a extends Lambda implements Function4 {
            public static final a b = new a();

            public a() {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final jk invoke(hk va, jk.b l, CoroutineDispatcher d, u8 u8Var) {
                Intrinsics.checkNotNullParameter(va, "va");
                Intrinsics.checkNotNullParameter(l, "l");
                Intrinsics.checkNotNullParameter(d, "d");
                return new jk(va, l, 0.0f, null, u8Var, d, null, 76, null);
            }
        }

        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function4 mo4828invoke() {
            return a.b;
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e7 mo4828invoke() {
            Object obj = t1.this.b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new e7((sg) obj);
        }
    }

    public static final class j extends Lambda implements Function0 {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d8 mo4828invoke() {
            return new d8(null, 1, null);
        }
    }

    public static final class j0 extends Lambda implements Function0 {
        public static final j0 b = new j0();

        public static final class a extends Lambda implements Function3 {
            public static final a b = new a();

            public a() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final uk invoke(g1 g1Var, tk.b vp, yi yiVar) {
                Intrinsics.checkNotNullParameter(vp, "vp");
                Intrinsics.checkNotNullParameter(yiVar, "<anonymous parameter 2>");
                return new uk(g1Var, vp, null, 4, null);
            }
        }

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function3 mo4828invoke() {
            return a.b;
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i8 mo4828invoke() {
            return new i8(t1.this.d());
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u8 mo4828invoke() {
            return new u8(t1.this.a.getContext(), t1.this.b());
        }
    }

    public static final class l0 extends Lambda implements Function0 {
        public final /* synthetic */ x7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(x7 x7Var) {
            super(0);
            this.c = x7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zk mo4828invoke() {
            return new zk(t1.this.g(), t1.this.r(), t1.this.j(), t1.this.h(), t1.this.H(), this.c.b());
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b9 mo4828invoke() {
            return new b9(t1.this.a.getContext());
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y2 mo4828invoke() {
            return new y2(t1.this.a.getContext(), t1.this.a.e(), t1.this.C(), t1.this.a.a(), null, 16, null);
        }
    }

    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k9 mo4828invoke() {
            return new k9(t1.this.B(), t1.this.z(), null, 4, null);
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hb mo4828invoke() {
            PackageManager packageManager = t1.this.a.getContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return new hb(packageManager, null, 2, null);
        }
    }

    public static final class q extends Lambda implements Function0 {
        public static final q b = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpNetworkClient mo4828invoke() {
            return new OkHttpNetworkClient(0L, 0L, 0L, 7, null);
        }
    }

    public static final class r extends Lambda implements Function0 {
        public static final r b = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ud mo4828invoke() {
            return new ud();
        }
    }

    public static final class s extends Lambda implements Function0 {
        public final /* synthetic */ x7 b;
        public final /* synthetic */ t1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(x7 x7Var, t1 t1Var) {
            super(0);
            this.b = x7Var;
            this.c = t1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i3 mo4828invoke() {
            return new i3(this.b.b(), this.c.D(), this.c.j(), this.c.s(), this.c.a.c(), this.b.a(), this.c.b);
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xd mo4828invoke() {
            return new xd(t1.this.a.getContext());
        }
    }

    public static final class u extends Lambda implements Function0 {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ze mo4828invoke() {
            return new ze(t1.this.e(), t1.this.h(), t1.this.g(), t1.this.u(), t1.this.b(), t1.this.b, t1.this.m(), t1.this.k());
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j3 mo4828invoke() {
            return new j3(t1.this.a.getContext());
        }
    }

    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e6 mo4828invoke() {
            return new e6(null, f4.b.g().a(), t1.this.p(), 1, null);
        }
    }

    public static final class y extends Lambda implements Function0 {
        public final /* synthetic */ ef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ef efVar) {
            super(0);
            this.c = efVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hg mo4828invoke() {
            return new hg(t1.this.a.getContext(), t1.this.p(), t1.this.j(), t1.this.b(), t1.this.a.i(), t1.this.s(), t1.this.t(), t1.this.k(), this.c.a(), null, t1.this.n());
        }
    }

    public static final class z extends Lambda implements Function0 {
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ t1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Function1 function1, t1 t1Var) {
            super(0);
            this.b = function1;
            this.c = t1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference mo4828invoke() {
            return new AtomicReference(this.b.invoke(this.c.a));
        }
    }

    public t1(m1 androidComponent, x7 executorComponent, ef privacyComponent, Function1 sdkConfigFactory, final di trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(executorComponent, "executorComponent");
        Intrinsics.checkNotNullParameter(privacyComponent, "privacyComponent");
        Intrinsics.checkNotNullParameter(sdkConfigFactory, "sdkConfigFactory");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.a = androidComponent;
        this.b = new gh(new Supplier() { // from class: com.chartboost.sdk.impl.t1$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return t1.a(di.this);
            }
        });
        this.c = LazyKt.lazy(new u());
        this.d = LazyKt.lazy(q.b);
        this.e = LazyKt.lazy(new v(privacyComponent));
        this.f = LazyKt.lazy(new y(privacyComponent));
        this.g = LazyKt.lazy(new f());
        this.h = LazyKt.lazy(new i());
        this.i = LazyKt.lazy(new h());
        this.j = LazyKt.lazy(new s(executorComponent, this));
        this.k = LazyKt.lazy(e0.b);
        this.l = LazyKt.lazy(new a0());
        this.m = LazyKt.lazy(new w());
        this.n = LazyKt.lazy(new n());
        this.o = LazyKt.lazy(new l());
        this.p = LazyKt.lazy(new z(sdkConfigFactory, this));
        this.q = LazyKt.lazy(r.b);
        this.r = LazyKt.lazy(new g(executorComponent, this));
        this.s = LazyKt.lazy(e.b);
        this.t = LazyKt.lazy(d0.b);
        this.u = LazyKt.lazy(j.b);
        this.v = LazyKt.lazy(new k());
        this.w = LazyKt.lazy(new p());
        this.x = LazyKt.lazy(new i0());
        this.y = LazyKt.lazy(new l0(executorComponent));
        this.z = LazyKt.lazy(new k0());
        this.A = LazyKt.lazy(new h0());
        this.B = LazyKt.lazy(new c());
        this.C = LazyKt.lazy(new b());
        this.D = LazyKt.lazy(j0.b);
        this.E = LazyKt.lazy(g0.b);
        this.F = LazyKt.lazy(new o());
        this.G = LazyKt.lazy(new m());
        this.H = LazyKt.lazy(new d());
        this.I = LazyKt.lazy(new t());
        this.J = LazyKt.lazy(new c0());
        this.K = LazyKt.lazy(new f0());
        this.L = LazyKt.lazy(new b0());
        this.M = LazyKt.lazy(new x());
    }

    public static final p7 a(di trackerComponent) {
        Intrinsics.checkNotNullParameter(trackerComponent, "$trackerComponent");
        return trackerComponent.a();
    }

    @Override // com.chartboost.sdk.impl.r1
    public ze o() {
        return (ze) this.c.getValue();
    }

    public static final class v extends Lambda implements Function0 {
        public final /* synthetic */ ef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ef efVar) {
            super(0);
            this.b = efVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bf mo4828invoke() {
            return this.b.a();
        }
    }

    @Override // com.chartboost.sdk.impl.r1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public hg u() {
        return (hg) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public m6 n() {
        return (m6) this.g.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public EndpointRepository m() {
        return (EndpointRepository) this.h.getValue();
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b6 mo4828invoke() {
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
            u6 u6Var = new u6(p4.a(), Dispatchers.getIO(), null, 4, null);
            zd zdVar = new zd(new OkHttpClient(), Dispatchers.getIO());
            y5 y5Var = new y5(CoroutineScope);
            return new b6(CoroutineScope, u6Var, zdVar, new z5(u6Var, y5Var, Dispatchers.getIO()), y5Var, Dispatchers.getIO(), new a(t1.this), 52428800L, new b(t1.this));
        }

        public static final class a extends Lambda implements Function0 {
            public final /* synthetic */ t1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t1 t1Var) {
                super(0);
                this.b = t1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long mo4828invoke() {
                return Long.valueOf(((sg) this.b.b().get()).E);
            }
        }

        public static final class b extends Lambda implements Function0 {
            public final /* synthetic */ t1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t1 t1Var) {
                super(0);
                this.b = t1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long mo4828invoke() {
                return Long.valueOf(((sg) this.b.b().get()).F);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.r1
    public b7 i() {
        return (b7) this.i.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public vh s() {
        return (vh) this.k.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public zg k() {
        return (zg) this.l.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public j3 j() {
        return (j3) this.m.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public y2 p() {
        return (y2) this.n.getValue();
    }

    public final ud D() {
        return (ud) this.q.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public z3 t() {
        return (z3) this.s.getValue();
    }

    public th H() {
        return (th) this.t.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public sd f() {
        return (sd) this.d.getValue();
    }

    public i8 A() {
        return (i8) this.v.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public hb v() {
        return (hb) this.w.getValue();
    }

    public static final class i0 extends Lambda implements Function0 {
        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rk.b mo4828invoke() {
            rk.b bVar;
            rk e;
            sg sgVar = (sg) t1.this.b().get();
            if (sgVar == null || (e = sgVar.e()) == null || (bVar = e.h()) == null) {
                bVar = rk.b.d;
            }
            xb.a("Video player type: " + bVar, (Throwable) null, 2, (Object) null);
            return bVar;
        }
    }

    public final rk.b K() {
        return (rk.b) this.x.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public xk w() {
        xk N;
        int i2 = a.a[K().ordinal()];
        if (i2 == 1) {
            N = N();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            N = M();
        }
        xb.a("Video repository: " + N, (Throwable) null, 2, (Object) null);
        return N;
    }

    public final xk N() {
        return (xk) this.y.getValue();
    }

    public final xk M() {
        return (xk) this.z.getValue();
    }

    public static final class k0 extends Lambda implements Function0 {
        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yk mo4828invoke() {
            return new yk(t1.this.r(), t1.this.d(), null, null, 12, null);
        }
    }

    public static final class h0 extends Lambda implements Function0 {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lk mo4828invoke() {
            rk rkVar = new rk(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
            return new lk(rkVar.b(), rkVar.c(), rkVar.d(), rkVar.e(), rkVar.f(), rkVar.g(), rkVar.a(), t1.this.j());
        }
    }

    @Override // com.chartboost.sdk.impl.r1
    public lk r() {
        return (lk) this.A.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public i3 g() {
        return (i3) this.j.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public Function5 l() {
        int i2 = a.a[K().ordinal()];
        if (i2 == 1) {
            return y();
        }
        if (i2 == 2) {
            return x();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Function5 y() {
        return (Function5) this.B.getValue();
    }

    public final Function5 x() {
        return (Function5) this.C.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public u8 h() {
        return (u8) this.o.getValue();
    }

    public final Function3 L() {
        return (Function3) this.D.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public AtomicReference b() {
        return (AtomicReference) this.p.getValue();
    }

    public final Function4 J() {
        return (Function4) this.E.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public a7 e() {
        return (a7) this.r.getValue();
    }

    public final k9 C() {
        return (k9) this.F.getValue();
    }

    public final b9 B() {
        return (b9) this.G.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public b8 d() {
        return (b8) this.u.getValue();
    }

    public final j1 z() {
        return (j1) this.H.getValue();
    }

    public xd E() {
        return (xd) this.I.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public bf a() {
        return (bf) this.e.getValue();
    }

    public sh G() {
        return (sh) this.J.getValue();
    }

    public hi I() {
        return (hi) this.K.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public rh q() {
        return (rh) this.L.getValue();
    }

    @Override // com.chartboost.sdk.impl.r1
    public yf c() {
        return (yf) this.M.getValue();
    }

    public /* synthetic */ t1(m1 m1Var, x7 x7Var, ef efVar, Function1 function1, di diVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(m1Var, x7Var, efVar, (i2 & 8) != 0 ? s1.a : function1, diVar);
    }
}

package r0;

import android.content.Context;
import android.os.Looper;
import r0.k;
import r0.t;
import t1.x;

/* loaded from: classes.dex */
public interface t extends v2 {

    public interface a {
        void B(boolean z6);

        void E(boolean z6);
    }

    public static final class b {
        boolean A;
        boolean B;

        /* renamed from: a, reason: collision with root package name */
        final Context f21012a;

        /* renamed from: b, reason: collision with root package name */
        o2.d f21013b;

        /* renamed from: c, reason: collision with root package name */
        long f21014c;

        /* renamed from: d, reason: collision with root package name */
        l4.o<i3> f21015d;

        /* renamed from: e, reason: collision with root package name */
        l4.o<x.a> f21016e;

        /* renamed from: f, reason: collision with root package name */
        l4.o<m2.c0> f21017f;

        /* renamed from: g, reason: collision with root package name */
        l4.o<y1> f21018g;

        /* renamed from: h, reason: collision with root package name */
        l4.o<n2.f> f21019h;

        /* renamed from: i, reason: collision with root package name */
        l4.f<o2.d, s0.a> f21020i;

        /* renamed from: j, reason: collision with root package name */
        Looper f21021j;

        /* renamed from: k, reason: collision with root package name */
        o2.c0 f21022k;

        /* renamed from: l, reason: collision with root package name */
        t0.e f21023l;

        /* renamed from: m, reason: collision with root package name */
        boolean f21024m;

        /* renamed from: n, reason: collision with root package name */
        int f21025n;

        /* renamed from: o, reason: collision with root package name */
        boolean f21026o;

        /* renamed from: p, reason: collision with root package name */
        boolean f21027p;

        /* renamed from: q, reason: collision with root package name */
        int f21028q;

        /* renamed from: r, reason: collision with root package name */
        int f21029r;

        /* renamed from: s, reason: collision with root package name */
        boolean f21030s;

        /* renamed from: t, reason: collision with root package name */
        j3 f21031t;

        /* renamed from: u, reason: collision with root package name */
        long f21032u;

        /* renamed from: v, reason: collision with root package name */
        long f21033v;

        /* renamed from: w, reason: collision with root package name */
        x1 f21034w;

        /* renamed from: x, reason: collision with root package name */
        long f21035x;

        /* renamed from: y, reason: collision with root package name */
        long f21036y;

        /* renamed from: z, reason: collision with root package name */
        boolean f21037z;

        public b(final Context context) {
            this(context, new l4.o() { // from class: r0.w
                @Override // l4.o
                public final Object get() {
                    i3 h7;
                    h7 = t.b.h(context);
                    return h7;
                }
            }, new l4.o() { // from class: r0.y
                @Override // l4.o
                public final Object get() {
                    x.a i7;
                    i7 = t.b.i(context);
                    return i7;
                }
            });
        }

        private b(final Context context, l4.o<i3> oVar, l4.o<x.a> oVar2) {
            this(context, oVar, oVar2, new l4.o() { // from class: r0.x
                @Override // l4.o
                public final Object get() {
                    m2.c0 j7;
                    j7 = t.b.j(context);
                    return j7;
                }
            }, new l4.o() { // from class: r0.b0
                @Override // l4.o
                public final Object get() {
                    return new l();
                }
            }, new l4.o() { // from class: r0.v
                @Override // l4.o
                public final Object get() {
                    n2.f n7;
                    n7 = n2.s.n(context);
                    return n7;
                }
            }, new l4.f() { // from class: r0.u
                @Override // l4.f
                public final Object apply(Object obj) {
                    return new s0.p1((o2.d) obj);
                }
            });
        }

        private b(Context context, l4.o<i3> oVar, l4.o<x.a> oVar2, l4.o<m2.c0> oVar3, l4.o<y1> oVar4, l4.o<n2.f> oVar5, l4.f<o2.d, s0.a> fVar) {
            this.f21012a = context;
            this.f21015d = oVar;
            this.f21016e = oVar2;
            this.f21017f = oVar3;
            this.f21018g = oVar4;
            this.f21019h = oVar5;
            this.f21020i = fVar;
            this.f21021j = o2.m0.Q();
            this.f21023l = t0.e.f21706l;
            this.f21025n = 0;
            this.f21028q = 1;
            this.f21029r = 0;
            this.f21030s = true;
            this.f21031t = j3.f20707g;
            this.f21032u = 5000L;
            this.f21033v = 15000L;
            this.f21034w = new k.b().a();
            this.f21013b = o2.d.f19699a;
            this.f21035x = 500L;
            this.f21036y = 2000L;
            this.A = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ i3 h(Context context) {
            return new n(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ x.a i(Context context) {
            return new t1.m(context, new w0.i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ m2.c0 j(Context context) {
            return new m2.m(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ y1 l(y1 y1Var) {
            return y1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ i3 m(i3 i3Var) {
            return i3Var;
        }

        public t g() {
            o2.a.f(!this.B);
            this.B = true;
            return new c1(this, null);
        }

        public b n(x1 x1Var) {
            o2.a.f(!this.B);
            this.f21034w = x1Var;
            return this;
        }

        public b o(final y1 y1Var) {
            o2.a.f(!this.B);
            this.f21018g = new l4.o() { // from class: r0.z
                @Override // l4.o
                public final Object get() {
                    y1 l7;
                    l7 = t.b.l(y1.this);
                    return l7;
                }
            };
            return this;
        }

        public b p(final i3 i3Var) {
            o2.a.f(!this.B);
            this.f21015d = new l4.o() { // from class: r0.a0
                @Override // l4.o
                public final Object get() {
                    i3 m7;
                    m7 = t.b.m(i3.this);
                    return m7;
                }
            };
            return this;
        }
    }

    void F(t0.e eVar, boolean z6);

    int J();

    void M(t1.x xVar);

    void f(boolean z6);

    s1 t();

    void w(boolean z6);
}

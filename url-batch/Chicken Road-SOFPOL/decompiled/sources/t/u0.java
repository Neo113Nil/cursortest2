package t;

import m0.e1;
import r.s1;
import u.y0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 implements y0 {
    public static final a0.a0 i = new a0.a0(21, new g2.v(11), new s1(14));

    /* renamed from: a, reason: collision with root package name */
    public final e1 f6867a;

    /* renamed from: e, reason: collision with root package name */
    public float f6871e;

    /* renamed from: g, reason: collision with root package name */
    public final m0.e0 f6873g;

    /* renamed from: h, reason: collision with root package name */
    public final m0.e0 f6874h;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f6868b = new e1(0);

    /* renamed from: c, reason: collision with root package name */
    public final v.j f6869c = new v.j();

    /* renamed from: d, reason: collision with root package name */
    public final e1 f6870d = new e1(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final l.r f6872f = new l.r(new a0.t(21, this));

    public u0(int i8) {
        this.f6867a = new e1(i8);
        final int i9 = 0;
        this.f6873g = m0.b.n(new p6.a(this) { // from class: t.t0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u0 f6859e;

            {
                this.f6859e = this;
            }

            @Override // p6.a
            public final Object b() {
                switch (i9) {
                    case 0:
                        u0 u0Var = this.f6859e;
                        return Boolean.valueOf(u0Var.f6867a.g() < u0Var.f6870d.g());
                    default:
                        return Boolean.valueOf(this.f6859e.f6867a.g() > 0);
                }
            }
        });
        final int i10 = 1;
        this.f6874h = m0.b.n(new p6.a(this) { // from class: t.t0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u0 f6859e;

            {
                this.f6859e = this;
            }

            @Override // p6.a
            public final Object b() {
                switch (i10) {
                    case 0:
                        u0 u0Var = this.f6859e;
                        return Boolean.valueOf(u0Var.f6867a.g() < u0Var.f6870d.g());
                    default:
                        return Boolean.valueOf(this.f6859e.f6867a.g() > 0);
                }
            }
        });
    }

    @Override // u.y0
    public final boolean a() {
        return ((Boolean) this.f6874h.getValue()).booleanValue();
    }

    @Override // u.y0
    public final boolean b() {
        return this.f6872f.b();
    }

    @Override // u.y0
    public final Object c(j0 j0Var, p6.e eVar, i6.c cVar) {
        Object c8 = this.f6872f.c(j0Var, eVar, cVar);
        return c8 == h6.a.f3204d ? c8 : c6.m.f1757a;
    }

    @Override // u.y0
    public final boolean d() {
        return ((Boolean) this.f6873g.getValue()).booleanValue();
    }

    @Override // u.y0
    public final float e(float f6) {
        return this.f6872f.e(f6);
    }
}

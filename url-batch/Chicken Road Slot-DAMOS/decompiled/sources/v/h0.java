package v;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import n0.j1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 extends c1.b {
    public static final h G = new h(0.0f);
    public static final h H = new h(1.0f);
    public long A;
    public final s.d0 B;
    public a0 C;
    public final z D;
    public float E;
    public final z F;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f9808e;

    /* renamed from: i, reason: collision with root package name */
    public final j1 f9809i;

    /* renamed from: r, reason: collision with root package name */
    public Object f9810r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f9811s;

    /* renamed from: t, reason: collision with root package name */
    public long f9812t;

    /* renamed from: u, reason: collision with root package name */
    public final a1.b f9813u;

    /* renamed from: v, reason: collision with root package name */
    public b1.b0 f9814v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.f1 f9815w;

    /* renamed from: x, reason: collision with root package name */
    public ge.h f9816x;

    /* renamed from: y, reason: collision with root package name */
    public final oe.c f9817y;

    /* renamed from: z, reason: collision with root package name */
    public final x f9818z;

    /* JADX WARN: Type inference failed for: r3v6, types: [v.z] */
    /* JADX WARN: Type inference failed for: r3v7, types: [v.z] */
    public h0(n4.h hVar) {
        super(3);
        this.f9808e = n0.h.r(hVar);
        this.f9809i = n0.h.r(hVar);
        this.f9810r = hVar;
        this.f9813u = new a1.b(24, this);
        this.f9815w = new n0.f1(0.0f);
        this.f9817y = new oe.c();
        this.f9818z = new x();
        this.A = Long.MIN_VALUE;
        this.B = new s.d0();
        final int i3 = 0;
        this.D = new Function1(this) { // from class: v.z

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h0 f9916e;

            {
                this.f9916e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l10 = (Long) obj;
                switch (i3) {
                    case 0:
                        this.f9916e.A = l10.longValue();
                        break;
                    default:
                        long longValue = l10.longValue();
                        h0 h0Var = this.f9916e;
                        long j = longValue - h0Var.A;
                        h0Var.A = longValue;
                        long b10 = yd.c.b(j / h0Var.E);
                        s.d0 d0Var = h0Var.B;
                        if (d0Var.i()) {
                            Object[] objArr = d0Var.f8284a;
                            int i10 = d0Var.f8285b;
                            int i11 = 0;
                            for (int i12 = 0; i12 < i10; i12++) {
                                a0 a0Var = (a0) objArr[i12];
                                h0.z(a0Var, b10);
                                a0Var.f9726c = true;
                            }
                            z0 z0Var = h0Var.f9811s;
                            if (z0Var != null) {
                                z0Var.o();
                            }
                            int i13 = d0Var.f8285b;
                            Object[] objArr2 = d0Var.f8284a;
                            IntRange f3 = be.f.f(0, i13);
                            int i14 = f3.f5599d;
                            int i15 = f3.f5600e;
                            if (i14 <= i15) {
                                while (true) {
                                    objArr2[i14 - i11] = objArr2[i14];
                                    if (((a0) objArr2[i14]).f9726c) {
                                        i11++;
                                    }
                                    if (i14 != i15) {
                                        i14++;
                                    }
                                }
                            }
                            kotlin.collections.v.i(objArr2, i13 - i11, i13);
                            d0Var.f8285b -= i11;
                        }
                        a0 a0Var2 = h0Var.C;
                        if (a0Var2 != null) {
                            a0Var2.g = h0Var.f9812t;
                            h0.z(a0Var2, b10);
                            h0Var.C(a0Var2.f9727d);
                            if (a0Var2.f9727d == 1.0f) {
                                h0Var.C = null;
                            }
                            h0Var.B();
                        }
                        break;
                }
                return Unit.f5554a;
            }
        };
        final int i10 = 1;
        this.F = new Function1(this) { // from class: v.z

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h0 f9916e;

            {
                this.f9916e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l10 = (Long) obj;
                switch (i10) {
                    case 0:
                        this.f9916e.A = l10.longValue();
                        break;
                    default:
                        long longValue = l10.longValue();
                        h0 h0Var = this.f9916e;
                        long j = longValue - h0Var.A;
                        h0Var.A = longValue;
                        long b10 = yd.c.b(j / h0Var.E);
                        s.d0 d0Var = h0Var.B;
                        if (d0Var.i()) {
                            Object[] objArr = d0Var.f8284a;
                            int i102 = d0Var.f8285b;
                            int i11 = 0;
                            for (int i12 = 0; i12 < i102; i12++) {
                                a0 a0Var = (a0) objArr[i12];
                                h0.z(a0Var, b10);
                                a0Var.f9726c = true;
                            }
                            z0 z0Var = h0Var.f9811s;
                            if (z0Var != null) {
                                z0Var.o();
                            }
                            int i13 = d0Var.f8285b;
                            Object[] objArr2 = d0Var.f8284a;
                            IntRange f3 = be.f.f(0, i13);
                            int i14 = f3.f5599d;
                            int i15 = f3.f5600e;
                            if (i14 <= i15) {
                                while (true) {
                                    objArr2[i14 - i11] = objArr2[i14];
                                    if (((a0) objArr2[i14]).f9726c) {
                                        i11++;
                                    }
                                    if (i14 != i15) {
                                        i14++;
                                    }
                                }
                            }
                            kotlin.collections.v.i(objArr2, i13 - i11, i13);
                            d0Var.f8285b -= i11;
                        }
                        a0 a0Var2 = h0Var.C;
                        if (a0Var2 != null) {
                            a0Var2.g = h0Var.f9812t;
                            h0.z(a0Var2, b10);
                            h0Var.C(a0Var2.f9727d);
                            if (a0Var2.f9727d == 1.0f) {
                                h0Var.C = null;
                            }
                            h0Var.B();
                        }
                        break;
                }
                return Unit.f5554a;
            }
        };
    }

    public static final void t(h0 h0Var) {
        n0.f1 f1Var = h0Var.f9815w;
        z0 z0Var = h0Var.f9811s;
        if (z0Var == null) {
            return;
        }
        a0 a0Var = h0Var.C;
        if (a0Var == null) {
            if (h0Var.f9812t <= 0 || f1Var.h() == 1.0f || Intrinsics.a(h0Var.f9809i.getValue(), h0Var.f9808e.getValue())) {
                a0Var = null;
            } else {
                a0Var = new a0();
                a0Var.f9727d = f1Var.h();
                long j = h0Var.f9812t;
                a0Var.g = j;
                a0Var.f9730h = yd.c.b((1.0d - f1Var.h()) * j);
                a0Var.f9728e.e(0, f1Var.h());
            }
        }
        if (a0Var != null) {
            a0Var.g = h0Var.f9812t;
            h0Var.B.a(a0Var);
            z0Var.m(a0Var);
        }
        h0Var.C = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (n0.h.q(r1.getContext()).s(r11, r1) == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(h0 h0Var, nd.c cVar) {
        c0 c0Var;
        Object obj;
        int i3;
        s.d0 d0Var = h0Var.B;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.f9765i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f9765i = i10 - Integer.MIN_VALUE;
                Object obj2 = c0Var.f9763d;
                obj = md.a.f6622d;
                i3 = c0Var.f9765i;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    if (d0Var.h() && h0Var.C == null) {
                        return Unit.f5554a;
                    }
                    if (c.f(c0Var.getContext()) == 0.0f) {
                        h0Var.y();
                        h0Var.A = Long.MIN_VALUE;
                        return Unit.f5554a;
                    }
                    if (h0Var.A == Long.MIN_VALUE) {
                        z zVar = h0Var.D;
                        c0Var.f9765i = 1;
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj2);
                }
                do {
                    if (d0Var.i() && h0Var.C == null) {
                        h0Var.A = Long.MIN_VALUE;
                        return Unit.f5554a;
                    }
                    c0Var.f9765i = 2;
                } while (h0Var.x(c0Var) != obj);
                return obj;
            }
        }
        c0Var = new c0(h0Var, cVar);
        Object obj22 = c0Var.f9763d;
        obj = md.a.f6622d;
        i3 = c0Var.f9765i;
        if (i3 != 0) {
        }
        do {
            if (d0Var.i()) {
            }
            c0Var.f9765i = 2;
        } while (h0Var.x(c0Var) != obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0.a(r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(h0 h0Var, nd.c cVar) {
        f0 f0Var;
        md.a aVar;
        int i3;
        Object value;
        Object r9;
        Object obj;
        oe.c cVar2 = h0Var.f9817y;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i10 = f0Var.f9795r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f9795r = i10 - Integer.MIN_VALUE;
                Object obj2 = f0Var.f9793e;
                aVar = md.a.f6622d;
                i3 = f0Var.f9795r;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    value = h0Var.f9808e.getValue();
                    f0Var.f9792d = value;
                    f0Var.f9795r = 1;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = f0Var.f9792d;
                        cf.c.M(obj2);
                        if (!Intrinsics.a(obj2, obj)) {
                            return Unit.f5554a;
                        }
                        h0Var.A = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = f0Var.f9792d;
                    cf.c.M(obj2);
                    value = obj3;
                }
                f0Var.f9792d = value;
                f0Var.f9795r = 2;
                ge.h hVar = new ge.h(1, md.f.b(f0Var));
                hVar.s();
                h0Var.f9816x = hVar;
                cVar2.d(null);
                r9 = hVar.r();
                if (r9 != aVar) {
                    obj = value;
                    obj2 = r9;
                    if (!Intrinsics.a(obj2, obj)) {
                    }
                }
                return aVar;
            }
        }
        f0Var = new f0(h0Var, cVar);
        Object obj22 = f0Var.f9793e;
        aVar = md.a.f6622d;
        i3 = f0Var.f9795r;
        if (i3 != 0) {
        }
        f0Var.f9792d = value;
        f0Var.f9795r = 2;
        ge.h hVar2 = new ge.h(1, md.f.b(f0Var));
        hVar2.s();
        h0Var.f9816x = hVar2;
        cVar2.d(null);
        r9 = hVar2.r();
        if (r9 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.a(r1) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(h0 h0Var, nd.c cVar) {
        g0 g0Var;
        int i3;
        Object value;
        Object obj;
        oe.c cVar2 = h0Var.f9817y;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f9806r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f9806r = i10 - Integer.MIN_VALUE;
                Object obj2 = g0Var.f9804e;
                md.a aVar = md.a.f6622d;
                i3 = g0Var.f9806r;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    value = h0Var.f9808e.getValue();
                    g0Var.f9803d = value;
                    g0Var.f9806r = 1;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = g0Var.f9803d;
                        cf.c.M(obj2);
                        if (!Intrinsics.a(obj2, obj)) {
                            h0Var.A = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return Unit.f5554a;
                    }
                    Object obj3 = g0Var.f9803d;
                    cf.c.M(obj2);
                    value = obj3;
                }
                if (!Intrinsics.a(value, h0Var.f9810r)) {
                    cVar2.d(null);
                    return Unit.f5554a;
                }
                g0Var.f9803d = value;
                g0Var.f9806r = 2;
                ge.h hVar = new ge.h(1, md.f.b(g0Var));
                hVar.s();
                h0Var.f9816x = hVar;
                cVar2.d(null);
                Object r9 = hVar.r();
                if (r9 != aVar) {
                    obj = value;
                    obj2 = r9;
                    if (!Intrinsics.a(obj2, obj)) {
                    }
                    return Unit.f5554a;
                }
                return aVar;
            }
        }
        g0Var = new g0(h0Var, cVar);
        Object obj22 = g0Var.f9804e;
        md.a aVar2 = md.a.f6622d;
        i3 = g0Var.f9806r;
        if (i3 != 0) {
        }
        if (!Intrinsics.a(value, h0Var.f9810r)) {
        }
    }

    public static void z(a0 a0Var, long j) {
        long j3 = a0Var.f9724a + j;
        a0Var.f9724a = j3;
        long j10 = a0Var.f9730h;
        if (j3 >= j10) {
            a0Var.f9727d = 1.0f;
            return;
        }
        e1 e1Var = a0Var.f9725b;
        h hVar = a0Var.f9728e;
        if (e1Var == null) {
            float f3 = j3 / j10;
            a0Var.f9727d = (f3 * 1.0f) + ((1 - f3) * hVar.a(0));
            return;
        }
        h hVar2 = a0Var.f9729f;
        if (hVar2 == null) {
            hVar2 = G;
        }
        a0Var.f9727d = be.f.b(((h) e1Var.i(j3, hVar, H, hVar2)).a(0), 0.0f, 1.0f);
    }

    public final Object A(float f3, Object obj, nd.i iVar) {
        if (0.0f > f3 || f3 > 1.0f) {
            y.a("Expecting fraction between 0 and 1. Got " + f3);
        }
        z0 z0Var = this.f9811s;
        if (z0Var == null) {
            return Unit.f5554a;
        }
        Object a9 = x.a(this.f9818z, new e0(obj, this.f9808e.getValue(), this, z0Var, f3, null), iVar);
        return a9 == md.a.f6622d ? a9 : Unit.f5554a;
    }

    public final void B() {
        z0 z0Var = this.f9811s;
        if (z0Var == null) {
            return;
        }
        z0Var.l(yd.c.b(this.f9815w.h() * ((Number) z0Var.f9926l.getValue()).longValue()));
    }

    public final void C(float f3) {
        this.f9815w.i(f3);
    }

    public final void D(b1.b0 b0Var) {
        b1.h hVar;
        if (Intrinsics.a(this.f9814v, b0Var)) {
            return;
        }
        b1.b0 b0Var2 = this.f9814v;
        if (b0Var2 != null) {
            b0Var2.a(this);
        }
        b1.b0 b0Var3 = this.f9814v;
        if (b0Var3 != null && (hVar = b0Var3.f951h) != null) {
            hVar.d();
        }
        this.f9814v = b0Var;
        if (b0Var != null) {
            b0Var.d();
        }
        b1.b0 b0Var4 = this.f9814v;
        if (b0Var4 != null) {
            b0Var4.c(this, c.j, this.f9813u);
        }
    }

    @Override // c1.b
    public final Object l() {
        return this.f9809i.getValue();
    }

    @Override // c1.b
    public final void p(Object obj) {
        this.f9809i.setValue(obj);
    }

    @Override // c1.b
    public final void q(z0 z0Var) {
        z0 z0Var2 = this.f9811s;
        if (z0Var2 != null && !z0Var.equals(z0Var2)) {
            y.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f9811s + ", new instance: " + z0Var);
        }
        this.f9811s = z0Var;
    }

    @Override // c1.b
    public final void r() {
        this.f9811s = null;
        b1.b0 b0Var = this.f9814v;
        if (b0Var != null) {
            b0Var.a(this);
        }
    }

    public final Object x(nd.c cVar) {
        float f3 = c.f(cVar.getContext());
        if (f3 <= 0.0f) {
            y();
            return Unit.f5554a;
        }
        this.E = f3;
        Object s3 = n0.h.q(cVar.getContext()).s(this.F, cVar);
        return s3 == md.a.f6622d ? s3 : Unit.f5554a;
    }

    public final void y() {
        z0 z0Var = this.f9811s;
        if (z0Var != null) {
            z0Var.c();
        }
        this.B.d();
        if (this.C != null) {
            this.C = null;
            C(1.0f);
            B();
        }
    }
}

package m;

import I.C0143d;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import u0.C1121q0;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0620e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0629n f6776a = new C0629n(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C0630o f6777b = new C0630o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C0631p f6778c = new C0631p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C0632q f6779d = new C0632q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C0629n f6780e = new C0629n(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C0630o f6781f = new C0630o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C0631p f6782g = new C0631p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final C0632q f6783h = new C0632q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C0619d a() {
        return new C0619d(Float.valueOf(0.0f), v0.f6899a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003a, blocks: (B:13:0x0036, B:16:0x00d2, B:18:0x00e7), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0628m c0628m, InterfaceC0624i interfaceC0624i, long j3, InterfaceC0424c interfaceC0424c, X1.c cVar) {
        Z z3;
        Z z4;
        W1.a aVar;
        int i3;
        f2.u uVar;
        InterfaceC0424c interfaceC0424c2;
        C0628m c0628m2;
        C0626k c0626k;
        C0626k c0626k2;
        Object obj;
        b0 b0Var;
        InterfaceC0424c interfaceC0424c3;
        InterfaceC0624i interfaceC0624i2;
        C0628m c0628m3 = c0628m;
        InterfaceC0624i interfaceC0624i3 = interfaceC0624i;
        if (cVar instanceof Z) {
            z3 = (Z) cVar;
            int i4 = z3.f6707l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z3.f6707l = i4 - Integer.MIN_VALUE;
                z4 = z3;
                Object obj2 = z4.f6706k;
                aVar = W1.a.f4608d;
                i3 = z4.f6707l;
                if (i3 == 0) {
                    if (i3 == 1) {
                        uVar = z4.f6705j;
                        interfaceC0424c3 = z4.f6704i;
                        interfaceC0624i2 = z4.f6703h;
                        c0628m2 = z4.f6702g;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uVar = z4.f6705j;
                        interfaceC0424c3 = z4.f6704i;
                        interfaceC0624i2 = z4.f6703h;
                        c0628m2 = z4.f6702g;
                    }
                    try {
                        R1.a.e(obj2);
                        interfaceC0424c2 = interfaceC0424c3;
                        interfaceC0624i3 = interfaceC0624i2;
                    } catch (CancellationException e3) {
                        e = e3;
                        c0628m3 = c0628m2;
                        c0626k = (C0626k) uVar.f5832d;
                        if (c0626k != null) {
                            c0626k.f6834i.setValue(Boolean.FALSE);
                        }
                        c0626k2 = (C0626k) uVar.f5832d;
                        if (c0626k2 != null && c0626k2.f6832g == c0628m3.f6851g) {
                            c0628m3.f6853i = false;
                        }
                        throw e;
                    }
                } else {
                    R1.a.e(obj2);
                    Object b3 = interfaceC0624i3.b(0L);
                    r g3 = interfaceC0624i3.g(0L);
                    f2.u uVar2 = new f2.u();
                    V1.i iVar = z4.f4642e;
                    try {
                        if (j3 == Long.MIN_VALUE) {
                            f2.j.c(iVar);
                            a0 a0Var = new a0(uVar2, b3, interfaceC0624i, g3, c0628m, h(iVar), interfaceC0424c);
                            z4.f6702g = c0628m3;
                            z4.f6703h = interfaceC0624i3;
                            interfaceC0424c2 = interfaceC0424c;
                            z4.f6704i = interfaceC0424c2;
                            z4.f6705j = uVar2;
                            z4.f6707l = 1;
                            if (e(interfaceC0624i3, a0Var, z4) == aVar) {
                                return aVar;
                            }
                        } else {
                            interfaceC0424c2 = interfaceC0424c;
                            try {
                                C0626k c0626k3 = new C0626k(b3, interfaceC0624i.d(), g3, j3, interfaceC0624i.e(), j3, new B.H(c0628m3, 2));
                                f2.j.c(iVar);
                                uVar2 = uVar2;
                                g(c0626k3, j3, h(iVar), interfaceC0624i, c0628m, interfaceC0424c);
                                uVar2.f5832d = c0626k3;
                            } catch (CancellationException e4) {
                                e = e4;
                                uVar2 = uVar2;
                                uVar = uVar2;
                                c0626k = (C0626k) uVar.f5832d;
                                if (c0626k != null) {
                                }
                                c0626k2 = (C0626k) uVar.f5832d;
                                if (c0626k2 != null) {
                                    c0628m3.f6853i = false;
                                }
                                throw e;
                            }
                        }
                        c0628m2 = c0628m3;
                        uVar = uVar2;
                    } catch (CancellationException e5) {
                        e = e5;
                    }
                }
                do {
                    obj = uVar.f5832d;
                    f2.j.c(obj);
                    if (((Boolean) ((C0626k) obj).f6834i.getValue()).booleanValue()) {
                        return R1.y.f4171a;
                    }
                    V1.i iVar2 = z4.f4642e;
                    f2.j.c(iVar2);
                    b0Var = new b0(uVar, h(iVar2), interfaceC0624i3, c0628m2, interfaceC0424c2);
                    z4.f6702g = c0628m2;
                    z4.f6703h = interfaceC0624i3;
                    z4.f6704i = interfaceC0424c2;
                    z4.f6705j = uVar;
                    z4.f6707l = 2;
                } while (e(interfaceC0624i3, b0Var, z4) != aVar);
                return aVar;
            }
        }
        z3 = new Z(cVar);
        z4 = z3;
        Object obj22 = z4.f6706k;
        aVar = W1.a.f4608d;
        i3 = z4.f6707l;
        if (i3 == 0) {
        }
        do {
            obj = uVar.f5832d;
            f2.j.c(obj);
            if (((Boolean) ((C0626k) obj).f6834i.getValue()).booleanValue()) {
            }
        } while (e(interfaceC0624i3, b0Var, z4) != aVar);
        return aVar;
    }

    public static Object c(float f3, float f4, t0 t0Var, InterfaceC0426e interfaceC0426e, X1.i iVar, int i3) {
        InterfaceC0640z i4 = (i3 & 8) != 0 ? i(0.0f, null, 7) : t0Var;
        u0 u0Var = v0.f6899a;
        Float f5 = new Float(f3);
        Float f6 = new Float(f4);
        C0629n c0629n = new C0629n(new Float(0.0f).floatValue());
        Object b3 = b(new C0628m(u0Var, f5, c0629n, 56), new d0(i4, u0Var, f5, f6, c0629n), Long.MIN_VALUE, new I.Y(interfaceC0426e), iVar);
        W1.a aVar = W1.a.f4608d;
        R1.y yVar = R1.y.f4171a;
        if (b3 != aVar) {
            b3 = yVar;
        }
        return b3 == aVar ? b3 : yVar;
    }

    public static Object d(C0628m c0628m, Float f3, W w2, X1.i iVar) {
        Object b3 = b(c0628m, new d0(w2, c0628m.f6848d, c0628m.f6849e.getValue(), f3, c0628m.f6850f), c0628m.f6851g, c0.f6735f, iVar);
        return b3 == W1.a.f4608d ? b3 : R1.y.f4171a;
    }

    public static final Object e(InterfaceC0624i interfaceC0624i, InterfaceC0424c interfaceC0424c, Z z3) {
        if (!interfaceC0624i.a()) {
            return C0143d.F(z3.t()).n(new I.Y(3, interfaceC0424c), z3);
        }
        V1.i iVar = z3.f4642e;
        f2.j.c(iVar);
        if (iVar.v(C1121q0.f9440d) != null) {
            throw new ClassCastException();
        }
        f2.j.c(iVar);
        return C0143d.F(iVar).n(interfaceC0424c, z3);
    }

    public static final r f(r rVar) {
        r c2 = rVar.c();
        int b3 = c2.b();
        for (int i3 = 0; i3 < b3; i3++) {
            c2.e(rVar.a(i3), i3);
        }
        return c2;
    }

    public static final void g(C0626k c0626k, long j3, float f3, InterfaceC0624i interfaceC0624i, C0628m c0628m, InterfaceC0424c interfaceC0424c) {
        long c2 = f3 == 0.0f ? interfaceC0624i.c() : (long) ((j3 - c0626k.f6828c) / f3);
        c0626k.f6832g = j3;
        c0626k.f6830e.setValue(interfaceC0624i.b(c2));
        c0626k.f6831f = interfaceC0624i.g(c2);
        if (interfaceC0624i.f(c2)) {
            c0626k.f6833h = c0626k.f6832g;
            c0626k.f6834i.setValue(Boolean.FALSE);
        }
        k(c0626k, c0628m);
        interfaceC0424c.n(c0626k);
    }

    public static final float h(V1.i iVar) {
        U.r rVar = (U.r) iVar.v(U.b.f4476s);
        float s3 = rVar != null ? rVar.s() : 1.0f;
        if (s3 >= 0.0f) {
            return s3;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static W i(float f3, Object obj, int i3) {
        if ((i3 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i3 & 4) != 0) {
            obj = null;
        }
        return new W(1.0f, f3, obj);
    }

    public static t0 j(int i3, int i4, InterfaceC0638x interfaceC0638x, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            interfaceC0638x = AbstractC0639y.f6909a;
        }
        return new t0(i3, i4, interfaceC0638x);
    }

    public static final void k(C0626k c0626k, C0628m c0628m) {
        c0628m.f6849e.setValue(c0626k.f6830e.getValue());
        r rVar = c0628m.f6850f;
        r rVar2 = c0626k.f6831f;
        int b3 = rVar.b();
        for (int i3 = 0; i3 < b3; i3++) {
            rVar.e(rVar2.a(i3), i3);
        }
        c0628m.f6852h = c0626k.f6833h;
        c0628m.f6851g = c0626k.f6832g;
        c0628m.f6853i = ((Boolean) c0626k.f6834i.getValue()).booleanValue();
    }
}

package m;

import I.C0089d;
import java.util.concurrent.CancellationException;
import u0.C0981k0;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0595e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0604n f5714a = new C0604n(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C0605o f5715b = new C0605o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C0606p f5716c = new C0606p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C0607q f5717d = new C0607q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C0604n f5718e = new C0604n(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C0605o f5719f = new C0605o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C0606p f5720g = new C0606p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final C0607q f5721h = new C0607q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C0593d a() {
        return new C0593d(Float.valueOf(0.0f), z0.f5885a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0123 A[Catch: CancellationException -> 0x0040, TryCatch #1 {CancellationException -> 0x0040, blocks: (B:13:0x0038, B:16:0x010e, B:18:0x0123, B:20:0x014a, B:22:0x0154, B:30:0x0161, B:31:0x0166, B:33:0x0167, B:41:0x0054), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [Z1.t] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [m.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0603m c0603m, InterfaceC0599i interfaceC0599i, long j3, Y1.c cVar, R1.c cVar2) {
        e0 e0Var;
        Q1.a aVar;
        Z1.t tVar;
        C0603m c0603m2;
        Z1.t tVar2;
        C0601k c0601k;
        C0601k c0601k2;
        Y1.c cVar3;
        Object j4;
        Z1.t tVar3;
        Object obj;
        Object j5;
        C0603m c0603m3 = c0603m;
        InterfaceC0599i interfaceC0599i2 = interfaceC0599i;
        try {
            if (cVar2 instanceof e0) {
                e0Var = (e0) cVar2;
                int i3 = e0Var.f5727i;
                c0603m2 = -2147483648;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e0Var.f5727i = i3 - Integer.MIN_VALUE;
                    e0 e0Var2 = e0Var;
                    Object obj2 = e0Var2.f5726h;
                    aVar = Q1.a.f3113d;
                    tVar = e0Var2.f5727i;
                    C0981k0 c0981k0 = C0981k0.f8358d;
                    if (tVar != 0) {
                        I2.l.Q(obj2);
                        Object b2 = interfaceC0599i2.b(0L);
                        r g3 = interfaceC0599i2.g(0L);
                        Z1.t tVar4 = new Z1.t();
                        if (j3 == Long.MIN_VALUE) {
                            try {
                                g0 g0Var = new g0(tVar4, b2, interfaceC0599i, g3, c0603m, g(e0Var2.getContext()), cVar);
                                e0Var2.f5722d = c0603m3;
                                e0Var2.f5723e = interfaceC0599i2;
                                cVar3 = cVar;
                                e0Var2.f5724f = cVar3;
                                e0Var2.f5725g = tVar4;
                                e0Var2.f5727i = 1;
                                if (!interfaceC0599i.a()) {
                                    j4 = C0089d.F(e0Var2.getContext()).j(new S.p(2, g0Var), e0Var2);
                                } else {
                                    if (e0Var2.getContext().k(c0981k0) != null) {
                                        throw new ClassCastException();
                                    }
                                    j4 = C0089d.F(e0Var2.getContext()).j(g0Var, e0Var2);
                                }
                                if (j4 == aVar) {
                                    return aVar;
                                }
                                c0603m2 = c0603m3;
                                tVar = tVar4;
                            } catch (CancellationException e3) {
                                e = e3;
                                tVar2 = tVar4;
                                c0601k = (C0601k) tVar2.f3480d;
                                if (c0601k != null) {
                                }
                                c0601k2 = (C0601k) tVar2.f3480d;
                                if (c0601k2 != null) {
                                    c0603m3.f5807i = false;
                                }
                                throw e;
                            }
                        } else {
                            cVar3 = cVar;
                            try {
                                tVar3 = tVar4;
                                try {
                                    C0601k c0601k3 = new C0601k(b2, interfaceC0599i.d(), g3, j3, interfaceC0599i.e(), j3, new f0(c0603m3, 1));
                                    f(c0601k3, j3, g(e0Var2.getContext()), interfaceC0599i, c0603m, cVar);
                                    tVar3.f3480d = c0601k3;
                                    c0603m2 = c0603m3;
                                    tVar = tVar3;
                                } catch (CancellationException e4) {
                                    e = e4;
                                    tVar2 = tVar3;
                                    c0601k = (C0601k) tVar2.f3480d;
                                    if (c0601k != null) {
                                        c0601k.f5794i.setValue(Boolean.FALSE);
                                    }
                                    c0601k2 = (C0601k) tVar2.f3480d;
                                    if (c0601k2 != null && c0601k2.f5792g == c0603m3.f5805g) {
                                        c0603m3.f5807i = false;
                                    }
                                    throw e;
                                }
                            } catch (CancellationException e5) {
                                e = e5;
                                tVar3 = tVar4;
                            }
                        }
                    } else if (tVar == 1) {
                        Z1.t tVar5 = e0Var2.f5725g;
                        Y1.c cVar4 = e0Var2.f5724f;
                        InterfaceC0599i interfaceC0599i3 = e0Var2.f5723e;
                        C0603m c0603m4 = e0Var2.f5722d;
                        I2.l.Q(obj2);
                        cVar3 = cVar4;
                        interfaceC0599i2 = interfaceC0599i3;
                        tVar = tVar5;
                        c0603m2 = c0603m4;
                    } else {
                        if (tVar != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z1.t tVar6 = e0Var2.f5725g;
                        Y1.c cVar5 = e0Var2.f5724f;
                        InterfaceC0599i interfaceC0599i4 = e0Var2.f5723e;
                        C0603m c0603m5 = e0Var2.f5722d;
                        I2.l.Q(obj2);
                        cVar3 = cVar5;
                        interfaceC0599i2 = interfaceC0599i4;
                        tVar = tVar6;
                        c0603m2 = c0603m5;
                    }
                    do {
                        obj = tVar.f3480d;
                        Z1.i.c(obj);
                        if (((Boolean) ((C0601k) obj).f5794i.getValue()).booleanValue()) {
                            return L1.z.f2729a;
                        }
                        h0 h0Var = new h0(tVar, g(e0Var2.getContext()), interfaceC0599i2, c0603m2, cVar3);
                        e0Var2.f5722d = c0603m2;
                        e0Var2.f5723e = interfaceC0599i2;
                        e0Var2.f5724f = cVar3;
                        e0Var2.f5725g = tVar;
                        e0Var2.f5727i = 2;
                        if (!interfaceC0599i2.a()) {
                            j5 = C0089d.F(e0Var2.getContext()).j(new S.p(2, h0Var), e0Var2);
                        } else {
                            if (e0Var2.getContext().k(c0981k0) != null) {
                                throw new ClassCastException();
                            }
                            j5 = C0089d.F(e0Var2.getContext()).j(h0Var, e0Var2);
                        }
                    } while (j5 != aVar);
                    return aVar;
                }
            }
            if (tVar != 0) {
            }
            do {
                obj = tVar.f3480d;
                Z1.i.c(obj);
                if (((Boolean) ((C0601k) obj).f5794i.getValue()).booleanValue()) {
                }
            } while (j5 != aVar);
            return aVar;
        } catch (CancellationException e6) {
            e = e6;
            c0603m3 = c0603m2;
            tVar2 = tVar;
        }
        e0Var = new e0(cVar2);
        e0 e0Var22 = e0Var;
        Object obj22 = e0Var22.f5726h;
        aVar = Q1.a.f3113d;
        tVar = e0Var22.f5727i;
        C0981k0 c0981k02 = C0981k0.f8358d;
    }

    public static Object c(float f3, float f4, x0 x0Var, Y1.e eVar, R1.i iVar, int i3) {
        InterfaceC0615z h3 = (i3 & 8) != 0 ? h(0.0f, null, 7) : x0Var;
        y0 y0Var = z0.f5885a;
        Float f5 = new Float(f3);
        Float f6 = new Float(f4);
        C0604n c0604n = new C0604n(new Float(0.0f).floatValue());
        Object b2 = b(new C0603m(y0Var, f5, c0604n, 56), new j0(h3, y0Var, f5, f6, c0604n), Long.MIN_VALUE, new S.p(eVar), iVar);
        Q1.a aVar = Q1.a.f3113d;
        L1.z zVar = L1.z.f2729a;
        if (b2 != aVar) {
            b2 = zVar;
        }
        return b2 == aVar ? b2 : zVar;
    }

    public static Object d(C0603m c0603m, Float f3, C0590b0 c0590b0, R1.i iVar) {
        Object b2 = b(c0603m, new j0(c0590b0, c0603m.f5802d, c0603m.f5803e.getValue(), f3, c0603m.f5804f), c0603m.f5805g, i0.f5755f, iVar);
        return b2 == Q1.a.f3113d ? b2 : L1.z.f2729a;
    }

    public static final r e(r rVar) {
        r c3 = rVar.c();
        int b2 = c3.b();
        for (int i3 = 0; i3 < b2; i3++) {
            c3.e(rVar.a(i3), i3);
        }
        return c3;
    }

    public static final void f(C0601k c0601k, long j3, float f3, InterfaceC0599i interfaceC0599i, C0603m c0603m, Y1.c cVar) {
        long c3 = f3 == 0.0f ? interfaceC0599i.c() : (long) ((j3 - c0601k.f5788c) / f3);
        c0601k.f5792g = j3;
        c0601k.f5790e.setValue(interfaceC0599i.b(c3));
        c0601k.f5791f = interfaceC0599i.g(c3);
        if (interfaceC0599i.f(c3)) {
            c0601k.f5793h = c0601k.f5792g;
            c0601k.f5794i.setValue(Boolean.FALSE);
        }
        j(c0601k, c0603m);
        cVar.j(c0601k);
    }

    public static final float g(P1.i iVar) {
        U.n nVar = (U.n) iVar.k(U.a.f3292q);
        float z3 = nVar != null ? nVar.z() : 1.0f;
        if (z3 >= 0.0f) {
            return z3;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static C0590b0 h(float f3, Object obj, int i3) {
        if ((i3 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i3 & 4) != 0) {
            obj = null;
        }
        return new C0590b0(1.0f, f3, obj);
    }

    public static x0 i(int i3, int i4, InterfaceC0613x interfaceC0613x, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            interfaceC0613x = AbstractC0614y.f5880a;
        }
        return new x0(i3, i4, interfaceC0613x);
    }

    public static final void j(C0601k c0601k, C0603m c0603m) {
        c0603m.f5803e.setValue(c0601k.f5790e.getValue());
        r rVar = c0603m.f5804f;
        r rVar2 = c0601k.f5791f;
        int b2 = rVar.b();
        for (int i3 = 0; i3 < b2; i3++) {
            rVar.e(rVar2.a(i3), i3);
        }
        c0603m.f5806h = c0601k.f5793h;
        c0603m.f5805g = c0601k.f5792g;
        c0603m.f5807i = ((Boolean) c0601k.f5794i.getValue()).booleanValue();
    }
}

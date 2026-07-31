package t2;

import b0.C0339h;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import q2.AbstractC0814a;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.InterfaceC0835w;
import q2.g0;
import q2.m0;
import s2.C0969c;
import s2.EnumC0967a;
import u2.AbstractC1151c;
import u2.AbstractC1155g;
import u2.C1149a;

/* renamed from: t2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1035F {

    /* renamed from: a, reason: collision with root package name */
    public static final m1.q f8976a = new m1.q("NO_VALUE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final m1.q f8977b = new m1.q("NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m1.q f8978c = new m1.q("PENDING", 1);

    public static final C1034E a(int i3, int i4, EnumC0967a enumC0967a) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("replay cannot be negative, but was ", i3).toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(A.k.h("extraBufferCapacity cannot be negative, but was ", i4).toString());
        }
        if (i3 <= 0 && i4 <= 0 && enumC0967a != EnumC0967a.f8359d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC0967a).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new C1034E(i3, i5, enumC0967a);
    }

    public static /* synthetic */ C1034E b(int i3, int i4, EnumC0967a enumC0967a, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return a(i3, i4, enumC0967a);
    }

    public static final C1045P c(Object obj) {
        if (obj == null) {
            obj = AbstractC1151c.f9682b;
        }
        return new C1045P(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C1047S c1047s, InterfaceC0427f interfaceC0427f, Throwable th, X1.c cVar) {
        C1056i c1056i;
        int i3;
        try {
            if (cVar instanceof C1056i) {
                c1056i = (C1056i) cVar;
                int i4 = c1056i.f9027i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c1056i.f9027i = i4 - Integer.MIN_VALUE;
                    Object obj = c1056i.f9026h;
                    Object obj2 = W1.a.f4608d;
                    i3 = c1056i.f9027i;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        c1056i.f9025g = th;
                        c1056i.f9027i = 1;
                        if (interfaceC0427f.g(c1047s, th, c1056i) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = c1056i.f9025g;
                        R1.a.e(obj);
                    }
                    return R1.y.f4171a;
                }
            }
            if (i3 != 0) {
            }
            return R1.y.f4171a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                R1.a.a(th2, th);
            }
            throw th2;
        }
        c1056i = new C1056i(cVar);
        Object obj3 = c1056i.f9026h;
        Object obj22 = W1.a.f4608d;
        i3 = c1056i.f9027i;
    }

    public static final void e(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC1053f f(InterfaceC1053f interfaceC1053f, int i3) {
        EnumC0967a enumC0967a = EnumC0967a.f8359d;
        if (i3 < 0 && i3 != -2 && i3 != -1) {
            throw new IllegalArgumentException(A.k.h("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i3).toString());
        }
        if (i3 == -1) {
            enumC0967a = EnumC0967a.f8360e;
            i3 = 0;
        }
        boolean z3 = interfaceC1053f instanceof u2.v;
        V1.j jVar = V1.j.f4558d;
        return z3 ? ((u2.v) interfaceC1053f).b(jVar, i3, enumC0967a) : new u2.j(i3, jVar, enumC0967a, interfaceC1053f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r6 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0339h g(InterfaceC1053f interfaceC1053f, int i3) {
        AbstractC1155g abstractC1155g;
        InterfaceC1053f h3;
        s2.k.f8409b.getClass();
        int i4 = s2.j.f8408b;
        if (i3 >= i4) {
            i4 = i3;
        }
        int i5 = i4 - i3;
        boolean z3 = interfaceC1053f instanceof AbstractC1155g;
        EnumC0967a enumC0967a = EnumC0967a.f8359d;
        if (!z3 || (h3 = (abstractC1155g = (AbstractC1155g) interfaceC1053f).h()) == null) {
            return new C0339h(i5, V1.j.f4558d, enumC0967a, interfaceC1053f);
        }
        EnumC0967a enumC0967a2 = abstractC1155g.f9693f;
        int i6 = abstractC1155g.f9692e;
        if (i6 != -3 && i6 != -2 && i6 != 0) {
            i5 = i6;
        } else if (enumC0967a2 != enumC0967a) {
            if (i3 == 0) {
                i5 = 1;
            }
            i5 = 0;
        }
        return new C0339h(i5, abstractC1155g.f9691d, enumC0967a2, h3);
    }

    public static final InterfaceC1053f h(InterfaceC1053f interfaceC1053f) {
        if (interfaceC1053f instanceof InterfaceC1043N) {
            return interfaceC1053f;
        }
        if (!(interfaceC1053f instanceof C1052e)) {
            return new C1052e(interfaceC1053f);
        }
        ((C1052e) interfaceC1053f).getClass();
        return interfaceC1053f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:19:0x006b, B:21:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(InterfaceC1054g interfaceC1054g, s2.v vVar, boolean z3, V1.d dVar) {
        C1055h c1055h;
        int i3;
        C0969c it;
        C0969c c0969c;
        InterfaceC1054g interfaceC1054g2;
        Object b3;
        try {
            if (dVar instanceof C1055h) {
                c1055h = (C1055h) dVar;
                int i4 = c1055h.f9024l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c1055h.f9024l = i4 - Integer.MIN_VALUE;
                    Object obj = c1055h.f9023k;
                    W1.a aVar = W1.a.f4608d;
                    i3 = c1055h.f9024l;
                    CancellationException cancellationException = null;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        if (interfaceC1054g instanceof C1047S) {
                            throw ((C1047S) interfaceC1054g).f9006d;
                        }
                        it = vVar.iterator();
                        c1055h.f9019g = interfaceC1054g;
                        c1055h.f9020h = vVar;
                        c1055h.f9021i = it;
                        c1055h.f9022j = z3;
                        c1055h.f9024l = 1;
                        b3 = it.b(c1055h);
                        if (b3 == aVar) {
                        }
                    } else if (i3 == 1) {
                        z3 = c1055h.f9022j;
                        c0969c = c1055h.f9021i;
                        vVar = c1055h.f9020h;
                        interfaceC1054g2 = c1055h.f9019g;
                        R1.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = c1055h.f9022j;
                        c0969c = c1055h.f9021i;
                        vVar = c1055h.f9020h;
                        interfaceC1054g2 = c1055h.f9019g;
                        R1.a.e(obj);
                        it = c0969c;
                        interfaceC1054g = interfaceC1054g2;
                        c1055h.f9019g = interfaceC1054g;
                        c1055h.f9020h = vVar;
                        c1055h.f9021i = it;
                        c1055h.f9022j = z3;
                        c1055h.f9024l = 1;
                        b3 = it.b(c1055h);
                        if (b3 == aVar) {
                            return aVar;
                        }
                        interfaceC1054g2 = interfaceC1054g;
                        c0969c = it;
                        obj = b3;
                        if (((Boolean) obj).booleanValue()) {
                            if (z3) {
                                vVar.a(null);
                            }
                            return R1.y.f4171a;
                        }
                        Object c2 = c0969c.c();
                        c1055h.f9019g = interfaceC1054g2;
                        c1055h.f9020h = vVar;
                        c1055h.f9021i = c0969c;
                        c1055h.f9022j = z3;
                        c1055h.f9024l = 2;
                        if (interfaceC1054g2.e(c2, c1055h) == aVar) {
                            return aVar;
                        }
                        it = c0969c;
                        interfaceC1054g = interfaceC1054g2;
                        c1055h.f9019g = interfaceC1054g;
                        c1055h.f9020h = vVar;
                        c1055h.f9021i = it;
                        c1055h.f9022j = z3;
                        c1055h.f9024l = 1;
                        b3 = it.b(c1055h);
                        if (b3 == aVar) {
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
        } finally {
        }
        c1055h = new C1055h(dVar);
        Object obj2 = c1055h.f9023k;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c1055h.f9024l;
        CancellationException cancellationException2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(InterfaceC1053f interfaceC1053f, X1.c cVar) {
        C1066s c1066s;
        Object obj;
        int i3;
        Object obj2;
        f2.u uVar;
        C1149a e3;
        F.C c2;
        if (cVar instanceof C1066s) {
            c1066s = (C1066s) cVar;
            int i4 = c1066s.f9069j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1066s.f9069j = i4 - Integer.MIN_VALUE;
                Object obj3 = c1066s.f9068i;
                obj = W1.a.f4608d;
                i3 = c1066s.f9069j;
                obj2 = AbstractC1151c.f9682b;
                if (i3 != 0) {
                    R1.a.e(obj3);
                    f2.u uVar2 = new f2.u();
                    uVar2.f5832d = obj2;
                    F.C c3 = new F.C(3, uVar2);
                    try {
                        c1066s.f9066g = uVar2;
                        c1066s.f9067h = c3;
                        c1066s.f9069j = 1;
                        if (interfaceC1053f.d(c3, c1066s) != obj) {
                            uVar = uVar2;
                        }
                    } catch (C1149a e4) {
                        uVar = uVar2;
                        e3 = e4;
                        c2 = c3;
                        if (e3.f9676d != c2) {
                            throw e3;
                        }
                        obj = uVar.f5832d;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2 = c1066s.f9067h;
                uVar = c1066s.f9066g;
                try {
                    R1.a.e(obj3);
                } catch (C1149a e5) {
                    e3 = e5;
                    if (e3.f9676d != c2) {
                    }
                    obj = uVar.f5832d;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = uVar.f5832d;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element");
                }
                return obj;
            }
        }
        c1066s = new C1066s(cVar);
        Object obj32 = c1066s.f9068i;
        obj = W1.a.f4608d;
        i3 = c1066s.f9069j;
        obj2 = AbstractC1151c.f9682b;
        if (i3 != 0) {
        }
        obj = uVar.f5832d;
        if (obj == obj2) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(InterfaceC1053f interfaceC1053f, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        C1067t c1067t;
        Object obj;
        int i3;
        Object obj2;
        InterfaceC0426e interfaceC0426e2;
        f2.u uVar;
        C1149a e3;
        B.L l3;
        if (cVar instanceof C1067t) {
            c1067t = (C1067t) cVar;
            int i4 = c1067t.f9074k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1067t.f9074k = i4 - Integer.MIN_VALUE;
                Object obj3 = c1067t.f9073j;
                obj = W1.a.f4608d;
                i3 = c1067t.f9074k;
                obj2 = AbstractC1151c.f9682b;
                if (i3 != 0) {
                    R1.a.e(obj3);
                    f2.u uVar2 = new f2.u();
                    uVar2.f5832d = obj2;
                    B.L l4 = new B.L(interfaceC0426e, uVar2);
                    try {
                        c1067t.f9070g = interfaceC0426e;
                        c1067t.f9071h = uVar2;
                        c1067t.f9072i = l4;
                        c1067t.f9074k = 1;
                        if (interfaceC1053f.d(l4, c1067t) != obj) {
                            interfaceC0426e2 = interfaceC0426e;
                            uVar = uVar2;
                        }
                    } catch (C1149a e4) {
                        interfaceC0426e2 = interfaceC0426e;
                        uVar = uVar2;
                        e3 = e4;
                        l3 = l4;
                        if (e3.f9676d != l3) {
                            throw e3;
                        }
                        obj = uVar.f5832d;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l3 = c1067t.f9072i;
                uVar = c1067t.f9071h;
                interfaceC0426e2 = c1067t.f9070g;
                try {
                    R1.a.e(obj3);
                } catch (C1149a e5) {
                    e3 = e5;
                    if (e3.f9676d != l3) {
                    }
                    obj = uVar.f5832d;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = uVar.f5832d;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC0426e2);
                }
                return obj;
            }
        }
        c1067t = new C1067t(cVar);
        Object obj32 = c1067t.f9073j;
        obj = W1.a.f4608d;
        i3 = c1067t.f9074k;
        obj2 = AbstractC1151c.f9682b;
        if (i3 != 0) {
        }
        obj = uVar.f5832d;
        if (obj == obj2) {
        }
        return obj;
    }

    public static final InterfaceC1053f l(InterfaceC1031B interfaceC1031B, V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return ((i3 == 0 || i3 == -3) && enumC0967a == EnumC0967a.f8359d) ? interfaceC1031B : new u2.j(i3, iVar, enumC0967a, interfaceC1031B);
    }

    public static final C1030A m(InterfaceC1053f interfaceC1053f, InterfaceC0835w interfaceC0835w, C1042M c1042m, Object obj) {
        C0339h g3 = g(interfaceC1053f, 1);
        C1045P c2 = c(obj);
        InterfaceC1053f interfaceC1053f2 = (InterfaceC1053f) g3.f5415b;
        EnumC0836x enumC0836x = c1042m.equals(C1038I.f8985a) ? EnumC0836x.f7934d : EnumC0836x.f7937g;
        C1070w c1070w = new C1070w(c1042m, interfaceC1053f2, c2, obj, null);
        V1.i h3 = AbstractC0837y.h(interfaceC0835w.q(), (V1.i) g3.f5417d, true);
        x2.e eVar = q2.E.f7851a;
        if (h3 != eVar && h3.v(V1.e.f4557d) == null) {
            h3 = h3.d(eVar);
        }
        AbstractC0814a g0Var = enumC0836x == EnumC0836x.f7935e ? new g0(h3, c1070w) : new m0(h3, true);
        g0Var.k0(enumC0836x, g0Var, c1070w);
        return new C1030A(c2);
    }
}

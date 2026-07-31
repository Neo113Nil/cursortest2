package n2;

import E.C0025g;
import H2.AbstractC0080b;
import b0.C0276i;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import m2.C0628c;
import m2.EnumC0626a;
import o2.AbstractC0754c;
import o2.C0752a;

/* renamed from: n2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682G {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.p f6293a = new j1.p("NO_VALUE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final j1.p f6294b = new j1.p("NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j1.p f6295c = new j1.p("PENDING", 1);

    public static final C0681F a(int i3, int i4, EnumC0626a enumC0626a) {
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("replay cannot be negative, but was ", i3).toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("extraBufferCapacity cannot be negative, but was ", i4).toString());
        }
        if (i3 <= 0 && i4 <= 0 && enumC0626a != EnumC0626a.f5929d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC0626a).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new C0681F(i3, i5, enumC0626a);
    }

    public static final C0692Q b(Object obj) {
        if (obj == null) {
            obj = AbstractC0754c.f6699b;
        }
        return new C0692Q(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C0694T c0694t, Y1.f fVar, Throwable th, R1.c cVar) {
        C0703i c0703i;
        int i3;
        try {
            if (cVar instanceof C0703i) {
                c0703i = (C0703i) cVar;
                int i4 = c0703i.f6344f;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0703i.f6344f = i4 - Integer.MIN_VALUE;
                    Object obj = c0703i.f6343e;
                    Object obj2 = Q1.a.f3113d;
                    i3 = c0703i.f6344f;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        c0703i.f6342d = th;
                        c0703i.f6344f = 1;
                        if (fVar.f(c0694t, th, c0703i) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = c0703i.f6342d;
                        I2.l.Q(obj);
                    }
                    return L1.z.f2729a;
                }
            }
            if (i3 != 0) {
            }
            return L1.z.f2729a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                M1.B.o(th2, th);
            }
            throw th2;
        }
        c0703i = new C0703i(cVar);
        Object obj3 = c0703i.f6343e;
        Object obj22 = Q1.a.f3113d;
        i3 = c0703i.f6344f;
    }

    public static final void d(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0700f e(InterfaceC0700f interfaceC0700f, int i3) {
        EnumC0626a enumC0626a = EnumC0626a.f5929d;
        if (i3 < 0 && i3 != -2 && i3 != -1) {
            throw new IllegalArgumentException(AbstractC0080b.h("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i3).toString());
        }
        if (i3 == -1) {
            enumC0626a = EnumC0626a.f5930e;
            i3 = 0;
        }
        boolean z3 = interfaceC0700f instanceof o2.p;
        P1.j jVar = P1.j.f3073d;
        return z3 ? ((o2.p) interfaceC0700f).b(jVar, i3, enumC0626a) : new o2.j(i3, jVar, enumC0626a, interfaceC0700f);
    }

    public static final C0276i f(C0677B c0677b, int i3) {
        m2.i.f5971b.getClass();
        int i4 = m2.h.f5970b;
        if (i3 >= i4) {
            i4 = i3;
        }
        return new C0276i(i4 - i3, P1.j.f3073d, EnumC0626a.f5929d, c0677b);
    }

    public static final InterfaceC0700f g(InterfaceC0700f interfaceC0700f) {
        if (interfaceC0700f instanceof InterfaceC0690O) {
            return interfaceC0700f;
        }
        if (!(interfaceC0700f instanceof C0699e)) {
            return new C0699e(interfaceC0700f);
        }
        ((C0699e) interfaceC0700f).getClass();
        return interfaceC0700f;
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
    public static final Object h(InterfaceC0701g interfaceC0701g, m2.s sVar, boolean z3, P1.d dVar) {
        C0702h c0702h;
        int i3;
        C0628c it;
        C0628c c0628c;
        InterfaceC0701g interfaceC0701g2;
        Object b2;
        try {
            if (dVar instanceof C0702h) {
                c0702h = (C0702h) dVar;
                int i4 = c0702h.f6341i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0702h.f6341i = i4 - Integer.MIN_VALUE;
                    Object obj = c0702h.f6340h;
                    Q1.a aVar = Q1.a.f3113d;
                    i3 = c0702h.f6341i;
                    CancellationException cancellationException = null;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        if (interfaceC0701g instanceof C0694T) {
                            throw ((C0694T) interfaceC0701g).f6323d;
                        }
                        it = sVar.iterator();
                        c0702h.f6336d = interfaceC0701g;
                        c0702h.f6337e = sVar;
                        c0702h.f6338f = it;
                        c0702h.f6339g = z3;
                        c0702h.f6341i = 1;
                        b2 = it.b(c0702h);
                        if (b2 == aVar) {
                        }
                    } else if (i3 == 1) {
                        z3 = c0702h.f6339g;
                        c0628c = c0702h.f6338f;
                        sVar = c0702h.f6337e;
                        interfaceC0701g2 = c0702h.f6336d;
                        I2.l.Q(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = c0702h.f6339g;
                        c0628c = c0702h.f6338f;
                        sVar = c0702h.f6337e;
                        interfaceC0701g2 = c0702h.f6336d;
                        I2.l.Q(obj);
                        it = c0628c;
                        interfaceC0701g = interfaceC0701g2;
                        c0702h.f6336d = interfaceC0701g;
                        c0702h.f6337e = sVar;
                        c0702h.f6338f = it;
                        c0702h.f6339g = z3;
                        c0702h.f6341i = 1;
                        b2 = it.b(c0702h);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        interfaceC0701g2 = interfaceC0701g;
                        c0628c = it;
                        obj = b2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z3) {
                                sVar.a(null);
                            }
                            return L1.z.f2729a;
                        }
                        Object c3 = c0628c.c();
                        c0702h.f6336d = interfaceC0701g2;
                        c0702h.f6337e = sVar;
                        c0702h.f6338f = c0628c;
                        c0702h.f6339g = z3;
                        c0702h.f6341i = 2;
                        if (interfaceC0701g2.emit(c3, c0702h) == aVar) {
                            return aVar;
                        }
                        it = c0628c;
                        interfaceC0701g = interfaceC0701g2;
                        c0702h.f6336d = interfaceC0701g;
                        c0702h.f6337e = sVar;
                        c0702h.f6338f = it;
                        c0702h.f6339g = z3;
                        c0702h.f6341i = 1;
                        b2 = it.b(c0702h);
                        if (b2 == aVar) {
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
        } finally {
        }
        c0702h = new C0702h(dVar);
        Object obj2 = c0702h.f6340h;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0702h.f6341i;
        CancellationException cancellationException2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(InterfaceC0700f interfaceC0700f, R1.c cVar) {
        C0713s c0713s;
        Object obj;
        int i3;
        Object obj2;
        Z1.t tVar;
        C0752a e3;
        G1.o oVar;
        if (cVar instanceof C0713s) {
            c0713s = (C0713s) cVar;
            int i4 = c0713s.f6385g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0713s.f6385g = i4 - Integer.MIN_VALUE;
                Object obj3 = c0713s.f6384f;
                obj = Q1.a.f3113d;
                i3 = c0713s.f6385g;
                obj2 = AbstractC0754c.f6699b;
                if (i3 != 0) {
                    I2.l.Q(obj3);
                    Z1.t tVar2 = new Z1.t();
                    tVar2.f3480d = obj2;
                    G1.o oVar2 = new G1.o(6, tVar2);
                    try {
                        c0713s.f6382d = tVar2;
                        c0713s.f6383e = oVar2;
                        c0713s.f6385g = 1;
                        if (interfaceC0700f.collect(oVar2, c0713s) != obj) {
                            tVar = tVar2;
                        }
                    } catch (C0752a e4) {
                        tVar = tVar2;
                        e3 = e4;
                        oVar = oVar2;
                        if (e3.f6693d != oVar) {
                            throw e3;
                        }
                        obj = tVar.f3480d;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = c0713s.f6383e;
                tVar = c0713s.f6382d;
                try {
                    I2.l.Q(obj3);
                } catch (C0752a e5) {
                    e3 = e5;
                    if (e3.f6693d != oVar) {
                    }
                    obj = tVar.f3480d;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = tVar.f3480d;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element");
                }
                return obj;
            }
        }
        c0713s = new C0713s(cVar);
        Object obj32 = c0713s.f6384f;
        obj = Q1.a.f3113d;
        i3 = c0713s.f6385g;
        obj2 = AbstractC0754c.f6699b;
        if (i3 != 0) {
        }
        obj = tVar.f3480d;
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
    public static final Object j(InterfaceC0700f interfaceC0700f, Y1.e eVar, R1.c cVar) {
        C0714t c0714t;
        Object obj;
        int i3;
        Object obj2;
        Y1.e eVar2;
        Z1.t tVar;
        C0752a e3;
        C0025g c0025g;
        if (cVar instanceof C0714t) {
            c0714t = (C0714t) cVar;
            int i4 = c0714t.f6390h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0714t.f6390h = i4 - Integer.MIN_VALUE;
                Object obj3 = c0714t.f6389g;
                obj = Q1.a.f3113d;
                i3 = c0714t.f6390h;
                obj2 = AbstractC0754c.f6699b;
                if (i3 != 0) {
                    I2.l.Q(obj3);
                    Z1.t tVar2 = new Z1.t();
                    tVar2.f3480d = obj2;
                    C0025g c0025g2 = new C0025g(eVar, tVar2);
                    try {
                        c0714t.f6386d = eVar;
                        c0714t.f6387e = tVar2;
                        c0714t.f6388f = c0025g2;
                        c0714t.f6390h = 1;
                        if (interfaceC0700f.collect(c0025g2, c0714t) != obj) {
                            eVar2 = eVar;
                            tVar = tVar2;
                        }
                    } catch (C0752a e4) {
                        eVar2 = eVar;
                        tVar = tVar2;
                        e3 = e4;
                        c0025g = c0025g2;
                        if (e3.f6693d != c0025g) {
                            throw e3;
                        }
                        obj = tVar.f3480d;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0025g = c0714t.f6388f;
                tVar = c0714t.f6387e;
                eVar2 = c0714t.f6386d;
                try {
                    I2.l.Q(obj3);
                } catch (C0752a e5) {
                    e3 = e5;
                    if (e3.f6693d != c0025g) {
                    }
                    obj = tVar.f3480d;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = tVar.f3480d;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar2);
                }
                return obj;
            }
        }
        c0714t = new C0714t(cVar);
        Object obj32 = c0714t.f6389g;
        obj = Q1.a.f3113d;
        i3 = c0714t.f6390h;
        obj2 = AbstractC0754c.f6699b;
        if (i3 != 0) {
        }
        obj = tVar.f3480d;
        if (obj == obj2) {
        }
        return obj;
    }

    public static final InterfaceC0700f k(InterfaceC0678C interfaceC0678C, P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return ((i3 == 0 || i3 == -3) && enumC0626a == EnumC0626a.f5929d) ? interfaceC0678C : new o2.j(i3, iVar, enumC0626a, interfaceC0678C);
    }
}

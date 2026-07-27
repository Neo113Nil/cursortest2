package M;

import h2.C0482c;
import java.util.concurrent.atomic.AtomicInteger;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final L4.d f1706a = L4.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final C0482c f1707b = new C0482c(22);

    /* renamed from: c, reason: collision with root package name */
    public final C0482c f1708c = new C0482c(new i0(2, null));

    public j0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f1707b.f5783b).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InterfaceC1441l interfaceC1441l, AbstractC1295c abstractC1295c) {
        g0 g0Var;
        EnumC1260a enumC1260a;
        int i2;
        L4.d dVar;
        Throwable th;
        L4.a aVar;
        Object invoke;
        try {
            if (abstractC1295c instanceof g0) {
                g0Var = (g0) abstractC1295c;
                int i3 = g0Var.f1690e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g0Var.f1690e = i3 - Integer.MIN_VALUE;
                    Object obj = g0Var.f1688c;
                    enumC1260a = EnumC1260a.f11058a;
                    i2 = g0Var.f1690e;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        g0Var.f1686a = interfaceC1441l;
                        dVar = this.f1706a;
                        g0Var.f1687b = dVar;
                        g0Var.f1690e = 1;
                        if (dVar.c(g0Var) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (L4.a) g0Var.f1686a;
                            try {
                                e5.g.y(obj);
                                ((L4.d) aVar).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((L4.d) aVar).e(null);
                                throw th;
                            }
                        }
                        L4.d dVar2 = g0Var.f1687b;
                        InterfaceC1441l interfaceC1441l2 = (InterfaceC1441l) g0Var.f1686a;
                        e5.g.y(obj);
                        dVar = dVar2;
                        interfaceC1441l = interfaceC1441l2;
                    }
                    g0Var.f1686a = dVar;
                    g0Var.f1687b = null;
                    g0Var.f1690e = 2;
                    invoke = interfaceC1441l.invoke(g0Var);
                    if (invoke != enumC1260a) {
                        return enumC1260a;
                    }
                    L4.d dVar3 = dVar;
                    obj = invoke;
                    aVar = dVar3;
                    ((L4.d) aVar).e(null);
                    return obj;
                }
            }
            g0Var.f1686a = dVar;
            g0Var.f1687b = null;
            g0Var.f1690e = 2;
            invoke = interfaceC1441l.invoke(g0Var);
            if (invoke != enumC1260a) {
            }
        } catch (Throwable th3) {
            L4.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((L4.d) aVar).e(null);
            throw th;
        }
        g0Var = new g0(this, abstractC1295c);
        Object obj2 = g0Var.f1688c;
        enumC1260a = EnumC1260a.f11058a;
        i2 = g0Var.f1690e;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InterfaceC1445p interfaceC1445p, AbstractC1295c abstractC1295c) {
        h0 h0Var;
        int i2;
        L4.d dVar;
        Throwable th;
        boolean z;
        if (abstractC1295c instanceof h0) {
            h0Var = (h0) abstractC1295c;
            int i3 = h0Var.f1701e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.f1701e = i3 - Integer.MIN_VALUE;
                Object obj = h0Var.f1699c;
                Object obj2 = EnumC1260a.f11058a;
                i2 = h0Var.f1701e;
                if (i2 != 0) {
                    e5.g.y(obj);
                    L4.d dVar2 = this.f1706a;
                    boolean d6 = dVar2.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d6);
                        h0Var.f1697a = dVar2;
                        h0Var.f1698b = d6;
                        h0Var.f1701e = 1;
                        Object invoke = interfaceC1445p.invoke(valueOf, h0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z = d6;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z = d6;
                        if (z) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = h0Var.f1698b;
                    dVar = h0Var.f1697a;
                    try {
                        e5.g.y(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        h0Var = new h0(this, abstractC1295c);
        Object obj3 = h0Var.f1699c;
        Object obj22 = EnumC1260a.f11058a;
        i2 = h0Var.f1701e;
        if (i2 != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}

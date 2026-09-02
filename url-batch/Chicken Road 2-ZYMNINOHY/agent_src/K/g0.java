package K;

import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicInteger;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final F3.d f1362a = new F3.d();

    /* renamed from: b, reason: collision with root package name */
    public final t1.h f1363b = new t1.h(8);

    /* renamed from: c, reason: collision with root package name */
    public final A3.t f1364c = new A3.t(new f0(2, null));

    public g0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f1363b.f15398b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InterfaceC1339l interfaceC1339l, h3.c cVar) {
        d0 d0Var;
        EnumC0441a enumC0441a;
        int i4;
        F3.d dVar;
        Throwable th;
        F3.a aVar;
        Object invoke;
        try {
            if (cVar instanceof d0) {
                d0Var = (d0) cVar;
                int i5 = d0Var.f1345e;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    d0Var.f1345e = i5 - Integer.MIN_VALUE;
                    Object obj = d0Var.f1343c;
                    enumC0441a = EnumC0441a.f9038a;
                    i4 = d0Var.f1345e;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        d0Var.f1341a = interfaceC1339l;
                        dVar = this.f1362a;
                        d0Var.f1342b = dVar;
                        d0Var.f1345e = 1;
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (F3.a) d0Var.f1341a;
                            try {
                                O3.l.w(obj);
                                ((F3.d) aVar).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((F3.d) aVar).e(null);
                                throw th;
                            }
                        }
                        F3.d dVar2 = d0Var.f1342b;
                        InterfaceC1339l interfaceC1339l2 = (InterfaceC1339l) d0Var.f1341a;
                        O3.l.w(obj);
                        dVar = dVar2;
                        interfaceC1339l = interfaceC1339l2;
                    }
                    d0Var.f1341a = dVar;
                    d0Var.f1342b = null;
                    d0Var.f1345e = 2;
                    invoke = interfaceC1339l.invoke(d0Var);
                    if (invoke != enumC0441a) {
                        F3.d dVar3 = dVar;
                        obj = invoke;
                        aVar = dVar3;
                        ((F3.d) aVar).e(null);
                        return obj;
                    }
                    return enumC0441a;
                }
            }
            d0Var.f1341a = dVar;
            d0Var.f1342b = null;
            d0Var.f1345e = 2;
            invoke = interfaceC1339l.invoke(d0Var);
            if (invoke != enumC0441a) {
            }
            return enumC0441a;
        } catch (Throwable th3) {
            F3.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((F3.d) aVar).e(null);
            throw th;
        }
        d0Var = new d0(this, cVar);
        Object obj2 = d0Var.f1343c;
        enumC0441a = EnumC0441a.f9038a;
        i4 = d0Var.f1345e;
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o3.p pVar, h3.c cVar) {
        e0 e0Var;
        int i4;
        F3.d dVar;
        Throwable th;
        boolean z;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i5 = e0Var.f1354e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                e0Var.f1354e = i5 - Integer.MIN_VALUE;
                Object obj = e0Var.f1352c;
                Object obj2 = EnumC0441a.f9038a;
                i4 = e0Var.f1354e;
                if (i4 != 0) {
                    O3.l.w(obj);
                    F3.d dVar2 = this.f1362a;
                    boolean d4 = dVar2.d();
                    try {
                        Object valueOf = Boolean.valueOf(d4);
                        e0Var.f1350a = dVar2;
                        e0Var.f1351b = d4;
                        e0Var.f1354e = 1;
                        Object invoke = pVar.invoke(valueOf, e0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z = d4;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z = d4;
                        if (z) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = e0Var.f1351b;
                    dVar = e0Var.f1350a;
                    try {
                        O3.l.w(obj);
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
        e0Var = new e0(this, cVar);
        Object obj3 = e0Var.f1352c;
        Object obj22 = EnumC0441a.f9038a;
        i4 = e0Var.f1354e;
        if (i4 != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}

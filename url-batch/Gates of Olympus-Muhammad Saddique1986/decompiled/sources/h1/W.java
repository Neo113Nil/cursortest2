package h1;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f6127a = y2.d.a();

    /* renamed from: b, reason: collision with root package name */
    public final B.Y f6128b = new B.Y(25);

    /* renamed from: c, reason: collision with root package name */
    public final H1.c f6129c = new H1.c(new V(2, null));

    public W(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f6128b.f334d).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InterfaceC0424c interfaceC0424c, X1.c cVar) {
        T t3;
        W1.a aVar;
        int i3;
        y2.c cVar2;
        Throwable th;
        y2.a aVar2;
        Object n3;
        try {
            if (cVar instanceof T) {
                t3 = (T) cVar;
                int i4 = t3.f6121k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    t3.f6121k = i4 - Integer.MIN_VALUE;
                    Object obj = t3.f6119i;
                    aVar = W1.a.f4608d;
                    i3 = t3.f6121k;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        t3.f6117g = interfaceC0424c;
                        cVar2 = this.f6127a;
                        t3.f6118h = cVar2;
                        t3.f6121k = 1;
                        if (cVar2.c(null, t3) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (y2.a) t3.f6117g;
                            try {
                                R1.a.e(obj);
                                ((y2.c) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((y2.c) aVar2).e(null);
                                throw th;
                            }
                        }
                        y2.c cVar3 = t3.f6118h;
                        InterfaceC0424c interfaceC0424c2 = (InterfaceC0424c) t3.f6117g;
                        R1.a.e(obj);
                        cVar2 = cVar3;
                        interfaceC0424c = interfaceC0424c2;
                    }
                    t3.f6117g = cVar2;
                    t3.f6118h = null;
                    t3.f6121k = 2;
                    n3 = interfaceC0424c.n(t3);
                    if (n3 != aVar) {
                        return aVar;
                    }
                    y2.c cVar4 = cVar2;
                    obj = n3;
                    aVar2 = cVar4;
                    ((y2.c) aVar2).e(null);
                    return obj;
                }
            }
            t3.f6117g = cVar2;
            t3.f6118h = null;
            t3.f6121k = 2;
            n3 = interfaceC0424c.n(t3);
            if (n3 != aVar) {
            }
        } catch (Throwable th3) {
            y2.c cVar5 = cVar2;
            th = th3;
            aVar2 = cVar5;
            ((y2.c) aVar2).e(null);
            throw th;
        }
        t3 = new T(this, cVar);
        Object obj2 = t3.f6119i;
        aVar = W1.a.f4608d;
        i3 = t3.f6121k;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InterfaceC0426e interfaceC0426e, X1.c cVar) {
        U u3;
        int i3;
        y2.c cVar2;
        Throwable th;
        boolean z3;
        if (cVar instanceof U) {
            u3 = (U) cVar;
            int i4 = u3.f6126k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                u3.f6126k = i4 - Integer.MIN_VALUE;
                Object obj = u3.f6124i;
                Object obj2 = W1.a.f4608d;
                i3 = u3.f6126k;
                if (i3 != 0) {
                    R1.a.e(obj);
                    y2.c cVar3 = this.f6127a;
                    boolean d3 = cVar3.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d3);
                        u3.f6122g = cVar3;
                        u3.f6123h = d3;
                        u3.f6126k = 1;
                        Object h3 = interfaceC0426e.h(valueOf, u3);
                        if (h3 == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = h3;
                        z3 = d3;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z3 = d3;
                        if (z3) {
                            cVar2.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = u3.f6123h;
                    cVar2 = u3.f6122g;
                    try {
                        R1.a.e(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z3) {
                        }
                        throw th;
                    }
                }
                if (z3) {
                    cVar2.e(null);
                }
                return obj;
            }
        }
        u3 = new U(this, cVar);
        Object obj3 = u3.f6124i;
        Object obj22 = W1.a.f4608d;
        i3 = u3.f6126k;
        if (i3 != 0) {
        }
        if (z3) {
        }
        return obj3;
    }
}

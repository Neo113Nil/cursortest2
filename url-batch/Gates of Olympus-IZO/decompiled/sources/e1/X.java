package e1;

import java.util.concurrent.atomic.AtomicInteger;
import n2.C0677B;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final s2.c f4674a = s2.d.a();

    /* renamed from: b, reason: collision with root package name */
    public final A2.g f4675b = new A2.g(21);

    /* renamed from: c, reason: collision with root package name */
    public final C0677B f4676c = new C0677B(new W(2, null));

    public X(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f4675b.f83b).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Y1.c cVar, R1.c cVar2) {
        U u3;
        Q1.a aVar;
        int i3;
        s2.c cVar3;
        Throwable th;
        s2.a aVar2;
        Object j3;
        try {
            if (cVar2 instanceof U) {
                u3 = (U) cVar2;
                int i4 = u3.f4668h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    u3.f4668h = i4 - Integer.MIN_VALUE;
                    Object obj = u3.f4666f;
                    aVar = Q1.a.f3113d;
                    i3 = u3.f4668h;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        u3.f4664d = cVar;
                        cVar3 = this.f4674a;
                        u3.f4665e = cVar3;
                        u3.f4668h = 1;
                        if (cVar3.c(null, u3) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (s2.a) u3.f4664d;
                            try {
                                I2.l.Q(obj);
                                ((s2.c) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((s2.c) aVar2).e(null);
                                throw th;
                            }
                        }
                        s2.c cVar4 = u3.f4665e;
                        Y1.c cVar5 = (Y1.c) u3.f4664d;
                        I2.l.Q(obj);
                        cVar3 = cVar4;
                        cVar = cVar5;
                    }
                    u3.f4664d = cVar3;
                    u3.f4665e = null;
                    u3.f4668h = 2;
                    j3 = cVar.j(u3);
                    if (j3 != aVar) {
                        return aVar;
                    }
                    s2.c cVar6 = cVar3;
                    obj = j3;
                    aVar2 = cVar6;
                    ((s2.c) aVar2).e(null);
                    return obj;
                }
            }
            u3.f4664d = cVar3;
            u3.f4665e = null;
            u3.f4668h = 2;
            j3 = cVar.j(u3);
            if (j3 != aVar) {
            }
        } catch (Throwable th3) {
            s2.c cVar7 = cVar3;
            th = th3;
            aVar2 = cVar7;
            ((s2.c) aVar2).e(null);
            throw th;
        }
        u3 = new U(this, cVar2);
        Object obj2 = u3.f4666f;
        aVar = Q1.a.f3113d;
        i3 = u3.f4668h;
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
    public final Object c(Y1.e eVar, R1.c cVar) {
        V v3;
        int i3;
        s2.c cVar2;
        Throwable th;
        boolean z3;
        if (cVar instanceof V) {
            v3 = (V) cVar;
            int i4 = v3.f4673h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                v3.f4673h = i4 - Integer.MIN_VALUE;
                Object obj = v3.f4671f;
                Object obj2 = Q1.a.f3113d;
                i3 = v3.f4673h;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    s2.c cVar3 = this.f4674a;
                    boolean d3 = cVar3.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d3);
                        v3.f4669d = cVar3;
                        v3.f4670e = d3;
                        v3.f4673h = 1;
                        Object g3 = eVar.g(valueOf, v3);
                        if (g3 == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = g3;
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
                    z3 = v3.f4670e;
                    cVar2 = v3.f4669d;
                    try {
                        I2.l.Q(obj);
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
        v3 = new V(this, cVar);
        Object obj3 = v3.f4671f;
        Object obj22 = Q1.a.f3113d;
        i3 = v3.f4673h;
        if (i3 != 0) {
        }
        if (z3) {
        }
        return obj3;
    }
}

package y3;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final i7.c f8933a = new i7.c();

    /* renamed from: b, reason: collision with root package name */
    public final q3.k f8934b = new q3.k(16);

    /* renamed from: c, reason: collision with root package name */
    public final d7.z f8935c = new d7.z(new c.b(2, 2, null));

    public r0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f8934b.f6119e).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.d(r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(p6.c cVar, i6.c cVar2) {
        p0 p0Var;
        int i;
        h6.a aVar;
        i7.c cVar3;
        Throwable th;
        i7.a aVar2;
        Object i8;
        try {
            if (cVar2 instanceof p0) {
                p0Var = (p0) cVar2;
                int i9 = p0Var.f8924k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    p0Var.f8924k = i9 - Integer.MIN_VALUE;
                    Object obj = p0Var.i;
                    i = p0Var.f8924k;
                    aVar = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        p0Var.f8921g = cVar;
                        cVar3 = this.f8933a;
                        p0Var.f8922h = cVar3;
                        p0Var.f8924k = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (i7.a) p0Var.f8921g;
                            try {
                                s6.a.K(obj);
                                ((i7.c) aVar2).f(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((i7.c) aVar2).f(null);
                                throw th;
                            }
                        }
                        i7.c cVar4 = p0Var.f8922h;
                        p6.c cVar5 = (p6.c) p0Var.f8921g;
                        s6.a.K(obj);
                        cVar3 = cVar4;
                        cVar = cVar5;
                    }
                    p0Var.f8921g = cVar3;
                    p0Var.f8922h = null;
                    p0Var.f8924k = 2;
                    i8 = cVar.i(p0Var);
                    if (i8 != aVar) {
                        i7.c cVar6 = cVar3;
                        obj = i8;
                        aVar2 = cVar6;
                        ((i7.c) aVar2).f(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            p0Var.f8921g = cVar3;
            p0Var.f8922h = null;
            p0Var.f8924k = 2;
            i8 = cVar.i(p0Var);
            if (i8 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            i7.c cVar7 = cVar3;
            th = th3;
            aVar2 = cVar7;
            ((i7.c) aVar2).f(null);
            throw th;
        }
        p0Var = new p0(this, cVar2);
        Object obj2 = p0Var.i;
        i = p0Var.f8924k;
        aVar = h6.a.f3204d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(p6.e eVar, i6.c cVar) {
        q0 q0Var;
        int i;
        i7.c cVar2;
        Throwable th;
        boolean z3;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i8 = q0Var.f8929k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                q0Var.f8929k = i8 - Integer.MIN_VALUE;
                Object obj = q0Var.i;
                i = q0Var.f8929k;
                if (i != 0) {
                    s6.a.K(obj);
                    i7.c cVar3 = this.f8933a;
                    boolean e8 = cVar3.e();
                    try {
                        Object valueOf = Boolean.valueOf(e8);
                        q0Var.f8926g = cVar3;
                        q0Var.f8927h = e8;
                        q0Var.f8929k = 1;
                        Object g3 = eVar.g(valueOf, q0Var);
                        Object obj2 = h6.a.f3204d;
                        if (g3 == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = g3;
                        z3 = e8;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z3 = e8;
                        if (z3) {
                            cVar2.f(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = q0Var.f8927h;
                    cVar2 = q0Var.f8926g;
                    try {
                        s6.a.K(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z3) {
                        }
                        throw th;
                    }
                }
                if (z3) {
                    cVar2.f(null);
                }
                return obj;
            }
        }
        q0Var = new q0(this, cVar);
        Object obj3 = q0Var.i;
        i = q0Var.f8929k;
        if (i != 0) {
        }
        if (z3) {
        }
        return obj3;
    }
}

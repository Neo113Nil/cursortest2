package g3;

import d0.p3;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final k7.c f4140a = new k7.c();

    /* renamed from: b, reason: collision with root package name */
    public final b6.c f4141b = new b6.c(17);

    /* renamed from: c, reason: collision with root package name */
    public final f7.a0 f4142c = new f7.a0(new p3(2, null, 2));

    public h0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f4141b.f1394g).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q6.c cVar, j6.c cVar2) {
        f0 f0Var;
        int i7;
        i6.a aVar;
        k7.c cVar3;
        Throwable th;
        k7.a aVar2;
        Object f9;
        try {
            if (cVar2 instanceof f0) {
                f0Var = (f0) cVar2;
                int i8 = f0Var.f4122j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    f0Var.f4122j = i8 - Integer.MIN_VALUE;
                    Object obj = f0Var.f4120h;
                    i7 = f0Var.f4122j;
                    aVar = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        f0Var.f4118f = cVar;
                        cVar3 = this.f4140a;
                        f0Var.f4119g = cVar3;
                        f0Var.f4122j = 1;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (k7.a) f0Var.f4118f;
                            try {
                                d6.a.e(obj);
                                ((k7.c) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((k7.c) aVar2).e(null);
                                throw th;
                            }
                        }
                        k7.c cVar4 = f0Var.f4119g;
                        q6.c cVar5 = (q6.c) f0Var.f4118f;
                        d6.a.e(obj);
                        cVar3 = cVar4;
                        cVar = cVar5;
                    }
                    f0Var.f4118f = cVar3;
                    f0Var.f4119g = null;
                    f0Var.f4122j = 2;
                    f9 = cVar.f(f0Var);
                    if (f9 != aVar) {
                        k7.c cVar6 = cVar3;
                        obj = f9;
                        aVar2 = cVar6;
                        ((k7.c) aVar2).e(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            f0Var.f4118f = cVar3;
            f0Var.f4119g = null;
            f0Var.f4122j = 2;
            f9 = cVar.f(f0Var);
            if (f9 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            k7.c cVar7 = cVar3;
            th = th3;
            aVar2 = cVar7;
            ((k7.c) aVar2).e(null);
            throw th;
        }
        f0Var = new f0(this, cVar2);
        Object obj2 = f0Var.f4120h;
        i7 = f0Var.f4122j;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q6.e eVar, j6.c cVar) {
        g0 g0Var;
        int i7;
        k7.c cVar2;
        Throwable th;
        boolean z8;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i8 = g0Var.f4131j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                g0Var.f4131j = i8 - Integer.MIN_VALUE;
                Object obj = g0Var.f4129h;
                i7 = g0Var.f4131j;
                if (i7 != 0) {
                    d6.a.e(obj);
                    k7.c cVar3 = this.f4140a;
                    boolean d8 = cVar3.d();
                    try {
                        Object valueOf = Boolean.valueOf(d8);
                        g0Var.f4127f = cVar3;
                        g0Var.f4128g = d8;
                        g0Var.f4131j = 1;
                        Object d9 = eVar.d(valueOf, g0Var);
                        Object obj2 = i6.a.f4956f;
                        if (d9 == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = d9;
                        z8 = d8;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z8 = d8;
                        if (z8) {
                            cVar2.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z8 = g0Var.f4128g;
                    cVar2 = g0Var.f4127f;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z8) {
                        }
                        throw th;
                    }
                }
                if (z8) {
                    cVar2.e(null);
                }
                return obj;
            }
        }
        g0Var = new g0(this, cVar);
        Object obj3 = g0Var.f4129h;
        i7 = g0Var.f4131j;
        if (i7 != 0) {
        }
        if (z8) {
        }
        return obj3;
    }
}

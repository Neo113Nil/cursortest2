package I;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.d f662a = g1.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final B.m f663b = new B.m(4);

    /* renamed from: c, reason: collision with root package name */
    public final B.m f664c = new B.m(new i0(2, null));

    public j0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f663b.f78f).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(P0.l lVar, J0.b bVar) {
        g0 g0Var;
        I0.a aVar;
        int i2;
        g1.d dVar;
        Throwable th;
        g1.a aVar2;
        Object i3;
        try {
            if (bVar instanceof g0) {
                g0Var = (g0) bVar;
                int i4 = g0Var.f646l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    g0Var.f646l = i4 - Integer.MIN_VALUE;
                    Object obj = g0Var.f644j;
                    aVar = I0.a.f733e;
                    i2 = g0Var.f646l;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        g0Var.f642h = lVar;
                        dVar = this.f662a;
                        g0Var.f643i = dVar;
                        g0Var.f646l = 1;
                        if (dVar.c(g0Var) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (g1.a) g0Var.f642h;
                            try {
                                i1.a.G(obj);
                                ((g1.d) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((g1.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        g1.d dVar2 = g0Var.f643i;
                        P0.l lVar2 = (P0.l) g0Var.f642h;
                        i1.a.G(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    g0Var.f642h = dVar;
                    g0Var.f643i = null;
                    g0Var.f646l = 2;
                    i3 = lVar.i(g0Var);
                    if (i3 != aVar) {
                        return aVar;
                    }
                    g1.d dVar3 = dVar;
                    obj = i3;
                    aVar2 = dVar3;
                    ((g1.d) aVar2).e(null);
                    return obj;
                }
            }
            g0Var.f642h = dVar;
            g0Var.f643i = null;
            g0Var.f646l = 2;
            i3 = lVar.i(g0Var);
            if (i3 != aVar) {
            }
        } catch (Throwable th3) {
            g1.d dVar4 = dVar;
            th = th3;
            aVar2 = dVar4;
            ((g1.d) aVar2).e(null);
            throw th;
        }
        g0Var = new g0(this, bVar);
        Object obj2 = g0Var.f644j;
        aVar = I0.a.f733e;
        i2 = g0Var.f646l;
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
    public final Object c(P0.p pVar, J0.b bVar) {
        h0 h0Var;
        int i2;
        g1.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof h0) {
            h0Var = (h0) bVar;
            int i3 = h0Var.f657l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.f657l = i3 - Integer.MIN_VALUE;
                Object obj = h0Var.f655j;
                Object obj2 = I0.a.f733e;
                i2 = h0Var.f657l;
                if (i2 != 0) {
                    i1.a.G(obj);
                    g1.d dVar2 = this.f662a;
                    boolean d2 = dVar2.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d2);
                        h0Var.f653h = dVar2;
                        h0Var.f654i = d2;
                        h0Var.f657l = 1;
                        Object h2 = pVar.h(valueOf, h0Var);
                        if (h2 == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = h2;
                        z2 = d2;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z2 = d2;
                        if (z2) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = h0Var.f654i;
                    dVar = h0Var.f653h;
                    try {
                        i1.a.G(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z2) {
                        }
                        throw th;
                    }
                }
                if (z2) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        h0Var = new h0(this, bVar);
        Object obj3 = h0Var.f655j;
        Object obj22 = I0.a.f733e;
        i2 = h0Var.f657l;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}

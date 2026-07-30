package D;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final U0.d f231a = U0.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final A.j f232b = new A.j(1);

    /* renamed from: c, reason: collision with root package name */
    public final A.j f233c = new A.j(new k0(2, null));

    public l0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f232b.f30f).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(E0.l lVar, y0.b bVar) {
        i0 i0Var;
        x0.a aVar;
        int i2;
        U0.d dVar;
        Throwable th;
        U0.a aVar2;
        Object i3;
        try {
            if (bVar instanceof i0) {
                i0Var = (i0) bVar;
                int i4 = i0Var.f209l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    i0Var.f209l = i4 - Integer.MIN_VALUE;
                    Object obj = i0Var.f207j;
                    aVar = x0.a.f3094e;
                    i2 = i0Var.f209l;
                    if (i2 != 0) {
                        o.g.z(obj);
                        i0Var.f205h = lVar;
                        dVar = this.f231a;
                        i0Var.f206i = dVar;
                        i0Var.f209l = 1;
                        if (dVar.c(i0Var) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (U0.a) i0Var.f205h;
                            try {
                                o.g.z(obj);
                                ((U0.d) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((U0.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        U0.d dVar2 = i0Var.f206i;
                        E0.l lVar2 = (E0.l) i0Var.f205h;
                        o.g.z(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    i0Var.f205h = dVar;
                    i0Var.f206i = null;
                    i0Var.f209l = 2;
                    i3 = lVar.i(i0Var);
                    if (i3 != aVar) {
                        return aVar;
                    }
                    U0.d dVar3 = dVar;
                    obj = i3;
                    aVar2 = dVar3;
                    ((U0.d) aVar2).e(null);
                    return obj;
                }
            }
            i0Var.f205h = dVar;
            i0Var.f206i = null;
            i0Var.f209l = 2;
            i3 = lVar.i(i0Var);
            if (i3 != aVar) {
            }
        } catch (Throwable th3) {
            U0.d dVar4 = dVar;
            th = th3;
            aVar2 = dVar4;
            ((U0.d) aVar2).e(null);
            throw th;
        }
        i0Var = new i0(this, bVar);
        Object obj2 = i0Var.f207j;
        aVar = x0.a.f3094e;
        i2 = i0Var.f209l;
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
    public final Object c(E0.p pVar, y0.b bVar) {
        j0 j0Var;
        int i2;
        U0.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof j0) {
            j0Var = (j0) bVar;
            int i3 = j0Var.f218l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j0Var.f218l = i3 - Integer.MIN_VALUE;
                Object obj = j0Var.f216j;
                Object obj2 = x0.a.f3094e;
                i2 = j0Var.f218l;
                if (i2 != 0) {
                    o.g.z(obj);
                    U0.d dVar2 = this.f231a;
                    boolean d2 = dVar2.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d2);
                        j0Var.f214h = dVar2;
                        j0Var.f215i = d2;
                        j0Var.f218l = 1;
                        Object f2 = pVar.f(valueOf, j0Var);
                        if (f2 == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = f2;
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
                    z2 = j0Var.f215i;
                    dVar = j0Var.f214h;
                    try {
                        o.g.z(obj);
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
        j0Var = new j0(this, bVar);
        Object obj3 = j0Var.f216j;
        Object obj22 = x0.a.f3094e;
        i2 = j0Var.f218l;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}

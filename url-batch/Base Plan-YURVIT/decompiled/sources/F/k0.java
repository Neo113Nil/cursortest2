package F;

import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1.d f391a = new e1.d();

    /* renamed from: b, reason: collision with root package name */
    public final B0.E f392b = new B0.E(2);

    /* renamed from: c, reason: collision with root package name */
    public final B0.E f393c = new B0.E(new j0(2, null));

    public k0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f392b.f20f).get());
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
    public final Object b(O0.l lVar, I0.b bVar) {
        h0 h0Var;
        int i2;
        H0.a aVar;
        e1.d dVar;
        Throwable th;
        e1.a aVar2;
        Object j2;
        try {
            if (bVar instanceof h0) {
                h0Var = (h0) bVar;
                int i3 = h0Var.f373l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    h0Var.f373l = i3 - Integer.MIN_VALUE;
                    Object obj = h0Var.f371j;
                    i2 = h0Var.f373l;
                    aVar = H0.a.f511e;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        h0Var.f369h = lVar;
                        dVar = this.f391a;
                        h0Var.f370i = dVar;
                        h0Var.f373l = 1;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (e1.a) h0Var.f369h;
                            try {
                                AbstractC0086a.I(obj);
                                ((e1.d) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((e1.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        e1.d dVar2 = h0Var.f370i;
                        O0.l lVar2 = (O0.l) h0Var.f369h;
                        AbstractC0086a.I(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    h0Var.f369h = dVar;
                    h0Var.f370i = null;
                    h0Var.f373l = 2;
                    j2 = lVar.j(h0Var);
                    if (j2 != aVar) {
                        e1.d dVar3 = dVar;
                        obj = j2;
                        aVar2 = dVar3;
                        ((e1.d) aVar2).e(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            h0Var.f369h = dVar;
            h0Var.f370i = null;
            h0Var.f373l = 2;
            j2 = lVar.j(h0Var);
            if (j2 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            e1.d dVar4 = dVar;
            th = th3;
            aVar2 = dVar4;
            ((e1.d) aVar2).e(null);
            throw th;
        }
        h0Var = new h0(this, bVar);
        Object obj2 = h0Var.f371j;
        i2 = h0Var.f373l;
        aVar = H0.a.f511e;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(O0.p pVar, I0.b bVar) {
        i0 i0Var;
        int i2;
        e1.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof i0) {
            i0Var = (i0) bVar;
            int i3 = i0Var.f378l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i0Var.f378l = i3 - Integer.MIN_VALUE;
                Object obj = i0Var.f376j;
                i2 = i0Var.f378l;
                if (i2 != 0) {
                    AbstractC0086a.I(obj);
                    e1.d dVar2 = this.f391a;
                    boolean d2 = dVar2.d();
                    try {
                        Object valueOf = Boolean.valueOf(d2);
                        i0Var.f374h = dVar2;
                        i0Var.f375i = d2;
                        i0Var.f378l = 1;
                        Object i4 = pVar.i(valueOf, i0Var);
                        Object obj2 = H0.a.f511e;
                        if (i4 == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = i4;
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
                    z2 = i0Var.f375i;
                    dVar = i0Var.f374h;
                    try {
                        AbstractC0086a.I(obj);
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
        i0Var = new i0(this, bVar);
        Object obj3 = i0Var.f376j;
        i2 = i0Var.f378l;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}

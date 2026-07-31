package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i6.i f2382e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(f fVar, p6.f fVar2) {
        this.f2381d = fVar;
        this.f2382e = (i6.i) fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v4, types: [i6.i, p6.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [i6.i, p6.f] */
    @Override // d7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g gVar, g6.c cVar) {
        j jVar;
        int i;
        h6.a aVar;
        k kVar;
        p0 p0Var;
        ?? r12;
        e7.q qVar;
        Throwable th;
        e7.q qVar2;
        ?? r9;
        try {
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i8 = jVar.f2375h;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    jVar.f2375h = i8 - Integer.MIN_VALUE;
                    Object obj = jVar.f2374g;
                    i = jVar.f2375h;
                    aVar = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        try {
                            f fVar = this.f2381d;
                            jVar.f2376j = this;
                            jVar.f2377k = gVar;
                            jVar.f2375h = 1;
                            if (fVar.c(gVar, jVar) != aVar) {
                                kVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            kVar = this;
                            p0Var = new p0(th);
                            r12 = kVar.f2382e;
                            jVar.f2376j = th;
                            jVar.f2377k = null;
                            jVar.f2375h = 2;
                            if (e0.c(p0Var, r12, th, jVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) jVar.f2376j;
                            s6.a.K(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qVar2 = (e7.q) jVar.f2376j;
                        try {
                            s6.a.K(obj);
                            qVar2.q();
                            return c6.m.f1757a;
                        } catch (Throwable th4) {
                            th = th4;
                            qVar2.q();
                            throw th;
                        }
                    }
                    gVar = jVar.f2377k;
                    kVar = (k) jVar.f2376j;
                    try {
                        s6.a.K(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        p0Var = new p0(th);
                        r12 = kVar.f2382e;
                        jVar.f2376j = th;
                        jVar.f2377k = null;
                        jVar.f2375h = 2;
                        if (e0.c(p0Var, r12, th, jVar) != aVar) {
                        }
                    }
                    g6.h hVar = jVar.f3460e;
                    q6.i.b(hVar);
                    qVar = new e7.q(gVar, hVar);
                    r9 = kVar.f2382e;
                    jVar.f2376j = qVar;
                    jVar.f2377k = null;
                    jVar.f2375h = 3;
                    if (r9.d(qVar, null, jVar) != aVar) {
                        qVar2 = qVar;
                        qVar2.q();
                        return c6.m.f1757a;
                    }
                    return aVar;
                }
            }
            r9 = kVar.f2382e;
            jVar.f2376j = qVar;
            jVar.f2377k = null;
            jVar.f2375h = 3;
            if (r9.d(qVar, null, jVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            qVar2 = qVar;
            qVar2.q();
            throw th;
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f2374g;
        i = jVar.f2375h;
        aVar = h6.a.f3204d;
        if (i != 0) {
        }
        g6.h hVar2 = jVar.f3460e;
        q6.i.b(hVar2);
        qVar = new e7.q(gVar, hVar2);
    }
}

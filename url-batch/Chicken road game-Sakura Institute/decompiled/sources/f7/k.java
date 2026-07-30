package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j6.i f3499g;

    /* JADX WARN: Multi-variable type inference failed */
    public k(f fVar, q6.f fVar2) {
        this.f3498f = fVar;
        this.f3499g = (j6.i) fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v4, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [j6.i, q6.f] */
    @Override // f7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g gVar, h6.d dVar) {
        j jVar;
        int i7;
        i6.a aVar;
        k kVar;
        s0 s0Var;
        ?? r12;
        g7.v vVar;
        Throwable th;
        g7.v vVar2;
        ?? r9;
        try {
            if (dVar instanceof j) {
                jVar = (j) dVar;
                int i8 = jVar.f3492g;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    jVar.f3492g = i8 - Integer.MIN_VALUE;
                    Object obj = jVar.f3491f;
                    i7 = jVar.f3492g;
                    aVar = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        try {
                            f fVar = this.f3498f;
                            jVar.f3494i = this;
                            jVar.f3495j = gVar;
                            jVar.f3492g = 1;
                            if (fVar.b(gVar, jVar) != aVar) {
                                kVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            kVar = this;
                            s0Var = new s0(th);
                            r12 = kVar.f3499g;
                            jVar.f3494i = th;
                            jVar.f3495j = null;
                            jVar.f3492g = 2;
                            if (f0.d(s0Var, r12, th, jVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            Throwable th3 = (Throwable) jVar.f3494i;
                            d6.a.e(obj);
                            throw th3;
                        }
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar2 = (g7.v) jVar.f3494i;
                        try {
                            d6.a.e(obj);
                            vVar2.releaseIntercepted();
                            return d6.z.f2639a;
                        } catch (Throwable th4) {
                            th = th4;
                            vVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    gVar = jVar.f3495j;
                    kVar = (k) jVar.f3494i;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        s0Var = new s0(th);
                        r12 = kVar.f3499g;
                        jVar.f3494i = th;
                        jVar.f3495j = null;
                        jVar.f3492g = 2;
                        if (f0.d(s0Var, r12, th, jVar) != aVar) {
                        }
                    }
                    vVar = new g7.v(gVar, jVar.getContext());
                    r9 = kVar.f3499g;
                    jVar.f3494i = vVar;
                    jVar.f3495j = null;
                    jVar.f3492g = 3;
                    if (r9.c(vVar, null, jVar) != aVar) {
                        vVar2 = vVar;
                        vVar2.releaseIntercepted();
                        return d6.z.f2639a;
                    }
                    return aVar;
                }
            }
            r9 = kVar.f3499g;
            jVar.f3494i = vVar;
            jVar.f3495j = null;
            jVar.f3492g = 3;
            if (r9.c(vVar, null, jVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            vVar2 = vVar;
            vVar2.releaseIntercepted();
            throw th;
        }
        jVar = new j(this, dVar);
        Object obj2 = jVar.f3491f;
        i7 = jVar.f3492g;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
        vVar = new g7.v(gVar, jVar.getContext());
    }
}

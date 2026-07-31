package e1;

/* renamed from: e1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.a f4712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z1.p f4713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z1.t f4714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0351N f4715d;

    public C0362k(s2.a aVar, Z1.p pVar, Z1.t tVar, C0351N c0351n) {
        this.f4712a = aVar;
        this.f4713b = pVar;
        this.f4714c = tVar;
        this.f4715d = c0351n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [s2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0358g c0358g, R1.c cVar) {
        C0361j c0361j;
        int i3;
        C0351N c0351n;
        s2.c cVar2;
        Z1.p pVar;
        Z1.t tVar;
        Y1.e eVar;
        s2.a aVar;
        s2.a aVar2;
        C0351N c0351n2;
        Object obj;
        Z1.t tVar2;
        try {
            if (cVar instanceof C0361j) {
                c0361j = (C0361j) cVar;
                int i4 = c0361j.f4711k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0361j.f4711k = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0361j.f4709i;
                    Q1.a aVar3 = Q1.a.f3113d;
                    i3 = c0361j.f4711k;
                    if (i3 != 0) {
                        I2.l.Q(obj2);
                        c0361j.f4704d = c0358g;
                        s2.a aVar4 = this.f4712a;
                        c0361j.f4705e = aVar4;
                        Z1.p pVar2 = this.f4713b;
                        c0361j.f4706f = pVar2;
                        Z1.t tVar3 = this.f4714c;
                        c0361j.f4707g = tVar3;
                        c0351n = this.f4715d;
                        c0361j.f4708h = c0351n;
                        c0361j.f4711k = 1;
                        cVar2 = (s2.c) aVar4;
                        if (cVar2.c(null, c0361j) == aVar3) {
                            return aVar3;
                        }
                        pVar = pVar2;
                        tVar = tVar3;
                        eVar = c0358g;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0361j.f4706f;
                                tVar2 = (Z1.t) c0361j.f4705e;
                                aVar = (s2.a) c0361j.f4704d;
                                try {
                                    I2.l.Q(obj2);
                                    tVar2.f3480d = obj;
                                    tVar = tVar2;
                                    Object obj3 = tVar.f3480d;
                                    ((s2.c) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((s2.c) aVar).e(null);
                                    throw th;
                                }
                            }
                            c0351n2 = (C0351N) c0361j.f4706f;
                            tVar = (Z1.t) c0361j.f4705e;
                            aVar2 = (s2.a) c0361j.f4704d;
                            try {
                                I2.l.Q(obj2);
                                if (!Z1.i.a(obj2, tVar.f3480d)) {
                                    aVar = aVar2;
                                    Object obj32 = tVar.f3480d;
                                    ((s2.c) aVar).e(null);
                                    return obj32;
                                }
                                c0361j.f4704d = aVar2;
                                c0361j.f4705e = tVar;
                                c0361j.f4706f = obj2;
                                c0361j.f4711k = 3;
                                if (c0351n2.i(obj2, false, c0361j) == aVar3) {
                                    return aVar3;
                                }
                                obj = obj2;
                                tVar2 = tVar;
                                aVar = aVar2;
                                tVar2.f3480d = obj;
                                tVar = tVar2;
                                Object obj322 = tVar.f3480d;
                                ((s2.c) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((s2.c) aVar).e(null);
                                throw th;
                            }
                        }
                        C0351N c0351n3 = c0361j.f4708h;
                        tVar = c0361j.f4707g;
                        pVar = (Z1.p) c0361j.f4706f;
                        ?? r7 = (s2.a) c0361j.f4705e;
                        Y1.e eVar2 = (Y1.e) c0361j.f4704d;
                        I2.l.Q(obj2);
                        cVar2 = r7;
                        c0351n = c0351n3;
                        eVar = eVar2;
                    }
                    if (!pVar.f3476d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = tVar.f3480d;
                    c0361j.f4704d = cVar2;
                    c0361j.f4705e = tVar;
                    c0361j.f4706f = c0351n;
                    c0361j.f4707g = null;
                    c0361j.f4708h = null;
                    c0361j.f4711k = 2;
                    Object g3 = eVar.g(obj4, c0361j);
                    if (g3 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = cVar2;
                    obj2 = g3;
                    c0351n2 = c0351n;
                    if (!Z1.i.a(obj2, tVar.f3480d)) {
                    }
                }
            }
            if (!pVar.f3476d) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((s2.c) aVar).e(null);
            throw th;
        }
        c0361j = new C0361j(this, cVar);
        Object obj22 = c0361j.f4709i;
        Q1.a aVar32 = Q1.a.f3113d;
        i3 = c0361j.f4711k;
        if (i3 != 0) {
        }
    }
}

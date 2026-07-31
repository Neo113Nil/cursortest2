package u;

import r.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: f, reason: collision with root package name */
    public static final r.l f7040f = new r.l(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final t1 f7041a;

    /* renamed from: b, reason: collision with root package name */
    public long f7042b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public r.l f7043c = f7040f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7044d;

    /* renamed from: e, reason: collision with root package name */
    public float f7045e;

    public l1(r.j jVar) {
        this.f7041a = jVar.a(r.d.f6262j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (m0.b.o(r14).d(r15, r0) == r9) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d3, B:21:0x0048, B:23:0x00a2, B:25:0x0076, B:28:0x00aa, B:31:0x00b5, B:34:0x0085), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d3, B:21:0x0048, B:23:0x00a2, B:25:0x0076, B:28:0x00aa, B:31:0x00b5, B:34:0x0085), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v9, types: [p6.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [p6.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:23:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b6.c0 c0Var, b0.a aVar, i6.c cVar) {
        k1 k1Var;
        int i;
        r.l lVar;
        final b6.c0 c0Var2;
        final float f6;
        b0.a aVar2;
        p6.a aVar3;
        try {
            if (cVar instanceof k1) {
                k1Var = (k1) cVar;
                int i8 = k1Var.f7038l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    k1Var.f7038l = i8 - Integer.MIN_VALUE;
                    Object obj = k1Var.f7036j;
                    i = k1Var.f7038l;
                    lVar = f7040f;
                    h6.a aVar4 = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        if (this.f7044d) {
                            w.a.c("animateToZero called while previous animation is running");
                        }
                        g6.h hVar = k1Var.f3460e;
                        q6.i.b(hVar);
                        y0.n nVar = (y0.n) hVar.l(y0.b.f8695s);
                        float u7 = nVar != null ? nVar.u() : 1.0f;
                        this.f7044d = true;
                        c0Var2 = c0Var;
                        f6 = u7;
                        aVar2 = aVar;
                        if (Math.abs(this.f7045e) >= 0.01f) {
                        }
                        aVar3 = aVar2;
                        if (Math.abs(this.f7045e) == 0.0f) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (p6.a) k1Var.f7034g;
                            s6.a.K(obj);
                            aVar3.b();
                            this.f7042b = Long.MIN_VALUE;
                            this.f7043c = lVar;
                            this.f7044d = false;
                            return c6.m.f1757a;
                        }
                        f6 = k1Var.i;
                        ?? r14 = k1Var.f7035h;
                        ?? r12 = (p6.c) k1Var.f7034g;
                        s6.a.K(obj);
                        aVar2 = r14;
                        c0Var2 = r12;
                        aVar2.b();
                        if (f6 == 0.0f) {
                            aVar3 = aVar2;
                            if (Math.abs(this.f7045e) == 0.0f) {
                                this.f7042b = Long.MIN_VALUE;
                                this.f7043c = lVar;
                                this.f7044d = false;
                                return c6.m.f1757a;
                            }
                            a0.v0 v0Var = new a0.v0(20, this, c0Var2);
                            k1Var.f7034g = aVar3;
                            k1Var.f7035h = null;
                            k1Var.f7038l = 2;
                            g6.h hVar2 = k1Var.f3460e;
                            q6.i.b(hVar2);
                        }
                        if (Math.abs(this.f7045e) >= 0.01f) {
                            p6.c cVar2 = new p6.c() { // from class: u.j1
                                @Override // p6.c
                                public final Object i(Object obj2) {
                                    long longValue = ((Long) obj2).longValue();
                                    l1 l1Var = l1.this;
                                    if (l1Var.f7042b == Long.MIN_VALUE) {
                                        l1Var.f7042b = longValue;
                                    }
                                    float f8 = l1Var.f7045e;
                                    r.l lVar2 = new r.l(f8);
                                    float f9 = f6;
                                    r.l lVar3 = l1.f7040f;
                                    long m7 = f9 == 0.0f ? l1Var.f7041a.m(new r.l(f8), lVar3, l1Var.f7043c) : s6.a.C((longValue - l1Var.f7042b) / f9);
                                    float f10 = ((r.l) l1Var.f7041a.k(m7, lVar2, lVar3, l1Var.f7043c)).f6337a;
                                    l1Var.f7043c = (r.l) l1Var.f7041a.l(m7, lVar2, lVar3, l1Var.f7043c);
                                    l1Var.f7042b = longValue;
                                    float f11 = l1Var.f7045e - f10;
                                    l1Var.f7045e = f10;
                                    c0Var2.i(Float.valueOf(f11));
                                    return c6.m.f1757a;
                                }
                            };
                            k1Var.f7034g = c0Var2;
                            k1Var.f7035h = aVar2;
                            k1Var.i = f6;
                            k1Var.f7038l = 1;
                            g6.h hVar3 = k1Var.f3460e;
                            q6.i.b(hVar3);
                            if (m0.b.o(hVar3).d(cVar2, k1Var) == aVar4) {
                                return aVar4;
                            }
                            aVar2.b();
                            if (f6 == 0.0f) {
                            }
                            if (Math.abs(this.f7045e) >= 0.01f) {
                            }
                        }
                        aVar3 = aVar2;
                        if (Math.abs(this.f7045e) == 0.0f) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.f7042b = Long.MIN_VALUE;
            this.f7043c = lVar;
            this.f7044d = false;
            throw th;
        }
        k1Var = new k1(this, cVar);
        Object obj2 = k1Var.f7036j;
        i = k1Var.f7038l;
        lVar = f7040f;
        h6.a aVar42 = h6.a.f3204d;
    }
}

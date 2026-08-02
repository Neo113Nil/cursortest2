package I;

/* renamed from: I.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.a f674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0.m f675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q0.o f676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f677d;

    public C0077l(g1.a aVar, Q0.m mVar, Q0.o oVar, P p2) {
        this.f674a = aVar;
        this.f675b = mVar;
        this.f676c = oVar;
        this.f677d = p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [g1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0073h c0073h, J0.b bVar) {
        C0076k c0076k;
        int i2;
        P p2;
        g1.d dVar;
        Q0.m mVar;
        Q0.o oVar;
        P0.p pVar;
        g1.a aVar;
        g1.a aVar2;
        P p3;
        Object obj;
        Q0.o oVar2;
        try {
            if (bVar instanceof C0076k) {
                c0076k = (C0076k) bVar;
                int i3 = c0076k.f672o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0076k.f672o = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0076k.f670m;
                    I0.a aVar3 = I0.a.f733e;
                    i2 = c0076k.f672o;
                    if (i2 != 0) {
                        i1.a.G(obj2);
                        c0076k.f665h = c0073h;
                        g1.a aVar4 = this.f674a;
                        c0076k.f666i = aVar4;
                        Q0.m mVar2 = this.f675b;
                        c0076k.f667j = mVar2;
                        Q0.o oVar3 = this.f676c;
                        c0076k.f668k = oVar3;
                        p2 = this.f677d;
                        c0076k.f669l = p2;
                        c0076k.f672o = 1;
                        dVar = (g1.d) aVar4;
                        if (dVar.c(c0076k) == aVar3) {
                            return aVar3;
                        }
                        mVar = mVar2;
                        oVar = oVar3;
                        pVar = c0073h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0076k.f667j;
                                oVar2 = (Q0.o) c0076k.f666i;
                                aVar = (g1.a) c0076k.f665h;
                                try {
                                    i1.a.G(obj2);
                                    oVar2.f983e = obj;
                                    oVar = oVar2;
                                    Object obj3 = oVar.f983e;
                                    ((g1.d) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((g1.d) aVar).e(null);
                                    throw th;
                                }
                            }
                            p3 = (P) c0076k.f667j;
                            oVar = (Q0.o) c0076k.f666i;
                            aVar2 = (g1.a) c0076k.f665h;
                            try {
                                i1.a.G(obj2);
                                if (!Q0.h.a(obj2, oVar.f983e)) {
                                    aVar = aVar2;
                                    Object obj32 = oVar.f983e;
                                    ((g1.d) aVar).e(null);
                                    return obj32;
                                }
                                c0076k.f665h = aVar2;
                                c0076k.f666i = oVar;
                                c0076k.f667j = obj2;
                                c0076k.f672o = 3;
                                if (p3.j(obj2, false, c0076k) == aVar3) {
                                    return aVar3;
                                }
                                obj = obj2;
                                oVar2 = oVar;
                                aVar = aVar2;
                                oVar2.f983e = obj;
                                oVar = oVar2;
                                Object obj322 = oVar.f983e;
                                ((g1.d) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((g1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        P p4 = c0076k.f669l;
                        oVar = c0076k.f668k;
                        mVar = (Q0.m) c0076k.f667j;
                        ?? r7 = (g1.a) c0076k.f666i;
                        P0.p pVar2 = (P0.p) c0076k.f665h;
                        i1.a.G(obj2);
                        dVar = r7;
                        p2 = p4;
                        pVar = pVar2;
                    }
                    if (!mVar.f981e) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = oVar.f983e;
                    c0076k.f665h = dVar;
                    c0076k.f666i = oVar;
                    c0076k.f667j = p2;
                    c0076k.f668k = null;
                    c0076k.f669l = null;
                    c0076k.f672o = 2;
                    Object h2 = pVar.h(obj4, c0076k);
                    if (h2 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = dVar;
                    obj2 = h2;
                    p3 = p2;
                    if (!Q0.h.a(obj2, oVar.f983e)) {
                    }
                }
            }
            if (!mVar.f981e) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((g1.d) aVar).e(null);
            throw th;
        }
        c0076k = new C0076k(this, bVar);
        Object obj22 = c0076k.f670m;
        I0.a aVar32 = I0.a.f733e;
        i2 = c0076k.f672o;
        if (i2 != 0) {
        }
    }
}

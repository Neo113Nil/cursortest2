package D;

/* renamed from: D.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0.a f227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0.n f228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F0.p f229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f230d;

    public C0011l(U0.a aVar, F0.n nVar, F0.p pVar, S s2) {
        this.f227a = aVar;
        this.f228b = nVar;
        this.f229c = pVar;
        this.f230d = s2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [U0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0007h c0007h, y0.b bVar) {
        C0010k c0010k;
        int i2;
        S s2;
        U0.d dVar;
        F0.n nVar;
        F0.p pVar;
        E0.p pVar2;
        U0.a aVar;
        U0.a aVar2;
        S s3;
        Object obj;
        F0.p pVar3;
        try {
            if (bVar instanceof C0010k) {
                c0010k = (C0010k) bVar;
                int i3 = c0010k.f226o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0010k.f226o = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0010k.f224m;
                    x0.a aVar3 = x0.a.f3094e;
                    i2 = c0010k.f226o;
                    if (i2 != 0) {
                        o.g.z(obj2);
                        c0010k.f219h = c0007h;
                        U0.a aVar4 = this.f227a;
                        c0010k.f220i = aVar4;
                        F0.n nVar2 = this.f228b;
                        c0010k.f221j = nVar2;
                        F0.p pVar4 = this.f229c;
                        c0010k.f222k = pVar4;
                        s2 = this.f230d;
                        c0010k.f223l = s2;
                        c0010k.f226o = 1;
                        dVar = (U0.d) aVar4;
                        if (dVar.c(c0010k) == aVar3) {
                            return aVar3;
                        }
                        nVar = nVar2;
                        pVar = pVar4;
                        pVar2 = c0007h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0010k.f221j;
                                pVar3 = (F0.p) c0010k.f220i;
                                aVar = (U0.a) c0010k.f219h;
                                try {
                                    o.g.z(obj2);
                                    pVar3.f324e = obj;
                                    pVar = pVar3;
                                    Object obj3 = pVar.f324e;
                                    ((U0.d) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((U0.d) aVar).e(null);
                                    throw th;
                                }
                            }
                            s3 = (S) c0010k.f221j;
                            pVar = (F0.p) c0010k.f220i;
                            aVar2 = (U0.a) c0010k.f219h;
                            try {
                                o.g.z(obj2);
                                if (!F0.i.a(obj2, pVar.f324e)) {
                                    aVar = aVar2;
                                    Object obj32 = pVar.f324e;
                                    ((U0.d) aVar).e(null);
                                    return obj32;
                                }
                                c0010k.f219h = aVar2;
                                c0010k.f220i = pVar;
                                c0010k.f221j = obj2;
                                c0010k.f226o = 3;
                                if (s3.k(obj2, false, c0010k) == aVar3) {
                                    return aVar3;
                                }
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.f324e = obj;
                                pVar = pVar3;
                                Object obj322 = pVar.f324e;
                                ((U0.d) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((U0.d) aVar).e(null);
                                throw th;
                            }
                        }
                        S s4 = c0010k.f223l;
                        pVar = c0010k.f222k;
                        nVar = (F0.n) c0010k.f221j;
                        ?? r7 = (U0.a) c0010k.f220i;
                        E0.p pVar5 = (E0.p) c0010k.f219h;
                        o.g.z(obj2);
                        dVar = r7;
                        s2 = s4;
                        pVar2 = pVar5;
                    }
                    if (!nVar.f322e) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.f324e;
                    c0010k.f219h = dVar;
                    c0010k.f220i = pVar;
                    c0010k.f221j = s2;
                    c0010k.f222k = null;
                    c0010k.f223l = null;
                    c0010k.f226o = 2;
                    Object f2 = pVar2.f(obj4, c0010k);
                    if (f2 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = dVar;
                    obj2 = f2;
                    s3 = s2;
                    if (!F0.i.a(obj2, pVar.f324e)) {
                    }
                }
            }
            if (!nVar.f322e) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((U0.d) aVar).e(null);
            throw th;
        }
        c0010k = new C0010k(this, bVar);
        Object obj22 = c0010k.f224m;
        x0.a aVar32 = x0.a.f3094e;
        i2 = c0010k.f226o;
        if (i2 != 0) {
        }
    }
}

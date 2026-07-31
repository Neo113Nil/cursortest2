package F;

import a.AbstractC0086a;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1.a f394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0.m f395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0.o f396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f397d;

    public C0030l(e1.a aVar, P0.m mVar, P0.o oVar, P p2) {
        this.f394a = aVar;
        this.f395b = mVar;
        this.f396c = oVar;
        this.f397d = p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [e1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0026h c0026h, I0.b bVar) {
        C0029k c0029k;
        int i2;
        P p2;
        e1.d dVar;
        P0.m mVar;
        P0.o oVar;
        O0.p pVar;
        e1.a aVar;
        e1.a aVar2;
        P p3;
        Object obj;
        try {
            if (bVar instanceof C0029k) {
                c0029k = (C0029k) bVar;
                int i3 = c0029k.f390o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0029k.f390o = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0029k.f388m;
                    i2 = c0029k.f390o;
                    H0.a aVar3 = H0.a.f511e;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj2);
                        c0029k.f383h = c0026h;
                        e1.a aVar4 = this.f394a;
                        c0029k.f384i = aVar4;
                        P0.m mVar2 = this.f395b;
                        c0029k.f385j = mVar2;
                        P0.o oVar2 = this.f396c;
                        c0029k.f386k = oVar2;
                        p2 = this.f397d;
                        c0029k.f387l = p2;
                        c0029k.f390o = 1;
                        dVar = (e1.d) aVar4;
                        if (dVar.c(c0029k) != aVar3) {
                            mVar = mVar2;
                            oVar = oVar2;
                            pVar = c0026h;
                        }
                        return aVar3;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0029k.f385j;
                            oVar = (P0.o) c0029k.f384i;
                            aVar = (e1.a) c0029k.f383h;
                            try {
                                AbstractC0086a.I(obj2);
                                oVar.f807e = obj;
                                Object obj3 = oVar.f807e;
                                ((e1.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((e1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        p3 = (P) c0029k.f385j;
                        oVar = (P0.o) c0029k.f384i;
                        aVar2 = (e1.a) c0029k.f383h;
                        try {
                            AbstractC0086a.I(obj2);
                            if (!P0.h.a(obj2, oVar.f807e)) {
                                aVar = aVar2;
                                Object obj32 = oVar.f807e;
                                ((e1.d) aVar).e(null);
                                return obj32;
                            }
                            c0029k.f383h = aVar2;
                            c0029k.f384i = oVar;
                            c0029k.f385j = obj2;
                            c0029k.f390o = 3;
                            if (p3.j(obj2, false, c0029k) != aVar3) {
                                obj = obj2;
                                aVar = aVar2;
                                oVar.f807e = obj;
                                Object obj322 = oVar.f807e;
                                ((e1.d) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((e1.d) aVar).e(null);
                            throw th;
                        }
                    }
                    P p4 = c0029k.f387l;
                    oVar = c0029k.f386k;
                    mVar = (P0.m) c0029k.f385j;
                    ?? r7 = (e1.a) c0029k.f384i;
                    O0.p pVar2 = (O0.p) c0029k.f383h;
                    AbstractC0086a.I(obj2);
                    p2 = p4;
                    pVar = pVar2;
                    dVar = r7;
                    if (!mVar.f805e) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = oVar.f807e;
                    c0029k.f383h = dVar;
                    c0029k.f384i = oVar;
                    c0029k.f385j = p2;
                    c0029k.f386k = null;
                    c0029k.f387l = null;
                    c0029k.f390o = 2;
                    Object i4 = pVar.i(obj4, c0029k);
                    if (i4 != aVar3) {
                        aVar2 = dVar;
                        obj2 = i4;
                        p3 = p2;
                        if (!P0.h.a(obj2, oVar.f807e)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!mVar.f805e) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((e1.d) aVar).e(null);
            throw th;
        }
        c0029k = new C0029k(this, bVar);
        Object obj22 = c0029k.f388m;
        i2 = c0029k.f390o;
        H0.a aVar32 = H0.a.f511e;
        if (i2 != 0) {
        }
    }
}

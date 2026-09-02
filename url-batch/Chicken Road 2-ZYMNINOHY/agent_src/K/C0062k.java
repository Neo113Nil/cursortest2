package K;

import g3.EnumC0441a;

/* renamed from: K.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F3.a f1380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f1381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f1382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1383d;

    public C0062k(F3.a aVar, kotlin.jvm.internal.n nVar, kotlin.jvm.internal.p pVar, M m4) {
        this.f1380a = aVar;
        this.f1381b = nVar;
        this.f1382c = pVar;
        this.f1383d = m4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [F3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0058g c0058g, h3.c cVar) {
        C0061j c0061j;
        int i4;
        M m4;
        F3.d dVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        o3.p pVar2;
        F3.a aVar;
        F3.a aVar2;
        M m5;
        Object obj;
        kotlin.jvm.internal.p pVar3;
        try {
            if (cVar instanceof C0061j) {
                c0061j = (C0061j) cVar;
                int i5 = c0061j.f1378h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0061j.f1378h = i5 - Integer.MIN_VALUE;
                    Object obj2 = c0061j.f1376f;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = c0061j.f1378h;
                    if (i4 != 0) {
                        O3.l.w(obj2);
                        c0061j.f1371a = c0058g;
                        F3.a aVar3 = this.f1380a;
                        c0061j.f1372b = aVar3;
                        kotlin.jvm.internal.n nVar2 = this.f1381b;
                        c0061j.f1373c = nVar2;
                        kotlin.jvm.internal.p pVar4 = this.f1382c;
                        c0061j.f1374d = pVar4;
                        m4 = this.f1383d;
                        c0061j.f1375e = m4;
                        c0061j.f1378h = 1;
                        dVar = (F3.d) aVar3;
                        if (dVar.c(c0061j) != enumC0441a) {
                            nVar = nVar2;
                            pVar = pVar4;
                            pVar2 = c0058g;
                        }
                        return enumC0441a;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0061j.f1373c;
                            pVar3 = (kotlin.jvm.internal.p) c0061j.f1372b;
                            aVar = (F3.a) c0061j.f1371a;
                            try {
                                O3.l.w(obj2);
                                pVar3.f14159a = obj;
                                pVar = pVar3;
                                Object obj3 = pVar.f14159a;
                                ((F3.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((F3.d) aVar).e(null);
                                throw th;
                            }
                        }
                        m5 = (M) c0061j.f1373c;
                        pVar = (kotlin.jvm.internal.p) c0061j.f1372b;
                        aVar2 = (F3.a) c0061j.f1371a;
                        try {
                            O3.l.w(obj2);
                            if (!kotlin.jvm.internal.i.a(obj2, pVar.f14159a)) {
                                aVar = aVar2;
                                Object obj32 = pVar.f14159a;
                                ((F3.d) aVar).e(null);
                                return obj32;
                            }
                            c0061j.f1371a = aVar2;
                            c0061j.f1372b = pVar;
                            c0061j.f1373c = obj2;
                            c0061j.f1378h = 3;
                            if (m5.j(obj2, false, c0061j) != enumC0441a) {
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.f14159a = obj;
                                pVar = pVar3;
                                Object obj322 = pVar.f14159a;
                                ((F3.d) aVar).e(null);
                                return obj322;
                            }
                            return enumC0441a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((F3.d) aVar).e(null);
                            throw th;
                        }
                    }
                    M m6 = c0061j.f1375e;
                    pVar = c0061j.f1374d;
                    nVar = (kotlin.jvm.internal.n) c0061j.f1373c;
                    ?? r7 = (F3.a) c0061j.f1372b;
                    o3.p pVar5 = (o3.p) c0061j.f1371a;
                    O3.l.w(obj2);
                    m4 = m6;
                    pVar2 = pVar5;
                    dVar = r7;
                    if (!nVar.f14157a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.f14159a;
                    c0061j.f1371a = dVar;
                    c0061j.f1372b = pVar;
                    c0061j.f1373c = m4;
                    c0061j.f1374d = null;
                    c0061j.f1375e = null;
                    c0061j.f1378h = 2;
                    Object invoke = pVar2.invoke(obj4, c0061j);
                    if (invoke != enumC0441a) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        m5 = m4;
                        if (!kotlin.jvm.internal.i.a(obj2, pVar.f14159a)) {
                        }
                    }
                    return enumC0441a;
                }
            }
            if (!nVar.f14157a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((F3.d) aVar).e(null);
            throw th;
        }
        c0061j = new C0061j(this, cVar);
        Object obj22 = c0061j.f1376f;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = c0061j.f1378h;
        if (i4 != 0) {
        }
    }
}

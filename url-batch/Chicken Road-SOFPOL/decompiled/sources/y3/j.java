package y3;

import m0.v1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7.a f8890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6.o f8891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6.s f8892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f8893d;

    public j(i7.a aVar, q6.o oVar, q6.s sVar, b0 b0Var) {
        this.f8890a = aVar;
        this.f8891b = oVar;
        this.f8892c = sVar;
        this.f8893d = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [i7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v1 v1Var, i6.c cVar) {
        i iVar;
        int i;
        b0 b0Var;
        i7.c cVar2;
        q6.o oVar;
        q6.s sVar;
        p6.e eVar;
        i7.a aVar;
        i7.a aVar2;
        b0 b0Var2;
        Object obj;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i8 = iVar.f8887n;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    iVar.f8887n = i8 - Integer.MIN_VALUE;
                    Object obj2 = iVar.f8885l;
                    i = iVar.f8887n;
                    h6.a aVar3 = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj2);
                        iVar.f8881g = v1Var;
                        i7.a aVar4 = this.f8890a;
                        iVar.f8882h = aVar4;
                        q6.o oVar2 = this.f8891b;
                        iVar.i = oVar2;
                        q6.s sVar2 = this.f8892c;
                        iVar.f8883j = sVar2;
                        b0Var = this.f8893d;
                        iVar.f8884k = b0Var;
                        iVar.f8887n = 1;
                        cVar2 = (i7.c) aVar4;
                        if (cVar2.d(iVar) != aVar3) {
                            oVar = oVar2;
                            sVar = sVar2;
                            eVar = v1Var;
                        }
                        return aVar3;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar.i;
                            sVar = (q6.s) iVar.f8882h;
                            aVar = (i7.a) iVar.f8881g;
                            try {
                                s6.a.K(obj2);
                                sVar.f6205d = obj;
                                Object obj3 = sVar.f6205d;
                                ((i7.c) aVar).f(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((i7.c) aVar).f(null);
                                throw th;
                            }
                        }
                        b0Var2 = (b0) iVar.i;
                        sVar = (q6.s) iVar.f8882h;
                        aVar2 = (i7.a) iVar.f8881g;
                        try {
                            s6.a.K(obj2);
                            if (!q6.i.a(obj2, sVar.f6205d)) {
                                aVar = aVar2;
                                Object obj32 = sVar.f6205d;
                                ((i7.c) aVar).f(null);
                                return obj32;
                            }
                            iVar.f8881g = aVar2;
                            iVar.f8882h = sVar;
                            iVar.i = obj2;
                            iVar.f8887n = 3;
                            if (b0Var2.j(obj2, false, iVar) != aVar3) {
                                obj = obj2;
                                aVar = aVar2;
                                sVar.f6205d = obj;
                                Object obj322 = sVar.f6205d;
                                ((i7.c) aVar).f(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((i7.c) aVar).f(null);
                            throw th;
                        }
                    }
                    b0 b0Var3 = iVar.f8884k;
                    sVar = iVar.f8883j;
                    oVar = (q6.o) iVar.i;
                    ?? r7 = (i7.a) iVar.f8882h;
                    p6.e eVar2 = (p6.e) iVar.f8881g;
                    s6.a.K(obj2);
                    b0Var = b0Var3;
                    eVar = eVar2;
                    cVar2 = r7;
                    if (!oVar.f6201d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = sVar.f6205d;
                    iVar.f8881g = cVar2;
                    iVar.f8882h = sVar;
                    iVar.i = b0Var;
                    iVar.f8883j = null;
                    iVar.f8884k = null;
                    iVar.f8887n = 2;
                    Object g3 = eVar.g(obj4, iVar);
                    if (g3 != aVar3) {
                        aVar2 = cVar2;
                        obj2 = g3;
                        b0Var2 = b0Var;
                        if (!q6.i.a(obj2, sVar.f6205d)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!oVar.f6201d) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((i7.c) aVar).f(null);
            throw th;
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.f8885l;
        i = iVar.f8887n;
        h6.a aVar32 = h6.a.f3204d;
        if (i != 0) {
        }
    }
}

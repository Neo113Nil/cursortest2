package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k7.a f4143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r6.r f4144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r6.v f4145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f4146d;

    public i(k7.a aVar, r6.r rVar, r6.v vVar, a0 a0Var) {
        this.f4143a = aVar;
        this.f4144b = rVar;
        this.f4145c = vVar;
        this.f4146d = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [k7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(androidx.room.d dVar, j6.c cVar) {
        h hVar;
        int i7;
        a0 a0Var;
        k7.c cVar2;
        r6.r rVar;
        r6.v vVar;
        q6.e eVar;
        k7.a aVar;
        k7.a aVar2;
        a0 a0Var2;
        Object obj;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i8 = hVar.f4139m;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    hVar.f4139m = i8 - Integer.MIN_VALUE;
                    Object obj2 = hVar.f4137k;
                    i7 = hVar.f4139m;
                    i6.a aVar3 = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj2);
                        hVar.f4132f = dVar;
                        k7.a aVar4 = this.f4143a;
                        hVar.f4133g = aVar4;
                        r6.r rVar2 = this.f4144b;
                        hVar.f4134h = rVar2;
                        r6.v vVar2 = this.f4145c;
                        hVar.f4135i = vVar2;
                        a0Var = this.f4146d;
                        hVar.f4136j = a0Var;
                        hVar.f4139m = 1;
                        cVar2 = (k7.c) aVar4;
                        if (cVar2.c(hVar) != aVar3) {
                            rVar = rVar2;
                            vVar = vVar2;
                            eVar = dVar;
                        }
                        return aVar3;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = hVar.f4134h;
                            vVar = (r6.v) hVar.f4133g;
                            aVar = (k7.a) hVar.f4132f;
                            try {
                                d6.a.e(obj2);
                                vVar.f7968f = obj;
                                Object obj3 = vVar.f7968f;
                                ((k7.c) aVar).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((k7.c) aVar).e(null);
                                throw th;
                            }
                        }
                        a0Var2 = (a0) hVar.f4134h;
                        vVar = (r6.v) hVar.f4133g;
                        aVar2 = (k7.a) hVar.f4132f;
                        try {
                            d6.a.e(obj2);
                            if (!r6.k.a(obj2, vVar.f7968f)) {
                                aVar = aVar2;
                                Object obj32 = vVar.f7968f;
                                ((k7.c) aVar).e(null);
                                return obj32;
                            }
                            hVar.f4132f = aVar2;
                            hVar.f4133g = vVar;
                            hVar.f4134h = obj2;
                            hVar.f4139m = 3;
                            if (a0Var2.h(obj2, false, hVar) != aVar3) {
                                obj = obj2;
                                aVar = aVar2;
                                vVar.f7968f = obj;
                                Object obj322 = vVar.f7968f;
                                ((k7.c) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((k7.c) aVar).e(null);
                            throw th;
                        }
                    }
                    a0 a0Var3 = hVar.f4136j;
                    vVar = hVar.f4135i;
                    rVar = (r6.r) hVar.f4134h;
                    ?? r72 = (k7.a) hVar.f4133g;
                    q6.e eVar2 = (q6.e) hVar.f4132f;
                    d6.a.e(obj2);
                    a0Var = a0Var3;
                    eVar = eVar2;
                    cVar2 = r72;
                    if (!rVar.f7964f) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = vVar.f7968f;
                    hVar.f4132f = cVar2;
                    hVar.f4133g = vVar;
                    hVar.f4134h = a0Var;
                    hVar.f4135i = null;
                    hVar.f4136j = null;
                    hVar.f4139m = 2;
                    Object d8 = eVar.d(obj4, hVar);
                    if (d8 != aVar3) {
                        aVar2 = cVar2;
                        obj2 = d8;
                        a0Var2 = a0Var;
                        if (!r6.k.a(obj2, vVar.f7968f)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!rVar.f7964f) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((k7.c) aVar).e(null);
            throw th;
        }
        hVar = new h(this, cVar);
        Object obj22 = hVar.f4137k;
        i7 = hVar.f4139m;
        i6.a aVar32 = i6.a.f4956f;
        if (i7 != 0) {
        }
    }
}

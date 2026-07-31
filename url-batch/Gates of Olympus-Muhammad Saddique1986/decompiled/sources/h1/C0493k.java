package h1;

import e2.InterfaceC0426e;

/* renamed from: h1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.a f6165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2.q f6166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.u f6167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f6168d;

    public C0493k(y2.a aVar, f2.q qVar, f2.u uVar, M m3) {
        this.f6165a = aVar;
        this.f6166b = qVar;
        this.f6167c = uVar;
        this.f6168d = m3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [y2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0489g c0489g, X1.c cVar) {
        C0492j c0492j;
        int i3;
        M m3;
        y2.c cVar2;
        f2.q qVar;
        f2.u uVar;
        InterfaceC0426e interfaceC0426e;
        y2.a aVar;
        y2.a aVar2;
        M m4;
        Object obj;
        f2.u uVar2;
        try {
            if (cVar instanceof C0492j) {
                c0492j = (C0492j) cVar;
                int i4 = c0492j.f6164n;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0492j.f6164n = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0492j.f6162l;
                    W1.a aVar3 = W1.a.f4608d;
                    i3 = c0492j.f6164n;
                    if (i3 != 0) {
                        R1.a.e(obj2);
                        c0492j.f6157g = c0489g;
                        y2.a aVar4 = this.f6165a;
                        c0492j.f6158h = aVar4;
                        f2.q qVar2 = this.f6166b;
                        c0492j.f6159i = qVar2;
                        f2.u uVar3 = this.f6167c;
                        c0492j.f6160j = uVar3;
                        m3 = this.f6168d;
                        c0492j.f6161k = m3;
                        c0492j.f6164n = 1;
                        cVar2 = (y2.c) aVar4;
                        if (cVar2.c(null, c0492j) == aVar3) {
                            return aVar3;
                        }
                        qVar = qVar2;
                        uVar = uVar3;
                        interfaceC0426e = c0489g;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0492j.f6159i;
                                uVar2 = (f2.u) c0492j.f6158h;
                                aVar = (y2.a) c0492j.f6157g;
                                try {
                                    R1.a.e(obj2);
                                    uVar2.f5832d = obj;
                                    uVar = uVar2;
                                    Object obj3 = uVar.f5832d;
                                    ((y2.c) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((y2.c) aVar).e(null);
                                    throw th;
                                }
                            }
                            m4 = (M) c0492j.f6159i;
                            uVar = (f2.u) c0492j.f6158h;
                            aVar2 = (y2.a) c0492j.f6157g;
                            try {
                                R1.a.e(obj2);
                                if (!f2.j.a(obj2, uVar.f5832d)) {
                                    aVar = aVar2;
                                    Object obj32 = uVar.f5832d;
                                    ((y2.c) aVar).e(null);
                                    return obj32;
                                }
                                c0492j.f6157g = aVar2;
                                c0492j.f6158h = uVar;
                                c0492j.f6159i = obj2;
                                c0492j.f6164n = 3;
                                if (m4.i(obj2, false, c0492j) == aVar3) {
                                    return aVar3;
                                }
                                obj = obj2;
                                uVar2 = uVar;
                                aVar = aVar2;
                                uVar2.f5832d = obj;
                                uVar = uVar2;
                                Object obj322 = uVar.f5832d;
                                ((y2.c) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((y2.c) aVar).e(null);
                                throw th;
                            }
                        }
                        M m5 = c0492j.f6161k;
                        uVar = c0492j.f6160j;
                        qVar = (f2.q) c0492j.f6159i;
                        ?? r7 = (y2.a) c0492j.f6158h;
                        InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) c0492j.f6157g;
                        R1.a.e(obj2);
                        cVar2 = r7;
                        m3 = m5;
                        interfaceC0426e = interfaceC0426e2;
                    }
                    if (!qVar.f5828d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = uVar.f5832d;
                    c0492j.f6157g = cVar2;
                    c0492j.f6158h = uVar;
                    c0492j.f6159i = m3;
                    c0492j.f6160j = null;
                    c0492j.f6161k = null;
                    c0492j.f6164n = 2;
                    Object h3 = interfaceC0426e.h(obj4, c0492j);
                    if (h3 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = cVar2;
                    obj2 = h3;
                    m4 = m3;
                    if (!f2.j.a(obj2, uVar.f5832d)) {
                    }
                }
            }
            if (!qVar.f5828d) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((y2.c) aVar).e(null);
            throw th;
        }
        c0492j = new C0492j(this, cVar);
        Object obj22 = c0492j.f6162l;
        W1.a aVar32 = W1.a.f4608d;
        i3 = c0492j.f6164n;
        if (i3 != 0) {
        }
    }
}

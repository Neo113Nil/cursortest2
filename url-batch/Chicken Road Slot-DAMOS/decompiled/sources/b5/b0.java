package b5;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z4.e0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 implements e0, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final u8.d f1108a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1109b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1110c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.collections.s f1111d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1112e;

    public b0(u8.d dVar, i iVar, boolean z10) {
        dVar.getClass();
        this.f1108a = dVar;
        this.f1109b = iVar;
        this.f1110c = z10;
        this.f1111d = new kotlin.collections.s();
    }

    @Override // z4.e0
    public final Boolean a(ld.a aVar) {
        if (this.f1112e) {
            g8.b.L(21, "Connection is recycled");
            throw null;
        }
        a aVar2 = (a) aVar.getContext().m(this.f1108a);
        if (aVar2 != null && aVar2.f1101e == this) {
            return Boolean.valueOf(!this.f1111d.isEmpty() || this.f1109b.f1140d.t());
        }
        g8.b.L(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // b5.c0
    public final i5.a b() {
        return this.f1109b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // z4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function1 function1, nd.c cVar) {
        a0 a0Var;
        int i3;
        i iVar;
        try {
            try {
                if (cVar instanceof a0) {
                    a0Var = (a0) cVar;
                    int i10 = a0Var.f1107t;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        a0Var.f1107t = i10 - Integer.MIN_VALUE;
                        Object obj = a0Var.f1105r;
                        md.a aVar = md.a.f6622d;
                        i3 = a0Var.f1107t;
                        if (i3 != 0) {
                            cf.c.M(obj);
                            if (this.f1112e) {
                                g8.b.L(21, "Connection is recycled");
                                throw null;
                            }
                            a aVar2 = (a) a0Var.getContext().m(this.f1108a);
                            if (aVar2 == null || aVar2.f1101e != this) {
                                g8.b.L(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            iVar = this.f1109b;
                            a0Var.f1102d = str;
                            a0Var.f1103e = function1;
                            a0Var.f1104i = iVar;
                            a0Var.f1107t = 1;
                            if (iVar.f1141e.a(a0Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i iVar2 = a0Var.f1104i;
                            function1 = a0Var.f1103e;
                            String str2 = a0Var.f1102d;
                            cf.c.M(obj);
                            iVar = iVar2;
                            str = str2;
                        }
                        v vVar = new v(this, this.f1109b.K(str));
                        Object invoke = function1.invoke(vVar);
                        cf.c.m(vVar, null);
                        return invoke;
                    }
                }
                Object invoke2 = function1.invoke(vVar);
                cf.c.m(vVar, null);
                return invoke2;
            } finally {
            }
            v vVar2 = new v(this, this.f1109b.K(str));
        } finally {
            iVar.d(null);
        }
        a0Var = new a0(this, cVar);
        Object obj2 = a0Var.f1105r;
        md.a aVar3 = md.a.f6622d;
        i3 = a0Var.f1107t;
        if (i3 != 0) {
        }
    }

    @Override // z4.e0
    public final Object d(z4.d0 d0Var, Function2 function2, nd.i iVar) {
        if (this.f1112e) {
            g8.b.L(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().m(this.f1108a);
        if (aVar != null && aVar.f1101e == this) {
            return g(d0Var, function2, iVar);
        }
        g8.b.L(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004e, B:14:0x0056, B:19:0x0061, B:20:0x008f, B:24:0x0069, B:25:0x006e, B:26:0x006f, B:27:0x0075, B:28:0x007b), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004e, B:14:0x0056, B:19:0x0061, B:20:0x008f, B:24:0x0069, B:25:0x006e, B:26:0x006f, B:27:0x0075, B:28:0x007b), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(z4.d0 d0Var, nd.c cVar) {
        x xVar;
        int i3;
        i iVar;
        kotlin.collections.s sVar = this.f1111d;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i10 = xVar.f1203s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    xVar.f1203s = i10 - Integer.MIN_VALUE;
                    Object obj = xVar.f1201i;
                    md.a aVar = md.a.f6622d;
                    i3 = xVar.f1203s;
                    i iVar2 = this.f1109b;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        xVar.f1199d = d0Var;
                        xVar.f1200e = iVar2;
                        xVar.f1203s = 1;
                        if (iVar2.f1141e.a(xVar) == aVar) {
                            return aVar;
                        }
                        iVar = iVar2;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i iVar3 = xVar.f1200e;
                        z4.d0 d0Var2 = xVar.f1199d;
                        cf.c.M(obj);
                        iVar = iVar3;
                        d0Var = d0Var2;
                    }
                    int i11 = sVar.f5583i;
                    if (sVar.isEmpty()) {
                        g8.b.y(iVar2, "SAVEPOINT '" + i11 + '\'');
                    } else {
                        int ordinal = d0Var.ordinal();
                        if (ordinal == 0) {
                            g8.b.y(iVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            g8.b.y(iVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new hd.j();
                            }
                            g8.b.y(iVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    sVar.addLast(new w(i11));
                    Unit unit = Unit.f5554a;
                    iVar.d(null);
                    return unit;
                }
            }
            int i112 = sVar.f5583i;
            if (sVar.isEmpty()) {
            }
            sVar.addLast(new w(i112));
            Unit unit2 = Unit.f5554a;
            iVar.d(null);
            return unit2;
        } catch (Throwable th) {
            iVar.d(null);
            throw th;
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f1201i;
        md.a aVar2 = md.a.f6622d;
        i3 = xVar.f1203s;
        i iVar22 = this.f1109b;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x004e, B:14:0x0054, B:16:0x005e, B:18:0x0067, B:19:0x00a4, B:23:0x006f, B:24:0x0084, B:26:0x008a, B:27:0x0090, B:28:0x00aa, B:29:0x00b1), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x004e, B:14:0x0054, B:16:0x005e, B:18:0x0067, B:19:0x00a4, B:23:0x006f, B:24:0x0084, B:26:0x008a, B:27:0x0090, B:28:0x00aa, B:29:0x00b1), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z10, nd.c cVar) {
        y yVar;
        int i3;
        i iVar;
        kotlin.collections.s sVar = this.f1111d;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i10 = yVar.f1208s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    yVar.f1208s = i10 - Integer.MIN_VALUE;
                    Object obj = yVar.f1206i;
                    md.a aVar = md.a.f6622d;
                    i3 = yVar.f1208s;
                    i iVar2 = this.f1109b;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        yVar.f1205e = iVar2;
                        yVar.f1204d = z10;
                        yVar.f1208s = 1;
                        if (iVar2.f1141e.a(yVar) == aVar) {
                            return aVar;
                        }
                        iVar = iVar2;
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z10 = yVar.f1204d;
                        iVar = yVar.f1205e;
                        cf.c.M(obj);
                    }
                    if (!sVar.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    w wVar = (w) kotlin.collections.d0.n(sVar);
                    if (z10) {
                        wVar.getClass();
                        if (sVar.isEmpty()) {
                            g8.b.y(iVar2, "END TRANSACTION");
                        } else {
                            g8.b.y(iVar2, "RELEASE SAVEPOINT '" + wVar.f1198a + '\'');
                        }
                    } else if (sVar.isEmpty()) {
                        g8.b.y(iVar2, "ROLLBACK TRANSACTION");
                    } else {
                        g8.b.y(iVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + wVar.f1198a + '\'');
                    }
                    Unit unit = Unit.f5554a;
                    iVar.d(null);
                    return unit;
                }
            }
            if (!sVar.isEmpty()) {
            }
        } catch (Throwable th) {
            iVar.d(null);
            throw th;
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.f1206i;
        md.a aVar2 = md.a.f6622d;
        i3 = yVar.f1208s;
        i iVar22 = this.f1109b;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(2:12|(1:(2:15|16)(3:18|19|20))(2:21|22))(2:23|24))(5:25|26|(1:28)|29|(1:32)(1:31)))(1:34))(3:38|(1:40)|41)|35|(4:37|(0)|29|(0))|32))|55|6|7|(0)(0)|35|(0)|32|(3:(0)|(1:47)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        if (e(r9, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if (f(false, r0) != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0042, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
    
        if (r10 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        hd.b.a(r10, r11);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        throw r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [b5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(z4.d0 th, Function2 function2, nd.c cVar) {
        z zVar;
        Object obj;
        md.a aVar;
        int i3;
        ?? r9;
        Function2 function22;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i10 = zVar.f1214t;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zVar.f1214t = i10 - Integer.MIN_VALUE;
                    obj = zVar.f1212r;
                    aVar = md.a.f6622d;
                    i3 = zVar.f1214t;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        z4.d0 d0Var = th;
                        if (th == null) {
                            d0Var = z4.d0.f10732d;
                        }
                        zVar.f1209d = function2;
                        zVar.f1214t = 1;
                        function22 = function2;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                ?? r92 = zVar.f1211i;
                                cf.c.M(obj);
                                th = r92;
                                function2 = function2;
                                boolean z10 = th != null;
                                zVar.f1209d = obj;
                                zVar.f1214t = 3;
                                return f(z10, zVar) != aVar ? aVar : obj;
                            }
                            if (i3 == 3) {
                                Object obj2 = zVar.f1209d;
                                cf.c.M(obj);
                                return obj2;
                            }
                            if (i3 == 4) {
                                Object obj3 = zVar.f1209d;
                                cf.c.M(obj);
                                return obj3;
                            }
                            if (i3 != 5) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th2 = zVar.f1210e;
                            cf.c.M(obj);
                            r9 = th2;
                            throw r9;
                        }
                        Function2 function23 = (Function2) zVar.f1209d;
                        cf.c.M(obj);
                        function22 = function23;
                    }
                    j jVar = new j(1, this);
                    zVar.f1209d = null;
                    zVar.f1211i = 1;
                    zVar.f1214t = 2;
                    obj = function22.invoke(jVar, zVar);
                    if (obj != aVar) {
                        th = 1;
                        function2 = function22;
                        if (th != null) {
                        }
                        zVar.f1209d = obj;
                        zVar.f1214t = 3;
                        if (f(z10, zVar) != aVar) {
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
            j jVar2 = new j(1, this);
            zVar.f1209d = null;
            zVar.f1211i = 1;
            zVar.f1214t = 2;
            obj = function22.invoke(jVar2, zVar);
            if (obj != aVar) {
            }
        } catch (Throwable th3) {
            th = th3;
            function2 = th;
            try {
                throw function2;
            } catch (Throwable th4) {
                zVar.f1209d = function2;
                zVar.f1210e = th4;
                zVar.f1214t = 5;
                r9 = th4;
            }
        }
        zVar = new z(this, cVar);
        obj = zVar.f1212r;
        aVar = md.a.f6622d;
        i3 = zVar.f1214t;
    }
}

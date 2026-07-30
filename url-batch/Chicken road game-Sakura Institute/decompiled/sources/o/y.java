package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6798a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (y0.c.b(l1.t.f(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l1.c0 c0Var, long j8, j6.c cVar) {
        s sVar;
        int i7;
        r6.u uVar;
        Object b9;
        i6.a aVar;
        Object obj;
        Object obj2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i8 = sVar.f6730i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f6730i = i8 - Integer.MIN_VALUE;
                Object obj3 = sVar.f6729h;
                i7 = sVar.f6730i;
                if (i7 != 0) {
                    d6.a.e(obj3);
                    if (!d(c0Var.f5784j.f5792w, j8)) {
                        uVar = new r6.u();
                        uVar.f7967f = j8;
                        sVar.f6727f = c0Var;
                        sVar.f6728g = uVar;
                        sVar.f6730i = 1;
                        b9 = c0Var.b(l1.k.f5816g, sVar);
                        aVar = i6.a.f4956f;
                        if (b9 != aVar) {
                        }
                    }
                    return null;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r6.u uVar2 = sVar.f6728g;
                l1.c0 c0Var2 = sVar.f6727f;
                d6.a.e(obj3);
                r6.u uVar3 = uVar2;
                c0Var = c0Var2;
                l1.j jVar = (l1.j) obj3;
                ?? r14 = jVar.f5812a;
                int size = r14.size();
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        obj = null;
                        break;
                    }
                    obj = r14.get(i10);
                    if (l1.u.a(((l1.v) obj).f5830a, uVar3.f7967f)) {
                        break;
                    }
                    i10++;
                }
                l1.v vVar = (l1.v) obj;
                if (vVar == null) {
                    if (l1.t.c(vVar)) {
                        ?? r142 = jVar.f5812a;
                        int size2 = r142.size();
                        while (true) {
                            if (i9 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = r142.get(i9);
                            if (((l1.v) obj2).f5833d) {
                                break;
                            }
                            i9++;
                        }
                        l1.v vVar2 = (l1.v) obj2;
                        if (vVar2 != null) {
                            uVar3.f7967f = vVar2.f5830a;
                            uVar = uVar3;
                            sVar.f6727f = c0Var;
                            sVar.f6728g = uVar;
                            sVar.f6730i = 1;
                            b9 = c0Var.b(l1.k.f5816g, sVar);
                            aVar = i6.a.f4956f;
                            if (b9 != aVar) {
                                return aVar;
                            }
                            r6.u uVar4 = uVar;
                            obj3 = b9;
                            uVar3 = uVar4;
                        }
                    }
                    l1.j jVar2 = (l1.j) obj3;
                    ?? r143 = jVar2.f5812a;
                    int size3 = r143.size();
                    int i92 = 0;
                    int i102 = 0;
                    while (true) {
                        if (i102 < size3) {
                        }
                        i102++;
                    }
                    l1.v vVar3 = (l1.v) obj;
                    if (vVar3 == null) {
                        vVar3 = null;
                    }
                }
                if (vVar3 == null || vVar3.b()) {
                    return null;
                }
                return vVar3;
            }
        }
        sVar = new s(cVar);
        Object obj32 = sVar.f6729h;
        i7 = sVar.f6730i;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l1.c0 c0Var, long j8, j6.c cVar) {
        t tVar;
        int i7;
        Object obj;
        l1.v vVar;
        r6.v vVar2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i8 = tVar.f6742i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                tVar.f6742i = i8 - Integer.MIN_VALUE;
                Object obj2 = tVar.f6741h;
                i7 = tVar.f6742i;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    if (!d(c0Var.f5784j.f5792w, j8)) {
                        ?? r11 = c0Var.f5784j.f5792w.f5812a;
                        int size = r11.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size) {
                                obj = null;
                                break;
                            }
                            obj = r11.get(i9);
                            if (l1.u.a(((l1.v) obj).f5830a, j8)) {
                                break;
                            }
                            i9++;
                        }
                        vVar = (l1.v) obj;
                        if (vVar != null) {
                            r6.v vVar3 = new r6.v();
                            r6.v vVar4 = new r6.v();
                            vVar4.f7968f = vVar;
                            long c4 = c0Var.e().c();
                            try {
                                q6.e uVar = new u(vVar4, vVar3, null);
                                tVar.f6739f = vVar;
                                tVar.f6740g = vVar3;
                                tVar.f6742i = 1;
                                Object f9 = c0Var.f(c4, uVar, tVar);
                                Object obj3 = i6.a.f4956f;
                                if (f9 == obj3) {
                                    return obj3;
                                }
                            } catch (l1.l unused) {
                                vVar2 = vVar3;
                            }
                        }
                    }
                    return null;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar2 = tVar.f6740g;
                vVar = tVar.f6739f;
                try {
                    d6.a.e(obj2);
                    return null;
                } catch (l1.l unused2) {
                }
                l1.v vVar5 = (l1.v) vVar2.f7968f;
                return vVar5 != null ? vVar : vVar5;
            }
        }
        tVar = new t(cVar);
        Object obj22 = tVar.f6741h;
        i7 = tVar.f6742i;
        if (i7 != 0) {
        }
        l1.v vVar52 = (l1.v) vVar2.f7968f;
        if (vVar52 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(l1.c0 c0Var, long j8, q6.c cVar, j6.c cVar2) {
        x xVar;
        int i7;
        i6.a aVar;
        l1.v vVar;
        if (cVar2 instanceof x) {
            xVar = (x) cVar2;
            int i8 = xVar.f6791i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                xVar.f6791i = i8 - Integer.MIN_VALUE;
                Object obj = xVar.f6790h;
                i7 = xVar.f6791i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    xVar.f6788f = c0Var;
                    xVar.f6789g = cVar;
                    xVar.f6791i = 1;
                    obj = a(c0Var, j8, xVar);
                    aVar = i6.a.f4956f;
                    if (obj == aVar) {
                    }
                    vVar = (l1.v) obj;
                    if (vVar == null) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q6.c cVar3 = xVar.f6789g;
                    l1.c0 c0Var2 = xVar.f6788f;
                    d6.a.e(obj);
                    cVar = cVar3;
                    c0Var = c0Var2;
                    vVar = (l1.v) obj;
                    if (vVar == null) {
                        if (l1.t.c(vVar)) {
                            return Boolean.TRUE;
                        }
                        cVar.f(vVar);
                        j8 = vVar.f5830a;
                        xVar.f6788f = c0Var;
                        xVar.f6789g = cVar;
                        xVar.f6791i = 1;
                        obj = a(c0Var, j8, xVar);
                        aVar = i6.a.f4956f;
                        if (obj == aVar) {
                            return aVar;
                        }
                        vVar = (l1.v) obj;
                        if (vVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        xVar = new x(cVar2);
        Object obj2 = xVar.f6790h;
        i7 = xVar.f6791i;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(l1.j jVar, long j8) {
        Object obj;
        ?? r62 = jVar.f5812a;
        int size = r62.size();
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i7);
            if (l1.u.a(((l1.v) obj).f5830a, j8)) {
                break;
            }
            i7++;
        }
        l1.v vVar = (l1.v) obj;
        if (vVar != null && vVar.f5833d) {
            z8 = true;
        }
        return true ^ z8;
    }
}

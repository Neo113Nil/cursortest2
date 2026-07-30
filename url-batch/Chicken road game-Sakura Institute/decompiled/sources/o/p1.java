package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f6716a = new f0(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l1.c0 c0Var, j6.a aVar) {
        h1 h1Var;
        int i7;
        i6.a aVar2;
        int size;
        int i8;
        int i9;
        int size2;
        if (aVar instanceof h1) {
            h1Var = (h1) aVar;
            int i10 = h1Var.f6634h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h1Var.f6634h = i10 - Integer.MIN_VALUE;
                Object obj = h1Var.f6633g;
                i7 = h1Var.f6634h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    h1Var.f6632f = c0Var;
                    h1Var.f6634h = 1;
                    obj = c0Var.b(l1.k.f5816g, h1Var);
                    aVar2 = i6.a.f4956f;
                    if (obj == aVar2) {
                    }
                    l1.j jVar = (l1.j) obj;
                    ?? r12 = jVar.f5812a;
                    size = r12.size();
                    i8 = 0;
                    while (i9 < size) {
                    }
                    ?? r8 = jVar.f5812a;
                    size2 = r8.size();
                    while (i8 < size2) {
                    }
                    return d6.z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = h1Var.f6632f;
                d6.a.e(obj);
                l1.j jVar2 = (l1.j) obj;
                ?? r122 = jVar2.f5812a;
                size = r122.size();
                i8 = 0;
                for (i9 = 0; i9 < size; i9++) {
                    ((l1.v) r122.get(i9)).a();
                }
                ?? r82 = jVar2.f5812a;
                size2 = r82.size();
                while (i8 < size2) {
                    if (((l1.v) r82.get(i8)).f5833d) {
                        h1Var.f6632f = c0Var;
                        h1Var.f6634h = 1;
                        obj = c0Var.b(l1.k.f5816g, h1Var);
                        aVar2 = i6.a.f4956f;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        l1.j jVar22 = (l1.j) obj;
                        ?? r1222 = jVar22.f5812a;
                        size = r1222.size();
                        i8 = 0;
                        while (i9 < size) {
                        }
                        ?? r822 = jVar22.f5812a;
                        size2 = r822.size();
                        while (i8 < size2) {
                        }
                    } else {
                        i8++;
                    }
                }
                return d6.z.f2639a;
            }
        }
        h1Var = new h1(aVar);
        Object obj2 = h1Var.f6633g;
        i7 = h1Var.f6634h;
        if (i7 != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(l1.c0 r9, boolean r10, l1.k r11, j6.a r12) {
        /*
            boolean r0 = r12 instanceof o.g1
            if (r0 == 0) goto L13
            r0 = r12
            o.g1 r0 = (o.g1) r0
            int r1 = r0.f6626j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6626j = r1
            goto L18
        L13:
            o.g1 r0 = new o.g1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f6625i
            int r1 = r0.f6626j
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r9 = r0.f6624h
            l1.k r10 = r0.f6623g
            l1.c0 r11 = r0.f6622f
            d6.a.e(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            d6.a.e(r12)
        L3a:
            r0.f6622f = r9
            r0.f6623g = r11
            r0.f6624h = r10
            r0.f6626j = r2
            java.lang.Object r12 = r9.b(r11, r0)
            i6.a r1 = i6.a.f4956f
            if (r12 != r1) goto L4b
            return r1
        L4b:
            l1.j r12 = (l1.j) r12
            java.lang.Object r1 = r12.f5812a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r3) goto L7c
            java.lang.Object r6 = r1.get(r5)
            l1.v r6 = (l1.v) r6
            if (r10 == 0) goto L71
            boolean r7 = r6.b()
            if (r7 != 0) goto L6f
            boolean r7 = r6.f5837h
            if (r7 != 0) goto L6f
            boolean r6 = r6.f5833d
            if (r6 == 0) goto L6f
            r6 = r2
            goto L75
        L6f:
            r6 = r4
            goto L75
        L71:
            boolean r6 = l1.t.a(r6)
        L75:
            if (r6 != 0) goto L79
            r1 = r4
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L55
        L7c:
            r1 = r2
        L7d:
            if (r1 == 0) goto L3a
            java.lang.Object r9 = r12.f5812a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p1.b(l1.c0, boolean, l1.k, j6.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009e -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(l1.c0 c0Var, l1.k kVar, j6.a aVar) {
        o1 o1Var;
        int i7;
        l1.c0 c0Var2;
        l1.k kVar2;
        int size;
        int i8;
        if (aVar instanceof o1) {
            o1Var = (o1) aVar;
            int i9 = o1Var.f6714i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                o1Var.f6714i = i9 - Integer.MIN_VALUE;
                Object obj = o1Var.f6713h;
                i7 = o1Var.f6714i;
                i6.a aVar2 = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    o1Var.f6711f = c0Var;
                    o1Var.f6712g = kVar;
                    o1Var.f6714i = 1;
                    obj = c0Var.b(kVar, o1Var);
                    if (obj != aVar2) {
                    }
                    return aVar2;
                }
                if (i7 == 1) {
                    kVar2 = o1Var.f6712g;
                    c0Var2 = o1Var.f6711f;
                    d6.a.e(obj);
                    ?? r15 = ((l1.j) obj).f5812a;
                    size = r15.size();
                    while (i8 < size) {
                    }
                    return r15.get(0);
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar2 = o1Var.f6712g;
                c0Var2 = o1Var.f6711f;
                d6.a.e(obj);
                l1.c0 c0Var3 = c0Var2;
                kVar = kVar2;
                c0Var = c0Var3;
                ?? r152 = ((l1.j) obj).f5812a;
                int size2 = r152.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (((l1.v) r152.get(i10)).b()) {
                        return null;
                    }
                }
                o1Var.f6711f = c0Var;
                o1Var.f6712g = kVar;
                o1Var.f6714i = 1;
                obj = c0Var.b(kVar, o1Var);
                if (obj != aVar2) {
                    l1.k kVar3 = kVar;
                    c0Var2 = c0Var;
                    kVar2 = kVar3;
                    ?? r153 = ((l1.j) obj).f5812a;
                    size = r153.size();
                    for (i8 = 0; i8 < size; i8++) {
                        if (!l1.t.b((l1.v) r153.get(i8))) {
                            int size3 = r153.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                l1.v vVar = (l1.v) r153.get(i11);
                                if (vVar.b() || l1.t.e(vVar, c0Var2.f5784j.A, c0Var2.c())) {
                                    return null;
                                }
                            }
                            o1Var.f6711f = c0Var2;
                            o1Var.f6712g = kVar2;
                            o1Var.f6714i = 2;
                            obj = c0Var2.b(l1.k.f5817h, o1Var);
                        }
                    }
                    return r153.get(0);
                }
                return aVar2;
            }
        }
        o1Var = new o1(aVar);
        Object obj2 = o1Var.f6713h;
        i7 = o1Var.f6714i;
        i6.a aVar22 = i6.a.f4956f;
        if (i7 != 0) {
        }
    }
}

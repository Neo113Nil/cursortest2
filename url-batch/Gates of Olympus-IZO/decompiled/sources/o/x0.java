package o;

import t0.AbstractC0898f;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final F f6662a = new F(3, null, 2);

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
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(n0.t r10, boolean r11, n0.h r12, R1.a r13) {
        /*
            boolean r0 = r13 instanceof o.p0
            if (r0 == 0) goto L13
            r0 = r13
            o.p0 r0 = (o.p0) r0
            int r1 = r0.f6607h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6607h = r1
            goto L18
        L13:
            o.p0 r0 = new o.p0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6606g
            Q1.a r1 = Q1.a.f3113d
            int r2 = r0.f6607h
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f6605f
            n0.h r11 = r0.f6604e
            n0.t r12 = r0.f6603d
            I2.l.Q(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            I2.l.Q(r13)
        L3c:
            r0.f6603d = r10
            r0.f6604e = r12
            r0.f6605f = r11
            r0.f6607h = r3
            java.lang.Object r13 = r10.b(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            n0.g r13 = (n0.g) r13
            java.lang.Object r2 = r13.f6214a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            n0.m r7 = (n0.m) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f6230h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f6226d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = n0.s.a(r7)
        L75:
            if (r7 != 0) goto L79
            r2 = r5
            goto L7d
        L79:
            int r6 = r6 + 1
            goto L55
        L7c:
            r2 = r3
        L7d:
            if (r2 == 0) goto L3c
            java.lang.Object r10 = r13.f6214a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x0.a(n0.t, boolean, n0.h, R1.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0155 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n0.t tVar, n0.h hVar, R1.a aVar) {
        w0 w0Var;
        int i3;
        n0.t tVar2;
        w0 w0Var2;
        n0.h hVar2;
        n0.t tVar3;
        n0.h hVar3;
        n0.g gVar;
        int size;
        int i4;
        ?? r12;
        int size2;
        int i5;
        char c3;
        Q1.a aVar2;
        boolean z3;
        Object b2;
        int size3;
        int i6;
        if (aVar instanceof w0) {
            w0Var = (w0) aVar;
            int i7 = w0Var.f6652g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                w0Var.f6652g = i7 - Integer.MIN_VALUE;
                Object obj = w0Var.f6651f;
                Q1.a aVar3 = Q1.a.f3113d;
                i3 = w0Var.f6652g;
                int i8 = 1;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    tVar2 = tVar;
                    w0Var2 = w0Var;
                    hVar2 = hVar;
                    w0Var2.f6649d = tVar2;
                    w0Var2.f6650e = hVar2;
                    w0Var2.f6652g = i8;
                    b2 = tVar2.b(hVar2, w0Var2);
                    if (b2 != aVar3) {
                    }
                } else if (i3 == 1) {
                    hVar3 = w0Var.f6650e;
                    tVar3 = w0Var.f6649d;
                    I2.l.Q(obj);
                    gVar = (n0.g) obj;
                    ?? r9 = gVar.f6214a;
                    size = r9.size();
                    i4 = 0;
                    while (true) {
                        r12 = gVar.f6214a;
                        if (i4 < size) {
                        }
                        i4++;
                    }
                    size2 = r12.size();
                    i5 = 0;
                    while (i5 < size2) {
                    }
                    Q1.a aVar4 = aVar3;
                    n0.h hVar4 = n0.h.f6218f;
                    w0Var.f6649d = tVar3;
                    w0Var.f6650e = hVar3;
                    c3 = 2;
                    w0Var.f6652g = 2;
                    obj = tVar3.b(hVar4, w0Var);
                    aVar2 = aVar4;
                    if (obj == aVar2) {
                    }
                    n0.h hVar5 = hVar3;
                    w0Var2 = w0Var;
                    hVar2 = hVar5;
                    ?? r02 = ((n0.g) obj).f6214a;
                    size3 = r02.size();
                    while (i6 < size3) {
                    }
                    aVar3 = aVar2;
                    tVar2 = tVar3;
                    i8 = 1;
                    w0Var2.f6649d = tVar2;
                    w0Var2.f6650e = hVar2;
                    w0Var2.f6652g = i8;
                    b2 = tVar2.b(hVar2, w0Var2);
                    if (b2 != aVar3) {
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar3 = w0Var.f6650e;
                    tVar3 = w0Var.f6649d;
                    I2.l.Q(obj);
                    aVar2 = aVar3;
                    c3 = 2;
                    n0.h hVar52 = hVar3;
                    w0Var2 = w0Var;
                    hVar2 = hVar52;
                    ?? r022 = ((n0.g) obj).f6214a;
                    size3 = r022.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        if (((n0.m) r022.get(i6)).b()) {
                            return null;
                        }
                    }
                    aVar3 = aVar2;
                    tVar2 = tVar3;
                    i8 = 1;
                    w0Var2.f6649d = tVar2;
                    w0Var2.f6650e = hVar2;
                    w0Var2.f6652g = i8;
                    b2 = tVar2.b(hVar2, w0Var2);
                    if (b2 != aVar3) {
                        return aVar3;
                    }
                    tVar3 = tVar2;
                    obj = b2;
                    w0 w0Var3 = w0Var2;
                    hVar3 = hVar2;
                    w0Var = w0Var3;
                    gVar = (n0.g) obj;
                    ?? r92 = gVar.f6214a;
                    size = r92.size();
                    i4 = 0;
                    while (true) {
                        r12 = gVar.f6214a;
                        if (i4 < size) {
                            return r12.get(0);
                        }
                        n0.m mVar = (n0.m) r92.get(i4);
                        if (mVar.b() || !mVar.f6230h || mVar.f6226d) {
                            break;
                        }
                        i4++;
                    }
                    size2 = r12.size();
                    i5 = 0;
                    while (i5 < size2) {
                        n0.m mVar2 = (n0.m) r12.get(i5);
                        if (mVar2.b()) {
                            return null;
                        }
                        long j3 = tVar3.f6258h.f6270z;
                        n0.v vVar = tVar3.f6258h;
                        vVar.getClass();
                        long C = vVar.C(AbstractC0898f.t(vVar).f7732u.c());
                        long j4 = vVar.f6270z;
                        Q1.a aVar5 = aVar3;
                        n0.h hVar6 = hVar3;
                        long h3 = I2.d.h(Math.max(0.0f, a0.f.d(C) - ((int) (j4 >> 32))) / 2.0f, Math.max(0.0f, a0.f.b(C) - ((int) (j4 & 4294967295L))) / 2.0f);
                        boolean z4 = true;
                        if (n0.s.d(mVar2.f6231i, 1)) {
                            long j5 = mVar2.f6225c;
                            float d3 = a0.c.d(j5);
                            float e3 = a0.c.e(j5);
                            float f3 = -a0.f.d(h3);
                            float d4 = a0.f.d(h3) + ((int) (j3 >> 32));
                            float f4 = -a0.f.b(h3);
                            float b3 = a0.f.b(h3) + ((int) (j3 & 4294967295L));
                            if (d3 >= f3 && d3 <= d4 && e3 >= f4 && e3 <= b3) {
                                z4 = false;
                            }
                            z3 = z4;
                        } else {
                            z3 = n0.s.e(mVar2, j3);
                        }
                        if (z3) {
                            return null;
                        }
                        i5++;
                        hVar3 = hVar6;
                        aVar3 = aVar5;
                    }
                    Q1.a aVar42 = aVar3;
                    n0.h hVar42 = n0.h.f6218f;
                    w0Var.f6649d = tVar3;
                    w0Var.f6650e = hVar3;
                    c3 = 2;
                    w0Var.f6652g = 2;
                    obj = tVar3.b(hVar42, w0Var);
                    aVar2 = aVar42;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    n0.h hVar522 = hVar3;
                    w0Var2 = w0Var;
                    hVar2 = hVar522;
                    ?? r0222 = ((n0.g) obj).f6214a;
                    size3 = r0222.size();
                    while (i6 < size3) {
                    }
                    aVar3 = aVar2;
                    tVar2 = tVar3;
                    i8 = 1;
                    w0Var2.f6649d = tVar2;
                    w0Var2.f6650e = hVar2;
                    w0Var2.f6652g = i8;
                    b2 = tVar2.b(hVar2, w0Var2);
                    if (b2 != aVar3) {
                    }
                }
            }
        }
        w0Var = new w0(aVar);
        Object obj2 = w0Var.f6651f;
        Q1.a aVar32 = Q1.a.f3113d;
        i3 = w0Var.f6652g;
        int i82 = 1;
        if (i3 != 0) {
        }
    }
}

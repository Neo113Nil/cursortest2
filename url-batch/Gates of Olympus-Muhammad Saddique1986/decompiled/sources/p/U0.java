package p;

import n0.C0700A;
import n0.C0711i;
import n0.EnumC0712j;

/* loaded from: classes.dex */
public abstract class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L f7613a = new L(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0700A c0700a, X1.a aVar) {
        y0 y0Var;
        int i3;
        int size;
        int i4;
        int i5;
        int size2;
        if (aVar instanceof y0) {
            y0Var = (y0) aVar;
            int i6 = y0Var.f7813i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                y0Var.f7813i = i6 - Integer.MIN_VALUE;
                Object obj = y0Var.f7812h;
                W1.a aVar2 = W1.a.f4608d;
                i3 = y0Var.f7813i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    y0Var.f7811g = c0700a;
                    y0Var.f7813i = 1;
                    obj = c0700a.b(EnumC0712j.f7296e, y0Var);
                    if (obj == aVar2) {
                    }
                    C0711i c0711i = (C0711i) obj;
                    ?? r22 = c0711i.f7292a;
                    size = r22.size();
                    i4 = 0;
                    while (i5 < size) {
                    }
                    ?? r9 = c0711i.f7292a;
                    size2 = r9.size();
                    while (i4 < size2) {
                    }
                    return R1.y.f4171a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0700a = y0Var.f7811g;
                R1.a.e(obj);
                C0711i c0711i2 = (C0711i) obj;
                ?? r222 = c0711i2.f7292a;
                size = r222.size();
                i4 = 0;
                for (i5 = 0; i5 < size; i5++) {
                    ((n0.s) r222.get(i5)).a();
                }
                ?? r92 = c0711i2.f7292a;
                size2 = r92.size();
                while (i4 < size2) {
                    if (((n0.s) r92.get(i4)).f7311d) {
                        y0Var.f7811g = c0700a;
                        y0Var.f7813i = 1;
                        obj = c0700a.b(EnumC0712j.f7296e, y0Var);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        C0711i c0711i22 = (C0711i) obj;
                        ?? r2222 = c0711i22.f7292a;
                        size = r2222.size();
                        i4 = 0;
                        while (i5 < size) {
                        }
                        ?? r922 = c0711i22.f7292a;
                        size2 = r922.size();
                        while (i4 < size2) {
                        }
                    } else {
                        i4++;
                    }
                }
                return R1.y.f4171a;
            }
        }
        y0Var = new y0(aVar);
        Object obj2 = y0Var.f7812h;
        W1.a aVar22 = W1.a.f4608d;
        i3 = y0Var.f7813i;
        if (i3 != 0) {
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
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(n0.C0700A r10, boolean r11, n0.EnumC0712j r12, X1.a r13) {
        /*
            boolean r0 = r13 instanceof p.C0795w0
            if (r0 == 0) goto L13
            r0 = r13
            p.w0 r0 = (p.C0795w0) r0
            int r1 = r0.f7796k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7796k = r1
            goto L18
        L13:
            p.w0 r0 = new p.w0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f7795j
            W1.a r1 = W1.a.f4608d
            int r2 = r0.f7796k
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f7794i
            n0.j r11 = r0.f7793h
            n0.A r12 = r0.f7792g
            R1.a.e(r13)
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
            R1.a.e(r13)
        L3c:
            r0.f7792g = r10
            r0.f7793h = r12
            r0.f7794i = r11
            r0.f7796k = r3
            java.lang.Object r13 = r10.b(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            n0.i r13 = (n0.C0711i) r13
            java.lang.Object r2 = r13.f7292a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            n0.s r7 = (n0.s) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f7315h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f7311d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = n0.q.a(r7)
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
            java.lang.Object r10 = r13.f7292a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.U0.b(n0.A, boolean, n0.j, X1.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r0 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r9 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r10 = (n0.s) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r10.b() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (n0.q.g(r10, r8.f7256h.f7268z, r8.c()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r0 = n0.EnumC0712j.f7297f;
        r1.f7609g = r8;
        r1.f7610h = r3;
        r1.f7612j = 2;
        r0 = r8.b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C0700A c0700a, EnumC0712j enumC0712j, X1.a aVar) {
        T0 t02;
        int i3;
        C0700A c0700a2;
        T0 t03;
        EnumC0712j enumC0712j2;
        C0700A c0700a3;
        EnumC0712j enumC0712j3;
        C0711i c0711i;
        int size;
        int i4;
        Object b3;
        if (aVar instanceof T0) {
            t02 = (T0) aVar;
            int i5 = t02.f7612j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                t02.f7612j = i5 - Integer.MIN_VALUE;
                Object obj = t02.f7611i;
                W1.a aVar2 = W1.a.f4608d;
                i3 = t02.f7612j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    c0700a2 = c0700a;
                    t03 = t02;
                    enumC0712j2 = enumC0712j;
                    t03.f7609g = c0700a2;
                    t03.f7610h = enumC0712j2;
                    t03.f7612j = 1;
                    b3 = c0700a2.b(enumC0712j2, t03);
                    if (b3 != aVar2) {
                    }
                } else if (i3 == 1) {
                    enumC0712j3 = t02.f7610h;
                    c0700a3 = t02.f7609g;
                    R1.a.e(obj);
                    c0711i = (C0711i) obj;
                    ?? r9 = c0711i.f7292a;
                    size = r9.size();
                    i4 = 0;
                    while (true) {
                        ?? r12 = c0711i.f7292a;
                        if (i4 >= size) {
                        }
                        i4++;
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC0712j3 = t02.f7610h;
                    c0700a3 = t02.f7609g;
                    R1.a.e(obj);
                    EnumC0712j enumC0712j4 = enumC0712j3;
                    t03 = t02;
                    enumC0712j2 = enumC0712j4;
                    ?? r02 = ((C0711i) obj).f7292a;
                    int size2 = r02.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (((n0.s) r02.get(i6)).b()) {
                            return null;
                        }
                    }
                    c0700a2 = c0700a3;
                    t03.f7609g = c0700a2;
                    t03.f7610h = enumC0712j2;
                    t03.f7612j = 1;
                    b3 = c0700a2.b(enumC0712j2, t03);
                    if (b3 != aVar2) {
                        return aVar2;
                    }
                    c0700a3 = c0700a2;
                    obj = b3;
                    T0 t04 = t03;
                    enumC0712j3 = enumC0712j2;
                    t02 = t04;
                    c0711i = (C0711i) obj;
                    ?? r92 = c0711i.f7292a;
                    size = r92.size();
                    i4 = 0;
                    while (true) {
                        ?? r122 = c0711i.f7292a;
                        if (i4 >= size) {
                            return r122.get(0);
                        }
                        if (!n0.q.b((n0.s) r92.get(i4))) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        t02 = new T0(aVar);
        Object obj2 = t02.f7611i;
        W1.a aVar22 = W1.a.f4608d;
        i3 = t02.f7612j;
        if (i3 != 0) {
        }
    }
}

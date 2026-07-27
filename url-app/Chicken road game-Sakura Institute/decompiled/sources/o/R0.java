package o;

import kotlin.Unit;
import l0.AbstractC0819q;
import l0.C0800A;
import l0.C0811i;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0910s0 f8710a = new C0910s0(3, null);

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
    public static final Object a(C0800A c0800a, E2.a aVar) {
        v0 v0Var;
        int i2;
        int size;
        int i4;
        int i5;
        int size2;
        if (aVar instanceof v0) {
            v0Var = (v0) aVar;
            int i6 = v0Var.f8889l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                v0Var.f8889l = i6 - Integer.MIN_VALUE;
                Object obj = v0Var.f8888k;
                D2.a aVar2 = D2.a.f2163d;
                i2 = v0Var.f8889l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    v0Var.f8887j = c0800a;
                    v0Var.f8889l = 1;
                    obj = c0800a.a(EnumC0812j.f7911e, v0Var);
                    if (obj == aVar2) {
                    }
                    C0811i c0811i = (C0811i) obj;
                    ?? r2 = c0811i.f7907a;
                    size = r2.size();
                    i4 = 0;
                    while (i5 < size) {
                    }
                    ?? r9 = c0811i.f7907a;
                    size2 = r9.size();
                    while (i4 < size2) {
                    }
                    return Unit.f7487a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0800a = v0Var.f8887j;
                AbstractC1343r.b(obj);
                C0811i c0811i2 = (C0811i) obj;
                ?? r22 = c0811i2.f7907a;
                size = r22.size();
                i4 = 0;
                for (i5 = 0; i5 < size; i5++) {
                    ((l0.s) r22.get(i5)).a();
                }
                ?? r92 = c0811i2.f7907a;
                size2 = r92.size();
                while (i4 < size2) {
                    if (((l0.s) r92.get(i4)).f7926d) {
                        v0Var.f8887j = c0800a;
                        v0Var.f8889l = 1;
                        obj = c0800a.a(EnumC0812j.f7911e, v0Var);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        C0811i c0811i22 = (C0811i) obj;
                        ?? r222 = c0811i22.f7907a;
                        size = r222.size();
                        i4 = 0;
                        while (i5 < size) {
                        }
                        ?? r922 = c0811i22.f7907a;
                        size2 = r922.size();
                        while (i4 < size2) {
                        }
                    } else {
                        i4++;
                    }
                }
                return Unit.f7487a;
            }
        }
        v0Var = new v0(aVar);
        Object obj2 = v0Var.f8888k;
        D2.a aVar22 = D2.a.f2163d;
        i2 = v0Var.f8889l;
        if (i2 != 0) {
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
    public static final java.lang.Object b(l0.C0800A r10, boolean r11, l0.EnumC0812j r12, E2.a r13) {
        /*
            boolean r0 = r13 instanceof o.C0912t0
            if (r0 == 0) goto L13
            r0 = r13
            o.t0 r0 = (o.C0912t0) r0
            int r1 = r0.f8881n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8881n = r1
            goto L18
        L13:
            o.t0 r0 = new o.t0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8880m
            D2.a r1 = D2.a.f2163d
            int r2 = r0.f8881n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f8879l
            l0.j r11 = r0.f8878k
            l0.A r12 = r0.f8877j
            y2.AbstractC1343r.b(r13)
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
            y2.AbstractC1343r.b(r13)
        L3c:
            r0.f8877j = r10
            r0.f8878k = r12
            r0.f8879l = r11
            r0.f8881n = r3
            java.lang.Object r13 = r10.a(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            l0.i r13 = (l0.C0811i) r13
            java.lang.Object r2 = r13.f7907a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            l0.s r7 = (l0.s) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f7930h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f7926d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = l0.AbstractC0819q.a(r7)
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
            java.lang.Object r10 = r13.f7907a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.R0.b(l0.A, boolean, l0.j, E2.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r0 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r9 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r10 = (l0.s) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r10.b() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (l0.AbstractC0819q.g(r10, r8.f7872l.f7876C, r8.b()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r0 = l0.EnumC0812j.f7912i;
        r1.f8706j = r8;
        r1.f8707k = r3;
        r1.f8709m = 2;
        r0 = r8.a(r0, r1);
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
    public static final Object d(C0800A c0800a, EnumC0812j enumC0812j, E2.a aVar) {
        Q0 q02;
        int i2;
        C0800A c0800a2;
        Q0 q03;
        EnumC0812j enumC0812j2;
        C0800A c0800a3;
        EnumC0812j enumC0812j3;
        C0811i c0811i;
        int size;
        int i4;
        Object a4;
        if (aVar instanceof Q0) {
            q02 = (Q0) aVar;
            int i5 = q02.f8709m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                q02.f8709m = i5 - Integer.MIN_VALUE;
                Object obj = q02.f8708l;
                D2.a aVar2 = D2.a.f2163d;
                i2 = q02.f8709m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    c0800a2 = c0800a;
                    q03 = q02;
                    enumC0812j2 = enumC0812j;
                    q03.f8706j = c0800a2;
                    q03.f8707k = enumC0812j2;
                    q03.f8709m = 1;
                    a4 = c0800a2.a(enumC0812j2, q03);
                    if (a4 != aVar2) {
                    }
                } else if (i2 == 1) {
                    enumC0812j3 = q02.f8707k;
                    c0800a3 = q02.f8706j;
                    AbstractC1343r.b(obj);
                    c0811i = (C0811i) obj;
                    ?? r9 = c0811i.f7907a;
                    size = r9.size();
                    i4 = 0;
                    while (true) {
                        ?? r12 = c0811i.f7907a;
                        if (i4 >= size) {
                        }
                        i4++;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC0812j3 = q02.f8707k;
                    c0800a3 = q02.f8706j;
                    AbstractC1343r.b(obj);
                    EnumC0812j enumC0812j4 = enumC0812j3;
                    q03 = q02;
                    enumC0812j2 = enumC0812j4;
                    ?? r02 = ((C0811i) obj).f7907a;
                    int size2 = r02.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (((l0.s) r02.get(i6)).b()) {
                            return null;
                        }
                    }
                    c0800a2 = c0800a3;
                    q03.f8706j = c0800a2;
                    q03.f8707k = enumC0812j2;
                    q03.f8709m = 1;
                    a4 = c0800a2.a(enumC0812j2, q03);
                    if (a4 != aVar2) {
                        return aVar2;
                    }
                    c0800a3 = c0800a2;
                    obj = a4;
                    Q0 q04 = q03;
                    enumC0812j3 = enumC0812j2;
                    q02 = q04;
                    c0811i = (C0811i) obj;
                    ?? r92 = c0811i.f7907a;
                    size = r92.size();
                    i4 = 0;
                    while (true) {
                        ?? r122 = c0811i.f7907a;
                        if (i4 >= size) {
                            return r122.get(0);
                        }
                        if (!AbstractC0819q.b((l0.s) r92.get(i4))) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        q02 = new Q0(aVar);
        Object obj2 = q02.f8708l;
        D2.a aVar22 = D2.a.f2163d;
        i2 = q02.f8709m;
        if (i2 != 0) {
        }
    }
}

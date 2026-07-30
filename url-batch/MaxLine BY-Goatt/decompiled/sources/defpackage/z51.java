package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z51 {
    public final lb2 a;
    public final fk b = new fk(3);
    public final fk c = new fk(4);
    public final u30 d = new u30(21);

    public z51(lb2 lb2Var) {
        this.a = lb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(z51 z51Var, long j, r30 r30Var) {
        r51 r51Var;
        Object obj;
        int i;
        Object U;
        if (r30Var instanceof r51) {
            r51Var = (r51) r30Var;
            int i2 = r51Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r51Var.q = i2 - Integer.MIN_VALUE;
                Object obj2 = r51Var.o;
                obj = b50.m;
                i = r51Var.q;
                int i3 = 2;
                if (i != 0) {
                    ca2.b(obj2);
                    r51Var.m = z51Var;
                    r51Var.n = j;
                    r51Var.q = 1;
                    Object U2 = l41.U(r51Var, z51Var.a, new u51(j, i3), false, true);
                    if (U2 != obj) {
                        U2 = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj2);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = r51Var.n;
                    z51Var = r51Var.m;
                    ca2.b(obj2);
                }
                r51Var.m = null;
                r51Var.n = j;
                r51Var.q = 2;
                U = l41.U(r51Var, z51Var.a, new u51(j, 3), false, true);
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        r51Var = new r51(z51Var, r30Var);
        Object obj22 = r51Var.o;
        obj = b50.m;
        i = r51Var.q;
        int i32 = 2;
        if (i != 0) {
        }
        r51Var.m = null;
        r51Var.n = j;
        r51Var.q = 2;
        U = l41.U(r51Var, z51Var.a, new u51(j, 3), false, true);
        if (U != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r3 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r3 == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(z51 z51Var, a61 a61Var, List list, r30 r30Var) {
        s51 s51Var;
        b50 b50Var;
        int i;
        long longValue;
        Object T;
        long j;
        z51 z51Var2 = z51Var;
        a61 a61Var2 = a61Var;
        List list2 = list;
        if (r30Var instanceof s51) {
            s51Var = (s51) r30Var;
            int i2 = s51Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s51Var.s = i2 - Integer.MIN_VALUE;
                Object obj = s51Var.q;
                b50Var = b50.m;
                i = s51Var.s;
                int i3 = 1;
                if (i != 0) {
                    ca2.b(obj);
                    long j2 = a61Var2.a;
                    int i4 = 0;
                    s51Var.m = z51Var2;
                    if (j2 == 0) {
                        s51Var.n = null;
                        s51Var.o = list2;
                        s51Var.s = 1;
                        obj = l41.U(s51Var, z51Var2.a, new v51(z51Var2, a61Var2, i3), false, true);
                    } else {
                        s51Var.n = a61Var2;
                        s51Var.o = list2;
                        s51Var.s = 2;
                        Object U = l41.U(s51Var, z51Var2.a, new v51(z51Var2, a61Var2, i4), false, true);
                        if (U != b50Var) {
                            U = Unit.a;
                        }
                    }
                    return b50Var;
                }
                if (i == 1) {
                    List list3 = s51Var.o;
                    z51 z51Var3 = s51Var.m;
                    ca2.b(obj);
                    list2 = list3;
                    z51Var2 = z51Var3;
                    longValue = ((Number) obj).longValue();
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = s51Var.p;
                        ca2.b(obj);
                        return new Long(j);
                    }
                    List list4 = s51Var.o;
                    a61Var2 = s51Var.n;
                    z51 z51Var4 = s51Var.m;
                    ca2.b(obj);
                    list2 = list4;
                    z51Var2 = z51Var4;
                    longValue = a61Var2.a;
                }
                z51 z51Var5 = z51Var2;
                List list5 = list2;
                long j3 = longValue;
                s51Var.m = null;
                s51Var.n = null;
                s51Var.o = null;
                s51Var.p = j3;
                s51Var.s = 3;
                T = l41.T(z51Var5.a, new y51(z51Var5, j3, list5, null), s51Var);
                if (T != b50Var) {
                    T = Unit.a;
                }
                if (T != b50Var) {
                    j = j3;
                    return new Long(j);
                }
                return b50Var;
            }
        }
        s51Var = new s51(z51Var2, r30Var);
        Object obj2 = s51Var.q;
        b50Var = b50.m;
        i = s51Var.s;
        int i32 = 1;
        if (i != 0) {
        }
        z51 z51Var52 = z51Var2;
        List list52 = list2;
        long j32 = longValue;
        s51Var.m = null;
        s51Var.n = null;
        s51Var.o = null;
        s51Var.p = j32;
        s51Var.s = 3;
        T = l41.T(z51Var52.a, new y51(z51Var52, j32, list52, null), s51Var);
        if (T != b50Var) {
        }
        if (T != b50Var) {
        }
        return b50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r14 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(z51 z51Var, long j, List list, r30 r30Var) {
        t51 t51Var;
        int i;
        Iterator it;
        z51 z51Var2;
        int i2;
        if (r30Var instanceof t51) {
            t51Var = (t51) r30Var;
            int i3 = t51Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t51Var.t = i3 - Integer.MIN_VALUE;
                Object obj = t51Var.r;
                Object obj2 = b50.m;
                i = t51Var.t;
                int i4 = 2;
                if (i != 0) {
                    ca2.b(obj);
                    t51Var.m = z51Var;
                    t51Var.n = list;
                    t51Var.p = j;
                    t51Var.t = 1;
                    Object U = l41.U(t51Var, z51Var.a, new u51(j, i4), false, true);
                    if (U != obj2) {
                        U = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = t51Var.q;
                        j = t51Var.p;
                        it = t51Var.o;
                        z51Var2 = t51Var.m;
                        ca2.b(obj);
                        while (it.hasNext()) {
                            h51 h51Var = new h51(j, (String) it.next());
                            t51Var.m = z51Var2;
                            t51Var.n = null;
                            t51Var.o = it;
                            t51Var.p = j;
                            t51Var.q = i2;
                            t51Var.t = 2;
                            Object U2 = l41.U(t51Var, z51Var2.a, new ek(4, z51Var2, h51Var), false, true);
                            if (U2 != b50.m) {
                                U2 = Unit.a;
                            }
                            if (U2 == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.a;
                    }
                    j = t51Var.p;
                    list = t51Var.n;
                    z51Var = t51Var.m;
                    ca2.b(obj);
                }
                list.getClass();
                it = zv.M(zv.P(list)).iterator();
                z51Var2 = z51Var;
                i2 = 0;
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        t51Var = new t51(z51Var, r30Var);
        Object obj3 = t51Var.r;
        Object obj22 = b50.m;
        i = t51Var.t;
        int i42 = 2;
        if (i != 0) {
        }
        list.getClass();
        it = zv.M(zv.P(list)).iterator();
        z51Var2 = z51Var;
        i2 = 0;
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}

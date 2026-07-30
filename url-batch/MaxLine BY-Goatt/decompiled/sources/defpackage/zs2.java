package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zs2 {
    public static final qd0 a = new qd0(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[LOOP:0: B:11:0x004a->B:12:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ur2 ur2Var, hn hnVar) {
        rs2 rs2Var;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (hnVar instanceof rs2) {
            rs2Var = (rs2) hnVar;
            int i4 = rs2Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rs2Var.o = i4 - Integer.MIN_VALUE;
                Object obj = rs2Var.n;
                b50 b50Var = b50.m;
                i = rs2Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    rs2Var.m = ur2Var;
                    rs2Var.o = 1;
                    obj = ur2Var.a(n22.n, rs2Var);
                    if (obj == b50Var) {
                    }
                    m22 m22Var = (m22) obj;
                    List list = m22Var.a;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List list2 = m22Var.a;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ur2Var = rs2Var.m;
                ca2.b(obj);
                m22 m22Var2 = (m22) obj;
                List list3 = m22Var2.a;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    ((t22) list3.get(i3)).a();
                }
                List list22 = m22Var2.a;
                size2 = list22.size();
                while (i2 < size2) {
                    if (((t22) list22.get(i2)).d) {
                        rs2Var.m = ur2Var;
                        rs2Var.o = 1;
                        obj = ur2Var.a(n22.n, rs2Var);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                        m22 m22Var22 = (m22) obj;
                        List list32 = m22Var22.a;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List list222 = m22Var22.a;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return Unit.a;
            }
        }
        rs2Var = new rs2(hnVar);
        Object obj2 = rs2Var.n;
        b50 b50Var2 = b50.m;
        i = rs2Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ur2 ur2Var, boolean z, n22 n22Var, hn hnVar) {
        qs2 qs2Var;
        int i;
        int size;
        int i2;
        if (hnVar instanceof qs2) {
            qs2Var = (qs2) hnVar;
            int i3 = qs2Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qs2Var.q = i3 - Integer.MIN_VALUE;
                Object obj = qs2Var.p;
                b50 b50Var = b50.m;
                i = qs2Var.q;
                if (i != 0) {
                    ca2.b(obj);
                    qs2Var.m = ur2Var;
                    qs2Var.n = n22Var;
                    qs2Var.o = z;
                    qs2Var.q = 1;
                    obj = ur2Var.a(n22Var, qs2Var);
                    if (obj == b50Var) {
                    }
                    m22 m22Var = (m22) obj;
                    List list = m22Var.a;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return m22Var.a.get(0);
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z2 = qs2Var.o;
                n22 n22Var2 = qs2Var.n;
                ur2 ur2Var2 = qs2Var.m;
                ca2.b(obj);
                z = z2;
                ur2Var = ur2Var2;
                n22Var = n22Var2;
                m22 m22Var2 = (m22) obj;
                List list2 = m22Var2.a;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    t22 t22Var = (t22) list2.get(i2);
                    if (!z ? s93.z(t22Var) : (t22Var.b() || t22Var.h || !t22Var.d) ? false : true) {
                        i2++;
                    } else {
                        qs2Var.m = ur2Var;
                        qs2Var.n = n22Var;
                        qs2Var.o = z;
                        qs2Var.q = 1;
                        obj = ur2Var.a(n22Var, qs2Var);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                        m22 m22Var22 = (m22) obj;
                        List list22 = m22Var22.a;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return m22Var22.a.get(0);
            }
        }
        qs2Var = new qs2(hnVar);
        Object obj2 = qs2Var.p;
        b50 b50Var2 = b50.m;
        i = qs2Var.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(ur2 ur2Var, n22 n22Var, hn hnVar) {
        ys2 ys2Var;
        int i;
        ur2 ur2Var2;
        ys2 ys2Var2;
        n22 n22Var2;
        ur2 ur2Var3;
        n22 n22Var3;
        int size;
        int i2;
        Object a2;
        if (hnVar instanceof ys2) {
            ys2Var = (ys2) hnVar;
            int i3 = ys2Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ys2Var.p = i3 - Integer.MIN_VALUE;
                Object obj = ys2Var.o;
                b50 b50Var = b50.m;
                i = ys2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    ur2Var2 = ur2Var;
                    ys2Var2 = ys2Var;
                    n22Var2 = n22Var;
                    ys2Var2.m = ur2Var2;
                    ys2Var2.n = n22Var2;
                    ys2Var2.p = 1;
                    a2 = ur2Var2.a(n22Var2, ys2Var2);
                    if (a2 != b50Var) {
                    }
                    return b50Var;
                }
                if (i == 1) {
                    n22Var3 = ys2Var.n;
                    ur2Var3 = ys2Var.m;
                    ca2.b(obj);
                    List list = ((m22) obj).a;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n22Var3 = ys2Var.n;
                ur2Var3 = ys2Var.m;
                ca2.b(obj);
                n22 n22Var4 = n22Var3;
                ys2Var2 = ys2Var;
                n22Var2 = n22Var4;
                List list2 = ((m22) obj).a;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((t22) list2.get(i4)).b()) {
                        break;
                    }
                }
                ur2Var2 = ur2Var3;
                ys2Var2.m = ur2Var2;
                ys2Var2.n = n22Var2;
                ys2Var2.p = 1;
                a2 = ur2Var2.a(n22Var2, ys2Var2);
                if (a2 != b50Var) {
                    ur2Var3 = ur2Var2;
                    obj = a2;
                    ys2 ys2Var3 = ys2Var2;
                    n22Var3 = n22Var2;
                    ys2Var = ys2Var3;
                    List list3 = ((m22) obj).a;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!s93.A((t22) list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                t22 t22Var = (t22) list3.get(i5);
                                if (t22Var.b() || s93.I(t22Var, ur2Var3.r.K, ur2Var3.b())) {
                                    break;
                                }
                            }
                            n22 n22Var5 = n22.o;
                            ys2Var.m = ur2Var3;
                            ys2Var.n = n22Var3;
                            ys2Var.p = 2;
                            obj = ur2Var3.a(n22Var5, ys2Var);
                        }
                    }
                    return list3.get(0);
                }
                return b50Var;
            }
        }
        ys2Var = new ys2(hnVar);
        Object obj2 = ys2Var.o;
        b50 b50Var2 = b50.m;
        i = ys2Var.p;
        if (i != 0) {
        }
    }
}

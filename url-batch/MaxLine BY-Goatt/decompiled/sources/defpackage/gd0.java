package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class gd0 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (defpackage.au1.b(defpackage.s93.P(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005e -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ur2 ur2Var, long j, r30 r30Var) {
        bd0 bd0Var;
        int i;
        ur2 ur2Var2;
        b82 b82Var;
        Object a2;
        Object obj;
        Object obj2;
        if (r30Var instanceof bd0) {
            bd0Var = (bd0) r30Var;
            int i2 = bd0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bd0Var.p = i2 - Integer.MIN_VALUE;
                Object obj3 = bd0Var.o;
                b50 b50Var = b50.m;
                i = bd0Var.p;
                if (i != 0) {
                    ca2.b(obj3);
                    ur2Var2 = ur2Var;
                    if (!d(ur2Var2.r.F, j)) {
                        b82 b82Var2 = new b82();
                        b82Var2.m = j;
                        b82Var = b82Var2;
                        bd0Var.m = ur2Var2;
                        bd0Var.n = b82Var;
                        bd0Var.p = 1;
                        a2 = ur2Var2.a(n22.n, bd0Var);
                        if (a2 != b50Var) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b82Var = bd0Var.n;
                ur2 ur2Var3 = bd0Var.m;
                ca2.b(obj3);
                m22 m22Var = (m22) obj3;
                List list = m22Var.a;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (s22.a(((t22) obj).a, b82Var.m)) {
                        break;
                    }
                    i4++;
                }
                t22 t22Var = (t22) obj;
                if (t22Var == null) {
                    if (s93.B(t22Var)) {
                        List list2 = m22Var.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i3);
                            if (((t22) obj2).d) {
                                break;
                            }
                            i3++;
                        }
                        t22 t22Var2 = (t22) obj2;
                        if (t22Var2 != null) {
                            b82Var.m = t22Var2.a;
                            ur2Var2 = ur2Var3;
                            bd0Var.m = ur2Var2;
                            bd0Var.n = b82Var;
                            bd0Var.p = 1;
                            a2 = ur2Var2.a(n22.n, bd0Var);
                            if (a2 != b50Var) {
                                return b50Var;
                            }
                            ur2 ur2Var4 = ur2Var2;
                            obj3 = a2;
                            ur2Var3 = ur2Var4;
                        }
                    }
                    m22 m22Var2 = (m22) obj3;
                    List list3 = m22Var2.a;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    t22 t22Var3 = (t22) obj;
                    if (t22Var3 == null) {
                        t22Var3 = null;
                    }
                }
                if (t22Var3 == null || t22Var3.b()) {
                    return null;
                }
                return t22Var3;
            }
        }
        bd0Var = new bd0(r30Var);
        Object obj32 = bd0Var.o;
        b50 b50Var2 = b50.m;
        i = bd0Var.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ur2 ur2Var, long j, r30 r30Var) {
        cd0 cd0Var;
        int i;
        Object obj;
        t22 t22Var;
        c82 c82Var;
        if (r30Var instanceof cd0) {
            cd0Var = (cd0) r30Var;
            int i2 = cd0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cd0Var.p = i2 - Integer.MIN_VALUE;
                Object obj2 = cd0Var.o;
                Object obj3 = b50.m;
                i = cd0Var.p;
                if (i != 0) {
                    ca2.b(obj2);
                    if (!d(ur2Var.r.F, j)) {
                        List list = ur2Var.r.F.a;
                        int size = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            if (s22.a(((t22) obj).a, j)) {
                                break;
                            }
                            i3++;
                        }
                        t22Var = (t22) obj;
                        if (t22Var != null) {
                            c82 c82Var2 = new c82();
                            c82 c82Var3 = new c82();
                            c82Var3.m = t22Var;
                            long c = ur2Var.h().c();
                            try {
                                Function2 dd0Var = new dd0(c82Var3, c82Var2, null);
                                cd0Var.m = t22Var;
                                cd0Var.n = c82Var2;
                                cd0Var.p = 1;
                                if (ur2Var.i(c, dd0Var, cd0Var) == obj3) {
                                    return obj3;
                                }
                            } catch (o22 unused) {
                                c82Var = c82Var2;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c82Var = cd0Var.n;
                t22Var = cd0Var.m;
                try {
                    ca2.b(obj2);
                    return null;
                } catch (o22 unused2) {
                }
                t22 t22Var2 = (t22) c82Var.m;
                return t22Var2 != null ? t22Var : t22Var2;
            }
        }
        cd0Var = new cd0(r30Var);
        Object obj22 = cd0Var.o;
        Object obj32 = b50.m;
        i = cd0Var.p;
        if (i != 0) {
        }
        t22 t22Var22 = (t22) c82Var.m;
        if (t22Var22 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ur2 ur2Var, long j, Function1 function1, r30 r30Var) {
        fd0 fd0Var;
        int i;
        t22 t22Var;
        if (r30Var instanceof fd0) {
            fd0Var = (fd0) r30Var;
            int i2 = fd0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fd0Var.p = i2 - Integer.MIN_VALUE;
                Object obj = fd0Var.o;
                b50 b50Var = b50.m;
                i = fd0Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    fd0Var.m = ur2Var;
                    fd0Var.n = function1;
                    fd0Var.p = 1;
                    obj = a(ur2Var, j, fd0Var);
                    if (obj == b50Var) {
                    }
                    t22Var = (t22) obj;
                    if (t22Var == null) {
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function12 = fd0Var.n;
                    ur2 ur2Var2 = fd0Var.m;
                    ca2.b(obj);
                    function1 = function12;
                    ur2Var = ur2Var2;
                    t22Var = (t22) obj;
                    if (t22Var == null) {
                        if (s93.B(t22Var)) {
                            return Boolean.TRUE;
                        }
                        function1.invoke(t22Var);
                        j = t22Var.a;
                        fd0Var.m = ur2Var;
                        fd0Var.n = function1;
                        fd0Var.p = 1;
                        obj = a(ur2Var, j, fd0Var);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                        t22Var = (t22) obj;
                        if (t22Var == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        fd0Var = new fd0(r30Var);
        Object obj2 = fd0Var.o;
        b50 b50Var2 = b50.m;
        i = fd0Var.p;
        if (i != 0) {
        }
    }

    public static final boolean d(m22 m22Var, long j) {
        Object obj;
        List list = m22Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (s22.a(((t22) obj).a, j)) {
                break;
            }
            i++;
        }
        t22 t22Var = (t22) obj;
        if (t22Var != null && t22Var.d) {
            z = true;
        }
        return true ^ z;
    }
}

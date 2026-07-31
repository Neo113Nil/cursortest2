package p;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import n0.C0700A;
import n0.C0711i;
import n0.C0713k;
import n0.EnumC0712j;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7486a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (a0.C0238c.b(n0.q.h(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005f -> B:10:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0700A c0700a, long j3, X1.c cVar) {
        C0794w c0794w;
        int i3;
        C0700A c0700a2;
        f2.t tVar;
        Object b3;
        Object obj;
        Object obj2;
        if (cVar instanceof C0794w) {
            c0794w = (C0794w) cVar;
            int i4 = c0794w.f7791j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0794w.f7791j = i4 - Integer.MIN_VALUE;
                Object obj3 = c0794w.f7790i;
                W1.a aVar = W1.a.f4608d;
                i3 = c0794w.f7791j;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c0794w.f7789h;
                    C0700A c0700a3 = c0794w.f7788g;
                    R1.a.e(obj3);
                    C0711i c0711i = (C0711i) obj3;
                    ?? r5 = c0711i.f7292a;
                    int size = r5.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            obj = null;
                            break;
                        }
                        obj = r5.get(i6);
                        if (n0.r.a(((n0.s) obj).f7308a, tVar.f5831d)) {
                            break;
                        }
                        i6++;
                    }
                    n0.s sVar = (n0.s) obj;
                    if (sVar == null) {
                        if (n0.q.c(sVar)) {
                            ?? r22 = c0711i.f7292a;
                            int size2 = r22.size();
                            while (true) {
                                if (i5 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = r22.get(i5);
                                if (((n0.s) obj2).f7311d) {
                                    break;
                                }
                                i5++;
                            }
                            n0.s sVar2 = (n0.s) obj2;
                            if (sVar2 != null) {
                                tVar.f5831d = sVar2.f7308a;
                                c0700a2 = c0700a3;
                            }
                        }
                        c0794w.f7788g = c0700a2;
                        c0794w.f7789h = tVar;
                        c0794w.f7791j = 1;
                        b3 = c0700a2.b(EnumC0712j.f7296e, c0794w);
                        if (b3 != aVar) {
                            return aVar;
                        }
                        C0700A c0700a4 = c0700a2;
                        obj3 = b3;
                        c0700a3 = c0700a4;
                        C0711i c0711i2 = (C0711i) obj3;
                        ?? r52 = c0711i2.f7292a;
                        int size3 = r52.size();
                        int i52 = 0;
                        int i62 = 0;
                        while (true) {
                            if (i62 < size3) {
                            }
                            i62++;
                        }
                        n0.s sVar3 = (n0.s) obj;
                        if (sVar3 == null) {
                            sVar3 = null;
                        }
                    }
                    if (sVar3 == null || sVar3.b()) {
                        return null;
                    }
                    return sVar3;
                }
                R1.a.e(obj3);
                c0700a2 = c0700a;
                if (d(c0700a2.f7256h.f7264v, j3)) {
                    return null;
                }
                f2.t tVar2 = new f2.t();
                tVar2.f5831d = j3;
                tVar = tVar2;
                c0794w.f7788g = c0700a2;
                c0794w.f7789h = tVar;
                c0794w.f7791j = 1;
                b3 = c0700a2.b(EnumC0712j.f7296e, c0794w);
                if (b3 != aVar) {
                }
            }
        }
        c0794w = new C0794w(cVar);
        Object obj32 = c0794w.f7790i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0794w.f7791j;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0700A c0700a, long j3, X1.c cVar) {
        C0796x c0796x;
        int i3;
        Object obj;
        n0.s sVar;
        f2.u uVar;
        if (cVar instanceof C0796x) {
            c0796x = (C0796x) cVar;
            int i4 = c0796x.f7800j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0796x.f7800j = i4 - Integer.MIN_VALUE;
                Object obj2 = c0796x.f7799i;
                Object obj3 = W1.a.f4608d;
                i3 = c0796x.f7800j;
                if (i3 != 0) {
                    R1.a.e(obj2);
                    if (d(c0700a.f7256h.f7264v, j3)) {
                        return null;
                    }
                    ?? r12 = c0700a.f7256h.f7264v.f7292a;
                    int size = r12.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r12.get(i5);
                        if (n0.r.a(((n0.s) obj).f7308a, j3)) {
                            break;
                        }
                        i5++;
                    }
                    sVar = (n0.s) obj;
                    if (sVar == null) {
                        return null;
                    }
                    f2.u uVar2 = new f2.u();
                    f2.u uVar3 = new f2.u();
                    uVar3.f5832d = sVar;
                    long f3 = c0700a.e().f();
                    try {
                        InterfaceC0426e c0798y = new C0798y(uVar3, uVar2, null);
                        c0796x.f7797g = sVar;
                        c0796x.f7798h = uVar2;
                        c0796x.f7800j = 1;
                        if (c0700a.f(f3, c0798y, c0796x) == obj3) {
                            return obj3;
                        }
                        return null;
                    } catch (C0713k unused) {
                        uVar = uVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = c0796x.f7798h;
                    sVar = c0796x.f7797g;
                    try {
                        R1.a.e(obj2);
                        return null;
                    } catch (C0713k unused2) {
                    }
                }
                n0.s sVar2 = (n0.s) uVar.f5832d;
                return sVar2 != null ? sVar : sVar2;
            }
        }
        c0796x = new C0796x(cVar);
        Object obj22 = c0796x.f7799i;
        Object obj32 = W1.a.f4608d;
        i3 = c0796x.f7800j;
        if (i3 != 0) {
        }
        n0.s sVar22 = (n0.s) uVar.f5832d;
        if (sVar22 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C0700A c0700a, long j3, InterfaceC0424c interfaceC0424c, X1.c cVar) {
        C0750B c0750b;
        int i3;
        n0.s sVar;
        if (cVar instanceof C0750B) {
            c0750b = (C0750B) cVar;
            int i4 = c0750b.f7484j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0750b.f7484j = i4 - Integer.MIN_VALUE;
                Object obj = c0750b.f7483i;
                W1.a aVar = W1.a.f4608d;
                i3 = c0750b.f7484j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    c0750b.f7481g = c0700a;
                    c0750b.f7482h = interfaceC0424c;
                    c0750b.f7484j = 1;
                    obj = a(c0700a, j3, c0750b);
                    if (obj == aVar) {
                    }
                    sVar = (n0.s) obj;
                    if (sVar == null) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC0424c interfaceC0424c2 = c0750b.f7482h;
                    C0700A c0700a2 = c0750b.f7481g;
                    R1.a.e(obj);
                    interfaceC0424c = interfaceC0424c2;
                    c0700a = c0700a2;
                    sVar = (n0.s) obj;
                    if (sVar == null) {
                        if (n0.q.c(sVar)) {
                            return Boolean.TRUE;
                        }
                        interfaceC0424c.n(sVar);
                        j3 = sVar.f7308a;
                        c0750b.f7481g = c0700a;
                        c0750b.f7482h = interfaceC0424c;
                        c0750b.f7484j = 1;
                        obj = a(c0700a, j3, c0750b);
                        if (obj == aVar) {
                            return aVar;
                        }
                        sVar = (n0.s) obj;
                        if (sVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        c0750b = new C0750B(cVar);
        Object obj2 = c0750b.f7483i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0750b.f7484j;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(C0711i c0711i, long j3) {
        Object obj;
        ?? r6 = c0711i.f7292a;
        int size = r6.size();
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i3);
            if (n0.r.a(((n0.s) obj).f7308a, j3)) {
                break;
            }
            i3++;
        }
        n0.s sVar = (n0.s) obj;
        if (sVar != null && sVar.f7311d) {
            z3 = true;
        }
        return true ^ z3;
    }
}

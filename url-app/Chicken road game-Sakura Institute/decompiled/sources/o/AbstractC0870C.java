package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.AbstractC0819q;
import l0.C0800A;
import l0.C0811i;
import l0.C0813k;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0870C {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8598a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (Y.c.b(l0.AbstractC0819q.h(r11, true), 0) == false) goto L47;
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
    public static final Object a(C0800A c0800a, long j4, E2.c cVar) {
        C0916w c0916w;
        int i2;
        C0800A c0800a2;
        M2.D d4;
        Object a4;
        Object obj;
        Object obj2;
        if (cVar instanceof C0916w) {
            c0916w = (C0916w) cVar;
            int i4 = c0916w.f8893m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0916w.f8893m = i4 - Integer.MIN_VALUE;
                Object obj3 = c0916w.f8892l;
                D2.a aVar = D2.a.f2163d;
                i2 = c0916w.f8893m;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d4 = c0916w.f8891k;
                    C0800A c0800a3 = c0916w.f8890j;
                    AbstractC1343r.b(obj3);
                    C0811i c0811i = (C0811i) obj3;
                    ?? r5 = c0811i.f7907a;
                    int size = r5.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            obj = null;
                            break;
                        }
                        obj = r5.get(i6);
                        if (l0.r.a(((l0.s) obj).f7923a, d4.f3579d)) {
                            break;
                        }
                        i6++;
                    }
                    l0.s sVar = (l0.s) obj;
                    if (sVar == null) {
                        if (AbstractC0819q.c(sVar)) {
                            ?? r2 = c0811i.f7907a;
                            int size2 = r2.size();
                            while (true) {
                                if (i5 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = r2.get(i5);
                                if (((l0.s) obj2).f7926d) {
                                    break;
                                }
                                i5++;
                            }
                            l0.s sVar2 = (l0.s) obj2;
                            if (sVar2 != null) {
                                d4.f3579d = sVar2.f7923a;
                                c0800a2 = c0800a3;
                            }
                        }
                        c0916w.f8890j = c0800a2;
                        c0916w.f8891k = d4;
                        c0916w.f8893m = 1;
                        a4 = c0800a2.a(EnumC0812j.f7911e, c0916w);
                        if (a4 != aVar) {
                            return aVar;
                        }
                        C0800A c0800a4 = c0800a2;
                        obj3 = a4;
                        c0800a3 = c0800a4;
                        C0811i c0811i2 = (C0811i) obj3;
                        ?? r52 = c0811i2.f7907a;
                        int size3 = r52.size();
                        int i52 = 0;
                        int i62 = 0;
                        while (true) {
                            if (i62 < size3) {
                            }
                            i62++;
                        }
                        l0.s sVar3 = (l0.s) obj;
                        if (sVar3 == null) {
                            sVar3 = null;
                        }
                    }
                    if (sVar3 == null || sVar3.b()) {
                        return null;
                    }
                    return sVar3;
                }
                AbstractC1343r.b(obj3);
                c0800a2 = c0800a;
                if (d(c0800a2.f7872l.f7882y, j4)) {
                    return null;
                }
                M2.D d5 = new M2.D();
                d5.f3579d = j4;
                d4 = d5;
                c0916w.f8890j = c0800a2;
                c0916w.f8891k = d4;
                c0916w.f8893m = 1;
                a4 = c0800a2.a(EnumC0812j.f7911e, c0916w);
                if (a4 != aVar) {
                }
            }
        }
        c0916w = new C0916w(cVar);
        Object obj32 = c0916w.f8892l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0916w.f8893m;
        if (i2 == 0) {
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
    public static final Object b(C0800A c0800a, long j4, E2.c cVar) {
        C0917x c0917x;
        int i2;
        Object obj;
        l0.s sVar;
        M2.E e4;
        if (cVar instanceof C0917x) {
            c0917x = (C0917x) cVar;
            int i4 = c0917x.f8899m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0917x.f8899m = i4 - Integer.MIN_VALUE;
                Object obj2 = c0917x.f8898l;
                Object obj3 = D2.a.f2163d;
                i2 = c0917x.f8899m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj2);
                    if (d(c0800a.f7872l.f7882y, j4)) {
                        return null;
                    }
                    ?? r12 = c0800a.f7872l.f7882y.f7907a;
                    int size = r12.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r12.get(i5);
                        if (l0.r.a(((l0.s) obj).f7923a, j4)) {
                            break;
                        }
                        i5++;
                    }
                    sVar = (l0.s) obj;
                    if (sVar == null) {
                        return null;
                    }
                    M2.E e5 = new M2.E();
                    M2.E e6 = new M2.E();
                    e6.f3580d = sVar;
                    long f4 = c0800a.d().f();
                    try {
                        Function2 c0918y = new C0918y(e6, e5, null);
                        c0917x.f8896j = sVar;
                        c0917x.f8897k = e5;
                        c0917x.f8899m = 1;
                        if (c0800a.f(f4, c0918y, c0917x) == obj3) {
                            return obj3;
                        }
                        return null;
                    } catch (C0813k unused) {
                        e4 = e5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e4 = c0917x.f8897k;
                    sVar = c0917x.f8896j;
                    try {
                        AbstractC1343r.b(obj2);
                        return null;
                    } catch (C0813k unused2) {
                    }
                }
                l0.s sVar2 = (l0.s) e4.f3580d;
                return sVar2 != null ? sVar : sVar2;
            }
        }
        c0917x = new C0917x(cVar);
        Object obj22 = c0917x.f8898l;
        Object obj32 = D2.a.f2163d;
        i2 = c0917x.f8899m;
        if (i2 != 0) {
        }
        l0.s sVar22 = (l0.s) e4.f3580d;
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
    public static final Object c(C0800A c0800a, long j4, Function1 function1, E2.c cVar) {
        C0869B c0869b;
        int i2;
        l0.s sVar;
        if (cVar instanceof C0869B) {
            c0869b = (C0869B) cVar;
            int i4 = c0869b.f8591m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0869b.f8591m = i4 - Integer.MIN_VALUE;
                Object obj = c0869b.f8590l;
                D2.a aVar = D2.a.f2163d;
                i2 = c0869b.f8591m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    c0869b.f8588j = c0800a;
                    c0869b.f8589k = function1;
                    c0869b.f8591m = 1;
                    obj = a(c0800a, j4, c0869b);
                    if (obj == aVar) {
                    }
                    sVar = (l0.s) obj;
                    if (sVar == null) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1 function12 = c0869b.f8589k;
                    C0800A c0800a2 = c0869b.f8588j;
                    AbstractC1343r.b(obj);
                    function1 = function12;
                    c0800a = c0800a2;
                    sVar = (l0.s) obj;
                    if (sVar == null) {
                        if (AbstractC0819q.c(sVar)) {
                            return Boolean.TRUE;
                        }
                        function1.invoke(sVar);
                        j4 = sVar.f7923a;
                        c0869b.f8588j = c0800a;
                        c0869b.f8589k = function1;
                        c0869b.f8591m = 1;
                        obj = a(c0800a, j4, c0869b);
                        if (obj == aVar) {
                            return aVar;
                        }
                        sVar = (l0.s) obj;
                        if (sVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        c0869b = new C0869B(cVar);
        Object obj2 = c0869b.f8590l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0869b.f8591m;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(C0811i c0811i, long j4) {
        Object obj;
        ?? r6 = c0811i.f7907a;
        int size = r6.size();
        boolean z4 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i2);
            if (l0.r.a(((l0.s) obj).f7923a, j4)) {
                break;
            }
            i2++;
        }
        l0.s sVar = (l0.s) obj;
        if (sVar != null && sVar.f7926d) {
            z4 = true;
        }
        return true ^ z4;
    }
}

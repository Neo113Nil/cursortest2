package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lda {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object X;
        Object X2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            X = Class.forName("kqu").getCanonicalName();
        } catch (Throwable th) {
            X = ixc.X(th);
        }
        if (kon.a(X) != null) {
            X = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) X;
        try {
            X2 = Class.forName("lda").getCanonicalName();
        } catch (Throwable th2) {
            X2 = ixc.X(th2);
        }
        if (kon.a(X2) != null) {
            X2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) X2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable a(Throwable th, kqx kqxVar) {
        kol kolVar;
        Throwable a2;
        boolean z = lbp.a;
        int i = 0;
        if (lbp.a) {
            th.getClass();
            kqxVar.getClass();
            lbl lblVar = new lbl(ksl.e(new kts(new ktz(ksl.d(kqxVar, new kss() { // from class: lbn
                @Override // defpackage.kss
                public final Object g(Object obj) {
                    return ((kqx) obj).g();
                }
            }), (krt) lbo.a, 0), false, new ghz(11))));
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            while (i < suppressed.length) {
                Throwable th2 = suppressed[i];
                if (th2 instanceof lbl) {
                    List list = lblVar.a;
                    List list2 = ((lbl) th2).a;
                    if (list.size() <= list2.size() && ksp.b(list, list2.subList(list2.size() - list.size(), list2.size()))) {
                    }
                }
                i++;
            }
            koc.b(th, lblVar);
            return th;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (ksp.b(cause.getClass(), th.getClass())) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        kolVar = new kol(th, new StackTraceElement[0]);
                        break;
                    }
                    if (d(stackTrace[i2])) {
                        kolVar = new kol(cause, stackTrace);
                        break;
                    }
                    i2++;
                }
                Object obj = kolVar.b;
                Throwable th3 = (Throwable) kolVar.a;
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
                a2 = lck.a(th3);
                if (a2 != null) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    StackTraceElement f = kqxVar.f();
                    if (f != null) {
                        arrayDeque.add(f);
                    }
                    while (true) {
                        if (true != (kqxVar instanceof kqx)) {
                            kqxVar = null;
                        }
                        if (kqxVar == null || (kqxVar = kqxVar.g()) == null) {
                            break;
                        }
                        StackTraceElement f2 = kqxVar.f();
                        if (f2 != null) {
                            arrayDeque.add(f2);
                        }
                    }
                    if (!arrayDeque.isEmpty()) {
                        if (th3 != th) {
                            int length2 = stackTraceElementArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    i3 = -1;
                                    break;
                                }
                                if (d(stackTraceElementArr[i3])) {
                                    break;
                                }
                                i3++;
                            }
                            int i4 = i3 + 1;
                            int length3 = stackTraceElementArr.length - 1;
                            if (i4 <= length3) {
                                while (true) {
                                    StackTraceElement stackTraceElement = stackTraceElementArr[length3];
                                    StackTraceElement stackTraceElement2 = (StackTraceElement) arrayDeque.getLast();
                                    if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && ksp.b(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && ksp.b(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && ksp.b(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
                                        arrayDeque.removeLast();
                                    }
                                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                                    if (length3 == i4) {
                                        break;
                                    }
                                    length3--;
                                }
                            }
                        }
                        arrayDeque.addFirst(a);
                        StackTraceElement[] stackTrace2 = th3.getStackTrace();
                        int e = e(stackTrace2, b);
                        if (e == -1) {
                            a2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
                            return a2;
                        }
                        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + e];
                        for (int i5 = 0; i5 < e; i5++) {
                            stackTraceElementArr2[i5] = stackTrace2[i5];
                        }
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            stackTraceElementArr2[i + e] = (StackTraceElement) it.next();
                            i++;
                        }
                        a2.setStackTrace(stackTraceElementArr2);
                        return a2;
                    }
                }
            }
        }
        kolVar = new kol(th, new StackTraceElement[0]);
        Object obj2 = kolVar.b;
        Throwable th32 = (Throwable) kolVar.a;
        StackTraceElement[] stackTraceElementArr3 = (StackTraceElement[]) obj2;
        a2 = lck.a(th32);
        if (a2 != null) {
        }
        return th;
    }

    public static final Throwable b(Throwable th) {
        Throwable a2;
        boolean z = lbp.a;
        if (lbp.a || !kvo.b || (a2 = lck.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = a2.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (ksp.b(c, stackTrace[i].getClassName())) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        i = -1;
        int e = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (e == -1 ? 0 : length - e);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        a2.setStackTrace(stackTraceElementArr);
        return a2;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (ksp.b(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (d(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return ksp.s(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (ksp.b(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}

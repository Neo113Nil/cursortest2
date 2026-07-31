package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import m6.p0;
import v5.k;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18381a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f18382b;

    static {
        Object a7;
        Object a8;
        try {
            k.a aVar = v5.k.f22832f;
            a7 = v5.k.a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            k.a aVar2 = v5.k.f22832f;
            a7 = v5.k.a(v5.l.a(th));
        }
        if (v5.k.b(a7) != null) {
            a7 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f18381a = (String) a7;
        try {
            k.a aVar3 = v5.k.f22832f;
            a8 = v5.k.a(x.class.getCanonicalName());
        } catch (Throwable th2) {
            k.a aVar4 = v5.k.f22832f;
            a8 = v5.k.a(v5.l.a(th2));
        }
        if (v5.k.b(a8) != null) {
            a8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f18382b = (String) a8;
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(kotlin.jvm.internal.i.i("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> v5.j<E, StackTraceElement[]> c(E e7) {
        boolean z6;
        Throwable cause = e7.getCause();
        if (cause == null || !kotlin.jvm.internal.i.a(cause.getClass(), e7.getClass())) {
            return v5.n.a(e7, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e7.getStackTrace();
        int length = stackTrace.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                z6 = false;
                break;
            }
            if (h(stackTrace[i7])) {
                z6 = true;
                break;
            }
            i7++;
        }
        return z6 ? v5.n.a(cause, stackTrace) : v5.n.a(e7, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e7, E e8, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e7.getStackTrace();
        int g7 = g(stackTrace, f18381a);
        int i7 = 0;
        if (g7 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e8.setStackTrace((StackTraceElement[]) array);
            return e8;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g7];
        if (g7 > 0) {
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                stackTraceElementArr[i8] = stackTrace[i8];
                if (i9 >= g7) {
                    break;
                }
                i8 = i9;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i10 = i7 + 1;
            stackTraceElementArr[i7 + g7] = it.next();
            i7 = i10;
        }
        e8.setStackTrace(stackTraceElementArr);
        return e8;
    }

    private static final ArrayDeque<StackTraceElement> e(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.i.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.i.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.i.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (kotlin.jvm.internal.i.a(str, stackTraceElementArr[i7].getClassName())) {
                return i7;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        boolean o7;
        o7 = l6.m.o(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return o7;
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            } else if (h(stackTraceElementArr[i7])) {
                break;
            } else {
                i7++;
            }
        }
        int i8 = i7 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i8 > length2) {
            return;
        }
        while (true) {
            int i9 = length2 - 1;
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i8) {
                return;
            } else {
                length2 = i9;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E j(E e7, kotlin.coroutines.jvm.internal.e eVar) {
        v5.j c7 = c(e7);
        Throwable th = (Throwable) c7.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c7.b();
        Throwable m7 = m(th);
        if (m7 == null) {
            return e7;
        }
        ArrayDeque<StackTraceElement> e8 = e(eVar);
        if (e8.isEmpty()) {
            return e7;
        }
        if (th != e7) {
            i(stackTraceElementArr, e8);
        }
        return (E) d(th, m7, e8);
    }

    public static final <E extends Throwable> E k(E e7) {
        Throwable m7;
        return (p0.d() && (m7 = m(e7)) != null) ? (E) l(m7) : e7;
    }

    private static final <E extends Throwable> E l(E e7) {
        StackTraceElement[] stackTrace = e7.getStackTrace();
        int length = stackTrace.length;
        int g7 = g(stackTrace, f18382b);
        int i7 = g7 + 1;
        int g8 = g(stackTrace, f18381a);
        int i8 = 0;
        int i9 = (length - g7) - (g8 == -1 ? 0 : length - g8);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i9];
        while (i8 < i9) {
            stackTraceElementArr[i8] = i8 == 0 ? b("Coroutine boundary") : stackTrace[(i7 + i8) - 1];
            i8++;
        }
        e7.setStackTrace(stackTraceElementArr);
        return e7;
    }

    private static final <E extends Throwable> E m(E e7) {
        E e8 = (E) h.e(e7);
        if (e8 == null) {
            return null;
        }
        if ((e7 instanceof m6.d0) || kotlin.jvm.internal.i.a(e8.getMessage(), e7.getMessage())) {
            return e8;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e7) {
        E e8 = (E) e7.getCause();
        if (e8 != null && kotlin.jvm.internal.i.a(e8.getClass(), e7.getClass())) {
            StackTraceElement[] stackTrace = e7.getStackTrace();
            int length = stackTrace.length;
            boolean z6 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (h(stackTrace[i7])) {
                    z6 = true;
                    break;
                }
                i7++;
            }
            if (z6) {
                return e8;
            }
        }
        return e7;
    }
}

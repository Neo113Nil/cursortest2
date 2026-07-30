package i;

import cn.hutool.core.io.d;
import cn.hutool.core.lang.d0;
import cn.hutool.core.map.h1;
import cn.hutool.core.text.l;
import cn.hutool.core.util.c1;
import cn.hutool.core.util.h;
import cn.hutool.core.util.y0;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    public static <T extends Throwable> T convertFromOrSuppressedThrowable(Throwable th, Class<T> cls) {
        return (T) convertFromOrSuppressedThrowable(th, cls, true);
    }

    public static Throwable getCausedBy(Throwable th, Class<? extends Exception>... clsArr) {
        while (th != null) {
            for (Class<? extends Exception> cls : clsArr) {
                if (cls.isInstance(th)) {
                    return th;
                }
            }
            th = th.getCause();
        }
        return null;
    }

    public static String getMessage(Throwable th) {
        return th == null ? "null" : l.format("{}: {}", th.getClass().getSimpleName(), th.getMessage());
    }

    public static Throwable getRootCause(Throwable th) {
        List<Throwable> throwableList = getThrowableList(th);
        if (throwableList.size() < 1) {
            return null;
        }
        return throwableList.get(throwableList.size() - 1);
    }

    public static String getRootCauseMessage(Throwable th) {
        return getMessage(getRootCause(th));
    }

    public static StackTraceElement getRootStackElement() {
        return Thread.currentThread().getStackTrace()[Thread.currentThread().getStackTrace().length - 1];
    }

    public static String getSimpleMessage(Throwable th) {
        return th == null ? "null" : th.getMessage();
    }

    public static StackTraceElement getStackElement(int i8) {
        return Thread.currentThread().getStackTrace()[i8];
    }

    public static StackTraceElement[] getStackElements() {
        return Thread.currentThread().getStackTrace();
    }

    public static List<Throwable> getThrowableList(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        return arrayList;
    }

    public static boolean isCausedBy(Throwable th, Class<? extends Exception>... clsArr) {
        return getCausedBy(th, clsArr) != null;
    }

    public static boolean isFromOrSuppressedThrowable(Throwable th, Class<? extends Throwable> cls) {
        return convertFromOrSuppressedThrowable(th, cls, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getStackElement$0(String str, StackTraceElement stackTraceElement) {
        return l.equals(str, stackTraceElement.getClassName());
    }

    public static String stacktraceToOneLineString(Throwable th) {
        return stacktraceToOneLineString(th, 3000);
    }

    public static String stacktraceToString(Throwable th) {
        return stacktraceToString(th, 3000);
    }

    public static Throwable unwrap(Throwable th) {
        while (true) {
            if (th instanceof InvocationTargetException) {
                th = ((InvocationTargetException) th).getTargetException();
            } else {
                if (!(th instanceof UndeclaredThrowableException)) {
                    return th;
                }
                th = ((UndeclaredThrowableException) th).getUndeclaredThrowable();
            }
        }
    }

    public static <T extends Throwable> T wrap(Throwable th, Class<T> cls) {
        return cls.isInstance(th) ? th : (T) y0.newInstance(cls, th);
    }

    public static void wrapAndThrow(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new UndeclaredThrowableException(th);
        }
        throw ((Error) th);
    }

    public static RuntimeException wrapRuntime(Throwable th) {
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    public static void wrapRuntimeAndThrow(String str) {
        throw new RuntimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Throwable> T convertFromOrSuppressedThrowable(Throwable th, Class<T> cls, boolean z7) {
        T t7;
        if (th != 0 && cls != null) {
            if (cls.isAssignableFrom(th.getClass())) {
                return th;
            }
            if (z7 && (t7 = (T) th.getCause()) != null && cls.isAssignableFrom(t7.getClass())) {
                return t7;
            }
            Throwable[] suppressed = th.getSuppressed();
            if (h.isNotEmpty((Object[]) suppressed)) {
                for (Throwable th2 : suppressed) {
                    T t8 = (T) th2;
                    if (cls.isAssignableFrom(t8.getClass())) {
                        return t8;
                    }
                }
            }
        }
        return null;
    }

    public static StackTraceElement getStackElement(final String str, int i8) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int matchIndex = h.matchIndex(new d0() { // from class: i.a
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                boolean lambda$getStackElement$0;
                lambda$getStackElement$0 = b.lambda$getStackElement$0(str, (StackTraceElement) obj);
                return lambda$getStackElement$0;
            }
        }, stackTrace);
        if (matchIndex > 0) {
            return stackTrace[matchIndex + i8];
        }
        return null;
    }

    public static boolean isFromOrSuppressedThrowable(Throwable th, Class<? extends Throwable> cls, boolean z7) {
        return convertFromOrSuppressedThrowable(th, cls, z7) != null;
    }

    public static String stacktraceToOneLineString(Throwable th, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put('\r', l.SPACE);
        hashMap.put('\n', l.SPACE);
        hashMap.put('\t', l.SPACE);
        return stacktraceToString(th, i8, hashMap);
    }

    public static String stacktraceToString(Throwable th, int i8) {
        return stacktraceToString(th, i8, null);
    }

    public static String stacktraceToString(Throwable th, int i8, Map<Character, String> map) {
        d dVar = new d();
        th.printStackTrace(new PrintStream(dVar));
        String dVar2 = dVar.toString();
        int length = dVar2.length();
        if (i8 < 0 || i8 > length) {
            i8 = length;
        }
        if (!h1.isNotEmpty(map)) {
            return i8 == length ? dVar2 : l.subPre(dVar2, i8);
        }
        StringBuilder builder = c1.builder();
        for (int i9 = 0; i9 < i8; i9++) {
            char charAt = dVar2.charAt(i9);
            String str = map.get(Character.valueOf(charAt));
            if (str != null) {
                builder.append(str);
            } else {
                builder.append(charAt);
            }
        }
        return builder.toString();
    }

    public static RuntimeException wrapRuntime(String str) {
        return new RuntimeException(str);
    }
}

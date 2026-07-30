package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes5.dex */
public abstract class f0 {
    private static final StackTraceElement ARTIFICIAL_FRAME = new a.a().coroutineBoundary();
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object m348constructorimpl;
        Object m348constructorimpl2;
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        if (Result.m351exceptionOrNullimpl(m348constructorimpl) != null) {
            m348constructorimpl = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) m348constructorimpl;
        try {
            m348constructorimpl2 = Result.m348constructorimpl(f0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            m348constructorimpl2 = Result.m348constructorimpl(y5.g.createFailure(th2));
        }
        if (Result.m351exceptionOrNullimpl(m348constructorimpl2) != null) {
            m348constructorimpl2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) m348constructorimpl2;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e8) {
        Throwable cause = e8.getCause();
        if (cause == null || !kotlin.jvm.internal.s.areEqual(cause.getClass(), e8.getClass())) {
            return y5.h.to(e8, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e8.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return y5.h.to(cause, stackTrace);
            }
        }
        return y5.h.to(e8, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e8, E e9, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e8.getStackTrace();
        int firstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i8 = 0;
        if (firstFrameIndex == -1) {
            e9.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e9;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + firstFrameIndex];
        for (int i9 = 0; i9 < firstFrameIndex; i9++) {
            stackTraceElementArr[i9] = stackTrace[i9];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i10 = i8 + 1;
            stackTraceElementArr[i8 + firstFrameIndex] = it.next();
            i8 = i10;
        }
        e9.setStackTrace(stackTraceElementArr);
        return e9;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(kotlin.coroutines.jvm.internal.c cVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = cVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = cVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.s.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.s.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.s.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (kotlin.jvm.internal.s.areEqual(str, stackTraceElementArr[i8].getClassName())) {
                return i8;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return kotlin.text.t.startsWith$default(stackTraceElement.getClassName(), a.b.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i8])) {
                break;
            } else {
                i8++;
            }
        }
        int i9 = i8 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i9 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i9) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e8, kotlin.coroutines.jvm.internal.c cVar) {
        Pair causeAndStacktrace = causeAndStacktrace(e8);
        Throwable th = (Throwable) causeAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) causeAndStacktrace.component2();
        Throwable tryCopyException = ExceptionsConstructorKt.tryCopyException(th);
        if (tryCopyException == null) {
            return e8;
        }
        ArrayDeque<StackTraceElement> createStackTrace = createStackTrace(cVar);
        if (createStackTrace.isEmpty()) {
            return e8;
        }
        if (th != e8) {
            mergeRecoveredTraces(stackTraceElementArr, createStackTrace);
        }
        return (E) createFinalException(th, tryCopyException, createStackTrace);
    }

    public static final <E extends Throwable> E recoverStackTrace(E e8) {
        return e8;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e8) {
        StackTraceElement[] stackTrace = e8.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i8 = length2 - 1;
                if (kotlin.jvm.internal.s.areEqual(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                length2 = i8;
            }
        }
        length2 = -1;
        int i9 = length2 + 1;
        int firstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i10 = 0;
        int i11 = (length - length2) - (firstFrameIndex == -1 ? 0 : length - firstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i11];
        while (i10 < i11) {
            stackTraceElementArr[i10] = i10 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i9 + i10) - 1];
            i10++;
        }
        e8.setStackTrace(stackTraceElementArr);
        return e8;
    }

    public static final <E extends Throwable> E unwrap(E e8) {
        return e8;
    }

    public static final <E extends Throwable> E unwrapImpl(E e8) {
        E e9 = (E) e8.getCause();
        if (e9 != null && kotlin.jvm.internal.s.areEqual(e9.getClass(), e8.getClass())) {
            for (StackTraceElement stackTraceElement : e8.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e9;
                }
            }
        }
        return e8;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e8, kotlin.coroutines.c cVar) {
        return e8;
    }

    public static final Object recoverAndThrow(Throwable th, kotlin.coroutines.c cVar) {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, kotlin.coroutines.c cVar) {
        throw th;
    }
}

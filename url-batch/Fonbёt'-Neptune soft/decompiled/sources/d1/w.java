package d1;

import a.AbstractC0132a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2108a = 0;

    static {
        Object b2;
        Object b3;
        Exception exc = new Exception();
        String simpleName = AbstractC0132a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b2 = J0.b.class.getCanonicalName();
        } catch (Throwable th) {
            b2 = i1.a.b(th);
        }
        if (F0.e.a(b2) != null) {
            b2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b3 = w.class.getCanonicalName();
        } catch (Throwable th2) {
            b3 = i1.a.b(th2);
        }
        if (F0.e.a(b3) != null) {
            b3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

package p0;

import a.AbstractC0016a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1180a = 0;

    static {
        Object h2;
        Object h3;
        Exception exc = new Exception();
        String simpleName = AbstractC0016a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            h2 = Y.b.class.getCanonicalName();
        } catch (Throwable th) {
            h2 = AbstractC0016a.h(th);
        }
        if (U.d.a(h2) != null) {
            h2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            h3 = w.class.getCanonicalName();
        } catch (Throwable th2) {
            h3 = AbstractC0016a.h(th2);
        }
        if (U.d.a(h3) != null) {
            h3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

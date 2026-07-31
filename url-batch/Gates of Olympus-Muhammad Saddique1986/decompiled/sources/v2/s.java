package v2;

import a.AbstractC0235a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9827a = 0;

    static {
        Object b3;
        Object b4;
        Exception exc = new Exception();
        String simpleName = AbstractC0235a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b3 = X1.a.class.getCanonicalName();
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        if (R1.l.a(b3) != null) {
            b3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b4 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            b4 = R1.a.b(th2);
        }
        if (R1.l.a(b4) != null) {
            b4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

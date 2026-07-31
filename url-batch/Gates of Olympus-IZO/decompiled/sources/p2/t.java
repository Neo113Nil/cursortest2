package p2;

import a.AbstractC0157a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6807a = 0;

    static {
        Object t3;
        Object t4;
        Exception exc = new Exception();
        String simpleName = AbstractC0157a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            t3 = R1.a.class.getCanonicalName();
        } catch (Throwable th) {
            t3 = I2.l.t(th);
        }
        if (L1.m.a(t3) != null) {
            t3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            t4 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            t4 = I2.l.t(th2);
        }
        if (L1.m.a(t4) != null) {
            t4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

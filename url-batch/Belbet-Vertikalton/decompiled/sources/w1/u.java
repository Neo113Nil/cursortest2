package w1;

import a.AbstractC0058a;
import c1.AbstractC0104a;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4501a = 0;

    static {
        Object r2;
        Object r3;
        Exception exc = new Exception();
        String simpleName = AbstractC0058a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            r2 = AbstractC0104a.class.getCanonicalName();
        } catch (Throwable th) {
            r2 = H1.d.r(th);
        }
        if (W0.f.a(r2) != null) {
            r2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            r3 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            r3 = H1.d.r(th2);
        }
        if (W0.f.a(r3) != null) {
            r3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

package M5;

import a.AbstractC0219a;
import k5.AbstractC0479i;
import q5.AbstractC0605a;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1623a = 0;

    static {
        Object f7;
        Object f8;
        Exception exc = new Exception();
        String simpleName = AbstractC0219a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            f7 = AbstractC0605a.class.getCanonicalName();
        } catch (Throwable th) {
            f7 = AbstractC0676f.f(th);
        }
        if (AbstractC0479i.a(f7) != null) {
            f7 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            f8 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            f8 = AbstractC0676f.f(th2);
        }
        if (AbstractC0479i.a(f8) != null) {
            f8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

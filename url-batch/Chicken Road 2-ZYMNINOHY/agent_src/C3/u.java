package C3;

import a.AbstractC0124a;
import c3.C0294f;
import h3.AbstractC0448a;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f319a = 0;

    static {
        Object h2;
        Object h4;
        Exception exc = new Exception();
        String simpleName = AbstractC0124a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            h2 = AbstractC0448a.class.getCanonicalName();
        } catch (Throwable th) {
            h2 = O3.l.h(th);
        }
        if (C0294f.a(h2) != null) {
            h2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            h4 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            h4 = O3.l.h(th2);
        }
        if (C0294f.a(h4) != null) {
            h4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

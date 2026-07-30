package s6;

import a.AbstractC0169a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7855a = 0;

    static {
        Object n7;
        Object n8;
        Exception exc = new Exception();
        String simpleName = AbstractC0169a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            R5.l lVar = R5.n.f2421d;
            n7 = X5.a.class.getCanonicalName();
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        if (R5.n.a(n7) != null) {
            n7 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            n8 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            R5.l lVar3 = R5.n.f2421d;
            n8 = V6.b.n(th2);
        }
        if (R5.n.a(n8) != null) {
            n8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

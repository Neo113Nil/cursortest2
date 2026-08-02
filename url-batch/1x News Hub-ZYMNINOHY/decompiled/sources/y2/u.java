package y2;

import a.AbstractC0129a;
import b2.C0192f;
import f2.AbstractC0324a;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10867a = 0;

    static {
        Object k3;
        Object k4;
        Exception exc = new Exception();
        String simpleName = AbstractC0129a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            k3 = AbstractC0324a.class.getCanonicalName();
        } catch (Throwable th) {
            k3 = android.support.v4.media.session.a.k(th);
        }
        if (C0192f.a(k3) != null) {
            k3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            k4 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            k4 = android.support.v4.media.session.a.k(th2);
        }
        if (C0192f.a(k4) != null) {
            k4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

package b3;

import a.AbstractC0345a;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5687a = 0;

    static {
        Object a4;
        Object a5;
        Exception exc = new Exception();
        String simpleName = AbstractC0345a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            a4 = E2.a.class.getCanonicalName();
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (AbstractC1341p.a(a4) != null) {
            a4 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            a5 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            a5 = AbstractC1343r.a(th2);
        }
        if (AbstractC1341p.a(a5) != null) {
            a5 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

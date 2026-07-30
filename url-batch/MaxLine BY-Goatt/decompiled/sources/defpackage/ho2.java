package defpackage;

import defpackage.aa2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ho2 {
    public static final /* synthetic */ int a = 0;

    static {
        Object ba2Var;
        Object ba2Var2;
        Exception exc = new Exception();
        String simpleName = s93.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            aa2.a aVar = aa2.m;
            ba2Var = hn.class.getCanonicalName();
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        if (aa2.a(ba2Var) != null) {
            ba2Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            ba2Var2 = ho2.class.getCanonicalName();
        } catch (Throwable th2) {
            aa2.a aVar3 = aa2.m;
            ba2Var2 = new ba2(th2);
        }
        if (aa2.a(ba2Var2) != null) {
            ba2Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

package le;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6000a = 0;

    static {
        Object mVar;
        Object mVar2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            hd.l lVar = hd.n.f4511e;
            mVar = nd.a.class.getCanonicalName();
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        if (hd.n.a(mVar) != null) {
            mVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            mVar2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            hd.l lVar3 = hd.n.f4511e;
            mVar2 = new hd.m(th2);
        }
        if (hd.n.a(mVar2) != null) {
            mVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

package t2;

import a.C1234a;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f46204a = new C1234a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f46205b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f46206c;

    static {
        Object m243constructorimpl;
        Object m243constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f46205b = (String) m243constructorimpl;
        try {
            m243constructorimpl2 = Result.m243constructorimpl(F.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m243constructorimpl2 = Result.m243constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.d(m243constructorimpl2) != null) {
            m243constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f46206c = (String) m243constructorimpl2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}

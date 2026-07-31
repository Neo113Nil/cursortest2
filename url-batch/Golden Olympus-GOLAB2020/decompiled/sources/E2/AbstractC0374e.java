package E2;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: E2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0374e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f601a;

    static {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m243constructorimpl = Result.m243constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        Integer num = (Integer) m243constructorimpl;
        f601a = num != null ? num.intValue() : 2097152;
    }
}

package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes10.dex */
public abstract class ArrayPoolsKt {
    public static final int MAX_CHARS_IN_POOL;

    static {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            failure = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Integer num = (Integer) (failure instanceof Result.Failure ? null : failure);
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : PKIFailureInfo.badSenderNonce;
    }
}

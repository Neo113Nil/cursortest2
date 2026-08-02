package kotlin.reflect.jvm.internal;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class CacheByClassKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            failure = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
    }
}

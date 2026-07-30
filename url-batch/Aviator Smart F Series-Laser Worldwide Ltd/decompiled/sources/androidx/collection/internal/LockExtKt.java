package androidx.collection.internal;

import f6.a;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m31synchronized(Lock lock, a block) {
        T t7;
        s.checkNotNullParameter(lock, "<this>");
        s.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                t7 = (T) block.invoke();
                r.finallyStart(1);
            } catch (Throwable th) {
                r.finallyStart(1);
                r.finallyEnd(1);
                throw th;
            }
        }
        r.finallyEnd(1);
        return t7;
    }
}

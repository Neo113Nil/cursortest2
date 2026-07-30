package androidx.collection.internal;

import f6.a;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(a block) {
        T t7;
        s.checkNotNullParameter(block, "block");
        synchronized (this) {
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

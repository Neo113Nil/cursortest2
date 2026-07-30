package kotlin.io;

import f6.l;
import java.io.Closeable;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void closeFinally(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                y5.b.addSuppressed(th, th2);
            }
        }
    }

    private static final <T extends Closeable, R> R use(T t7, l block) {
        s.checkNotNullParameter(block, "block");
        try {
            R r8 = (R) block.invoke(t7);
            r.finallyStart(1);
            if (b6.b.apiVersionIsAtLeast(1, 1, 0)) {
                closeFinally(t7, null);
            } else if (t7 != null) {
                t7.close();
            }
            r.finallyEnd(1);
            return r8;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r.finallyStart(1);
                if (b6.b.apiVersionIsAtLeast(1, 1, 0)) {
                    closeFinally(t7, th);
                } else if (t7 != null) {
                    try {
                        t7.close();
                    } catch (Throwable unused) {
                    }
                }
                r.finallyEnd(1);
                throw th2;
            }
        }
    }
}

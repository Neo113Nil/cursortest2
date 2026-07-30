package okio;

import java.io.Closeable;

/* loaded from: classes5.dex */
abstract /* synthetic */ class l0 {
    public static final v0 blackhole() {
        return new b();
    }

    public static final e buffer(x0 x0Var) {
        kotlin.jvm.internal.s.checkNotNullParameter(x0Var, "<this>");
        return new s0(x0Var);
    }

    public static final <T extends Closeable, R> R use(T t7, f6.l block) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        Throwable th = null;
        try {
            r8 = (R) block.invoke(t7);
        } catch (Throwable th2) {
            th = th2;
            r8 = null;
        }
        if (t7 != null) {
            try {
                t7.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    y5.b.addSuppressed(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.s.checkNotNull(r8);
        return r8;
    }

    public static final d buffer(v0 v0Var) {
        kotlin.jvm.internal.s.checkNotNullParameter(v0Var, "<this>");
        return new r0(v0Var);
    }
}

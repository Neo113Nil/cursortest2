package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qw extends h70 implements Executor {
    public static final ju dgRBjINgWbAK;
    public static final qw wdg6QnbFHrFF = new qw();

    static {
        qo2 qo2Var = qo2.wdg6QnbFHrFF;
        int i = yc2.PxuCJdSBwIXG;
        if (64 >= i) {
            i = 64;
        }
        dgRBjINgWbAK = qo2Var.i68hK7ahKtgp(ni0.zf8DYfih6EZu(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.ju
    public final void Pf0ThKz3j5YS(hu huVar, Runnable runnable) {
        dgRBjINgWbAK.Pf0ThKz3j5YS(huVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Pf0ThKz3j5YS(n50.rtx2ld2ELZv4, runnable);
    }

    @Override // defpackage.ju
    public final void gGoUzNp9JO5I(hu huVar, Runnable runnable) {
        dgRBjINgWbAK.gGoUzNp9JO5I(huVar, runnable);
    }

    @Override // defpackage.ju
    public final String toString() {
        return "Dispatchers.IO";
    }
}

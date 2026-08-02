package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blz implements Executor {
    public static final blz a = new blz(3);
    private final /* synthetic */ int b;

    public blz(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            runnable.run();
            return;
        }
        if (i == 1) {
            bmi.g(runnable);
        } else if (i != 2) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}

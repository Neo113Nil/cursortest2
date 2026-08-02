package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hst {
    static final hst a = new hst();
    final Runnable b;
    final Executor c;
    hst next;

    public hst() {
        this.b = null;
        this.c = null;
    }

    public hst(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

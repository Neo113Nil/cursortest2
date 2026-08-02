package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rg {
    static final rg a = new rg(null, null);
    final Runnable b;
    final Executor c;
    rg next;

    public rg(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

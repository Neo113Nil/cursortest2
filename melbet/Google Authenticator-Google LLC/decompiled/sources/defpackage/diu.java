package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class diu implements ThreadFactory {
    public final dis a;
    private final ThreadFactory b;

    public diu(ThreadFactory threadFactory, dis disVar) {
        this.b = threadFactory;
        this.a = disVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.b.newThread(new dgc(this, runnable, 9));
    }
}

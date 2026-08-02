package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfb implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public bfb(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        bfa bfaVar = new bfa(new avl(this, runnable, 6, (int[]) null));
        bfaVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return bfaVar;
    }
}

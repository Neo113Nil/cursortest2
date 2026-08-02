package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dfq implements ThreadFactory {
    private final /* synthetic */ int a;

    public /* synthetic */ dfq(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            return new Thread(runnable);
        }
        if (i == 1) {
            return new wi(runnable);
        }
        if (i == 2) {
            return new Thread(runnable);
        }
        if (i != 3) {
            return Executors.defaultThreadFactory().newThread(new kkh(runnable, 8));
        }
        AtomicReference atomicReference = etd.a;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}

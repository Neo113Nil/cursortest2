package o2;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class Y implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3313G f42036b;

    public Y(AbstractC3313G abstractC3313G) {
        this.f42036b = abstractC3313G;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC3313G abstractC3313G = this.f42036b;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f41113b;
        if (abstractC3313G.i(gVar)) {
            this.f42036b.g(gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f42036b.toString();
    }
}

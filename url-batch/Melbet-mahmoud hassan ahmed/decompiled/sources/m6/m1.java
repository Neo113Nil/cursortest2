package m6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
final class m1 extends q1 {

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19307k = AtomicIntegerFieldUpdater.newUpdater(m1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: j, reason: collision with root package name */
    private final f6.l<Throwable, v5.q> f19308j;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(f6.l<? super Throwable, v5.q> lVar) {
        this.f19308j = lVar;
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ v5.q invoke(Throwable th) {
        y(th);
        return v5.q.f22838a;
    }

    @Override // m6.a0
    public void y(Throwable th) {
        if (f19307k.compareAndSet(this, 0, 1)) {
            this.f19308j.invoke(th);
        }
    }
}

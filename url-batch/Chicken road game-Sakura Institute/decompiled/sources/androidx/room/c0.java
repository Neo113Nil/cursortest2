package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public Runnable f1072g;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f1071f = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final Object f1073h = new Object();

    public final void a() {
        synchronized (this.f1073h) {
            Object poll = this.f1071f.poll();
            Runnable runnable = (Runnable) poll;
            this.f1072g = runnable;
            if (poll != null) {
                g.b.p0().f3655d.f3659e.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r6.k.f(runnable, "command");
        synchronized (this.f1073h) {
            this.f1071f.offer(new b0(runnable, 0, this));
            if (this.f1072g == null) {
                a();
            }
        }
    }
}

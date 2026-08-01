package d6;

import f8.j0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3638d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f3639e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f3640i;

    /* renamed from: r, reason: collision with root package name */
    public Runnable f3641r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f3642s;

    public l(Executor executor, int i3) {
        this.f3638d = i3;
        switch (i3) {
            case 1:
                executor.getClass();
                this.f3639e = executor;
                this.f3640i = new ArrayDeque();
                this.f3642s = new Object();
                break;
            default:
                this.f3639e = executor;
                this.f3640i = new ArrayDeque();
                this.f3642s = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.f3638d) {
            case 0:
                Runnable runnable = (Runnable) this.f3640i.poll();
                this.f3641r = runnable;
                if (runnable != null) {
                    this.f3639e.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f3642s) {
                    Object poll = this.f3640i.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.f3641r = runnable2;
                    if (poll != null) {
                        this.f3639e.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3638d) {
            case 0:
                synchronized (this.f3642s) {
                    try {
                        this.f3640i.add(new j0(5, this, runnable));
                        if (this.f3641r == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.f3642s) {
                    this.f3640i.offer(new a6.f(20, runnable, this));
                    if (this.f3641r == null) {
                        a();
                    }
                }
                return;
        }
    }
}

package Q0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2310d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2311e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f2312i;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f2313l;

    /* renamed from: m, reason: collision with root package name */
    public final Executor f2314m;

    public m(Executor executor) {
        this.f2310d = 0;
        this.f2314m = executor;
        this.f2312i = new ArrayDeque();
        this.f2311e = new Object();
    }

    public final void a() {
        switch (this.f2310d) {
            case 0:
                Runnable runnable = (Runnable) this.f2312i.poll();
                this.f2313l = runnable;
                if (runnable != null) {
                    this.f2314m.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f2311e) {
                    try {
                        Runnable runnable2 = (Runnable) this.f2312i.poll();
                        this.f2313l = runnable2;
                        if (runnable2 != null) {
                            ((K1.n) this.f2314m).execute(runnable2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2310d) {
            case 0:
                synchronized (this.f2311e) {
                    try {
                        this.f2312i.add(new F.a(this, 18, runnable));
                        if (this.f2313l == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f2311e) {
                    try {
                        this.f2312i.add(new A.j(this, 23, runnable));
                        if (this.f2313l == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public m(K1.n nVar) {
        this.f2310d = 1;
        this.f2311e = new Object();
        this.f2312i = new ArrayDeque();
        this.f2314m = nVar;
    }
}

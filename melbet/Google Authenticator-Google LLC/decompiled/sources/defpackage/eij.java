package defpackage;

import android.app.Activity;
import android.os.Looper;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eij implements Executor, ekz {
    public final hvm a;
    private final koe d;
    private final bry f;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final AtomicBoolean e = new AtomicBoolean();

    public eij(hvm hvmVar, bry bryVar, koe koeVar) {
        this.a = hvmVar;
        this.f = bryVar;
        this.d = koeVar;
        elb elbVar = ((elc) bryVar.a).a;
        int i = elb.c;
        if (elbVar.b.get() > 0) {
            k();
        } else {
            bryVar.g(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new avc(this, 10), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ekz
    public final void c(Activity activity) {
        this.f.h(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            j();
        } else {
            if (this.e.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((gzp) ((jrx) this.d).a).d(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new gin(this, 1));
            } else {
                this.a.schedule(new avc(this, 9), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.c = true;
        j();
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void f(int i) {
    }
}

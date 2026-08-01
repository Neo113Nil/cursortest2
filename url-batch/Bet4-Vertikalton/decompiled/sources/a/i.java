package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0106i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1163a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1165c;
    public final /* synthetic */ AbstractActivityC0106i d;

    public i(AbstractActivityC0106i abstractActivityC0106i) {
        this.d = abstractActivityC0106i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d1.d.e(runnable, "runnable");
        this.f1164b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        d1.d.d(decorView, "window.decorView");
        if (!this.f1165c) {
            decorView.postOnAnimation(new D0.p(7, this));
        } else if (d1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1164b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1163a) {
                this.f1165c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1164b = null;
        n nVar = (n) this.d.f1180g.a();
        synchronized (nVar.f1192a) {
            z2 = nVar.f1193b;
        }
        if (z2) {
            this.f1165c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

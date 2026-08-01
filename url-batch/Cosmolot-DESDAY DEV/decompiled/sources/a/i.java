package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0125i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1043a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1044b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1045c;
    public final /* synthetic */ AbstractActivityC0125i d;

    public i(AbstractActivityC0125i abstractActivityC0125i) {
        this.d = abstractActivityC0125i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X0.e.e(runnable, "runnable");
        this.f1044b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        X0.e.d(decorView, "window.decorView");
        if (!this.f1045c) {
            decorView.postOnAnimation(new B0.q(7, this));
        } else if (X0.e.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1044b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1043a) {
                this.f1045c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1044b = null;
        n nVar = (n) this.d.f1060g.a();
        synchronized (nVar.f1072a) {
            z2 = nVar.f1073b;
        }
        if (z2) {
            this.f1045c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import h.AbstractActivityC0132i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f2164a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f2165b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f2167d;

    public i(AbstractActivityC0132i abstractActivityC0132i) {
        this.f2167d = abstractActivityC0132i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j1.h.e(runnable, "runnable");
        this.f2165b = runnable;
        View decorView = this.f2167d.getWindow().getDecorView();
        j1.h.d(decorView, "window.decorView");
        if (!this.f2166c) {
            decorView.postOnAnimation(new A0.b(10, this));
        } else if (j1.h.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f2165b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2164a) {
                this.f2166c = false;
                this.f2167d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2165b = null;
        n nVar = (n) this.f2167d.f2182g.a();
        synchronized (nVar.f2194a) {
            z2 = nVar.f2195b;
        }
        if (z2) {
            this.f2166c = false;
            this.f2167d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2167d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

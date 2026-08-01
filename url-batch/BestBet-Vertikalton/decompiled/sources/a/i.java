package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0128i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1567a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1568b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1569c;
    public final /* synthetic */ AbstractActivityC0128i d;

    public i(AbstractActivityC0128i abstractActivityC0128i) {
        this.d = abstractActivityC0128i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k1.e.e(runnable, "runnable");
        this.f1568b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        k1.e.d(decorView, "window.decorView");
        if (!this.f1569c) {
            decorView.postOnAnimation(new E0.b(7, this));
        } else if (k1.e.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1568b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1567a) {
                this.f1569c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1568b = null;
        n nVar = (n) this.d.f1584g.a();
        synchronized (nVar.f1596a) {
            z2 = nVar.f1597b;
        }
        if (z2) {
            this.f1569c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

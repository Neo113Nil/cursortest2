package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.AbstractActivityC0064v;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f915a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f916b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0064v f918d;

    public l(AbstractActivityC0064v abstractActivityC0064v) {
        this.f918d = abstractActivityC0064v;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X0.f.e(runnable, "runnable");
        this.f916b = runnable;
        View decorView = this.f918d.getWindow().getDecorView();
        X0.f.d(decorView, "window.decorView");
        if (!this.f917c) {
            decorView.postOnAnimation(new B0.q(6, this));
        } else if (X0.f.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f916b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f915a) {
                this.f917c = false;
                this.f918d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f916b = null;
        r fullyDrawnReporter = this.f918d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f928a) {
            z2 = fullyDrawnReporter.f929b;
        }
        if (z2) {
            this.f917c = false;
            this.f918d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f918d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

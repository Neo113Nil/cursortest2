package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.AbstractActivityC0064v;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f914a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f915b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0064v f917d;

    public l(AbstractActivityC0064v abstractActivityC0064v) {
        this.f917d = abstractActivityC0064v;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X0.f.e(runnable, "runnable");
        this.f915b = runnable;
        View decorView = this.f917d.getWindow().getDecorView();
        X0.f.d(decorView, "window.decorView");
        if (!this.f916c) {
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
        Runnable runnable = this.f915b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f914a) {
                this.f916c = false;
                this.f917d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f915b = null;
        r fullyDrawnReporter = this.f917d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f927a) {
            z2 = fullyDrawnReporter.f928b;
        }
        if (z2) {
            this.f916c = false;
            this.f917d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f917d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

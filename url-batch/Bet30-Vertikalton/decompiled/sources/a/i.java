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
    public final long f1046a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1047b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1048c;
    public final /* synthetic */ AbstractActivityC0125i d;

    public i(AbstractActivityC0125i abstractActivityC0125i) {
        this.d = abstractActivityC0125i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X0.d.e(runnable, "runnable");
        this.f1047b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        X0.d.d(decorView, "window.decorView");
        if (!this.f1048c) {
            decorView.postOnAnimation(new B0.q(7, this));
        } else if (X0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1047b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1046a) {
                this.f1048c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1047b = null;
        n nVar = (n) this.d.f1063g.a();
        synchronized (nVar.f1075a) {
            z2 = nVar.f1076b;
        }
        if (z2) {
            this.f1048c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

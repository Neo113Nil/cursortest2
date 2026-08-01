package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0132i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1150a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1151b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1152c;
    public final /* synthetic */ AbstractActivityC0132i d;

    public i(AbstractActivityC0132i abstractActivityC0132i) {
        this.d = abstractActivityC0132i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e1.d.e(runnable, "runnable");
        this.f1151b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        e1.d.d(decorView, "window.decorView");
        if (!this.f1152c) {
            decorView.postOnAnimation(new C0.p(8, this));
        } else if (e1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1151b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1150a) {
                this.f1152c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1151b = null;
        n nVar = (n) this.d.f1167g.a();
        synchronized (nVar.f1179a) {
            z2 = nVar.f1180b;
        }
        if (z2) {
            this.f1152c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0108i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1193a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1194b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1195c;
    public final /* synthetic */ AbstractActivityC0108i d;

    public i(AbstractActivityC0108i abstractActivityC0108i) {
        this.d = abstractActivityC0108i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g1.d.e(runnable, "runnable");
        this.f1194b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        g1.d.d(decorView, "window.decorView");
        if (!this.f1195c) {
            decorView.postOnAnimation(new D0.p(8, this));
        } else if (g1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1194b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1193a) {
                this.f1195c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1194b = null;
        n nVar = (n) this.d.f1210g.a();
        synchronized (nVar.f1222a) {
            z2 = nVar.f1223b;
        }
        if (z2) {
            this.f1195c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

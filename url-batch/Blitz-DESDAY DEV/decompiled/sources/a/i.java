package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0110i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1248a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1249b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1250c;
    public final /* synthetic */ AbstractActivityC0110i d;

    public i(AbstractActivityC0110i abstractActivityC0110i) {
        this.d = abstractActivityC0110i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g1.d.e(runnable, "runnable");
        this.f1249b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        g1.d.d(decorView, "window.decorView");
        if (!this.f1250c) {
            decorView.postOnAnimation(new B.a(8, this));
        } else if (g1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1249b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1248a) {
                this.f1250c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1249b = null;
        n nVar = (n) this.d.f1265g.a();
        synchronized (nVar.f1277a) {
            z2 = nVar.f1278b;
        }
        if (z2) {
            this.f1250c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

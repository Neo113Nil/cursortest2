package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0136i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1187a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1188b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1189c;
    public final /* synthetic */ AbstractActivityC0136i d;

    public i(AbstractActivityC0136i abstractActivityC0136i) {
        this.d = abstractActivityC0136i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g1.f.e(runnable, "runnable");
        this.f1188b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        g1.f.d(decorView, "window.decorView");
        if (!this.f1189c) {
            decorView.postOnAnimation(new B0.b(7, this));
        } else if (g1.f.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1188b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1187a) {
                this.f1189c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1188b = null;
        n nVar = (n) this.d.f1204g.a();
        synchronized (nVar.f1216a) {
            z2 = nVar.f1217b;
        }
        if (z2) {
            this.f1189c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

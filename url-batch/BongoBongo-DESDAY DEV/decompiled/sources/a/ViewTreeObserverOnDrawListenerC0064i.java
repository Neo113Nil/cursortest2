package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0106i;
import java.util.concurrent.Executor;

/* renamed from: a.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0064i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1238a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1240c;
    public final /* synthetic */ AbstractActivityC0106i d;

    public ViewTreeObserverOnDrawListenerC0064i(AbstractActivityC0106i abstractActivityC0106i) {
        this.d = abstractActivityC0106i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h1.d.e(runnable, "runnable");
        this.f1239b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        h1.d.d(decorView, "window.decorView");
        if (!this.f1240c) {
            decorView.postOnAnimation(new A.a(9, this));
        } else if (h1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1239b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1238a) {
                this.f1240c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1239b = null;
        n nVar = (n) this.d.f1255g.a();
        synchronized (nVar.f1268a) {
            z2 = nVar.f1269b;
        }
        if (z2) {
            this.f1240c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

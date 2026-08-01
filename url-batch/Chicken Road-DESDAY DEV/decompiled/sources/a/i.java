package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0133i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1106a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1107b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1108c;
    public final /* synthetic */ AbstractActivityC0133i d;

    public i(AbstractActivityC0133i abstractActivityC0133i) {
        this.d = abstractActivityC0133i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b1.d.e(runnable, "runnable");
        this.f1107b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        b1.d.d(decorView, "window.decorView");
        if (!this.f1108c) {
            decorView.postOnAnimation(new C0.p(7, this));
        } else if (b1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1107b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1106a) {
                this.f1108c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1107b = null;
        n nVar = (n) this.d.f1123g.a();
        synchronized (nVar.f1135a) {
            z2 = nVar.f1136b;
        }
        if (z2) {
            this.f1108c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0131i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1081a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1082b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1083c;
    public final /* synthetic */ AbstractActivityC0131i d;

    public i(AbstractActivityC0131i abstractActivityC0131i) {
        this.d = abstractActivityC0131i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Z0.d.e(runnable, "runnable");
        this.f1082b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        Z0.d.d(decorView, "window.decorView");
        if (!this.f1083c) {
            decorView.postOnAnimation(new C0.p(8, this));
        } else if (Z0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1082b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1081a) {
                this.f1083c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1082b = null;
        n nVar = (n) this.d.f1098g.a();
        synchronized (nVar.f1110a) {
            z2 = nVar.f1111b;
        }
        if (z2) {
            this.f1083c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

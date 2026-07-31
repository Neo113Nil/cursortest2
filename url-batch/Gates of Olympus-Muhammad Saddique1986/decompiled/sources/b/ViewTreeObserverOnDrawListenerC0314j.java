package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0314j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: d, reason: collision with root package name */
    public final long f5292d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f5293e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0319o f5295g;

    public ViewTreeObserverOnDrawListenerC0314j(AbstractActivityC0319o abstractActivityC0319o) {
        this.f5295g = abstractActivityC0319o;
    }

    public final void a(View view) {
        if (this.f5294f) {
            return;
        }
        this.f5294f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f2.j.f(runnable, "runnable");
        this.f5293e = runnable;
        View decorView = this.f5295g.getWindow().getDecorView();
        f2.j.e(decorView, "window.decorView");
        if (!this.f5294f) {
            decorView.postOnAnimation(new E.t(4, this));
        } else if (f2.j.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f5293e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f5292d) {
                this.f5294f = false;
                this.f5295g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f5293e = null;
        C0326v c0326v = (C0326v) this.f5295g.f5319j.getValue();
        synchronized (c0326v.f5334a) {
            z3 = c0326v.f5335b;
        }
        if (z3) {
            this.f5294f = false;
            this.f5295g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5295g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

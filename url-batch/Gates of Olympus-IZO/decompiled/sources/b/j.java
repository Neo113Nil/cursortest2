package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: d, reason: collision with root package name */
    public final long f4157d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f4158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f4160g;

    public j(o oVar) {
        this.f4160g = oVar;
    }

    public final void a(View view) {
        if (this.f4159f) {
            return;
        }
        this.f4159f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Z1.i.f(runnable, "runnable");
        this.f4158e = runnable;
        View decorView = this.f4160g.getWindow().getDecorView();
        Z1.i.e(decorView, "window.decorView");
        if (!this.f4159f) {
            decorView.postOnAnimation(new E.u(3, this));
        } else if (Z1.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f4158e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4157d) {
                this.f4159f = false;
                this.f4160g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4158e = null;
        v vVar = (v) this.f4160g.f4183j.getValue();
        synchronized (vVar.f4197a) {
            z3 = vVar.f4198b;
        }
        if (z3) {
            this.f4159f = false;
            this.f4160g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4160g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: f, reason: collision with root package name */
    public final long f1171f = SystemClock.uptimeMillis() + 10000;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f1172g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1173h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f1174i;

    public k(o oVar) {
        this.f1174i = oVar;
    }

    public final void a(View view) {
        if (this.f1173h) {
            return;
        }
        this.f1173h = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r6.k.f(runnable, "runnable");
        this.f1172g = runnable;
        View decorView = this.f1174i.getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        if (!this.f1173h) {
            decorView.postOnAnimation(new androidx.lifecycle.c0(1, this));
        } else if (r6.k.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z8;
        Runnable runnable = this.f1172g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1171f) {
                this.f1173h = false;
                this.f1174i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1172g = null;
        x xVar = (x) this.f1174i.f1201l.getValue();
        synchronized (xVar.f1217b) {
            z8 = xVar.f1218c;
        }
        if (z8) {
            this.f1173h = false;
            this.f1174i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1174i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

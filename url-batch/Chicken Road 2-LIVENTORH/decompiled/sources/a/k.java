package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: f, reason: collision with root package name */
    public final long f35f = SystemClock.uptimeMillis() + 10000;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f36g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37h;
    public final /* synthetic */ g.j i;

    public k(g.j jVar) {
        this.i = jVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f3.d.e(runnable, "runnable");
        this.f36g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        f3.d.d(decorView, "getDecorView(...)");
        if (!this.f37h) {
            decorView.postOnAnimation(new j(0, this));
        } else if (f3.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f36g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f35f) {
                this.f37h = false;
                this.i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f36g = null;
        z zVar = (z) this.i.f49l.a();
        synchronized (zVar.f76a) {
            z3 = zVar.f77b;
        }
        if (z3) {
            this.f37h = false;
            this.i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

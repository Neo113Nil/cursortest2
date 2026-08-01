package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: f, reason: collision with root package name */
    public final long f35f = SystemClock.uptimeMillis() + 10000;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f36g;
    public boolean h;
    public final /* synthetic */ g.i i;

    public k(g.i iVar) {
        this.i = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i3.d.e(runnable, "runnable");
        this.f36g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        i3.d.d(decorView, "getDecorView(...)");
        if (!this.h) {
            decorView.postOnAnimation(new j(0, this));
        } else if (i3.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f36g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f35f) {
                this.h = false;
                this.i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f36g = null;
        z zVar = (z) this.i.f51l.a();
        synchronized (zVar.f75a) {
            z4 = zVar.f76b;
        }
        if (z4) {
            this.h = false;
            this.i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

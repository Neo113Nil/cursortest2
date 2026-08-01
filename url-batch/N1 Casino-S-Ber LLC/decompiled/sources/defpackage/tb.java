package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class tb implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long f = SystemClock.uptimeMillis() + 10000;
    public Runnable g;
    public boolean h;
    public final /* synthetic */ c3 i;

    public tb(c3 c3Var) {
        this.i = c3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        decorView.getClass();
        if (!this.h) {
            decorView.postOnAnimation(new m1(4, this));
        } else if (zo.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f) {
                this.h = false;
                this.i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.g = null;
        ll llVar = (ll) this.i.l.a();
        synchronized (llVar.a) {
            z = llVar.b;
        }
        if (z) {
            this.h = false;
            this.i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

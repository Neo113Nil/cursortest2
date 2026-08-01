package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tc implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long f = SystemClock.uptimeMillis() + 10000;
    public Runnable g;
    public boolean h;
    public final /* synthetic */ m3 i;

    public tc(m3 m3Var) {
        this.i = m3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        decorView.getClass();
        if (!this.h) {
            decorView.postOnAnimation(new n1(4, this));
        } else if (kr.b(Looper.myLooper(), Looper.getMainLooper())) {
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
        qn qnVar = (qn) this.i.l.a();
        synchronized (qnVar.a) {
            z = qnVar.b;
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

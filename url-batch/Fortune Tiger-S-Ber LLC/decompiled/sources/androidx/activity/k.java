package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: f, reason: collision with root package name */
    public final long f116f = SystemClock.uptimeMillis() + 10000;
    public Runnable g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f.i f117i;

    public k(f.i iVar) {
        this.f117i = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u2.c.e(runnable, "runnable");
        this.g = runnable;
        View decorView = this.f117i.getWindow().getDecorView();
        u2.c.d(decorView, "window.decorView");
        if (!this.h) {
            decorView.postOnAnimation(new a2.r(1, this));
        } else if (u2.c.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f116f) {
                this.h = false;
                this.f117i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.g = null;
        y yVar = (y) this.f117i.f130l.a();
        synchronized (yVar.f144a) {
            z3 = yVar.f145b;
        }
        if (z3) {
            this.h = false;
            this.f117i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f117i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

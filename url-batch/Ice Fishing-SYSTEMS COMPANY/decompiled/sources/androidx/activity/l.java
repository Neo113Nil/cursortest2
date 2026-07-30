package androidx.activity;

import D.RunnableC0281a;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final long f4565n = SystemClock.uptimeMillis() + 10000;

    /* renamed from: u, reason: collision with root package name */
    public Runnable f4566u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4567v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f4568w;

    public l(p pVar) {
        this.f4568w = pVar;
    }

    public final void a(View view) {
        if (this.f4567v) {
            return;
        }
        this.f4567v = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.h.e(runnable, "runnable");
        this.f4566u = runnable;
        View decorView = this.f4568w.getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (!this.f4567v) {
            decorView.postOnAnimation(new RunnableC0281a(10, this));
        } else if (kotlin.jvm.internal.h.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z8;
        Runnable runnable = this.f4566u;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4565n) {
                this.f4567v = false;
                this.f4568w.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4566u = null;
        x fullyDrawnReporter = this.f4568w.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f4581a) {
            z8 = fullyDrawnReporter.f4582b;
        }
        if (z8) {
            this.f4567v = false;
            this.f4568w.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4568w.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0250k implements InterfaceExecutorC0249j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f5225a = SystemClock.uptimeMillis() + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f5226b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0253n f5228d;

    public ViewTreeObserverOnDrawListenerC0250k(AbstractActivityC0253n abstractActivityC0253n) {
        this.f5228d = abstractActivityC0253n;
    }

    public final void a(View view) {
        if (this.f5227c) {
            return;
        }
        this.f5227c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.i.e(runnable, "runnable");
        this.f5226b = runnable;
        View decorView = this.f5228d.getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (!this.f5227c) {
            decorView.postOnAnimation(new R1.n(8, this));
        } else if (kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f5226b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f5225a) {
                this.f5227c = false;
                this.f5228d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f5226b = null;
        p fullyDrawnReporter = this.f5228d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f5236b) {
            z = fullyDrawnReporter.f5237c;
        }
        if (z) {
            this.f5227c = false;
            this.f5228d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5228d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

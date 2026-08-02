package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f2571a = SystemClock.uptimeMillis() + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f2572b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f2574d;

    public j(m mVar) {
        this.f2574d = mVar;
    }

    public final void a(View view) {
        if (this.f2573c) {
            return;
        }
        this.f2573c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.j.e(runnable, "runnable");
        this.f2572b = runnable;
        View decorView = this.f2574d.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (!this.f2573c) {
            decorView.postOnAnimation(new B0.n(5, this));
        } else if (kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f2572b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2571a) {
                this.f2573c = false;
                this.f2574d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2572b = null;
        n nVar = (n) this.f2574d.f2588g.a();
        synchronized (nVar.f2600b) {
            z = nVar.f2601c;
        }
        if (z) {
            this.f2573c = false;
            this.f2574d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2574d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

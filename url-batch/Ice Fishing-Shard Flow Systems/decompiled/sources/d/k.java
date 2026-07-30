package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f4579d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f4580e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4581i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f4582l;

    public k(o oVar) {
        this.f4582l = oVar;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f4581i) {
            return;
        }
        this.f4581i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f4580e = runnable;
        View decorView = this.f4582l.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f4581i) {
            decorView.postOnAnimation(new A.k(14, this));
        } else if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z7;
        Runnable runnable = this.f4580e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4579d) {
                this.f4581i = false;
                this.f4582l.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4580e = null;
        q fullyDrawnReporter = this.f4582l.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f4594b) {
            z7 = fullyDrawnReporter.f4595c;
        }
        if (z7) {
            this.f4581i = false;
            this.f4582l.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4582l.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

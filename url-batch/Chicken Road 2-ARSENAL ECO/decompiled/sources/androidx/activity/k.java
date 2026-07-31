package androidx.activity;

import H1.RunnableC0139m;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.onesignal.core.activities.PermissionsActivity;

/* loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public Runnable f3199g;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity f3201i;

    /* renamed from: f, reason: collision with root package name */
    public final long f3198f = SystemClock.uptimeMillis() + 10000;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3200h = false;

    public k(PermissionsActivity permissionsActivity) {
        this.f3201i = permissionsActivity;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3199g = runnable;
        View decorView = this.f3201i.getWindow().getDecorView();
        if (!this.f3200h) {
            decorView.postOnAnimation(new RunnableC0139m(8, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // androidx.activity.j
    public final void n(View view) {
        if (this.f3200h) {
            return;
        }
        this.f3200h = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f3199g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3198f) {
                this.f3200h = false;
                this.f3201i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3199g = null;
        m mVar = this.f3201i.mFullyDrawnReporter;
        synchronized (mVar.f3202a) {
            z5 = mVar.f3203b;
        }
        if (z5) {
            this.f3200h = false;
            this.f3201i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3201i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

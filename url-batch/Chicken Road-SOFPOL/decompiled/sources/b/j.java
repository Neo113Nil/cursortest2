package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: d, reason: collision with root package name */
    public final long f976d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f977e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f979g;

    public j(l lVar) {
        this.f979g = lVar;
    }

    public final void a(View view) {
        if (this.f978f) {
            return;
        }
        this.f978f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q6.i.e(runnable, "runnable");
        this.f977e = runnable;
        View decorView = this.f979g.getWindow().getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        if (!this.f978f) {
            decorView.postOnAnimation(new a1.a(2, this));
        } else if (q6.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f977e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f976d) {
                this.f978f = false;
                this.f979g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f977e = null;
        n nVar = (n) this.f979g.f990j.getValue();
        synchronized (nVar.f1005a) {
            z3 = nVar.f1006b;
        }
        if (z3) {
            this.f978f = false;
            this.f979g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f979g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

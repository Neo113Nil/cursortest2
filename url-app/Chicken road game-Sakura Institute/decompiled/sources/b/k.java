package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: d, reason: collision with root package name */
    public final long f5542d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f5543e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5544i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f5545j;

    public k(o oVar) {
        this.f5545j = oVar;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f5544i) {
            return;
        }
        this.f5544i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f5543e = runnable;
        View decorView = this.f5545j.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f5544i) {
            decorView.postOnAnimation(new C.t(5, this));
        } else if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f5543e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f5542d) {
                this.f5544i = false;
                this.f5545j.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f5543e = null;
        u uVar = (u) this.f5545j.f5567m.getValue();
        synchronized (uVar.f5583b) {
            z4 = uVar.f5584c;
        }
        if (z4) {
            this.f5544i = false;
            this.f5545j.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5545j.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

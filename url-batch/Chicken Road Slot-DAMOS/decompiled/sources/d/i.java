package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: d, reason: collision with root package name */
    public final long f3233d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f3234e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3235i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f3236r;

    public i(k kVar) {
        this.f3236r = kVar;
    }

    public final void a(View view) {
        view.getClass();
        if (this.f3235i) {
            return;
        }
        this.f3235i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f3234e = runnable;
        View decorView = this.f3236r.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f3235i) {
            decorView.postOnAnimation(new androidx.lifecycle.d0(8, this));
        } else if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f3234e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3233d) {
                this.f3235i = false;
                this.f3236r.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3234e = null;
        w wVar = (w) this.f3236r.f3248u.getValue();
        synchronized (wVar.f3267b) {
            z10 = wVar.f3268c;
        }
        if (z10) {
            this.f3235i = false;
            this.f3236r.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3236r.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

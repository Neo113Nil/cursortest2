package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.b;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ud implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long f = SystemClock.uptimeMillis() + 10000;
    public Runnable g;
    public boolean h;
    public final /* synthetic */ b i;

    public ud(b bVar) {
        this.i = bVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        decorView.getClass();
        if (!this.h) {
            decorView.postOnAnimation(new r1(4, this));
        } else if (mv.c(Looper.myLooper(), Looper.getMainLooper())) {
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
        hr hrVar = (hr) this.i.l.getValue();
        synchronized (hrVar.a) {
            z = hrVar.b;
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

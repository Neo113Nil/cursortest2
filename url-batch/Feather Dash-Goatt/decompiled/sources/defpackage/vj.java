package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.feathherdashh.dashgame.MainActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vj implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable e;
    public final /* synthetic */ MainActivity h;
    public final long d = SystemClock.uptimeMillis() + 10000;
    public boolean g = false;

    public vj(MainActivity mainActivity) {
        this.h = mainActivity;
    }

    public final void a(View view) {
        if (this.g) {
            return;
        }
        this.g = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e = runnable;
        View decorView = this.h.getWindow().getDecorView();
        if (!this.g) {
            decorView.postOnAnimation(new e4(3, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.d) {
                this.g = false;
                this.h.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.e = null;
        e30 e30Var = this.h.n;
        synchronized (e30Var.b) {
            z = e30Var.a;
        }
        if (z) {
            this.g = false;
            this.h.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

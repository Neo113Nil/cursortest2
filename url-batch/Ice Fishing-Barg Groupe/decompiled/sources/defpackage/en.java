package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ice.fishing.grenza.MainActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class en implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable OPXfSBeufaJ8;
    public final /* synthetic */ MainActivity dgRBjINgWbAK;
    public final long rtx2ld2ELZv4 = SystemClock.uptimeMillis() + 10000;
    public boolean wdg6QnbFHrFF;

    public en(MainActivity mainActivity) {
        this.dgRBjINgWbAK = mainActivity;
    }

    public final void PxuCJdSBwIXG(View view) {
        if (this.wdg6QnbFHrFF) {
            return;
        }
        this.wdg6QnbFHrFF = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.OPXfSBeufaJ8 = runnable;
        View decorView = this.dgRBjINgWbAK.getWindow().getDecorView();
        decorView.getClass();
        if (!this.wdg6QnbFHrFF) {
            decorView.postOnAnimation(new BRwzKIf41E4i(4, this));
        } else if (cs0.wdg6QnbFHrFF(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.OPXfSBeufaJ8;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.rtx2ld2ELZv4) {
                this.wdg6QnbFHrFF = false;
                this.dgRBjINgWbAK.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.OPXfSBeufaJ8 = null;
        zd0 zd0Var = (zd0) this.dgRBjINgWbAK.r3s1LDPKFs1S.getValue();
        synchronized (zd0Var.PxuCJdSBwIXG) {
            z = zd0Var.lS5Rgt96tfkO;
        }
        if (z) {
            this.wdg6QnbFHrFF = false;
            this.dgRBjINgWbAK.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.dgRBjINgWbAK.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

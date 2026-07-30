package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tx implements sx, ViewTreeObserver.OnDrawListener, Runnable {
    public final long m = SystemClock.uptimeMillis() + 10000;
    public Runnable n;
    public boolean o;
    public final /* synthetic */ kr0 p;

    public tx(kr0 kr0Var) {
        this.p = kr0Var;
    }

    public final void a(View view) {
        view.getClass();
        if (this.o) {
            return;
        }
        this.o = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
        View decorView = this.p.getWindow().getDecorView();
        decorView.getClass();
        if (!this.o) {
            decorView.postOnAnimation(new k3(9, this));
        } else if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.n;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.m) {
                this.o = false;
                this.p.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.n = null;
        it0 fullyDrawnReporter = this.p.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.b) {
            z = fullyDrawnReporter.c;
        }
        if (z) {
            this.o = false;
            this.p.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

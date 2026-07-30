package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h6 implements uy0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long l;
    public final View d;
    public boolean g;
    public boolean j;
    public long k;
    public final PriorityQueue e = new PriorityQueue(11, new f6(0));
    public final Choreographer h = Choreographer.getInstance();
    public final g6 i = new g6();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h6(View view) {
        float f;
        this.d = view;
        if (l == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            l = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.j = true;
        }
    }

    @Override // defpackage.uy0
    public final void a(ty0 ty0Var) {
        this.e.add(new fz0(1, ty0Var));
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.post(this);
    }

    public final boolean b() {
        g6 g6Var = this.i;
        long a = g6Var.a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", a);
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.e;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((fz0) peek).b.b(g6Var)) {
                priorityQueue.poll();
                z = false;
            }
            g6Var.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.j) {
            this.k = j;
            this.d.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.j = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.d.removeCallbacks(this);
        this.h.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.e;
        if (!priorityQueue.isEmpty() && this.g && this.j) {
            View view = this.d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * l) + nanos;
                g6 g6Var = this.i;
                g6Var.a = z;
                g6Var.b = Math.max(this.k, nanos) + l;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (g6Var.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = b();
                    }
                }
                if (z2) {
                    this.h.postFrameCallback(this);
                } else {
                    this.g = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.g = false;
    }
}

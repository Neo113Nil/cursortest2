package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n5 implements pp1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static final l5 Companion = new l5();
    public static long QrzZRwfaDlRX;
    public boolean cpQdD2nAriOS;
    public long r3s1LDPKFs1S;
    public final View rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;
    public final PriorityQueue OPXfSBeufaJ8 = new PriorityQueue(11, new k5(0));
    public final Choreographer dgRBjINgWbAK = Choreographer.getInstance();
    public final m5 x50lh2ztY7Y5 = new m5();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n5(View view) {
        float f;
        this.rtx2ld2ELZv4 = view;
        Companion.getClass();
        if (QrzZRwfaDlRX == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            QrzZRwfaDlRX = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.cpQdD2nAriOS = true;
        }
    }

    @Override // defpackage.pp1
    public final void PxuCJdSBwIXG(op1 op1Var) {
        gq1.Companion.getClass();
        this.OPXfSBeufaJ8.add(new gq1(1, op1Var));
        if (this.wdg6QnbFHrFF) {
            return;
        }
        this.wdg6QnbFHrFF = true;
        this.rtx2ld2ELZv4.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.cpQdD2nAriOS) {
            this.r3s1LDPKFs1S = j;
            this.rtx2ld2ELZv4.post(this);
        }
    }

    public final boolean lS5Rgt96tfkO() {
        m5 m5Var = this.x50lh2ztY7Y5;
        long PxuCJdSBwIXG = m5Var.PxuCJdSBwIXG();
        cs0.nLZGh9p8gVSu("compose:lazy:prefetch:available_time_nanos", PxuCJdSBwIXG);
        boolean z = true;
        if (PxuCJdSBwIXG > 0) {
            PriorityQueue priorityQueue = this.OPXfSBeufaJ8;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((gq1) peek).lS5Rgt96tfkO.lS5Rgt96tfkO(m5Var)) {
                priorityQueue.poll();
                z = false;
            }
            m5Var.PxuCJdSBwIXG = false;
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.cpQdD2nAriOS = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.cpQdD2nAriOS = false;
        this.rtx2ld2ELZv4.removeCallbacks(this);
        this.dgRBjINgWbAK.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.OPXfSBeufaJ8;
        if (!priorityQueue.isEmpty() && this.wdg6QnbFHrFF && this.cpQdD2nAriOS) {
            View view = this.rtx2ld2ELZv4;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * QrzZRwfaDlRX) + nanos;
                m5 m5Var = this.x50lh2ztY7Y5;
                m5Var.PxuCJdSBwIXG = z;
                m5Var.lS5Rgt96tfkO = Math.max(this.r3s1LDPKFs1S, nanos) + QrzZRwfaDlRX;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (m5Var.PxuCJdSBwIXG) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = lS5Rgt96tfkO();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = lS5Rgt96tfkO();
                    }
                }
                if (z2) {
                    this.dgRBjINgWbAK.postFrameCallback(this);
                } else {
                    this.wdg6QnbFHrFF = false;
                }
                cs0.nLZGh9p8gVSu("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.wdg6QnbFHrFF = false;
    }
}

package a0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements h1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* renamed from: k, reason: collision with root package name */
    public static long f25k;

    /* renamed from: d, reason: collision with root package name */
    public final View f26d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28f;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f31j;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityQueue f27e = new PriorityQueue(11, new a(0));

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f29g = Choreographer.getInstance();

    /* renamed from: h, reason: collision with root package name */
    public final b f30h = new b();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(View view) {
        float f6;
        this.f26d = view;
        if (f25k == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f6 = display.getRefreshRate();
            }
            f6 = 60.0f;
            f25k = (long) (1000000000 / f6);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.i = true;
        }
    }

    @Override // a0.h1
    public void a(e1 e1Var) {
        this.f27e.add(new k1(1, e1Var));
        if (this.f28f) {
            return;
        }
        this.f28f = true;
        this.f26d.post(this);
    }

    public final boolean b() {
        b bVar = this.f30h;
        long a8 = bVar.a();
        r2.o.s0("compose:lazy:prefetch:available_time_nanos", a8);
        boolean z3 = true;
        if (a8 > 0) {
            PriorityQueue priorityQueue = this.f27e;
            Object peek = priorityQueue.peek();
            q6.i.b(peek);
            if (!((k1) peek).f111b.c(bVar)) {
                priorityQueue.poll();
                z3 = false;
            }
            bVar.f15a = false;
        }
        return z3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        if (this.i) {
            this.f31j = j7;
            this.f26d.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.i = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i = false;
        this.f26d.removeCallbacks(this);
        this.f29g.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f27e;
        if (!priorityQueue.isEmpty() && this.f28f && this.i) {
            View view = this.f26d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z3 = System.nanoTime() > (((long) 2) * f25k) + nanos;
                b bVar = this.f30h;
                bVar.f15a = z3;
                bVar.f16b = Math.max(this.f31j, nanos) + f25k;
                boolean z7 = false;
                while (!priorityQueue.isEmpty() && !z7) {
                    if (bVar.f15a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z7 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z7 = b();
                    }
                }
                if (z7) {
                    this.f29g.postFrameCallback(this);
                } else {
                    this.f28f = false;
                }
                r2.o.s0("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f28f = false;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class bx2 implements xw2 {

    /* renamed from: a, reason: collision with root package name */
    private final xw2 f3559a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<ww2> f3560b = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    private final int f3561c = ((Integer) sw.c().b(m10.t6)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3562d = new AtomicBoolean(false);

    public bx2(xw2 xw2Var, ScheduledExecutorService scheduledExecutorService) {
        this.f3559a = xw2Var;
        long intValue = ((Integer) sw.c().b(m10.f8303s6)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.ax2
            @Override // java.lang.Runnable
            public final void run() {
                bx2.c(bx2.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void c(bx2 bx2Var) {
        while (!bx2Var.f3560b.isEmpty()) {
            bx2Var.f3559a.a(bx2Var.f3560b.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.xw2
    public final void a(ww2 ww2Var) {
        if (this.f3560b.size() < this.f3561c) {
            this.f3560b.offer(ww2Var);
            return;
        }
        if (this.f3562d.getAndSet(true)) {
            return;
        }
        Queue<ww2> queue = this.f3560b;
        ww2 b7 = ww2.b("dropped_event");
        Map<String, String> j7 = ww2Var.j();
        if (j7.containsKey("action")) {
            b7.a("dropped_action", j7.get("action"));
        }
        queue.offer(b7);
    }

    @Override // com.google.android.gms.internal.ads.xw2
    public final String b(ww2 ww2Var) {
        return this.f3559a.b(ww2Var);
    }
}

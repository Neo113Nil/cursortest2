package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h03 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f5984a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f5985b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<g03> f5986c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private g03 f5987d = null;

    public h03() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f5984a = linkedBlockingQueue;
        this.f5985b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        g03 poll = this.f5986c.poll();
        this.f5987d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f5985b, new Object[0]);
        }
    }

    public final void a(g03 g03Var) {
        this.f5987d = null;
        c();
    }

    public final void b(g03 g03Var) {
        g03Var.b(this);
        this.f5986c.add(g03Var);
        if (this.f5987d == null) {
            c();
        }
    }
}

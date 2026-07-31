package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bo2;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class fo2 implements bo2.a {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<bo2> f25888b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private bo2 f25889c = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f25887a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private void b() {
        bo2 poll = this.f25888b.poll();
        this.f25889c = poll;
        if (poll != null) {
            poll.a(this.f25887a);
        }
    }

    public final void a() {
        this.f25889c = null;
        b();
    }

    public final void a(bo2 bo2Var) {
        bo2Var.a(this);
        this.f25888b.add(bo2Var);
        if (this.f25889c == null) {
            b();
        }
    }
}

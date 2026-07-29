package com.tapjoy.internal;

import com.tapjoy.internal.dz;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ea implements dz.a {

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f7983c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private dz f7984d = null;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f7981a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f7982b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f7981a);

    @Override // com.tapjoy.internal.dz.a
    public final void a() {
        this.f7984d = null;
        b();
    }

    public final void a(dz dzVar) {
        dzVar.f7976d = this;
        this.f7983c.add(dzVar);
        if (this.f7984d == null) {
            b();
        }
    }

    private void b() {
        this.f7984d = (dz) this.f7983c.poll();
        if (this.f7984d != null) {
            this.f7984d.executeOnExecutor(this.f7982b, new Object[0]);
        }
    }
}

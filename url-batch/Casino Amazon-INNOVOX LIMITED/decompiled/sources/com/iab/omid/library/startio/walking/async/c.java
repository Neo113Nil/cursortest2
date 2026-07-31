package com.iab.omid.library.startio.walking.async;

import com.iab.omid.library.startio.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f62a;
    private final ThreadPoolExecutor b;
    private final ArrayDeque c = new ArrayDeque();
    private b d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f62a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVar = (b) this.c.poll();
        this.d = bVar;
        if (bVar != null) {
            bVar.a(this.b);
        }
    }

    @Override // com.iab.omid.library.startio.walking.async.b.a
    public void a(b bVar) {
        this.d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.c.add(bVar);
        if (this.d == null) {
            a();
        }
    }
}

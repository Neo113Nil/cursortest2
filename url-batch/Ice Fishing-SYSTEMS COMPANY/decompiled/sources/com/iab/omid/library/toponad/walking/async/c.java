package com.iab.omid.library.toponad.walking.async;

import com.iab.omid.library.toponad.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f36488a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f36489b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f36490c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f36491d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f36488a = linkedBlockingQueue;
        this.f36489b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f36490c.poll();
        this.f36491d = poll;
        if (poll != null) {
            poll.a(this.f36489b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f36490c.add(bVar);
        if (this.f36491d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.a
    public void a(b bVar) {
        this.f36491d = null;
        a();
    }
}

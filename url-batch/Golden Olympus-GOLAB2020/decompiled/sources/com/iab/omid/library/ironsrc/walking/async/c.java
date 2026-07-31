package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f14625a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f14626b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f14627c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f14628d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f14625a = linkedBlockingQueue;
        this.f14626b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f14627c.poll();
        this.f14628d = poll;
        if (poll != null) {
            poll.a(this.f14626b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f14627c.add(bVar);
        if (this.f14628d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.a
    public void a(b bVar) {
        this.f14628d = null;
        a();
    }
}

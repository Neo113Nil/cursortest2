package b;

import b.z;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Dispatcher.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f2114c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f2115d;

    /* renamed from: a, reason: collision with root package name */
    private int f2112a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f2113b = 5;
    private final Deque<z.a> e = new ArrayDeque();
    private final Deque<z.a> f = new ArrayDeque();
    private final Deque<z> g = new ArrayDeque();

    public synchronized ExecutorService a() {
        if (this.f2115d == null) {
            this.f2115d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), b.a.c.a("OkHttp Dispatcher", false));
        }
        return this.f2115d;
    }

    synchronized void a(z.a aVar) {
        if (this.f.size() < this.f2112a && c(aVar) < this.f2113b) {
            this.f.add(aVar);
            a().execute(aVar);
        } else {
            this.e.add(aVar);
        }
    }

    private void c() {
        if (this.f.size() < this.f2112a && !this.e.isEmpty()) {
            Iterator<z.a> it = this.e.iterator();
            while (it.hasNext()) {
                z.a next = it.next();
                if (c(next) < this.f2113b) {
                    it.remove();
                    this.f.add(next);
                    a().execute(next);
                }
                if (this.f.size() >= this.f2112a) {
                    return;
                }
            }
        }
    }

    private int c(z.a aVar) {
        Iterator<z.a> it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().a().equals(aVar.a())) {
                i++;
            }
        }
        return i;
    }

    synchronized void a(z zVar) {
        this.g.add(zVar);
    }

    void b(z.a aVar) {
        a(this.f, aVar, true);
    }

    void b(z zVar) {
        a(this.g, zVar, false);
    }

    private <T> void a(Deque<T> deque, T t, boolean z) {
        int b2;
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                c();
            }
            b2 = b();
            runnable = this.f2114c;
        }
        if (b2 != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public synchronized int b() {
        return this.f.size() + this.g.size();
    }
}

package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.ac;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f15858a = true;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f15861d;

    /* renamed from: e, reason: collision with root package name */
    private ExecutorService f15862e;

    /* renamed from: b, reason: collision with root package name */
    private int f15859b = 64;

    /* renamed from: c, reason: collision with root package name */
    private int f15860c = 5;

    /* renamed from: f, reason: collision with root package name */
    private final Deque<ac.a> f15863f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final Deque<ac.a> f15864g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private final Deque<ac> f15865h = new ArrayDeque();

    public p(ExecutorService executorService) {
        this.f15862e = executorService;
    }

    private synchronized ExecutorService a() {
        try {
            if (this.f15862e == null) {
                this.f15862e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.anythink.core.common.n.b.a.c.a(aa.f15620a + "-HttpDispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15862e;
    }

    private synchronized int b() {
        return this.f15859b;
    }

    private synchronized int c() {
        return this.f15860c;
    }

    private synchronized void d() {
        try {
            Iterator<ac.a> it = this.f15863f.iterator();
            while (it.hasNext()) {
                ac.this.c();
            }
            Iterator<ac.a> it2 = this.f15864g.iterator();
            while (it2.hasNext()) {
                ac.this.c();
            }
            Iterator<ac> it3 = this.f15865h.iterator();
            while (it3.hasNext()) {
                it3.next().c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean e() {
        int i;
        boolean z8;
        if (!f15858a && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<ac.a> it = this.f15863f.iterator();
                while (it.hasNext()) {
                    ac.a next = it.next();
                    if (this.f15864g.size() >= this.f15859b) {
                        break;
                    }
                    if (next.a().get() < this.f15860c) {
                        it.remove();
                        next.a().incrementAndGet();
                        arrayList.add(next);
                        this.f15864g.add(next);
                    }
                }
                z8 = i() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((ac.a) arrayList.get(i)).a(a());
        }
        return z8;
    }

    private synchronized List<e> f() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<ac.a> it = this.f15863f.iterator();
            while (it.hasNext()) {
                arrayList.add(ac.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized List<e> g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.f15865h);
            Iterator<ac.a> it = this.f15864g.iterator();
            while (it.hasNext()) {
                arrayList.add(ac.this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized int h() {
        return this.f15863f.size();
    }

    private synchronized int i() {
        return this.f15864g.size() + this.f15865h.size();
    }

    private void b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("max < 1: ".concat(String.valueOf(i)));
        }
        synchronized (this) {
            this.f15860c = i;
        }
        e();
    }

    private void a(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f15859b = i;
            }
            e();
            return;
        }
        throw new IllegalArgumentException("max < 1: ".concat(String.valueOf(i)));
    }

    public p() {
    }

    public final void b(ac.a aVar) {
        aVar.a().decrementAndGet();
        a(this.f15864g, aVar);
    }

    public final void b(ac acVar) {
        a(this.f15865h, acVar);
    }

    private synchronized void a(Runnable runnable) {
        this.f15861d = runnable;
    }

    public final void a(ac.a aVar) {
        ac.a aVar2;
        synchronized (this) {
            try {
                this.f15863f.add(aVar);
                if (!ac.this.f15631c) {
                    String b9 = aVar.b();
                    Iterator<ac.a> it = this.f15864g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar2 = it.next();
                            if (aVar2.b().equals(b9)) {
                                break;
                            }
                        } else {
                            Iterator<ac.a> it2 = this.f15863f.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar2 = null;
                                    break;
                                } else {
                                    aVar2 = it2.next();
                                    if (aVar2.b().equals(b9)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (aVar2 != null) {
                        aVar.a(aVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e();
    }

    private ac.a a(String str) {
        for (ac.a aVar : this.f15864g) {
            if (aVar.b().equals(str)) {
                return aVar;
            }
        }
        for (ac.a aVar2 : this.f15863f) {
            if (aVar2.b().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final synchronized void a(ac acVar) {
        this.f15865h.add(acVar);
    }

    private <T> void a(Deque<T> deque, T t9) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t9)) {
                runnable = this.f15861d;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (e() || runnable == null) {
            return;
        }
        runnable.run();
    }
}

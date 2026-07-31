package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class o6 implements z5 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<a6<?>>> f9531a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final m5 f9532b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<a6<?>> f9533c;

    /* renamed from: d, reason: collision with root package name */
    private final r5 f9534d;

    /* JADX WARN: Multi-variable type inference failed */
    o6(m5 m5Var, m5 m5Var2, BlockingQueue<a6<?>> blockingQueue, r5 r5Var) {
        this.f9534d = blockingQueue;
        this.f9532b = m5Var;
        this.f9533c = m5Var2;
    }

    @Override // com.google.android.gms.internal.ads.z5
    public final synchronized void a(a6<?> a6Var) {
        String k7 = a6Var.k();
        List<a6<?>> remove = this.f9531a.remove(k7);
        if (remove == null || remove.isEmpty()) {
            return;
        }
        if (n6.f8944b) {
            n6.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), k7);
        }
        a6<?> remove2 = remove.remove(0);
        this.f9531a.put(k7, remove);
        remove2.v(this);
        try {
            this.f9533c.put(remove2);
        } catch (InterruptedException e7) {
            n6.b("Couldn't add request to queue. %s", e7.toString());
            Thread.currentThread().interrupt();
            this.f9532b.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.z5
    public final void b(a6<?> a6Var, g6<?> g6Var) {
        List<a6<?>> remove;
        j5 j5Var = g6Var.f5462b;
        if (j5Var == null || j5Var.a(System.currentTimeMillis())) {
            a(a6Var);
            return;
        }
        String k7 = a6Var.k();
        synchronized (this) {
            remove = this.f9531a.remove(k7);
        }
        if (remove != null) {
            if (n6.f8944b) {
                n6.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), k7);
            }
            Iterator<a6<?>> it = remove.iterator();
            while (it.hasNext()) {
                this.f9534d.b(it.next(), g6Var, null);
            }
        }
    }

    final synchronized boolean c(a6<?> a6Var) {
        String k7 = a6Var.k();
        if (!this.f9531a.containsKey(k7)) {
            this.f9531a.put(k7, null);
            a6Var.v(this);
            if (n6.f8944b) {
                n6.a("new request, sending to network %s", k7);
            }
            return false;
        }
        List<a6<?>> list = this.f9531a.get(k7);
        if (list == null) {
            list = new ArrayList<>();
        }
        a6Var.n("waiting-for-response");
        list.add(a6Var);
        this.f9531a.put(k7, list);
        if (n6.f8944b) {
            n6.a("Request for cacheKey=%s is in flight, putting on hold.", k7);
        }
        return true;
    }
}

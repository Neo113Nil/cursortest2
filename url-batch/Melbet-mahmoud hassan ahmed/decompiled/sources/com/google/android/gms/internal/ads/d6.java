package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f4080a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<a6<?>> f4081b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<a6<?>> f4082c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<a6<?>> f4083d;

    /* renamed from: e, reason: collision with root package name */
    private final k5 f4084e;

    /* renamed from: f, reason: collision with root package name */
    private final t5 f4085f;

    /* renamed from: g, reason: collision with root package name */
    private final u5[] f4086g;

    /* renamed from: h, reason: collision with root package name */
    private m5 f4087h;

    /* renamed from: i, reason: collision with root package name */
    private final List<c6> f4088i;

    /* renamed from: j, reason: collision with root package name */
    private final List<b6> f4089j;

    /* renamed from: k, reason: collision with root package name */
    private final r5 f4090k;

    public d6(k5 k5Var, t5 t5Var, int i7) {
        r5 r5Var = new r5(new Handler(Looper.getMainLooper()));
        this.f4080a = new AtomicInteger();
        this.f4081b = new HashSet();
        this.f4082c = new PriorityBlockingQueue<>();
        this.f4083d = new PriorityBlockingQueue<>();
        this.f4088i = new ArrayList();
        this.f4089j = new ArrayList();
        this.f4084e = k5Var;
        this.f4085f = t5Var;
        this.f4086g = new u5[4];
        this.f4090k = r5Var;
    }

    public final <T> a6<T> a(a6<T> a6Var) {
        a6Var.g(this);
        synchronized (this.f4081b) {
            this.f4081b.add(a6Var);
        }
        a6Var.h(this.f4080a.incrementAndGet());
        a6Var.n("add-to-queue");
        c(a6Var, 0);
        this.f4082c.add(a6Var);
        return a6Var;
    }

    final <T> void b(a6<T> a6Var) {
        synchronized (this.f4081b) {
            this.f4081b.remove(a6Var);
        }
        synchronized (this.f4088i) {
            Iterator<c6> it = this.f4088i.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
        c(a6Var, 5);
    }

    final void c(a6<?> a6Var, int i7) {
        synchronized (this.f4089j) {
            Iterator<b6> it = this.f4089j.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    public final void d() {
        m5 m5Var = this.f4087h;
        if (m5Var != null) {
            m5Var.b();
        }
        u5[] u5VarArr = this.f4086g;
        for (int i7 = 0; i7 < 4; i7++) {
            u5 u5Var = u5VarArr[i7];
            if (u5Var != null) {
                u5Var.a();
            }
        }
        m5 m5Var2 = new m5(this.f4082c, this.f4083d, this.f4084e, this.f4090k, null);
        this.f4087h = m5Var2;
        m5Var2.start();
        for (int i8 = 0; i8 < 4; i8++) {
            u5 u5Var2 = new u5(this.f4083d, this.f4085f, this.f4084e, this.f4090k, null);
            this.f4086g[i8] = u5Var2;
            u5Var2.start();
        }
    }
}

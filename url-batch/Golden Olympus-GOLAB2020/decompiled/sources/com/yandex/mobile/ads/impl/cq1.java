package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class cq1 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f24282a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f24283b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<op1<?>> f24284c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<op1<?>> f24285d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1861cm f24286e;

    /* renamed from: f, reason: collision with root package name */
    private final gc1 f24287f;

    /* renamed from: g, reason: collision with root package name */
    private final yq1 f24288g;

    /* renamed from: h, reason: collision with root package name */
    private final hc1[] f24289h;

    /* renamed from: i, reason: collision with root package name */
    private C1981hm f24290i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f24291j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f24292k;

    public interface a {
        void a(op1<?> op1Var, int i4);
    }

    public interface b {
        boolean a(op1<?> op1Var);
    }

    @Deprecated
    public interface c<T> {
        void a();
    }

    public cq1(InterfaceC1861cm interfaceC1861cm, C1931fk c1931fk, int i4) {
        this(interfaceC1861cm, c1931fk, i4, new x50(new Handler(Looper.getMainLooper())));
    }

    public final void a(op1 op1Var) {
        op1Var.a(this);
        synchronized (this.f24283b) {
            this.f24283b.add(op1Var);
        }
        op1Var.b(this.f24282a.incrementAndGet());
        op1Var.a("add-to-queue");
        a(op1Var, 0);
        if (op1Var.t()) {
            this.f24284c.add(op1Var);
        } else {
            this.f24285d.add(op1Var);
        }
    }

    final <T> void b(op1<T> op1Var) {
        synchronized (this.f24283b) {
            this.f24283b.remove(op1Var);
        }
        synchronized (this.f24291j) {
            try {
                ArrayList arrayList = this.f24291j;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((c) obj).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(op1Var, 5);
    }

    public cq1(InterfaceC1861cm interfaceC1861cm, C1931fk c1931fk, int i4, x50 x50Var) {
        this.f24282a = new AtomicInteger();
        this.f24283b = new HashSet();
        this.f24284c = new PriorityBlockingQueue<>();
        this.f24285d = new PriorityBlockingQueue<>();
        this.f24291j = new ArrayList();
        this.f24292k = new ArrayList();
        this.f24286e = interfaceC1861cm;
        this.f24287f = c1931fk;
        this.f24289h = new hc1[i4];
        this.f24288g = x50Var;
    }

    public final void a(up1 up1Var) {
        synchronized (this.f24292k) {
            this.f24292k.add(up1Var);
        }
    }

    public final void a(b bVar) {
        synchronized (this.f24283b) {
            try {
                Iterator it = this.f24283b.iterator();
                while (it.hasNext()) {
                    op1<?> op1Var = (op1) it.next();
                    if (bVar.a(op1Var)) {
                        op1Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void a(op1<?> op1Var, int i4) {
        synchronized (this.f24292k) {
            try {
                ArrayList arrayList = this.f24292k;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((a) obj).a(op1Var, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        C1981hm c1981hm = this.f24290i;
        if (c1981hm != null) {
            c1981hm.b();
        }
        for (hc1 hc1Var : this.f24289h) {
            if (hc1Var != null) {
                hc1Var.b();
            }
        }
        C1981hm c1981hm2 = new C1981hm(this.f24284c, this.f24285d, this.f24286e, this.f24288g);
        this.f24290i = c1981hm2;
        c1981hm2.start();
        for (int i4 = 0; i4 < this.f24289h.length; i4++) {
            hc1 hc1Var2 = new hc1(this.f24285d, this.f24287f, this.f24286e, this.f24288g);
            this.f24289h[i4] = hc1Var2;
            hc1Var2.start();
        }
    }
}

package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.InterfaceC1861cm;
import com.yandex.mobile.ads.impl.op1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
final class wi2 implements op1.b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f34081a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final yq1 f34082b;

    /* renamed from: c, reason: collision with root package name */
    private final C1981hm f34083c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f34084d;

    wi2(@NonNull C1981hm c1981hm, @NonNull PriorityBlockingQueue priorityBlockingQueue, yq1 yq1Var) {
        this.f34082b = yq1Var;
        this.f34083c = c1981hm;
        this.f34084d = priorityBlockingQueue;
    }

    final synchronized boolean a(op1<?> op1Var) {
        try {
            String d4 = op1Var.d();
            if (!this.f34081a.containsKey(d4)) {
                this.f34081a.put(d4, null);
                op1Var.a((op1.b) this);
                if (ii2.f27214a) {
                    ap0.a(d4);
                }
                return false;
            }
            List list = (List) this.f34081a.get(d4);
            if (list == null) {
                list = new ArrayList();
            }
            op1Var.a("waiting-for-response");
            list.add(op1Var);
            this.f34081a.put(d4, list);
            if (ii2.f27214a) {
                ap0.a(d4);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(op1<?> op1Var) {
        BlockingQueue<op1<?>> blockingQueue;
        try {
            String d4 = op1Var.d();
            List list = (List) this.f34081a.remove(d4);
            if (list != null && !list.isEmpty()) {
                if (ii2.f27214a) {
                    ap0.e(Integer.valueOf(list.size()), d4);
                }
                op1<?> op1Var2 = (op1) list.remove(0);
                this.f34081a.put(d4, list);
                op1Var2.a((op1.b) this);
                if (this.f34083c != null && (blockingQueue = this.f34084d) != null) {
                    try {
                        blockingQueue.put(op1Var2);
                    } catch (InterruptedException e4) {
                        ap0.b(e4.toString());
                        Thread.currentThread().interrupt();
                        this.f34083c.b();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(op1<?> op1Var, qq1<?> qq1Var) {
        List list;
        InterfaceC1861cm.a aVar = qq1Var.f30870b;
        if (aVar != null) {
            if (aVar.f24250e >= System.currentTimeMillis()) {
                String d4 = op1Var.d();
                synchronized (this) {
                    list = (List) this.f34081a.remove(d4);
                }
                if (list != null) {
                    if (ii2.f27214a) {
                        ap0.e(Integer.valueOf(list.size()), d4);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((x50) this.f34082b).a((op1) it.next(), qq1Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(op1Var);
    }
}

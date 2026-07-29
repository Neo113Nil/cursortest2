package com.moat.analytics.mobile.tjy;

import android.support.v7.widget.helper.ItemTouchHelper;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class as implements ap {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f7234a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final Queue f7235b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private static volatile ar f7236c = ar.OFF;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f7237d = false;
    private static volatile int e = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    as(aa aaVar) {
        if (f7234a.get() == null) {
            at atVar = null;
            if (f7234a.compareAndSet(null, Executors.newSingleThreadExecutor(new at(this)))) {
                ((ExecutorService) f7234a.get()).submit(new av("TJY", aaVar, new au(this), atVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        synchronized (f7235b) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = f7235b.iterator();
            while (it.hasNext()) {
                aq aqVar = (aq) it.next();
                if (!aqVar.c() && currentTimeMillis - aqVar.d() < 300000) {
                }
                it.remove();
            }
            if (f7235b.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    f7235b.remove();
                }
            }
        }
    }

    @Override // com.moat.analytics.mobile.tjy.ap
    public ar a() {
        return f7236c;
    }

    @Override // com.moat.analytics.mobile.tjy.ap
    public void a(aq aqVar) {
        g();
        f7235b.add(aqVar);
    }

    @Override // com.moat.analytics.mobile.tjy.ap
    public boolean b() {
        return f7237d;
    }

    @Override // com.moat.analytics.mobile.tjy.ap
    public int c() {
        return e;
    }
}

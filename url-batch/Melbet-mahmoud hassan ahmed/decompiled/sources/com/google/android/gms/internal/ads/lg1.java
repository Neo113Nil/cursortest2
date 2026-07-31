package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class lg1<ListenerT> {

    /* renamed from: f, reason: collision with root package name */
    protected final Map<ListenerT, Executor> f7966f = new HashMap();

    protected lg1(Set<hi1<ListenerT>> set) {
        M0(set);
    }

    public final synchronized void D0(ListenerT listenert, Executor executor) {
        this.f7966f.put(listenert, executor);
    }

    public final synchronized void M0(Set<hi1<ListenerT>> set) {
        Iterator<hi1<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            z0(it.next());
        }
    }

    protected final synchronized void R0(final kg1<ListenerT> kg1Var) {
        for (Map.Entry<ListenerT, Executor> entry : this.f7966f.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ig1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kg1.this.c(key);
                    } catch (Throwable th) {
                        y2.t.p().r(th, "EventEmitter.notify");
                        a3.r1.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void z0(hi1<ListenerT> hi1Var) {
        D0(hi1Var.f6312a, hi1Var.f6313b);
    }
}

package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735k6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f12197a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Throwable th, V v) {
        Iterator it = this.f12197a.iterator();
        while (it.hasNext()) {
            ((Fa) it.next()).a(th, v);
        }
    }

    public final void a(Fa... faArr) {
        d3.o.a0(this.f12197a, faArr);
    }

    public final void a(List<? extends Fa> list) {
        this.f12197a.addAll(list);
    }

    public final void a() {
        this.f12197a.clear();
    }
}

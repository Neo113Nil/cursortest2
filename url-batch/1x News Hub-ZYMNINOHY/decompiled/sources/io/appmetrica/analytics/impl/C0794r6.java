package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794r6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f8209a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, V v) {
        Iterator it = this.f8209a.iterator();
        while (it.hasNext()) {
            ((Ma) it.next()).a(th, v);
        }
    }

    public final void a(Ma... maArr) {
        c2.k.P(this.f8209a, maArr);
    }

    public final void a(List<? extends Ma> list) {
        this.f8209a.addAll(list);
    }

    public final void a() {
        this.f8209a.clear();
    }
}

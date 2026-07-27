package io.appmetrica.analytics.impl;

import g4.AbstractC0465j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945r6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f9143a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, V v4) {
        Iterator it = this.f9143a.iterator();
        while (it.hasNext()) {
            ((Ma) it.next()).a(th, v4);
        }
    }

    public final void a(Ma... maArr) {
        AbstractC0465j.E0(this.f9143a, maArr);
    }

    public final void a(List<? extends Ma> list) {
        this.f9143a.addAll(list);
    }

    public final void a() {
        this.f9143a.clear();
    }
}

package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f6886a = new CopyOnWriteArrayList();

    public final void a(InterfaceC0663m4 interfaceC0663m4) {
        this.f6886a.add(interfaceC0663m4);
    }

    public final void b(InterfaceC0663m4 interfaceC0663m4) {
        this.f6886a.remove(interfaceC0663m4);
    }

    public final List<InterfaceC0663m4> a() {
        return this.f6886a;
    }
}

package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class S4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f1038a = new CopyOnWriteArrayList();

    public final void a(InterfaceC0191g4 interfaceC0191g4) {
        this.f1038a.add(interfaceC0191g4);
    }

    public final void b(InterfaceC0191g4 interfaceC0191g4) {
        this.f1038a.remove(interfaceC0191g4);
    }

    public final List<InterfaceC0191g4> a() {
        return this.f1038a;
    }
}

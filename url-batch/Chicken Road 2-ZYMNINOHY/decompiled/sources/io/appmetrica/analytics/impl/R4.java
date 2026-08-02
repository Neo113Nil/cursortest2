package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class R4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f10870a = new CopyOnWriteArrayList();

    public final void a(InterfaceC0604f4 interfaceC0604f4) {
        this.f10870a.add(interfaceC0604f4);
    }

    public final void b(InterfaceC0604f4 interfaceC0604f4) {
        this.f10870a.remove(interfaceC0604f4);
    }

    public final List<InterfaceC0604f4> a() {
        return this.f10870a;
    }
}

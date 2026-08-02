package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f13440a;

    public V(InterfaceC1151i interfaceC1151i) {
        this.f13440a = interfaceC1151i.a();
    }

    public final void a(C1154l c1154l) {
        for (T t4 : this.f13440a) {
            C1155m c1155m = null;
            if (c1154l != null) {
                C1154l c1154l2 = c1154l.f13486a ? c1154l : null;
                if (c1154l2 != null) {
                    c1155m = c1154l2.f13487b;
                }
            }
            t4.a(c1155m);
        }
    }
}

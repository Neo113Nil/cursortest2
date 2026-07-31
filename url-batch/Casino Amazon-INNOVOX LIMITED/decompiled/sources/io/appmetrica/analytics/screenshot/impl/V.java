package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f1716a;

    public V(InterfaceC0697i interfaceC0697i) {
        this.f1716a = interfaceC0697i.a();
    }

    public final void a(C0700l c0700l) {
        for (T t : this.f1716a) {
            C0701m c0701m = null;
            if (c0700l != null) {
                C0700l c0700l2 = Boolean.valueOf(c0700l.f1737a).booleanValue() ? c0700l : null;
                if (c0700l2 != null) {
                    c0701m = c0700l2.b;
                }
            }
            t.a(c0701m);
        }
    }
}

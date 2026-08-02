package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f9011a;

    public V(InterfaceC1026i interfaceC1026i) {
        this.f9011a = interfaceC1026i.a();
    }

    public final void a(C1029l c1029l) {
        for (T t3 : this.f9011a) {
            C1030m c1030m = null;
            if (c1029l != null) {
                C1029l c1029l2 = c1029l.f9056a ? c1029l : null;
                if (c1029l2 != null) {
                    c1030m = c1029l2.f9057b;
                }
            }
            t3.a(c1030m);
        }
    }
}

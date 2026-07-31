package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final List f40719a;

    public S(List list) {
        this.f40719a = list;
    }

    public final void a(C3165k c3165k) {
        for (P p4 : this.f40719a) {
            C3166l c3166l = null;
            if (c3165k != null) {
                C3165k c3165k2 = c3165k.f40767a ? c3165k : null;
                if (c3165k2 != null) {
                    c3166l = c3165k2.f40768b;
                }
            }
            p4.a(c3166l);
        }
    }
}

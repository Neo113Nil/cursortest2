package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0544u4 extends Bd {
    public final Object f;

    public AbstractC0544u4(int i, String str, Object obj, to toVar, K2 k2) {
        super(i, str, toVar, k2);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Bd, io.appmetrica.analytics.impl.InterfaceC0185fo
    public final void a(C0159eo c0159eo) {
        if (f()) {
            K2 k2 = this.d;
            int i = this.b;
            C0211go a2 = k2.a(c0159eo, (C0211go) ((HashMap) c0159eo.f1243a.get(i)).get(this.f776a), this);
            if (a2 != null) {
                a(a2);
            }
        }
    }

    public abstract void a(C0211go c0211go);

    public final Object g() {
        return this.f;
    }
}

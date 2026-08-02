package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class A4 extends Hd {
    public final Object f;

    public A4(int i3, String str, Object obj, InterfaceC0890uo interfaceC0890uo, R2 r22) {
        super(i3, str, interfaceC0890uo, r22);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Hd, io.appmetrica.analytics.impl.InterfaceC0528go
    public final void a(C0502fo c0502fo) {
        if (f()) {
            R2 r22 = this.f6083d;
            int i3 = this.f6081b;
            C0554ho a3 = r22.a(c0502fo, (C0554ho) ((HashMap) c0502fo.f7340a.get(i3)).get(this.f6080a), this);
            if (a3 != null) {
                a(a3);
            }
        }
    }

    public abstract void a(C0554ho c0554ho);

    public final Object g() {
        return this.f;
    }
}

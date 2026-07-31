package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Hb implements InterfaceC0292k2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0370n4 f870a;

    public Hb(C0370n4 c0370n4) {
        this.f870a = c0370n4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292k2
    public final C0211go a(C0159eo c0159eo, C0211go c0211go) {
        int i = c0159eo.b;
        int i2 = this.f870a.f1388a;
        if (i == i2) {
            if (((C0211go) ((HashMap) c0159eo.f1243a.get(c0211go.b)).get(new String(c0211go.f1279a))) != null) {
                ((HashMap) c0159eo.f1243a.get(c0211go.b)).put(new String(c0211go.f1279a), c0211go);
                return c0211go;
            }
        } else if (i < i2) {
            ((HashMap) c0159eo.f1243a.get(c0211go.b)).put(new String(c0211go.f1279a), c0211go);
            c0159eo.b++;
        }
        return c0211go;
    }
}

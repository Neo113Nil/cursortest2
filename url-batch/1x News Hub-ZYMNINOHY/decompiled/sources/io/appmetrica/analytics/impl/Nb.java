package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Nb implements InterfaceC0816s2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0844t4 f6367a;

    public Nb(C0844t4 c0844t4) {
        this.f6367a = c0844t4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0816s2
    public final C0554ho a(C0502fo c0502fo, C0554ho c0554ho) {
        int i3 = c0502fo.f7341b;
        int i4 = this.f6367a.f8335a;
        if (i3 == i4) {
            if (((C0554ho) ((HashMap) c0502fo.f7340a.get(c0554ho.f7488b)).get(new String(c0554ho.f7487a))) != null) {
                ((HashMap) c0502fo.f7340a.get(c0554ho.f7488b)).put(new String(c0554ho.f7487a), c0554ho);
                return c0554ho;
            }
        } else if (i3 < i4) {
            ((HashMap) c0502fo.f7340a.get(c0554ho.f7488b)).put(new String(c0554ho.f7487a), c0554ho);
            c0502fo.f7341b++;
        }
        return c0554ho;
    }
}

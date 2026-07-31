package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0469r4 extends AbstractC0494s4 {
    public C0469r4(C0508si c0508si) {
        super(c0508si);
    }

    public final void a(EnumC0095cb enumC0095cb, List<Sg> list) {
        if (!AbstractC0624x9.h.contains(enumC0095cb)) {
            list.add(this.f1478a.s);
        }
        if (AbstractC0624x9.b.contains(enumC0095cb)) {
            return;
        }
        list.add(this.f1478a.c);
    }
}

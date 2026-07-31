package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class Fc implements G8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0579ve f844a;
    public final Function0 b;

    public Fc(InterfaceC0579ve interfaceC0579ve, Function0<Integer> function0) {
        this.f844a = interfaceC0579ve;
        this.b = function0;
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return ((C0554ue) this.f844a).b.get() >= ((long) ((Number) this.b.invoke()).intValue());
    }
}

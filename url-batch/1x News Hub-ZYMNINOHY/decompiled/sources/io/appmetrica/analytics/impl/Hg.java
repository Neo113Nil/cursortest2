package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Hg implements U7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0483f5 f6085a;

    public Hg(InterfaceC0483f5 interfaceC0483f5) {
        this.f6085a = interfaceC0483f5;
    }

    @Override // io.appmetrica.analytics.impl.U7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Gg a(Context context, X4 x4, C0922w4 c0922w4) {
        return new Gg(context, x4, c0922w4, this.f6085a, new Y4(), Ll.a());
    }

    public final InterfaceC0483f5 a() {
        return this.f6085a;
    }
}

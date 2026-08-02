package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669ma implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0854te f7873a;

    public C0669ma() {
        this(new Wl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0914vm fromModel(C0818s4 c0818s4) {
        C0914vm c0914vm = new C0914vm();
        c0914vm.f8532b = c0818s4.f8290b;
        c0914vm.f8531a = c0818s4.f8289a;
        c0914vm.f8533c = c0818s4.f8291c;
        c0914vm.f8534d = c0818s4.f8292d;
        c0914vm.f8535e = c0818s4.f8293e;
        c0914vm.f = this.f7873a.a(c0818s4.f);
        return c0914vm;
    }

    public C0669ma(Wl wl) {
        this.f7873a = wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0818s4 toModel(C0914vm c0914vm) {
        C0767q4 c0767q4 = new C0767q4();
        c0767q4.f8123d = c0914vm.f8534d;
        c0767q4.f8122c = c0914vm.f8533c;
        c0767q4.f8121b = c0914vm.f8532b;
        c0767q4.f8120a = c0914vm.f8531a;
        c0767q4.f8124e = c0914vm.f8535e;
        c0767q4.f = this.f7873a.a(c0914vm.f);
        return new C0818s4(c0767q4);
    }
}

package io.appmetrica.analytics.impl;

import b2.C0193g;
import b2.InterfaceC0189c;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* loaded from: classes.dex */
public final class Fb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f5992a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0189c f5993b = new C0193g(new Eb(this));

    public Fb(C0457e5 c0457e5) {
        this.f5992a = c0457e5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0754ph getConfig() {
        return (C0754ph) ((C0193g) this.f5993b).a();
    }
}

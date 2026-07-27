package io.appmetrica.analytics.impl;

import a.AbstractC0169a;
import f4.InterfaceC0428e;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* loaded from: classes.dex */
public final class Fb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f6783a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0428e f6784b = AbstractC0169a.A(new Eb(this));

    public Fb(C0608e5 c0608e5) {
        this.f6783a = c0608e5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0905ph getConfig() {
        return (C0905ph) this.f6784b.getValue();
    }
}

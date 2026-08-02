package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* loaded from: classes.dex */
public final class I implements InterfaceC1026i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f8987a;

    /* renamed from: b, reason: collision with root package name */
    public final U f8988b;

    public I(ClientContext clientContext, U u3) {
        this.f8987a = clientContext;
        this.f8988b = u3;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1026i
    public final List<T> a() {
        return c2.f.L(new C1038v(this.f8987a, this.f8988b), new g0(this.f8987a, this.f8988b));
    }
}

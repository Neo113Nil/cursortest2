package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* loaded from: classes.dex */
public final class I implements InterfaceC1151i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13416a;

    /* renamed from: b, reason: collision with root package name */
    public final U f13417b;

    public I(ClientContext clientContext, U u4) {
        this.f13416a = clientContext;
        this.f13417b = u4;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1151i
    public final List<T> a() {
        return d3.j.W(new C1163v(this.f13416a, this.f13417b), new g0(this.f13416a, this.f13417b));
    }
}

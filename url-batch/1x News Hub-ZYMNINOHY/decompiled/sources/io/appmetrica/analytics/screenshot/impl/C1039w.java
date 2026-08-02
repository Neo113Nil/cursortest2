package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039w implements InterfaceC1026i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9077a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9078b;

    public C1039w(ClientContext clientContext, U u3) {
        this.f9077a = clientContext;
        this.f9078b = u3;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1026i
    public final List<T> a() {
        return c2.f.L(new C1021d(this.f9077a, this.f9078b), new C1038v(this.f9077a, this.f9078b), new g0(this.f9077a, this.f9078b));
    }
}

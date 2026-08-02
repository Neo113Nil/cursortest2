package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164w implements InterfaceC1151i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13507a;

    /* renamed from: b, reason: collision with root package name */
    public final U f13508b;

    public C1164w(ClientContext clientContext, U u4) {
        this.f13507a = clientContext;
        this.f13508b = u4;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1151i
    public final List<T> a() {
        return d3.j.W(new C1146d(this.f13507a, this.f13508b), new C1163v(this.f13507a, this.f13508b), new g0(this.f13507a, this.f13508b));
    }
}

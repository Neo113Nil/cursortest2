package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class I implements InterfaceC0697i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1706a;
    public final U b;

    public I(ClientContext clientContext, U u) {
        this.f1706a = clientContext;
        this.b = u;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0697i
    public final List<T> a() {
        return CollectionsKt.listOf((Object[]) new T[]{new C0709v(this.f1706a, this.b), new g0(this.f1706a, this.b)});
    }
}

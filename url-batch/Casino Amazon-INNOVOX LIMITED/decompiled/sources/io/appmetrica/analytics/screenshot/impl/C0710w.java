package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0710w implements InterfaceC0697i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1747a;
    public final U b;

    public C0710w(ClientContext clientContext, U u) {
        this.f1747a = clientContext;
        this.b = u;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0697i
    public final List<T> a() {
        return CollectionsKt.listOf((Object[]) new T[]{new C0692d(this.f1747a, this.b), new C0709v(this.f1747a, this.b), new g0(this.f1747a, this.b)});
    }
}

package io.appmetrica.analytics.screenshot.impl;

import g4.AbstractC0466k;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190w implements InterfaceC1177i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f10058a;

    /* renamed from: b, reason: collision with root package name */
    public final U f10059b;

    public C1190w(ClientContext clientContext, U u5) {
        this.f10058a = clientContext;
        this.f10059b = u5;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1177i
    public final List<T> a() {
        return AbstractC0466k.A0(new C1172d(this.f10058a, this.f10059b), new C1189v(this.f10058a, this.f10059b), new g0(this.f10058a, this.f10059b));
    }
}

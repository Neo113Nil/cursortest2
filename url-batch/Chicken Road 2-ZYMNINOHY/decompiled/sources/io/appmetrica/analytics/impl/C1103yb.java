package io.appmetrica.analytics.impl;

import c3.C0295g;
import c3.InterfaceC0291c;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103yb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f13057a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0291c f13058b = new C0295g(new C1077xb(this));

    public C1103yb(X4 x4) {
        this.f13057a = x4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0746kh getConfig() {
        return (C0746kh) ((C0295g) this.f13058b).a();
    }
}

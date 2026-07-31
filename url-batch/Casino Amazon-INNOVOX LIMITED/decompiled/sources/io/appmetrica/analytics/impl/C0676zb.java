package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0676zb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f1598a;
    public final Lazy b = LazyKt.lazy(new C0651yb(this));

    public C0676zb(Y4 y4) {
        this.f1598a = y4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0333lh getConfig() {
        return (C0333lh) this.b.getValue();
    }
}

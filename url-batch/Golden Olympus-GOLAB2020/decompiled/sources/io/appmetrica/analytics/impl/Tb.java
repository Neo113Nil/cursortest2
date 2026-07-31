package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Tb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f38302a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.h f38303b = W1.i.b(new Sb(this));

    public Tb(@NotNull C2953s5 c2953s5) {
        this.f38302a = c2953s5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3095xh getConfig() {
        return (C3095xh) this.f38303b.getValue();
    }
}

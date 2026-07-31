package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class H implements Savable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f37597a;

    public H(I i4) {
        this.f37597a = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f37597a.f37679a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z4) {
        this.f37597a.f37679a.e(z4);
    }
}

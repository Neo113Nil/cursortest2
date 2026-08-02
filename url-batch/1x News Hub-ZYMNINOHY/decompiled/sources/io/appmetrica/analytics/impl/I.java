package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* loaded from: classes.dex */
public final class I implements Savable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f6103a;

    public I(J j3) {
        this.f6103a = j3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f6103a.f6183a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z) {
        this.f6103a.f6183a.e(z);
    }
}

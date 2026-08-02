package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* loaded from: classes.dex */
public final class I implements Savable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f10388a;

    public I(J j4) {
        this.f10388a = j4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f10388a.f10450a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z) {
        this.f10388a.f10450a.e(z);
    }
}

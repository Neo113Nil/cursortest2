package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Jn implements InterfaceC3081x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37851a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC3081x3 f37852b;

    public Jn(Object obj, @NonNull InterfaceC3081x3 interfaceC3081x3) {
        this.f37851a = obj;
        this.f37852b = interfaceC3081x3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3081x3
    public final int getBytesTruncated() {
        return this.f37852b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f37851a + ", metaInfo=" + this.f37852b + '}';
    }
}

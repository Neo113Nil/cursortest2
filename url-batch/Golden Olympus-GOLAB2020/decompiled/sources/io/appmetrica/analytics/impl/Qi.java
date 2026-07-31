package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Qi implements InterfaceC3081x3 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f38171a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC3081x3 f38172b;

    public Qi(@NonNull Object obj, @NonNull InterfaceC3081x3 interfaceC3081x3) {
        this.f38171a = obj;
        this.f38172b = interfaceC3081x3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3081x3
    public final int getBytesTruncated() {
        return this.f38172b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f38171a + ", metaInfo=" + this.f38172b + '}';
    }
}

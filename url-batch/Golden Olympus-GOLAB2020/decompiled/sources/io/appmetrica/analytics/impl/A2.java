package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class A2 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C3132z2();
    }

    @NonNull
    public final C3132z2 b() {
        return new C3132z2();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C3132z2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3132z2 toState(@NonNull byte[] bArr) {
        return (C3132z2) MessageNano.mergeFrom(new C3132z2(), bArr);
    }
}

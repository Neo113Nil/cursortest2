package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2586e2 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C2560d2();
    }

    @NonNull
    public final C2560d2 b() {
        return new C2560d2();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C2560d2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2560d2 toState(@NonNull byte[] bArr) {
        return (C2560d2) MessageNano.mergeFrom(new C2560d2(), bArr);
    }
}

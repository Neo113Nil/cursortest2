package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2724j9 extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new P9();
    }

    @NonNull
    public final P9 b() {
        return new P9();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new P9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P9 toState(@NonNull byte[] bArr) {
        return (P9) MessageNano.mergeFrom(new P9(), bArr);
    }
}

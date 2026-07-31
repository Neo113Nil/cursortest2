package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3067wf extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new Bf();
    }

    @NonNull
    public final Bf b() {
        return new Bf();
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new Bf();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bf toState(@NonNull byte[] bArr) {
        return (Bf) MessageNano.mergeFrom(new Bf(), bArr);
    }
}

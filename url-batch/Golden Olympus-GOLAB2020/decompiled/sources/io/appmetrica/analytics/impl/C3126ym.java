package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3126ym extends Q2 {
    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3100xm defaultValue() {
        C3100xm c3100xm = new C3100xm();
        c3100xm.f40220i = new C2970sm();
        return c3100xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3100xm toState(@NonNull byte[] bArr) {
        return (C3100xm) MessageNano.mergeFrom(new C3100xm(), bArr);
    }
}

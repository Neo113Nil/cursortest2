package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0662ym extends BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0637xm defaultValue() {
        C0637xm c0637xm = new C0637xm();
        c0637xm.i = new C0512sm();
        return c0637xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0637xm toState(byte[] bArr) throws IOException {
        return (C0637xm) MessageNano.mergeFrom(new C0637xm(), bArr);
    }
}

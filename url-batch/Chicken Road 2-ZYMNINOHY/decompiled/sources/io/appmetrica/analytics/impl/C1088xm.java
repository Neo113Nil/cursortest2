package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088xm extends BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1062wm defaultValue() {
        C1062wm c1062wm = new C1062wm();
        c1062wm.f12967i = new C0932rm();
        return c1062wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1062wm toState(byte[] bArr) throws IOException {
        return (C1062wm) MessageNano.mergeFrom(new C1062wm(), bArr);
    }
}

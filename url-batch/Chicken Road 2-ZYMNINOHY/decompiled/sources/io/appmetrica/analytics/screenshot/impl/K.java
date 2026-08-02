package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class K implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final M f13420a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(J j4) {
        return MessageNano.toByteArray(this.f13420a.fromModel(j4));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f13420a.fromModel((J) obj));
    }

    public K(M m4) {
        this.f13420a = m4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(byte[] bArr) {
        S s4;
        try {
            s4 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s4 = new S();
        }
        return this.f13420a.toModel(s4);
    }

    public /* synthetic */ K(M m4, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new M(null, 1, null) : m4);
    }
}

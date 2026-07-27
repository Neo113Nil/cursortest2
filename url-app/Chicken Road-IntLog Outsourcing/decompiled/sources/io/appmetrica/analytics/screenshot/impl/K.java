package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class K implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final M f9971a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(J j2) {
        return MessageNano.toByteArray(this.f9971a.fromModel(j2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f9971a.fromModel((J) obj));
    }

    public K(M m6) {
        this.f9971a = m6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(byte[] bArr) {
        S s2;
        try {
            s2 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s2 = new S();
        }
        return this.f9971a.toModel(s2);
    }

    public /* synthetic */ K(M m6, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new M(null, 1, null) : m6);
    }
}

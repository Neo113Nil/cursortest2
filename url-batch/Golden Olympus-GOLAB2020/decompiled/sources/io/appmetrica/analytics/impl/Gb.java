package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Gb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C2677hd f37574a;

    public Gb() {
        this(new C2677hd(new On()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Nn nn) {
        return MessageNano.toByteArray((MessageNano) this.f37574a.f39142a.fromModel(nn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Gb(C2677hd c2677hd) {
        this.f37574a = c2677hd;
    }

    @NonNull
    public final Nn a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}

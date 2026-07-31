package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class K9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I9 fromModel(@NonNull J9 j9) {
        I9 i9 = new I9();
        String str = j9.f37825a;
        if (str != null) {
            i9.f37729a = str.getBytes();
        }
        return i9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J9 toModel(@NonNull I9 i9) {
        return new J9(new String(i9.f37729a));
    }
}

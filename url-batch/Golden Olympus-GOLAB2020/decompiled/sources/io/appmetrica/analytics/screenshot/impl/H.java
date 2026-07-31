package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class H implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final J f40699a;

    /* JADX WARN: Multi-variable type inference failed */
    public H() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull G g4) {
        return MessageNano.toByteArray(this.f40699a.fromModel(g4));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f40699a.fromModel((G) obj));
    }

    public H(@NotNull J j4) {
        this.f40699a = j4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(@NotNull byte[] bArr) {
        O o4;
        try {
            o4 = (O) MessageNano.mergeFrom(new O(), bArr);
        } catch (Throwable unused) {
            o4 = new O();
        }
        return this.f40699a.toModel(o4);
    }

    public /* synthetic */ H(J j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new J(null, 1, null) : j4);
    }
}

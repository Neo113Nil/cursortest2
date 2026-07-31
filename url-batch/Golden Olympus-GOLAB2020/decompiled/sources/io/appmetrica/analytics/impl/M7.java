package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class M7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final L7 f37970a;

    /* JADX WARN: Multi-variable type inference failed */
    public M7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull N7 n7) {
        return MessageNano.toByteArray(this.f37970a.fromModel(n7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f37970a.fromModel((N7) obj));
    }

    public M7(@NotNull L7 l7) {
        this.f37970a = l7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final N7 toModel(@Nullable byte[] bArr) {
        K7 k7;
        if (bArr != null) {
            try {
                k7 = (K7) MessageNano.mergeFrom(new K7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                k7 = new K7();
            }
        }
        k7 = new K7();
        return this.f37970a.toModel(k7);
    }

    public /* synthetic */ M7(L7 l7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new L7(null, 1, null) : l7);
    }
}

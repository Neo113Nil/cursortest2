package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3111y7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3085x7 f40261a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3111y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull C3137z7 c3137z7) {
        return MessageNano.toByteArray(this.f40261a.fromModel(c3137z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f40261a.fromModel((C3137z7) obj));
    }

    public C3111y7(@NotNull C3085x7 c3085x7) {
        this.f40261a = c3085x7;
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
    public final C3137z7 toModel(@Nullable byte[] bArr) {
        I7 i7;
        if (bArr != null) {
            try {
                i7 = (I7) MessageNano.mergeFrom(new I7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                i7 = new I7();
            }
        }
        i7 = new I7();
        return this.f40261a.toModel(i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3111y7(C3085x7 c3085x7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3085x7);
        if ((i4 & 1) != 0) {
            c3085x7 = new C3085x7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}

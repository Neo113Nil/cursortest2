package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976y7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0951x7 f8636a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0976y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C1001z7 c1001z7) {
        return MessageNano.toByteArray(this.f8636a.fromModel(c1001z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f8636a.fromModel((C1001z7) obj));
    }

    public C0976y7(C0951x7 c0951x7) {
        this.f8636a = c0951x7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1001z7 toModel(byte[] bArr) {
        C0925w7 c0925w7;
        if (bArr != null) {
            try {
                c0925w7 = (C0925w7) MessageNano.mergeFrom(new C0925w7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0925w7 = new C0925w7();
            }
        }
        c0925w7 = new C0925w7();
        return this.f8636a.toModel(c0925w7);
    }

    public /* synthetic */ C0976y7(C0951x7 c0951x7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0951x7(null, 1, null) : c0951x7);
    }
}

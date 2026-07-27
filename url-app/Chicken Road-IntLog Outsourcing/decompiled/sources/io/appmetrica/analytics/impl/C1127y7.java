package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127y7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1102x7 f9592a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1127y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C1152z7 c1152z7) {
        return MessageNano.toByteArray(this.f9592a.fromModel(c1152z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f9592a.fromModel((C1152z7) obj));
    }

    public C1127y7(C1102x7 c1102x7) {
        this.f9592a = c1102x7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1152z7 toModel(byte[] bArr) {
        C1076w7 c1076w7;
        if (bArr != null) {
            try {
                c1076w7 = (C1076w7) MessageNano.mergeFrom(new C1076w7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c1076w7 = new C1076w7();
            }
        }
        c1076w7 = new C1076w7();
        return this.f9592a.toModel(c1076w7);
    }

    public /* synthetic */ C1127y7(C1102x7 c1102x7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C1102x7(null, 1, null) : c1102x7);
    }
}

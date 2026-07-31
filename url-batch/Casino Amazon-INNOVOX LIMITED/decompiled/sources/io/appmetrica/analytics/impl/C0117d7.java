package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0117d7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0091c7 f1210a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0117d7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0142e7 c0142e7) {
        return MessageNano.toByteArray(this.f1210a.fromModel(c0142e7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f1210a.fromModel((C0142e7) obj));
    }

    public C0117d7(C0091c7 c0091c7) {
        this.f1210a = c0091c7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0142e7 toModel(byte[] bArr) {
        C0373n7 c0373n7;
        if (bArr != null) {
            try {
                c0373n7 = (C0373n7) MessageNano.mergeFrom(new C0373n7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0373n7 = new C0373n7();
            }
        }
        c0373n7 = new C0373n7();
        return this.f1210a.toModel(c0373n7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0117d7(C0091c7 c0091c7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0091c7);
        if ((i & 1) != 0) {
            c0091c7 = new C0091c7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614k7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0588j7 f7705a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0614k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0640l7 c0640l7) {
        return MessageNano.toByteArray(this.f7705a.fromModel(c0640l7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f7705a.fromModel((C0640l7) obj));
    }

    public C0614k7(C0588j7 c0588j7) {
        this.f7705a = c0588j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0640l7 toModel(byte[] bArr) {
        C0873u7 c0873u7;
        if (bArr != null) {
            try {
                c0873u7 = (C0873u7) MessageNano.mergeFrom(new C0873u7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0873u7 = new C0873u7();
            }
        }
        c0873u7 = new C0873u7();
        return this.f7705a.toModel(c0873u7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0614k7(C0588j7 c0588j7, int i3, kotlin.jvm.internal.f fVar) {
        this(c0588j7);
        if ((i3 & 1) != 0) {
            c0588j7 = new C0588j7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}

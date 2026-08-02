package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530c7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0504b7 f11592a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0530c7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0556d7 c0556d7) {
        return MessageNano.toByteArray(this.f11592a.fromModel(c0556d7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f11592a.fromModel((C0556d7) obj));
    }

    public C0530c7(C0504b7 c0504b7) {
        this.f11592a = c0504b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0556d7 toModel(byte[] bArr) {
        C0788m7 c0788m7;
        if (bArr != null) {
            try {
                c0788m7 = (C0788m7) MessageNano.mergeFrom(new C0788m7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0788m7 = new C0788m7();
            }
        }
        c0788m7 = new C0788m7();
        return this.f11592a.toModel(c0788m7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0530c7(C0504b7 c0504b7, int i4, kotlin.jvm.internal.e eVar) {
        this(c0504b7);
        if ((i4 & 1) != 0) {
            c0504b7 = new C0504b7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}

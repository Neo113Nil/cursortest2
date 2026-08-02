package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892q7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0866p7 f12606a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0892q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0917r7 c0917r7) {
        return MessageNano.toByteArray(this.f12606a.fromModel(c0917r7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f12606a.fromModel((C0917r7) obj));
    }

    public C0892q7(C0866p7 c0866p7) {
        this.f12606a = c0866p7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0917r7 toModel(byte[] bArr) {
        C0840o7 c0840o7;
        if (bArr != null) {
            try {
                c0840o7 = (C0840o7) MessageNano.mergeFrom(new C0840o7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0840o7 = new C0840o7();
            }
        }
        c0840o7 = new C0840o7();
        return this.f12606a.toModel(c0840o7);
    }

    public /* synthetic */ C0892q7(C0866p7 c0866p7, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C0866p7(null, 1, null) : c0866p7);
    }
}

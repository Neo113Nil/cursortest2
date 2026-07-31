package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0472r7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0448q7 f1464a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0472r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0497s7 c0497s7) {
        return MessageNano.toByteArray(this.f1464a.fromModel(c0497s7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f1464a.fromModel((C0497s7) obj));
    }

    public C0472r7(C0448q7 c0448q7) {
        this.f1464a = c0448q7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0497s7 toModel(byte[] bArr) {
        C0423p7 c0423p7;
        if (bArr != null) {
            try {
                c0423p7 = (C0423p7) MessageNano.mergeFrom(new C0423p7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0423p7 = new C0423p7();
            }
        }
        c0423p7 = new C0423p7();
        return this.f1464a.toModel(c0423p7);
    }

    public /* synthetic */ C0472r7(C0448q7 c0448q7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0448q7(null, 1, null) : c0448q7);
    }
}

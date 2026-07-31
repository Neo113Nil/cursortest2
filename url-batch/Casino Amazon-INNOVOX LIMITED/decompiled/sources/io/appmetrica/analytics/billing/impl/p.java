package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class p implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final r f582a;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(RemoteBillingConfig remoteBillingConfig) {
        return MessageNano.toByteArray(this.f582a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f582a.fromModel((RemoteBillingConfig) obj));
    }

    public p(r rVar) {
        this.f582a = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(byte[] bArr) {
        t tVar;
        try {
            tVar = (t) MessageNano.mergeFrom(new t(), bArr);
        } catch (Throwable unused) {
            tVar = new t();
        }
        return this.f582a.toModel(tVar);
    }

    public /* synthetic */ p(r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new r(null, 1, null) : rVar);
    }
}

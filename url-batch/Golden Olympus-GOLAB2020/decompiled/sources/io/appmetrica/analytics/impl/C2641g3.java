package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2641g3 implements ProtobufConverter {
    public static C3106y2 a(BillingInfo billingInfo) {
        C3106y2 c3106y2 = new C3106y2();
        int i4 = AbstractC2614f3.f38952a[billingInfo.type.ordinal()];
        c3106y2.f40246a = i4 != 1 ? i4 != 2 ? 1 : 3 : 2;
        c3106y2.f40247b = billingInfo.productId;
        c3106y2.f40248c = billingInfo.purchaseToken;
        c3106y2.f40249d = billingInfo.purchaseTime;
        c3106y2.f40250e = billingInfo.sendTime;
        return c3106y2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C3106y2 c3106y2 = (C3106y2) obj;
        int i4 = c3106y2.f40246a;
        return new BillingInfo(i4 != 2 ? i4 != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c3106y2.f40247b, c3106y2.f40248c, c3106y2.f40249d, c3106y2.f40250e);
    }
}

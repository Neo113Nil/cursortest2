package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(BillingInfo billingInfo) {
        c cVar = new c();
        int i4 = h.f9458a[billingInfo.type.ordinal()];
        cVar.f9447a = i4 != 1 ? i4 != 2 ? 1 : 3 : 2;
        cVar.f9448b = billingInfo.productId;
        cVar.f9449c = billingInfo.purchaseToken;
        cVar.f9450d = billingInfo.purchaseTime;
        cVar.f9451e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(c cVar) {
        ProductType productType;
        int i4 = cVar.f9447a;
        if (i4 == 2) {
            productType = ProductType.INAPP;
        } else if (i4 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f9448b, cVar.f9449c, cVar.f9450d, cVar.f9451e);
    }
}

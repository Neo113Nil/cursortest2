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
        int i2 = h.f5967a[billingInfo.type.ordinal()];
        cVar.f5956a = i2 != 1 ? i2 != 2 ? 1 : 3 : 2;
        cVar.f5957b = billingInfo.productId;
        cVar.f5958c = billingInfo.purchaseToken;
        cVar.f5959d = billingInfo.purchaseTime;
        cVar.f5960e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(c cVar) {
        ProductType productType;
        int i2 = cVar.f5956a;
        if (i2 == 2) {
            productType = ProductType.INAPP;
        } else if (i2 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f5957b, cVar.f5958c, cVar.f5959d, cVar.f5960e);
    }
}

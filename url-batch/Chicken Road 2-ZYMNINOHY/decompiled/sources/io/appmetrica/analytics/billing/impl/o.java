package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String str;
        z zVar = new z();
        zVar.f9513a = productInfo.quantity;
        zVar.f9518f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        Charset charset = AbstractC1504a.f15936a;
        zVar.f9514b = str.getBytes(charset);
        zVar.f9515c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f9481a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f9482b = productInfo.signature.getBytes(charset);
        zVar.f9517e = uVar;
        zVar.f9519g = true;
        zVar.f9520h = 1;
        int i4 = n.f9468a[productInfo.type.ordinal()];
        zVar.f9521i = (i4 == 1 || i4 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f9504a = productInfo.purchaseToken.getBytes(charset);
        yVar.f9505b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f9522j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f9497a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f9494a = period.number;
                int i5 = n.f9469b[period.timeUnit.ordinal()];
                wVar.f9495b = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f9498b = wVar;
            }
            v vVar = new v();
            vVar.f9484a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f9494a = period2.number;
                int i6 = n.f9469b[period2.timeUnit.ordinal()];
                wVar2.f9495b = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f9485b = wVar2;
            }
            vVar.f9486c = productInfo.introductoryPriceCycles;
            xVar.f9499c = vVar;
            zVar.f9523k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}

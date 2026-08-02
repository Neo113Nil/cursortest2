package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String str;
        z zVar = new z();
        zVar.f5270a = productInfo.quantity;
        zVar.f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        Charset charset = s2.a.f10316a;
        zVar.f5271b = str.getBytes(charset);
        zVar.f5272c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f5239a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f5240b = productInfo.signature.getBytes(charset);
        zVar.f5274e = uVar;
        zVar.f5275g = true;
        zVar.f5276h = 1;
        int i3 = n.f5226a[productInfo.type.ordinal()];
        zVar.f5277i = (i3 == 1 || i3 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f5260a = productInfo.purchaseToken.getBytes(charset);
        yVar.f5261b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f5278j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f5254a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f5251a = period.number;
                int i4 = n.f5227b[period.timeUnit.ordinal()];
                wVar.f5252b = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f5255b = wVar;
            }
            v vVar = new v();
            vVar.f5242a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f5251a = period2.number;
                int i5 = n.f5227b[period2.timeUnit.ordinal()];
                wVar2.f5252b = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f5243b = wVar2;
            }
            vVar.f5244c = productInfo.introductoryPriceCycles;
            xVar.f5256c = vVar;
            zVar.f5279k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}

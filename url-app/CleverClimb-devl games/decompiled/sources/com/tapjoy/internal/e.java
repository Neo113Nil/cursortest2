package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f7977a;

    /* renamed from: b, reason: collision with root package name */
    public String f7978b;

    /* renamed from: c, reason: collision with root package name */
    public String f7979c;

    /* renamed from: d, reason: collision with root package name */
    public String f7980d;
    public String e;
    public String f;
    public long g;

    public e(String str) {
        bn b2 = bn.b(str);
        b2.h();
        while (b2.j()) {
            String l = b2.l();
            if (InAppPurchaseMetaData.KEY_PRODUCT_ID.equals(l)) {
                this.f7977a = b2.m();
            } else if ("type".equals(l)) {
                this.f7978b = b2.m();
            } else if (InAppPurchaseMetaData.KEY_PRICE.equals(l)) {
                this.f7979c = b2.m();
            } else if (TJAdUnitConstants.String.TITLE.equals(l)) {
                this.f7980d = b2.m();
            } else if ("description".equals(l)) {
                this.e = b2.m();
            } else if ("price_currency_code".equals(l)) {
                this.f = b2.m();
            } else if ("price_amount_micros".equals(l)) {
                this.g = b2.q();
            } else {
                b2.s();
            }
        }
        b2.i();
    }
}

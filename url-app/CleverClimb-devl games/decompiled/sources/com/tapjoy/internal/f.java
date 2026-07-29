package com.tapjoy.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f8057a;

    /* renamed from: b, reason: collision with root package name */
    public String f8058b;

    /* renamed from: c, reason: collision with root package name */
    public String f8059c;

    /* renamed from: d, reason: collision with root package name */
    public long f8060d;
    public int e;
    public String f;
    public String g;

    public f(String str) {
        bn b2 = bn.b(str);
        b2.h();
        while (b2.j()) {
            String l = b2.l();
            if ("orderId".equals(l)) {
                this.f8057a = b2.m();
            } else if ("packageName".equals(l)) {
                this.f8058b = b2.m();
            } else if (InAppPurchaseMetaData.KEY_PRODUCT_ID.equals(l)) {
                this.f8059c = b2.m();
            } else if ("purchaseTime".equals(l)) {
                this.f8060d = b2.q();
            } else if ("purchaseState".equals(l)) {
                this.e = b2.r();
            } else if ("developerPayload".equals(l)) {
                this.f = b2.m();
            } else if ("purchaseToken".equals(l)) {
                this.g = b2.m();
            } else {
                b2.s();
            }
        }
        b2.i();
    }
}

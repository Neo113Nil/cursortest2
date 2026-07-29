package com.ironsource.b;

import com.youappi.sdk.net.model.ProductRequestItem;

/* compiled from: EBannerSize.java */
/* loaded from: classes2.dex */
public enum g {
    BANNER("banner"),
    LARGE("large"),
    RECTANGLE("rectangle"),
    TABLET(ProductRequestItem.Device.TYPE_TABLET),
    SMART("smart");

    private String f;

    g(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }

    public int a() {
        return ordinal() + 1;
    }
}

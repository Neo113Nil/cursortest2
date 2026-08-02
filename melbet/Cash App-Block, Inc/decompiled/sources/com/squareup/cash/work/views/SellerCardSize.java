package com.squareup.cash.work.views;

/* loaded from: classes7.dex */
public enum SellerCardSize {
    XSmall(16.0f, 3.2f, 2.0f),
    Small(24.0f, 4.8f, 4.0f),
    Medium(48.0f, 9.6f, 12.0f),
    Large(64.0f, 12.8f, 16.0f),
    XLarge(120.0f, 24.0f, 24.0f);

    public final float cornerRadius;
    public final float padding;
    public final float width;

    SellerCardSize(float f, float f2, float f3) {
        this.width = f;
        this.padding = f2;
        this.cornerRadius = f3;
    }
}

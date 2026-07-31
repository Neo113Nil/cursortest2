package com.my.tracker.personalize;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class PersonalizeItem {
    public final double discountPrice;
    public final int discountValue;

    @NonNull
    public final String payload;
    public final double price;

    @NonNull
    public final String sku;
    public final int value;

    PersonalizeItem(String str, String str2, double d4, double d5, int i4, int i5) {
        this.sku = str;
        this.payload = str2;
        this.price = d4;
        this.discountPrice = d5;
        this.value = i4;
        this.discountValue = i5;
    }
}

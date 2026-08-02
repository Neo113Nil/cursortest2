package com.stripe.android.stripe3ds2.views;

import com.squareup.cash.R;
import kotlin.enums.EnumEntriesList;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Brand {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ Brand[] $VALUES;
    public static final POPMatchingFactory Companion;
    public static final Brand Unknown;
    public final String directoryServerName;
    public final int drawableResId;
    public final Integer nameResId;
    public final boolean shouldStretch;

    static {
        Brand brand = new Brand("Visa", 0, "visa", R.drawable.stripe_3ds2_ic_visa, Integer.valueOf(R.string.stripe_3ds2_brand_visa), false);
        Brand brand2 = new Brand("Mastercard", 1, "mastercard", R.drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(R.string.stripe_3ds2_brand_mastercard), false);
        Brand brand3 = new Brand("Amex", 2, "american_express", R.drawable.stripe_3ds2_ic_amex, Integer.valueOf(R.string.stripe_3ds2_brand_amex), false);
        Brand brand4 = new Brand("Discover", 3, "discover", R.drawable.stripe_3ds2_ic_discover, Integer.valueOf(R.string.stripe_3ds2_brand_discover), false);
        Brand brand5 = new Brand("CartesBancaires", 4, "cartes_bancaires", R.drawable.stripe_3ds2_ic_cartesbancaires, Integer.valueOf(R.string.stripe_3ds2_brand_cartesbancaires), true);
        Brand brand6 = new Brand("UnionPay", 5, "unionpay", R.drawable.stripe_3ds2_ic_unionpay, Integer.valueOf(R.string.stripe_3ds2_brand_unionpay), false);
        Brand brand7 = new Brand("Unknown", 6, "unknown", R.drawable.stripe_3ds2_ic_unknown, null, false);
        Unknown = brand7;
        Brand[] brandArr = {brand, brand2, brand3, brand4, brand5, brand6, brand7};
        $VALUES = brandArr;
        $ENTRIES = new EnumEntriesList(brandArr);
        Companion = new POPMatchingFactory(18);
    }

    public Brand(String str, int i, String str2, int i2, Integer num, boolean z) {
        this.directoryServerName = str2;
        this.drawableResId = i2;
        this.nameResId = num;
        this.shouldStretch = z;
    }

    public static Brand valueOf(String str) {
        return (Brand) Enum.valueOf(Brand.class, str);
    }

    public static Brand[] values() {
        return (Brand[]) $VALUES.clone();
    }
}

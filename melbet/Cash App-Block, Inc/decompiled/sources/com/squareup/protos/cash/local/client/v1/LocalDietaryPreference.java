package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum LocalDietaryPreference implements WireEnum {
    LOCAL_DIETARY_PREFERENCE_UNSPECIFIED(0),
    LOCAL_DIETARY_PREFERENCE_DAIRY_FREE(1),
    LOCAL_DIETARY_PREFERENCE_GLUTEN_FREE(2),
    LOCAL_DIETARY_PREFERENCE_HALAL(3),
    LOCAL_DIETARY_PREFERENCE_KOSHER(4),
    LOCAL_DIETARY_PREFERENCE_NUT_FREE(5),
    LOCAL_DIETARY_PREFERENCE_VEGAN(6),
    LOCAL_DIETARY_PREFERENCE_VEGETARIAN(7);

    public static final LocalDietaryPreference$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        LocalDietaryPreference localDietaryPreference = LOCAL_DIETARY_PREFERENCE_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new LocalDietaryPreference$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LocalDietaryPreference.class), Syntax.PROTO_2, localDietaryPreference);
    }

    LocalDietaryPreference(int i) {
        this.value = i;
    }

    public static final LocalDietaryPreference fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return LOCAL_DIETARY_PREFERENCE_UNSPECIFIED;
            case 1:
                return LOCAL_DIETARY_PREFERENCE_DAIRY_FREE;
            case 2:
                return LOCAL_DIETARY_PREFERENCE_GLUTEN_FREE;
            case 3:
                return LOCAL_DIETARY_PREFERENCE_HALAL;
            case 4:
                return LOCAL_DIETARY_PREFERENCE_KOSHER;
            case 5:
                return LOCAL_DIETARY_PREFERENCE_NUT_FREE;
            case 6:
                return LOCAL_DIETARY_PREFERENCE_VEGAN;
            case 7:
                return LOCAL_DIETARY_PREFERENCE_VEGETARIAN;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

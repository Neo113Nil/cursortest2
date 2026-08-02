package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalDietaryPreference$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalDietaryPreference.Companion.getClass();
        switch (i) {
            case 0:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_UNSPECIFIED;
            case 1:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_DAIRY_FREE;
            case 2:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_GLUTEN_FREE;
            case 3:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_HALAL;
            case 4:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_KOSHER;
            case 5:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_NUT_FREE;
            case 6:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_VEGAN;
            case 7:
                return LocalDietaryPreference.LOCAL_DIETARY_PREFERENCE_VEGETARIAN;
            default:
                return null;
        }
    }
}

package com.squareup.protos.cash.taply.syncvalues;

import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TagThemeDefinition$TagFormFactor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TagThemeDefinition.TagFormFactor.Companion.getClass();
        switch (i) {
            case 0:
                return TagThemeDefinition.TagFormFactor.TAG_FORM_FACTOR_UNSPECIFIED;
            case 1:
                return TagThemeDefinition.TagFormFactor.WAND;
            case 2:
                return TagThemeDefinition.TagFormFactor.HEART;
            case 3:
                return TagThemeDefinition.TagFormFactor.MINI_CARD;
            case 4:
                return TagThemeDefinition.TagFormFactor.WAND_FIRST_EDITION;
            case 5:
                return TagThemeDefinition.TagFormFactor.HEART_FIRST_EDITION;
            case 6:
                return TagThemeDefinition.TagFormFactor.MINI_CARD_FIRST_EDITION;
            default:
                return null;
        }
    }
}

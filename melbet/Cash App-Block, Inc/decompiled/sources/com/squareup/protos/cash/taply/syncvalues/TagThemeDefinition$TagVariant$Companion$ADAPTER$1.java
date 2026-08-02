package com.squareup.protos.cash.taply.syncvalues;

import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TagThemeDefinition$TagVariant$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TagThemeDefinition.TagVariant.Companion.getClass();
        if (i == 0) {
            return TagThemeDefinition.TagVariant.TAG_VARIANT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return TagThemeDefinition.TagVariant.FIRST_EDITION;
    }
}

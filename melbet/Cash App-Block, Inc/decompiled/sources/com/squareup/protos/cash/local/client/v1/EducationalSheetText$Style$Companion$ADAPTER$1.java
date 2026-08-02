package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.EducationalSheetText;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EducationalSheetText$Style$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EducationalSheetText.Style.Companion.getClass();
        switch (i) {
            case 0:
                return EducationalSheetText.Style.STYLE_UNSPECIFIED;
            case 1:
                return EducationalSheetText.Style.STYLE_HERO;
            case 2:
                return EducationalSheetText.Style.STYLE_HEADING_MEDIUM;
            case 3:
                return EducationalSheetText.Style.STYLE_BODY;
            case 4:
                return EducationalSheetText.Style.STYLE_HERO_SUBTITLE;
            case 5:
                return EducationalSheetText.Style.STYLE_BODY_LEGAL;
            case 6:
                return EducationalSheetText.Style.STYLE_BRANDED_FOOTNOTE;
            case 7:
                return EducationalSheetText.Style.STYLE_HEADING_REGULAR;
            default:
                return null;
        }
    }
}

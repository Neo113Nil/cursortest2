package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AppletCardSection$CashCardRenderingConfiguration$DisplayStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.Companion.getClass();
        if (i == 1) {
            return AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.STANDARD;
        }
        if (i == 2) {
            return AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.ROTATED;
        }
        if (i != 3) {
            return null;
        }
        return AppletCardSection.CashCardRenderingConfiguration.DisplayStyle.ROTATED_PARTIAL;
    }
}

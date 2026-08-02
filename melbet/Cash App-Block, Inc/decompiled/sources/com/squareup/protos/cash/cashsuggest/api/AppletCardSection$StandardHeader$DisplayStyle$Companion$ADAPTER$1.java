package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AppletCardSection$StandardHeader$DisplayStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppletCardSection.StandardHeader.DisplayStyle.Companion.getClass();
        if (i == 1) {
            return AppletCardSection.StandardHeader.DisplayStyle.REGULAR;
        }
        if (i != 2) {
            return null;
        }
        return AppletCardSection.StandardHeader.DisplayStyle.DISABLED;
    }
}

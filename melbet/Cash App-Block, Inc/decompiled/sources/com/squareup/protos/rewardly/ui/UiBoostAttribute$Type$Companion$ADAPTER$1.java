package com.squareup.protos.rewardly.ui;

import com.squareup.protos.rewardly.ui.UiBoostAttribute;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UiBoostAttribute$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiBoostAttribute.Type.Companion.getClass();
        if (i == 1) {
            return UiBoostAttribute.Type.EXPIRATION;
        }
        if (i == 2) {
            return UiBoostAttribute.Type.LOCKED;
        }
        if (i == 3) {
            return UiBoostAttribute.Type.TRENDING;
        }
        if (i != 4) {
            return null;
        }
        return UiBoostAttribute.Type.ONLINE_ONLY;
    }
}

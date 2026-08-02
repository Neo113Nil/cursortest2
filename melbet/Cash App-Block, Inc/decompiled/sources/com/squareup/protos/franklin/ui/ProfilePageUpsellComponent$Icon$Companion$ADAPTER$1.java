package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.ProfilePageUpsellComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ProfilePageUpsellComponent$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProfilePageUpsellComponent.Icon.Companion.getClass();
        if (i == 1) {
            return ProfilePageUpsellComponent.Icon.VERIFYING;
        }
        if (i != 2) {
            return null;
        }
        return ProfilePageUpsellComponent.Icon.VERIFICATION_FAILED;
    }
}

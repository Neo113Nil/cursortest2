package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ArcadeBadgedAvatarElement.Size.Companion.getClass();
        if (i == 1) {
            return ArcadeBadgedAvatarElement.Size.Size32;
        }
        if (i == 2) {
            return ArcadeBadgedAvatarElement.Size.Size48;
        }
        if (i == 3) {
            return ArcadeBadgedAvatarElement.Size.Size64;
        }
        if (i != 4) {
            return null;
        }
        return ArcadeBadgedAvatarElement.Size.Size96;
    }
}

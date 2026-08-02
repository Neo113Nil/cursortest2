package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AvatarElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AvatarElement.Size.Companion.getClass();
        if (i == 1) {
            return AvatarElement.Size.SMALL;
        }
        if (i == 2) {
            return AvatarElement.Size.MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return AvatarElement.Size.LARGE;
    }
}

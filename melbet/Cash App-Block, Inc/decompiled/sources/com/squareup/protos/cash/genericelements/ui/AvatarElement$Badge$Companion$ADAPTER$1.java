package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AvatarElement$Badge$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AvatarElement.Badge.Companion.getClass();
        if (i == 1) {
            return AvatarElement.Badge.SUCCESS;
        }
        if (i == 2) {
            return AvatarElement.Badge.STAR;
        }
        if (i != 3) {
            return null;
        }
        return AvatarElement.Badge.IMAGE;
    }
}

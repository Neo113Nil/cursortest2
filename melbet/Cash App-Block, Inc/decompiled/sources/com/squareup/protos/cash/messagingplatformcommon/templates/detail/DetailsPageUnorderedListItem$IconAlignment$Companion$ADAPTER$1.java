package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageUnorderedListItem;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DetailsPageUnorderedListItem$IconAlignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DetailsPageUnorderedListItem.IconAlignment.Companion.getClass();
        if (i == 0) {
            return DetailsPageUnorderedListItem.IconAlignment.ICON_ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return DetailsPageUnorderedListItem.IconAlignment.ICON_ALIGNMENT_TOP;
        }
        if (i != 2) {
            return null;
        }
        return DetailsPageUnorderedListItem.IconAlignment.ICON_ALIGNMENT_LEFT;
    }
}

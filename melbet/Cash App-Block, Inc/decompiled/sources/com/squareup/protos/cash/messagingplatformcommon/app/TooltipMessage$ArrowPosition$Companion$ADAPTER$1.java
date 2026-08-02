package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class TooltipMessage$ArrowPosition$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TooltipMessage.ArrowPosition.Companion.getClass();
        switch (i) {
            case 1:
                return TooltipMessage.ArrowPosition.TOP_LEFT;
            case 2:
                return TooltipMessage.ArrowPosition.TOP_CENTER;
            case 3:
                return TooltipMessage.ArrowPosition.TOP_RIGHT;
            case 4:
                return TooltipMessage.ArrowPosition.BOTTOM_RIGHT;
            case 5:
                return TooltipMessage.ArrowPosition.BOTTOM_CENTER;
            case 6:
                return TooltipMessage.ArrowPosition.BOTTOM_LEFT;
            default:
                return null;
        }
    }
}

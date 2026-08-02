package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$LimitsHubInlineMessageButton$ButtonAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.Companion.getClass();
        if (i == 0) {
            return GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.BUTTON_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.BUTTON_ACTION_OPEN_URL;
        }
        if (i != 2) {
            return null;
        }
        return GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.BUTTON_ACTION_DISMISS;
    }
}

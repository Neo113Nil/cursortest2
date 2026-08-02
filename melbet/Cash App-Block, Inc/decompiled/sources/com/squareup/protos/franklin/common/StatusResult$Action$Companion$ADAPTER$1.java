package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class StatusResult$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatusResult.Action.Companion.getClass();
        switch (i) {
            case 1:
                return StatusResult.Action.SHOW_DIALOG;
            case 2:
                return StatusResult.Action.INSTANT_REDIRECT;
            case 3:
                return StatusResult.Action.START_SUPPORT_FLOW;
            case 4:
                return StatusResult.Action.INSTANT_INTERNAL_REDIRECT;
            case 5:
                return StatusResult.Action.INSTANT_BACK_NAVIGATION;
            case 6:
                return StatusResult.Action.END_ACTIVITY;
            default:
                return null;
        }
    }
}

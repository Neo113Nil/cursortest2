package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$LimitsHubInlineMessage$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetInlineMessageResponse.LimitsHubInlineMessage.Icon.Companion.getClass();
        return ByteString.Companion.fromValue(i);
    }
}

package com.squareup.protos.franklin.app;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.franklin.app.OAuthResolveFlowResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class OAuthResolveFlowResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OAuthResolveFlowResponse.Status.Companion.getClass();
        return ActionType.Companion.m3938fromValue(i);
    }
}

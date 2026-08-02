package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$ButtonAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.ButtonAction.Companion.getClass();
        return Action.Type.Companion.m3864fromValue(i);
    }
}

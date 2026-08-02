package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UiControl$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiControl.Icon.Companion.getClass();
        return Trigger.Companion.m3955fromValue(i);
    }
}

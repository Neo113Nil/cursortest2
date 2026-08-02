package com.squareup.protos.cash.investautomator.model;

import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Automation$AutomationTarget$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Automation.AutomationTarget.Type.Companion.getClass();
        return ContactAliasType.Companion.fromValue(i);
    }
}

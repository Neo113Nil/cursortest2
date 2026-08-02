package com.squareup.protos.cash.investautomator.model;

import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Automation$AutomationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Automation.AutomationStatus.Companion.getClass();
        if (i == 0) {
            return Automation.AutomationStatus.COULD_NOT_PARSE_AUTOMATION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return Automation.AutomationStatus.ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return Automation.AutomationStatus.INACTIVE;
    }
}

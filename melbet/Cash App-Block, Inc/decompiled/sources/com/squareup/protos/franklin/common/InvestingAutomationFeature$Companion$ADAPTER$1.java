package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InvestingAutomationFeature$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestingAutomationFeature.Companion.getClass();
        if (i == 1) {
            return InvestingAutomationFeature.ROUND_UPS;
        }
        if (i == 2) {
            return InvestingAutomationFeature.INVEST_WHERE_YOU_SHOP;
        }
        if (i != 3) {
            return null;
        }
        return InvestingAutomationFeature.INVEST_YOUR_PAYCHECK;
    }
}

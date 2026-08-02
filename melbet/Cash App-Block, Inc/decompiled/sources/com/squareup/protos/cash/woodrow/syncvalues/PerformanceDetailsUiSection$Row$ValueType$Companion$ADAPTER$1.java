package com.squareup.protos.cash.woodrow.syncvalues;

import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Row$ValueType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PerformanceDetailsUiSection.Row.ValueType.Companion.getClass();
        if (i == 0) {
            return PerformanceDetailsUiSection.Row.ValueType.VALUE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PerformanceDetailsUiSection.Row.ValueType.CURRENT_VALUE;
        }
        if (i == 2) {
            return PerformanceDetailsUiSection.Row.ValueType.ALL_TIME_RETURNS;
        }
        if (i != 3) {
            return null;
        }
        return PerformanceDetailsUiSection.Row.ValueType.ALL_TIME_RETURNS_PERCENTAGE;
    }
}

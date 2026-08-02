package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.CounterAbuseAction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CounterAbuseAction$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CounterAbuseAction.Action.Companion.getClass();
        if (i == 0) {
            return CounterAbuseAction.Action.ACTION_UNKNOWN;
        }
        if (i == 1) {
            return CounterAbuseAction.Action.ACTION_BLOCK;
        }
        if (i == 2) {
            return CounterAbuseAction.Action.ACTION_UNBLOCK;
        }
        if (i != 3) {
            return null;
        }
        return CounterAbuseAction.Action.ACTION_REPORT;
    }
}

package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Loan$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Loan.State.Companion.getClass();
        return Trigger.Companion.m3953fromValue(i);
    }
}

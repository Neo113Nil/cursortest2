package com.squareup.protos.cash.paychecks.api.blockers.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SetPaycheckAllocationAmountInputs$SubmissionInteraction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetPaycheckAllocationAmountInputs.SubmissionInteraction.Companion.getClass();
        return ContactAliasType.Companion.m3899fromValue(i);
    }
}

package com.squareup.protos.cash.requirements;

import com.squareup.protos.cash.requirements.SetLinkCardRequirementData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SetLinkCardRequirementData$EntryPoint$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetLinkCardRequirementData.EntryPoint.Companion.getClass();
        if (i == 1) {
            return SetLinkCardRequirementData.EntryPoint.PROFILE;
        }
        if (i == 2) {
            return SetLinkCardRequirementData.EntryPoint.CASH_IN;
        }
        if (i != 3) {
            return null;
        }
        return SetLinkCardRequirementData.EntryPoint.CASH_OUT;
    }
}

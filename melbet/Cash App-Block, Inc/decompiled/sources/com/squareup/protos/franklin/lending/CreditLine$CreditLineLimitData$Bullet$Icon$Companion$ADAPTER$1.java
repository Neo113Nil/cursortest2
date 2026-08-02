package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineLimitData$Bullet$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditLine.CreditLineLimitData.Bullet.Icon.Companion.getClass();
        if (i == 1) {
            return CreditLine.CreditLineLimitData.Bullet.Icon.TIME;
        }
        if (i == 2) {
            return CreditLine.CreditLineLimitData.Bullet.Icon.DEPOSIT;
        }
        if (i != 3) {
            return null;
        }
        return CreditLine.CreditLineLimitData.Bullet.Icon.BANK;
    }
}

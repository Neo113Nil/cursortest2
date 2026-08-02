package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Order$RecurringSchedule$Frequency$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Order.RecurringSchedule.Frequency.Companion.getClass();
        if (i == 1) {
            return Order.RecurringSchedule.Frequency.EVERY_WEEK;
        }
        if (i == 2) {
            return Order.RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
        }
        if (i == 3) {
            return Order.RecurringSchedule.Frequency.EVERY_MONTH;
        }
        if (i != 4) {
            return null;
        }
        return Order.RecurringSchedule.Frequency.EVERY_DAY;
    }
}

package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CustomerData$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomerData.State.Companion.getClass();
        if (i == 1) {
            return CustomerData.State.OPEN;
        }
        if (i == 2) {
            return CustomerData.State.CLOSED;
        }
        if (i == 3) {
            return CustomerData.State.DENYLISTED;
        }
        if (i != 4) {
            return null;
        }
        return CustomerData.State.SUSPENDED;
    }
}

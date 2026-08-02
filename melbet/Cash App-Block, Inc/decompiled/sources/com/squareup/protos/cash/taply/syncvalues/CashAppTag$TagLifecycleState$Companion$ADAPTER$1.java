package com.squareup.protos.cash.taply.syncvalues;

import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CashAppTag$TagLifecycleState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppTag.TagLifecycleState.Companion.getClass();
        if (i == 0) {
            return CashAppTag.TagLifecycleState.TAG_LIFECYCLE_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppTag.TagLifecycleState.ACTIVE;
        }
        if (i == 2) {
            return CashAppTag.TagLifecycleState.INACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return CashAppTag.TagLifecycleState.PENDING_FIRST_ACTIVATION;
    }
}

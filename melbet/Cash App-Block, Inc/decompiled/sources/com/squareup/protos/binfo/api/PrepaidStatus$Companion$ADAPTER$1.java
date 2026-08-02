package com.squareup.protos.binfo.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PrepaidStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PrepaidStatus.Companion.getClass();
        if (i == 1) {
            return PrepaidStatus.DEFAULT_CATEGORY_DO_NOT_USE;
        }
        if (i == 2) {
            return PrepaidStatus.NOT_PREPAID;
        }
        if (i != 3) {
            return null;
        }
        return PrepaidStatus.PREPAID;
    }
}

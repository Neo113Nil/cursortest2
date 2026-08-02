package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.FindCustomersResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FindCustomersResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FindCustomersResponse.Status.Companion.getClass();
        if (i == 0) {
            return FindCustomersResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return FindCustomersResponse.Status.SUCCESS;
    }
}

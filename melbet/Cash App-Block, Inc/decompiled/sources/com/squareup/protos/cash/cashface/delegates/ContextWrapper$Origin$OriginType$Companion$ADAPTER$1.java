package com.squareup.protos.cash.cashface.delegates;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class ContextWrapper$Origin$OriginType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ContextWrapper.Origin.OriginType.Companion.getClass();
        return WorkCookieJar.m3800fromValue(i);
    }
}

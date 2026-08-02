package com.squareup.protos.cash.cashfavorites.api.v1;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class FavoriteOrigin$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FavoriteOrigin.Companion.getClass();
        return WorkCookieJar.m3801fromValue(i);
    }
}

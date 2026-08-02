package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.SessionScope;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SessionScope$RequestsDecideScopeDetails$ActionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SessionScope.RequestsDecideScopeDetails.ActionType.Companion.getClass();
        if (i == 1) {
            return SessionScope.RequestsDecideScopeDetails.ActionType.ONE_TIME_PAYMENT;
        }
        if (i != 2) {
            return null;
        }
        return SessionScope.RequestsDecideScopeDetails.ActionType.ON_FILE_PAYMENT;
    }
}

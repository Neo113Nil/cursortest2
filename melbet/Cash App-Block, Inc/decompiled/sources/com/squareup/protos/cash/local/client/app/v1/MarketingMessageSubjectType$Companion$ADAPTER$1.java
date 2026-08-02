package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class MarketingMessageSubjectType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MarketingMessageSubjectType.Companion.getClass();
        if (i == 0) {
            return MarketingMessageSubjectType.MARKETING_MESSAGE_SUBJECT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return MarketingMessageSubjectType.MARKETING_MESSAGE_SUBJECT_TYPE_BRAND;
        }
        if (i != 2) {
            return null;
        }
        return MarketingMessageSubjectType.MARKETING_MESSAGE_SUBJECT_TYPE_LOCATION;
    }
}

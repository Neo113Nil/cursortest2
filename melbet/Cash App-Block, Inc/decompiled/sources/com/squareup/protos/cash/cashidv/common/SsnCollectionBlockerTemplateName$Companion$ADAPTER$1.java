package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SsnCollectionBlockerTemplateName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SsnCollectionBlockerTemplateName.Companion.getClass();
        if (i == 0) {
            return SsnCollectionBlockerTemplateName.SSN_COLLECTION_UNSPECIFIED;
        }
        if (i == 1) {
            return SsnCollectionBlockerTemplateName.SSN_COLLECTION_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return SsnCollectionBlockerTemplateName.SSN_COLLECTION_OPTIONAL_ONBOARDING;
    }
}

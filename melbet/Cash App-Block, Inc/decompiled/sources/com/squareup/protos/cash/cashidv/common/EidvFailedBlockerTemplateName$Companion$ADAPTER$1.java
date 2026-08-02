package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EidvFailedBlockerTemplateName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EidvFailedBlockerTemplateName.Companion.getClass();
        if (i == 0) {
            return EidvFailedBlockerTemplateName.EIDV_FAILED_UNSPECIFIED;
        }
        if (i == 1) {
            return EidvFailedBlockerTemplateName.EIDV_FAILED_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return EidvFailedBlockerTemplateName.EIDV_FAILED_OPTIONAL_ONBOARDING;
    }
}

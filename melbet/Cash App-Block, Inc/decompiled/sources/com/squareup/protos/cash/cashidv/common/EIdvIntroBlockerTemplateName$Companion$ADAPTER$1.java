package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EIdvIntroBlockerTemplateName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EIdvIntroBlockerTemplateName.Companion.getClass();
        if (i == 0) {
            return EIdvIntroBlockerTemplateName.EIDV_INTRO_UNSPECIFIED;
        }
        if (i == 1) {
            return EIdvIntroBlockerTemplateName.EIDV_INTRO_DEFAULT;
        }
        if (i == 2) {
            return EIdvIntroBlockerTemplateName.EIDV_INTRO_TEEN_GRADUATION;
        }
        if (i != 3) {
            return null;
        }
        return EIdvIntroBlockerTemplateName.EIDV_INTRO_CONTACT_ALIAS;
    }
}

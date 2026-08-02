package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CategoryRestriction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CategoryRestriction.Companion.getClass();
        if (i == 0) {
            return CategoryRestriction.CATEGORY_RESTRICTION_UNSPECIFIED;
        }
        if (i == 1) {
            return CategoryRestriction.CATEGORY_RESTRICTION_MUST_HAVE_SMS_OR_EMAIL;
        }
        if (i != 2) {
            return null;
        }
        return CategoryRestriction.CATEGORY_RESTRICTION_LOCKED_EMAIL;
    }
}

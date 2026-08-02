package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CategoryRestriction implements WireEnum {
    CATEGORY_RESTRICTION_UNSPECIFIED(0),
    CATEGORY_RESTRICTION_MUST_HAVE_SMS_OR_EMAIL(1),
    CATEGORY_RESTRICTION_LOCKED_EMAIL(2);

    public static final CategoryRestriction$Companion$ADAPTER$1 ADAPTER;
    public static final ContactAliasType.Companion Companion;
    public final int value;

    static {
        CategoryRestriction categoryRestriction = CATEGORY_RESTRICTION_UNSPECIFIED;
        Companion = new ContactAliasType.Companion();
        ADAPTER = new CategoryRestriction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CategoryRestriction.class), Syntax.PROTO_2, categoryRestriction);
    }

    CategoryRestriction(int i) {
        this.value = i;
    }

    public static final CategoryRestriction fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return CATEGORY_RESTRICTION_UNSPECIFIED;
        }
        if (i == 1) {
            return CATEGORY_RESTRICTION_MUST_HAVE_SMS_OR_EMAIL;
        }
        if (i != 2) {
            return null;
        }
        return CATEGORY_RESTRICTION_LOCKED_EMAIL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

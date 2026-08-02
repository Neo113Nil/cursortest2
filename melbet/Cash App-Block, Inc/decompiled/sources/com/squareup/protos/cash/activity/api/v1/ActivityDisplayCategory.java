package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayCategory;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ADC_DEFAULT_DO_NOT_USE", "ADC_BANKING", "ADC_BITCOIN", "ADC_CASH_APP_LOCAL", "ADC_CASH_APP_PAY", "ADC_CASH_CARD", "ADC_CASH_FOR_BUSINESS", "ADC_INVESTING", "ADC_LENDING", "ADC_P2P", "ADC_PAYCHECKS", "ADC_REFERRALS", "ADC_SAVINGS", "ADC_STABLE", "ADC_TRANSFERS", "ADC_USER_ACTIVITY", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityDisplayCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityDisplayCategory[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityDisplayCategory ADC_BANKING;
    public static final ActivityDisplayCategory ADC_BITCOIN;
    public static final ActivityDisplayCategory ADC_CASH_APP_LOCAL;
    public static final ActivityDisplayCategory ADC_CASH_APP_PAY;
    public static final ActivityDisplayCategory ADC_CASH_CARD;
    public static final ActivityDisplayCategory ADC_CASH_FOR_BUSINESS;
    public static final ActivityDisplayCategory ADC_DEFAULT_DO_NOT_USE;
    public static final ActivityDisplayCategory ADC_INVESTING;
    public static final ActivityDisplayCategory ADC_LENDING;
    public static final ActivityDisplayCategory ADC_P2P;
    public static final ActivityDisplayCategory ADC_PAYCHECKS;
    public static final ActivityDisplayCategory ADC_REFERRALS;
    public static final ActivityDisplayCategory ADC_SAVINGS;
    public static final ActivityDisplayCategory ADC_STABLE;
    public static final ActivityDisplayCategory ADC_TRANSFERS;
    public static final ActivityDisplayCategory ADC_USER_ACTIVITY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayCategory$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayCategory;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ActivityDisplayCategory fromValue(int i) {
            switch (i) {
                case 0:
                    return ActivityDisplayCategory.ADC_DEFAULT_DO_NOT_USE;
                case 1:
                    return ActivityDisplayCategory.ADC_BANKING;
                case 2:
                    return ActivityDisplayCategory.ADC_BITCOIN;
                case 3:
                    return ActivityDisplayCategory.ADC_CASH_APP_PAY;
                case 4:
                    return ActivityDisplayCategory.ADC_CASH_CARD;
                case 5:
                    return ActivityDisplayCategory.ADC_CASH_FOR_BUSINESS;
                case 6:
                    return ActivityDisplayCategory.ADC_INVESTING;
                case 7:
                    return ActivityDisplayCategory.ADC_LENDING;
                case 8:
                    return ActivityDisplayCategory.ADC_P2P;
                case 9:
                    return ActivityDisplayCategory.ADC_REFERRALS;
                case 10:
                    return ActivityDisplayCategory.ADC_TRANSFERS;
                case 11:
                    return ActivityDisplayCategory.ADC_USER_ACTIVITY;
                case 12:
                    return ActivityDisplayCategory.ADC_SAVINGS;
                case 13:
                    return ActivityDisplayCategory.ADC_STABLE;
                case 14:
                    return ActivityDisplayCategory.ADC_PAYCHECKS;
                case 15:
                    return ActivityDisplayCategory.ADC_CASH_APP_LOCAL;
                default:
                    return null;
            }
        }
    }

    static {
        ActivityDisplayCategory activityDisplayCategory = new ActivityDisplayCategory("ADC_DEFAULT_DO_NOT_USE", 0, 0);
        ADC_DEFAULT_DO_NOT_USE = activityDisplayCategory;
        ActivityDisplayCategory activityDisplayCategory2 = new ActivityDisplayCategory("ADC_BANKING", 1, 1);
        ADC_BANKING = activityDisplayCategory2;
        ActivityDisplayCategory activityDisplayCategory3 = new ActivityDisplayCategory("ADC_BITCOIN", 2, 2);
        ADC_BITCOIN = activityDisplayCategory3;
        ActivityDisplayCategory activityDisplayCategory4 = new ActivityDisplayCategory("ADC_CASH_APP_LOCAL", 3, 15);
        ADC_CASH_APP_LOCAL = activityDisplayCategory4;
        ActivityDisplayCategory activityDisplayCategory5 = new ActivityDisplayCategory("ADC_CASH_APP_PAY", 4, 3);
        ADC_CASH_APP_PAY = activityDisplayCategory5;
        ActivityDisplayCategory activityDisplayCategory6 = new ActivityDisplayCategory("ADC_CASH_CARD", 5, 4);
        ADC_CASH_CARD = activityDisplayCategory6;
        ActivityDisplayCategory activityDisplayCategory7 = new ActivityDisplayCategory("ADC_CASH_FOR_BUSINESS", 6, 5);
        ADC_CASH_FOR_BUSINESS = activityDisplayCategory7;
        ActivityDisplayCategory activityDisplayCategory8 = new ActivityDisplayCategory("ADC_INVESTING", 7, 6);
        ADC_INVESTING = activityDisplayCategory8;
        ActivityDisplayCategory activityDisplayCategory9 = new ActivityDisplayCategory("ADC_LENDING", 8, 7);
        ADC_LENDING = activityDisplayCategory9;
        ActivityDisplayCategory activityDisplayCategory10 = new ActivityDisplayCategory("ADC_P2P", 9, 8);
        ADC_P2P = activityDisplayCategory10;
        ActivityDisplayCategory activityDisplayCategory11 = new ActivityDisplayCategory("ADC_PAYCHECKS", 10, 14);
        ADC_PAYCHECKS = activityDisplayCategory11;
        ActivityDisplayCategory activityDisplayCategory12 = new ActivityDisplayCategory("ADC_REFERRALS", 11, 9);
        ADC_REFERRALS = activityDisplayCategory12;
        ActivityDisplayCategory activityDisplayCategory13 = new ActivityDisplayCategory("ADC_SAVINGS", 12, 12);
        ADC_SAVINGS = activityDisplayCategory13;
        ActivityDisplayCategory activityDisplayCategory14 = new ActivityDisplayCategory("ADC_STABLE", 13, 13);
        ADC_STABLE = activityDisplayCategory14;
        ActivityDisplayCategory activityDisplayCategory15 = new ActivityDisplayCategory("ADC_TRANSFERS", 14, 10);
        ADC_TRANSFERS = activityDisplayCategory15;
        ActivityDisplayCategory activityDisplayCategory16 = new ActivityDisplayCategory("ADC_USER_ACTIVITY", 15, 11);
        ADC_USER_ACTIVITY = activityDisplayCategory16;
        ActivityDisplayCategory[] activityDisplayCategoryArr = {activityDisplayCategory, activityDisplayCategory2, activityDisplayCategory3, activityDisplayCategory4, activityDisplayCategory5, activityDisplayCategory6, activityDisplayCategory7, activityDisplayCategory8, activityDisplayCategory9, activityDisplayCategory10, activityDisplayCategory11, activityDisplayCategory12, activityDisplayCategory13, activityDisplayCategory14, activityDisplayCategory15, activityDisplayCategory16};
        $VALUES = activityDisplayCategoryArr;
        $ENTRIES = new EnumEntriesList(activityDisplayCategoryArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityDisplayCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityDisplayCategory.class), Syntax.PROTO_2, activityDisplayCategory);
    }

    public ActivityDisplayCategory(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityDisplayCategory fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ActivityDisplayCategory valueOf(String str) {
        return (ActivityDisplayCategory) Enum.valueOf(ActivityDisplayCategory.class, str);
    }

    public static ActivityDisplayCategory[] values() {
        return (ActivityDisplayCategory[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

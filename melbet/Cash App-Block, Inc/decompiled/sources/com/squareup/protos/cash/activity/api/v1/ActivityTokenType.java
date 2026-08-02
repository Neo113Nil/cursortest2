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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityTokenType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ACTIVITY_TOKEN_TYPE_DEFAULT_DO_NOT_USE", "CUSTOMER_TOKEN", "CUSTOMER_TOKEN_SAVINGS_ACCOUNT", "CUSTOMER_TOKEN_PAYCHECKS", "CUSTOMER_TOKEN_CASH_CARD_TRANSACTION", "CUSTOMER_TOKEN_BILLS", "CUSTOMER_TOKEN_BILL_TOKEN", "CUSTOMER_TOKEN_RUNNING_BALANCE_CASH", "CUSTOMER_TOKEN_RUNNING_BALANCE_SAVINGS", "CUSTOMER_TOKEN_ORDERS", "CUSTOMER_TOKEN_LEDGER_REFERENCE", "SAVINGS_FOLDER_TOKEN", "P2P_POOL_TOKEN", "CUSTOMER_TOKEN_TRUST_HUB_PENDING_REVIEW", "CUSTOMER_TOKEN_TRUST_HUB", "CUSTOMER_TOKEN_EARNINGS", "CUSTOMER_TOKEN_EARNINGS_INCOME_STREAM", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityTokenType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityTokenType[] $VALUES;
    public static final ActivityTokenType ACTIVITY_TOKEN_TYPE_DEFAULT_DO_NOT_USE;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityTokenType CUSTOMER_TOKEN;
    public static final ActivityTokenType CUSTOMER_TOKEN_BILLS;
    public static final ActivityTokenType CUSTOMER_TOKEN_BILL_TOKEN;
    public static final ActivityTokenType CUSTOMER_TOKEN_CASH_CARD_TRANSACTION;
    public static final ActivityTokenType CUSTOMER_TOKEN_EARNINGS;
    public static final ActivityTokenType CUSTOMER_TOKEN_EARNINGS_INCOME_STREAM;
    public static final ActivityTokenType CUSTOMER_TOKEN_LEDGER_REFERENCE;
    public static final ActivityTokenType CUSTOMER_TOKEN_ORDERS;
    public static final ActivityTokenType CUSTOMER_TOKEN_PAYCHECKS;
    public static final ActivityTokenType CUSTOMER_TOKEN_RUNNING_BALANCE_CASH;
    public static final ActivityTokenType CUSTOMER_TOKEN_RUNNING_BALANCE_SAVINGS;
    public static final ActivityTokenType CUSTOMER_TOKEN_SAVINGS_ACCOUNT;
    public static final ActivityTokenType CUSTOMER_TOKEN_TRUST_HUB;
    public static final ActivityTokenType CUSTOMER_TOKEN_TRUST_HUB_PENDING_REVIEW;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ActivityTokenType P2P_POOL_TOKEN;
    public static final ActivityTokenType SAVINGS_FOLDER_TOKEN;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityTokenType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityTokenType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ActivityTokenType fromValue(int i) {
            switch (i) {
                case 0:
                    return ActivityTokenType.ACTIVITY_TOKEN_TYPE_DEFAULT_DO_NOT_USE;
                case 1:
                    return ActivityTokenType.CUSTOMER_TOKEN;
                case 2:
                    return ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT;
                case 3:
                    return ActivityTokenType.CUSTOMER_TOKEN_PAYCHECKS;
                case 4:
                    return ActivityTokenType.CUSTOMER_TOKEN_CASH_CARD_TRANSACTION;
                case 5:
                    return ActivityTokenType.CUSTOMER_TOKEN_BILLS;
                case 6:
                    return ActivityTokenType.CUSTOMER_TOKEN_BILL_TOKEN;
                case 7:
                    return ActivityTokenType.CUSTOMER_TOKEN_RUNNING_BALANCE_CASH;
                case 8:
                    return ActivityTokenType.CUSTOMER_TOKEN_RUNNING_BALANCE_SAVINGS;
                case 9:
                    return ActivityTokenType.CUSTOMER_TOKEN_ORDERS;
                case 10:
                    return ActivityTokenType.CUSTOMER_TOKEN_LEDGER_REFERENCE;
                case 11:
                    return ActivityTokenType.SAVINGS_FOLDER_TOKEN;
                case 12:
                    return ActivityTokenType.P2P_POOL_TOKEN;
                case 13:
                    return ActivityTokenType.CUSTOMER_TOKEN_TRUST_HUB_PENDING_REVIEW;
                case 14:
                    return ActivityTokenType.CUSTOMER_TOKEN_TRUST_HUB;
                case 15:
                    return ActivityTokenType.CUSTOMER_TOKEN_EARNINGS;
                case 16:
                    return ActivityTokenType.CUSTOMER_TOKEN_EARNINGS_INCOME_STREAM;
                default:
                    return null;
            }
        }
    }

    static {
        ActivityTokenType activityTokenType = new ActivityTokenType("ACTIVITY_TOKEN_TYPE_DEFAULT_DO_NOT_USE", 0, 0);
        ACTIVITY_TOKEN_TYPE_DEFAULT_DO_NOT_USE = activityTokenType;
        ActivityTokenType activityTokenType2 = new ActivityTokenType("CUSTOMER_TOKEN", 1, 1);
        CUSTOMER_TOKEN = activityTokenType2;
        ActivityTokenType activityTokenType3 = new ActivityTokenType("CUSTOMER_TOKEN_SAVINGS_ACCOUNT", 2, 2);
        CUSTOMER_TOKEN_SAVINGS_ACCOUNT = activityTokenType3;
        ActivityTokenType activityTokenType4 = new ActivityTokenType("CUSTOMER_TOKEN_PAYCHECKS", 3, 3);
        CUSTOMER_TOKEN_PAYCHECKS = activityTokenType4;
        ActivityTokenType activityTokenType5 = new ActivityTokenType("CUSTOMER_TOKEN_CASH_CARD_TRANSACTION", 4, 4);
        CUSTOMER_TOKEN_CASH_CARD_TRANSACTION = activityTokenType5;
        ActivityTokenType activityTokenType6 = new ActivityTokenType("CUSTOMER_TOKEN_BILLS", 5, 5);
        CUSTOMER_TOKEN_BILLS = activityTokenType6;
        ActivityTokenType activityTokenType7 = new ActivityTokenType("CUSTOMER_TOKEN_BILL_TOKEN", 6, 6);
        CUSTOMER_TOKEN_BILL_TOKEN = activityTokenType7;
        ActivityTokenType activityTokenType8 = new ActivityTokenType("CUSTOMER_TOKEN_RUNNING_BALANCE_CASH", 7, 7);
        CUSTOMER_TOKEN_RUNNING_BALANCE_CASH = activityTokenType8;
        ActivityTokenType activityTokenType9 = new ActivityTokenType("CUSTOMER_TOKEN_RUNNING_BALANCE_SAVINGS", 8, 8);
        CUSTOMER_TOKEN_RUNNING_BALANCE_SAVINGS = activityTokenType9;
        ActivityTokenType activityTokenType10 = new ActivityTokenType("CUSTOMER_TOKEN_ORDERS", 9, 9);
        CUSTOMER_TOKEN_ORDERS = activityTokenType10;
        ActivityTokenType activityTokenType11 = new ActivityTokenType("CUSTOMER_TOKEN_LEDGER_REFERENCE", 10, 10);
        CUSTOMER_TOKEN_LEDGER_REFERENCE = activityTokenType11;
        ActivityTokenType activityTokenType12 = new ActivityTokenType("SAVINGS_FOLDER_TOKEN", 11, 11);
        SAVINGS_FOLDER_TOKEN = activityTokenType12;
        ActivityTokenType activityTokenType13 = new ActivityTokenType("P2P_POOL_TOKEN", 12, 12);
        P2P_POOL_TOKEN = activityTokenType13;
        ActivityTokenType activityTokenType14 = new ActivityTokenType("CUSTOMER_TOKEN_TRUST_HUB_PENDING_REVIEW", 13, 13);
        CUSTOMER_TOKEN_TRUST_HUB_PENDING_REVIEW = activityTokenType14;
        ActivityTokenType activityTokenType15 = new ActivityTokenType("CUSTOMER_TOKEN_TRUST_HUB", 14, 14);
        CUSTOMER_TOKEN_TRUST_HUB = activityTokenType15;
        ActivityTokenType activityTokenType16 = new ActivityTokenType("CUSTOMER_TOKEN_EARNINGS", 15, 15);
        CUSTOMER_TOKEN_EARNINGS = activityTokenType16;
        ActivityTokenType activityTokenType17 = new ActivityTokenType("CUSTOMER_TOKEN_EARNINGS_INCOME_STREAM", 16, 16);
        CUSTOMER_TOKEN_EARNINGS_INCOME_STREAM = activityTokenType17;
        ActivityTokenType[] activityTokenTypeArr = {activityTokenType, activityTokenType2, activityTokenType3, activityTokenType4, activityTokenType5, activityTokenType6, activityTokenType7, activityTokenType8, activityTokenType9, activityTokenType10, activityTokenType11, activityTokenType12, activityTokenType13, activityTokenType14, activityTokenType15, activityTokenType16, activityTokenType17};
        $VALUES = activityTokenTypeArr;
        $ENTRIES = new EnumEntriesList(activityTokenTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityTokenType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityTokenType.class), Syntax.PROTO_2, activityTokenType);
    }

    public ActivityTokenType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityTokenType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ActivityTokenType valueOf(String str) {
        return (ActivityTokenType) Enum.valueOf(ActivityTokenType.class, str);
    }

    public static ActivityTokenType[] values() {
        return (ActivityTokenType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

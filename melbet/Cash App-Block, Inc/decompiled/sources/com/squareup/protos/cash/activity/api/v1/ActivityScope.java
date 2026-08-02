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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ACTIVITY_SCOPE_DEFAULT_DO_NOT_USE", "MY_ACTIVITY", "SPONSORED_ACCOUNT", "MY_ACTIVITY_WEB_V2", "THREADS", "CASH_TIES_ADMIN_PROCESSING", "SPENDING_INSIGHTS", "COMPLIANCE", "ACTIVITY_SEARCH_INDEXER", "ACTIVITY_EXPORT", "SUPPORT_TRANSACTION", "NOOP", "C4B_EARNINGS_TRACKER", "FRANKLIN_STATEMENT_POPULATOR", "AFTERPAY_APPLET", "GROW_TOOLS", "GLOBAL_SEARCH", "P2P_POOLS", "WEB_RECEIPTS", "MONEYBOT", "DISCOVER_GLOBAL_SEARCH", "GPT_STORE", "MONEYBOT_SPONSORED_ACCOUNT", "GREEN_BENEFITS", "TRUST_HUB", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityScope implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityScope[] $VALUES;
    public static final ActivityScope ACTIVITY_EXPORT;
    public static final ActivityScope ACTIVITY_SCOPE_DEFAULT_DO_NOT_USE;
    public static final ActivityScope ACTIVITY_SEARCH_INDEXER;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityScope AFTERPAY_APPLET;
    public static final ActivityScope C4B_EARNINGS_TRACKER;
    public static final ActivityScope CASH_TIES_ADMIN_PROCESSING;
    public static final ActivityScope COMPLIANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ActivityScope DISCOVER_GLOBAL_SEARCH;
    public static final ActivityScope FRANKLIN_STATEMENT_POPULATOR;
    public static final ActivityScope GLOBAL_SEARCH;
    public static final ActivityScope GPT_STORE;
    public static final ActivityScope GREEN_BENEFITS;
    public static final ActivityScope GROW_TOOLS;
    public static final ActivityScope MONEYBOT;
    public static final ActivityScope MONEYBOT_SPONSORED_ACCOUNT;
    public static final ActivityScope MY_ACTIVITY;
    public static final ActivityScope MY_ACTIVITY_WEB_V2;
    public static final ActivityScope NOOP;
    public static final ActivityScope P2P_POOLS;
    public static final ActivityScope SPENDING_INSIGHTS;
    public static final ActivityScope SPONSORED_ACCOUNT;
    public static final ActivityScope SUPPORT_TRANSACTION;
    public static final ActivityScope THREADS;
    public static final ActivityScope TRUST_HUB;
    public static final ActivityScope WEB_RECEIPTS;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityScope$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityScope;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ActivityScope fromValue(int i) {
            switch (i) {
                case 0:
                    return ActivityScope.ACTIVITY_SCOPE_DEFAULT_DO_NOT_USE;
                case 1:
                    return ActivityScope.MY_ACTIVITY;
                case 2:
                    return ActivityScope.SPONSORED_ACCOUNT;
                case 3:
                default:
                    return null;
                case 4:
                    return ActivityScope.MY_ACTIVITY_WEB_V2;
                case 5:
                    return ActivityScope.THREADS;
                case 6:
                    return ActivityScope.CASH_TIES_ADMIN_PROCESSING;
                case 7:
                    return ActivityScope.SPENDING_INSIGHTS;
                case 8:
                    return ActivityScope.COMPLIANCE;
                case 9:
                    return ActivityScope.ACTIVITY_SEARCH_INDEXER;
                case 10:
                    return ActivityScope.ACTIVITY_EXPORT;
                case 11:
                    return ActivityScope.SUPPORT_TRANSACTION;
                case 12:
                    return ActivityScope.NOOP;
                case 13:
                    return ActivityScope.C4B_EARNINGS_TRACKER;
                case 14:
                    return ActivityScope.FRANKLIN_STATEMENT_POPULATOR;
                case 15:
                    return ActivityScope.AFTERPAY_APPLET;
                case 16:
                    return ActivityScope.GROW_TOOLS;
                case 17:
                    return ActivityScope.GLOBAL_SEARCH;
                case 18:
                    return ActivityScope.P2P_POOLS;
                case 19:
                    return ActivityScope.WEB_RECEIPTS;
                case 20:
                    return ActivityScope.MONEYBOT;
                case 21:
                    return ActivityScope.DISCOVER_GLOBAL_SEARCH;
                case 22:
                    return ActivityScope.GPT_STORE;
                case 23:
                    return ActivityScope.MONEYBOT_SPONSORED_ACCOUNT;
                case 24:
                    return ActivityScope.GREEN_BENEFITS;
                case 25:
                    return ActivityScope.TRUST_HUB;
            }
        }
    }

    static {
        ActivityScope activityScope = new ActivityScope("ACTIVITY_SCOPE_DEFAULT_DO_NOT_USE", 0, 0);
        ACTIVITY_SCOPE_DEFAULT_DO_NOT_USE = activityScope;
        ActivityScope activityScope2 = new ActivityScope("MY_ACTIVITY", 1, 1);
        MY_ACTIVITY = activityScope2;
        ActivityScope activityScope3 = new ActivityScope("SPONSORED_ACCOUNT", 2, 2);
        SPONSORED_ACCOUNT = activityScope3;
        ActivityScope activityScope4 = new ActivityScope("MY_ACTIVITY_WEB_V2", 3, 4);
        MY_ACTIVITY_WEB_V2 = activityScope4;
        ActivityScope activityScope5 = new ActivityScope("THREADS", 4, 5);
        THREADS = activityScope5;
        ActivityScope activityScope6 = new ActivityScope("CASH_TIES_ADMIN_PROCESSING", 5, 6);
        CASH_TIES_ADMIN_PROCESSING = activityScope6;
        ActivityScope activityScope7 = new ActivityScope("SPENDING_INSIGHTS", 6, 7);
        SPENDING_INSIGHTS = activityScope7;
        ActivityScope activityScope8 = new ActivityScope("COMPLIANCE", 7, 8);
        COMPLIANCE = activityScope8;
        ActivityScope activityScope9 = new ActivityScope("ACTIVITY_SEARCH_INDEXER", 8, 9);
        ACTIVITY_SEARCH_INDEXER = activityScope9;
        ActivityScope activityScope10 = new ActivityScope("ACTIVITY_EXPORT", 9, 10);
        ACTIVITY_EXPORT = activityScope10;
        ActivityScope activityScope11 = new ActivityScope("SUPPORT_TRANSACTION", 10, 11);
        SUPPORT_TRANSACTION = activityScope11;
        ActivityScope activityScope12 = new ActivityScope("NOOP", 11, 12);
        NOOP = activityScope12;
        ActivityScope activityScope13 = new ActivityScope("C4B_EARNINGS_TRACKER", 12, 13);
        C4B_EARNINGS_TRACKER = activityScope13;
        ActivityScope activityScope14 = new ActivityScope("FRANKLIN_STATEMENT_POPULATOR", 13, 14);
        FRANKLIN_STATEMENT_POPULATOR = activityScope14;
        ActivityScope activityScope15 = new ActivityScope("AFTERPAY_APPLET", 14, 15);
        AFTERPAY_APPLET = activityScope15;
        ActivityScope activityScope16 = new ActivityScope("GROW_TOOLS", 15, 16);
        GROW_TOOLS = activityScope16;
        ActivityScope activityScope17 = new ActivityScope("GLOBAL_SEARCH", 16, 17);
        GLOBAL_SEARCH = activityScope17;
        ActivityScope activityScope18 = new ActivityScope("P2P_POOLS", 17, 18);
        P2P_POOLS = activityScope18;
        ActivityScope activityScope19 = new ActivityScope("WEB_RECEIPTS", 18, 19);
        WEB_RECEIPTS = activityScope19;
        ActivityScope activityScope20 = new ActivityScope("MONEYBOT", 19, 20);
        MONEYBOT = activityScope20;
        ActivityScope activityScope21 = new ActivityScope("DISCOVER_GLOBAL_SEARCH", 20, 21);
        DISCOVER_GLOBAL_SEARCH = activityScope21;
        ActivityScope activityScope22 = new ActivityScope("GPT_STORE", 21, 22);
        GPT_STORE = activityScope22;
        ActivityScope activityScope23 = new ActivityScope("MONEYBOT_SPONSORED_ACCOUNT", 22, 23);
        MONEYBOT_SPONSORED_ACCOUNT = activityScope23;
        ActivityScope activityScope24 = new ActivityScope("GREEN_BENEFITS", 23, 24);
        GREEN_BENEFITS = activityScope24;
        ActivityScope activityScope25 = new ActivityScope("TRUST_HUB", 24, 25);
        TRUST_HUB = activityScope25;
        ActivityScope[] activityScopeArr = {activityScope, activityScope2, activityScope3, activityScope4, activityScope5, activityScope6, activityScope7, activityScope8, activityScope9, activityScope10, activityScope11, activityScope12, activityScope13, activityScope14, activityScope15, activityScope16, activityScope17, activityScope18, activityScope19, activityScope20, activityScope21, activityScope22, activityScope23, activityScope24, activityScope25};
        $VALUES = activityScopeArr;
        $ENTRIES = new EnumEntriesList(activityScopeArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityScope$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityScope.class), Syntax.PROTO_2, activityScope);
    }

    public ActivityScope(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityScope fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ActivityScope valueOf(String str) {
        return (ActivityScope) Enum.valueOf(ActivityScope.class, str);
    }

    public static ActivityScope[] values() {
        return (ActivityScope[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

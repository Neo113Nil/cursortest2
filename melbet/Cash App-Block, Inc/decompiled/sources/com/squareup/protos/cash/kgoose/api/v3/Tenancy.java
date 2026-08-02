package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TENANCY_DEFAULT", "TENANCY_MONEYBENCH", "TENANCY_MONEYBOT_SUGGESTIONS", "TENANCY_SHADOW", "TENANCY_MANAGERBOT_TASKS", "TENANCY_PATHFINDER", "TENANCY_MONEYBOT_PRECOMPUTED_SUGGESTIONS", "TENANCY_MANAGERBOT_INSIGHTS", "TENANCY_MONEYBOT_PROMOTER_SUGGESTIONS", "TENANCY_G2", "TENANCY_MONEYBOT_MEMORY_EXTRACTION", "TENANCY_MONEYBOT_MEMORY_EVALUATION", "TENANCY_MONEYBOT_NEXT_BEST_ACTION", "TENANCY_MONEYBOT_SMS", "TENANCY_EXTERNAL", "TENANCY_CASH_ADVOCATE_COPILOT_DEFAULT", "TENANCY_CASH_ADVOCATE_COPILOT_SUGGESTION_PILLS", "TENANCY_CASH_ADVOCATE_BOT_DEFAULT", "TENANCY_MONEYBOT_USER_SUMMARY", "TENANCY_CASHBOT_OFFLINE", "TENANCY_AFTERPAYBOT_OFFLINE", "TENANCY_BUILDERBOT_SLACKBOT", "TENANCY_CUSTOMER_REENGAGEMENT", "TENANCY_MANAGERBOT_MOBILE", "TENANCY_MONEYBOT_PROACTIVE_NOTIFICATION", "TENANCY_MONEYBOT_HOME_PROMPT_REPHRASE", "TENANCY_MANAGERBOT_WIDGET_CREATE", "TENANCY_MONEYBOT_HOME", "TENANCY_MONEYBOT_DEFAULT_FROM_HOME", "TENANCY_MONEYBOT_DEFAULT_FROM_NOTIFICATION", "TENANCY_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT", "TENANCY_MONEYBOT_IN_CHAT_PROMPTS", "TENANCY_MONEYBOT_PRECOMPUTE_NBA", "TENANCY_MANAGERBOT_EVALS", "TENANCY_PQ_BOT_SLACKBOT", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Tenancy implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Tenancy[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Tenancy TENANCY_AFTERPAYBOT_OFFLINE;
    public static final Tenancy TENANCY_BUILDERBOT_SLACKBOT;
    public static final Tenancy TENANCY_CASHBOT_OFFLINE;
    public static final Tenancy TENANCY_CASH_ADVOCATE_BOT_DEFAULT;
    public static final Tenancy TENANCY_CASH_ADVOCATE_COPILOT_DEFAULT;
    public static final Tenancy TENANCY_CASH_ADVOCATE_COPILOT_SUGGESTION_PILLS;
    public static final Tenancy TENANCY_CUSTOMER_REENGAGEMENT;
    public static final Tenancy TENANCY_DEFAULT;
    public static final Tenancy TENANCY_EXTERNAL;
    public static final Tenancy TENANCY_G2;
    public static final Tenancy TENANCY_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT;
    public static final Tenancy TENANCY_MANAGERBOT_EVALS;
    public static final Tenancy TENANCY_MANAGERBOT_INSIGHTS;
    public static final Tenancy TENANCY_MANAGERBOT_MOBILE;
    public static final Tenancy TENANCY_MANAGERBOT_TASKS;
    public static final Tenancy TENANCY_MANAGERBOT_WIDGET_CREATE;
    public static final Tenancy TENANCY_MONEYBENCH;
    public static final Tenancy TENANCY_MONEYBOT_DEFAULT_FROM_HOME;
    public static final Tenancy TENANCY_MONEYBOT_DEFAULT_FROM_NOTIFICATION;
    public static final Tenancy TENANCY_MONEYBOT_HOME;
    public static final Tenancy TENANCY_MONEYBOT_HOME_PROMPT_REPHRASE;
    public static final Tenancy TENANCY_MONEYBOT_IN_CHAT_PROMPTS;
    public static final Tenancy TENANCY_MONEYBOT_MEMORY_EVALUATION;
    public static final Tenancy TENANCY_MONEYBOT_MEMORY_EXTRACTION;
    public static final Tenancy TENANCY_MONEYBOT_NEXT_BEST_ACTION;
    public static final Tenancy TENANCY_MONEYBOT_PRECOMPUTED_SUGGESTIONS;
    public static final Tenancy TENANCY_MONEYBOT_PRECOMPUTE_NBA;
    public static final Tenancy TENANCY_MONEYBOT_PROACTIVE_NOTIFICATION;
    public static final Tenancy TENANCY_MONEYBOT_PROMOTER_SUGGESTIONS;
    public static final Tenancy TENANCY_MONEYBOT_SMS;
    public static final Tenancy TENANCY_MONEYBOT_SUGGESTIONS;
    public static final Tenancy TENANCY_MONEYBOT_USER_SUMMARY;
    public static final Tenancy TENANCY_PATHFINDER;
    public static final Tenancy TENANCY_PQ_BOT_SLACKBOT;
    public static final Tenancy TENANCY_SHADOW;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static Tenancy fromValue(int i) {
            switch (i) {
                case 0:
                    return Tenancy.TENANCY_DEFAULT;
                case 1:
                    return Tenancy.TENANCY_MONEYBENCH;
                case 2:
                    return Tenancy.TENANCY_MONEYBOT_SUGGESTIONS;
                case 3:
                    return Tenancy.TENANCY_SHADOW;
                case 4:
                    return Tenancy.TENANCY_MANAGERBOT_TASKS;
                case 5:
                    return Tenancy.TENANCY_PATHFINDER;
                case 6:
                    return Tenancy.TENANCY_MONEYBOT_PRECOMPUTED_SUGGESTIONS;
                case 7:
                    return Tenancy.TENANCY_MANAGERBOT_INSIGHTS;
                case 8:
                    return Tenancy.TENANCY_MONEYBOT_PROMOTER_SUGGESTIONS;
                case 9:
                    return Tenancy.TENANCY_G2;
                case 10:
                    return Tenancy.TENANCY_MONEYBOT_MEMORY_EXTRACTION;
                case 11:
                    return Tenancy.TENANCY_MONEYBOT_MEMORY_EVALUATION;
                case 12:
                    return Tenancy.TENANCY_MONEYBOT_NEXT_BEST_ACTION;
                case 13:
                    return Tenancy.TENANCY_MONEYBOT_SMS;
                case 14:
                    return Tenancy.TENANCY_EXTERNAL;
                case 15:
                    return Tenancy.TENANCY_CASH_ADVOCATE_COPILOT_DEFAULT;
                case 16:
                    return Tenancy.TENANCY_CASH_ADVOCATE_COPILOT_SUGGESTION_PILLS;
                case 17:
                    return Tenancy.TENANCY_CASH_ADVOCATE_BOT_DEFAULT;
                case 18:
                    return Tenancy.TENANCY_MONEYBOT_USER_SUMMARY;
                case 19:
                    return Tenancy.TENANCY_CASHBOT_OFFLINE;
                case 20:
                    return Tenancy.TENANCY_AFTERPAYBOT_OFFLINE;
                case 21:
                    return Tenancy.TENANCY_BUILDERBOT_SLACKBOT;
                case 22:
                    return Tenancy.TENANCY_CUSTOMER_REENGAGEMENT;
                case 23:
                    return Tenancy.TENANCY_MANAGERBOT_MOBILE;
                case 24:
                    return Tenancy.TENANCY_MONEYBOT_PROACTIVE_NOTIFICATION;
                case 25:
                    return Tenancy.TENANCY_MONEYBOT_HOME_PROMPT_REPHRASE;
                case 26:
                    return Tenancy.TENANCY_MANAGERBOT_WIDGET_CREATE;
                case 27:
                    return Tenancy.TENANCY_MONEYBOT_HOME;
                case 28:
                    return Tenancy.TENANCY_MONEYBOT_DEFAULT_FROM_HOME;
                case 29:
                    return Tenancy.TENANCY_MONEYBOT_DEFAULT_FROM_NOTIFICATION;
                case 30:
                    return Tenancy.TENANCY_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT;
                case 31:
                    return Tenancy.TENANCY_MONEYBOT_IN_CHAT_PROMPTS;
                case 32:
                    return Tenancy.TENANCY_MONEYBOT_PRECOMPUTE_NBA;
                case 33:
                    return Tenancy.TENANCY_MANAGERBOT_EVALS;
                case 34:
                    return Tenancy.TENANCY_PQ_BOT_SLACKBOT;
                default:
                    return null;
            }
        }
    }

    static {
        Tenancy tenancy = new Tenancy("TENANCY_DEFAULT", 0, 0);
        TENANCY_DEFAULT = tenancy;
        Tenancy tenancy2 = new Tenancy("TENANCY_MONEYBENCH", 1, 1);
        TENANCY_MONEYBENCH = tenancy2;
        Tenancy tenancy3 = new Tenancy("TENANCY_MONEYBOT_SUGGESTIONS", 2, 2);
        TENANCY_MONEYBOT_SUGGESTIONS = tenancy3;
        Tenancy tenancy4 = new Tenancy("TENANCY_SHADOW", 3, 3);
        TENANCY_SHADOW = tenancy4;
        Tenancy tenancy5 = new Tenancy("TENANCY_MANAGERBOT_TASKS", 4, 4);
        TENANCY_MANAGERBOT_TASKS = tenancy5;
        Tenancy tenancy6 = new Tenancy("TENANCY_PATHFINDER", 5, 5);
        TENANCY_PATHFINDER = tenancy6;
        Tenancy tenancy7 = new Tenancy("TENANCY_MONEYBOT_PRECOMPUTED_SUGGESTIONS", 6, 6);
        TENANCY_MONEYBOT_PRECOMPUTED_SUGGESTIONS = tenancy7;
        Tenancy tenancy8 = new Tenancy("TENANCY_MANAGERBOT_INSIGHTS", 7, 7);
        TENANCY_MANAGERBOT_INSIGHTS = tenancy8;
        Tenancy tenancy9 = new Tenancy("TENANCY_MONEYBOT_PROMOTER_SUGGESTIONS", 8, 8);
        TENANCY_MONEYBOT_PROMOTER_SUGGESTIONS = tenancy9;
        Tenancy tenancy10 = new Tenancy("TENANCY_G2", 9, 9);
        TENANCY_G2 = tenancy10;
        Tenancy tenancy11 = new Tenancy("TENANCY_MONEYBOT_MEMORY_EXTRACTION", 10, 10);
        TENANCY_MONEYBOT_MEMORY_EXTRACTION = tenancy11;
        Tenancy tenancy12 = new Tenancy("TENANCY_MONEYBOT_MEMORY_EVALUATION", 11, 11);
        TENANCY_MONEYBOT_MEMORY_EVALUATION = tenancy12;
        Tenancy tenancy13 = new Tenancy("TENANCY_MONEYBOT_NEXT_BEST_ACTION", 12, 12);
        TENANCY_MONEYBOT_NEXT_BEST_ACTION = tenancy13;
        Tenancy tenancy14 = new Tenancy("TENANCY_MONEYBOT_SMS", 13, 13);
        TENANCY_MONEYBOT_SMS = tenancy14;
        Tenancy tenancy15 = new Tenancy("TENANCY_EXTERNAL", 14, 14);
        TENANCY_EXTERNAL = tenancy15;
        Tenancy tenancy16 = new Tenancy("TENANCY_CASH_ADVOCATE_COPILOT_DEFAULT", 15, 15);
        TENANCY_CASH_ADVOCATE_COPILOT_DEFAULT = tenancy16;
        Tenancy tenancy17 = new Tenancy("TENANCY_CASH_ADVOCATE_COPILOT_SUGGESTION_PILLS", 16, 16);
        TENANCY_CASH_ADVOCATE_COPILOT_SUGGESTION_PILLS = tenancy17;
        Tenancy tenancy18 = new Tenancy("TENANCY_CASH_ADVOCATE_BOT_DEFAULT", 17, 17);
        TENANCY_CASH_ADVOCATE_BOT_DEFAULT = tenancy18;
        Tenancy tenancy19 = new Tenancy("TENANCY_MONEYBOT_USER_SUMMARY", 18, 18);
        TENANCY_MONEYBOT_USER_SUMMARY = tenancy19;
        Tenancy tenancy20 = new Tenancy("TENANCY_CASHBOT_OFFLINE", 19, 19);
        TENANCY_CASHBOT_OFFLINE = tenancy20;
        Tenancy tenancy21 = new Tenancy("TENANCY_AFTERPAYBOT_OFFLINE", 20, 20);
        TENANCY_AFTERPAYBOT_OFFLINE = tenancy21;
        Tenancy tenancy22 = new Tenancy("TENANCY_BUILDERBOT_SLACKBOT", 21, 21);
        TENANCY_BUILDERBOT_SLACKBOT = tenancy22;
        Tenancy tenancy23 = new Tenancy("TENANCY_CUSTOMER_REENGAGEMENT", 22, 22);
        TENANCY_CUSTOMER_REENGAGEMENT = tenancy23;
        Tenancy tenancy24 = new Tenancy("TENANCY_MANAGERBOT_MOBILE", 23, 23);
        TENANCY_MANAGERBOT_MOBILE = tenancy24;
        Tenancy tenancy25 = new Tenancy("TENANCY_MONEYBOT_PROACTIVE_NOTIFICATION", 24, 24);
        TENANCY_MONEYBOT_PROACTIVE_NOTIFICATION = tenancy25;
        Tenancy tenancy26 = new Tenancy("TENANCY_MONEYBOT_HOME_PROMPT_REPHRASE", 25, 25);
        TENANCY_MONEYBOT_HOME_PROMPT_REPHRASE = tenancy26;
        Tenancy tenancy27 = new Tenancy("TENANCY_MANAGERBOT_WIDGET_CREATE", 26, 26);
        TENANCY_MANAGERBOT_WIDGET_CREATE = tenancy27;
        Tenancy tenancy28 = new Tenancy("TENANCY_MONEYBOT_HOME", 27, 27);
        TENANCY_MONEYBOT_HOME = tenancy28;
        Tenancy tenancy29 = new Tenancy("TENANCY_MONEYBOT_DEFAULT_FROM_HOME", 28, 28);
        TENANCY_MONEYBOT_DEFAULT_FROM_HOME = tenancy29;
        Tenancy tenancy30 = new Tenancy("TENANCY_MONEYBOT_DEFAULT_FROM_NOTIFICATION", 29, 29);
        TENANCY_MONEYBOT_DEFAULT_FROM_NOTIFICATION = tenancy30;
        Tenancy tenancy31 = new Tenancy("TENANCY_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT", 30, 30);
        TENANCY_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT = tenancy31;
        Tenancy tenancy32 = new Tenancy("TENANCY_MONEYBOT_IN_CHAT_PROMPTS", 31, 31);
        TENANCY_MONEYBOT_IN_CHAT_PROMPTS = tenancy32;
        Tenancy tenancy33 = new Tenancy("TENANCY_MONEYBOT_PRECOMPUTE_NBA", 32, 32);
        TENANCY_MONEYBOT_PRECOMPUTE_NBA = tenancy33;
        Tenancy tenancy34 = new Tenancy("TENANCY_MANAGERBOT_EVALS", 33, 33);
        TENANCY_MANAGERBOT_EVALS = tenancy34;
        Tenancy tenancy35 = new Tenancy("TENANCY_PQ_BOT_SLACKBOT", 34, 34);
        TENANCY_PQ_BOT_SLACKBOT = tenancy35;
        Tenancy[] tenancyArr = {tenancy, tenancy2, tenancy3, tenancy4, tenancy5, tenancy6, tenancy7, tenancy8, tenancy9, tenancy10, tenancy11, tenancy12, tenancy13, tenancy14, tenancy15, tenancy16, tenancy17, tenancy18, tenancy19, tenancy20, tenancy21, tenancy22, tenancy23, tenancy24, tenancy25, tenancy26, tenancy27, tenancy28, tenancy29, tenancy30, tenancy31, tenancy32, tenancy33, tenancy34, tenancy35};
        $VALUES = tenancyArr;
        $ENTRIES = new EnumEntriesList(tenancyArr);
        INSTANCE = new Companion();
        ADAPTER = new Tenancy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Tenancy.class), Syntax.PROTO_2, tenancy);
    }

    public Tenancy(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Tenancy fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static Tenancy valueOf(String str) {
        return (Tenancy) Enum.valueOf(Tenancy.class, str);
    }

    public static Tenancy[] values() {
        return (Tenancy[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b=\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?¨\u0006@"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "SOURCE_UNSPECIFIED", "SOURCE_REGULAR_CHAT", "SOURCE_CREATE_TILE", "SOURCE_TILE_FOLLOW_UP_CHAT", "SOURCE_TASK_FORM_SUBMISSION", "SOURCE_CREATE_TILE_FROM_TILE", "SOURCE_CREATE_AUTOMATION", "SOURCE_AUTOMATION_FOLLOW_UP_CHAT", "SOURCE_EDIT_TILE", "SOURCE_EDIT_AUTOMATION", "SOURCE_MONEYBOT_CHAT", "SOURCE_TILE_REFRESH", "SOURCE_LANGFUSE_EXPERIMENT", "SOURCE_CREATE_SPACE_APP", "SOURCE_INSIGHT_FOLLOW_UP_CHAT", "SOURCE_CASHBOT", "SOURCE_PATHFINDER", "SOURCE_CASH_ADVOCATE_COPILOT", "SOURCE_SQUARE_ADVOCATE_COPILOT", "SOURCE_CREATE_TASK_PLAN", "SOURCE_SCRIPT_CONVERSION", "SOURCE_MANAGERBOT_CHAT", "SOURCE_MANAGERBOT_EVERGREEN_METRICS", "SOURCE_MANAGERBOT_EMAILS", "SOURCE_CASHAPP_BUG_REPORTING", "SOURCE_SQUAREBOT", "SOURCE_SALESBOT", "SOURCE_CASH_ADVOCATE_BOT", "SOURCE_APP_SEC_REPORTER", "SOURCE_BUILDERBOT", "SOURCE_CUSTOMER_REENGAGEMENT", "SOURCE_SCHEDULED_TASK", "SOURCE_RISK_DEMO", "SOURCE_CLAUDIUS", "SOURCE_G2_APP", "SOURCE_MANAGERBOT_COACHMARK", "SOURCE_MONEYBOT_DIRECT_EXECUTION", "SOURCE_MANAGERBOT_EDIT_WIDGET", "SOURCE_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT", "SOURCE_MANAGERBOT_SMS", "SOURCE_AFTERPAY_BOT", "SOURCE_GENIE", "SOURCE_FILING_BROKER", "SOURCE_SQ_CRM_KGOOSE", "SOURCE_GIL_JR", "SOURCE_SALES_BRIDGE", "SOURCE_MOSAIC", "SOURCE_NEIGHBORHOODSBOT", "SOURCE_AM_HUB", "SOURCE_QUINN", "SOURCE_SQ_AGENT_TOOLS", "SOURCE_MANAGERBOT_COMPUTER", "SOURCE_PQ_BOT", "SOURCE_SESSIONHUB_DIAGNOSIS", "SOURCE_RISK_MAPPER", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Source implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Source[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Source SOURCE_AFTERPAY_BOT;
    public static final Source SOURCE_AM_HUB;
    public static final Source SOURCE_APP_SEC_REPORTER;
    public static final Source SOURCE_AUTOMATION_FOLLOW_UP_CHAT;
    public static final Source SOURCE_BUILDERBOT;
    public static final Source SOURCE_CASHAPP_BUG_REPORTING;
    public static final Source SOURCE_CASHBOT;
    public static final Source SOURCE_CASH_ADVOCATE_BOT;
    public static final Source SOURCE_CASH_ADVOCATE_COPILOT;
    public static final Source SOURCE_CLAUDIUS;
    public static final Source SOURCE_CREATE_AUTOMATION;
    public static final Source SOURCE_CREATE_SPACE_APP;
    public static final Source SOURCE_CREATE_TASK_PLAN;
    public static final Source SOURCE_CREATE_TILE;
    public static final Source SOURCE_CREATE_TILE_FROM_TILE;
    public static final Source SOURCE_CUSTOMER_REENGAGEMENT;
    public static final Source SOURCE_EDIT_AUTOMATION;
    public static final Source SOURCE_EDIT_TILE;
    public static final Source SOURCE_FILING_BROKER;
    public static final Source SOURCE_G2_APP;
    public static final Source SOURCE_GENIE;
    public static final Source SOURCE_GIL_JR;
    public static final Source SOURCE_INSIGHT_FOLLOW_UP_CHAT;
    public static final Source SOURCE_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT;
    public static final Source SOURCE_LANGFUSE_EXPERIMENT;
    public static final Source SOURCE_MANAGERBOT_CHAT;
    public static final Source SOURCE_MANAGERBOT_COACHMARK;
    public static final Source SOURCE_MANAGERBOT_COMPUTER;
    public static final Source SOURCE_MANAGERBOT_EDIT_WIDGET;
    public static final Source SOURCE_MANAGERBOT_EMAILS;
    public static final Source SOURCE_MANAGERBOT_EVERGREEN_METRICS;
    public static final Source SOURCE_MANAGERBOT_SMS;
    public static final Source SOURCE_MONEYBOT_CHAT;
    public static final Source SOURCE_MONEYBOT_DIRECT_EXECUTION;
    public static final Source SOURCE_MOSAIC;
    public static final Source SOURCE_NEIGHBORHOODSBOT;
    public static final Source SOURCE_PATHFINDER;
    public static final Source SOURCE_PQ_BOT;
    public static final Source SOURCE_QUINN;
    public static final Source SOURCE_REGULAR_CHAT;
    public static final Source SOURCE_RISK_DEMO;
    public static final Source SOURCE_RISK_MAPPER;
    public static final Source SOURCE_SALESBOT;
    public static final Source SOURCE_SALES_BRIDGE;
    public static final Source SOURCE_SCHEDULED_TASK;
    public static final Source SOURCE_SCRIPT_CONVERSION;
    public static final Source SOURCE_SESSIONHUB_DIAGNOSIS;
    public static final Source SOURCE_SQUAREBOT;
    public static final Source SOURCE_SQUARE_ADVOCATE_COPILOT;
    public static final Source SOURCE_SQ_AGENT_TOOLS;
    public static final Source SOURCE_SQ_CRM_KGOOSE;
    public static final Source SOURCE_TASK_FORM_SUBMISSION;
    public static final Source SOURCE_TILE_FOLLOW_UP_CHAT;
    public static final Source SOURCE_TILE_REFRESH;
    public static final Source SOURCE_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Source$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static Source fromValue(int i) {
            switch (i) {
                case 0:
                    return Source.SOURCE_UNSPECIFIED;
                case 1:
                    return Source.SOURCE_REGULAR_CHAT;
                case 2:
                    return Source.SOURCE_CREATE_TILE;
                case 3:
                    return Source.SOURCE_TILE_FOLLOW_UP_CHAT;
                case 4:
                    return Source.SOURCE_TASK_FORM_SUBMISSION;
                case 5:
                    return Source.SOURCE_CREATE_TILE_FROM_TILE;
                case 6:
                    return Source.SOURCE_CREATE_AUTOMATION;
                case 7:
                    return Source.SOURCE_AUTOMATION_FOLLOW_UP_CHAT;
                case 8:
                    return Source.SOURCE_EDIT_TILE;
                case 9:
                    return Source.SOURCE_EDIT_AUTOMATION;
                case 10:
                    return Source.SOURCE_MONEYBOT_CHAT;
                case 11:
                    return Source.SOURCE_TILE_REFRESH;
                case 12:
                    return Source.SOURCE_LANGFUSE_EXPERIMENT;
                case 13:
                    return Source.SOURCE_CREATE_SPACE_APP;
                case 14:
                    return Source.SOURCE_INSIGHT_FOLLOW_UP_CHAT;
                case 15:
                    return Source.SOURCE_CASHBOT;
                case 16:
                    return Source.SOURCE_PATHFINDER;
                case 17:
                    return Source.SOURCE_CASH_ADVOCATE_COPILOT;
                case 18:
                    return Source.SOURCE_SQUARE_ADVOCATE_COPILOT;
                case 19:
                    return Source.SOURCE_CREATE_TASK_PLAN;
                case 20:
                    return Source.SOURCE_SCRIPT_CONVERSION;
                case 21:
                    return Source.SOURCE_MANAGERBOT_CHAT;
                case 22:
                    return Source.SOURCE_MANAGERBOT_EVERGREEN_METRICS;
                case 23:
                    return Source.SOURCE_MANAGERBOT_EMAILS;
                case 24:
                    return Source.SOURCE_CASHAPP_BUG_REPORTING;
                case 25:
                    return Source.SOURCE_SQUAREBOT;
                case 26:
                    return Source.SOURCE_SALESBOT;
                case 27:
                    return Source.SOURCE_CASH_ADVOCATE_BOT;
                case 28:
                    return Source.SOURCE_APP_SEC_REPORTER;
                case 29:
                    return Source.SOURCE_BUILDERBOT;
                case 30:
                    return Source.SOURCE_CUSTOMER_REENGAGEMENT;
                case 31:
                    return Source.SOURCE_SCHEDULED_TASK;
                case 32:
                    return Source.SOURCE_RISK_DEMO;
                case 33:
                    return Source.SOURCE_CLAUDIUS;
                case 34:
                    return Source.SOURCE_G2_APP;
                case 35:
                    return Source.SOURCE_MANAGERBOT_COACHMARK;
                case 36:
                    return Source.SOURCE_MONEYBOT_DIRECT_EXECUTION;
                case 37:
                    return Source.SOURCE_MANAGERBOT_EDIT_WIDGET;
                case 38:
                    return Source.SOURCE_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT;
                case 39:
                    return Source.SOURCE_MANAGERBOT_SMS;
                case 40:
                    return Source.SOURCE_AFTERPAY_BOT;
                case 41:
                    return Source.SOURCE_GENIE;
                case 42:
                    return Source.SOURCE_FILING_BROKER;
                case 43:
                    return Source.SOURCE_SQ_CRM_KGOOSE;
                case 44:
                    return Source.SOURCE_GIL_JR;
                case 45:
                    return Source.SOURCE_SALES_BRIDGE;
                case 46:
                    return Source.SOURCE_MOSAIC;
                case 47:
                    return Source.SOURCE_NEIGHBORHOODSBOT;
                case 48:
                    return Source.SOURCE_AM_HUB;
                case 49:
                    return Source.SOURCE_QUINN;
                case 50:
                    return Source.SOURCE_SQ_AGENT_TOOLS;
                case 51:
                    return Source.SOURCE_MANAGERBOT_COMPUTER;
                case 52:
                    return Source.SOURCE_PQ_BOT;
                case 53:
                    return Source.SOURCE_SESSIONHUB_DIAGNOSIS;
                case 54:
                    return Source.SOURCE_RISK_MAPPER;
                default:
                    return null;
            }
        }
    }

    static {
        Source source = new Source("SOURCE_UNSPECIFIED", 0, 0);
        SOURCE_UNSPECIFIED = source;
        Source source2 = new Source("SOURCE_REGULAR_CHAT", 1, 1);
        SOURCE_REGULAR_CHAT = source2;
        Source source3 = new Source("SOURCE_CREATE_TILE", 2, 2);
        SOURCE_CREATE_TILE = source3;
        Source source4 = new Source("SOURCE_TILE_FOLLOW_UP_CHAT", 3, 3);
        SOURCE_TILE_FOLLOW_UP_CHAT = source4;
        Source source5 = new Source("SOURCE_TASK_FORM_SUBMISSION", 4, 4);
        SOURCE_TASK_FORM_SUBMISSION = source5;
        Source source6 = new Source("SOURCE_CREATE_TILE_FROM_TILE", 5, 5);
        SOURCE_CREATE_TILE_FROM_TILE = source6;
        Source source7 = new Source("SOURCE_CREATE_AUTOMATION", 6, 6);
        SOURCE_CREATE_AUTOMATION = source7;
        Source source8 = new Source("SOURCE_AUTOMATION_FOLLOW_UP_CHAT", 7, 7);
        SOURCE_AUTOMATION_FOLLOW_UP_CHAT = source8;
        Source source9 = new Source("SOURCE_EDIT_TILE", 8, 8);
        SOURCE_EDIT_TILE = source9;
        Source source10 = new Source("SOURCE_EDIT_AUTOMATION", 9, 9);
        SOURCE_EDIT_AUTOMATION = source10;
        Source source11 = new Source("SOURCE_MONEYBOT_CHAT", 10, 10);
        SOURCE_MONEYBOT_CHAT = source11;
        Source source12 = new Source("SOURCE_TILE_REFRESH", 11, 11);
        SOURCE_TILE_REFRESH = source12;
        Source source13 = new Source("SOURCE_LANGFUSE_EXPERIMENT", 12, 12);
        SOURCE_LANGFUSE_EXPERIMENT = source13;
        Source source14 = new Source("SOURCE_CREATE_SPACE_APP", 13, 13);
        SOURCE_CREATE_SPACE_APP = source14;
        Source source15 = new Source("SOURCE_INSIGHT_FOLLOW_UP_CHAT", 14, 14);
        SOURCE_INSIGHT_FOLLOW_UP_CHAT = source15;
        Source source16 = new Source("SOURCE_CASHBOT", 15, 15);
        SOURCE_CASHBOT = source16;
        Source source17 = new Source("SOURCE_PATHFINDER", 16, 16);
        SOURCE_PATHFINDER = source17;
        Source source18 = new Source("SOURCE_CASH_ADVOCATE_COPILOT", 17, 17);
        SOURCE_CASH_ADVOCATE_COPILOT = source18;
        Source source19 = new Source("SOURCE_SQUARE_ADVOCATE_COPILOT", 18, 18);
        SOURCE_SQUARE_ADVOCATE_COPILOT = source19;
        Source source20 = new Source("SOURCE_CREATE_TASK_PLAN", 19, 19);
        SOURCE_CREATE_TASK_PLAN = source20;
        Source source21 = new Source("SOURCE_SCRIPT_CONVERSION", 20, 20);
        SOURCE_SCRIPT_CONVERSION = source21;
        Source source22 = new Source("SOURCE_MANAGERBOT_CHAT", 21, 21);
        SOURCE_MANAGERBOT_CHAT = source22;
        Source source23 = new Source("SOURCE_MANAGERBOT_EVERGREEN_METRICS", 22, 22);
        SOURCE_MANAGERBOT_EVERGREEN_METRICS = source23;
        Source source24 = new Source("SOURCE_MANAGERBOT_EMAILS", 23, 23);
        SOURCE_MANAGERBOT_EMAILS = source24;
        Source source25 = new Source("SOURCE_CASHAPP_BUG_REPORTING", 24, 24);
        SOURCE_CASHAPP_BUG_REPORTING = source25;
        Source source26 = new Source("SOURCE_SQUAREBOT", 25, 25);
        SOURCE_SQUAREBOT = source26;
        Source source27 = new Source("SOURCE_SALESBOT", 26, 26);
        SOURCE_SALESBOT = source27;
        Source source28 = new Source("SOURCE_CASH_ADVOCATE_BOT", 27, 27);
        SOURCE_CASH_ADVOCATE_BOT = source28;
        Source source29 = new Source("SOURCE_APP_SEC_REPORTER", 28, 28);
        SOURCE_APP_SEC_REPORTER = source29;
        Source source30 = new Source("SOURCE_BUILDERBOT", 29, 29);
        SOURCE_BUILDERBOT = source30;
        Source source31 = new Source("SOURCE_CUSTOMER_REENGAGEMENT", 30, 30);
        SOURCE_CUSTOMER_REENGAGEMENT = source31;
        Source source32 = new Source("SOURCE_SCHEDULED_TASK", 31, 31);
        SOURCE_SCHEDULED_TASK = source32;
        Source source33 = new Source("SOURCE_RISK_DEMO", 32, 32);
        SOURCE_RISK_DEMO = source33;
        Source source34 = new Source("SOURCE_CLAUDIUS", 33, 33);
        SOURCE_CLAUDIUS = source34;
        Source source35 = new Source("SOURCE_G2_APP", 34, 34);
        SOURCE_G2_APP = source35;
        Source source36 = new Source("SOURCE_MANAGERBOT_COACHMARK", 35, 35);
        SOURCE_MANAGERBOT_COACHMARK = source36;
        Source source37 = new Source("SOURCE_MONEYBOT_DIRECT_EXECUTION", 36, 36);
        SOURCE_MONEYBOT_DIRECT_EXECUTION = source37;
        Source source38 = new Source("SOURCE_MANAGERBOT_EDIT_WIDGET", 37, 37);
        SOURCE_MANAGERBOT_EDIT_WIDGET = source38;
        Source source39 = new Source("SOURCE_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT", 38, 38);
        SOURCE_KGOOSE_TOOL_CALL_ENDPOINTS_DEFAULT = source39;
        Source source40 = new Source("SOURCE_MANAGERBOT_SMS", 39, 39);
        SOURCE_MANAGERBOT_SMS = source40;
        Source source41 = new Source("SOURCE_AFTERPAY_BOT", 40, 40);
        SOURCE_AFTERPAY_BOT = source41;
        Source source42 = new Source("SOURCE_GENIE", 41, 41);
        SOURCE_GENIE = source42;
        Source source43 = new Source("SOURCE_FILING_BROKER", 42, 42);
        SOURCE_FILING_BROKER = source43;
        Source source44 = new Source("SOURCE_SQ_CRM_KGOOSE", 43, 43);
        SOURCE_SQ_CRM_KGOOSE = source44;
        Source source45 = new Source("SOURCE_GIL_JR", 44, 44);
        SOURCE_GIL_JR = source45;
        Source source46 = new Source("SOURCE_SALES_BRIDGE", 45, 45);
        SOURCE_SALES_BRIDGE = source46;
        Source source47 = new Source("SOURCE_MOSAIC", 46, 46);
        SOURCE_MOSAIC = source47;
        Source source48 = new Source("SOURCE_NEIGHBORHOODSBOT", 47, 47);
        SOURCE_NEIGHBORHOODSBOT = source48;
        Source source49 = new Source("SOURCE_AM_HUB", 48, 48);
        SOURCE_AM_HUB = source49;
        Source source50 = new Source("SOURCE_QUINN", 49, 49);
        SOURCE_QUINN = source50;
        Source source51 = new Source("SOURCE_SQ_AGENT_TOOLS", 50, 50);
        SOURCE_SQ_AGENT_TOOLS = source51;
        Source source52 = new Source("SOURCE_MANAGERBOT_COMPUTER", 51, 51);
        SOURCE_MANAGERBOT_COMPUTER = source52;
        Source source53 = new Source("SOURCE_PQ_BOT", 52, 52);
        SOURCE_PQ_BOT = source53;
        Source source54 = new Source("SOURCE_SESSIONHUB_DIAGNOSIS", 53, 53);
        SOURCE_SESSIONHUB_DIAGNOSIS = source54;
        Source source55 = new Source("SOURCE_RISK_MAPPER", 54, 54);
        SOURCE_RISK_MAPPER = source55;
        Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9, source10, source11, source12, source13, source14, source15, source16, source17, source18, source19, source20, source21, source22, source23, source24, source25, source26, source27, source28, source29, source30, source31, source32, source33, source34, source35, source36, source37, source38, source39, source40, source41, source42, source43, source44, source45, source46, source47, source48, source49, source50, source51, source52, source53, source54, source55};
        $VALUES = sourceArr;
        $ENTRIES = new EnumEntriesList(sourceArr);
        INSTANCE = new Companion();
        ADAPTER = new Source$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Source.class), Syntax.PROTO_2, source);
    }

    public Source(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Source fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

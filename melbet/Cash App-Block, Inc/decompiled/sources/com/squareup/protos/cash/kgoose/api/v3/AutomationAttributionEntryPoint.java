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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionEntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "AUTOMATION_ATTRIBUTION_ENTRY_POINT_UNSPECIFIED", "AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_DIRECT_USER_REQUEST", "AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_SUGGESTION", "AUTOMATION_ATTRIBUTION_ENTRY_POINT_AUTOMATIONS_PAGE", "AUTOMATION_ATTRIBUTION_ENTRY_POINT_DIRECT_URL", "AUTOMATION_ATTRIBUTION_ENTRY_POINT_SCHEDULED_REPORT_PAGE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutomationAttributionEntryPoint implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutomationAttributionEntryPoint[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final AutomationAttributionEntryPoint AUTOMATION_ATTRIBUTION_ENTRY_POINT_AUTOMATIONS_PAGE;
    public static final AutomationAttributionEntryPoint AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_DIRECT_USER_REQUEST;
    public static final AutomationAttributionEntryPoint AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_SUGGESTION;
    public static final AutomationAttributionEntryPoint AUTOMATION_ATTRIBUTION_ENTRY_POINT_DIRECT_URL;
    public static final AutomationAttributionEntryPoint AUTOMATION_ATTRIBUTION_ENTRY_POINT_SCHEDULED_REPORT_PAGE;
    public static final AutomationAttributionEntryPoint AUTOMATION_ATTRIBUTION_ENTRY_POINT_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionEntryPoint$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionEntryPoint;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static AutomationAttributionEntryPoint fromValue(int i) {
            if (i == 0) {
                return AutomationAttributionEntryPoint.AUTOMATION_ATTRIBUTION_ENTRY_POINT_UNSPECIFIED;
            }
            if (i == 1) {
                return AutomationAttributionEntryPoint.AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_DIRECT_USER_REQUEST;
            }
            if (i == 2) {
                return AutomationAttributionEntryPoint.AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_SUGGESTION;
            }
            if (i == 3) {
                return AutomationAttributionEntryPoint.AUTOMATION_ATTRIBUTION_ENTRY_POINT_AUTOMATIONS_PAGE;
            }
            if (i == 4) {
                return AutomationAttributionEntryPoint.AUTOMATION_ATTRIBUTION_ENTRY_POINT_DIRECT_URL;
            }
            if (i != 5) {
                return null;
            }
            return AutomationAttributionEntryPoint.AUTOMATION_ATTRIBUTION_ENTRY_POINT_SCHEDULED_REPORT_PAGE;
        }
    }

    static {
        AutomationAttributionEntryPoint automationAttributionEntryPoint = new AutomationAttributionEntryPoint("AUTOMATION_ATTRIBUTION_ENTRY_POINT_UNSPECIFIED", 0, 0);
        AUTOMATION_ATTRIBUTION_ENTRY_POINT_UNSPECIFIED = automationAttributionEntryPoint;
        AutomationAttributionEntryPoint automationAttributionEntryPoint2 = new AutomationAttributionEntryPoint("AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_DIRECT_USER_REQUEST", 1, 1);
        AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_DIRECT_USER_REQUEST = automationAttributionEntryPoint2;
        AutomationAttributionEntryPoint automationAttributionEntryPoint3 = new AutomationAttributionEntryPoint("AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_SUGGESTION", 2, 2);
        AUTOMATION_ATTRIBUTION_ENTRY_POINT_CHAT_SUGGESTION = automationAttributionEntryPoint3;
        AutomationAttributionEntryPoint automationAttributionEntryPoint4 = new AutomationAttributionEntryPoint("AUTOMATION_ATTRIBUTION_ENTRY_POINT_AUTOMATIONS_PAGE", 3, 3);
        AUTOMATION_ATTRIBUTION_ENTRY_POINT_AUTOMATIONS_PAGE = automationAttributionEntryPoint4;
        AutomationAttributionEntryPoint automationAttributionEntryPoint5 = new AutomationAttributionEntryPoint("AUTOMATION_ATTRIBUTION_ENTRY_POINT_DIRECT_URL", 4, 4);
        AUTOMATION_ATTRIBUTION_ENTRY_POINT_DIRECT_URL = automationAttributionEntryPoint5;
        AutomationAttributionEntryPoint automationAttributionEntryPoint6 = new AutomationAttributionEntryPoint("AUTOMATION_ATTRIBUTION_ENTRY_POINT_SCHEDULED_REPORT_PAGE", 5, 5);
        AUTOMATION_ATTRIBUTION_ENTRY_POINT_SCHEDULED_REPORT_PAGE = automationAttributionEntryPoint6;
        AutomationAttributionEntryPoint[] automationAttributionEntryPointArr = {automationAttributionEntryPoint, automationAttributionEntryPoint2, automationAttributionEntryPoint3, automationAttributionEntryPoint4, automationAttributionEntryPoint5, automationAttributionEntryPoint6};
        $VALUES = automationAttributionEntryPointArr;
        $ENTRIES = new EnumEntriesList(automationAttributionEntryPointArr);
        INSTANCE = new Companion();
        ADAPTER = new AutomationAttributionEntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AutomationAttributionEntryPoint.class), Syntax.PROTO_2, automationAttributionEntryPoint);
    }

    public AutomationAttributionEntryPoint(String str, int i, int i2) {
        this.value = i2;
    }

    public static final AutomationAttributionEntryPoint fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static AutomationAttributionEntryPoint valueOf(String str) {
        return (AutomationAttributionEntryPoint) Enum.valueOf(AutomationAttributionEntryPoint.class, str);
    }

    public static AutomationAttributionEntryPoint[] values() {
        return (AutomationAttributionEntryPoint[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

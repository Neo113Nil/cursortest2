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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRunStatus;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TRIGGERED_ACTION_RUN_STATUS_UNSPECIFIED", "TRIGGERED_ACTION_RUN_STATUS_PENDING", "TRIGGERED_ACTION_RUN_STATUS_RUNNING", "TRIGGERED_ACTION_RUN_STATUS_SUCCESS", "TRIGGERED_ACTION_RUN_STATUS_FAILED", "TRIGGERED_ACTION_RUN_STATUS_CLIENT_INPUT_PENDING", "TRIGGERED_ACTION_RUN_STATUS_SKIPPED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionRunStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TriggeredActionRunStatus[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_CLIENT_INPUT_PENDING;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_FAILED;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_PENDING;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_RUNNING;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_SKIPPED;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_SUCCESS;
    public static final TriggeredActionRunStatus TRIGGERED_ACTION_RUN_STATUS_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRunStatus$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRunStatus;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        TriggeredActionRunStatus triggeredActionRunStatus = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_UNSPECIFIED", 0, 1);
        TRIGGERED_ACTION_RUN_STATUS_UNSPECIFIED = triggeredActionRunStatus;
        TriggeredActionRunStatus triggeredActionRunStatus2 = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_PENDING", 1, 2);
        TRIGGERED_ACTION_RUN_STATUS_PENDING = triggeredActionRunStatus2;
        TriggeredActionRunStatus triggeredActionRunStatus3 = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_RUNNING", 2, 3);
        TRIGGERED_ACTION_RUN_STATUS_RUNNING = triggeredActionRunStatus3;
        TriggeredActionRunStatus triggeredActionRunStatus4 = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_SUCCESS", 3, 4);
        TRIGGERED_ACTION_RUN_STATUS_SUCCESS = triggeredActionRunStatus4;
        TriggeredActionRunStatus triggeredActionRunStatus5 = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_FAILED", 4, 5);
        TRIGGERED_ACTION_RUN_STATUS_FAILED = triggeredActionRunStatus5;
        TriggeredActionRunStatus triggeredActionRunStatus6 = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_CLIENT_INPUT_PENDING", 5, 6);
        TRIGGERED_ACTION_RUN_STATUS_CLIENT_INPUT_PENDING = triggeredActionRunStatus6;
        TriggeredActionRunStatus triggeredActionRunStatus7 = new TriggeredActionRunStatus("TRIGGERED_ACTION_RUN_STATUS_SKIPPED", 6, 7);
        TRIGGERED_ACTION_RUN_STATUS_SKIPPED = triggeredActionRunStatus7;
        TriggeredActionRunStatus[] triggeredActionRunStatusArr = {triggeredActionRunStatus, triggeredActionRunStatus2, triggeredActionRunStatus3, triggeredActionRunStatus4, triggeredActionRunStatus5, triggeredActionRunStatus6, triggeredActionRunStatus7};
        $VALUES = triggeredActionRunStatusArr;
        $ENTRIES = new EnumEntriesList(triggeredActionRunStatusArr);
        INSTANCE = new Companion();
        ADAPTER = new TriggeredActionRunStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TriggeredActionRunStatus.class), Syntax.PROTO_2, null);
    }

    public TriggeredActionRunStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TriggeredActionRunStatus fromValue(int i) {
        INSTANCE.getClass();
        switch (i) {
            case 1:
                return TRIGGERED_ACTION_RUN_STATUS_UNSPECIFIED;
            case 2:
                return TRIGGERED_ACTION_RUN_STATUS_PENDING;
            case 3:
                return TRIGGERED_ACTION_RUN_STATUS_RUNNING;
            case 4:
                return TRIGGERED_ACTION_RUN_STATUS_SUCCESS;
            case 5:
                return TRIGGERED_ACTION_RUN_STATUS_FAILED;
            case 6:
                return TRIGGERED_ACTION_RUN_STATUS_CLIENT_INPUT_PENDING;
            case 7:
                return TRIGGERED_ACTION_RUN_STATUS_SKIPPED;
            default:
                return null;
        }
    }

    public static TriggeredActionRunStatus valueOf(String str) {
        return (TriggeredActionRunStatus) Enum.valueOf(TriggeredActionRunStatus.class, str);
    }

    public static TriggeredActionRunStatus[] values() {
        return (TriggeredActionRunStatus[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

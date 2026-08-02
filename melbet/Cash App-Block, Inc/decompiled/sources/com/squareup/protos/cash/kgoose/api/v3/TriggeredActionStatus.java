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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TRIGGERED_ACTION_STATUS_UNSPECIFIED", "TRIGGERED_ACTION_STATUS_ACTIVE", "TRIGGERED_ACTION_STATUS_PAUSED", "TRIGGERED_ACTION_STATUS_INACTIVE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TriggeredActionStatus[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TriggeredActionStatus TRIGGERED_ACTION_STATUS_ACTIVE;
    public static final TriggeredActionStatus TRIGGERED_ACTION_STATUS_INACTIVE;
    public static final TriggeredActionStatus TRIGGERED_ACTION_STATUS_PAUSED;
    public static final TriggeredActionStatus TRIGGERED_ACTION_STATUS_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        TriggeredActionStatus triggeredActionStatus = new TriggeredActionStatus("TRIGGERED_ACTION_STATUS_UNSPECIFIED", 0, 1);
        TRIGGERED_ACTION_STATUS_UNSPECIFIED = triggeredActionStatus;
        TriggeredActionStatus triggeredActionStatus2 = new TriggeredActionStatus("TRIGGERED_ACTION_STATUS_ACTIVE", 1, 2);
        TRIGGERED_ACTION_STATUS_ACTIVE = triggeredActionStatus2;
        TriggeredActionStatus triggeredActionStatus3 = new TriggeredActionStatus("TRIGGERED_ACTION_STATUS_PAUSED", 2, 3);
        TRIGGERED_ACTION_STATUS_PAUSED = triggeredActionStatus3;
        TriggeredActionStatus triggeredActionStatus4 = new TriggeredActionStatus("TRIGGERED_ACTION_STATUS_INACTIVE", 3, 4);
        TRIGGERED_ACTION_STATUS_INACTIVE = triggeredActionStatus4;
        TriggeredActionStatus[] triggeredActionStatusArr = {triggeredActionStatus, triggeredActionStatus2, triggeredActionStatus3, triggeredActionStatus4};
        $VALUES = triggeredActionStatusArr;
        $ENTRIES = new EnumEntriesList(triggeredActionStatusArr);
        INSTANCE = new Companion();
        ADAPTER = new TriggeredActionStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TriggeredActionStatus.class), Syntax.PROTO_2, null);
    }

    public TriggeredActionStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TriggeredActionStatus fromValue(int i) {
        INSTANCE.getClass();
        if (i == 1) {
            return TRIGGERED_ACTION_STATUS_UNSPECIFIED;
        }
        if (i == 2) {
            return TRIGGERED_ACTION_STATUS_ACTIVE;
        }
        if (i == 3) {
            return TRIGGERED_ACTION_STATUS_PAUSED;
        }
        if (i != 4) {
            return null;
        }
        return TRIGGERED_ACTION_STATUS_INACTIVE;
    }

    public static TriggeredActionStatus valueOf(String str) {
        return (TriggeredActionStatus) Enum.valueOf(TriggeredActionStatus.class, str);
    }

    public static TriggeredActionStatus[] values() {
        return (TriggeredActionStatus[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

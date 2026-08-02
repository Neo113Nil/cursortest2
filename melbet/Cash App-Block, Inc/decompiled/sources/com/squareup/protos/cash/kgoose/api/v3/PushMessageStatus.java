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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PushMessageStatus;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "PUSH_MESSAGE_STATUS_DO_NOT_USE", "PUSH_MESSAGE_STATUS_FAILED_BUSY_PROCESSING", "PUSH_MESSAGE_STATUS_SUBMITTED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushMessageStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PushMessageStatus[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PushMessageStatus PUSH_MESSAGE_STATUS_DO_NOT_USE;
    public static final PushMessageStatus PUSH_MESSAGE_STATUS_FAILED_BUSY_PROCESSING;
    public static final PushMessageStatus PUSH_MESSAGE_STATUS_SUBMITTED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PushMessageStatus$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessageStatus;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        PushMessageStatus pushMessageStatus = new PushMessageStatus("PUSH_MESSAGE_STATUS_DO_NOT_USE", 0, 0);
        PUSH_MESSAGE_STATUS_DO_NOT_USE = pushMessageStatus;
        PushMessageStatus pushMessageStatus2 = new PushMessageStatus("PUSH_MESSAGE_STATUS_FAILED_BUSY_PROCESSING", 1, 1);
        PUSH_MESSAGE_STATUS_FAILED_BUSY_PROCESSING = pushMessageStatus2;
        PushMessageStatus pushMessageStatus3 = new PushMessageStatus("PUSH_MESSAGE_STATUS_SUBMITTED", 2, 2);
        PUSH_MESSAGE_STATUS_SUBMITTED = pushMessageStatus3;
        PushMessageStatus[] pushMessageStatusArr = {pushMessageStatus, pushMessageStatus2, pushMessageStatus3};
        $VALUES = pushMessageStatusArr;
        $ENTRIES = new EnumEntriesList(pushMessageStatusArr);
        INSTANCE = new Companion();
        ADAPTER = new PushMessageStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PushMessageStatus.class), Syntax.PROTO_2, pushMessageStatus);
    }

    public PushMessageStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static final PushMessageStatus fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return PUSH_MESSAGE_STATUS_DO_NOT_USE;
        }
        if (i == 1) {
            return PUSH_MESSAGE_STATUS_FAILED_BUSY_PROCESSING;
        }
        if (i != 2) {
            return null;
        }
        return PUSH_MESSAGE_STATUS_SUBMITTED;
    }

    public static PushMessageStatus valueOf(String str) {
        return (PushMessageStatus) Enum.valueOf(PushMessageStatus.class, str);
    }

    public static PushMessageStatus[] values() {
        return (PushMessageStatus[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

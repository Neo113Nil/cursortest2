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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "CHAT_SESSION_STATUS_UNSPECIFIED", "CHAT_SESSION_STATUS_INITIALIZED", "CHAT_SESSION_STATUS_IDLE", "CHAT_SESSION_STATUS_PROCESSING", "CHAT_SESSION_STATUS_NEED_CLIENT_INPUT", "CHAT_SESSION_STATUS_TERMINATED", "CHAT_SESSION_STATUS_CANCELLING", "CHAT_SESSION_STATUS_WAITING_FOR_PERMISSION_LEASE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChatSessionStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatSessionStatus[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_CANCELLING;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_IDLE;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_INITIALIZED;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_NEED_CLIENT_INPUT;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_PROCESSING;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_TERMINATED;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_UNSPECIFIED;
    public static final ChatSessionStatus CHAT_SESSION_STATUS_WAITING_FOR_PERMISSION_LEASE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ChatSessionStatus chatSessionStatus = new ChatSessionStatus("CHAT_SESSION_STATUS_UNSPECIFIED", 0, 0);
        CHAT_SESSION_STATUS_UNSPECIFIED = chatSessionStatus;
        ChatSessionStatus chatSessionStatus2 = new ChatSessionStatus("CHAT_SESSION_STATUS_INITIALIZED", 1, 1);
        CHAT_SESSION_STATUS_INITIALIZED = chatSessionStatus2;
        ChatSessionStatus chatSessionStatus3 = new ChatSessionStatus("CHAT_SESSION_STATUS_IDLE", 2, 2);
        CHAT_SESSION_STATUS_IDLE = chatSessionStatus3;
        ChatSessionStatus chatSessionStatus4 = new ChatSessionStatus("CHAT_SESSION_STATUS_PROCESSING", 3, 3);
        CHAT_SESSION_STATUS_PROCESSING = chatSessionStatus4;
        ChatSessionStatus chatSessionStatus5 = new ChatSessionStatus("CHAT_SESSION_STATUS_NEED_CLIENT_INPUT", 4, 4);
        CHAT_SESSION_STATUS_NEED_CLIENT_INPUT = chatSessionStatus5;
        ChatSessionStatus chatSessionStatus6 = new ChatSessionStatus("CHAT_SESSION_STATUS_TERMINATED", 5, 5);
        CHAT_SESSION_STATUS_TERMINATED = chatSessionStatus6;
        ChatSessionStatus chatSessionStatus7 = new ChatSessionStatus("CHAT_SESSION_STATUS_CANCELLING", 6, 6);
        CHAT_SESSION_STATUS_CANCELLING = chatSessionStatus7;
        ChatSessionStatus chatSessionStatus8 = new ChatSessionStatus("CHAT_SESSION_STATUS_WAITING_FOR_PERMISSION_LEASE", 7, 7);
        CHAT_SESSION_STATUS_WAITING_FOR_PERMISSION_LEASE = chatSessionStatus8;
        ChatSessionStatus[] chatSessionStatusArr = {chatSessionStatus, chatSessionStatus2, chatSessionStatus3, chatSessionStatus4, chatSessionStatus5, chatSessionStatus6, chatSessionStatus7, chatSessionStatus8};
        $VALUES = chatSessionStatusArr;
        $ENTRIES = new EnumEntriesList(chatSessionStatusArr);
        INSTANCE = new Companion();
        ADAPTER = new ChatSessionStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ChatSessionStatus.class), Syntax.PROTO_2, chatSessionStatus);
    }

    public ChatSessionStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ChatSessionStatus fromValue(int i) {
        INSTANCE.getClass();
        switch (i) {
            case 0:
                return CHAT_SESSION_STATUS_UNSPECIFIED;
            case 1:
                return CHAT_SESSION_STATUS_INITIALIZED;
            case 2:
                return CHAT_SESSION_STATUS_IDLE;
            case 3:
                return CHAT_SESSION_STATUS_PROCESSING;
            case 4:
                return CHAT_SESSION_STATUS_NEED_CLIENT_INPUT;
            case 5:
                return CHAT_SESSION_STATUS_TERMINATED;
            case 6:
                return CHAT_SESSION_STATUS_CANCELLING;
            case 7:
                return CHAT_SESSION_STATUS_WAITING_FOR_PERMISSION_LEASE;
            default:
                return null;
        }
    }

    public static ChatSessionStatus valueOf(String str) {
        return (ChatSessionStatus) Enum.valueOf(ChatSessionStatus.class, str);
    }

    public static ChatSessionStatus[] values() {
        return (ChatSessionStatus[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus$Companion$ADAPTER$1", "Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChatSessionStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ChatSessionStatus.INSTANCE.getClass();
        switch (i) {
            case 0:
                return ChatSessionStatus.CHAT_SESSION_STATUS_UNSPECIFIED;
            case 1:
                return ChatSessionStatus.CHAT_SESSION_STATUS_INITIALIZED;
            case 2:
                return ChatSessionStatus.CHAT_SESSION_STATUS_IDLE;
            case 3:
                return ChatSessionStatus.CHAT_SESSION_STATUS_PROCESSING;
            case 4:
                return ChatSessionStatus.CHAT_SESSION_STATUS_NEED_CLIENT_INPUT;
            case 5:
                return ChatSessionStatus.CHAT_SESSION_STATUS_TERMINATED;
            case 6:
                return ChatSessionStatus.CHAT_SESSION_STATUS_CANCELLING;
            case 7:
                return ChatSessionStatus.CHAT_SESSION_STATUS_WAITING_FOR_PERMISSION_LEASE;
            default:
                return null;
        }
    }
}

package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetChatMessagesResponse$Conversation$BotStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetChatMessagesResponse.Conversation.BotStatus.Companion.getClass();
        if (i == 0) {
            return GetChatMessagesResponse.Conversation.BotStatus.UNKNOWN;
        }
        if (i == 1) {
            return GetChatMessagesResponse.Conversation.BotStatus.READY;
        }
        if (i == 2) {
            return GetChatMessagesResponse.Conversation.BotStatus.ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return GetChatMessagesResponse.Conversation.BotStatus.HANDED_OVER;
    }
}

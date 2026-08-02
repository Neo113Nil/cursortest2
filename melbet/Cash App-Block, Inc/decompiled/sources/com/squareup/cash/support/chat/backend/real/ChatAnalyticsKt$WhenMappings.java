package com.squareup.cash.support.chat.backend.real;

import com.squareup.cash.support.chat.backend.api.Conversation;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class ChatAnalyticsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Conversation.BotStatus.values().length];
        try {
            Conversation.BotStatus botStatus = Conversation.BotStatus.UNKNOWN;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Conversation.BotStatus botStatus2 = Conversation.BotStatus.UNKNOWN;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            Conversation.BotStatus botStatus3 = Conversation.BotStatus.UNKNOWN;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            Conversation.BotStatus botStatus4 = Conversation.BotStatus.UNKNOWN;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}

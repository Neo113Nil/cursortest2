package com.squareup.cash.support.backend.real;

import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealSupportStatus {
    public final Flow hasUnreadMessages;

    public RealSupportStatus(SupportConversationPersistence supportConversationPersistence) {
        this.hasUnreadMessages = supportConversationPersistence.hasUnreadMessages();
    }
}

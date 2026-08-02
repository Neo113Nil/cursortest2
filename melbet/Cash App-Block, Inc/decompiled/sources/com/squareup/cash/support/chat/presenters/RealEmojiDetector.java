package com.squareup.cash.support.chat.presenters;

import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.presenters.ChatMessageAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RealEmojiDetector {
    public static ChatMessageAction from(List list, List list2) {
        String str;
        list.getClass();
        list2.getClass();
        if (list.isEmpty()) {
            return !list2.isEmpty() ? ChatMessageAction.InitialMessageLoaded.INSTANCE : ChatMessageAction.NoAction.INSTANCE;
        }
        List list3 = list2;
        List list4 = list;
        if (list3.size() <= list4.size()) {
            return list3.size() < list4.size() ? ChatMessageAction.PendingMessageDeleted.INSTANCE : ChatMessageAction.MessageStatusUpdated.INSTANCE;
        }
        Message message = (Message) CollectionsKt.firstOrNull(list2);
        String str2 = null;
        if (message == null || (message instanceof PendingMessage)) {
            str = null;
        } else {
            if (!(message instanceof RecordedMessage)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = ((RecordedMessage) message).messageToken;
        }
        Message message2 = (Message) CollectionsKt.firstOrNull(list);
        if (message2 != null && !(message2 instanceof PendingMessage)) {
            if (!(message2 instanceof RecordedMessage)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str2 = ((RecordedMessage) message2).messageToken;
        }
        return !Intrinsics.areEqual(str, str2) ? ChatMessageAction.OldMessageLoaded.INSTANCE : new ChatMessageAction.NewMessageLoaded(list2.subList(list4.size(), list3.size()));
    }
}

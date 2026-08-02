package com.squareup.cash.support.chat.backend.real;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportUiUpliftChat;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Sending;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.util.coroutines.StateFlowKt;
import java.time.Instant;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealConversationService {
    public final boolean chatUiUpliftEnabled;
    public final RealPendingMessagesStore pendingMessagesStore;
    public final RealRecordedMessagesStore recordedMessagesStore;

    public RealConversationService(RealPendingMessagesStore realPendingMessagesStore, RealRecordedMessagesStore realRecordedMessagesStore, FeatureFlagManager featureFlagManager) {
        realPendingMessagesStore.getClass();
        realRecordedMessagesStore.getClass();
        featureFlagManager.getClass();
        this.pendingMessagesStore = realPendingMessagesStore;
        this.recordedMessagesStore = realRecordedMessagesStore;
        this.chatUiUpliftEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUiUpliftChat.INSTANCE)).enabled();
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 allMessages() {
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new RealRecipientRepository$suggestions$$inlined$map$1(this.pendingMessagesStore.state, 15)), new AppLockMonitor$special$$inlined$map$2(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.recordedMessagesStore.state, 16), 16), new CardModelView$getActiveHeat$2$2(this, (Continuation) null, 18), 0);
    }

    public final void deletePendingMessage(String str) {
        Object value;
        RealPendingMessagesStore.MessagesState messagesState;
        str.getClass();
        RealPendingMessagesStore realPendingMessagesStore = this.pendingMessagesStore;
        realPendingMessagesStore.getClass();
        StateFlowImpl stateFlowImpl = realPendingMessagesStore.state;
        do {
            value = stateFlowImpl.getValue();
            messagesState = (RealPendingMessagesStore.MessagesState) value;
            RealPendingMessagesStore.PendingRequest pendingRequest = (RealPendingMessagesStore.PendingRequest) messagesState.pendingRequests.get(str);
            if (pendingRequest == null || !(pendingRequest.getMessage().getStatus() instanceof MessageStatus$Failed)) {
                pendingRequest = null;
            }
            if (pendingRequest != null) {
                messagesState = RealPendingMessagesStore.MessagesState.copy$default(messagesState, MapsKt__MapsKt.minus(messagesState.pendingRequests, str), false, null, 6);
            }
        } while (!stateFlowImpl.compareAndSet(value, messagesState));
    }

    public final void loadNewMessages() {
        StateFlowKt.sendOrThrow$default(this.recordedMessagesStore.newMessagesRequests, Unit.INSTANCE);
    }

    public final void resendMessage(String str, String str2, Conversation conversation, boolean z) {
        Conversation conversation2;
        boolean z2;
        String str3;
        str.getClass();
        RealPendingMessagesStore realPendingMessagesStore = this.pendingMessagesStore;
        realPendingMessagesStore.getClass();
        StateFlowImpl stateFlowImpl = realPendingMessagesStore.state;
        while (true) {
            Object value = stateFlowImpl.getValue();
            RealPendingMessagesStore.MessagesState messagesState = (RealPendingMessagesStore.MessagesState) value;
            RealPendingMessagesStore.PendingRequest pendingRequest = (RealPendingMessagesStore.PendingRequest) messagesState.pendingRequests.get(str);
            if (pendingRequest == null || !(pendingRequest.getMessage().getStatus() instanceof MessageStatus$Failed)) {
                pendingRequest = null;
            }
            if (pendingRequest != null) {
                PendingMessage message = pendingRequest.getMessage();
                Instant ofEpochMilli = Instant.ofEpochMilli(realPendingMessagesStore.clock.millis());
                ofEpochMilli.getClass();
                PendingMessage copy$default = PendingMessage.copy$default(message, ofEpochMilli, null, MessageStatus$Sending.INSTANCE, 5);
                RealPendingMessagesStore.MessagesState copy$default2 = RealPendingMessagesStore.MessagesState.copy$default(messagesState, MapsKt__MapsKt.minus(messagesState.pendingRequests, str), false, null, 6);
                conversation2 = conversation;
                z2 = z;
                String str4 = str2;
                str3 = str4;
                messagesState = realPendingMessagesStore.sendMessage(str4, copy$default2, copy$default, true, conversation2, z2);
            } else {
                conversation2 = conversation;
                z2 = z;
                str3 = str2;
            }
            if (stateFlowImpl.compareAndSet(value, messagesState)) {
                return;
            }
            str2 = str3;
            conversation = conversation2;
            z = z2;
        }
    }

    public final void sendMessage(MessageBody messageBody, String str, Conversation conversation, boolean z) {
        messageBody.getClass();
        RealPendingMessagesStore realPendingMessagesStore = this.pendingMessagesStore;
        realPendingMessagesStore.getClass();
        String uuid = RealUuidGenerator.generate().toString();
        uuid.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(realPendingMessagesStore.clock.millis());
        ofEpochMilli.getClass();
        PendingMessage pendingMessage = new PendingMessage(uuid, ofEpochMilli, messageBody, MessageStatus$Sending.INSTANCE);
        StateFlowImpl stateFlowImpl = realPendingMessagesStore.state;
        while (true) {
            Object value = stateFlowImpl.getValue();
            String str2 = str;
            Conversation conversation2 = conversation;
            boolean z2 = z;
            if (stateFlowImpl.compareAndSet(value, realPendingMessagesStore.sendMessage(str2, (RealPendingMessagesStore.MessagesState) value, pendingMessage, false, conversation2, z2))) {
                return;
            }
            str = str2;
            conversation = conversation2;
            z = z2;
        }
    }
}

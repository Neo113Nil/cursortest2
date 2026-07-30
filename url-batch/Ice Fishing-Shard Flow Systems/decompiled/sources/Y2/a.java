package Y2;

import java.util.Collection;

/* loaded from: classes.dex */
public interface a extends com.onesignal.common.events.d {
    boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a aVar, Collection<String> collection);

    boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a aVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}

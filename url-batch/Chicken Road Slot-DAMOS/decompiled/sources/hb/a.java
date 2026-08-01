package hb;

import java.util.Collection;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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

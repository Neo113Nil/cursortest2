package dd;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b extends com.onesignal.common.events.d {
    void addEmailSubscription(String str);

    void addOrUpdatePushSubscriptionToken(String str, f fVar);

    void addSmsSubscription(String str);

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    d getPushSubscriptionModel();

    c getSubscriptions();

    void removeEmailSubscription(String str);

    void removeSmsSubscription(String str);

    void setSubscriptions(c cVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}

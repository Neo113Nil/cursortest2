package com.onesignal.common.modeling;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface f extends com.onesignal.common.events.d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    i getModel();

    void replace(i iVar, String str);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}

package com.google.firebase.messaging;

import defpackage.jt2;
import defpackage.lq2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements lq2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    public /* synthetic */ b(String str, int i) {
        this.m = i;
        this.n = str;
    }

    @Override // defpackage.lq2
    public final jt2 j(Object obj) {
        jt2 lambda$subscribeToTopic$10;
        jt2 lambda$unsubscribeFromTopic$11;
        int i = this.m;
        String str = this.n;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        switch (i) {
            case 0:
                lambda$subscribeToTopic$10 = FirebaseMessaging.lambda$subscribeToTopic$10(str, topicsSubscriber);
                return lambda$subscribeToTopic$10;
            default:
                lambda$unsubscribeFromTopic$11 = FirebaseMessaging.lambda$unsubscribeFromTopic$11(str, topicsSubscriber);
                return lambda$unsubscribeFromTopic$11;
        }
    }
}

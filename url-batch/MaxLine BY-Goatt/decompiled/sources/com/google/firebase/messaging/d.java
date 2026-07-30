package com.google.firebase.messaging;

import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import defpackage.jt2;
import defpackage.lq2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements lq2, RequestDeduplicator.GetTokenRequest {
    public final /* synthetic */ FirebaseMessaging m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Store.Token o;

    public /* synthetic */ d(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.m = firebaseMessaging;
        this.n = str;
        this.o = token;
    }

    @Override // defpackage.lq2
    public jt2 j(Object obj) {
        jt2 lambda$blockingGetToken$13;
        lambda$blockingGetToken$13 = this.m.lambda$blockingGetToken$13(this.n, this.o, (String) obj);
        return lambda$blockingGetToken$13;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public jt2 start() {
        jt2 lambda$blockingGetToken$14;
        lambda$blockingGetToken$14 = this.m.lambda$blockingGetToken$14(this.n, this.o);
        return lambda$blockingGetToken$14;
    }
}

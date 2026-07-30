package com.google.firebase.iid.internal;

import defpackage.jt2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface FirebaseInstanceIdInternal {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface NewTokenListener {
        void onNewToken(String str);
    }

    void addNewTokenListener(NewTokenListener newTokenListener);

    void deleteToken(String str, String str2);

    String getId();

    String getToken();

    jt2 getTokenTask();
}

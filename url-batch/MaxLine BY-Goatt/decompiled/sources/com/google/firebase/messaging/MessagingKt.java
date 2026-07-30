package com.google.firebase.messaging;

import com.google.firebase.Firebase;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        firebase.getClass();
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        firebaseMessaging.getClass();
        return firebaseMessaging;
    }

    public static final RemoteMessage remoteMessage(String str, Function1<? super RemoteMessage.Builder, Unit> function1) {
        str.getClass();
        function1.getClass();
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        function1.invoke(builder);
        RemoteMessage build = builder.build();
        build.getClass();
        return build;
    }
}

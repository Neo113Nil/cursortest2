package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.Component;
import defpackage.t40;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String str) {
        firebase.getClass();
        str.getClass();
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        firebaseApp.getClass();
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<t40> coroutineDispatcher() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        firebase.getClass();
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        firebaseApp.getClass();
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        firebase.getClass();
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        options.getClass();
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        str.getClass();
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        initializeApp.getClass();
        return initializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        initializeApp.getClass();
        return initializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        firebase.getClass();
        context.getClass();
        return FirebaseApp.initializeApp(context);
    }
}

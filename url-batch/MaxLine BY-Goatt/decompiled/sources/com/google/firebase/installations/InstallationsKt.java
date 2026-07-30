package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        firebase.getClass();
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        firebaseInstallations.getClass();
        return firebaseInstallations;
    }

    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp firebaseApp) {
        firebase.getClass();
        firebaseApp.getClass();
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(firebaseApp);
        firebaseInstallations.getClass();
        return firebaseInstallations;
    }
}

package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    private final Status status;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public FirebaseInstallationsException(String str, Status status) {
        super(str);
        this.status = status;
    }

    public FirebaseInstallationsException(String str, Status status, Throwable th) {
        super(str, th);
        this.status = status;
    }
}

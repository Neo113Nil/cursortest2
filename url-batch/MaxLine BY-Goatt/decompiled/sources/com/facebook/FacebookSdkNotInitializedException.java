package com.facebook;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookSdkNotInitializedException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    public FacebookSdkNotInitializedException() {
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FacebookSdkNotInitializedException(String str) {
        super(str);
    }

    public FacebookSdkNotInitializedException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookSdkNotInitializedException(Throwable th) {
        super(th);
    }
}

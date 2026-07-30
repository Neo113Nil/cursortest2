package com.facebook;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookAuthorizationException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    public FacebookAuthorizationException() {
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FacebookAuthorizationException(String str) {
        super(str);
    }

    public FacebookAuthorizationException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookAuthorizationException(Throwable th) {
        super(th);
    }
}

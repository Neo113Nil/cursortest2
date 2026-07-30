package com.facebook;

import defpackage.q40;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookDialogException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;
    private final int errorCode;
    private final String failingUrl;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFailingUrl() {
        return this.failingUrl;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.errorCode);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return q40.p(sb, this.failingUrl, "}");
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

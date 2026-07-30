package com.android.installreferrer.api;

import android.content.Context;
import defpackage.lh;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder {
        private final Context mContext;

        private Builder(Context context) {
            this.mContext = context;
        }

        public InstallReferrerClient build() {
            Context context = this.mContext;
            if (context != null) {
                return new b(context);
            }
            lh.e("Please provide a valid Context.");
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int PERMISSION_ERROR = 4;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer();

    public abstract boolean isReady();

    public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);
}

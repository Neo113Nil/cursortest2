package com.huawei.hms.ads.installreferrer.api;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {
    protected boolean isTest = false;

    public static final class Builder {
        private boolean isTest;
        private final Context mContext;

        private Builder(Context context) {
            this.isTest = false;
            this.mContext = context;
        }

        public InstallReferrerClient build() {
            Context context = this.mContext;
            if (context == null) {
                throw new IllegalArgumentException("context is null");
            }
            com.huawei.hms.ads.installreferrer.api.a aVar = new com.huawei.hms.ads.installreferrer.api.a(context);
            aVar.isTest = this.isTest;
            return aVar;
        }

        public Builder setTest(boolean z4) {
            this.isTest = z4;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer();

    public abstract boolean isReady();

    public abstract int setInstallReferrer(String str, String str2, long j4, long j5);

    public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);
}

package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class InstallationTokenResult {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}

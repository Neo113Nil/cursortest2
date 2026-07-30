package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_TokenResult;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class TokenResult {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static abstract class Builder {
        public abstract TokenResult build();

        public abstract Builder setResponseCode(ResponseCode responseCode);

        public abstract Builder setToken(String str);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static Builder builder() {
        return new AutoValue_TokenResult.Builder().setTokenExpirationTimestamp(0L);
    }

    public abstract ResponseCode getResponseCode();

    public abstract String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}

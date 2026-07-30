package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AccessTokenAppIdPair implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    public AccessTokenAppIdPair(String str, String str2) {
        str2.getClass();
        this.applicationId = str2;
        this.accessTokenString = Utility.isNullOrEmpty(str) ? null : str;
    }

    private final Object writeReplace() {
        return new SerializationProxyV1(null, this.applicationId);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        return Utility.areObjectsEqual(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && Utility.areObjectsEqual(accessTokenAppIdPair.applicationId, this.applicationId);
    }

    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        return this.applicationId.hashCode() ^ (str != null ? str.hashCode() : 0);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class SerializationProxyV1 implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        public SerializationProxyV1(String str, String str2) {
            str2.getClass();
            this.accessTokenString = str;
            this.appId = str2;
        }

        private final Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
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

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(AccessToken accessToken) {
        this(accessToken.getToken(), FacebookSdk.getApplicationId());
        accessToken.getClass();
    }
}

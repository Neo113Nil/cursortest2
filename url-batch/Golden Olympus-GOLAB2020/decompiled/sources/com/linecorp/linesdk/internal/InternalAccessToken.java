package com.linecorp.linesdk.internal;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.utils.DebugUtils;

/* loaded from: classes2.dex */
public class InternalAccessToken {

    @NonNull
    private final String accessToken;
    private final long expiresInMillis;
    private final long issuedClientTimeMillis;

    @NonNull
    private final String refreshToken;

    public InternalAccessToken(@NonNull String str, long j4, long j5, @NonNull String str2) {
        this.accessToken = str;
        this.expiresInMillis = j4;
        this.issuedClientTimeMillis = j5;
        this.refreshToken = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalAccessToken internalAccessToken = (InternalAccessToken) obj;
        if (this.expiresInMillis == internalAccessToken.expiresInMillis && this.issuedClientTimeMillis == internalAccessToken.issuedClientTimeMillis && this.accessToken.equals(internalAccessToken.accessToken)) {
            return this.refreshToken.equals(internalAccessToken.refreshToken);
        }
        return false;
    }

    @NonNull
    public String getAccessToken() {
        return this.accessToken;
    }

    public long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public long getIssuedClientTimeMillis() {
        return this.issuedClientTimeMillis;
    }

    @NonNull
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        long j4 = this.expiresInMillis;
        int i4 = (hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.issuedClientTimeMillis;
        return ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.refreshToken.hashCode();
    }

    public String toString() {
        return "InternalAccessToken{accessToken='" + DebugUtils.hideIfNotDebug(this.accessToken) + "', expiresInMillis=" + this.expiresInMillis + ", issuedClientTimeMillis=" + this.issuedClientTimeMillis + ", refreshToken='" + DebugUtils.hideIfNotDebug(this.refreshToken) + "'}";
    }
}

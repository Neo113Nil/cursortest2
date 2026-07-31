package com.linecorp.linesdk.internal;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.utils.DebugUtils;
import java.util.List;

/* loaded from: classes2.dex */
public class RefreshTokenResult {

    @NonNull
    private final String accessToken;
    private final long expiresInMillis;

    @NonNull
    private final String refreshToken;

    @NonNull
    private final List<Scope> scopes;

    public RefreshTokenResult(@NonNull String str, long j4, @NonNull String str2, @NonNull List<Scope> list) {
        this.accessToken = str;
        this.expiresInMillis = j4;
        this.refreshToken = str2;
        this.scopes = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RefreshTokenResult refreshTokenResult = (RefreshTokenResult) obj;
        if (this.expiresInMillis == refreshTokenResult.expiresInMillis && this.accessToken.equals(refreshTokenResult.accessToken) && this.refreshToken.equals(refreshTokenResult.refreshToken)) {
            return this.scopes.equals(refreshTokenResult.scopes);
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

    @NonNull
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @NonNull
    public List<Scope> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        long j4 = this.expiresInMillis;
        return ((((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.refreshToken.hashCode()) * 31) + this.scopes.hashCode();
    }

    public String toString() {
        return "RefreshTokenResult{accessToken='" + DebugUtils.hideIfNotDebug(this.accessToken) + "', expiresInMillis=" + this.expiresInMillis + ", refreshToken='" + DebugUtils.hideIfNotDebug(this.refreshToken) + "', scopes=" + this.scopes + '}';
    }
}

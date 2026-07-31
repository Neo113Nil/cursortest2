package com.linecorp.linesdk.internal;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.Scope;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class AccessTokenVerificationResult {

    @NonNull
    private final String channelId;
    private final long expiresInMillis;

    @NonNull
    private final List<Scope> scopes;

    public AccessTokenVerificationResult(@NonNull String str, long j4, @NonNull List<Scope> list) {
        this.channelId = str;
        this.expiresInMillis = j4;
        this.scopes = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessTokenVerificationResult accessTokenVerificationResult = (AccessTokenVerificationResult) obj;
        if (this.expiresInMillis == accessTokenVerificationResult.expiresInMillis && this.channelId.equals(accessTokenVerificationResult.channelId)) {
            return this.scopes.equals(accessTokenVerificationResult.scopes);
        }
        return false;
    }

    @NonNull
    public String getChannelId() {
        return this.channelId;
    }

    public long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    @NonNull
    public List<Scope> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int hashCode = this.channelId.hashCode() * 31;
        long j4 = this.expiresInMillis;
        return ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.scopes.hashCode();
    }

    public String toString() {
        return "AccessTokenVerificationResult{channelId='" + this.channelId + "', expiresInMillis=" + this.expiresInMillis + ", scopes=" + this.scopes + '}';
    }
}

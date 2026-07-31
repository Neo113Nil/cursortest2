package com.linecorp.linesdk.internal;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.utils.DebugUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class IssueAccessTokenResult {

    @NonNull
    private final InternalAccessToken accessToken;
    private final LineIdToken idToken;

    @NonNull
    private final List<Scope> scopes;

    public IssueAccessTokenResult(@NonNull InternalAccessToken internalAccessToken, @NonNull List<Scope> list, LineIdToken lineIdToken) {
        this.accessToken = internalAccessToken;
        this.scopes = Collections.unmodifiableList(list);
        this.idToken = lineIdToken;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IssueAccessTokenResult issueAccessTokenResult = (IssueAccessTokenResult) obj;
            if (!this.accessToken.equals(issueAccessTokenResult.accessToken) || !this.scopes.equals(issueAccessTokenResult.scopes)) {
                return false;
            }
            LineIdToken lineIdToken = this.idToken;
            LineIdToken lineIdToken2 = issueAccessTokenResult.idToken;
            if (lineIdToken != null) {
                return lineIdToken.equals(lineIdToken2);
            }
            if (lineIdToken2 == null) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public InternalAccessToken getAccessToken() {
        return this.accessToken;
    }

    public LineIdToken getIdToken() {
        return this.idToken;
    }

    @NonNull
    public List<Scope> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int hashCode = ((this.accessToken.hashCode() * 31) + this.scopes.hashCode()) * 31;
        LineIdToken lineIdToken = this.idToken;
        return hashCode + (lineIdToken != null ? lineIdToken.hashCode() : 0);
    }

    public String toString() {
        return "IssueAccessTokenResult{accessToken=" + DebugUtils.hideIfNotDebug(this.accessToken) + ", scopes=" + this.scopes + ", idToken=" + this.idToken + '}';
    }
}

package com.google.googlesignin;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.PendingResult;
import java.util.Locale;

/* loaded from: classes.dex */
public class TokenRequest {
    private String accountName;
    private boolean doAuthCode;
    private boolean doEmail;
    private boolean doIdToken;
    private boolean forceRefresh;
    private long handle;
    private boolean hidePopups;
    private TokenPendingResult pendingResponse;
    private String[] scopes;
    private boolean useGamesConfig;
    private String webClientId;

    public TokenRequest(boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str2, String[] strArr, long j4) {
        this.pendingResponse = new TokenPendingResult(j4);
        this.useGamesConfig = z4;
        this.webClientId = str;
        this.doAuthCode = z5;
        this.forceRefresh = z6;
        this.doEmail = z7;
        this.doIdToken = z8;
        this.hidePopups = z9;
        this.accountName = str2;
        this.handle = j4;
        if (strArr == null || strArr.length <= 0) {
            this.scopes = null;
            return;
        }
        String[] strArr2 = new String[strArr.length];
        this.scopes = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
    }

    public void cancel() {
        this.pendingResponse.cancel();
    }

    public String getAccountName() {
        return this.accountName;
    }

    public boolean getDoAuthCode() {
        return this.doAuthCode;
    }

    public boolean getDoEmail() {
        return this.doEmail;
    }

    public boolean getDoIdToken() {
        return this.doIdToken;
    }

    public boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public long getHandle() {
        return this.handle;
    }

    public boolean getHidePopups() {
        return this.hidePopups;
    }

    public PendingResult<TokenResult> getPendingResponse() {
        return this.pendingResponse;
    }

    public String[] getScopes() {
        return this.scopes;
    }

    public boolean getUseGamesConfig() {
        return this.useGamesConfig;
    }

    public String getWebClientId() {
        String str = this.webClientId;
        return str == null ? "" : str;
    }

    public boolean isValid() {
        String str = this.webClientId;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        if (this.doAuthCode) {
            GoogleSignInHelper.logError("Invalid configuration, auth code requires web client id");
            return false;
        }
        if (!this.doIdToken) {
            return true;
        }
        GoogleSignInHelper.logError("Invalid configuration, id token requires web client id");
        return false;
    }

    public void setResult(int i4, GoogleSignInAccount googleSignInAccount) {
        this.pendingResponse.setResult(googleSignInAccount, i4);
        this.pendingResponse.setStatus(i4);
    }

    public String toString() {
        return String.format(Locale.getDefault(), "%s(a:%b:e:%b:i:%b)", Integer.toHexString(hashCode()), Boolean.valueOf(this.doAuthCode), Boolean.valueOf(this.doEmail), Boolean.valueOf(this.doIdToken));
    }
}

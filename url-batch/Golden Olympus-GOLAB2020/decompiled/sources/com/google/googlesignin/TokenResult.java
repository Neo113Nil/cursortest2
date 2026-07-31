package com.google.googlesignin;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes.dex */
public class TokenResult implements Result {
    private GoogleSignInAccount account;
    private long handle;
    private Status status;

    TokenResult() {
        this.status = new Status(4);
        this.account = null;
    }

    public GoogleSignInAccount getAccount() {
        return this.account;
    }

    public long getHandle() {
        return this.handle;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.status;
    }

    public void setHandle(long j4) {
        this.handle = j4;
    }

    public void setStatus(int i4) {
        this.status = new Status(i4);
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Status status = this.status;
        Object obj = this.account;
        if (obj == null) {
            obj = "<null>";
        }
        return String.format(locale, "Status: %s %s", status, obj);
    }

    TokenResult(GoogleSignInAccount googleSignInAccount, int i4) {
        this.status = new Status(i4);
        this.account = googleSignInAccount;
    }
}

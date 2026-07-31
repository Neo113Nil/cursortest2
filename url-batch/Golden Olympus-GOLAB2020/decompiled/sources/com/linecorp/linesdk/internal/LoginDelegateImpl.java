package com.linecorp.linesdk.internal;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LoginDelegate;

/* loaded from: classes2.dex */
public class LoginDelegateImpl implements LoginDelegate {
    private LoginHandler loginHandler;

    @Override // com.linecorp.linesdk.LoginDelegate
    public boolean onActivityResult(int i4, int i5, Intent intent) {
        LoginHandler loginHandler = this.loginHandler;
        return loginHandler != null && loginHandler.onActivityResult(i4, i5, intent);
    }

    public void setLoginHandler(@NonNull LoginHandler loginHandler) {
        this.loginHandler = loginHandler;
    }
}

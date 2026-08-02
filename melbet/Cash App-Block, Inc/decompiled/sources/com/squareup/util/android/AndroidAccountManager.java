package com.squareup.util.android;

import android.accounts.AccountManager;
import android.app.Application;

/* loaded from: classes.dex */
public final class AndroidAccountManager {
    public final AccountManager accountManager;

    public AndroidAccountManager(Application application) {
        AccountManager accountManager = AccountManager.get(application);
        accountManager.getClass();
        this.accountManager = accountManager;
    }
}

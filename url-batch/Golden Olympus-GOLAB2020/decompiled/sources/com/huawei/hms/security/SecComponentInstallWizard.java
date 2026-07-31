package com.huawei.hms.security;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class SecComponentInstallWizard {
    public static final String PROVIDER_NAME = "HmsCore_OpenSSL";

    public interface SecComponentInstallWizardListener {
        void onFailed(int i4, Intent intent);

        void onSuccess();
    }

    public static void install(Context context) {
    }
}

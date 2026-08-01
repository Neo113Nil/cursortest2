package com.pairip.application;

import android.content.Context;
import com.derinko.gbini.n1casino.WinApp;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends WinApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

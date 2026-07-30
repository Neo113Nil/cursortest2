package com.pairip.application;

import android.content.Context;
import com.majelw.libystne.MaxLineApp;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends MaxLineApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

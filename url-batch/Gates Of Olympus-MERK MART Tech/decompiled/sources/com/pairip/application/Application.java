package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import gbcorp.c312.merkmarker.info.MRKMRApplication;

/* loaded from: classes.dex */
public class Application extends MRKMRApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

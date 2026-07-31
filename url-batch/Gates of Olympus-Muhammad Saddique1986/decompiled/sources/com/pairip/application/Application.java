package com.pairip.application;

import android.content.Context;
import com.gatesof.olympus.martu.marku.App;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends App {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

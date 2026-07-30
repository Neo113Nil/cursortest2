package com.pairip.application;

import android.content.Context;
import com.chicken.road.cerman.fixs.BroilerApp;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes2.dex */
public class Application extends BroilerApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

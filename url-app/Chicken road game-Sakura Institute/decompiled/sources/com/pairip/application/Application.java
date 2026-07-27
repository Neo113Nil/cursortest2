package com.pairip.application;

import android.content.Context;
import com.chicken.road.kedro.laqer.TrackApp;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends TrackApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

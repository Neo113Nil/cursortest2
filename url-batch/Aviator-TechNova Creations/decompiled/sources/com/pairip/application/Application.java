package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import org.game.play.aviator.gameplay.MyApplication;

/* loaded from: classes2.dex */
public class Application extends MyApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}

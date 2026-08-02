package com.squareup.util.android;

import android.app.Application;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class AndroidPackageManager {
    public final Application context;

    public AndroidPackageManager(Application application) {
        this.context = application;
    }

    public final boolean isPackageInstalled(String str) {
        try {
            this.context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

package com.majelw.libystne;

import android.app.Application;
import defpackage.ak2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class MaxLineApp extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        String string = getApplicationContext().getSharedPreferences("settings", 0).getString("theme", "system");
        if (string == null) {
            string = "system";
        }
        ak2.e(string);
        String string2 = getApplicationContext().getSharedPreferences("settings", 0).getString("language", "system");
        ak2.d(string2 != null ? string2 : "system");
    }
}

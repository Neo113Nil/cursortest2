package com.youappi.sdk.net.model.ext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.gson.a.c;
import com.youappi.sdk.mediation.admob.ParamNames;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserApps {

    @c(a = ParamNames.ACCESS_TOKEN)
    private String accessToken;

    @c(a = "appIds")
    private List<String> apps = new ArrayList();

    @c(a = "deviceId")
    private String deviceId;

    @c(a = "deviceOs")
    private String deviceOs;

    public UserApps(Context context, String str, String str2, String str3) {
        List<ApplicationInfo> installedApplications;
        this.accessToken = str3;
        this.deviceId = str2;
        this.deviceOs = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (installedApplications = packageManager.getInstalledApplications(0)) == null || installedApplications.size() <= 0) {
            return;
        }
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(0)) {
            if (applicationInfo != null) {
                this.apps.add(applicationInfo.packageName);
            }
        }
    }
}

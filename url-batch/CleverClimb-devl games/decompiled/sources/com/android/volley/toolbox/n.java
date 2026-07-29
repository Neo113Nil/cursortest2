package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;

/* compiled from: Volley.java */
/* loaded from: classes.dex */
public class n {
    /* JADX WARN: Type inference failed for: r5v4, types: [android.net.http.AndroidHttpClient, org.apache.a.b.g] */
    public static com.android.volley.m a(Context context, f fVar) {
        String str;
        File file = new File(context.getCacheDir(), "volley");
        try {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            String valueOf = String.valueOf(String.valueOf(packageName));
            int i = packageInfo.versionCode;
            StringBuilder sb = new StringBuilder(valueOf.length() + 12);
            sb.append(valueOf);
            sb.append("/");
            sb.append(i);
            str = sb.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            str = "volley/0";
        }
        if (fVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                fVar = new g();
            } else {
                fVar = new d(AndroidHttpClient.newInstance(str));
            }
        }
        com.android.volley.m mVar = new com.android.volley.m(new c(file), new a(fVar));
        mVar.a();
        return mVar;
    }

    public static com.android.volley.m a(Context context) {
        return a(context, null);
    }
}
